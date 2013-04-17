package org.xtext.example.mydsl.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Model'", "'='", "'['", "'{'", "','", "'}'", "']'", "'Type'", "':'", "'Name'", "'Action'", "'Category'", "'Meta-Category'", "'DataURI'", "'DataExtra'", "'ReturnData'", "'\\'ExplicitIntent\\''", "'\\'ImplicitIntent\\''", "'\\'BroadcastIntent\\''", "'\\'ServiceIntent\\''", "'boolean'", "'Bundle'", "'byte'", "'double'", "'float'", "'integer'", "'long'", "'short'", "'String'"
    };
    public static final int RULE_ID=5;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int RULE_STRING=4;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__16=16;
    public static final int T__34=34;
    public static final int T__15=15;
    public static final int T__35=35;
    public static final int T__18=18;
    public static final int T__36=36;
    public static final int T__17=17;
    public static final int T__37=37;
    public static final int T__12=12;
    public static final int T__38=38;
    public static final int T__11=11;
    public static final int T__39=39;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g"; }



     	private MyDslGrammarAccess grammarAccess;
     	
        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "IntentModel";	
       	}
       	
       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleIntentModel"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:68:1: entryRuleIntentModel returns [EObject current=null] : iv_ruleIntentModel= ruleIntentModel EOF ;
    public final EObject entryRuleIntentModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntentModel = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:69:2: (iv_ruleIntentModel= ruleIntentModel EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:70:2: iv_ruleIntentModel= ruleIntentModel EOF
            {
             newCompositeNode(grammarAccess.getIntentModelRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleIntentModel_in_entryRuleIntentModel75);
            iv_ruleIntentModel=ruleIntentModel();

            state._fsp--;

             current =iv_ruleIntentModel; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIntentModel85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIntentModel"


    // $ANTLR start "ruleIntentModel"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:77:1: ruleIntentModel returns [EObject current=null] : ( () ( (lv_name_1_0= 'Model' ) ) otherlv_2= '=' otherlv_3= '[' (otherlv_4= '{' ( (lv_intents_5_0= ruleIntent ) ) (otherlv_6= ',' ( (lv_intents_7_0= ruleIntent ) ) )* otherlv_8= '}' )? otherlv_9= ']' ) ;
    public final EObject ruleIntentModel() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_intents_5_0 = null;

        EObject lv_intents_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:80:28: ( ( () ( (lv_name_1_0= 'Model' ) ) otherlv_2= '=' otherlv_3= '[' (otherlv_4= '{' ( (lv_intents_5_0= ruleIntent ) ) (otherlv_6= ',' ( (lv_intents_7_0= ruleIntent ) ) )* otherlv_8= '}' )? otherlv_9= ']' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:81:1: ( () ( (lv_name_1_0= 'Model' ) ) otherlv_2= '=' otherlv_3= '[' (otherlv_4= '{' ( (lv_intents_5_0= ruleIntent ) ) (otherlv_6= ',' ( (lv_intents_7_0= ruleIntent ) ) )* otherlv_8= '}' )? otherlv_9= ']' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:81:1: ( () ( (lv_name_1_0= 'Model' ) ) otherlv_2= '=' otherlv_3= '[' (otherlv_4= '{' ( (lv_intents_5_0= ruleIntent ) ) (otherlv_6= ',' ( (lv_intents_7_0= ruleIntent ) ) )* otherlv_8= '}' )? otherlv_9= ']' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:81:2: () ( (lv_name_1_0= 'Model' ) ) otherlv_2= '=' otherlv_3= '[' (otherlv_4= '{' ( (lv_intents_5_0= ruleIntent ) ) (otherlv_6= ',' ( (lv_intents_7_0= ruleIntent ) ) )* otherlv_8= '}' )? otherlv_9= ']'
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:81:2: ()
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:82:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getIntentModelAccess().getIntentModelAction_0(),
                        current);
                

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:87:2: ( (lv_name_1_0= 'Model' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:88:1: (lv_name_1_0= 'Model' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:88:1: (lv_name_1_0= 'Model' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:89:3: lv_name_1_0= 'Model'
            {
            lv_name_1_0=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleIntentModel137); 

                    newLeafNode(lv_name_1_0, grammarAccess.getIntentModelAccess().getNameModelKeyword_1_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getIntentModelRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_1_0, "Model");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleIntentModel162); 

                	newLeafNode(otherlv_2, grammarAccess.getIntentModelAccess().getEqualsSignKeyword_2());
                
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleIntentModel174); 

                	newLeafNode(otherlv_3, grammarAccess.getIntentModelAccess().getLeftSquareBracketKeyword_3());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:110:1: (otherlv_4= '{' ( (lv_intents_5_0= ruleIntent ) ) (otherlv_6= ',' ( (lv_intents_7_0= ruleIntent ) ) )* otherlv_8= '}' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:110:3: otherlv_4= '{' ( (lv_intents_5_0= ruleIntent ) ) (otherlv_6= ',' ( (lv_intents_7_0= ruleIntent ) ) )* otherlv_8= '}'
                    {
                    otherlv_4=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleIntentModel187); 

                        	newLeafNode(otherlv_4, grammarAccess.getIntentModelAccess().getLeftCurlyBracketKeyword_4_0());
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:114:1: ( (lv_intents_5_0= ruleIntent ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:115:1: (lv_intents_5_0= ruleIntent )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:115:1: (lv_intents_5_0= ruleIntent )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:116:3: lv_intents_5_0= ruleIntent
                    {
                     
                    	        newCompositeNode(grammarAccess.getIntentModelAccess().getIntentsIntentParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleIntent_in_ruleIntentModel208);
                    lv_intents_5_0=ruleIntent();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getIntentModelRule());
                    	        }
                           		add(
                           			current, 
                           			"intents",
                            		lv_intents_5_0, 
                            		"Intent");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:132:2: (otherlv_6= ',' ( (lv_intents_7_0= ruleIntent ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==15) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:132:4: otherlv_6= ',' ( (lv_intents_7_0= ruleIntent ) )
                    	    {
                    	    otherlv_6=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleIntentModel221); 

                    	        	newLeafNode(otherlv_6, grammarAccess.getIntentModelAccess().getCommaKeyword_4_2_0());
                    	        
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:136:1: ( (lv_intents_7_0= ruleIntent ) )
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:137:1: (lv_intents_7_0= ruleIntent )
                    	    {
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:137:1: (lv_intents_7_0= ruleIntent )
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:138:3: lv_intents_7_0= ruleIntent
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getIntentModelAccess().getIntentsIntentParserRuleCall_4_2_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleIntent_in_ruleIntentModel242);
                    	    lv_intents_7_0=ruleIntent();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getIntentModelRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"intents",
                    	            		lv_intents_7_0, 
                    	            		"Intent");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleIntentModel256); 

                        	newLeafNode(otherlv_8, grammarAccess.getIntentModelAccess().getRightCurlyBracketKeyword_4_3());
                        

                    }
                    break;

            }

            otherlv_9=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleIntentModel270); 

                	newLeafNode(otherlv_9, grammarAccess.getIntentModelAccess().getRightSquareBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIntentModel"


    // $ANTLR start "entryRuleIntent"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:170:1: entryRuleIntent returns [EObject current=null] : iv_ruleIntent= ruleIntent EOF ;
    public final EObject entryRuleIntent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntent = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:171:2: (iv_ruleIntent= ruleIntent EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:172:2: iv_ruleIntent= ruleIntent EOF
            {
             newCompositeNode(grammarAccess.getIntentRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleIntent_in_entryRuleIntent306);
            iv_ruleIntent=ruleIntent();

            state._fsp--;

             current =iv_ruleIntent; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIntent316); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIntent"


    // $ANTLR start "ruleIntent"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:179:1: ruleIntent returns [EObject current=null] : (otherlv_0= 'Type' otherlv_1= ':' (this_ExplicitIntent_2= ruleExplicitIntent | this_ImplicitIntent_3= ruleImplicitIntent | this_BroadcastIntent_4= ruleBroadcastIntent | this_ServiceIntent_5= ruleServiceIntent ) otherlv_6= ',' ( (otherlv_7= 'Name' otherlv_8= ':' ( (lv_name_9_0= ruleEString ) ) otherlv_10= ',' ) (otherlv_11= 'Action' otherlv_12= ':' ( (lv_action_13_0= ruleEString ) ) otherlv_14= ',' ) (otherlv_15= 'Category' otherlv_16= ':' ( (lv_category_17_0= ruleEString ) ) otherlv_18= ',' )? (otherlv_19= 'Meta-Category' otherlv_20= ':' ( (lv_metaCategory_21_0= ruleEString ) ) otherlv_22= ',' ) (otherlv_23= 'DataURI' otherlv_24= ':' ( (lv_dataURI_25_0= ruleEString ) ) otherlv_26= ',' ) (otherlv_27= 'DataExtra' otherlv_28= ':' otherlv_29= '[' ( (lv_extraData_30_0= ruleExtraData ) ) (otherlv_31= ',' ( (lv_extraData_32_0= ruleExtraData ) ) )* otherlv_33= ']' otherlv_34= ',' )? (otherlv_35= 'ReturnData' otherlv_36= ':' otherlv_37= '[' ( (lv_returnData_38_0= ruleExtraData ) ) (otherlv_39= ',' ( (lv_returnData_40_0= ruleExtraData ) ) )* otherlv_41= ']' otherlv_42= ',' )? ) ) ;
    public final EObject ruleIntent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token otherlv_31=null;
        Token otherlv_33=null;
        Token otherlv_34=null;
        Token otherlv_35=null;
        Token otherlv_36=null;
        Token otherlv_37=null;
        Token otherlv_39=null;
        Token otherlv_41=null;
        Token otherlv_42=null;
        EObject this_ExplicitIntent_2 = null;

        EObject this_ImplicitIntent_3 = null;

        EObject this_BroadcastIntent_4 = null;

        EObject this_ServiceIntent_5 = null;

        AntlrDatatypeRuleToken lv_name_9_0 = null;

        AntlrDatatypeRuleToken lv_action_13_0 = null;

        AntlrDatatypeRuleToken lv_category_17_0 = null;

        AntlrDatatypeRuleToken lv_metaCategory_21_0 = null;

        AntlrDatatypeRuleToken lv_dataURI_25_0 = null;

        EObject lv_extraData_30_0 = null;

        EObject lv_extraData_32_0 = null;

        EObject lv_returnData_38_0 = null;

        EObject lv_returnData_40_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:182:28: ( (otherlv_0= 'Type' otherlv_1= ':' (this_ExplicitIntent_2= ruleExplicitIntent | this_ImplicitIntent_3= ruleImplicitIntent | this_BroadcastIntent_4= ruleBroadcastIntent | this_ServiceIntent_5= ruleServiceIntent ) otherlv_6= ',' ( (otherlv_7= 'Name' otherlv_8= ':' ( (lv_name_9_0= ruleEString ) ) otherlv_10= ',' ) (otherlv_11= 'Action' otherlv_12= ':' ( (lv_action_13_0= ruleEString ) ) otherlv_14= ',' ) (otherlv_15= 'Category' otherlv_16= ':' ( (lv_category_17_0= ruleEString ) ) otherlv_18= ',' )? (otherlv_19= 'Meta-Category' otherlv_20= ':' ( (lv_metaCategory_21_0= ruleEString ) ) otherlv_22= ',' ) (otherlv_23= 'DataURI' otherlv_24= ':' ( (lv_dataURI_25_0= ruleEString ) ) otherlv_26= ',' ) (otherlv_27= 'DataExtra' otherlv_28= ':' otherlv_29= '[' ( (lv_extraData_30_0= ruleExtraData ) ) (otherlv_31= ',' ( (lv_extraData_32_0= ruleExtraData ) ) )* otherlv_33= ']' otherlv_34= ',' )? (otherlv_35= 'ReturnData' otherlv_36= ':' otherlv_37= '[' ( (lv_returnData_38_0= ruleExtraData ) ) (otherlv_39= ',' ( (lv_returnData_40_0= ruleExtraData ) ) )* otherlv_41= ']' otherlv_42= ',' )? ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:183:1: (otherlv_0= 'Type' otherlv_1= ':' (this_ExplicitIntent_2= ruleExplicitIntent | this_ImplicitIntent_3= ruleImplicitIntent | this_BroadcastIntent_4= ruleBroadcastIntent | this_ServiceIntent_5= ruleServiceIntent ) otherlv_6= ',' ( (otherlv_7= 'Name' otherlv_8= ':' ( (lv_name_9_0= ruleEString ) ) otherlv_10= ',' ) (otherlv_11= 'Action' otherlv_12= ':' ( (lv_action_13_0= ruleEString ) ) otherlv_14= ',' ) (otherlv_15= 'Category' otherlv_16= ':' ( (lv_category_17_0= ruleEString ) ) otherlv_18= ',' )? (otherlv_19= 'Meta-Category' otherlv_20= ':' ( (lv_metaCategory_21_0= ruleEString ) ) otherlv_22= ',' ) (otherlv_23= 'DataURI' otherlv_24= ':' ( (lv_dataURI_25_0= ruleEString ) ) otherlv_26= ',' ) (otherlv_27= 'DataExtra' otherlv_28= ':' otherlv_29= '[' ( (lv_extraData_30_0= ruleExtraData ) ) (otherlv_31= ',' ( (lv_extraData_32_0= ruleExtraData ) ) )* otherlv_33= ']' otherlv_34= ',' )? (otherlv_35= 'ReturnData' otherlv_36= ':' otherlv_37= '[' ( (lv_returnData_38_0= ruleExtraData ) ) (otherlv_39= ',' ( (lv_returnData_40_0= ruleExtraData ) ) )* otherlv_41= ']' otherlv_42= ',' )? ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:183:1: (otherlv_0= 'Type' otherlv_1= ':' (this_ExplicitIntent_2= ruleExplicitIntent | this_ImplicitIntent_3= ruleImplicitIntent | this_BroadcastIntent_4= ruleBroadcastIntent | this_ServiceIntent_5= ruleServiceIntent ) otherlv_6= ',' ( (otherlv_7= 'Name' otherlv_8= ':' ( (lv_name_9_0= ruleEString ) ) otherlv_10= ',' ) (otherlv_11= 'Action' otherlv_12= ':' ( (lv_action_13_0= ruleEString ) ) otherlv_14= ',' ) (otherlv_15= 'Category' otherlv_16= ':' ( (lv_category_17_0= ruleEString ) ) otherlv_18= ',' )? (otherlv_19= 'Meta-Category' otherlv_20= ':' ( (lv_metaCategory_21_0= ruleEString ) ) otherlv_22= ',' ) (otherlv_23= 'DataURI' otherlv_24= ':' ( (lv_dataURI_25_0= ruleEString ) ) otherlv_26= ',' ) (otherlv_27= 'DataExtra' otherlv_28= ':' otherlv_29= '[' ( (lv_extraData_30_0= ruleExtraData ) ) (otherlv_31= ',' ( (lv_extraData_32_0= ruleExtraData ) ) )* otherlv_33= ']' otherlv_34= ',' )? (otherlv_35= 'ReturnData' otherlv_36= ':' otherlv_37= '[' ( (lv_returnData_38_0= ruleExtraData ) ) (otherlv_39= ',' ( (lv_returnData_40_0= ruleExtraData ) ) )* otherlv_41= ']' otherlv_42= ',' )? ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:183:3: otherlv_0= 'Type' otherlv_1= ':' (this_ExplicitIntent_2= ruleExplicitIntent | this_ImplicitIntent_3= ruleImplicitIntent | this_BroadcastIntent_4= ruleBroadcastIntent | this_ServiceIntent_5= ruleServiceIntent ) otherlv_6= ',' ( (otherlv_7= 'Name' otherlv_8= ':' ( (lv_name_9_0= ruleEString ) ) otherlv_10= ',' ) (otherlv_11= 'Action' otherlv_12= ':' ( (lv_action_13_0= ruleEString ) ) otherlv_14= ',' ) (otherlv_15= 'Category' otherlv_16= ':' ( (lv_category_17_0= ruleEString ) ) otherlv_18= ',' )? (otherlv_19= 'Meta-Category' otherlv_20= ':' ( (lv_metaCategory_21_0= ruleEString ) ) otherlv_22= ',' ) (otherlv_23= 'DataURI' otherlv_24= ':' ( (lv_dataURI_25_0= ruleEString ) ) otherlv_26= ',' ) (otherlv_27= 'DataExtra' otherlv_28= ':' otherlv_29= '[' ( (lv_extraData_30_0= ruleExtraData ) ) (otherlv_31= ',' ( (lv_extraData_32_0= ruleExtraData ) ) )* otherlv_33= ']' otherlv_34= ',' )? (otherlv_35= 'ReturnData' otherlv_36= ':' otherlv_37= '[' ( (lv_returnData_38_0= ruleExtraData ) ) (otherlv_39= ',' ( (lv_returnData_40_0= ruleExtraData ) ) )* otherlv_41= ']' otherlv_42= ',' )? )
            {
            otherlv_0=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleIntent353); 

                	newLeafNode(otherlv_0, grammarAccess.getIntentAccess().getTypeKeyword_0());
                
            otherlv_1=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleIntent365); 

                	newLeafNode(otherlv_1, grammarAccess.getIntentAccess().getColonKeyword_1());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:191:1: (this_ExplicitIntent_2= ruleExplicitIntent | this_ImplicitIntent_3= ruleImplicitIntent | this_BroadcastIntent_4= ruleBroadcastIntent | this_ServiceIntent_5= ruleServiceIntent )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt3=1;
                }
                break;
            case 28:
                {
                alt3=2;
                }
                break;
            case 29:
                {
                alt3=3;
                }
                break;
            case 30:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:192:5: this_ExplicitIntent_2= ruleExplicitIntent
                    {
                     
                            newCompositeNode(grammarAccess.getIntentAccess().getExplicitIntentParserRuleCall_2_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleExplicitIntent_in_ruleIntent388);
                    this_ExplicitIntent_2=ruleExplicitIntent();

                    state._fsp--;

                     
                            current = this_ExplicitIntent_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:202:5: this_ImplicitIntent_3= ruleImplicitIntent
                    {
                     
                            newCompositeNode(grammarAccess.getIntentAccess().getImplicitIntentParserRuleCall_2_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleImplicitIntent_in_ruleIntent415);
                    this_ImplicitIntent_3=ruleImplicitIntent();

                    state._fsp--;

                     
                            current = this_ImplicitIntent_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:212:5: this_BroadcastIntent_4= ruleBroadcastIntent
                    {
                     
                            newCompositeNode(grammarAccess.getIntentAccess().getBroadcastIntentParserRuleCall_2_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleBroadcastIntent_in_ruleIntent442);
                    this_BroadcastIntent_4=ruleBroadcastIntent();

                    state._fsp--;

                     
                            current = this_BroadcastIntent_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:222:5: this_ServiceIntent_5= ruleServiceIntent
                    {
                     
                            newCompositeNode(grammarAccess.getIntentAccess().getServiceIntentParserRuleCall_2_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleServiceIntent_in_ruleIntent469);
                    this_ServiceIntent_5=ruleServiceIntent();

                    state._fsp--;

                     
                            current = this_ServiceIntent_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            otherlv_6=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleIntent481); 

                	newLeafNode(otherlv_6, grammarAccess.getIntentAccess().getCommaKeyword_3());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:234:1: ( (otherlv_7= 'Name' otherlv_8= ':' ( (lv_name_9_0= ruleEString ) ) otherlv_10= ',' ) (otherlv_11= 'Action' otherlv_12= ':' ( (lv_action_13_0= ruleEString ) ) otherlv_14= ',' ) (otherlv_15= 'Category' otherlv_16= ':' ( (lv_category_17_0= ruleEString ) ) otherlv_18= ',' )? (otherlv_19= 'Meta-Category' otherlv_20= ':' ( (lv_metaCategory_21_0= ruleEString ) ) otherlv_22= ',' ) (otherlv_23= 'DataURI' otherlv_24= ':' ( (lv_dataURI_25_0= ruleEString ) ) otherlv_26= ',' ) (otherlv_27= 'DataExtra' otherlv_28= ':' otherlv_29= '[' ( (lv_extraData_30_0= ruleExtraData ) ) (otherlv_31= ',' ( (lv_extraData_32_0= ruleExtraData ) ) )* otherlv_33= ']' otherlv_34= ',' )? (otherlv_35= 'ReturnData' otherlv_36= ':' otherlv_37= '[' ( (lv_returnData_38_0= ruleExtraData ) ) (otherlv_39= ',' ( (lv_returnData_40_0= ruleExtraData ) ) )* otherlv_41= ']' otherlv_42= ',' )? )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:234:2: (otherlv_7= 'Name' otherlv_8= ':' ( (lv_name_9_0= ruleEString ) ) otherlv_10= ',' ) (otherlv_11= 'Action' otherlv_12= ':' ( (lv_action_13_0= ruleEString ) ) otherlv_14= ',' ) (otherlv_15= 'Category' otherlv_16= ':' ( (lv_category_17_0= ruleEString ) ) otherlv_18= ',' )? (otherlv_19= 'Meta-Category' otherlv_20= ':' ( (lv_metaCategory_21_0= ruleEString ) ) otherlv_22= ',' ) (otherlv_23= 'DataURI' otherlv_24= ':' ( (lv_dataURI_25_0= ruleEString ) ) otherlv_26= ',' ) (otherlv_27= 'DataExtra' otherlv_28= ':' otherlv_29= '[' ( (lv_extraData_30_0= ruleExtraData ) ) (otherlv_31= ',' ( (lv_extraData_32_0= ruleExtraData ) ) )* otherlv_33= ']' otherlv_34= ',' )? (otherlv_35= 'ReturnData' otherlv_36= ':' otherlv_37= '[' ( (lv_returnData_38_0= ruleExtraData ) ) (otherlv_39= ',' ( (lv_returnData_40_0= ruleExtraData ) ) )* otherlv_41= ']' otherlv_42= ',' )?
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:234:2: (otherlv_7= 'Name' otherlv_8= ':' ( (lv_name_9_0= ruleEString ) ) otherlv_10= ',' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:234:4: otherlv_7= 'Name' otherlv_8= ':' ( (lv_name_9_0= ruleEString ) ) otherlv_10= ','
            {
            otherlv_7=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleIntent495); 

                	newLeafNode(otherlv_7, grammarAccess.getIntentAccess().getNameKeyword_4_0_0());
                
            otherlv_8=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleIntent507); 

                	newLeafNode(otherlv_8, grammarAccess.getIntentAccess().getColonKeyword_4_0_1());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:242:1: ( (lv_name_9_0= ruleEString ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:243:1: (lv_name_9_0= ruleEString )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:243:1: (lv_name_9_0= ruleEString )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:244:3: lv_name_9_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getIntentAccess().getNameEStringParserRuleCall_4_0_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleIntent528);
            lv_name_9_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getIntentRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_9_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_10=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleIntent540); 

                	newLeafNode(otherlv_10, grammarAccess.getIntentAccess().getCommaKeyword_4_0_3());
                

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:264:2: (otherlv_11= 'Action' otherlv_12= ':' ( (lv_action_13_0= ruleEString ) ) otherlv_14= ',' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:264:4: otherlv_11= 'Action' otherlv_12= ':' ( (lv_action_13_0= ruleEString ) ) otherlv_14= ','
            {
            otherlv_11=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleIntent554); 

                	newLeafNode(otherlv_11, grammarAccess.getIntentAccess().getActionKeyword_4_1_0());
                
            otherlv_12=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleIntent566); 

                	newLeafNode(otherlv_12, grammarAccess.getIntentAccess().getColonKeyword_4_1_1());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:272:1: ( (lv_action_13_0= ruleEString ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:273:1: (lv_action_13_0= ruleEString )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:273:1: (lv_action_13_0= ruleEString )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:274:3: lv_action_13_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getIntentAccess().getActionEStringParserRuleCall_4_1_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleIntent587);
            lv_action_13_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getIntentRule());
            	        }
                   		set(
                   			current, 
                   			"action",
                    		lv_action_13_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_14=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleIntent599); 

                	newLeafNode(otherlv_14, grammarAccess.getIntentAccess().getCommaKeyword_4_1_3());
                

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:294:2: (otherlv_15= 'Category' otherlv_16= ':' ( (lv_category_17_0= ruleEString ) ) otherlv_18= ',' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==22) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:294:4: otherlv_15= 'Category' otherlv_16= ':' ( (lv_category_17_0= ruleEString ) ) otherlv_18= ','
                    {
                    otherlv_15=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleIntent613); 

                        	newLeafNode(otherlv_15, grammarAccess.getIntentAccess().getCategoryKeyword_4_2_0());
                        
                    otherlv_16=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleIntent625); 

                        	newLeafNode(otherlv_16, grammarAccess.getIntentAccess().getColonKeyword_4_2_1());
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:302:1: ( (lv_category_17_0= ruleEString ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:303:1: (lv_category_17_0= ruleEString )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:303:1: (lv_category_17_0= ruleEString )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:304:3: lv_category_17_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getIntentAccess().getCategoryEStringParserRuleCall_4_2_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleIntent646);
                    lv_category_17_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getIntentRule());
                    	        }
                           		set(
                           			current, 
                           			"category",
                            		lv_category_17_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_18=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleIntent658); 

                        	newLeafNode(otherlv_18, grammarAccess.getIntentAccess().getCommaKeyword_4_2_3());
                        

                    }
                    break;

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:324:3: (otherlv_19= 'Meta-Category' otherlv_20= ':' ( (lv_metaCategory_21_0= ruleEString ) ) otherlv_22= ',' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:324:5: otherlv_19= 'Meta-Category' otherlv_20= ':' ( (lv_metaCategory_21_0= ruleEString ) ) otherlv_22= ','
            {
            otherlv_19=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleIntent673); 

                	newLeafNode(otherlv_19, grammarAccess.getIntentAccess().getMetaCategoryKeyword_4_3_0());
                
            otherlv_20=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleIntent685); 

                	newLeafNode(otherlv_20, grammarAccess.getIntentAccess().getColonKeyword_4_3_1());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:332:1: ( (lv_metaCategory_21_0= ruleEString ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:333:1: (lv_metaCategory_21_0= ruleEString )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:333:1: (lv_metaCategory_21_0= ruleEString )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:334:3: lv_metaCategory_21_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getIntentAccess().getMetaCategoryEStringParserRuleCall_4_3_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleIntent706);
            lv_metaCategory_21_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getIntentRule());
            	        }
                   		set(
                   			current, 
                   			"metaCategory",
                    		lv_metaCategory_21_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_22=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleIntent718); 

                	newLeafNode(otherlv_22, grammarAccess.getIntentAccess().getCommaKeyword_4_3_3());
                

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:354:2: (otherlv_23= 'DataURI' otherlv_24= ':' ( (lv_dataURI_25_0= ruleEString ) ) otherlv_26= ',' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:354:4: otherlv_23= 'DataURI' otherlv_24= ':' ( (lv_dataURI_25_0= ruleEString ) ) otherlv_26= ','
            {
            otherlv_23=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleIntent732); 

                	newLeafNode(otherlv_23, grammarAccess.getIntentAccess().getDataURIKeyword_4_4_0());
                
            otherlv_24=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleIntent744); 

                	newLeafNode(otherlv_24, grammarAccess.getIntentAccess().getColonKeyword_4_4_1());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:362:1: ( (lv_dataURI_25_0= ruleEString ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:363:1: (lv_dataURI_25_0= ruleEString )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:363:1: (lv_dataURI_25_0= ruleEString )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:364:3: lv_dataURI_25_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getIntentAccess().getDataURIEStringParserRuleCall_4_4_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleIntent765);
            lv_dataURI_25_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getIntentRule());
            	        }
                   		set(
                   			current, 
                   			"dataURI",
                    		lv_dataURI_25_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_26=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleIntent777); 

                	newLeafNode(otherlv_26, grammarAccess.getIntentAccess().getCommaKeyword_4_4_3());
                

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:384:2: (otherlv_27= 'DataExtra' otherlv_28= ':' otherlv_29= '[' ( (lv_extraData_30_0= ruleExtraData ) ) (otherlv_31= ',' ( (lv_extraData_32_0= ruleExtraData ) ) )* otherlv_33= ']' otherlv_34= ',' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==25) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:384:4: otherlv_27= 'DataExtra' otherlv_28= ':' otherlv_29= '[' ( (lv_extraData_30_0= ruleExtraData ) ) (otherlv_31= ',' ( (lv_extraData_32_0= ruleExtraData ) ) )* otherlv_33= ']' otherlv_34= ','
                    {
                    otherlv_27=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleIntent791); 

                        	newLeafNode(otherlv_27, grammarAccess.getIntentAccess().getDataExtraKeyword_4_5_0());
                        
                    otherlv_28=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleIntent803); 

                        	newLeafNode(otherlv_28, grammarAccess.getIntentAccess().getColonKeyword_4_5_1());
                        
                    otherlv_29=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleIntent815); 

                        	newLeafNode(otherlv_29, grammarAccess.getIntentAccess().getLeftSquareBracketKeyword_4_5_2());
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:396:1: ( (lv_extraData_30_0= ruleExtraData ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:397:1: (lv_extraData_30_0= ruleExtraData )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:397:1: (lv_extraData_30_0= ruleExtraData )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:398:3: lv_extraData_30_0= ruleExtraData
                    {
                     
                    	        newCompositeNode(grammarAccess.getIntentAccess().getExtraDataExtraDataParserRuleCall_4_5_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleExtraData_in_ruleIntent836);
                    lv_extraData_30_0=ruleExtraData();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getIntentRule());
                    	        }
                           		add(
                           			current, 
                           			"extraData",
                            		lv_extraData_30_0, 
                            		"ExtraData");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:414:2: (otherlv_31= ',' ( (lv_extraData_32_0= ruleExtraData ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==15) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:414:4: otherlv_31= ',' ( (lv_extraData_32_0= ruleExtraData ) )
                    	    {
                    	    otherlv_31=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleIntent849); 

                    	        	newLeafNode(otherlv_31, grammarAccess.getIntentAccess().getCommaKeyword_4_5_4_0());
                    	        
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:418:1: ( (lv_extraData_32_0= ruleExtraData ) )
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:419:1: (lv_extraData_32_0= ruleExtraData )
                    	    {
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:419:1: (lv_extraData_32_0= ruleExtraData )
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:420:3: lv_extraData_32_0= ruleExtraData
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getIntentAccess().getExtraDataExtraDataParserRuleCall_4_5_4_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleExtraData_in_ruleIntent870);
                    	    lv_extraData_32_0=ruleExtraData();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getIntentRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"extraData",
                    	            		lv_extraData_32_0, 
                    	            		"ExtraData");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    otherlv_33=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleIntent884); 

                        	newLeafNode(otherlv_33, grammarAccess.getIntentAccess().getRightSquareBracketKeyword_4_5_5());
                        
                    otherlv_34=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleIntent896); 

                        	newLeafNode(otherlv_34, grammarAccess.getIntentAccess().getCommaKeyword_4_5_6());
                        

                    }
                    break;

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:444:3: (otherlv_35= 'ReturnData' otherlv_36= ':' otherlv_37= '[' ( (lv_returnData_38_0= ruleExtraData ) ) (otherlv_39= ',' ( (lv_returnData_40_0= ruleExtraData ) ) )* otherlv_41= ']' otherlv_42= ',' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==26) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:444:5: otherlv_35= 'ReturnData' otherlv_36= ':' otherlv_37= '[' ( (lv_returnData_38_0= ruleExtraData ) ) (otherlv_39= ',' ( (lv_returnData_40_0= ruleExtraData ) ) )* otherlv_41= ']' otherlv_42= ','
                    {
                    otherlv_35=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleIntent911); 

                        	newLeafNode(otherlv_35, grammarAccess.getIntentAccess().getReturnDataKeyword_4_6_0());
                        
                    otherlv_36=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleIntent923); 

                        	newLeafNode(otherlv_36, grammarAccess.getIntentAccess().getColonKeyword_4_6_1());
                        
                    otherlv_37=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleIntent935); 

                        	newLeafNode(otherlv_37, grammarAccess.getIntentAccess().getLeftSquareBracketKeyword_4_6_2());
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:456:1: ( (lv_returnData_38_0= ruleExtraData ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:457:1: (lv_returnData_38_0= ruleExtraData )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:457:1: (lv_returnData_38_0= ruleExtraData )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:458:3: lv_returnData_38_0= ruleExtraData
                    {
                     
                    	        newCompositeNode(grammarAccess.getIntentAccess().getReturnDataExtraDataParserRuleCall_4_6_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleExtraData_in_ruleIntent956);
                    lv_returnData_38_0=ruleExtraData();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getIntentRule());
                    	        }
                           		add(
                           			current, 
                           			"returnData",
                            		lv_returnData_38_0, 
                            		"ExtraData");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:474:2: (otherlv_39= ',' ( (lv_returnData_40_0= ruleExtraData ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==15) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:474:4: otherlv_39= ',' ( (lv_returnData_40_0= ruleExtraData ) )
                    	    {
                    	    otherlv_39=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleIntent969); 

                    	        	newLeafNode(otherlv_39, grammarAccess.getIntentAccess().getCommaKeyword_4_6_4_0());
                    	        
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:478:1: ( (lv_returnData_40_0= ruleExtraData ) )
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:479:1: (lv_returnData_40_0= ruleExtraData )
                    	    {
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:479:1: (lv_returnData_40_0= ruleExtraData )
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:480:3: lv_returnData_40_0= ruleExtraData
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getIntentAccess().getReturnDataExtraDataParserRuleCall_4_6_4_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleExtraData_in_ruleIntent990);
                    	    lv_returnData_40_0=ruleExtraData();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getIntentRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"returnData",
                    	            		lv_returnData_40_0, 
                    	            		"ExtraData");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    otherlv_41=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleIntent1004); 

                        	newLeafNode(otherlv_41, grammarAccess.getIntentAccess().getRightSquareBracketKeyword_4_6_5());
                        
                    otherlv_42=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleIntent1016); 

                        	newLeafNode(otherlv_42, grammarAccess.getIntentAccess().getCommaKeyword_4_6_6());
                        

                    }
                    break;

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIntent"


    // $ANTLR start "entryRuleEString"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:512:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:513:2: (iv_ruleEString= ruleEString EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:514:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString1056);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString1067); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:521:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:524:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:525:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:525:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_STRING) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_ID) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:525:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString1107); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:533:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString1133); 

                    		current.merge(this_ID_1);
                        
                     
                        newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleExtraData"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:548:1: entryRuleExtraData returns [EObject current=null] : iv_ruleExtraData= ruleExtraData EOF ;
    public final EObject entryRuleExtraData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtraData = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:549:2: (iv_ruleExtraData= ruleExtraData EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:550:2: iv_ruleExtraData= ruleExtraData EOF
            {
             newCompositeNode(grammarAccess.getExtraDataRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleExtraData_in_entryRuleExtraData1178);
            iv_ruleExtraData=ruleExtraData();

            state._fsp--;

             current =iv_ruleExtraData; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExtraData1188); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExtraData"


    // $ANTLR start "ruleExtraData"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:557:1: ruleExtraData returns [EObject current=null] : ( () otherlv_1= '{' (otherlv_2= 'Name' otherlv_3= ':' ( (lv_name_4_0= ruleEString ) ) ) otherlv_5= ',' (otherlv_6= 'Type' otherlv_7= ':' ( (lv_type_8_0= ruleSimpleTypeEnum ) ) ) otherlv_9= '}' ) ;
    public final EObject ruleExtraData() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_4_0 = null;

        Enumerator lv_type_8_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:560:28: ( ( () otherlv_1= '{' (otherlv_2= 'Name' otherlv_3= ':' ( (lv_name_4_0= ruleEString ) ) ) otherlv_5= ',' (otherlv_6= 'Type' otherlv_7= ':' ( (lv_type_8_0= ruleSimpleTypeEnum ) ) ) otherlv_9= '}' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:561:1: ( () otherlv_1= '{' (otherlv_2= 'Name' otherlv_3= ':' ( (lv_name_4_0= ruleEString ) ) ) otherlv_5= ',' (otherlv_6= 'Type' otherlv_7= ':' ( (lv_type_8_0= ruleSimpleTypeEnum ) ) ) otherlv_9= '}' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:561:1: ( () otherlv_1= '{' (otherlv_2= 'Name' otherlv_3= ':' ( (lv_name_4_0= ruleEString ) ) ) otherlv_5= ',' (otherlv_6= 'Type' otherlv_7= ':' ( (lv_type_8_0= ruleSimpleTypeEnum ) ) ) otherlv_9= '}' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:561:2: () otherlv_1= '{' (otherlv_2= 'Name' otherlv_3= ':' ( (lv_name_4_0= ruleEString ) ) ) otherlv_5= ',' (otherlv_6= 'Type' otherlv_7= ':' ( (lv_type_8_0= ruleSimpleTypeEnum ) ) ) otherlv_9= '}'
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:561:2: ()
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:562:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getExtraDataAccess().getExtraDataAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleExtraData1234); 

                	newLeafNode(otherlv_1, grammarAccess.getExtraDataAccess().getLeftCurlyBracketKeyword_1());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:571:1: (otherlv_2= 'Name' otherlv_3= ':' ( (lv_name_4_0= ruleEString ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:571:3: otherlv_2= 'Name' otherlv_3= ':' ( (lv_name_4_0= ruleEString ) )
            {
            otherlv_2=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleExtraData1247); 

                	newLeafNode(otherlv_2, grammarAccess.getExtraDataAccess().getNameKeyword_2_0());
                
            otherlv_3=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleExtraData1259); 

                	newLeafNode(otherlv_3, grammarAccess.getExtraDataAccess().getColonKeyword_2_1());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:579:1: ( (lv_name_4_0= ruleEString ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:580:1: (lv_name_4_0= ruleEString )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:580:1: (lv_name_4_0= ruleEString )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:581:3: lv_name_4_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getExtraDataAccess().getNameEStringParserRuleCall_2_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleExtraData1280);
            lv_name_4_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getExtraDataRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_4_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

            otherlv_5=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleExtraData1293); 

                	newLeafNode(otherlv_5, grammarAccess.getExtraDataAccess().getCommaKeyword_3());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:601:1: (otherlv_6= 'Type' otherlv_7= ':' ( (lv_type_8_0= ruleSimpleTypeEnum ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:601:3: otherlv_6= 'Type' otherlv_7= ':' ( (lv_type_8_0= ruleSimpleTypeEnum ) )
            {
            otherlv_6=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleExtraData1306); 

                	newLeafNode(otherlv_6, grammarAccess.getExtraDataAccess().getTypeKeyword_4_0());
                
            otherlv_7=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleExtraData1318); 

                	newLeafNode(otherlv_7, grammarAccess.getExtraDataAccess().getColonKeyword_4_1());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:609:1: ( (lv_type_8_0= ruleSimpleTypeEnum ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:610:1: (lv_type_8_0= ruleSimpleTypeEnum )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:610:1: (lv_type_8_0= ruleSimpleTypeEnum )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:611:3: lv_type_8_0= ruleSimpleTypeEnum
            {
             
            	        newCompositeNode(grammarAccess.getExtraDataAccess().getTypeSimpleTypeEnumEnumRuleCall_4_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleSimpleTypeEnum_in_ruleExtraData1339);
            lv_type_8_0=ruleSimpleTypeEnum();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getExtraDataRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_8_0, 
                    		"SimpleTypeEnum");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

            otherlv_9=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleExtraData1352); 

                	newLeafNode(otherlv_9, grammarAccess.getExtraDataAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExtraData"


    // $ANTLR start "entryRuleExplicitIntent"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:639:1: entryRuleExplicitIntent returns [EObject current=null] : iv_ruleExplicitIntent= ruleExplicitIntent EOF ;
    public final EObject entryRuleExplicitIntent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExplicitIntent = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:640:2: (iv_ruleExplicitIntent= ruleExplicitIntent EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:641:2: iv_ruleExplicitIntent= ruleExplicitIntent EOF
            {
             newCompositeNode(grammarAccess.getExplicitIntentRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleExplicitIntent_in_entryRuleExplicitIntent1388);
            iv_ruleExplicitIntent=ruleExplicitIntent();

            state._fsp--;

             current =iv_ruleExplicitIntent; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExplicitIntent1398); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExplicitIntent"


    // $ANTLR start "ruleExplicitIntent"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:648:1: ruleExplicitIntent returns [EObject current=null] : ( () otherlv_1= '\\'ExplicitIntent\\'' ) ;
    public final EObject ruleExplicitIntent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:651:28: ( ( () otherlv_1= '\\'ExplicitIntent\\'' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:652:1: ( () otherlv_1= '\\'ExplicitIntent\\'' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:652:1: ( () otherlv_1= '\\'ExplicitIntent\\'' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:652:2: () otherlv_1= '\\'ExplicitIntent\\''
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:652:2: ()
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:653:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getExplicitIntentAccess().getExplicitIntentAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleExplicitIntent1444); 

                	newLeafNode(otherlv_1, grammarAccess.getExplicitIntentAccess().getExplicitIntentKeyword_1());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExplicitIntent"


    // $ANTLR start "entryRuleImplicitIntent"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:670:1: entryRuleImplicitIntent returns [EObject current=null] : iv_ruleImplicitIntent= ruleImplicitIntent EOF ;
    public final EObject entryRuleImplicitIntent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplicitIntent = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:671:2: (iv_ruleImplicitIntent= ruleImplicitIntent EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:672:2: iv_ruleImplicitIntent= ruleImplicitIntent EOF
            {
             newCompositeNode(grammarAccess.getImplicitIntentRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleImplicitIntent_in_entryRuleImplicitIntent1480);
            iv_ruleImplicitIntent=ruleImplicitIntent();

            state._fsp--;

             current =iv_ruleImplicitIntent; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleImplicitIntent1490); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImplicitIntent"


    // $ANTLR start "ruleImplicitIntent"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:679:1: ruleImplicitIntent returns [EObject current=null] : ( () otherlv_1= '\\'ImplicitIntent\\'' ) ;
    public final EObject ruleImplicitIntent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:682:28: ( ( () otherlv_1= '\\'ImplicitIntent\\'' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:683:1: ( () otherlv_1= '\\'ImplicitIntent\\'' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:683:1: ( () otherlv_1= '\\'ImplicitIntent\\'' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:683:2: () otherlv_1= '\\'ImplicitIntent\\''
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:683:2: ()
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:684:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getImplicitIntentAccess().getImplicitIntentAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleImplicitIntent1536); 

                	newLeafNode(otherlv_1, grammarAccess.getImplicitIntentAccess().getImplicitIntentKeyword_1());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImplicitIntent"


    // $ANTLR start "entryRuleBroadcastIntent"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:701:1: entryRuleBroadcastIntent returns [EObject current=null] : iv_ruleBroadcastIntent= ruleBroadcastIntent EOF ;
    public final EObject entryRuleBroadcastIntent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBroadcastIntent = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:702:2: (iv_ruleBroadcastIntent= ruleBroadcastIntent EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:703:2: iv_ruleBroadcastIntent= ruleBroadcastIntent EOF
            {
             newCompositeNode(grammarAccess.getBroadcastIntentRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBroadcastIntent_in_entryRuleBroadcastIntent1572);
            iv_ruleBroadcastIntent=ruleBroadcastIntent();

            state._fsp--;

             current =iv_ruleBroadcastIntent; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBroadcastIntent1582); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBroadcastIntent"


    // $ANTLR start "ruleBroadcastIntent"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:710:1: ruleBroadcastIntent returns [EObject current=null] : ( () otherlv_1= '\\'BroadcastIntent\\'' ) ;
    public final EObject ruleBroadcastIntent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:713:28: ( ( () otherlv_1= '\\'BroadcastIntent\\'' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:714:1: ( () otherlv_1= '\\'BroadcastIntent\\'' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:714:1: ( () otherlv_1= '\\'BroadcastIntent\\'' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:714:2: () otherlv_1= '\\'BroadcastIntent\\''
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:714:2: ()
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:715:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getBroadcastIntentAccess().getBroadCastIntentAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleBroadcastIntent1628); 

                	newLeafNode(otherlv_1, grammarAccess.getBroadcastIntentAccess().getBroadcastIntentKeyword_1());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBroadcastIntent"


    // $ANTLR start "entryRuleServiceIntent"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:732:1: entryRuleServiceIntent returns [EObject current=null] : iv_ruleServiceIntent= ruleServiceIntent EOF ;
    public final EObject entryRuleServiceIntent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServiceIntent = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:733:2: (iv_ruleServiceIntent= ruleServiceIntent EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:734:2: iv_ruleServiceIntent= ruleServiceIntent EOF
            {
             newCompositeNode(grammarAccess.getServiceIntentRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleServiceIntent_in_entryRuleServiceIntent1664);
            iv_ruleServiceIntent=ruleServiceIntent();

            state._fsp--;

             current =iv_ruleServiceIntent; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleServiceIntent1674); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleServiceIntent"


    // $ANTLR start "ruleServiceIntent"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:741:1: ruleServiceIntent returns [EObject current=null] : ( () otherlv_1= '\\'ServiceIntent\\'' ) ;
    public final EObject ruleServiceIntent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:744:28: ( ( () otherlv_1= '\\'ServiceIntent\\'' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:745:1: ( () otherlv_1= '\\'ServiceIntent\\'' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:745:1: ( () otherlv_1= '\\'ServiceIntent\\'' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:745:2: () otherlv_1= '\\'ServiceIntent\\''
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:745:2: ()
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:746:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getServiceIntentAccess().getServiceIntentAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleServiceIntent1720); 

                	newLeafNode(otherlv_1, grammarAccess.getServiceIntentAccess().getServiceIntentKeyword_1());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleServiceIntent"


    // $ANTLR start "ruleSimpleTypeEnum"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:763:1: ruleSimpleTypeEnum returns [Enumerator current=null] : ( (enumLiteral_0= 'boolean' ) | (enumLiteral_1= 'Bundle' ) | (enumLiteral_2= 'byte' ) | (enumLiteral_3= 'double' ) | (enumLiteral_4= 'float' ) | (enumLiteral_5= 'integer' ) | (enumLiteral_6= 'long' ) | (enumLiteral_7= 'short' ) | (enumLiteral_8= 'String' ) ) ;
    public final Enumerator ruleSimpleTypeEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;

         enterRule(); 
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:765:28: ( ( (enumLiteral_0= 'boolean' ) | (enumLiteral_1= 'Bundle' ) | (enumLiteral_2= 'byte' ) | (enumLiteral_3= 'double' ) | (enumLiteral_4= 'float' ) | (enumLiteral_5= 'integer' ) | (enumLiteral_6= 'long' ) | (enumLiteral_7= 'short' ) | (enumLiteral_8= 'String' ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:766:1: ( (enumLiteral_0= 'boolean' ) | (enumLiteral_1= 'Bundle' ) | (enumLiteral_2= 'byte' ) | (enumLiteral_3= 'double' ) | (enumLiteral_4= 'float' ) | (enumLiteral_5= 'integer' ) | (enumLiteral_6= 'long' ) | (enumLiteral_7= 'short' ) | (enumLiteral_8= 'String' ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:766:1: ( (enumLiteral_0= 'boolean' ) | (enumLiteral_1= 'Bundle' ) | (enumLiteral_2= 'byte' ) | (enumLiteral_3= 'double' ) | (enumLiteral_4= 'float' ) | (enumLiteral_5= 'integer' ) | (enumLiteral_6= 'long' ) | (enumLiteral_7= 'short' ) | (enumLiteral_8= 'String' ) )
            int alt10=9;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt10=1;
                }
                break;
            case 32:
                {
                alt10=2;
                }
                break;
            case 33:
                {
                alt10=3;
                }
                break;
            case 34:
                {
                alt10=4;
                }
                break;
            case 35:
                {
                alt10=5;
                }
                break;
            case 36:
                {
                alt10=6;
                }
                break;
            case 37:
                {
                alt10=7;
                }
                break;
            case 38:
                {
                alt10=8;
                }
                break;
            case 39:
                {
                alt10=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:766:2: (enumLiteral_0= 'boolean' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:766:2: (enumLiteral_0= 'boolean' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:766:4: enumLiteral_0= 'boolean'
                    {
                    enumLiteral_0=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleSimpleTypeEnum1770); 

                            current = grammarAccess.getSimpleTypeEnumAccess().getBOOLEANEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getSimpleTypeEnumAccess().getBOOLEANEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:772:6: (enumLiteral_1= 'Bundle' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:772:6: (enumLiteral_1= 'Bundle' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:772:8: enumLiteral_1= 'Bundle'
                    {
                    enumLiteral_1=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleSimpleTypeEnum1787); 

                            current = grammarAccess.getSimpleTypeEnumAccess().getBUNDLEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getSimpleTypeEnumAccess().getBUNDLEEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:778:6: (enumLiteral_2= 'byte' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:778:6: (enumLiteral_2= 'byte' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:778:8: enumLiteral_2= 'byte'
                    {
                    enumLiteral_2=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleSimpleTypeEnum1804); 

                            current = grammarAccess.getSimpleTypeEnumAccess().getBYTEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getSimpleTypeEnumAccess().getBYTEEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:784:6: (enumLiteral_3= 'double' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:784:6: (enumLiteral_3= 'double' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:784:8: enumLiteral_3= 'double'
                    {
                    enumLiteral_3=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleSimpleTypeEnum1821); 

                            current = grammarAccess.getSimpleTypeEnumAccess().getDOUBLEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getSimpleTypeEnumAccess().getDOUBLEEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:790:6: (enumLiteral_4= 'float' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:790:6: (enumLiteral_4= 'float' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:790:8: enumLiteral_4= 'float'
                    {
                    enumLiteral_4=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleSimpleTypeEnum1838); 

                            current = grammarAccess.getSimpleTypeEnumAccess().getFLOATEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getSimpleTypeEnumAccess().getFLOATEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:796:6: (enumLiteral_5= 'integer' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:796:6: (enumLiteral_5= 'integer' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:796:8: enumLiteral_5= 'integer'
                    {
                    enumLiteral_5=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleSimpleTypeEnum1855); 

                            current = grammarAccess.getSimpleTypeEnumAccess().getINTEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getSimpleTypeEnumAccess().getINTEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:802:6: (enumLiteral_6= 'long' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:802:6: (enumLiteral_6= 'long' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:802:8: enumLiteral_6= 'long'
                    {
                    enumLiteral_6=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleSimpleTypeEnum1872); 

                            current = grammarAccess.getSimpleTypeEnumAccess().getLONGEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_6, grammarAccess.getSimpleTypeEnumAccess().getLONGEnumLiteralDeclaration_6()); 
                        

                    }


                    }
                    break;
                case 8 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:808:6: (enumLiteral_7= 'short' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:808:6: (enumLiteral_7= 'short' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:808:8: enumLiteral_7= 'short'
                    {
                    enumLiteral_7=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleSimpleTypeEnum1889); 

                            current = grammarAccess.getSimpleTypeEnumAccess().getSHORTEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_7, grammarAccess.getSimpleTypeEnumAccess().getSHORTEnumLiteralDeclaration_7()); 
                        

                    }


                    }
                    break;
                case 9 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:814:6: (enumLiteral_8= 'String' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:814:6: (enumLiteral_8= 'String' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:814:8: enumLiteral_8= 'String'
                    {
                    enumLiteral_8=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleSimpleTypeEnum1906); 

                            current = grammarAccess.getSimpleTypeEnumAccess().getSTRINGEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_8, grammarAccess.getSimpleTypeEnumAccess().getSTRINGEnumLiteralDeclaration_8()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSimpleTypeEnum"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleIntentModel_in_entryRuleIntentModel75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIntentModel85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleIntentModel137 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleIntentModel162 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleIntentModel174 = new BitSet(new long[]{0x0000000000024000L});
        public static final BitSet FOLLOW_14_in_ruleIntentModel187 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_ruleIntent_in_ruleIntentModel208 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_ruleIntentModel221 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_ruleIntent_in_ruleIntentModel242 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_ruleIntentModel256 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleIntentModel270 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIntent_in_entryRuleIntent306 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIntent316 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_ruleIntent353 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleIntent365 = new BitSet(new long[]{0x0000000078000000L});
        public static final BitSet FOLLOW_ruleExplicitIntent_in_ruleIntent388 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_ruleImplicitIntent_in_ruleIntent415 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_ruleBroadcastIntent_in_ruleIntent442 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_ruleServiceIntent_in_ruleIntent469 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleIntent481 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleIntent495 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleIntent507 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleIntent528 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleIntent540 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleIntent554 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleIntent566 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleIntent587 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleIntent599 = new BitSet(new long[]{0x0000000000C00000L});
        public static final BitSet FOLLOW_22_in_ruleIntent613 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleIntent625 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleIntent646 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleIntent658 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleIntent673 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleIntent685 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleIntent706 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleIntent718 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleIntent732 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleIntent744 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleIntent765 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleIntent777 = new BitSet(new long[]{0x0000000006000002L});
        public static final BitSet FOLLOW_25_in_ruleIntent791 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleIntent803 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleIntent815 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_ruleExtraData_in_ruleIntent836 = new BitSet(new long[]{0x0000000000028000L});
        public static final BitSet FOLLOW_15_in_ruleIntent849 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_ruleExtraData_in_ruleIntent870 = new BitSet(new long[]{0x0000000000028000L});
        public static final BitSet FOLLOW_17_in_ruleIntent884 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleIntent896 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_26_in_ruleIntent911 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleIntent923 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleIntent935 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_ruleExtraData_in_ruleIntent956 = new BitSet(new long[]{0x0000000000028000L});
        public static final BitSet FOLLOW_15_in_ruleIntent969 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_ruleExtraData_in_ruleIntent990 = new BitSet(new long[]{0x0000000000028000L});
        public static final BitSet FOLLOW_17_in_ruleIntent1004 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleIntent1016 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString1056 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString1067 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString1107 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString1133 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExtraData_in_entryRuleExtraData1178 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExtraData1188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_ruleExtraData1234 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleExtraData1247 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleExtraData1259 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleExtraData1280 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleExtraData1293 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleExtraData1306 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleExtraData1318 = new BitSet(new long[]{0x000000FF80000000L});
        public static final BitSet FOLLOW_ruleSimpleTypeEnum_in_ruleExtraData1339 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleExtraData1352 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExplicitIntent_in_entryRuleExplicitIntent1388 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExplicitIntent1398 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_ruleExplicitIntent1444 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleImplicitIntent_in_entryRuleImplicitIntent1480 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleImplicitIntent1490 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_ruleImplicitIntent1536 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBroadcastIntent_in_entryRuleBroadcastIntent1572 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBroadcastIntent1582 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_ruleBroadcastIntent1628 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleServiceIntent_in_entryRuleServiceIntent1664 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleServiceIntent1674 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_ruleServiceIntent1720 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_ruleSimpleTypeEnum1770 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_ruleSimpleTypeEnum1787 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_ruleSimpleTypeEnum1804 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_ruleSimpleTypeEnum1821 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_ruleSimpleTypeEnum1838 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_ruleSimpleTypeEnum1855 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_ruleSimpleTypeEnum1872 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_ruleSimpleTypeEnum1889 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_ruleSimpleTypeEnum1906 = new BitSet(new long[]{0x0000000000000002L});
    }


}