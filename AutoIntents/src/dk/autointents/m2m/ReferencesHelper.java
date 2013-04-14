package dk.autointents.m2m;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.emftext.language.java.JavaClasspath;
import org.emftext.language.java.classifiers.Classifier;
import org.emftext.language.java.containers.JavaRoot;
import org.emftext.language.java.instantiations.NewConstructorCall;
import org.emftext.language.java.members.ClassMethod;
import org.emftext.language.java.members.Method;
import org.emftext.language.java.references.IdentifierReference;
import org.emftext.language.java.references.ReferenceableElement;
import org.emftext.language.java.resource.JaMoPPUtil;
import org.emftext.language.java.types.NamespaceClassifierReference;
import org.emftext.language.java.variables.LocalVariable;
import org.osgi.framework.Bundle;

/**
 * 
 * We made this helper class, because we realized after weeks of work, 
 * that we was unable to create the classifiers and references by ourself. 
 * This function makes a JaMopp java to Ecore transformation, of a java file
 * containing the classifiers and classifiers we need.
 *
 */
public class ReferencesHelper {
	private ClassMethod theMethod;
	private org.emftext.language.java.classifiers.Class theClass;
	private JavaRoot root;
	
	public void init() {
		
		JaMoPPUtil.initialize();

		Bundle bundle = Platform.getBundle("AutoIntents");
		URL fileURL = bundle.getEntry("res/IntentDemo.java");
		
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource resource = resourceSet.createResource(URI.createURI(fileURL.toString()));
		
		Map<Object, Object> map = new HashMap<Object, Object>();
		map.put(JavaClasspath.OPTION_USE_LOCAL_CLASSPATH, Boolean.TRUE);
		try {
			resource.load(map);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		EObject content = resource.getContents().get(0);
		
		org.emftext.language.java.classifiers.Class theClass = null;
		root = (JavaRoot) content;
		for (EObject lol : root.eContents()) {
			
			if (lol instanceof org.emftext.language.java.classifiers.Class) {
				theClass = (org.emftext.language.java.classifiers.Class) lol;
			}
		}
		theMethod = null;
		for (Method method : theClass.getMethods()) {
			//System.out.println(method.getName());
			//System.out.println(method.getClass().toString());
			theMethod = (ClassMethod) method;

		}
	}
	public Classifier getIntentReference() {
		/**
		 * This is horrible and very static, but we were unable to create the reference with JaMopp on our own.
		 */
		LocalVariable i = theMethod.getLocalVariable("i");
		NamespaceClassifierReference add = (NamespaceClassifierReference) i.getTypeReference();
		return add.getClassifierReferences().get(0).getTarget();
	}
	public IdentifierReference getUriParse() {
		NewConstructorCall new_const = (NewConstructorCall) theMethod.getLocalVariable("i").getInitialValue();
		IdentifierReference id_ref = (IdentifierReference) new_const.getArguments().get(1);
		return id_ref;
	}

}
