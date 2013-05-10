/**
 * 
 */
package dk.autointents.m2m;

import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.osgi.framework.Bundle;
import org.w3c.dom.Attr;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xtext.example.mydsl.MyDslStandaloneSetup;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
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
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.MethodInvocation;
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
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IFileEditorInput;
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

public class MainDriver {
	ModelHelper internalHelper = null;
	ReferencesHelper ref_help;
	private IEditorPart _editorPart;

	public ModelHelper loadDSL() {
		IntentDSLPackage.eINSTANCE.eClass();
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("mydsl", new XMIResourceFactoryImpl());
		new org.eclipse.emf.mwe.utils.StandaloneSetup().setPlatformUri("../");
		Injector injector = new MyDslStandaloneSetup().createInjectorAndDoEMFRegistration();
		XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
		resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
		Bundle bundle = Platform.getBundle("AutoIntents");
		URL fileURL = bundle.getEntry("res/intents.mydsl");
		Resource resource = resourceSet.getResource(URI.createURI(fileURL.toString()), true);
		IntentModel model = (IntentModel) resource.getContents().get(0);
		internalHelper = new ModelHelper(model);
		ref_help = new ReferencesHelper();
		
		return internalHelper;
	}

	public boolean insertIntent(String intentName, ICompilationUnit cu, boolean generateExeptionsIsChecked, IEditorPart editorPart) throws Exception {
		_editorPart = editorPart;
		IntentDSL.Intent intent = internalHelper.getIntentByName(intentName);

		if (intent.getPermission() != null) {
			InsertPermission(intent.getPermission());
		}

		ASTParser parser = ASTParser.newParser(AST.JLS4);
		parser.setSource(cu);
		parser.setResolveBindings(false);
		CompilationUnit astRoot = (CompilationUnit) parser.createAST(null);
		astRoot.recordModifications();
		AST ast = astRoot.getAST();
		// create the descriptive ast rewriter
		ASTRewrite rewrite = ASTRewrite.create(ast);
		// get the block node that contains the statements in the method body
		TypeDeclaration typeDeclaration = (TypeDeclaration) astRoot.types().get(0);
		MethodDeclaration[] declarationMethods = typeDeclaration.getMethods();
		MethodDeclaration methodDeclaration = null;

		for (MethodDeclaration declaration : declarationMethods) {
			String methodName = declaration.getName().getIdentifier();
			if (methodName.equals("onCreate")) {
				methodDeclaration = declaration;
				break;
			}
		}
		if (methodDeclaration == null) {
			return false;
		}
		List<ASTNode> statements = new ArrayList<ASTNode>();
		Block block = methodDeclaration.getBody();
		// note: AST is not modified by this
		ListRewrite listRewrite = rewrite.getListRewrite(block, Block.STATEMENTS_PROPERTY);
		// Intent i = new Intent(ACTION);
		StringLiteral action = ast.newStringLiteral();
		action.setLiteralValue(intent.getAction());
		String intentVariable = "";
		String[] nameArray = intent.getName().split(" ");
		for (String word : nameArray) {
			intentVariable += word.toLowerCase().toCharArray()[0];
		}
		intentVariable += "Intent";
		VariableDeclarationFragment vdf = ast.newVariableDeclarationFragment();
		vdf.setName(ast.newSimpleName(intentVariable));
		VariableDeclarationStatement vds = ast.newVariableDeclarationStatement(vdf);
		vds.setType(ast.newSimpleType(ast.newSimpleName("Intent")));
		ClassInstanceCreation cc = ast.newClassInstanceCreation();
		cc.arguments().add(action);
		cc.setType(ast.newSimpleType(ast.newSimpleName("Intent")));
		vdf.setInitializer(cc);
		statements.add(vds);
		SimpleName intentVariableName = ast.newSimpleName(intentVariable);
		
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
		
		// Check if there is specified for the intent 
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
			SimpleName extraType = ast.newSimpleName(extraData.getType().toString());
			MethodInvocation extraMeth = ast.newMethodInvocation();
			SimpleName intentVariableName1 = ast.newSimpleName(intentVariable);
			extraMeth.setExpression(intentVariableName1);
			extraMeth.setName(ast.newSimpleName("putExtra"));
			extraMeth.arguments().add(extraName);
			extraMeth.arguments().add(extraType);
			Statement extraState = ast.newExpressionStatement(extraMeth);
			statements.add(extraState);
		}

		if (intent instanceof BroadCastIntent) {
			// startActivity(i);
			SimpleName expression = ast.newSimpleName(intentVariable);
			MethodInvocation startActivityMeth = ast.newMethodInvocation();
			startActivityMeth.setName(ast.newSimpleName("sendBroadcast"));
			startActivityMeth.arguments().add(expression);
			Statement startActivityStatement = ast.newExpressionStatement(startActivityMeth);
			statements.add(startActivityStatement);
		} else {
			if (intent.getReturnData().isEmpty()) {
				// startActivity(i);
				SimpleName expression = ast.newSimpleName(intentVariable);

				MethodInvocation startActivityMeth = ast.newMethodInvocation();
				startActivityMeth.setName(ast.newSimpleName("startActivity"));
				startActivityMeth.arguments().add(expression);
				Statement startActivityStatement = ast.newExpressionStatement(startActivityMeth);
				statements.add(startActivityStatement);
			} else {
				// startActivityForResult(i);
				SimpleName expression = ast.newSimpleName(intentVariable);
				SimpleName expression1 = ast.newSimpleName("REQUEST_CODE");

				MethodInvocation startActivityMeth = ast.newMethodInvocation();
				startActivityMeth.setName(ast.newSimpleName("startActivityForResult"));
				startActivityMeth.arguments().add(expression);
				startActivityMeth.arguments().add(expression1);
				Statement startActivityStatement = ast.newExpressionStatement(startActivityMeth);
				statements.add(startActivityStatement);
			}
		}

		ListRewrite lrw = rewrite.getListRewrite(astRoot, CompilationUnit.IMPORTS_PROPERTY);

		if (generateExeptionsIsChecked) {
			Block tryBlock = ast.newBlock();
			Block catchBlock = ast.newBlock();

			for (ASTNode statement : statements) {
				tryBlock.statements().add(statement);
			}

			TryStatement trystatement = ast.newTryStatement();
			CatchClause catchclause = ast.newCatchClause();
			ASTNode catchStatement = rewrite.createStringPlaceholder("Toast.makeText(this.getBaseContext(), \"You dont have the nessesary app. Please go to the Play Store and find one.\", Toast.LENGTH_SHORT).show();", ASTNode.EMPTY_STATEMENT);
			catchBlock.statements().add(catchStatement);
			catchclause.setBody(catchBlock);
			SingleVariableDeclaration exceptionVar = ast.newSingleVariableDeclaration();
			exceptionVar.setName(ast.newSimpleName("exception"));
			exceptionVar.setType(ast.newSimpleType(ast.newSimpleName("Exception")));
			catchclause.setException(exceptionVar);
			trystatement.catchClauses().add(catchclause);
			trystatement.setBody(tryBlock);
			ASTNode firstComment = rewrite.createStringPlaceholder("//Start of \"" + intentName + "\"", ASTNode.EMPTY_STATEMENT);
			listRewrite.insertLast(firstComment, null);
			listRewrite.insertLast(trystatement, null);
			ASTNode lastComment = rewrite.createStringPlaceholder("//End of \"" + intentName + "\"", ASTNode.EMPTY_STATEMENT);
			listRewrite.insertLast(lastComment, null);
			IImportDeclaration haveToastImport = cu.getImport("android.widget.Toast");
			if (!haveToastImport.exists()) {
				// android.widget.Toast
				ImportDeclaration toastImport = ast.newImportDeclaration();
				toastImport.setName(ast.newName(new String[] { "android", "widget", "Toast" }));

				lrw.insertLast(toastImport, null);
			}
		} else {
			ASTNode firstComment = rewrite.createStringPlaceholder("//Start of \"" + intentName + "\"", ASTNode.EMPTY_STATEMENT);
			listRewrite.insertLast(firstComment, null);

			for (ASTNode statement : statements) {
				listRewrite.insertLast(statement, null);
			}

			ASTNode lastComment = rewrite.createStringPlaceholder("//End of \"" + intentName + "\"", ASTNode.EMPTY_STATEMENT);
			listRewrite.insertLast(lastComment, null);
		}

		IImportDeclaration haveImport = cu.getImport("android.content.Intent");

		if (!haveImport.exists()) {
			// android.content.Intent
			ImportDeclaration intentImport = ast.newImportDeclaration();
			intentImport.setName(ast.newName(new String[] { "android", "content", "Intent" }));

			lrw.insertLast(intentImport, null);
		}

		IImportDeclaration uriImport = cu.getImport("android.net.Uri");

		if (!uriImport.exists() && intent.getDataURI() != null) {
			// android.content.Intent
			ImportDeclaration intentImport = ast.newImportDeclaration();
			intentImport.setName(ast.newName(new String[] { "android", "net", "Uri" }));

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

	private void InsertPermission(String permission) {
		IFile manifest = null;

		if (_editorPart != null) {
			IFileEditorInput input = (IFileEditorInput) _editorPart.getEditorInput();
			IFile file = input.getFile();
			IProject activeProject = file.getProject();

			manifest = activeProject.getFile("AndroidManifest.xml");
		}

		if (manifest == null) {
			// ERROR
		}

		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		factory.setIgnoringComments(true);
		factory.setIgnoringElementContentWhitespace(true);
		factory.setValidating(false);

		DocumentBuilder builder = null;
		org.w3c.dom.Document xml = null;

		try {
			builder = factory.newDocumentBuilder();
		} catch (ParserConfigurationException exception) {
			exception.printStackTrace();
		}

		try {
			xml = builder.parse(manifest.getContents());
		} catch (Exception exception) {
			exception.printStackTrace();
		}

		NodeList nodes = xml.getElementsByTagName("uses-permission");
		boolean permissionExists = false;

		for (int i = 0; i < nodes.getLength(); i++) {
			Node childNode = nodes.item(i);

			String name = childNode.getNodeName();

			if (name.equals("uses-permission")) {
				String currentNodeName = childNode.getAttributes().getNamedItem("android:name").getNodeValue();
				if (currentNodeName.equals(permission)) {
					permissionExists = true;
				}
			}
		}

		if (!permissionExists) {
			Node newElement = xml.createElement("uses-permission");
			Attr id = xml.createAttribute("android:name");
			id.setValue(permission);
			NamedNodeMap rootAttr = newElement.getAttributes();
			rootAttr.setNamedItem(id);

			nodes.item(0).getParentNode().insertBefore(newElement, nodes.item(0));

			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = null;
			
			try {
				transformer = transformerFactory.newTransformer();
			} catch (TransformerConfigurationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			DOMSource source = new DOMSource(xml);
			StreamResult result = new StreamResult(new File(manifest.getLocationURI()));
			
			try {
				transformer.transform(source, result);
			} catch (TransformerException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public static void main(String[] args) {
		MainDriver driver = new MainDriver();
	}
}