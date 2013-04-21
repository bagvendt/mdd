/**
 * 
 */
package dk.autointents.m2m;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import org.osgi.framework.Bundle;
import org.xtext.example.mydsl.MyDslStandaloneSetup;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IImportDeclaration;
import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.ASTParser;
import org.eclipse.jdt.core.dom.Block;
import org.eclipse.jdt.core.dom.CatchClause;
import org.eclipse.jdt.core.dom.ClassInstanceCreation;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.core.dom.ImportDeclaration;
import org.eclipse.jdt.core.dom.LineComment;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.MethodInvocation;
import org.eclipse.jdt.core.dom.QualifiedName;
import org.eclipse.jdt.core.dom.SimpleName;
import org.eclipse.jdt.core.dom.SingleVariableDeclaration;
import org.eclipse.jdt.core.dom.Statement;
import org.eclipse.jdt.core.dom.StringLiteral;
import org.eclipse.jdt.core.dom.TryStatement;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import org.eclipse.jdt.core.dom.VariableDeclarationFragment;
import org.eclipse.jdt.core.dom.VariableDeclarationStatement;
import org.eclipse.jdt.core.dom.rewrite.ASTRewrite;
import org.eclipse.jdt.core.dom.rewrite.ListRewrite;
import org.eclipse.jface.text.Document;
import org.eclipse.text.edits.TextEdit;
import org.eclipse.text.edits.UndoEdit;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;

import IntentDSL.BroadCastIntent;
/*
 import org.emftext.language.java.JavaClasspath;
 import org.emftext.language.java.containers.JavaRoot;
 import org.emftext.language.java.members.ClassMethod;
 import org.emftext.language.java.members.Method;
 import org.emftext.language.java.resource.JaMoPPUtil;
 */
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
		URL fileURL = bundle.getEntry("res/intents.mydsl");

		Resource resource = resourceSet.getResource(
				URI.createURI(fileURL.toString()), true);

		IntentModel model = (IntentModel) resource.getContents().get(0);
		internalHelper = new ModelHelper(model);
		ref_help = new ReferencesHelper();
		// ref_help.init();
		return internalHelper;
	}

	public boolean insertIntent(String intentName, ICompilationUnit cu,
			boolean generateExeptions) throws Exception {
		IntentDSL.Intent intent = internalHelper.getIntentByName(intentName);
		ASTParser parser = ASTParser.newParser(AST.JLS4);
		parser.setSource(cu);
		parser.setResolveBindings(false);
		CompilationUnit astRoot = (CompilationUnit) parser.createAST(null);

		astRoot.recordModifications();

		AST ast = astRoot.getAST();
		// create the descriptive ast rewriter
		ASTRewrite rewrite = ASTRewrite.create(ast);

		// get the block node that contains the statements in the method body
		TypeDeclaration typeDecl = (TypeDeclaration) astRoot.types().get(0);
		MethodDeclaration[] methods = typeDecl.getMethods();

		MethodDeclaration methodDecl = null;

		for (MethodDeclaration methodDeclaration : methods) {

			String methodName = methodDeclaration.getName().getIdentifier();
			if (methodName.equals("onCreate")) {
				methodDecl = methodDeclaration;
			}
		}

		if (methodDecl == null) {
			return false;
		}

		List<ASTNode> statements = new ArrayList<ASTNode>();

		Block block = methodDecl.getBody();

		// note: AST is not modified by this
		ListRewrite listRewrite = rewrite.getListRewrite(block,
				Block.STATEMENTS_PROPERTY);

		// Intent i = new Intent(ACTION);
		StringLiteral action = ast.newStringLiteral();
		action.setLiteralValue(intent.getAction());

		VariableDeclarationFragment vdf = ast.newVariableDeclarationFragment();
		vdf.setName(ast.newSimpleName("i"));
		VariableDeclarationStatement vds = ast
				.newVariableDeclarationStatement(vdf);
		vds.setType(ast.newSimpleType(ast.newSimpleName("Intent")));
		ClassInstanceCreation cc = ast.newClassInstanceCreation();
		cc.arguments().add(action);
		cc.setType(ast.newSimpleType(ast.newSimpleName("Intent")));
		vdf.setInitializer(cc);

		statements.add(vds);

		SimpleName intentVariableName = ast.newSimpleName("i");

		// i.setCategory(CATEGORY)
		String categoryFromModel = intent.getCategory();
		if (categoryFromModel != null) {
			StringLiteral category = ast.newStringLiteral();
			category.setLiteralValue(categoryFromModel.toString());
			MethodInvocation categoryMeth = ast.newMethodInvocation();
			categoryMeth.setExpression(intentVariableName);
			categoryMeth.setName(ast.newSimpleName("setCategory"));
			categoryMeth.arguments().add(category);
			Statement categoryState = ast.newExpressionStatement(categoryMeth);

			statements.add(categoryState);
		}
		// i.setData(Url.Parse(URI));
		String dataFromModel = intent.getDataURI();
		if (dataFromModel != null) {
			StringLiteral data = ast.newStringLiteral();
			data.setLiteralValue(dataFromModel.toString());
			
			MethodInvocation parseMeth = ast.newMethodInvocation();
			parseMeth.setExpression(ast.newSimpleName("Uri"));
			parseMeth.setName(ast.newSimpleName("parse"));
			parseMeth.arguments().add(data);
			
			MethodInvocation dataMeth = ast.newMethodInvocation();
			dataMeth.setExpression(intentVariableName);
			dataMeth.setName(ast.newSimpleName("setData"));
			dataMeth.arguments().add(parseMeth);
			Statement dataState = ast.newExpressionStatement(dataMeth);
			statements.add(dataState);
		}

		// i.putExtra("Name", "Object");
		for (ExtraData extraData : intent.getExtraData()) {

			StringLiteral extraName = ast.newStringLiteral();
			extraName.setLiteralValue(extraData.getName());

			SimpleName extraType = ast.newSimpleName(extraData.getType()
					.toString());

			MethodInvocation extraMeth = ast.newMethodInvocation();
			SimpleName intentVariableName1 = ast.newSimpleName("i");
			extraMeth.setExpression(intentVariableName1);
			extraMeth.setName(ast.newSimpleName("putExtra"));
			extraMeth.arguments().add(extraName);
			extraMeth.arguments().add(extraType);
			Statement extraState = ast.newExpressionStatement(extraMeth);
			statements.add(extraState);
		}

		if (intent instanceof BroadCastIntent) {
			// startActivity(i);
			SimpleName expression = ast.newSimpleName("i");

			MethodInvocation startActivityMeth = ast.newMethodInvocation();
			startActivityMeth.setName(ast.newSimpleName("sendBroadcast"));
			startActivityMeth.arguments().add(expression);
			Statement startActivityStatement = ast
					.newExpressionStatement(startActivityMeth);
			statements.add(startActivityStatement);
		} else {

			if (intent.getReturnData().isEmpty()) {
				// startActivity(i);
				SimpleName expression = ast.newSimpleName("i");

				MethodInvocation startActivityMeth = ast.newMethodInvocation();
				startActivityMeth.setName(ast.newSimpleName("startActivity"));
				startActivityMeth.arguments().add(expression);
				Statement startActivityStatement = ast
						.newExpressionStatement(startActivityMeth);
				statements.add(startActivityStatement);
			} else {
				
				// startActivityForResult(i);
				SimpleName expression = ast.newSimpleName("i");
				SimpleName expression1 = ast.newSimpleName("REQUEST_CODE");

				MethodInvocation startActivityMeth = ast.newMethodInvocation();
				startActivityMeth.setName(ast
						.newSimpleName("startActivityForResult"));
				startActivityMeth.arguments().add(expression);
				startActivityMeth.arguments().add(expression1);
				Statement startActivityStatement = ast
						.newExpressionStatement(startActivityMeth);
				statements.add(startActivityStatement);
			}
		}

		ListRewrite lrw = rewrite.getListRewrite(astRoot,
				CompilationUnit.IMPORTS_PROPERTY);
		
		if (generateExeptions) {
			Block tryBlock = ast.newBlock();
			Block catchBlock = ast.newBlock();

			for (ASTNode statement : statements) {
				tryBlock.statements().add(statement);
			}

			TryStatement trystatement = ast.newTryStatement();

			CatchClause catchclause = ast.newCatchClause();

			ASTNode catchStatement = rewrite
					.createStringPlaceholder(
							"Toast.makeText(this.getBaseContext(), \"You dont have the nessesary app. Please go to the Play Store and find one.\", Toast.LENGTH_SHORT).show();",
							ASTNode.EMPTY_STATEMENT);

			catchBlock.statements().add(catchStatement);

			catchclause.setBody(catchBlock);

			SingleVariableDeclaration exceptionVar = ast.newSingleVariableDeclaration();
			exceptionVar.setName(ast.newSimpleName("exception"));
			exceptionVar.setType(ast.newSimpleType(ast.newSimpleName("Exception")));
			
			catchclause.setException(exceptionVar);
			
			trystatement.catchClauses().add(catchclause);
			trystatement.setBody(tryBlock);

			ASTNode firstComment = rewrite.createStringPlaceholder(
					"//Start of \"" + intentName + "\"",
					ASTNode.EMPTY_STATEMENT);
			listRewrite.insertLast(firstComment, null);

			listRewrite.insertLast(trystatement, null);

			ASTNode lastComment = rewrite.createStringPlaceholder("//End of \""
					+ intentName + "\"", ASTNode.EMPTY_STATEMENT);
			listRewrite.insertLast(lastComment, null);
			
			IImportDeclaration haveToastImport = cu.getImport("android.widget.Toast");
			if (!haveToastImport.exists()) {
				// android.widget.Toast
				ImportDeclaration toastImport = ast.newImportDeclaration();
				toastImport.setName(ast.newName(new String[] { "android", "widget",
						"Toast" }));

				lrw.insertLast(toastImport, null);
			}


		} else {

			ASTNode firstComment = rewrite.createStringPlaceholder(
					"//Start of \"" + intentName + "\"",
					ASTNode.EMPTY_STATEMENT);
			listRewrite.insertLast(firstComment, null);

			for (ASTNode statement : statements) {
				listRewrite.insertLast(statement, null);
			}

			ASTNode lastComment = rewrite.createStringPlaceholder("//End of \""
					+ intentName + "\"", ASTNode.EMPTY_STATEMENT);
			listRewrite.insertLast(lastComment, null);

		}

		IImportDeclaration haveImport = cu.getImport("android.content.Intent");
		
		if (!haveImport.exists()) {
			// android.content.Intent
			ImportDeclaration intentImport = ast.newImportDeclaration();
			intentImport.setName(ast.newName(new String[] { "android", "content",
					"Intent" }));

			lrw.insertLast(intentImport, null);
		}
		
		IImportDeclaration haveURIImport = cu.getImport("android.net.Uri");
		
		if (!haveURIImport.exists() && intent.getDataURI() != null) {
			// android.content.Intent
			ImportDeclaration intentImport = ast.newImportDeclaration();
			intentImport.setName(ast.newName(new String[] { "android", "net",
					"Uri" }));

			lrw.insertLast(intentImport, null);
		}


		// evaluate the text edits corresponding to the described changes. AST
		// and CU still unmodified.
		TextEdit res = rewrite.rewriteAST();

		// apply the text edits to the compilation unit
		Document document = new Document(cu.getSource());
		res.apply(document);
		cu.getBuffer().setContents(document.get());

		return true;
	}

	/*
	 * public void insertIntentJAMOPP(String intentName, ICompilationUnit cu)
	 * throws Exception {
	 * 
	 * 
	 * ReferencesHelper ref_help = new ReferencesHelper(); ref_help.init();
	 * 
	 * URI uri = URI.createURI("platform:/resource" + cu.getPath().toString());
	 * 
	 * ResourceSet resourceSet = new ResourceSetImpl(); Resource resource =
	 * resourceSet.createResource(uri);
	 * 
	 * Map<Object, Object> map = new HashMap<Object, Object>();
	 * map.put(JavaClasspath.OPTION_USE_LOCAL_CLASSPATH, Boolean.TRUE);
	 * 
	 * try { resource.load(map); } catch (IOException e) { // TODO
	 * Auto-generated catch block e.printStackTrace(); }
	 * 
	 * EObject content = resource.getContents().get(0);
	 * 
	 * 
	 * JavaRoot root = (JavaRoot) content;
	 * 
	 * org.emftext.language.java.classifiers.Class theClass = null;
	 * 
	 * for (EObject lol : root.eContents()) {
	 * 
	 * if (lol instanceof org.emftext.language.java.classifiers.Class) {
	 * theClass = (org.emftext.language.java.classifiers.Class) lol; } }
	 * ClassMethod theMethod = null; for (Method method : theClass.getMethods())
	 * { //System.out.println(method.getClass().toString()); theMethod =
	 * (ClassMethod) method; } TransformTest a = new TransformTest(ref_help);
	 * theMethod.getStatements().addAll(a.buildIntentCall());
	 * System.out.println(a.buildIntentCall());
	 * 
	 * 
	 * try { resource.save(map); } catch (IOException e) { // TODO
	 * Auto-generated catch block e.printStackTrace(); }
	 * 
	 * 
	 * 
	 * }
	 * 
	 * public void test() throws IOException { JaMoPPUtil.initialize(); //
	 * Bundle bundle = Platform.getBundle("AutoIntents"); // URL fileURL =
	 * bundle.getEntry("res/IntentDemo.java");
	 * 
	 * 
	 * 
	 * 
	 * // ResourceSet resourceSet = new ResourceSetImpl(); // Resource resource
	 * = resourceSet.createResource(uri); // // Map<Object, Object> map = new
	 * HashMap<Object, Object>(); //
	 * map.put(JavaClasspath.OPTION_USE_LOCAL_CLASSPATH, Boolean.TRUE); // //
	 * resource.load(map);
	 * 
	 * 
	 * }
	 */
	public static void main(String[] args) {
		MainDriver driver = new MainDriver();
		/*
		 * try { driver.test(); } catch (IOException e) { // TODO Auto-generated
		 * catch block e.printStackTrace(); } // ModelHelper modelHelper =
		 * driver.LoadDSL(); //TransformTest tt = new TransformTest();
		 * //tt.invoke(modelHelper.getIntentByName("BrowseToGoogle"));
		 */
	}
}