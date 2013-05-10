package dk.autointents;

import java.io.File;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.jface.viewers.*;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.jface.action.*;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.SWT;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IPath;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.ui.JavaUI;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

import IntentDSL.Intent;

import dk.autointents.m2m.MainDriver;
import dk.autointents.m2m.ModelHelper;

/**
 * This sample class demonstrates how to plug-in a new workbench view. The view
 * shows data obtained from the model. The sample creates a dummy model on the
 * fly, but a real implementation would connect to the model available either in
 * this or another plug-in (e.g. the workspace). The view is connected to the
 * model using a content provider.
 * <p>
 * The view uses a label provider to define how model objects should be
 * presented in the view. Each view can present the same model objects using
 * different labels and icons, if needed. Alternatively, a single label provider
 * can be shared between views in order to ensure that objects of the same type
 * are presented in the same way everywhere.
 * <p>
 */

public class IntentView extends ViewPart {

	/**
	 * The ID of the view as specified by the extension.
	 */
	public static final String ID = "dk.autointents.IntentView";

	private TreeViewer viewer;
	private Button button1;
	private Action doubleClickAction;
	ModelHelper modelHelper;
	MainDriver mainDriver;

	/*
	 * The content provider class is responsible for providing objects to the
	 * view. It can wrap existing objects in adapters or simply return objects
	 * as-is. These objects may be sensitive to the current input of the view,
	 * or ignore it and always show the same content (like Task List, for
	 * example).
	 */

	class TreeObject implements IAdaptable {
		private String name;
		private TreeParent parent;

		public TreeObject(String name) {
			this.name = name;
		}

		public String getName() {
			return name;
		}

		public void setParent(TreeParent parent) {
			this.parent = parent;
		}

		public TreeParent getParent() {
			return parent;
		}

		public String toString() {
			return getName();
		}

		public Object getAdapter(Class key) {
			return null;
		}
	}

	class TreeParent extends TreeObject {
		private ArrayList children;

		public TreeParent(String name) {
			super(name);
			children = new ArrayList();
		}

		public void addChild(TreeObject child) {
			children.add(child);
			child.setParent(this);
		}

		public void removeChild(TreeObject child) {
			children.remove(child);
			child.setParent(null);
		}

		public TreeObject[] getChildren() {
			return (TreeObject[]) children.toArray(new TreeObject[children
					.size()]);
		}

		public boolean hasChildren() {
			return children.size() > 0;
		}
	}

	class ViewContentProvider implements IStructuredContentProvider,
			ITreeContentProvider {
		private TreeParent invisibleRoot;

		public void inputChanged(Viewer v, Object oldInput, Object newInput) {
		}

		public void dispose() {
		}

		public Object[] getElements(Object parent) {
			if (parent.equals(getViewSite())) {
				if (invisibleRoot == null)
					initialize();
				return getChildren(invisibleRoot);
			}
			return getChildren(parent);
		}

		public Object getParent(Object child) {
			if (child instanceof TreeObject) {
				return ((TreeObject) child).getParent();
			}
			return null;
		}

		public Object[] getChildren(Object parent) {
			if (parent instanceof TreeParent) {
				return ((TreeParent) parent).getChildren();
			}
			return new Object[0];
		}

		public boolean hasChildren(Object parent) {
			if (parent instanceof TreeParent)
				return ((TreeParent) parent).hasChildren();
			return false;
		}

		/*
		 * We will set up a dummy model to initialize tree heararchy. In a real
		 * code, you will connect to a real model and expose its hierarchy.
		 */
		private void initialize() {
			mainDriver = new MainDriver();
			modelHelper = mainDriver.loadDSL();
			TreeParent root = new TreeParent("Intents");
			for (String category : modelHelper.getCategories()) {
				TreeParent catEl = new TreeParent(category);
				for (Intent intent : modelHelper.getIntentsByCategory(category)) {
					TreeObject child = new TreeObject(intent.getName());
					catEl.addChild(child);
				}
				root.addChild(catEl);
			}

			invisibleRoot = new TreeParent("");
			invisibleRoot.addChild(root);
		}
	}

	class ViewLabelProvider extends LabelProvider {

		public String getText(Object obj) {
			return obj.toString();
		}

		public Image getImage(Object obj) {
			String imageKey = ISharedImages.IMG_OBJ_ELEMENT;
			if (obj instanceof TreeParent)
				imageKey = ISharedImages.IMG_OBJ_FOLDER;
			return PlatformUI.getWorkbench().getSharedImages()
					.getImage(imageKey);
		}
	}

	class NameSorter extends ViewerSorter {
	}

	/**
	 * The constructor.
	 */
	public IntentView() {
	}

	/**
	 * This is a callback that will allow us to create the viewer and initialize
	 * it.
	 */
	public void createPartControl(Composite parent) {

		GridData parentData = new GridData(SWT.FILL, SWT.FILL, true, true);
		parent.setLayout(new GridLayout(1, false));
		parent.setLayoutData(parentData);

		button1 = new Button(parent, SWT.CHECK);
		button1.setText("Generate Exceptions");
		button1.setLayoutData(new GridData(SWT.FILL, GridData.CENTER, true,
				true));

		Composite tableViewerComposite = new Composite(parent, SWT.BORDER);
		tableViewerComposite.setLayout(new GridLayout(1, false));
		tableViewerComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL,
				true, true));

		viewer = new TreeViewer(tableViewerComposite);
		viewer.setContentProvider(new ViewContentProvider());
		viewer.setLabelProvider(new ViewLabelProvider());
		viewer.setSorter(new NameSorter());
		viewer.setInput(getViewSite());
		viewer.expandAll();

		// Create the help context id for the viewer's control
		PlatformUI.getWorkbench().getHelpSystem()
				.setHelp(viewer.getControl(), "AutoIntents.viewer");
		makeActions();
		// hookContextMenu();
		hookDoubleClickAction();
	}

	private void makeActions() {
		doubleClickAction = new Action() {
			public void run() {

				ISelection selection = viewer.getSelection();
				Object obj = ((IStructuredSelection) selection)
						.getFirstElement();
				insertIntent(obj.toString());
			}
		};
	}

	private void hookDoubleClickAction() {
		viewer.addDoubleClickListener(new IDoubleClickListener() {
			public void doubleClick(DoubleClickEvent event) {
				doubleClickAction.run();
			}
		});
	}

	private void showMessage(String message) {
		MessageDialog.openInformation(viewer.getControl().getShell(),
				"Available Intents", message);
	}

	/**
	 * Passing the focus request to the viewer's control.
	 */
	public void setFocus() {
		viewer.getControl().setFocus();
	}

	private void insertIntent(String intentName) {
		IWorkbenchPage page = PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow().getActivePage();
		IEditorPart editor = page.getActiveEditor();
		IJavaElement elem = JavaUI.getEditorInputJavaElement(editor
				.getEditorInput());

		IEditorPart editorPart = getSite().getWorkbenchWindow().getActivePage()
				.getActiveEditor();

		
		if (elem instanceof ICompilationUnit) {
			ICompilationUnit cu = (ICompilationUnit) elem;
			try {
				boolean result = mainDriver.insertIntent(intentName, cu,
						button1.getSelection(), (IEditorPart)editor);

				if (!result) {
					showMessage("Invalid state of text editor. Make sure a valid Android Project is active");
				} else {
					showMessage("\"" + intentName
							+ "\" is inserted in  your code. Enjoy!");
				}

			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			// Worst error message more. We could introduce a lot more checking
			// here.
			showMessage("Invalid state of text editor. Make sure a valid Android Project is active");
		}

	}
}