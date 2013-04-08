/**
 * 
 */
package dk.autointents.m2m;

import java.net.URL;

import org.osgi.framework.Bundle;
import org.xtext.example.mydsl.MyDslStandaloneSetup;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.*;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTParser;
import org.eclipse.jdt.core.dom.Block;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.MethodInvocation;
import org.eclipse.jdt.core.dom.Statement;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import org.eclipse.jdt.core.dom.rewrite.ASTRewrite;
import org.eclipse.jdt.core.dom.rewrite.ListRewrite;
import org.eclipse.jface.text.Document;
import org.eclipse.text.edits.TextEdit;
import org.eclipse.ui.internal.Model;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;


import IntentDSL.IntentDSLPackage;
import IntentDSL.IntentModel;

import com.google.inject.Injector;
/**
 * @author Bagvendt
 *
 */
public class MainDriver {
	
	ModelHelper internalHelper = null;
	
	public ModelHelper LoadDSL () {
		IntentDSLPackage.eINSTANCE.eClass();
	Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("mydsl", new XMIResourceFactoryImpl());
	new org.eclipse.emf.mwe.utils.StandaloneSetup().setPlatformUri("../");
	Injector injector = new MyDslStandaloneSetup().createInjectorAndDoEMFRegistration();
	XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
	resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
	Resource resource = resourceSet.getResource(
	    //URI.createURI("platform:/resource/org.xtext.example.mydsl/mydsl/browser.mydsl"), true);
		URI.createURI("res/browser.mydsl"), true);
	
	IntentModel model = (IntentModel) resource.getContents().get(0);
	return new ModelHelper(model);
	}
	
	public ModelHelper NewLoadDSL () {
		IntentDSLPackage.eINSTANCE.eClass();
	Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("mydsl", new XMIResourceFactoryImpl());
	new org.eclipse.emf.mwe.utils.StandaloneSetup().setPlatformUri("../");
	Injector injector = new MyDslStandaloneSetup().createInjectorAndDoEMFRegistration();
	XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
	resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
	Bundle bundle = Platform.getBundle("AutoIntents");
	URL fileURL = bundle.getEntry("res/browser.mydsl");
	
	Resource resource = resourceSet.getResource(
		URI.createURI(fileURL.toString()), true);
	
	IntentModel model = (IntentModel) resource.getContents().get(0);
	internalHelper = new ModelHelper(model);
	return internalHelper;
	}
	
	public void insertIntent_old(String intentName, ICompilationUnit cu) throws Exception {
		IntentDSL.Intent intent = internalHelper.getIntentByName(intentName);
		ASTParser parser= ASTParser.newParser(AST.JLS4);
		parser.setSource(cu);
		parser.setResolveBindings(false);
		CompilationUnit astRoot= (CompilationUnit) parser.createAST(null);
		AST ast = astRoot.getAST();

		
		// create the descriptive ast rewriter
		ASTRewrite rewrite = ASTRewrite.create(ast);

		// get the block node that contains the statements in the method body
		TypeDeclaration typeDecl = (TypeDeclaration) astRoot.types().get(0);
		MethodDeclaration methodDecl= typeDecl.getMethods()[0];
		Block block= methodDecl.getBody();
		
		// create new statements to insert
		MethodInvocation newInv1= ast.newMethodInvocation();
		newInv1.setName(ast.newSimpleName("bar1"));
		Statement newStatement1= ast.newExpressionStatement(newInv1);
		
		MethodInvocation newInv2= ast.newMethodInvocation();
		newInv2.setName(ast.newSimpleName("bar2"));
		Statement newStatement2= ast.newExpressionStatement(newInv2);
		
		// describe that the first node is inserted as first statement in block, the other one as last statement
		// note: AST is not modified by this
		ListRewrite listRewrite= rewrite.getListRewrite(block, Block.STATEMENTS_PROPERTY);
		listRewrite.insertFirst(newStatement1, null);
		listRewrite.insertLast(newStatement2, null);
		
		// evaluate the text edits corresponding to the described changes. AST and CU still unmodified.
		TextEdit res= rewrite.rewriteAST();
		
		// apply the text edits to the compilation unit
		Document document= new Document(cu.getSource());
		res.apply(document);
		cu.getBuffer().setContents(document.get());
	}
	public void insertIntent(String intentName, ICompilationUnit cu) throws Exception {
		IntentDSL.Intent intent = internalHelper.getIntentByName(intentName);
		ASTParser parser= ASTParser.newParser(AST.JLS4);
		parser.setSource(cu);
		parser.setResolveBindings(false);
		CompilationUnit astRoot= (CompilationUnit) parser.createAST(null);
		AST ast = astRoot.getAST();


		
		// create the descriptive ast rewriter
		ASTRewrite rewrite = ASTRewrite.create(ast);

		// get the block node that contains the statements in the method body
		TypeDeclaration typeDecl = (TypeDeclaration) astRoot.types().get(0);

		MethodDeclaration methodDecl= typeDecl.getMethods()[0];
		Block block= methodDecl.get.getBody();
		
		// create new statements to insert
		ast.newMethodDeclaration();
		MethodInvocation newInv1= ast.newMethodInvocation();
		newInv1.setName(ast.newSimpleName("bar1"));
		Statement newStatement1= ast.newExpressionStatement(newInv1);
		
		MethodInvocation newInv2= ast.newMethodInvocation();
		newInv2.setName(ast.newSimpleName("bar2"));
		Statement newStatement2= ast.newExpressionStatement(newInv2);
		
		// describe that the first node is inserted as first statement in block, the other one as last statement
		// note: AST is not modified by this
		ListRewrite listRewrite= rewrite.getListRewrite(block, Block.STATEMENTS_PROPERTY);
		listRewrite.insertFirst(newStatement1, null);
		listRewrite.insertLast(newStatement2, null);
		
		// evaluate the text edits corresponding to the described changes. AST and CU still unmodified.
		TextEdit res= rewrite.rewriteAST();
		
		// apply the text edits to the compilation unit
		Document document= new Document(cu.getSource());
		res.apply(document);
		cu.getBuffer().setContents(document.get());
	}
	
	
	
	
	public static void main(String[] args) {
		ModelHelper modelHelper = new MainDriver().LoadDSL();
		System.out.println(modelHelper.getCategories());
		
		
	}
}