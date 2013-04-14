/**
 * 
 */
package dk.autointents.m2m;

import java.io.IOException;
import java.lang.reflect.Modifier;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.osgi.framework.Bundle;
import org.xtext.example.mydsl.MyDslStandaloneSetup;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.*;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.ASTParser;
import org.eclipse.jdt.core.dom.Assignment;
import org.eclipse.jdt.core.dom.Block;
import org.eclipse.jdt.core.dom.ClassInstanceCreation;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.core.dom.Expression;
import org.eclipse.jdt.core.dom.ExpressionStatement;
import org.eclipse.jdt.core.dom.InfixExpression;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.MethodInvocation;
import org.eclipse.jdt.core.dom.MethodRefParameter;
import org.eclipse.jdt.core.dom.Name;
import org.eclipse.jdt.core.dom.QualifiedName;
import org.eclipse.jdt.core.dom.QualifiedType;
import org.eclipse.jdt.core.dom.SimpleName;
import org.eclipse.jdt.core.dom.Statement;
import org.eclipse.jdt.core.dom.StringLiteral;
import org.eclipse.jdt.core.dom.Type;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import org.eclipse.jdt.core.dom.VariableDeclarationFragment;
import org.eclipse.jdt.core.dom.VariableDeclarationStatement;
import org.eclipse.jdt.core.dom.rewrite.ASTRewrite;
import org.eclipse.jdt.core.dom.rewrite.ListRewrite;
import org.eclipse.jdt.ui.JavaUI;
import org.eclipse.jface.text.Document;
import org.eclipse.text.edits.TextEdit;
import org.eclipse.ui.*;
import org.eclipse.ui.internal.Model;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.emftext.language.java.JavaClasspath;
import org.emftext.language.java.containers.JavaRoot;
import org.emftext.language.java.members.ClassMethod;
import org.emftext.language.java.members.Method;
import org.emftext.language.java.resource.JaMoPPUtil;

import IntentDSL.ExtraData;
import IntentDSL.IntentDSLPackage;
import IntentDSL.IntentModel;

import com.google.inject.Injector;

/**
 * @author Bagvendt
 * 
 */
public class MainDriver {

	ModelHelper internalHelper = null;
	ReferencesHelper ref_help;

	public ModelHelper LoadDSL() {
		IntentDSLPackage.eINSTANCE.eClass();
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(
				"mydsl", new XMIResourceFactoryImpl());
		new org.eclipse.emf.mwe.utils.StandaloneSetup().setPlatformUri("../");
		Injector injector = new MyDslStandaloneSetup()
				.createInjectorAndDoEMFRegistration();
		XtextResourceSet resourceSet = injector
				.getInstance(XtextResourceSet.class);
		resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL,
				Boolean.TRUE);
		Resource resource = resourceSet.getResource(
		// URI.createURI("platform:/resource/org.xtext.example.mydsl/mydsl/browser.mydsl"),
		// true);
				URI.createURI("res/browser.mydsl"), true);

		IntentModel model = (IntentModel) resource.getContents().get(0);
		return new ModelHelper(model);
	}

	public ModelHelper NewLoadDSL() {
		IntentDSLPackage.eINSTANCE.eClass();
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(
				"mydsl", new XMIResourceFactoryImpl());
		new org.eclipse.emf.mwe.utils.StandaloneSetup().setPlatformUri("../");
		Injector injector = new MyDslStandaloneSetup()
				.createInjectorAndDoEMFRegistration();
		XtextResourceSet resourceSet = injector
				.getInstance(XtextResourceSet.class);
		resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL,
				Boolean.TRUE);
		Bundle bundle = Platform.getBundle("AutoIntents");
		URL fileURL = bundle.getEntry("res/browser.mydsl");

		Resource resource = resourceSet.getResource(
				URI.createURI(fileURL.toString()), true);

		IntentModel model = (IntentModel) resource.getContents().get(0);
		internalHelper = new ModelHelper(model);
		ref_help = new ReferencesHelper();
		ref_help.init();
		return internalHelper;
	}

	public void insertIntent(String intentName, ICompilationUnit cu)
			throws Exception {
		

		
		URI uri = URI.createURI("platform:/resource"+cu.getPath().toString());

		ResourceSet resourceSet = new ResourceSetImpl();
		Resource resource = resourceSet.createResource(uri);
		
		Map<Object, Object> map = new HashMap<Object, Object>();
		map.put(JavaClasspath.OPTION_USE_LOCAL_CLASSPATH, Boolean.TRUE);
		
		try {
			resource.load(map);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		EObject content = resource.getContents().get(0);
		

		JavaRoot root = (JavaRoot) content;
		
		org.emftext.language.java.classifiers.Class theClass = null;
		
		for (EObject lol : root.eContents()) {
			
			if (lol instanceof org.emftext.language.java.classifiers.Class) {
				theClass = (org.emftext.language.java.classifiers.Class) lol;
			}
		}
		ClassMethod theMethod = null;
		for (Method method : theClass.getMethods()) {
			System.out.println(method.getName());
			//System.out.println(method.getClass().toString());
			theMethod = (ClassMethod) method;

		}
		
		theMethod.setName("leg");
		try {
			resource.save(map);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// create the descriptive ast rewriter
		
	}
	public void test() throws IOException {
		JaMoPPUtil.initialize();
//		Bundle bundle = Platform.getBundle("AutoIntents");
//		URL fileURL = bundle.getEntry("res/IntentDemo.java");
		
		
		
		
//		ResourceSet resourceSet = new ResourceSetImpl();
//		Resource resource = resourceSet.createResource(uri);
//		
//		Map<Object, Object> map = new HashMap<Object, Object>();
//		map.put(JavaClasspath.OPTION_USE_LOCAL_CLASSPATH, Boolean.TRUE);
//		
//		resource.load(map);

		
	}

	public static void main(String[] args) {
		MainDriver driver = new MainDriver();
		try {
			driver.test();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//	ModelHelper modelHelper = driver.LoadDSL();
		//TransformTest tt = new TransformTest();
		//tt.invoke(modelHelper.getIntentByName("BrowseToGoogle"));

	}
}