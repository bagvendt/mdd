/*
* generated by Xtext
*/
package org.xtext.example.mydsl.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import org.xtext.example.mydsl.services.MyDslGrammarAccess;

public class MyDslParser extends AbstractContentAssistParser {
	
	@Inject
	private MyDslGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected org.xtext.example.mydsl.ui.contentassist.antlr.internal.InternalMyDslParser createParser() {
		org.xtext.example.mydsl.ui.contentassist.antlr.internal.InternalMyDslParser result = new org.xtext.example.mydsl.ui.contentassist.antlr.internal.InternalMyDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getIntentAccess().getAlternatives_2(), "rule__Intent__Alternatives_2");
					put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
					put(grammarAccess.getSimpleTypeEnumAccess().getAlternatives(), "rule__SimpleTypeEnum__Alternatives");
					put(grammarAccess.getIntentModelAccess().getGroup(), "rule__IntentModel__Group__0");
					put(grammarAccess.getIntentModelAccess().getGroup_7(), "rule__IntentModel__Group_7__0");
					put(grammarAccess.getIntentAccess().getGroup(), "rule__Intent__Group__0");
					put(grammarAccess.getIntentAccess().getGroup_4(), "rule__Intent__Group_4__0");
					put(grammarAccess.getIntentAccess().getGroup_4_0(), "rule__Intent__Group_4_0__0");
					put(grammarAccess.getIntentAccess().getGroup_4_1(), "rule__Intent__Group_4_1__0");
					put(grammarAccess.getIntentAccess().getGroup_4_2(), "rule__Intent__Group_4_2__0");
					put(grammarAccess.getIntentAccess().getGroup_4_3(), "rule__Intent__Group_4_3__0");
					put(grammarAccess.getIntentAccess().getGroup_4_4(), "rule__Intent__Group_4_4__0");
					put(grammarAccess.getIntentAccess().getGroup_4_5(), "rule__Intent__Group_4_5__0");
					put(grammarAccess.getIntentAccess().getGroup_4_5_3(), "rule__Intent__Group_4_5_3__0");
					put(grammarAccess.getIntentAccess().getGroup_4_6(), "rule__Intent__Group_4_6__0");
					put(grammarAccess.getIntentAccess().getGroup_4_6_3(), "rule__Intent__Group_4_6_3__0");
					put(grammarAccess.getExtraDataAccess().getGroup(), "rule__ExtraData__Group__0");
					put(grammarAccess.getExtraDataAccess().getGroup_2(), "rule__ExtraData__Group_2__0");
					put(grammarAccess.getExtraDataAccess().getGroup_4(), "rule__ExtraData__Group_4__0");
					put(grammarAccess.getExplicitIntentAccess().getGroup(), "rule__ExplicitIntent__Group__0");
					put(grammarAccess.getImplicitIntentAccess().getGroup(), "rule__ImplicitIntent__Group__0");
					put(grammarAccess.getBroadcastIntentAccess().getGroup(), "rule__BroadcastIntent__Group__0");
					put(grammarAccess.getServiceIntentAccess().getGroup(), "rule__ServiceIntent__Group__0");
					put(grammarAccess.getIntentModelAccess().getNameAssignment_1(), "rule__IntentModel__NameAssignment_1");
					put(grammarAccess.getIntentModelAccess().getIntentsAssignment_5(), "rule__IntentModel__IntentsAssignment_5");
					put(grammarAccess.getIntentModelAccess().getIntentsAssignment_7_2(), "rule__IntentModel__IntentsAssignment_7_2");
					put(grammarAccess.getIntentAccess().getNameAssignment_4_0_2(), "rule__Intent__NameAssignment_4_0_2");
					put(grammarAccess.getIntentAccess().getActionAssignment_4_1_2(), "rule__Intent__ActionAssignment_4_1_2");
					put(grammarAccess.getIntentAccess().getCategoryAssignment_4_2_2(), "rule__Intent__CategoryAssignment_4_2_2");
					put(grammarAccess.getIntentAccess().getMetaCategoryAssignment_4_3_2(), "rule__Intent__MetaCategoryAssignment_4_3_2");
					put(grammarAccess.getIntentAccess().getDataURIAssignment_4_4_2(), "rule__Intent__DataURIAssignment_4_4_2");
					put(grammarAccess.getIntentAccess().getExtraDataAssignment_4_5_3_1(), "rule__Intent__ExtraDataAssignment_4_5_3_1");
					put(grammarAccess.getIntentAccess().getReturnDataAssignment_4_6_3_1(), "rule__Intent__ReturnDataAssignment_4_6_3_1");
					put(grammarAccess.getExtraDataAccess().getNameAssignment_2_2(), "rule__ExtraData__NameAssignment_2_2");
					put(grammarAccess.getExtraDataAccess().getTypeAssignment_4_2(), "rule__ExtraData__TypeAssignment_4_2");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			org.xtext.example.mydsl.ui.contentassist.antlr.internal.InternalMyDslParser typedParser = (org.xtext.example.mydsl.ui.contentassist.antlr.internal.InternalMyDslParser) parser;
			typedParser.entryRuleIntentModel();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public MyDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
