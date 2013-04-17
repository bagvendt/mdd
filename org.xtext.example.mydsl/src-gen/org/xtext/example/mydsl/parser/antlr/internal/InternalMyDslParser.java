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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Model'", "'='", "'['", "'{'", "'}'", "','", "']'", "'Type'", "':'", "'Name'", "'Action'", "'Category'", "'Meta-Category'", "'DataURI'", "'DataExtra'", "'ReturnData'", "'\\'ExplicitIntent\\''", "'\\'ImplicitIntent\\''", "'\\'BroadcastIntent\\''", "'\\'ServiceIntent\\''", "'boolean'", "'Bundle'", "'byte'", "'double'", "'float'", "'integer'", "'long'", "'short'", "'String'"
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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:77:1: ruleIntentModel returns [EObject current=null] : ( () ( (lv_name_1_0= 'Model' ) ) otherlv_2= '=' otherlv_3= '[' otherlv_4= '{' ( (lv_intents_5_0= ruleIntent ) ) otherlv_6= '}' (otherlv_7= ',' otherlv_8= '{' ( (lv_intents_9_0= ruleIntent ) ) otherlv_10= '}' )* otherlv_11= ']' ) ;
    public final EObject ruleIntentModel() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        EObject lv_intents_5_0 = null;

        EObject lv_intents_9_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:80:28: ( ( () ( (lv_name_1_0= 'Model' ) ) otherlv_2= '=' otherlv_3= '[' otherlv_4= '{' ( (lv_intents_5_0= ruleIntent ) ) otherlv_6= '}' (otherlv_7= ',' otherlv_8= '{' ( (lv_intents_9_0= ruleIntent ) ) otherlv_10= '}' )* otherlv_11= ']' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:81:1: ( () ( (lv_name_1_0= 'Model' ) ) otherlv_2= '=' otherlv_3= '[' otherlv_4= '{' ( (lv_intents_5_0= ruleIntent ) ) otherlv_6= '}' (otherlv_7= ',' otherlv_8= '{' ( (lv_intents_9_0= ruleIntent ) ) otherlv_10= '}' )* otherlv_11= ']' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:81:1: ( () ( (lv_name_1_0= 'Model' ) ) otherlv_2= '=' otherlv_3= '[' otherlv_4= '{' ( (lv_intents_5_0= ruleIntent ) ) otherlv_6= '}' (otherlv_7= ',' otherlv_8= '{' ( (lv_intents_9_0= ruleIntent ) ) otherlv_10= '}' )* otherlv_11= ']' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:81:2: () ( (lv_name_1_0= 'Model' ) ) otherlv_2= '=' otherlv_3= '[' otherlv_4= '{' ( (lv_intents_5_0= ruleIntent ) ) otherlv_6= '}' (otherlv_7= ',' otherlv_8= '{' ( (lv_intents_9_0= ruleIntent ) ) otherlv_10= '}' )* otherlv_11= ']'
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
                
            otherlv_4=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleIntentModel186); 

                	newLeafNode(otherlv_4, grammarAccess.getIntentModelAccess().getLeftCurlyBracketKeyword_4());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:114:1: ( (lv_intents_5_0= ruleIntent ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:115:1: (lv_intents_5_0= ruleIntent )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:115:1: (lv_intents_5_0= ruleIntent )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:116:3: lv_intents_5_0= ruleIntent
            {
             
            	        newCompositeNode(grammarAccess.getIntentModelAccess().getIntentsIntentParserRuleCall_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleIntent_in_ruleIntentModel207);
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

            otherlv_6=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleIntentModel219); 

                	newLeafNode(otherlv_6, grammarAccess.getIntentModelAccess().getRightCurlyBracketKeyword_6());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:136:1: (otherlv_7= ',' otherlv_8= '{' ( (lv_intents_9_0= ruleIntent ) ) otherlv_10= '}' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==16) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:136:3: otherlv_7= ',' otherlv_8= '{' ( (lv_intents_9_0= ruleIntent ) ) otherlv_10= '}'
            	    {
            	    otherlv_7=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleIntentModel232); 

            	        	newLeafNode(otherlv_7, grammarAccess.getIntentModelAccess().getCommaKeyword_7_0());
            	        
            	    otherlv_8=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleIntentModel244); 

            	        	newLeafNode(otherlv_8, grammarAccess.getIntentModelAccess().getLeftCurlyBracketKeyword_7_1());
            	        
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:144:1: ( (lv_intents_9_0= ruleIntent ) )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:145:1: (lv_intents_9_0= ruleIntent )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:145:1: (lv_intents_9_0= ruleIntent )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:146:3: lv_intents_9_0= ruleIntent
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getIntentModelAccess().getIntentsIntentParserRuleCall_7_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleIntent_in_ruleIntentModel265);
            	    lv_intents_9_0=ruleIntent();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getIntentModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"intents",
            	            		lv_intents_9_0, 
            	            		"Intent");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    otherlv_10=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleIntentModel277); 

            	        	newLeafNode(otherlv_10, grammarAccess.getIntentModelAccess().getRightCurlyBracketKeyword_7_3());
            	        

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_11=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleIntentModel291); 

                	newLeafNode(otherlv_11, grammarAccess.getIntentModelAccess().getRightSquareBracketKeyword_8());
                

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:178:1: entryRuleIntent returns [EObject current=null] : iv_ruleIntent= ruleIntent EOF ;
    public final EObject entryRuleIntent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntent = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:179:2: (iv_ruleIntent= ruleIntent EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:180:2: iv_ruleIntent= ruleIntent EOF
            {
             newCompositeNode(grammarAccess.getIntentRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleIntent_in_entryRuleIntent327);
            iv_ruleIntent=ruleIntent();

            state._fsp--;

             current =iv_ruleIntent; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIntent337); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:187:1: ruleIntent returns [EObject current=null] : (otherlv_0= 'Type' otherlv_1= ':' (this_ExplicitIntent_2= ruleExplicitIntent | this_ImplicitIntent_3= ruleImplicitIntent | this_BroadcastIntent_4= ruleBroadcastIntent | this_ServiceIntent_5= ruleServiceIntent ) otherlv_6= ',' ( (otherlv_7= 'Name' otherlv_8= ':' ( (lv_name_9_0= ruleEString ) ) otherlv_10= ',' ) (otherlv_11= 'Action' otherlv_12= ':' ( (lv_action_13_0= ruleEString ) ) otherlv_14= ',' ) (otherlv_15= 'Category' otherlv_16= ':' ( (lv_category_17_0= ruleEString ) ) otherlv_18= ',' )? (otherlv_19= 'Meta-Category' otherlv_20= ':' ( (lv_metaCategory_21_0= ruleEString ) ) otherlv_22= ',' ) (otherlv_23= 'DataURI' otherlv_24= ':' ( (lv_dataURI_25_0= ruleEString ) ) otherlv_26= ',' ) (otherlv_27= 'DataExtra' otherlv_28= ':' otherlv_29= '[' ( (lv_extraData_30_0= ruleExtraData ) ) (otherlv_31= ',' ( (lv_extraData_32_0= ruleExtraData ) ) )* otherlv_33= ']' otherlv_34= ',' )? (otherlv_35= 'ReturnData' otherlv_36= ':' otherlv_37= '[' ( (lv_returnData_38_0= ruleExtraData ) ) (otherlv_39= ',' ( (lv_returnData_40_0= ruleExtraData ) ) )* otherlv_41= ']' )? ) ) ;
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
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:190:28: ( (otherlv_0= 'Type' otherlv_1= ':' (this_ExplicitIntent_2= ruleExplicitIntent | this_ImplicitIntent_3= ruleImplicitIntent | this_BroadcastIntent_4= ruleBroadcastIntent | this_ServiceIntent_5= ruleServiceIntent ) otherlv_6= ',' ( (otherlv_7= 'Name' otherlv_8= ':' ( (lv_name_9_0= ruleEString ) ) otherlv_10= ',' ) (otherlv_11= 'Action' otherlv_12= ':' ( (lv_action_13_0= ruleEString ) ) otherlv_14= ',' ) (otherlv_15= 'Category' otherlv_16= ':' ( (lv_category_17_0= ruleEString ) ) otherlv_18= ',' )? (otherlv_19= 'Meta-Category' otherlv_20= ':' ( (lv_metaCategory_21_0= ruleEString ) ) otherlv_22= ',' ) (otherlv_23= 'DataURI' otherlv_24= ':' ( (lv_dataURI_25_0= ruleEString ) ) otherlv_26= ',' ) (otherlv_27= 'DataExtra' otherlv_28= ':' otherlv_29= '[' ( (lv_extraData_30_0= ruleExtraData ) ) (otherlv_31= ',' ( (lv_extraData_32_0= ruleExtraData ) ) )* otherlv_33= ']' otherlv_34= ',' )? (otherlv_35= 'ReturnData' otherlv_36= ':' otherlv_37= '[' ( (lv_returnData_38_0= ruleExtraData ) ) (otherlv_39= ',' ( (lv_returnData_40_0= ruleExtraData ) ) )* otherlv_41= ']' )? ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:191:1: (otherlv_0= 'Type' otherlv_1= ':' (this_ExplicitIntent_2= ruleExplicitIntent | this_ImplicitIntent_3= ruleImplicitIntent | this_BroadcastIntent_4= ruleBroadcastIntent | this_ServiceIntent_5= ruleServiceIntent ) otherlv_6= ',' ( (otherlv_7= 'Name' otherlv_8= ':' ( (lv_name_9_0= ruleEString ) ) otherlv_10= ',' ) (otherlv_11= 'Action' otherlv_12= ':' ( (lv_action_13_0= ruleEString ) ) otherlv_14= ',' ) (otherlv_15= 'Category' otherlv_16= ':' ( (lv_category_17_0= ruleEString ) ) otherlv_18= ',' )? (otherlv_19= 'Meta-Category' otherlv_20= ':' ( (lv_metaCategory_21_0= ruleEString ) ) otherlv_22= ',' ) (otherlv_23= 'DataURI' otherlv_24= ':' ( (lv_dataURI_25_0= ruleEString ) ) otherlv_26= ',' ) (otherlv_27= 'DataExtra' otherlv_28= ':' otherlv_29= '[' ( (lv_extraData_30_0= ruleExtraData ) ) (otherlv_31= ',' ( (lv_extraData_32_0= ruleExtraData ) ) )* otherlv_33= ']' otherlv_34= ',' )? (otherlv_35= 'ReturnData' otherlv_36= ':' otherlv_37= '[' ( (lv_returnData_38_0= ruleExtraData ) ) (otherlv_39= ',' ( (lv_returnData_40_0= ruleExtraData ) ) )* otherlv_41= ']' )? ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:191:1: (otherlv_0= 'Type' otherlv_1= ':' (this_ExplicitIntent_2= ruleExplicitIntent | this_ImplicitIntent_3= ruleImplicitIntent | this_BroadcastIntent_4= ruleBroadcastIntent | this_ServiceIntent_5= ruleServiceIntent ) otherlv_6= ',' ( (otherlv_7= 'Name' otherlv_8= ':' ( (lv_name_9_0= ruleEString ) ) otherlv_10= ',' ) (otherlv_11= 'Action' otherlv_12= ':' ( (lv_action_13_0= ruleEString ) ) otherlv_14= ',' ) (otherlv_15= 'Category' otherlv_16= ':' ( (lv_category_17_0= ruleEString ) ) otherlv_18= ',' )? (otherlv_19= 'Meta-Category' otherlv_20= ':' ( (lv_metaCategory_21_0= ruleEString ) ) otherlv_22= ',' ) (otherlv_23= 'DataURI' otherlv_24= ':' ( (lv_dataURI_25_0= ruleEString ) ) otherlv_26= ',' ) (otherlv_27= 'DataExtra' otherlv_28= ':' otherlv_29= '[' ( (lv_extraData_30_0= ruleExtraData ) ) (otherlv_31= ',' ( (lv_extraData_32_0= ruleExtraData ) ) )* otherlv_33= ']' otherlv_34= ',' )? (otherlv_35= 'ReturnData' otherlv_36= ':' otherlv_37= '[' ( (lv_returnData_38_0= ruleExtraData ) ) (otherlv_39= ',' ( (lv_returnData_40_0= ruleExtraData ) ) )* otherlv_41= ']' )? ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:191:3: otherlv_0= 'Type' otherlv_1= ':' (this_ExplicitIntent_2= ruleExplicitIntent | this_ImplicitIntent_3= ruleImplicitIntent | this_BroadcastIntent_4= ruleBroadcastIntent | this_ServiceIntent_5= ruleServiceIntent ) otherlv_6= ',' ( (otherlv_7= 'Name' otherlv_8= ':' ( (lv_name_9_0= ruleEString ) ) otherlv_10= ',' ) (otherlv_11= 'Action' otherlv_12= ':' ( (lv_action_13_0= ruleEString ) ) otherlv_14= ',' ) (otherlv_15= 'Category' otherlv_16= ':' ( (lv_category_17_0= ruleEString ) ) otherlv_18= ',' )? (otherlv_19= 'Meta-Category' otherlv_20= ':' ( (lv_metaCategory_21_0= ruleEString ) ) otherlv_22= ',' ) (otherlv_23= 'DataURI' otherlv_24= ':' ( (lv_dataURI_25_0= ruleEString ) ) otherlv_26= ',' ) (otherlv_27= 'DataExtra' otherlv_28= ':' otherlv_29= '[' ( (lv_extraData_30_0= ruleExtraData ) ) (otherlv_31= ',' ( (lv_extraData_32_0= ruleExtraData ) ) )* otherlv_33= ']' otherlv_34= ',' )? (otherlv_35= 'ReturnData' otherlv_36= ':' otherlv_37= '[' ( (lv_returnData_38_0= ruleExtraData ) ) (otherlv_39= ',' ( (lv_returnData_40_0= ruleExtraData ) ) )* otherlv_41= ']' )? )
            {
            otherlv_0=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleIntent374); 

                	newLeafNode(otherlv_0, grammarAccess.getIntentAccess().getTypeKeyword_0());
                
            otherlv_1=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleIntent386); 

                	newLeafNode(otherlv_1, grammarAccess.getIntentAccess().getColonKeyword_1());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:199:1: (this_ExplicitIntent_2= ruleExplicitIntent | this_ImplicitIntent_3= ruleImplicitIntent | this_BroadcastIntent_4= ruleBroadcastIntent | this_ServiceIntent_5= ruleServiceIntent )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt2=1;
                }
                break;
            case 28:
                {
                alt2=2;
                }
                break;
            case 29:
                {
                alt2=3;
                }
                break;
            case 30:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:200:5: this_ExplicitIntent_2= ruleExplicitIntent
                    {
                     
                            newCompositeNode(grammarAccess.getIntentAccess().getExplicitIntentParserRuleCall_2_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleExplicitIntent_in_ruleIntent409);
                    this_ExplicitIntent_2=ruleExplicitIntent();

                    state._fsp--;

                     
                            current = this_ExplicitIntent_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:210:5: this_ImplicitIntent_3= ruleImplicitIntent
                    {
                     
                            newCompositeNode(grammarAccess.getIntentAccess().getImplicitIntentParserRuleCall_2_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleImplicitIntent_in_ruleIntent436);
                    this_ImplicitIntent_3=ruleImplicitIntent();

                    state._fsp--;

                     
                            current = this_ImplicitIntent_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:220:5: this_BroadcastIntent_4= ruleBroadcastIntent
                    {
                     
                            newCompositeNode(grammarAccess.getIntentAccess().getBroadcastIntentParserRuleCall_2_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleBroadcastIntent_in_ruleIntent463);
                    this_BroadcastIntent_4=ruleBroadcastIntent();

                    state._fsp--;

                     
                            current = this_BroadcastIntent_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:230:5: this_ServiceIntent_5= ruleServiceIntent
                    {
                     
                            newCompositeNode(grammarAccess.getIntentAccess().getServiceIntentParserRuleCall_2_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleServiceIntent_in_ruleIntent490);
                    this_ServiceIntent_5=ruleServiceIntent();

                    state._fsp--;

                     
                            current = this_ServiceIntent_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            otherlv_6=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleIntent502); 

                	newLeafNode(otherlv_6, grammarAccess.getIntentAccess().getCommaKeyword_3());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:242:1: ( (otherlv_7= 'Name' otherlv_8= ':' ( (lv_name_9_0= ruleEString ) ) otherlv_10= ',' ) (otherlv_11= 'Action' otherlv_12= ':' ( (lv_action_13_0= ruleEString ) ) otherlv_14= ',' ) (otherlv_15= 'Category' otherlv_16= ':' ( (lv_category_17_0= ruleEString ) ) otherlv_18= ',' )? (otherlv_19= 'Meta-Category' otherlv_20= ':' ( (lv_metaCategory_21_0= ruleEString ) ) otherlv_22= ',' ) (otherlv_23= 'DataURI' otherlv_24= ':' ( (lv_dataURI_25_0= ruleEString ) ) otherlv_26= ',' ) (otherlv_27= 'DataExtra' otherlv_28= ':' otherlv_29= '[' ( (lv_extraData_30_0= ruleExtraData ) ) (otherlv_31= ',' ( (lv_extraData_32_0= ruleExtraData ) ) )* otherlv_33= ']' otherlv_34= ',' )? (otherlv_35= 'ReturnData' otherlv_36= ':' otherlv_37= '[' ( (lv_returnData_38_0= ruleExtraData ) ) (otherlv_39= ',' ( (lv_returnData_40_0= ruleExtraData ) ) )* otherlv_41= ']' )? )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:242:2: (otherlv_7= 'Name' otherlv_8= ':' ( (lv_name_9_0= ruleEString ) ) otherlv_10= ',' ) (otherlv_11= 'Action' otherlv_12= ':' ( (lv_action_13_0= ruleEString ) ) otherlv_14= ',' ) (otherlv_15= 'Category' otherlv_16= ':' ( (lv_category_17_0= ruleEString ) ) otherlv_18= ',' )? (otherlv_19= 'Meta-Category' otherlv_20= ':' ( (lv_metaCategory_21_0= ruleEString ) ) otherlv_22= ',' ) (otherlv_23= 'DataURI' otherlv_24= ':' ( (lv_dataURI_25_0= ruleEString ) ) otherlv_26= ',' ) (otherlv_27= 'DataExtra' otherlv_28= ':' otherlv_29= '[' ( (lv_extraData_30_0= ruleExtraData ) ) (otherlv_31= ',' ( (lv_extraData_32_0= ruleExtraData ) ) )* otherlv_33= ']' otherlv_34= ',' )? (otherlv_35= 'ReturnData' otherlv_36= ':' otherlv_37= '[' ( (lv_returnData_38_0= ruleExtraData ) ) (otherlv_39= ',' ( (lv_returnData_40_0= ruleExtraData ) ) )* otherlv_41= ']' )?
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:242:2: (otherlv_7= 'Name' otherlv_8= ':' ( (lv_name_9_0= ruleEString ) ) otherlv_10= ',' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:242:4: otherlv_7= 'Name' otherlv_8= ':' ( (lv_name_9_0= ruleEString ) ) otherlv_10= ','
            {
            otherlv_7=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleIntent516); 

                	newLeafNode(otherlv_7, grammarAccess.getIntentAccess().getNameKeyword_4_0_0());
                
            otherlv_8=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleIntent528); 

                	newLeafNode(otherlv_8, grammarAccess.getIntentAccess().getColonKeyword_4_0_1());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:250:1: ( (lv_name_9_0= ruleEString ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:251:1: (lv_name_9_0= ruleEString )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:251:1: (lv_name_9_0= ruleEString )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:252:3: lv_name_9_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getIntentAccess().getNameEStringParserRuleCall_4_0_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleIntent549);
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

            otherlv_10=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleIntent561); 

                	newLeafNode(otherlv_10, grammarAccess.getIntentAccess().getCommaKeyword_4_0_3());
                

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:272:2: (otherlv_11= 'Action' otherlv_12= ':' ( (lv_action_13_0= ruleEString ) ) otherlv_14= ',' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:272:4: otherlv_11= 'Action' otherlv_12= ':' ( (lv_action_13_0= ruleEString ) ) otherlv_14= ','
            {
            otherlv_11=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleIntent575); 

                	newLeafNode(otherlv_11, grammarAccess.getIntentAccess().getActionKeyword_4_1_0());
                
            otherlv_12=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleIntent587); 

                	newLeafNode(otherlv_12, grammarAccess.getIntentAccess().getColonKeyword_4_1_1());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:280:1: ( (lv_action_13_0= ruleEString ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:281:1: (lv_action_13_0= ruleEString )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:281:1: (lv_action_13_0= ruleEString )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:282:3: lv_action_13_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getIntentAccess().getActionEStringParserRuleCall_4_1_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleIntent608);
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

            otherlv_14=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleIntent620); 

                	newLeafNode(otherlv_14, grammarAccess.getIntentAccess().getCommaKeyword_4_1_3());
                

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:302:2: (otherlv_15= 'Category' otherlv_16= ':' ( (lv_category_17_0= ruleEString ) ) otherlv_18= ',' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==22) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:302:4: otherlv_15= 'Category' otherlv_16= ':' ( (lv_category_17_0= ruleEString ) ) otherlv_18= ','
                    {
                    otherlv_15=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleIntent634); 

                        	newLeafNode(otherlv_15, grammarAccess.getIntentAccess().getCategoryKeyword_4_2_0());
                        
                    otherlv_16=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleIntent646); 

                        	newLeafNode(otherlv_16, grammarAccess.getIntentAccess().getColonKeyword_4_2_1());
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:310:1: ( (lv_category_17_0= ruleEString ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:311:1: (lv_category_17_0= ruleEString )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:311:1: (lv_category_17_0= ruleEString )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:312:3: lv_category_17_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getIntentAccess().getCategoryEStringParserRuleCall_4_2_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleIntent667);
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

                    otherlv_18=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleIntent679); 

                        	newLeafNode(otherlv_18, grammarAccess.getIntentAccess().getCommaKeyword_4_2_3());
                        

                    }
                    break;

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:332:3: (otherlv_19= 'Meta-Category' otherlv_20= ':' ( (lv_metaCategory_21_0= ruleEString ) ) otherlv_22= ',' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:332:5: otherlv_19= 'Meta-Category' otherlv_20= ':' ( (lv_metaCategory_21_0= ruleEString ) ) otherlv_22= ','
            {
            otherlv_19=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleIntent694); 

                	newLeafNode(otherlv_19, grammarAccess.getIntentAccess().getMetaCategoryKeyword_4_3_0());
                
            otherlv_20=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleIntent706); 

                	newLeafNode(otherlv_20, grammarAccess.getIntentAccess().getColonKeyword_4_3_1());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:340:1: ( (lv_metaCategory_21_0= ruleEString ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:341:1: (lv_metaCategory_21_0= ruleEString )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:341:1: (lv_metaCategory_21_0= ruleEString )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:342:3: lv_metaCategory_21_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getIntentAccess().getMetaCategoryEStringParserRuleCall_4_3_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleIntent727);
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

            otherlv_22=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleIntent739); 

                	newLeafNode(otherlv_22, grammarAccess.getIntentAccess().getCommaKeyword_4_3_3());
                

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:362:2: (otherlv_23= 'DataURI' otherlv_24= ':' ( (lv_dataURI_25_0= ruleEString ) ) otherlv_26= ',' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:362:4: otherlv_23= 'DataURI' otherlv_24= ':' ( (lv_dataURI_25_0= ruleEString ) ) otherlv_26= ','
            {
            otherlv_23=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleIntent753); 

                	newLeafNode(otherlv_23, grammarAccess.getIntentAccess().getDataURIKeyword_4_4_0());
                
            otherlv_24=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleIntent765); 

                	newLeafNode(otherlv_24, grammarAccess.getIntentAccess().getColonKeyword_4_4_1());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:370:1: ( (lv_dataURI_25_0= ruleEString ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:371:1: (lv_dataURI_25_0= ruleEString )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:371:1: (lv_dataURI_25_0= ruleEString )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:372:3: lv_dataURI_25_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getIntentAccess().getDataURIEStringParserRuleCall_4_4_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleIntent786);
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

            otherlv_26=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleIntent798); 

                	newLeafNode(otherlv_26, grammarAccess.getIntentAccess().getCommaKeyword_4_4_3());
                

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:392:2: (otherlv_27= 'DataExtra' otherlv_28= ':' otherlv_29= '[' ( (lv_extraData_30_0= ruleExtraData ) ) (otherlv_31= ',' ( (lv_extraData_32_0= ruleExtraData ) ) )* otherlv_33= ']' otherlv_34= ',' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==25) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:392:4: otherlv_27= 'DataExtra' otherlv_28= ':' otherlv_29= '[' ( (lv_extraData_30_0= ruleExtraData ) ) (otherlv_31= ',' ( (lv_extraData_32_0= ruleExtraData ) ) )* otherlv_33= ']' otherlv_34= ','
                    {
                    otherlv_27=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleIntent812); 

                        	newLeafNode(otherlv_27, grammarAccess.getIntentAccess().getDataExtraKeyword_4_5_0());
                        
                    otherlv_28=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleIntent824); 

                        	newLeafNode(otherlv_28, grammarAccess.getIntentAccess().getColonKeyword_4_5_1());
                        
                    otherlv_29=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleIntent836); 

                        	newLeafNode(otherlv_29, grammarAccess.getIntentAccess().getLeftSquareBracketKeyword_4_5_2());
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:404:1: ( (lv_extraData_30_0= ruleExtraData ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:405:1: (lv_extraData_30_0= ruleExtraData )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:405:1: (lv_extraData_30_0= ruleExtraData )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:406:3: lv_extraData_30_0= ruleExtraData
                    {
                     
                    	        newCompositeNode(grammarAccess.getIntentAccess().getExtraDataExtraDataParserRuleCall_4_5_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleExtraData_in_ruleIntent857);
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

                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:422:2: (otherlv_31= ',' ( (lv_extraData_32_0= ruleExtraData ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==16) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:422:4: otherlv_31= ',' ( (lv_extraData_32_0= ruleExtraData ) )
                    	    {
                    	    otherlv_31=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleIntent870); 

                    	        	newLeafNode(otherlv_31, grammarAccess.getIntentAccess().getCommaKeyword_4_5_4_0());
                    	        
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:426:1: ( (lv_extraData_32_0= ruleExtraData ) )
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:427:1: (lv_extraData_32_0= ruleExtraData )
                    	    {
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:427:1: (lv_extraData_32_0= ruleExtraData )
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:428:3: lv_extraData_32_0= ruleExtraData
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getIntentAccess().getExtraDataExtraDataParserRuleCall_4_5_4_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleExtraData_in_ruleIntent891);
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
                    	    break loop4;
                        }
                    } while (true);

                    otherlv_33=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleIntent905); 

                        	newLeafNode(otherlv_33, grammarAccess.getIntentAccess().getRightSquareBracketKeyword_4_5_5());
                        
                    otherlv_34=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleIntent917); 

                        	newLeafNode(otherlv_34, grammarAccess.getIntentAccess().getCommaKeyword_4_5_6());
                        

                    }
                    break;

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:452:3: (otherlv_35= 'ReturnData' otherlv_36= ':' otherlv_37= '[' ( (lv_returnData_38_0= ruleExtraData ) ) (otherlv_39= ',' ( (lv_returnData_40_0= ruleExtraData ) ) )* otherlv_41= ']' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==26) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:452:5: otherlv_35= 'ReturnData' otherlv_36= ':' otherlv_37= '[' ( (lv_returnData_38_0= ruleExtraData ) ) (otherlv_39= ',' ( (lv_returnData_40_0= ruleExtraData ) ) )* otherlv_41= ']'
                    {
                    otherlv_35=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleIntent932); 

                        	newLeafNode(otherlv_35, grammarAccess.getIntentAccess().getReturnDataKeyword_4_6_0());
                        
                    otherlv_36=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleIntent944); 

                        	newLeafNode(otherlv_36, grammarAccess.getIntentAccess().getColonKeyword_4_6_1());
                        
                    otherlv_37=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleIntent956); 

                        	newLeafNode(otherlv_37, grammarAccess.getIntentAccess().getLeftSquareBracketKeyword_4_6_2());
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:464:1: ( (lv_returnData_38_0= ruleExtraData ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:465:1: (lv_returnData_38_0= ruleExtraData )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:465:1: (lv_returnData_38_0= ruleExtraData )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:466:3: lv_returnData_38_0= ruleExtraData
                    {
                     
                    	        newCompositeNode(grammarAccess.getIntentAccess().getReturnDataExtraDataParserRuleCall_4_6_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleExtraData_in_ruleIntent977);
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

                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:482:2: (otherlv_39= ',' ( (lv_returnData_40_0= ruleExtraData ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==16) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:482:4: otherlv_39= ',' ( (lv_returnData_40_0= ruleExtraData ) )
                    	    {
                    	    otherlv_39=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleIntent990); 

                    	        	newLeafNode(otherlv_39, grammarAccess.getIntentAccess().getCommaKeyword_4_6_4_0());
                    	        
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:486:1: ( (lv_returnData_40_0= ruleExtraData ) )
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:487:1: (lv_returnData_40_0= ruleExtraData )
                    	    {
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:487:1: (lv_returnData_40_0= ruleExtraData )
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:488:3: lv_returnData_40_0= ruleExtraData
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getIntentAccess().getReturnDataExtraDataParserRuleCall_4_6_4_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleExtraData_in_ruleIntent1011);
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
                    	    break loop6;
                        }
                    } while (true);

                    otherlv_41=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleIntent1025); 

                        	newLeafNode(otherlv_41, grammarAccess.getIntentAccess().getRightSquareBracketKeyword_4_6_5());
                        

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:516:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:517:2: (iv_ruleEString= ruleEString EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:518:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString1065);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString1076); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:525:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:528:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:529:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:529:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_STRING) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_ID) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:529:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString1116); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:537:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString1142); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:552:1: entryRuleExtraData returns [EObject current=null] : iv_ruleExtraData= ruleExtraData EOF ;
    public final EObject entryRuleExtraData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtraData = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:553:2: (iv_ruleExtraData= ruleExtraData EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:554:2: iv_ruleExtraData= ruleExtraData EOF
            {
             newCompositeNode(grammarAccess.getExtraDataRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleExtraData_in_entryRuleExtraData1187);
            iv_ruleExtraData=ruleExtraData();

            state._fsp--;

             current =iv_ruleExtraData; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExtraData1197); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:561:1: ruleExtraData returns [EObject current=null] : ( () otherlv_1= '{' (otherlv_2= 'Name' otherlv_3= ':' ( (lv_name_4_0= ruleEString ) ) ) otherlv_5= ',' (otherlv_6= 'Type' otherlv_7= ':' ( (lv_type_8_0= ruleSimpleTypeEnum ) ) ) otherlv_9= '}' ) ;
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
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:564:28: ( ( () otherlv_1= '{' (otherlv_2= 'Name' otherlv_3= ':' ( (lv_name_4_0= ruleEString ) ) ) otherlv_5= ',' (otherlv_6= 'Type' otherlv_7= ':' ( (lv_type_8_0= ruleSimpleTypeEnum ) ) ) otherlv_9= '}' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:565:1: ( () otherlv_1= '{' (otherlv_2= 'Name' otherlv_3= ':' ( (lv_name_4_0= ruleEString ) ) ) otherlv_5= ',' (otherlv_6= 'Type' otherlv_7= ':' ( (lv_type_8_0= ruleSimpleTypeEnum ) ) ) otherlv_9= '}' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:565:1: ( () otherlv_1= '{' (otherlv_2= 'Name' otherlv_3= ':' ( (lv_name_4_0= ruleEString ) ) ) otherlv_5= ',' (otherlv_6= 'Type' otherlv_7= ':' ( (lv_type_8_0= ruleSimpleTypeEnum ) ) ) otherlv_9= '}' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:565:2: () otherlv_1= '{' (otherlv_2= 'Name' otherlv_3= ':' ( (lv_name_4_0= ruleEString ) ) ) otherlv_5= ',' (otherlv_6= 'Type' otherlv_7= ':' ( (lv_type_8_0= ruleSimpleTypeEnum ) ) ) otherlv_9= '}'
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:565:2: ()
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:566:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getExtraDataAccess().getExtraDataAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleExtraData1243); 

                	newLeafNode(otherlv_1, grammarAccess.getExtraDataAccess().getLeftCurlyBracketKeyword_1());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:575:1: (otherlv_2= 'Name' otherlv_3= ':' ( (lv_name_4_0= ruleEString ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:575:3: otherlv_2= 'Name' otherlv_3= ':' ( (lv_name_4_0= ruleEString ) )
            {
            otherlv_2=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleExtraData1256); 

                	newLeafNode(otherlv_2, grammarAccess.getExtraDataAccess().getNameKeyword_2_0());
                
            otherlv_3=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleExtraData1268); 

                	newLeafNode(otherlv_3, grammarAccess.getExtraDataAccess().getColonKeyword_2_1());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:583:1: ( (lv_name_4_0= ruleEString ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:584:1: (lv_name_4_0= ruleEString )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:584:1: (lv_name_4_0= ruleEString )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:585:3: lv_name_4_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getExtraDataAccess().getNameEStringParserRuleCall_2_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleExtraData1289);
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

            otherlv_5=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleExtraData1302); 

                	newLeafNode(otherlv_5, grammarAccess.getExtraDataAccess().getCommaKeyword_3());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:605:1: (otherlv_6= 'Type' otherlv_7= ':' ( (lv_type_8_0= ruleSimpleTypeEnum ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:605:3: otherlv_6= 'Type' otherlv_7= ':' ( (lv_type_8_0= ruleSimpleTypeEnum ) )
            {
            otherlv_6=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleExtraData1315); 

                	newLeafNode(otherlv_6, grammarAccess.getExtraDataAccess().getTypeKeyword_4_0());
                
            otherlv_7=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleExtraData1327); 

                	newLeafNode(otherlv_7, grammarAccess.getExtraDataAccess().getColonKeyword_4_1());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:613:1: ( (lv_type_8_0= ruleSimpleTypeEnum ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:614:1: (lv_type_8_0= ruleSimpleTypeEnum )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:614:1: (lv_type_8_0= ruleSimpleTypeEnum )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:615:3: lv_type_8_0= ruleSimpleTypeEnum
            {
             
            	        newCompositeNode(grammarAccess.getExtraDataAccess().getTypeSimpleTypeEnumEnumRuleCall_4_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleSimpleTypeEnum_in_ruleExtraData1348);
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

            otherlv_9=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleExtraData1361); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:643:1: entryRuleExplicitIntent returns [EObject current=null] : iv_ruleExplicitIntent= ruleExplicitIntent EOF ;
    public final EObject entryRuleExplicitIntent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExplicitIntent = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:644:2: (iv_ruleExplicitIntent= ruleExplicitIntent EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:645:2: iv_ruleExplicitIntent= ruleExplicitIntent EOF
            {
             newCompositeNode(grammarAccess.getExplicitIntentRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleExplicitIntent_in_entryRuleExplicitIntent1397);
            iv_ruleExplicitIntent=ruleExplicitIntent();

            state._fsp--;

             current =iv_ruleExplicitIntent; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExplicitIntent1407); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:652:1: ruleExplicitIntent returns [EObject current=null] : ( () otherlv_1= '\\'ExplicitIntent\\'' ) ;
    public final EObject ruleExplicitIntent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:655:28: ( ( () otherlv_1= '\\'ExplicitIntent\\'' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:656:1: ( () otherlv_1= '\\'ExplicitIntent\\'' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:656:1: ( () otherlv_1= '\\'ExplicitIntent\\'' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:656:2: () otherlv_1= '\\'ExplicitIntent\\''
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:656:2: ()
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:657:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getExplicitIntentAccess().getExplicitIntentAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleExplicitIntent1453); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:674:1: entryRuleImplicitIntent returns [EObject current=null] : iv_ruleImplicitIntent= ruleImplicitIntent EOF ;
    public final EObject entryRuleImplicitIntent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplicitIntent = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:675:2: (iv_ruleImplicitIntent= ruleImplicitIntent EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:676:2: iv_ruleImplicitIntent= ruleImplicitIntent EOF
            {
             newCompositeNode(grammarAccess.getImplicitIntentRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleImplicitIntent_in_entryRuleImplicitIntent1489);
            iv_ruleImplicitIntent=ruleImplicitIntent();

            state._fsp--;

             current =iv_ruleImplicitIntent; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleImplicitIntent1499); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:683:1: ruleImplicitIntent returns [EObject current=null] : ( () otherlv_1= '\\'ImplicitIntent\\'' ) ;
    public final EObject ruleImplicitIntent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:686:28: ( ( () otherlv_1= '\\'ImplicitIntent\\'' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:687:1: ( () otherlv_1= '\\'ImplicitIntent\\'' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:687:1: ( () otherlv_1= '\\'ImplicitIntent\\'' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:687:2: () otherlv_1= '\\'ImplicitIntent\\''
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:687:2: ()
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:688:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getImplicitIntentAccess().getImplicitIntentAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleImplicitIntent1545); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:705:1: entryRuleBroadcastIntent returns [EObject current=null] : iv_ruleBroadcastIntent= ruleBroadcastIntent EOF ;
    public final EObject entryRuleBroadcastIntent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBroadcastIntent = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:706:2: (iv_ruleBroadcastIntent= ruleBroadcastIntent EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:707:2: iv_ruleBroadcastIntent= ruleBroadcastIntent EOF
            {
             newCompositeNode(grammarAccess.getBroadcastIntentRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBroadcastIntent_in_entryRuleBroadcastIntent1581);
            iv_ruleBroadcastIntent=ruleBroadcastIntent();

            state._fsp--;

             current =iv_ruleBroadcastIntent; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBroadcastIntent1591); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:714:1: ruleBroadcastIntent returns [EObject current=null] : ( () otherlv_1= '\\'BroadcastIntent\\'' ) ;
    public final EObject ruleBroadcastIntent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:717:28: ( ( () otherlv_1= '\\'BroadcastIntent\\'' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:718:1: ( () otherlv_1= '\\'BroadcastIntent\\'' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:718:1: ( () otherlv_1= '\\'BroadcastIntent\\'' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:718:2: () otherlv_1= '\\'BroadcastIntent\\''
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:718:2: ()
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:719:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getBroadcastIntentAccess().getBroadCastIntentAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleBroadcastIntent1637); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:736:1: entryRuleServiceIntent returns [EObject current=null] : iv_ruleServiceIntent= ruleServiceIntent EOF ;
    public final EObject entryRuleServiceIntent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServiceIntent = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:737:2: (iv_ruleServiceIntent= ruleServiceIntent EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:738:2: iv_ruleServiceIntent= ruleServiceIntent EOF
            {
             newCompositeNode(grammarAccess.getServiceIntentRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleServiceIntent_in_entryRuleServiceIntent1673);
            iv_ruleServiceIntent=ruleServiceIntent();

            state._fsp--;

             current =iv_ruleServiceIntent; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleServiceIntent1683); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:745:1: ruleServiceIntent returns [EObject current=null] : ( () otherlv_1= '\\'ServiceIntent\\'' ) ;
    public final EObject ruleServiceIntent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:748:28: ( ( () otherlv_1= '\\'ServiceIntent\\'' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:749:1: ( () otherlv_1= '\\'ServiceIntent\\'' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:749:1: ( () otherlv_1= '\\'ServiceIntent\\'' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:749:2: () otherlv_1= '\\'ServiceIntent\\''
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:749:2: ()
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:750:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getServiceIntentAccess().getServiceIntentAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleServiceIntent1729); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:767:1: ruleSimpleTypeEnum returns [Enumerator current=null] : ( (enumLiteral_0= 'boolean' ) | (enumLiteral_1= 'Bundle' ) | (enumLiteral_2= 'byte' ) | (enumLiteral_3= 'double' ) | (enumLiteral_4= 'float' ) | (enumLiteral_5= 'integer' ) | (enumLiteral_6= 'long' ) | (enumLiteral_7= 'short' ) | (enumLiteral_8= 'String' ) ) ;
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
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:769:28: ( ( (enumLiteral_0= 'boolean' ) | (enumLiteral_1= 'Bundle' ) | (enumLiteral_2= 'byte' ) | (enumLiteral_3= 'double' ) | (enumLiteral_4= 'float' ) | (enumLiteral_5= 'integer' ) | (enumLiteral_6= 'long' ) | (enumLiteral_7= 'short' ) | (enumLiteral_8= 'String' ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:770:1: ( (enumLiteral_0= 'boolean' ) | (enumLiteral_1= 'Bundle' ) | (enumLiteral_2= 'byte' ) | (enumLiteral_3= 'double' ) | (enumLiteral_4= 'float' ) | (enumLiteral_5= 'integer' ) | (enumLiteral_6= 'long' ) | (enumLiteral_7= 'short' ) | (enumLiteral_8= 'String' ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:770:1: ( (enumLiteral_0= 'boolean' ) | (enumLiteral_1= 'Bundle' ) | (enumLiteral_2= 'byte' ) | (enumLiteral_3= 'double' ) | (enumLiteral_4= 'float' ) | (enumLiteral_5= 'integer' ) | (enumLiteral_6= 'long' ) | (enumLiteral_7= 'short' ) | (enumLiteral_8= 'String' ) )
            int alt9=9;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt9=1;
                }
                break;
            case 32:
                {
                alt9=2;
                }
                break;
            case 33:
                {
                alt9=3;
                }
                break;
            case 34:
                {
                alt9=4;
                }
                break;
            case 35:
                {
                alt9=5;
                }
                break;
            case 36:
                {
                alt9=6;
                }
                break;
            case 37:
                {
                alt9=7;
                }
                break;
            case 38:
                {
                alt9=8;
                }
                break;
            case 39:
                {
                alt9=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:770:2: (enumLiteral_0= 'boolean' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:770:2: (enumLiteral_0= 'boolean' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:770:4: enumLiteral_0= 'boolean'
                    {
                    enumLiteral_0=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleSimpleTypeEnum1779); 

                            current = grammarAccess.getSimpleTypeEnumAccess().getBOOLEANEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getSimpleTypeEnumAccess().getBOOLEANEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:776:6: (enumLiteral_1= 'Bundle' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:776:6: (enumLiteral_1= 'Bundle' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:776:8: enumLiteral_1= 'Bundle'
                    {
                    enumLiteral_1=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleSimpleTypeEnum1796); 

                            current = grammarAccess.getSimpleTypeEnumAccess().getBUNDLEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getSimpleTypeEnumAccess().getBUNDLEEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:782:6: (enumLiteral_2= 'byte' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:782:6: (enumLiteral_2= 'byte' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:782:8: enumLiteral_2= 'byte'
                    {
                    enumLiteral_2=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleSimpleTypeEnum1813); 

                            current = grammarAccess.getSimpleTypeEnumAccess().getBYTEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getSimpleTypeEnumAccess().getBYTEEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:788:6: (enumLiteral_3= 'double' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:788:6: (enumLiteral_3= 'double' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:788:8: enumLiteral_3= 'double'
                    {
                    enumLiteral_3=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleSimpleTypeEnum1830); 

                            current = grammarAccess.getSimpleTypeEnumAccess().getDOUBLEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getSimpleTypeEnumAccess().getDOUBLEEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:794:6: (enumLiteral_4= 'float' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:794:6: (enumLiteral_4= 'float' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:794:8: enumLiteral_4= 'float'
                    {
                    enumLiteral_4=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleSimpleTypeEnum1847); 

                            current = grammarAccess.getSimpleTypeEnumAccess().getFLOATEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getSimpleTypeEnumAccess().getFLOATEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:800:6: (enumLiteral_5= 'integer' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:800:6: (enumLiteral_5= 'integer' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:800:8: enumLiteral_5= 'integer'
                    {
                    enumLiteral_5=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleSimpleTypeEnum1864); 

                            current = grammarAccess.getSimpleTypeEnumAccess().getINTEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getSimpleTypeEnumAccess().getINTEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:806:6: (enumLiteral_6= 'long' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:806:6: (enumLiteral_6= 'long' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:806:8: enumLiteral_6= 'long'
                    {
                    enumLiteral_6=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleSimpleTypeEnum1881); 

                            current = grammarAccess.getSimpleTypeEnumAccess().getLONGEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_6, grammarAccess.getSimpleTypeEnumAccess().getLONGEnumLiteralDeclaration_6()); 
                        

                    }


                    }
                    break;
                case 8 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:812:6: (enumLiteral_7= 'short' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:812:6: (enumLiteral_7= 'short' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:812:8: enumLiteral_7= 'short'
                    {
                    enumLiteral_7=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleSimpleTypeEnum1898); 

                            current = grammarAccess.getSimpleTypeEnumAccess().getSHORTEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_7, grammarAccess.getSimpleTypeEnumAccess().getSHORTEnumLiteralDeclaration_7()); 
                        

                    }


                    }
                    break;
                case 9 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:818:6: (enumLiteral_8= 'String' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:818:6: (enumLiteral_8= 'String' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:818:8: enumLiteral_8= 'String'
                    {
                    enumLiteral_8=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleSimpleTypeEnum1915); 

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
        public static final BitSet FOLLOW_13_in_ruleIntentModel174 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleIntentModel186 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_ruleIntent_in_ruleIntentModel207 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleIntentModel219 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_16_in_ruleIntentModel232 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleIntentModel244 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_ruleIntent_in_ruleIntentModel265 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleIntentModel277 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_17_in_ruleIntentModel291 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIntent_in_entryRuleIntent327 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIntent337 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_ruleIntent374 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleIntent386 = new BitSet(new long[]{0x0000000078000000L});
        public static final BitSet FOLLOW_ruleExplicitIntent_in_ruleIntent409 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_ruleImplicitIntent_in_ruleIntent436 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_ruleBroadcastIntent_in_ruleIntent463 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_ruleServiceIntent_in_ruleIntent490 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleIntent502 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleIntent516 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleIntent528 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleIntent549 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleIntent561 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleIntent575 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleIntent587 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleIntent608 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleIntent620 = new BitSet(new long[]{0x0000000000C00000L});
        public static final BitSet FOLLOW_22_in_ruleIntent634 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleIntent646 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleIntent667 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleIntent679 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleIntent694 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleIntent706 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleIntent727 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleIntent739 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleIntent753 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleIntent765 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleIntent786 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleIntent798 = new BitSet(new long[]{0x0000000006000002L});
        public static final BitSet FOLLOW_25_in_ruleIntent812 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleIntent824 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleIntent836 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_ruleExtraData_in_ruleIntent857 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_16_in_ruleIntent870 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_ruleExtraData_in_ruleIntent891 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_17_in_ruleIntent905 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleIntent917 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_26_in_ruleIntent932 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleIntent944 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleIntent956 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_ruleExtraData_in_ruleIntent977 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_16_in_ruleIntent990 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_ruleExtraData_in_ruleIntent1011 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_17_in_ruleIntent1025 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString1065 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString1076 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString1116 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString1142 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExtraData_in_entryRuleExtraData1187 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExtraData1197 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_ruleExtraData1243 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleExtraData1256 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleExtraData1268 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleExtraData1289 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleExtraData1302 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleExtraData1315 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleExtraData1327 = new BitSet(new long[]{0x000000FF80000000L});
        public static final BitSet FOLLOW_ruleSimpleTypeEnum_in_ruleExtraData1348 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleExtraData1361 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExplicitIntent_in_entryRuleExplicitIntent1397 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExplicitIntent1407 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_ruleExplicitIntent1453 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleImplicitIntent_in_entryRuleImplicitIntent1489 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleImplicitIntent1499 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_ruleImplicitIntent1545 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBroadcastIntent_in_entryRuleBroadcastIntent1581 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBroadcastIntent1591 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_ruleBroadcastIntent1637 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleServiceIntent_in_entryRuleServiceIntent1673 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleServiceIntent1683 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_ruleServiceIntent1729 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_ruleSimpleTypeEnum1779 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_ruleSimpleTypeEnum1796 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_ruleSimpleTypeEnum1813 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_ruleSimpleTypeEnum1830 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_ruleSimpleTypeEnum1847 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_ruleSimpleTypeEnum1864 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_ruleSimpleTypeEnum1881 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_ruleSimpleTypeEnum1898 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_ruleSimpleTypeEnum1915 = new BitSet(new long[]{0x0000000000000002L});
    }


}