package org.xtext.example.mydsl.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'='", "'['", "']'", "'{'", "'}'", "','", "'Type'", "':'", "'Name'", "'Action'", "'Category'", "'DataURI'", "'DataExtra'", "'ReturnData'", "'\\'ExplicitIntent\\''", "'\\'ImplicitIntent\\''", "'\\'BroadcastIntent\\''", "'\\'ServiceIntent\\''", "'Model'"
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
    public static final int T__19=19;
    public static final int RULE_STRING=4;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
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
    public String getGrammarFileName() { return "../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g"; }


     
     	private MyDslGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleIntentModel"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:60:1: entryRuleIntentModel : ruleIntentModel EOF ;
    public final void entryRuleIntentModel() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:61:1: ( ruleIntentModel EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:62:1: ruleIntentModel EOF
            {
             before(grammarAccess.getIntentModelRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleIntentModel_in_entryRuleIntentModel61);
            ruleIntentModel();

            state._fsp--;

             after(grammarAccess.getIntentModelRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIntentModel68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIntentModel"


    // $ANTLR start "ruleIntentModel"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:69:1: ruleIntentModel : ( ( rule__IntentModel__Group__0 ) ) ;
    public final void ruleIntentModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:73:2: ( ( ( rule__IntentModel__Group__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:74:1: ( ( rule__IntentModel__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:74:1: ( ( rule__IntentModel__Group__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:75:1: ( rule__IntentModel__Group__0 )
            {
             before(grammarAccess.getIntentModelAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:76:1: ( rule__IntentModel__Group__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:76:2: rule__IntentModel__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntentModel__Group__0_in_ruleIntentModel94);
            rule__IntentModel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIntentModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIntentModel"


    // $ANTLR start "entryRuleIntent"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:88:1: entryRuleIntent : ruleIntent EOF ;
    public final void entryRuleIntent() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:89:1: ( ruleIntent EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:90:1: ruleIntent EOF
            {
             before(grammarAccess.getIntentRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleIntent_in_entryRuleIntent121);
            ruleIntent();

            state._fsp--;

             after(grammarAccess.getIntentRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIntent128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIntent"


    // $ANTLR start "ruleIntent"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:97:1: ruleIntent : ( ( rule__Intent__Group__0 ) ) ;
    public final void ruleIntent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:101:2: ( ( ( rule__Intent__Group__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:102:1: ( ( rule__Intent__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:102:1: ( ( rule__Intent__Group__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:103:1: ( rule__Intent__Group__0 )
            {
             before(grammarAccess.getIntentAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:104:1: ( rule__Intent__Group__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:104:2: rule__Intent__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group__0_in_ruleIntent154);
            rule__Intent__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIntentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIntent"


    // $ANTLR start "entryRuleEString"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:116:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:117:1: ( ruleEString EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:118:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString181);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:125:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:129:2: ( ( ( rule__EString__Alternatives ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:130:1: ( ( rule__EString__Alternatives ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:130:1: ( ( rule__EString__Alternatives ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:131:1: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:132:1: ( rule__EString__Alternatives )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:132:2: rule__EString__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__EString__Alternatives_in_ruleEString214);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleExtraData"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:144:1: entryRuleExtraData : ruleExtraData EOF ;
    public final void entryRuleExtraData() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:145:1: ( ruleExtraData EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:146:1: ruleExtraData EOF
            {
             before(grammarAccess.getExtraDataRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleExtraData_in_entryRuleExtraData241);
            ruleExtraData();

            state._fsp--;

             after(grammarAccess.getExtraDataRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExtraData248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExtraData"


    // $ANTLR start "ruleExtraData"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:153:1: ruleExtraData : ( ( rule__ExtraData__Group__0 ) ) ;
    public final void ruleExtraData() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:157:2: ( ( ( rule__ExtraData__Group__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:158:1: ( ( rule__ExtraData__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:158:1: ( ( rule__ExtraData__Group__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:159:1: ( rule__ExtraData__Group__0 )
            {
             before(grammarAccess.getExtraDataAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:160:1: ( rule__ExtraData__Group__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:160:2: rule__ExtraData__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtraData__Group__0_in_ruleExtraData274);
            rule__ExtraData__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExtraDataAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExtraData"


    // $ANTLR start "entryRuleExplicitIntent"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:172:1: entryRuleExplicitIntent : ruleExplicitIntent EOF ;
    public final void entryRuleExplicitIntent() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:173:1: ( ruleExplicitIntent EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:174:1: ruleExplicitIntent EOF
            {
             before(grammarAccess.getExplicitIntentRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleExplicitIntent_in_entryRuleExplicitIntent301);
            ruleExplicitIntent();

            state._fsp--;

             after(grammarAccess.getExplicitIntentRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExplicitIntent308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExplicitIntent"


    // $ANTLR start "ruleExplicitIntent"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:181:1: ruleExplicitIntent : ( ( rule__ExplicitIntent__Group__0 ) ) ;
    public final void ruleExplicitIntent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:185:2: ( ( ( rule__ExplicitIntent__Group__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:186:1: ( ( rule__ExplicitIntent__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:186:1: ( ( rule__ExplicitIntent__Group__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:187:1: ( rule__ExplicitIntent__Group__0 )
            {
             before(grammarAccess.getExplicitIntentAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:188:1: ( rule__ExplicitIntent__Group__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:188:2: rule__ExplicitIntent__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExplicitIntent__Group__0_in_ruleExplicitIntent334);
            rule__ExplicitIntent__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExplicitIntentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExplicitIntent"


    // $ANTLR start "entryRuleImplicitIntent"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:200:1: entryRuleImplicitIntent : ruleImplicitIntent EOF ;
    public final void entryRuleImplicitIntent() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:201:1: ( ruleImplicitIntent EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:202:1: ruleImplicitIntent EOF
            {
             before(grammarAccess.getImplicitIntentRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleImplicitIntent_in_entryRuleImplicitIntent361);
            ruleImplicitIntent();

            state._fsp--;

             after(grammarAccess.getImplicitIntentRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleImplicitIntent368); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleImplicitIntent"


    // $ANTLR start "ruleImplicitIntent"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:209:1: ruleImplicitIntent : ( ( rule__ImplicitIntent__Group__0 ) ) ;
    public final void ruleImplicitIntent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:213:2: ( ( ( rule__ImplicitIntent__Group__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:214:1: ( ( rule__ImplicitIntent__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:214:1: ( ( rule__ImplicitIntent__Group__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:215:1: ( rule__ImplicitIntent__Group__0 )
            {
             before(grammarAccess.getImplicitIntentAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:216:1: ( rule__ImplicitIntent__Group__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:216:2: rule__ImplicitIntent__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ImplicitIntent__Group__0_in_ruleImplicitIntent394);
            rule__ImplicitIntent__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImplicitIntentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImplicitIntent"


    // $ANTLR start "entryRuleBroadcastIntent"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:228:1: entryRuleBroadcastIntent : ruleBroadcastIntent EOF ;
    public final void entryRuleBroadcastIntent() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:229:1: ( ruleBroadcastIntent EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:230:1: ruleBroadcastIntent EOF
            {
             before(grammarAccess.getBroadcastIntentRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBroadcastIntent_in_entryRuleBroadcastIntent421);
            ruleBroadcastIntent();

            state._fsp--;

             after(grammarAccess.getBroadcastIntentRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBroadcastIntent428); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBroadcastIntent"


    // $ANTLR start "ruleBroadcastIntent"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:237:1: ruleBroadcastIntent : ( ( rule__BroadcastIntent__Group__0 ) ) ;
    public final void ruleBroadcastIntent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:241:2: ( ( ( rule__BroadcastIntent__Group__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:242:1: ( ( rule__BroadcastIntent__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:242:1: ( ( rule__BroadcastIntent__Group__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:243:1: ( rule__BroadcastIntent__Group__0 )
            {
             before(grammarAccess.getBroadcastIntentAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:244:1: ( rule__BroadcastIntent__Group__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:244:2: rule__BroadcastIntent__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__BroadcastIntent__Group__0_in_ruleBroadcastIntent454);
            rule__BroadcastIntent__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBroadcastIntentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBroadcastIntent"


    // $ANTLR start "entryRuleServiceIntent"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:256:1: entryRuleServiceIntent : ruleServiceIntent EOF ;
    public final void entryRuleServiceIntent() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:257:1: ( ruleServiceIntent EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:258:1: ruleServiceIntent EOF
            {
             before(grammarAccess.getServiceIntentRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleServiceIntent_in_entryRuleServiceIntent481);
            ruleServiceIntent();

            state._fsp--;

             after(grammarAccess.getServiceIntentRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleServiceIntent488); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleServiceIntent"


    // $ANTLR start "ruleServiceIntent"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:265:1: ruleServiceIntent : ( ( rule__ServiceIntent__Group__0 ) ) ;
    public final void ruleServiceIntent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:269:2: ( ( ( rule__ServiceIntent__Group__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:270:1: ( ( rule__ServiceIntent__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:270:1: ( ( rule__ServiceIntent__Group__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:271:1: ( rule__ServiceIntent__Group__0 )
            {
             before(grammarAccess.getServiceIntentAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:272:1: ( rule__ServiceIntent__Group__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:272:2: rule__ServiceIntent__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ServiceIntent__Group__0_in_ruleServiceIntent514);
            rule__ServiceIntent__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getServiceIntentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleServiceIntent"


    // $ANTLR start "rule__Intent__Alternatives_2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:284:1: rule__Intent__Alternatives_2 : ( ( ruleExplicitIntent ) | ( ruleImplicitIntent ) | ( ruleBroadcastIntent ) | ( ruleServiceIntent ) );
    public final void rule__Intent__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:288:1: ( ( ruleExplicitIntent ) | ( ruleImplicitIntent ) | ( ruleBroadcastIntent ) | ( ruleServiceIntent ) )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt1=1;
                }
                break;
            case 26:
                {
                alt1=2;
                }
                break;
            case 27:
                {
                alt1=3;
                }
                break;
            case 28:
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:289:1: ( ruleExplicitIntent )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:289:1: ( ruleExplicitIntent )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:290:1: ruleExplicitIntent
                    {
                     before(grammarAccess.getIntentAccess().getExplicitIntentParserRuleCall_2_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleExplicitIntent_in_rule__Intent__Alternatives_2550);
                    ruleExplicitIntent();

                    state._fsp--;

                     after(grammarAccess.getIntentAccess().getExplicitIntentParserRuleCall_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:295:6: ( ruleImplicitIntent )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:295:6: ( ruleImplicitIntent )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:296:1: ruleImplicitIntent
                    {
                     before(grammarAccess.getIntentAccess().getImplicitIntentParserRuleCall_2_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleImplicitIntent_in_rule__Intent__Alternatives_2567);
                    ruleImplicitIntent();

                    state._fsp--;

                     after(grammarAccess.getIntentAccess().getImplicitIntentParserRuleCall_2_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:301:6: ( ruleBroadcastIntent )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:301:6: ( ruleBroadcastIntent )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:302:1: ruleBroadcastIntent
                    {
                     before(grammarAccess.getIntentAccess().getBroadcastIntentParserRuleCall_2_2()); 
                    pushFollow(FollowSets000.FOLLOW_ruleBroadcastIntent_in_rule__Intent__Alternatives_2584);
                    ruleBroadcastIntent();

                    state._fsp--;

                     after(grammarAccess.getIntentAccess().getBroadcastIntentParserRuleCall_2_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:307:6: ( ruleServiceIntent )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:307:6: ( ruleServiceIntent )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:308:1: ruleServiceIntent
                    {
                     before(grammarAccess.getIntentAccess().getServiceIntentParserRuleCall_2_3()); 
                    pushFollow(FollowSets000.FOLLOW_ruleServiceIntent_in_rule__Intent__Alternatives_2601);
                    ruleServiceIntent();

                    state._fsp--;

                     after(grammarAccess.getIntentAccess().getServiceIntentParserRuleCall_2_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__Alternatives_2"


    // $ANTLR start "rule__EString__Alternatives"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:318:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:322:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:323:1: ( RULE_STRING )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:323:1: ( RULE_STRING )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:324:1: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__EString__Alternatives633); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:329:6: ( RULE_ID )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:329:6: ( RULE_ID )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:330:1: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__EString__Alternatives650); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__IntentModel__Group__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:342:1: rule__IntentModel__Group__0 : rule__IntentModel__Group__0__Impl rule__IntentModel__Group__1 ;
    public final void rule__IntentModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:346:1: ( rule__IntentModel__Group__0__Impl rule__IntentModel__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:347:2: rule__IntentModel__Group__0__Impl rule__IntentModel__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntentModel__Group__0__Impl_in_rule__IntentModel__Group__0680);
            rule__IntentModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IntentModel__Group__1_in_rule__IntentModel__Group__0683);
            rule__IntentModel__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntentModel__Group__0"


    // $ANTLR start "rule__IntentModel__Group__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:354:1: rule__IntentModel__Group__0__Impl : ( () ) ;
    public final void rule__IntentModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:358:1: ( ( () ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:359:1: ( () )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:359:1: ( () )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:360:1: ()
            {
             before(grammarAccess.getIntentModelAccess().getIntentModelAction_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:361:1: ()
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:363:1: 
            {
            }

             after(grammarAccess.getIntentModelAccess().getIntentModelAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntentModel__Group__0__Impl"


    // $ANTLR start "rule__IntentModel__Group__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:373:1: rule__IntentModel__Group__1 : rule__IntentModel__Group__1__Impl rule__IntentModel__Group__2 ;
    public final void rule__IntentModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:377:1: ( rule__IntentModel__Group__1__Impl rule__IntentModel__Group__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:378:2: rule__IntentModel__Group__1__Impl rule__IntentModel__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntentModel__Group__1__Impl_in_rule__IntentModel__Group__1741);
            rule__IntentModel__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IntentModel__Group__2_in_rule__IntentModel__Group__1744);
            rule__IntentModel__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntentModel__Group__1"


    // $ANTLR start "rule__IntentModel__Group__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:385:1: rule__IntentModel__Group__1__Impl : ( ( rule__IntentModel__NameAssignment_1 ) ) ;
    public final void rule__IntentModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:389:1: ( ( ( rule__IntentModel__NameAssignment_1 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:390:1: ( ( rule__IntentModel__NameAssignment_1 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:390:1: ( ( rule__IntentModel__NameAssignment_1 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:391:1: ( rule__IntentModel__NameAssignment_1 )
            {
             before(grammarAccess.getIntentModelAccess().getNameAssignment_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:392:1: ( rule__IntentModel__NameAssignment_1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:392:2: rule__IntentModel__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntentModel__NameAssignment_1_in_rule__IntentModel__Group__1__Impl771);
            rule__IntentModel__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getIntentModelAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntentModel__Group__1__Impl"


    // $ANTLR start "rule__IntentModel__Group__2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:402:1: rule__IntentModel__Group__2 : rule__IntentModel__Group__2__Impl rule__IntentModel__Group__3 ;
    public final void rule__IntentModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:406:1: ( rule__IntentModel__Group__2__Impl rule__IntentModel__Group__3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:407:2: rule__IntentModel__Group__2__Impl rule__IntentModel__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntentModel__Group__2__Impl_in_rule__IntentModel__Group__2801);
            rule__IntentModel__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IntentModel__Group__3_in_rule__IntentModel__Group__2804);
            rule__IntentModel__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntentModel__Group__2"


    // $ANTLR start "rule__IntentModel__Group__2__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:414:1: rule__IntentModel__Group__2__Impl : ( '=' ) ;
    public final void rule__IntentModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:418:1: ( ( '=' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:419:1: ( '=' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:419:1: ( '=' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:420:1: '='
            {
             before(grammarAccess.getIntentModelAccess().getEqualsSignKeyword_2()); 
            match(input,11,FollowSets000.FOLLOW_11_in_rule__IntentModel__Group__2__Impl832); 
             after(grammarAccess.getIntentModelAccess().getEqualsSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntentModel__Group__2__Impl"


    // $ANTLR start "rule__IntentModel__Group__3"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:433:1: rule__IntentModel__Group__3 : rule__IntentModel__Group__3__Impl rule__IntentModel__Group__4 ;
    public final void rule__IntentModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:437:1: ( rule__IntentModel__Group__3__Impl rule__IntentModel__Group__4 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:438:2: rule__IntentModel__Group__3__Impl rule__IntentModel__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntentModel__Group__3__Impl_in_rule__IntentModel__Group__3863);
            rule__IntentModel__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IntentModel__Group__4_in_rule__IntentModel__Group__3866);
            rule__IntentModel__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntentModel__Group__3"


    // $ANTLR start "rule__IntentModel__Group__3__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:445:1: rule__IntentModel__Group__3__Impl : ( '[' ) ;
    public final void rule__IntentModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:449:1: ( ( '[' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:450:1: ( '[' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:450:1: ( '[' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:451:1: '['
            {
             before(grammarAccess.getIntentModelAccess().getLeftSquareBracketKeyword_3()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__IntentModel__Group__3__Impl894); 
             after(grammarAccess.getIntentModelAccess().getLeftSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntentModel__Group__3__Impl"


    // $ANTLR start "rule__IntentModel__Group__4"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:464:1: rule__IntentModel__Group__4 : rule__IntentModel__Group__4__Impl rule__IntentModel__Group__5 ;
    public final void rule__IntentModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:468:1: ( rule__IntentModel__Group__4__Impl rule__IntentModel__Group__5 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:469:2: rule__IntentModel__Group__4__Impl rule__IntentModel__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntentModel__Group__4__Impl_in_rule__IntentModel__Group__4925);
            rule__IntentModel__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IntentModel__Group__5_in_rule__IntentModel__Group__4928);
            rule__IntentModel__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntentModel__Group__4"


    // $ANTLR start "rule__IntentModel__Group__4__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:476:1: rule__IntentModel__Group__4__Impl : ( ( rule__IntentModel__Group_4__0 )? ) ;
    public final void rule__IntentModel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:480:1: ( ( ( rule__IntentModel__Group_4__0 )? ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:481:1: ( ( rule__IntentModel__Group_4__0 )? )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:481:1: ( ( rule__IntentModel__Group_4__0 )? )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:482:1: ( rule__IntentModel__Group_4__0 )?
            {
             before(grammarAccess.getIntentModelAccess().getGroup_4()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:483:1: ( rule__IntentModel__Group_4__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:483:2: rule__IntentModel__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__IntentModel__Group_4__0_in_rule__IntentModel__Group__4__Impl955);
                    rule__IntentModel__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIntentModelAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntentModel__Group__4__Impl"


    // $ANTLR start "rule__IntentModel__Group__5"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:493:1: rule__IntentModel__Group__5 : rule__IntentModel__Group__5__Impl ;
    public final void rule__IntentModel__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:497:1: ( rule__IntentModel__Group__5__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:498:2: rule__IntentModel__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntentModel__Group__5__Impl_in_rule__IntentModel__Group__5986);
            rule__IntentModel__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntentModel__Group__5"


    // $ANTLR start "rule__IntentModel__Group__5__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:504:1: rule__IntentModel__Group__5__Impl : ( ']' ) ;
    public final void rule__IntentModel__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:508:1: ( ( ']' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:509:1: ( ']' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:509:1: ( ']' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:510:1: ']'
            {
             before(grammarAccess.getIntentModelAccess().getRightSquareBracketKeyword_5()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__IntentModel__Group__5__Impl1014); 
             after(grammarAccess.getIntentModelAccess().getRightSquareBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntentModel__Group__5__Impl"


    // $ANTLR start "rule__IntentModel__Group_4__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:535:1: rule__IntentModel__Group_4__0 : rule__IntentModel__Group_4__0__Impl rule__IntentModel__Group_4__1 ;
    public final void rule__IntentModel__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:539:1: ( rule__IntentModel__Group_4__0__Impl rule__IntentModel__Group_4__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:540:2: rule__IntentModel__Group_4__0__Impl rule__IntentModel__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntentModel__Group_4__0__Impl_in_rule__IntentModel__Group_4__01057);
            rule__IntentModel__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IntentModel__Group_4__1_in_rule__IntentModel__Group_4__01060);
            rule__IntentModel__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntentModel__Group_4__0"


    // $ANTLR start "rule__IntentModel__Group_4__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:547:1: rule__IntentModel__Group_4__0__Impl : ( '{' ) ;
    public final void rule__IntentModel__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:551:1: ( ( '{' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:552:1: ( '{' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:552:1: ( '{' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:553:1: '{'
            {
             before(grammarAccess.getIntentModelAccess().getLeftCurlyBracketKeyword_4_0()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__IntentModel__Group_4__0__Impl1088); 
             after(grammarAccess.getIntentModelAccess().getLeftCurlyBracketKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntentModel__Group_4__0__Impl"


    // $ANTLR start "rule__IntentModel__Group_4__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:566:1: rule__IntentModel__Group_4__1 : rule__IntentModel__Group_4__1__Impl rule__IntentModel__Group_4__2 ;
    public final void rule__IntentModel__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:570:1: ( rule__IntentModel__Group_4__1__Impl rule__IntentModel__Group_4__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:571:2: rule__IntentModel__Group_4__1__Impl rule__IntentModel__Group_4__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntentModel__Group_4__1__Impl_in_rule__IntentModel__Group_4__11119);
            rule__IntentModel__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IntentModel__Group_4__2_in_rule__IntentModel__Group_4__11122);
            rule__IntentModel__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntentModel__Group_4__1"


    // $ANTLR start "rule__IntentModel__Group_4__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:578:1: rule__IntentModel__Group_4__1__Impl : ( ( rule__IntentModel__IntentsAssignment_4_1 ) ) ;
    public final void rule__IntentModel__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:582:1: ( ( ( rule__IntentModel__IntentsAssignment_4_1 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:583:1: ( ( rule__IntentModel__IntentsAssignment_4_1 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:583:1: ( ( rule__IntentModel__IntentsAssignment_4_1 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:584:1: ( rule__IntentModel__IntentsAssignment_4_1 )
            {
             before(grammarAccess.getIntentModelAccess().getIntentsAssignment_4_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:585:1: ( rule__IntentModel__IntentsAssignment_4_1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:585:2: rule__IntentModel__IntentsAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntentModel__IntentsAssignment_4_1_in_rule__IntentModel__Group_4__1__Impl1149);
            rule__IntentModel__IntentsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getIntentModelAccess().getIntentsAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntentModel__Group_4__1__Impl"


    // $ANTLR start "rule__IntentModel__Group_4__2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:595:1: rule__IntentModel__Group_4__2 : rule__IntentModel__Group_4__2__Impl rule__IntentModel__Group_4__3 ;
    public final void rule__IntentModel__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:599:1: ( rule__IntentModel__Group_4__2__Impl rule__IntentModel__Group_4__3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:600:2: rule__IntentModel__Group_4__2__Impl rule__IntentModel__Group_4__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntentModel__Group_4__2__Impl_in_rule__IntentModel__Group_4__21179);
            rule__IntentModel__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IntentModel__Group_4__3_in_rule__IntentModel__Group_4__21182);
            rule__IntentModel__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntentModel__Group_4__2"


    // $ANTLR start "rule__IntentModel__Group_4__2__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:607:1: rule__IntentModel__Group_4__2__Impl : ( ( rule__IntentModel__Group_4_2__0 )* ) ;
    public final void rule__IntentModel__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:611:1: ( ( ( rule__IntentModel__Group_4_2__0 )* ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:612:1: ( ( rule__IntentModel__Group_4_2__0 )* )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:612:1: ( ( rule__IntentModel__Group_4_2__0 )* )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:613:1: ( rule__IntentModel__Group_4_2__0 )*
            {
             before(grammarAccess.getIntentModelAccess().getGroup_4_2()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:614:1: ( rule__IntentModel__Group_4_2__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==16) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:614:2: rule__IntentModel__Group_4_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__IntentModel__Group_4_2__0_in_rule__IntentModel__Group_4__2__Impl1209);
            	    rule__IntentModel__Group_4_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getIntentModelAccess().getGroup_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntentModel__Group_4__2__Impl"


    // $ANTLR start "rule__IntentModel__Group_4__3"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:624:1: rule__IntentModel__Group_4__3 : rule__IntentModel__Group_4__3__Impl ;
    public final void rule__IntentModel__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:628:1: ( rule__IntentModel__Group_4__3__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:629:2: rule__IntentModel__Group_4__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntentModel__Group_4__3__Impl_in_rule__IntentModel__Group_4__31240);
            rule__IntentModel__Group_4__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntentModel__Group_4__3"


    // $ANTLR start "rule__IntentModel__Group_4__3__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:635:1: rule__IntentModel__Group_4__3__Impl : ( '}' ) ;
    public final void rule__IntentModel__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:639:1: ( ( '}' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:640:1: ( '}' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:640:1: ( '}' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:641:1: '}'
            {
             before(grammarAccess.getIntentModelAccess().getRightCurlyBracketKeyword_4_3()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__IntentModel__Group_4__3__Impl1268); 
             after(grammarAccess.getIntentModelAccess().getRightCurlyBracketKeyword_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntentModel__Group_4__3__Impl"


    // $ANTLR start "rule__IntentModel__Group_4_2__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:662:1: rule__IntentModel__Group_4_2__0 : rule__IntentModel__Group_4_2__0__Impl rule__IntentModel__Group_4_2__1 ;
    public final void rule__IntentModel__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:666:1: ( rule__IntentModel__Group_4_2__0__Impl rule__IntentModel__Group_4_2__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:667:2: rule__IntentModel__Group_4_2__0__Impl rule__IntentModel__Group_4_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntentModel__Group_4_2__0__Impl_in_rule__IntentModel__Group_4_2__01307);
            rule__IntentModel__Group_4_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IntentModel__Group_4_2__1_in_rule__IntentModel__Group_4_2__01310);
            rule__IntentModel__Group_4_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntentModel__Group_4_2__0"


    // $ANTLR start "rule__IntentModel__Group_4_2__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:674:1: rule__IntentModel__Group_4_2__0__Impl : ( ',' ) ;
    public final void rule__IntentModel__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:678:1: ( ( ',' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:679:1: ( ',' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:679:1: ( ',' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:680:1: ','
            {
             before(grammarAccess.getIntentModelAccess().getCommaKeyword_4_2_0()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__IntentModel__Group_4_2__0__Impl1338); 
             after(grammarAccess.getIntentModelAccess().getCommaKeyword_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntentModel__Group_4_2__0__Impl"


    // $ANTLR start "rule__IntentModel__Group_4_2__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:693:1: rule__IntentModel__Group_4_2__1 : rule__IntentModel__Group_4_2__1__Impl ;
    public final void rule__IntentModel__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:697:1: ( rule__IntentModel__Group_4_2__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:698:2: rule__IntentModel__Group_4_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntentModel__Group_4_2__1__Impl_in_rule__IntentModel__Group_4_2__11369);
            rule__IntentModel__Group_4_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntentModel__Group_4_2__1"


    // $ANTLR start "rule__IntentModel__Group_4_2__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:704:1: rule__IntentModel__Group_4_2__1__Impl : ( ( rule__IntentModel__IntentsAssignment_4_2_1 ) ) ;
    public final void rule__IntentModel__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:708:1: ( ( ( rule__IntentModel__IntentsAssignment_4_2_1 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:709:1: ( ( rule__IntentModel__IntentsAssignment_4_2_1 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:709:1: ( ( rule__IntentModel__IntentsAssignment_4_2_1 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:710:1: ( rule__IntentModel__IntentsAssignment_4_2_1 )
            {
             before(grammarAccess.getIntentModelAccess().getIntentsAssignment_4_2_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:711:1: ( rule__IntentModel__IntentsAssignment_4_2_1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:711:2: rule__IntentModel__IntentsAssignment_4_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntentModel__IntentsAssignment_4_2_1_in_rule__IntentModel__Group_4_2__1__Impl1396);
            rule__IntentModel__IntentsAssignment_4_2_1();

            state._fsp--;


            }

             after(grammarAccess.getIntentModelAccess().getIntentsAssignment_4_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntentModel__Group_4_2__1__Impl"


    // $ANTLR start "rule__Intent__Group__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:725:1: rule__Intent__Group__0 : rule__Intent__Group__0__Impl rule__Intent__Group__1 ;
    public final void rule__Intent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:729:1: ( rule__Intent__Group__0__Impl rule__Intent__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:730:2: rule__Intent__Group__0__Impl rule__Intent__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group__0__Impl_in_rule__Intent__Group__01430);
            rule__Intent__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group__1_in_rule__Intent__Group__01433);
            rule__Intent__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__Group__0"


    // $ANTLR start "rule__Intent__Group__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:737:1: rule__Intent__Group__0__Impl : ( 'Type' ) ;
    public final void rule__Intent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:741:1: ( ( 'Type' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:742:1: ( 'Type' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:742:1: ( 'Type' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:743:1: 'Type'
            {
             before(grammarAccess.getIntentAccess().getTypeKeyword_0()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Intent__Group__0__Impl1461); 
             after(grammarAccess.getIntentAccess().getTypeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__Group__0__Impl"


    // $ANTLR start "rule__Intent__Group__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:756:1: rule__Intent__Group__1 : rule__Intent__Group__1__Impl rule__Intent__Group__2 ;
    public final void rule__Intent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:760:1: ( rule__Intent__Group__1__Impl rule__Intent__Group__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:761:2: rule__Intent__Group__1__Impl rule__Intent__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group__1__Impl_in_rule__Intent__Group__11492);
            rule__Intent__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group__2_in_rule__Intent__Group__11495);
            rule__Intent__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__Group__1"


    // $ANTLR start "rule__Intent__Group__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:768:1: rule__Intent__Group__1__Impl : ( ':' ) ;
    public final void rule__Intent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:772:1: ( ( ':' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:773:1: ( ':' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:773:1: ( ':' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:774:1: ':'
            {
             before(grammarAccess.getIntentAccess().getColonKeyword_1()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__Intent__Group__1__Impl1523); 
             after(grammarAccess.getIntentAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__Group__1__Impl"


    // $ANTLR start "rule__Intent__Group__2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:787:1: rule__Intent__Group__2 : rule__Intent__Group__2__Impl rule__Intent__Group__3 ;
    public final void rule__Intent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:791:1: ( rule__Intent__Group__2__Impl rule__Intent__Group__3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:792:2: rule__Intent__Group__2__Impl rule__Intent__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group__2__Impl_in_rule__Intent__Group__21554);
            rule__Intent__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group__3_in_rule__Intent__Group__21557);
            rule__Intent__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__Group__2"


    // $ANTLR start "rule__Intent__Group__2__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:799:1: rule__Intent__Group__2__Impl : ( ( rule__Intent__Alternatives_2 ) ) ;
    public final void rule__Intent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:803:1: ( ( ( rule__Intent__Alternatives_2 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:804:1: ( ( rule__Intent__Alternatives_2 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:804:1: ( ( rule__Intent__Alternatives_2 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:805:1: ( rule__Intent__Alternatives_2 )
            {
             before(grammarAccess.getIntentAccess().getAlternatives_2()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:806:1: ( rule__Intent__Alternatives_2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:806:2: rule__Intent__Alternatives_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Alternatives_2_in_rule__Intent__Group__2__Impl1584);
            rule__Intent__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getIntentAccess().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__Group__2__Impl"


    // $ANTLR start "rule__Intent__Group__3"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:816:1: rule__Intent__Group__3 : rule__Intent__Group__3__Impl rule__Intent__Group__4 ;
    public final void rule__Intent__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:820:1: ( rule__Intent__Group__3__Impl rule__Intent__Group__4 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:821:2: rule__Intent__Group__3__Impl rule__Intent__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group__3__Impl_in_rule__Intent__Group__31614);
            rule__Intent__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group__4_in_rule__Intent__Group__31617);
            rule__Intent__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__Group__3"


    // $ANTLR start "rule__Intent__Group__3__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:828:1: rule__Intent__Group__3__Impl : ( ',' ) ;
    public final void rule__Intent__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:832:1: ( ( ',' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:833:1: ( ',' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:833:1: ( ',' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:834:1: ','
            {
             before(grammarAccess.getIntentAccess().getCommaKeyword_3()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Intent__Group__3__Impl1645); 
             after(grammarAccess.getIntentAccess().getCommaKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__Group__3__Impl"


    // $ANTLR start "rule__Intent__Group__4"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:847:1: rule__Intent__Group__4 : rule__Intent__Group__4__Impl ;
    public final void rule__Intent__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:851:1: ( rule__Intent__Group__4__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:852:2: rule__Intent__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group__4__Impl_in_rule__Intent__Group__41676);
            rule__Intent__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__Group__4"


    // $ANTLR start "rule__Intent__Group__4__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:858:1: rule__Intent__Group__4__Impl : ( ( rule__Intent__Group_4__0 ) ) ;
    public final void rule__Intent__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:862:1: ( ( ( rule__Intent__Group_4__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:863:1: ( ( rule__Intent__Group_4__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:863:1: ( ( rule__Intent__Group_4__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:864:1: ( rule__Intent__Group_4__0 )
            {
             before(grammarAccess.getIntentAccess().getGroup_4()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:865:1: ( rule__Intent__Group_4__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:865:2: rule__Intent__Group_4__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4__0_in_rule__Intent__Group__4__Impl1703);
            rule__Intent__Group_4__0();

            state._fsp--;


            }

             after(grammarAccess.getIntentAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__Group__4__Impl"


    // $ANTLR start "rule__Intent__Group_4__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:885:1: rule__Intent__Group_4__0 : rule__Intent__Group_4__0__Impl rule__Intent__Group_4__1 ;
    public final void rule__Intent__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:889:1: ( rule__Intent__Group_4__0__Impl rule__Intent__Group_4__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:890:2: rule__Intent__Group_4__0__Impl rule__Intent__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4__0__Impl_in_rule__Intent__Group_4__01743);
            rule__Intent__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4__1_in_rule__Intent__Group_4__01746);
            rule__Intent__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__Group_4__0"


    // $ANTLR start "rule__Intent__Group_4__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:897:1: rule__Intent__Group_4__0__Impl : ( ( rule__Intent__Group_4_0__0 ) ) ;
    public final void rule__Intent__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:901:1: ( ( ( rule__Intent__Group_4_0__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:902:1: ( ( rule__Intent__Group_4_0__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:902:1: ( ( rule__Intent__Group_4_0__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:903:1: ( rule__Intent__Group_4_0__0 )
            {
             before(grammarAccess.getIntentAccess().getGroup_4_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:904:1: ( rule__Intent__Group_4_0__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:904:2: rule__Intent__Group_4_0__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_0__0_in_rule__Intent__Group_4__0__Impl1773);
            rule__Intent__Group_4_0__0();

            state._fsp--;


            }

             after(grammarAccess.getIntentAccess().getGroup_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__Group_4__0__Impl"


    // $ANTLR start "rule__Intent__Group_4__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:914:1: rule__Intent__Group_4__1 : rule__Intent__Group_4__1__Impl rule__Intent__Group_4__2 ;
    public final void rule__Intent__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:918:1: ( rule__Intent__Group_4__1__Impl rule__Intent__Group_4__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:919:2: rule__Intent__Group_4__1__Impl rule__Intent__Group_4__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4__1__Impl_in_rule__Intent__Group_4__11803);
            rule__Intent__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4__2_in_rule__Intent__Group_4__11806);
            rule__Intent__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__Group_4__1"


    // $ANTLR start "rule__Intent__Group_4__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:926:1: rule__Intent__Group_4__1__Impl : ( ( rule__Intent__Group_4_1__0 ) ) ;
    public final void rule__Intent__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:930:1: ( ( ( rule__Intent__Group_4_1__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:931:1: ( ( rule__Intent__Group_4_1__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:931:1: ( ( rule__Intent__Group_4_1__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:932:1: ( rule__Intent__Group_4_1__0 )
            {
             before(grammarAccess.getIntentAccess().getGroup_4_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:933:1: ( rule__Intent__Group_4_1__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:933:2: rule__Intent__Group_4_1__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_1__0_in_rule__Intent__Group_4__1__Impl1833);
            rule__Intent__Group_4_1__0();

            state._fsp--;


            }

             after(grammarAccess.getIntentAccess().getGroup_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__Group_4__1__Impl"


    // $ANTLR start "rule__Intent__Group_4__2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:943:1: rule__Intent__Group_4__2 : rule__Intent__Group_4__2__Impl rule__Intent__Group_4__3 ;
    public final void rule__Intent__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:947:1: ( rule__Intent__Group_4__2__Impl rule__Intent__Group_4__3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:948:2: rule__Intent__Group_4__2__Impl rule__Intent__Group_4__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4__2__Impl_in_rule__Intent__Group_4__21863);
            rule__Intent__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4__3_in_rule__Intent__Group_4__21866);
            rule__Intent__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__Group_4__2"


    // $ANTLR start "rule__Intent__Group_4__2__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:955:1: rule__Intent__Group_4__2__Impl : ( ( rule__Intent__Group_4_2__0 ) ) ;
    public final void rule__Intent__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:959:1: ( ( ( rule__Intent__Group_4_2__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:960:1: ( ( rule__Intent__Group_4_2__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:960:1: ( ( rule__Intent__Group_4_2__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:961:1: ( rule__Intent__Group_4_2__0 )
            {
             before(grammarAccess.getIntentAccess().getGroup_4_2()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:962:1: ( rule__Intent__Group_4_2__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:962:2: rule__Intent__Group_4_2__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_2__0_in_rule__Intent__Group_4__2__Impl1893);
            rule__Intent__Group_4_2__0();

            state._fsp--;


            }

             after(grammarAccess.getIntentAccess().getGroup_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__Group_4__2__Impl"


    // $ANTLR start "rule__Intent__Group_4__3"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:972:1: rule__Intent__Group_4__3 : rule__Intent__Group_4__3__Impl rule__Intent__Group_4__4 ;
    public final void rule__Intent__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:976:1: ( rule__Intent__Group_4__3__Impl rule__Intent__Group_4__4 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:977:2: rule__Intent__Group_4__3__Impl rule__Intent__Group_4__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4__3__Impl_in_rule__Intent__Group_4__31923);
            rule__Intent__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4__4_in_rule__Intent__Group_4__31926);
            rule__Intent__Group_4__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__Group_4__3"


    // $ANTLR start "rule__Intent__Group_4__3__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:984:1: rule__Intent__Group_4__3__Impl : ( ( rule__Intent__Group_4_3__0 ) ) ;
    public final void rule__Intent__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:988:1: ( ( ( rule__Intent__Group_4_3__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:989:1: ( ( rule__Intent__Group_4_3__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:989:1: ( ( rule__Intent__Group_4_3__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:990:1: ( rule__Intent__Group_4_3__0 )
            {
             before(grammarAccess.getIntentAccess().getGroup_4_3()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:991:1: ( rule__Intent__Group_4_3__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:991:2: rule__Intent__Group_4_3__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_3__0_in_rule__Intent__Group_4__3__Impl1953);
            rule__Intent__Group_4_3__0();

            state._fsp--;


            }

             after(grammarAccess.getIntentAccess().getGroup_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__Group_4__3__Impl"


    // $ANTLR start "rule__Intent__Group_4__4"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1001:1: rule__Intent__Group_4__4 : rule__Intent__Group_4__4__Impl rule__Intent__Group_4__5 ;
    public final void rule__Intent__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1005:1: ( rule__Intent__Group_4__4__Impl rule__Intent__Group_4__5 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1006:2: rule__Intent__Group_4__4__Impl rule__Intent__Group_4__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4__4__Impl_in_rule__Intent__Group_4__41983);
            rule__Intent__Group_4__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4__5_in_rule__Intent__Group_4__41986);
            rule__Intent__Group_4__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__Group_4__4"


    // $ANTLR start "rule__Intent__Group_4__4__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1013:1: rule__Intent__Group_4__4__Impl : ( ( rule__Intent__Group_4_4__0 )? ) ;
    public final void rule__Intent__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1017:1: ( ( ( rule__Intent__Group_4_4__0 )? ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1018:1: ( ( rule__Intent__Group_4_4__0 )? )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1018:1: ( ( rule__Intent__Group_4_4__0 )? )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1019:1: ( rule__Intent__Group_4_4__0 )?
            {
             before(grammarAccess.getIntentAccess().getGroup_4_4()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1020:1: ( rule__Intent__Group_4_4__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==23) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1020:2: rule__Intent__Group_4_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_4__0_in_rule__Intent__Group_4__4__Impl2013);
                    rule__Intent__Group_4_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIntentAccess().getGroup_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__Group_4__4__Impl"


    // $ANTLR start "rule__Intent__Group_4__5"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1030:1: rule__Intent__Group_4__5 : rule__Intent__Group_4__5__Impl ;
    public final void rule__Intent__Group_4__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1034:1: ( rule__Intent__Group_4__5__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1035:2: rule__Intent__Group_4__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4__5__Impl_in_rule__Intent__Group_4__52044);
            rule__Intent__Group_4__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__Group_4__5"


    // $ANTLR start "rule__Intent__Group_4__5__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1041:1: rule__Intent__Group_4__5__Impl : ( ( rule__Intent__Group_4_5__0 )? ) ;
    public final void rule__Intent__Group_4__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1045:1: ( ( ( rule__Intent__Group_4_5__0 )? ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1046:1: ( ( rule__Intent__Group_4_5__0 )? )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1046:1: ( ( rule__Intent__Group_4_5__0 )? )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1047:1: ( rule__Intent__Group_4_5__0 )?
            {
             before(grammarAccess.getIntentAccess().getGroup_4_5()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1048:1: ( rule__Intent__Group_4_5__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==24) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1048:2: rule__Intent__Group_4_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_5__0_in_rule__Intent__Group_4__5__Impl2071);
                    rule__Intent__Group_4_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIntentAccess().getGroup_4_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__Group_4__5__Impl"


    // $ANTLR start "rule__Intent__Group_4_0__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1070:1: rule__Intent__Group_4_0__0 : rule__Intent__Group_4_0__0__Impl rule__Intent__Group_4_0__1 ;
    public final void rule__Intent__Group_4_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1074:1: ( rule__Intent__Group_4_0__0__Impl rule__Intent__Group_4_0__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1075:2: rule__Intent__Group_4_0__0__Impl rule__Intent__Group_4_0__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_0__0__Impl_in_rule__Intent__Group_4_0__02114);
            rule__Intent__Group_4_0__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_0__1_in_rule__Intent__Group_4_0__02117);
            rule__Intent__Group_4_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__Group_4_0__0"


    // $ANTLR start "rule__Intent__Group_4_0__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1082:1: rule__Intent__Group_4_0__0__Impl : ( 'Name' ) ;
    public final void rule__Intent__Group_4_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1086:1: ( ( 'Name' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1087:1: ( 'Name' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1087:1: ( 'Name' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1088:1: 'Name'
            {
             before(grammarAccess.getIntentAccess().getNameKeyword_4_0_0()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__Intent__Group_4_0__0__Impl2145); 
             after(grammarAccess.getIntentAccess().getNameKeyword_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__Group_4_0__0__Impl"


    // $ANTLR start "rule__Intent__Group_4_0__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1101:1: rule__Intent__Group_4_0__1 : rule__Intent__Group_4_0__1__Impl rule__Intent__Group_4_0__2 ;
    public final void rule__Intent__Group_4_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1105:1: ( rule__Intent__Group_4_0__1__Impl rule__Intent__Group_4_0__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1106:2: rule__Intent__Group_4_0__1__Impl rule__Intent__Group_4_0__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_0__1__Impl_in_rule__Intent__Group_4_0__12176);
            rule__Intent__Group_4_0__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_0__2_in_rule__Intent__Group_4_0__12179);
            rule__Intent__Group_4_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__Group_4_0__1"


    // $ANTLR start "rule__Intent__Group_4_0__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1113:1: rule__Intent__Group_4_0__1__Impl : ( ':' ) ;
    public final void rule__Intent__Group_4_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1117:1: ( ( ':' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1118:1: ( ':' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1118:1: ( ':' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1119:1: ':'
            {
             before(grammarAccess.getIntentAccess().getColonKeyword_4_0_1()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__Intent__Group_4_0__1__Impl2207); 
             after(grammarAccess.getIntentAccess().getColonKeyword_4_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__Group_4_0__1__Impl"


    // $ANTLR start "rule__Intent__Group_4_0__2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1132:1: rule__Intent__Group_4_0__2 : rule__Intent__Group_4_0__2__Impl rule__Intent__Group_4_0__3 ;
    public final void rule__Intent__Group_4_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1136:1: ( rule__Intent__Group_4_0__2__Impl rule__Intent__Group_4_0__3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1137:2: rule__Intent__Group_4_0__2__Impl rule__Intent__Group_4_0__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_0__2__Impl_in_rule__Intent__Group_4_0__22238);
            rule__Intent__Group_4_0__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_0__3_in_rule__Intent__Group_4_0__22241);
            rule__Intent__Group_4_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__Group_4_0__2"


    // $ANTLR start "rule__Intent__Group_4_0__2__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1144:1: rule__Intent__Group_4_0__2__Impl : ( ( rule__Intent__NameAssignment_4_0_2 ) ) ;
    public final void rule__Intent__Group_4_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1148:1: ( ( ( rule__Intent__NameAssignment_4_0_2 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1149:1: ( ( rule__Intent__NameAssignment_4_0_2 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1149:1: ( ( rule__Intent__NameAssignment_4_0_2 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1150:1: ( rule__Intent__NameAssignment_4_0_2 )
            {
             before(grammarAccess.getIntentAccess().getNameAssignment_4_0_2()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1151:1: ( rule__Intent__NameAssignment_4_0_2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1151:2: rule__Intent__NameAssignment_4_0_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__NameAssignment_4_0_2_in_rule__Intent__Group_4_0__2__Impl2268);
            rule__Intent__NameAssignment_4_0_2();

            state._fsp--;


            }

             after(grammarAccess.getIntentAccess().getNameAssignment_4_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__Group_4_0__2__Impl"


    // $ANTLR start "rule__Intent__Group_4_0__3"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1161:1: rule__Intent__Group_4_0__3 : rule__Intent__Group_4_0__3__Impl ;
    public final void rule__Intent__Group_4_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1165:1: ( rule__Intent__Group_4_0__3__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1166:2: rule__Intent__Group_4_0__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_0__3__Impl_in_rule__Intent__Group_4_0__32298);
            rule__Intent__Group_4_0__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__Group_4_0__3"


    // $ANTLR start "rule__Intent__Group_4_0__3__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1172:1: rule__Intent__Group_4_0__3__Impl : ( ',' ) ;
    public final void rule__Intent__Group_4_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1176:1: ( ( ',' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1177:1: ( ',' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1177:1: ( ',' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1178:1: ','
            {
             before(grammarAccess.getIntentAccess().getCommaKeyword_4_0_3()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Intent__Group_4_0__3__Impl2326); 
             after(grammarAccess.getIntentAccess().getCommaKeyword_4_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__Group_4_0__3__Impl"


    // $ANTLR start "rule__Intent__Group_4_1__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1199:1: rule__Intent__Group_4_1__0 : rule__Intent__Group_4_1__0__Impl rule__Intent__Group_4_1__1 ;
    public final void rule__Intent__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1203:1: ( rule__Intent__Group_4_1__0__Impl rule__Intent__Group_4_1__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1204:2: rule__Intent__Group_4_1__0__Impl rule__Intent__Group_4_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_1__0__Impl_in_rule__Intent__Group_4_1__02365);
            rule__Intent__Group_4_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_1__1_in_rule__Intent__Group_4_1__02368);
            rule__Intent__Group_4_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__Group_4_1__0"


    // $ANTLR start "rule__Intent__Group_4_1__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1211:1: rule__Intent__Group_4_1__0__Impl : ( 'Action' ) ;
    public final void rule__Intent__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1215:1: ( ( 'Action' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1216:1: ( 'Action' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1216:1: ( 'Action' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1217:1: 'Action'
            {
             before(grammarAccess.getIntentAccess().getActionKeyword_4_1_0()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__Intent__Group_4_1__0__Impl2396); 
             after(grammarAccess.getIntentAccess().getActionKeyword_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__Group_4_1__0__Impl"


    // $ANTLR start "rule__Intent__Group_4_1__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1230:1: rule__Intent__Group_4_1__1 : rule__Intent__Group_4_1__1__Impl rule__Intent__Group_4_1__2 ;
    public final void rule__Intent__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1234:1: ( rule__Intent__Group_4_1__1__Impl rule__Intent__Group_4_1__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1235:2: rule__Intent__Group_4_1__1__Impl rule__Intent__Group_4_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_1__1__Impl_in_rule__Intent__Group_4_1__12427);
            rule__Intent__Group_4_1__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_1__2_in_rule__Intent__Group_4_1__12430);
            rule__Intent__Group_4_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__Group_4_1__1"


    // $ANTLR start "rule__Intent__Group_4_1__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1242:1: rule__Intent__Group_4_1__1__Impl : ( ':' ) ;
    public final void rule__Intent__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1246:1: ( ( ':' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1247:1: ( ':' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1247:1: ( ':' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1248:1: ':'
            {
             before(grammarAccess.getIntentAccess().getColonKeyword_4_1_1()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__Intent__Group_4_1__1__Impl2458); 
             after(grammarAccess.getIntentAccess().getColonKeyword_4_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__Group_4_1__1__Impl"


    // $ANTLR start "rule__Intent__Group_4_1__2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1261:1: rule__Intent__Group_4_1__2 : rule__Intent__Group_4_1__2__Impl rule__Intent__Group_4_1__3 ;
    public final void rule__Intent__Group_4_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1265:1: ( rule__Intent__Group_4_1__2__Impl rule__Intent__Group_4_1__3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1266:2: rule__Intent__Group_4_1__2__Impl rule__Intent__Group_4_1__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_1__2__Impl_in_rule__Intent__Group_4_1__22489);
            rule__Intent__Group_4_1__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_1__3_in_rule__Intent__Group_4_1__22492);
            rule__Intent__Group_4_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__Group_4_1__2"


    // $ANTLR start "rule__Intent__Group_4_1__2__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1273:1: rule__Intent__Group_4_1__2__Impl : ( ( rule__Intent__ActionAssignment_4_1_2 ) ) ;
    public final void rule__Intent__Group_4_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1277:1: ( ( ( rule__Intent__ActionAssignment_4_1_2 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1278:1: ( ( rule__Intent__ActionAssignment_4_1_2 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1278:1: ( ( rule__Intent__ActionAssignment_4_1_2 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1279:1: ( rule__Intent__ActionAssignment_4_1_2 )
            {
             before(grammarAccess.getIntentAccess().getActionAssignment_4_1_2()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1280:1: ( rule__Intent__ActionAssignment_4_1_2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1280:2: rule__Intent__ActionAssignment_4_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__ActionAssignment_4_1_2_in_rule__Intent__Group_4_1__2__Impl2519);
            rule__Intent__ActionAssignment_4_1_2();

            state._fsp--;


            }

             after(grammarAccess.getIntentAccess().getActionAssignment_4_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__Group_4_1__2__Impl"


    // $ANTLR start "rule__Intent__Group_4_1__3"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1290:1: rule__Intent__Group_4_1__3 : rule__Intent__Group_4_1__3__Impl ;
    public final void rule__Intent__Group_4_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1294:1: ( rule__Intent__Group_4_1__3__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1295:2: rule__Intent__Group_4_1__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_1__3__Impl_in_rule__Intent__Group_4_1__32549);
            rule__Intent__Group_4_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__Group_4_1__3"


    // $ANTLR start "rule__Intent__Group_4_1__3__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1301:1: rule__Intent__Group_4_1__3__Impl : ( ',' ) ;
    public final void rule__Intent__Group_4_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1305:1: ( ( ',' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1306:1: ( ',' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1306:1: ( ',' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1307:1: ','
            {
             before(grammarAccess.getIntentAccess().getCommaKeyword_4_1_3()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Intent__Group_4_1__3__Impl2577); 
             after(grammarAccess.getIntentAccess().getCommaKeyword_4_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__Group_4_1__3__Impl"


    // $ANTLR start "rule__Intent__Group_4_2__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1328:1: rule__Intent__Group_4_2__0 : rule__Intent__Group_4_2__0__Impl rule__Intent__Group_4_2__1 ;
    public final void rule__Intent__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1332:1: ( rule__Intent__Group_4_2__0__Impl rule__Intent__Group_4_2__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1333:2: rule__Intent__Group_4_2__0__Impl rule__Intent__Group_4_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_2__0__Impl_in_rule__Intent__Group_4_2__02616);
            rule__Intent__Group_4_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_2__1_in_rule__Intent__Group_4_2__02619);
            rule__Intent__Group_4_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__Group_4_2__0"


    // $ANTLR start "rule__Intent__Group_4_2__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1340:1: rule__Intent__Group_4_2__0__Impl : ( 'Category' ) ;
    public final void rule__Intent__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1344:1: ( ( 'Category' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1345:1: ( 'Category' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1345:1: ( 'Category' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1346:1: 'Category'
            {
             before(grammarAccess.getIntentAccess().getCategoryKeyword_4_2_0()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__Intent__Group_4_2__0__Impl2647); 
             after(grammarAccess.getIntentAccess().getCategoryKeyword_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__Group_4_2__0__Impl"


    // $ANTLR start "rule__Intent__Group_4_2__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1359:1: rule__Intent__Group_4_2__1 : rule__Intent__Group_4_2__1__Impl rule__Intent__Group_4_2__2 ;
    public final void rule__Intent__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1363:1: ( rule__Intent__Group_4_2__1__Impl rule__Intent__Group_4_2__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1364:2: rule__Intent__Group_4_2__1__Impl rule__Intent__Group_4_2__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_2__1__Impl_in_rule__Intent__Group_4_2__12678);
            rule__Intent__Group_4_2__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_2__2_in_rule__Intent__Group_4_2__12681);
            rule__Intent__Group_4_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__Group_4_2__1"


    // $ANTLR start "rule__Intent__Group_4_2__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1371:1: rule__Intent__Group_4_2__1__Impl : ( ':' ) ;
    public final void rule__Intent__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1375:1: ( ( ':' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1376:1: ( ':' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1376:1: ( ':' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1377:1: ':'
            {
             before(grammarAccess.getIntentAccess().getColonKeyword_4_2_1()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__Intent__Group_4_2__1__Impl2709); 
             after(grammarAccess.getIntentAccess().getColonKeyword_4_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__Group_4_2__1__Impl"


    // $ANTLR start "rule__Intent__Group_4_2__2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1390:1: rule__Intent__Group_4_2__2 : rule__Intent__Group_4_2__2__Impl rule__Intent__Group_4_2__3 ;
    public final void rule__Intent__Group_4_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1394:1: ( rule__Intent__Group_4_2__2__Impl rule__Intent__Group_4_2__3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1395:2: rule__Intent__Group_4_2__2__Impl rule__Intent__Group_4_2__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_2__2__Impl_in_rule__Intent__Group_4_2__22740);
            rule__Intent__Group_4_2__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_2__3_in_rule__Intent__Group_4_2__22743);
            rule__Intent__Group_4_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__Group_4_2__2"


    // $ANTLR start "rule__Intent__Group_4_2__2__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1402:1: rule__Intent__Group_4_2__2__Impl : ( ( rule__Intent__CategoryAssignment_4_2_2 ) ) ;
    public final void rule__Intent__Group_4_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1406:1: ( ( ( rule__Intent__CategoryAssignment_4_2_2 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1407:1: ( ( rule__Intent__CategoryAssignment_4_2_2 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1407:1: ( ( rule__Intent__CategoryAssignment_4_2_2 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1408:1: ( rule__Intent__CategoryAssignment_4_2_2 )
            {
             before(grammarAccess.getIntentAccess().getCategoryAssignment_4_2_2()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1409:1: ( rule__Intent__CategoryAssignment_4_2_2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1409:2: rule__Intent__CategoryAssignment_4_2_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__CategoryAssignment_4_2_2_in_rule__Intent__Group_4_2__2__Impl2770);
            rule__Intent__CategoryAssignment_4_2_2();

            state._fsp--;


            }

             after(grammarAccess.getIntentAccess().getCategoryAssignment_4_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__Group_4_2__2__Impl"


    // $ANTLR start "rule__Intent__Group_4_2__3"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1419:1: rule__Intent__Group_4_2__3 : rule__Intent__Group_4_2__3__Impl ;
    public final void rule__Intent__Group_4_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1423:1: ( rule__Intent__Group_4_2__3__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1424:2: rule__Intent__Group_4_2__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_2__3__Impl_in_rule__Intent__Group_4_2__32800);
            rule__Intent__Group_4_2__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__Group_4_2__3"


    // $ANTLR start "rule__Intent__Group_4_2__3__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1430:1: rule__Intent__Group_4_2__3__Impl : ( ',' ) ;
    public final void rule__Intent__Group_4_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1434:1: ( ( ',' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1435:1: ( ',' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1435:1: ( ',' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1436:1: ','
            {
             before(grammarAccess.getIntentAccess().getCommaKeyword_4_2_3()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Intent__Group_4_2__3__Impl2828); 
             after(grammarAccess.getIntentAccess().getCommaKeyword_4_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__Group_4_2__3__Impl"


    // $ANTLR start "rule__Intent__Group_4_3__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1457:1: rule__Intent__Group_4_3__0 : rule__Intent__Group_4_3__0__Impl rule__Intent__Group_4_3__1 ;
    public final void rule__Intent__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1461:1: ( rule__Intent__Group_4_3__0__Impl rule__Intent__Group_4_3__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1462:2: rule__Intent__Group_4_3__0__Impl rule__Intent__Group_4_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_3__0__Impl_in_rule__Intent__Group_4_3__02867);
            rule__Intent__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_3__1_in_rule__Intent__Group_4_3__02870);
            rule__Intent__Group_4_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__Group_4_3__0"


    // $ANTLR start "rule__Intent__Group_4_3__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1469:1: rule__Intent__Group_4_3__0__Impl : ( 'DataURI' ) ;
    public final void rule__Intent__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1473:1: ( ( 'DataURI' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1474:1: ( 'DataURI' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1474:1: ( 'DataURI' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1475:1: 'DataURI'
            {
             before(grammarAccess.getIntentAccess().getDataURIKeyword_4_3_0()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__Intent__Group_4_3__0__Impl2898); 
             after(grammarAccess.getIntentAccess().getDataURIKeyword_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__Group_4_3__0__Impl"


    // $ANTLR start "rule__Intent__Group_4_3__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1488:1: rule__Intent__Group_4_3__1 : rule__Intent__Group_4_3__1__Impl rule__Intent__Group_4_3__2 ;
    public final void rule__Intent__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1492:1: ( rule__Intent__Group_4_3__1__Impl rule__Intent__Group_4_3__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1493:2: rule__Intent__Group_4_3__1__Impl rule__Intent__Group_4_3__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_3__1__Impl_in_rule__Intent__Group_4_3__12929);
            rule__Intent__Group_4_3__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_3__2_in_rule__Intent__Group_4_3__12932);
            rule__Intent__Group_4_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__Group_4_3__1"


    // $ANTLR start "rule__Intent__Group_4_3__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1500:1: rule__Intent__Group_4_3__1__Impl : ( ':' ) ;
    public final void rule__Intent__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1504:1: ( ( ':' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1505:1: ( ':' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1505:1: ( ':' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1506:1: ':'
            {
             before(grammarAccess.getIntentAccess().getColonKeyword_4_3_1()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__Intent__Group_4_3__1__Impl2960); 
             after(grammarAccess.getIntentAccess().getColonKeyword_4_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__Group_4_3__1__Impl"


    // $ANTLR start "rule__Intent__Group_4_3__2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1519:1: rule__Intent__Group_4_3__2 : rule__Intent__Group_4_3__2__Impl rule__Intent__Group_4_3__3 ;
    public final void rule__Intent__Group_4_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1523:1: ( rule__Intent__Group_4_3__2__Impl rule__Intent__Group_4_3__3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1524:2: rule__Intent__Group_4_3__2__Impl rule__Intent__Group_4_3__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_3__2__Impl_in_rule__Intent__Group_4_3__22991);
            rule__Intent__Group_4_3__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_3__3_in_rule__Intent__Group_4_3__22994);
            rule__Intent__Group_4_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__Group_4_3__2"


    // $ANTLR start "rule__Intent__Group_4_3__2__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1531:1: rule__Intent__Group_4_3__2__Impl : ( ( rule__Intent__DataURIAssignment_4_3_2 ) ) ;
    public final void rule__Intent__Group_4_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1535:1: ( ( ( rule__Intent__DataURIAssignment_4_3_2 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1536:1: ( ( rule__Intent__DataURIAssignment_4_3_2 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1536:1: ( ( rule__Intent__DataURIAssignment_4_3_2 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1537:1: ( rule__Intent__DataURIAssignment_4_3_2 )
            {
             before(grammarAccess.getIntentAccess().getDataURIAssignment_4_3_2()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1538:1: ( rule__Intent__DataURIAssignment_4_3_2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1538:2: rule__Intent__DataURIAssignment_4_3_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__DataURIAssignment_4_3_2_in_rule__Intent__Group_4_3__2__Impl3021);
            rule__Intent__DataURIAssignment_4_3_2();

            state._fsp--;


            }

             after(grammarAccess.getIntentAccess().getDataURIAssignment_4_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__Group_4_3__2__Impl"


    // $ANTLR start "rule__Intent__Group_4_3__3"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1548:1: rule__Intent__Group_4_3__3 : rule__Intent__Group_4_3__3__Impl ;
    public final void rule__Intent__Group_4_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1552:1: ( rule__Intent__Group_4_3__3__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1553:2: rule__Intent__Group_4_3__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_3__3__Impl_in_rule__Intent__Group_4_3__33051);
            rule__Intent__Group_4_3__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__Group_4_3__3"


    // $ANTLR start "rule__Intent__Group_4_3__3__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1559:1: rule__Intent__Group_4_3__3__Impl : ( ',' ) ;
    public final void rule__Intent__Group_4_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1563:1: ( ( ',' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1564:1: ( ',' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1564:1: ( ',' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1565:1: ','
            {
             before(grammarAccess.getIntentAccess().getCommaKeyword_4_3_3()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Intent__Group_4_3__3__Impl3079); 
             after(grammarAccess.getIntentAccess().getCommaKeyword_4_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__Group_4_3__3__Impl"


    // $ANTLR start "rule__Intent__Group_4_4__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1586:1: rule__Intent__Group_4_4__0 : rule__Intent__Group_4_4__0__Impl rule__Intent__Group_4_4__1 ;
    public final void rule__Intent__Group_4_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1590:1: ( rule__Intent__Group_4_4__0__Impl rule__Intent__Group_4_4__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1591:2: rule__Intent__Group_4_4__0__Impl rule__Intent__Group_4_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_4__0__Impl_in_rule__Intent__Group_4_4__03118);
            rule__Intent__Group_4_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_4__1_in_rule__Intent__Group_4_4__03121);
            rule__Intent__Group_4_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__Group_4_4__0"


    // $ANTLR start "rule__Intent__Group_4_4__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1598:1: rule__Intent__Group_4_4__0__Impl : ( 'DataExtra' ) ;
    public final void rule__Intent__Group_4_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1602:1: ( ( 'DataExtra' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1603:1: ( 'DataExtra' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1603:1: ( 'DataExtra' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1604:1: 'DataExtra'
            {
             before(grammarAccess.getIntentAccess().getDataExtraKeyword_4_4_0()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__Intent__Group_4_4__0__Impl3149); 
             after(grammarAccess.getIntentAccess().getDataExtraKeyword_4_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__Group_4_4__0__Impl"


    // $ANTLR start "rule__Intent__Group_4_4__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1617:1: rule__Intent__Group_4_4__1 : rule__Intent__Group_4_4__1__Impl rule__Intent__Group_4_4__2 ;
    public final void rule__Intent__Group_4_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1621:1: ( rule__Intent__Group_4_4__1__Impl rule__Intent__Group_4_4__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1622:2: rule__Intent__Group_4_4__1__Impl rule__Intent__Group_4_4__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_4__1__Impl_in_rule__Intent__Group_4_4__13180);
            rule__Intent__Group_4_4__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_4__2_in_rule__Intent__Group_4_4__13183);
            rule__Intent__Group_4_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__Group_4_4__1"


    // $ANTLR start "rule__Intent__Group_4_4__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1629:1: rule__Intent__Group_4_4__1__Impl : ( ':' ) ;
    public final void rule__Intent__Group_4_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1633:1: ( ( ':' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1634:1: ( ':' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1634:1: ( ':' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1635:1: ':'
            {
             before(grammarAccess.getIntentAccess().getColonKeyword_4_4_1()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__Intent__Group_4_4__1__Impl3211); 
             after(grammarAccess.getIntentAccess().getColonKeyword_4_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__Group_4_4__1__Impl"


    // $ANTLR start "rule__Intent__Group_4_4__2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1648:1: rule__Intent__Group_4_4__2 : rule__Intent__Group_4_4__2__Impl rule__Intent__Group_4_4__3 ;
    public final void rule__Intent__Group_4_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1652:1: ( rule__Intent__Group_4_4__2__Impl rule__Intent__Group_4_4__3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1653:2: rule__Intent__Group_4_4__2__Impl rule__Intent__Group_4_4__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_4__2__Impl_in_rule__Intent__Group_4_4__23242);
            rule__Intent__Group_4_4__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_4__3_in_rule__Intent__Group_4_4__23245);
            rule__Intent__Group_4_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__Group_4_4__2"


    // $ANTLR start "rule__Intent__Group_4_4__2__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1660:1: rule__Intent__Group_4_4__2__Impl : ( '[' ) ;
    public final void rule__Intent__Group_4_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1664:1: ( ( '[' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1665:1: ( '[' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1665:1: ( '[' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1666:1: '['
            {
             before(grammarAccess.getIntentAccess().getLeftSquareBracketKeyword_4_4_2()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__Intent__Group_4_4__2__Impl3273); 
             after(grammarAccess.getIntentAccess().getLeftSquareBracketKeyword_4_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__Group_4_4__2__Impl"


    // $ANTLR start "rule__Intent__Group_4_4__3"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1679:1: rule__Intent__Group_4_4__3 : rule__Intent__Group_4_4__3__Impl rule__Intent__Group_4_4__4 ;
    public final void rule__Intent__Group_4_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1683:1: ( rule__Intent__Group_4_4__3__Impl rule__Intent__Group_4_4__4 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1684:2: rule__Intent__Group_4_4__3__Impl rule__Intent__Group_4_4__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_4__3__Impl_in_rule__Intent__Group_4_4__33304);
            rule__Intent__Group_4_4__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_4__4_in_rule__Intent__Group_4_4__33307);
            rule__Intent__Group_4_4__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__Group_4_4__3"


    // $ANTLR start "rule__Intent__Group_4_4__3__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1691:1: rule__Intent__Group_4_4__3__Impl : ( ( rule__Intent__ExtraDataAssignment_4_4_3 ) ) ;
    public final void rule__Intent__Group_4_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1695:1: ( ( ( rule__Intent__ExtraDataAssignment_4_4_3 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1696:1: ( ( rule__Intent__ExtraDataAssignment_4_4_3 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1696:1: ( ( rule__Intent__ExtraDataAssignment_4_4_3 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1697:1: ( rule__Intent__ExtraDataAssignment_4_4_3 )
            {
             before(grammarAccess.getIntentAccess().getExtraDataAssignment_4_4_3()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1698:1: ( rule__Intent__ExtraDataAssignment_4_4_3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1698:2: rule__Intent__ExtraDataAssignment_4_4_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__ExtraDataAssignment_4_4_3_in_rule__Intent__Group_4_4__3__Impl3334);
            rule__Intent__ExtraDataAssignment_4_4_3();

            state._fsp--;


            }

             after(grammarAccess.getIntentAccess().getExtraDataAssignment_4_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__Group_4_4__3__Impl"


    // $ANTLR start "rule__Intent__Group_4_4__4"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1708:1: rule__Intent__Group_4_4__4 : rule__Intent__Group_4_4__4__Impl rule__Intent__Group_4_4__5 ;
    public final void rule__Intent__Group_4_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1712:1: ( rule__Intent__Group_4_4__4__Impl rule__Intent__Group_4_4__5 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1713:2: rule__Intent__Group_4_4__4__Impl rule__Intent__Group_4_4__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_4__4__Impl_in_rule__Intent__Group_4_4__43364);
            rule__Intent__Group_4_4__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_4__5_in_rule__Intent__Group_4_4__43367);
            rule__Intent__Group_4_4__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__Group_4_4__4"


    // $ANTLR start "rule__Intent__Group_4_4__4__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1720:1: rule__Intent__Group_4_4__4__Impl : ( ( rule__Intent__Group_4_4_4__0 )* ) ;
    public final void rule__Intent__Group_4_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1724:1: ( ( ( rule__Intent__Group_4_4_4__0 )* ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1725:1: ( ( rule__Intent__Group_4_4_4__0 )* )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1725:1: ( ( rule__Intent__Group_4_4_4__0 )* )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1726:1: ( rule__Intent__Group_4_4_4__0 )*
            {
             before(grammarAccess.getIntentAccess().getGroup_4_4_4()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1727:1: ( rule__Intent__Group_4_4_4__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==16) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1727:2: rule__Intent__Group_4_4_4__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_4_4__0_in_rule__Intent__Group_4_4__4__Impl3394);
            	    rule__Intent__Group_4_4_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getIntentAccess().getGroup_4_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__Group_4_4__4__Impl"


    // $ANTLR start "rule__Intent__Group_4_4__5"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1737:1: rule__Intent__Group_4_4__5 : rule__Intent__Group_4_4__5__Impl rule__Intent__Group_4_4__6 ;
    public final void rule__Intent__Group_4_4__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1741:1: ( rule__Intent__Group_4_4__5__Impl rule__Intent__Group_4_4__6 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1742:2: rule__Intent__Group_4_4__5__Impl rule__Intent__Group_4_4__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_4__5__Impl_in_rule__Intent__Group_4_4__53425);
            rule__Intent__Group_4_4__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_4__6_in_rule__Intent__Group_4_4__53428);
            rule__Intent__Group_4_4__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__Group_4_4__5"


    // $ANTLR start "rule__Intent__Group_4_4__5__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1749:1: rule__Intent__Group_4_4__5__Impl : ( ']' ) ;
    public final void rule__Intent__Group_4_4__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1753:1: ( ( ']' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1754:1: ( ']' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1754:1: ( ']' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1755:1: ']'
            {
             before(grammarAccess.getIntentAccess().getRightSquareBracketKeyword_4_4_5()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__Intent__Group_4_4__5__Impl3456); 
             after(grammarAccess.getIntentAccess().getRightSquareBracketKeyword_4_4_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__Group_4_4__5__Impl"


    // $ANTLR start "rule__Intent__Group_4_4__6"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1768:1: rule__Intent__Group_4_4__6 : rule__Intent__Group_4_4__6__Impl ;
    public final void rule__Intent__Group_4_4__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1772:1: ( rule__Intent__Group_4_4__6__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1773:2: rule__Intent__Group_4_4__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_4__6__Impl_in_rule__Intent__Group_4_4__63487);
            rule__Intent__Group_4_4__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__Group_4_4__6"


    // $ANTLR start "rule__Intent__Group_4_4__6__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1779:1: rule__Intent__Group_4_4__6__Impl : ( ',' ) ;
    public final void rule__Intent__Group_4_4__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1783:1: ( ( ',' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1784:1: ( ',' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1784:1: ( ',' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1785:1: ','
            {
             before(grammarAccess.getIntentAccess().getCommaKeyword_4_4_6()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Intent__Group_4_4__6__Impl3515); 
             after(grammarAccess.getIntentAccess().getCommaKeyword_4_4_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__Group_4_4__6__Impl"


    // $ANTLR start "rule__Intent__Group_4_4_4__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1812:1: rule__Intent__Group_4_4_4__0 : rule__Intent__Group_4_4_4__0__Impl rule__Intent__Group_4_4_4__1 ;
    public final void rule__Intent__Group_4_4_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1816:1: ( rule__Intent__Group_4_4_4__0__Impl rule__Intent__Group_4_4_4__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1817:2: rule__Intent__Group_4_4_4__0__Impl rule__Intent__Group_4_4_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_4_4__0__Impl_in_rule__Intent__Group_4_4_4__03560);
            rule__Intent__Group_4_4_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_4_4__1_in_rule__Intent__Group_4_4_4__03563);
            rule__Intent__Group_4_4_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__Group_4_4_4__0"


    // $ANTLR start "rule__Intent__Group_4_4_4__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1824:1: rule__Intent__Group_4_4_4__0__Impl : ( ',' ) ;
    public final void rule__Intent__Group_4_4_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1828:1: ( ( ',' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1829:1: ( ',' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1829:1: ( ',' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1830:1: ','
            {
             before(grammarAccess.getIntentAccess().getCommaKeyword_4_4_4_0()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Intent__Group_4_4_4__0__Impl3591); 
             after(grammarAccess.getIntentAccess().getCommaKeyword_4_4_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__Group_4_4_4__0__Impl"


    // $ANTLR start "rule__Intent__Group_4_4_4__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1843:1: rule__Intent__Group_4_4_4__1 : rule__Intent__Group_4_4_4__1__Impl ;
    public final void rule__Intent__Group_4_4_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1847:1: ( rule__Intent__Group_4_4_4__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1848:2: rule__Intent__Group_4_4_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_4_4__1__Impl_in_rule__Intent__Group_4_4_4__13622);
            rule__Intent__Group_4_4_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__Group_4_4_4__1"


    // $ANTLR start "rule__Intent__Group_4_4_4__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1854:1: rule__Intent__Group_4_4_4__1__Impl : ( ( rule__Intent__ExtraDataAssignment_4_4_4_1 ) ) ;
    public final void rule__Intent__Group_4_4_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1858:1: ( ( ( rule__Intent__ExtraDataAssignment_4_4_4_1 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1859:1: ( ( rule__Intent__ExtraDataAssignment_4_4_4_1 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1859:1: ( ( rule__Intent__ExtraDataAssignment_4_4_4_1 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1860:1: ( rule__Intent__ExtraDataAssignment_4_4_4_1 )
            {
             before(grammarAccess.getIntentAccess().getExtraDataAssignment_4_4_4_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1861:1: ( rule__Intent__ExtraDataAssignment_4_4_4_1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1861:2: rule__Intent__ExtraDataAssignment_4_4_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__ExtraDataAssignment_4_4_4_1_in_rule__Intent__Group_4_4_4__1__Impl3649);
            rule__Intent__ExtraDataAssignment_4_4_4_1();

            state._fsp--;


            }

             after(grammarAccess.getIntentAccess().getExtraDataAssignment_4_4_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__Group_4_4_4__1__Impl"


    // $ANTLR start "rule__Intent__Group_4_5__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1875:1: rule__Intent__Group_4_5__0 : rule__Intent__Group_4_5__0__Impl rule__Intent__Group_4_5__1 ;
    public final void rule__Intent__Group_4_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1879:1: ( rule__Intent__Group_4_5__0__Impl rule__Intent__Group_4_5__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1880:2: rule__Intent__Group_4_5__0__Impl rule__Intent__Group_4_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_5__0__Impl_in_rule__Intent__Group_4_5__03683);
            rule__Intent__Group_4_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_5__1_in_rule__Intent__Group_4_5__03686);
            rule__Intent__Group_4_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__Group_4_5__0"


    // $ANTLR start "rule__Intent__Group_4_5__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1887:1: rule__Intent__Group_4_5__0__Impl : ( 'ReturnData' ) ;
    public final void rule__Intent__Group_4_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1891:1: ( ( 'ReturnData' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1892:1: ( 'ReturnData' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1892:1: ( 'ReturnData' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1893:1: 'ReturnData'
            {
             before(grammarAccess.getIntentAccess().getReturnDataKeyword_4_5_0()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__Intent__Group_4_5__0__Impl3714); 
             after(grammarAccess.getIntentAccess().getReturnDataKeyword_4_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__Group_4_5__0__Impl"


    // $ANTLR start "rule__Intent__Group_4_5__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1906:1: rule__Intent__Group_4_5__1 : rule__Intent__Group_4_5__1__Impl rule__Intent__Group_4_5__2 ;
    public final void rule__Intent__Group_4_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1910:1: ( rule__Intent__Group_4_5__1__Impl rule__Intent__Group_4_5__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1911:2: rule__Intent__Group_4_5__1__Impl rule__Intent__Group_4_5__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_5__1__Impl_in_rule__Intent__Group_4_5__13745);
            rule__Intent__Group_4_5__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_5__2_in_rule__Intent__Group_4_5__13748);
            rule__Intent__Group_4_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__Group_4_5__1"


    // $ANTLR start "rule__Intent__Group_4_5__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1918:1: rule__Intent__Group_4_5__1__Impl : ( ':' ) ;
    public final void rule__Intent__Group_4_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1922:1: ( ( ':' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1923:1: ( ':' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1923:1: ( ':' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1924:1: ':'
            {
             before(grammarAccess.getIntentAccess().getColonKeyword_4_5_1()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__Intent__Group_4_5__1__Impl3776); 
             after(grammarAccess.getIntentAccess().getColonKeyword_4_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__Group_4_5__1__Impl"


    // $ANTLR start "rule__Intent__Group_4_5__2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1937:1: rule__Intent__Group_4_5__2 : rule__Intent__Group_4_5__2__Impl rule__Intent__Group_4_5__3 ;
    public final void rule__Intent__Group_4_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1941:1: ( rule__Intent__Group_4_5__2__Impl rule__Intent__Group_4_5__3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1942:2: rule__Intent__Group_4_5__2__Impl rule__Intent__Group_4_5__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_5__2__Impl_in_rule__Intent__Group_4_5__23807);
            rule__Intent__Group_4_5__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_5__3_in_rule__Intent__Group_4_5__23810);
            rule__Intent__Group_4_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__Group_4_5__2"


    // $ANTLR start "rule__Intent__Group_4_5__2__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1949:1: rule__Intent__Group_4_5__2__Impl : ( '[' ) ;
    public final void rule__Intent__Group_4_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1953:1: ( ( '[' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1954:1: ( '[' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1954:1: ( '[' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1955:1: '['
            {
             before(grammarAccess.getIntentAccess().getLeftSquareBracketKeyword_4_5_2()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__Intent__Group_4_5__2__Impl3838); 
             after(grammarAccess.getIntentAccess().getLeftSquareBracketKeyword_4_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__Group_4_5__2__Impl"


    // $ANTLR start "rule__Intent__Group_4_5__3"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1968:1: rule__Intent__Group_4_5__3 : rule__Intent__Group_4_5__3__Impl rule__Intent__Group_4_5__4 ;
    public final void rule__Intent__Group_4_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1972:1: ( rule__Intent__Group_4_5__3__Impl rule__Intent__Group_4_5__4 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1973:2: rule__Intent__Group_4_5__3__Impl rule__Intent__Group_4_5__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_5__3__Impl_in_rule__Intent__Group_4_5__33869);
            rule__Intent__Group_4_5__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_5__4_in_rule__Intent__Group_4_5__33872);
            rule__Intent__Group_4_5__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__Group_4_5__3"


    // $ANTLR start "rule__Intent__Group_4_5__3__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1980:1: rule__Intent__Group_4_5__3__Impl : ( ( rule__Intent__ReturnDataAssignment_4_5_3 ) ) ;
    public final void rule__Intent__Group_4_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1984:1: ( ( ( rule__Intent__ReturnDataAssignment_4_5_3 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1985:1: ( ( rule__Intent__ReturnDataAssignment_4_5_3 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1985:1: ( ( rule__Intent__ReturnDataAssignment_4_5_3 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1986:1: ( rule__Intent__ReturnDataAssignment_4_5_3 )
            {
             before(grammarAccess.getIntentAccess().getReturnDataAssignment_4_5_3()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1987:1: ( rule__Intent__ReturnDataAssignment_4_5_3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1987:2: rule__Intent__ReturnDataAssignment_4_5_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__ReturnDataAssignment_4_5_3_in_rule__Intent__Group_4_5__3__Impl3899);
            rule__Intent__ReturnDataAssignment_4_5_3();

            state._fsp--;


            }

             after(grammarAccess.getIntentAccess().getReturnDataAssignment_4_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__Group_4_5__3__Impl"


    // $ANTLR start "rule__Intent__Group_4_5__4"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1997:1: rule__Intent__Group_4_5__4 : rule__Intent__Group_4_5__4__Impl rule__Intent__Group_4_5__5 ;
    public final void rule__Intent__Group_4_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2001:1: ( rule__Intent__Group_4_5__4__Impl rule__Intent__Group_4_5__5 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2002:2: rule__Intent__Group_4_5__4__Impl rule__Intent__Group_4_5__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_5__4__Impl_in_rule__Intent__Group_4_5__43929);
            rule__Intent__Group_4_5__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_5__5_in_rule__Intent__Group_4_5__43932);
            rule__Intent__Group_4_5__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__Group_4_5__4"


    // $ANTLR start "rule__Intent__Group_4_5__4__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2009:1: rule__Intent__Group_4_5__4__Impl : ( ( rule__Intent__Group_4_5_4__0 )* ) ;
    public final void rule__Intent__Group_4_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2013:1: ( ( ( rule__Intent__Group_4_5_4__0 )* ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2014:1: ( ( rule__Intent__Group_4_5_4__0 )* )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2014:1: ( ( rule__Intent__Group_4_5_4__0 )* )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2015:1: ( rule__Intent__Group_4_5_4__0 )*
            {
             before(grammarAccess.getIntentAccess().getGroup_4_5_4()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2016:1: ( rule__Intent__Group_4_5_4__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==16) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2016:2: rule__Intent__Group_4_5_4__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_5_4__0_in_rule__Intent__Group_4_5__4__Impl3959);
            	    rule__Intent__Group_4_5_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getIntentAccess().getGroup_4_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__Group_4_5__4__Impl"


    // $ANTLR start "rule__Intent__Group_4_5__5"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2026:1: rule__Intent__Group_4_5__5 : rule__Intent__Group_4_5__5__Impl rule__Intent__Group_4_5__6 ;
    public final void rule__Intent__Group_4_5__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2030:1: ( rule__Intent__Group_4_5__5__Impl rule__Intent__Group_4_5__6 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2031:2: rule__Intent__Group_4_5__5__Impl rule__Intent__Group_4_5__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_5__5__Impl_in_rule__Intent__Group_4_5__53990);
            rule__Intent__Group_4_5__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_5__6_in_rule__Intent__Group_4_5__53993);
            rule__Intent__Group_4_5__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__Group_4_5__5"


    // $ANTLR start "rule__Intent__Group_4_5__5__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2038:1: rule__Intent__Group_4_5__5__Impl : ( ']' ) ;
    public final void rule__Intent__Group_4_5__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2042:1: ( ( ']' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2043:1: ( ']' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2043:1: ( ']' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2044:1: ']'
            {
             before(grammarAccess.getIntentAccess().getRightSquareBracketKeyword_4_5_5()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__Intent__Group_4_5__5__Impl4021); 
             after(grammarAccess.getIntentAccess().getRightSquareBracketKeyword_4_5_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__Group_4_5__5__Impl"


    // $ANTLR start "rule__Intent__Group_4_5__6"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2057:1: rule__Intent__Group_4_5__6 : rule__Intent__Group_4_5__6__Impl ;
    public final void rule__Intent__Group_4_5__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2061:1: ( rule__Intent__Group_4_5__6__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2062:2: rule__Intent__Group_4_5__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_5__6__Impl_in_rule__Intent__Group_4_5__64052);
            rule__Intent__Group_4_5__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__Group_4_5__6"


    // $ANTLR start "rule__Intent__Group_4_5__6__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2068:1: rule__Intent__Group_4_5__6__Impl : ( ',' ) ;
    public final void rule__Intent__Group_4_5__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2072:1: ( ( ',' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2073:1: ( ',' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2073:1: ( ',' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2074:1: ','
            {
             before(grammarAccess.getIntentAccess().getCommaKeyword_4_5_6()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Intent__Group_4_5__6__Impl4080); 
             after(grammarAccess.getIntentAccess().getCommaKeyword_4_5_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__Group_4_5__6__Impl"


    // $ANTLR start "rule__Intent__Group_4_5_4__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2101:1: rule__Intent__Group_4_5_4__0 : rule__Intent__Group_4_5_4__0__Impl rule__Intent__Group_4_5_4__1 ;
    public final void rule__Intent__Group_4_5_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2105:1: ( rule__Intent__Group_4_5_4__0__Impl rule__Intent__Group_4_5_4__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2106:2: rule__Intent__Group_4_5_4__0__Impl rule__Intent__Group_4_5_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_5_4__0__Impl_in_rule__Intent__Group_4_5_4__04125);
            rule__Intent__Group_4_5_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_5_4__1_in_rule__Intent__Group_4_5_4__04128);
            rule__Intent__Group_4_5_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__Group_4_5_4__0"


    // $ANTLR start "rule__Intent__Group_4_5_4__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2113:1: rule__Intent__Group_4_5_4__0__Impl : ( ',' ) ;
    public final void rule__Intent__Group_4_5_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2117:1: ( ( ',' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2118:1: ( ',' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2118:1: ( ',' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2119:1: ','
            {
             before(grammarAccess.getIntentAccess().getCommaKeyword_4_5_4_0()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Intent__Group_4_5_4__0__Impl4156); 
             after(grammarAccess.getIntentAccess().getCommaKeyword_4_5_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__Group_4_5_4__0__Impl"


    // $ANTLR start "rule__Intent__Group_4_5_4__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2132:1: rule__Intent__Group_4_5_4__1 : rule__Intent__Group_4_5_4__1__Impl ;
    public final void rule__Intent__Group_4_5_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2136:1: ( rule__Intent__Group_4_5_4__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2137:2: rule__Intent__Group_4_5_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_5_4__1__Impl_in_rule__Intent__Group_4_5_4__14187);
            rule__Intent__Group_4_5_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__Group_4_5_4__1"


    // $ANTLR start "rule__Intent__Group_4_5_4__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2143:1: rule__Intent__Group_4_5_4__1__Impl : ( ( rule__Intent__ReturnDataAssignment_4_5_4_1 ) ) ;
    public final void rule__Intent__Group_4_5_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2147:1: ( ( ( rule__Intent__ReturnDataAssignment_4_5_4_1 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2148:1: ( ( rule__Intent__ReturnDataAssignment_4_5_4_1 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2148:1: ( ( rule__Intent__ReturnDataAssignment_4_5_4_1 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2149:1: ( rule__Intent__ReturnDataAssignment_4_5_4_1 )
            {
             before(grammarAccess.getIntentAccess().getReturnDataAssignment_4_5_4_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2150:1: ( rule__Intent__ReturnDataAssignment_4_5_4_1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2150:2: rule__Intent__ReturnDataAssignment_4_5_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__ReturnDataAssignment_4_5_4_1_in_rule__Intent__Group_4_5_4__1__Impl4214);
            rule__Intent__ReturnDataAssignment_4_5_4_1();

            state._fsp--;


            }

             after(grammarAccess.getIntentAccess().getReturnDataAssignment_4_5_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__Group_4_5_4__1__Impl"


    // $ANTLR start "rule__ExtraData__Group__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2164:1: rule__ExtraData__Group__0 : rule__ExtraData__Group__0__Impl rule__ExtraData__Group__1 ;
    public final void rule__ExtraData__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2168:1: ( rule__ExtraData__Group__0__Impl rule__ExtraData__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2169:2: rule__ExtraData__Group__0__Impl rule__ExtraData__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtraData__Group__0__Impl_in_rule__ExtraData__Group__04248);
            rule__ExtraData__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ExtraData__Group__1_in_rule__ExtraData__Group__04251);
            rule__ExtraData__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtraData__Group__0"


    // $ANTLR start "rule__ExtraData__Group__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2176:1: rule__ExtraData__Group__0__Impl : ( () ) ;
    public final void rule__ExtraData__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2180:1: ( ( () ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2181:1: ( () )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2181:1: ( () )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2182:1: ()
            {
             before(grammarAccess.getExtraDataAccess().getExtraDataAction_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2183:1: ()
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2185:1: 
            {
            }

             after(grammarAccess.getExtraDataAccess().getExtraDataAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtraData__Group__0__Impl"


    // $ANTLR start "rule__ExtraData__Group__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2195:1: rule__ExtraData__Group__1 : rule__ExtraData__Group__1__Impl rule__ExtraData__Group__2 ;
    public final void rule__ExtraData__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2199:1: ( rule__ExtraData__Group__1__Impl rule__ExtraData__Group__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2200:2: rule__ExtraData__Group__1__Impl rule__ExtraData__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtraData__Group__1__Impl_in_rule__ExtraData__Group__14309);
            rule__ExtraData__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ExtraData__Group__2_in_rule__ExtraData__Group__14312);
            rule__ExtraData__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtraData__Group__1"


    // $ANTLR start "rule__ExtraData__Group__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2207:1: rule__ExtraData__Group__1__Impl : ( '{' ) ;
    public final void rule__ExtraData__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2211:1: ( ( '{' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2212:1: ( '{' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2212:1: ( '{' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2213:1: '{'
            {
             before(grammarAccess.getExtraDataAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__ExtraData__Group__1__Impl4340); 
             after(grammarAccess.getExtraDataAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtraData__Group__1__Impl"


    // $ANTLR start "rule__ExtraData__Group__2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2226:1: rule__ExtraData__Group__2 : rule__ExtraData__Group__2__Impl rule__ExtraData__Group__3 ;
    public final void rule__ExtraData__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2230:1: ( rule__ExtraData__Group__2__Impl rule__ExtraData__Group__3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2231:2: rule__ExtraData__Group__2__Impl rule__ExtraData__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtraData__Group__2__Impl_in_rule__ExtraData__Group__24371);
            rule__ExtraData__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ExtraData__Group__3_in_rule__ExtraData__Group__24374);
            rule__ExtraData__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtraData__Group__2"


    // $ANTLR start "rule__ExtraData__Group__2__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2238:1: rule__ExtraData__Group__2__Impl : ( ( rule__ExtraData__Group_2__0 ) ) ;
    public final void rule__ExtraData__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2242:1: ( ( ( rule__ExtraData__Group_2__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2243:1: ( ( rule__ExtraData__Group_2__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2243:1: ( ( rule__ExtraData__Group_2__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2244:1: ( rule__ExtraData__Group_2__0 )
            {
             before(grammarAccess.getExtraDataAccess().getGroup_2()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2245:1: ( rule__ExtraData__Group_2__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2245:2: rule__ExtraData__Group_2__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtraData__Group_2__0_in_rule__ExtraData__Group__2__Impl4401);
            rule__ExtraData__Group_2__0();

            state._fsp--;


            }

             after(grammarAccess.getExtraDataAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtraData__Group__2__Impl"


    // $ANTLR start "rule__ExtraData__Group__3"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2255:1: rule__ExtraData__Group__3 : rule__ExtraData__Group__3__Impl rule__ExtraData__Group__4 ;
    public final void rule__ExtraData__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2259:1: ( rule__ExtraData__Group__3__Impl rule__ExtraData__Group__4 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2260:2: rule__ExtraData__Group__3__Impl rule__ExtraData__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtraData__Group__3__Impl_in_rule__ExtraData__Group__34431);
            rule__ExtraData__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ExtraData__Group__4_in_rule__ExtraData__Group__34434);
            rule__ExtraData__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtraData__Group__3"


    // $ANTLR start "rule__ExtraData__Group__3__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2267:1: rule__ExtraData__Group__3__Impl : ( ( rule__ExtraData__Group_3__0 ) ) ;
    public final void rule__ExtraData__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2271:1: ( ( ( rule__ExtraData__Group_3__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2272:1: ( ( rule__ExtraData__Group_3__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2272:1: ( ( rule__ExtraData__Group_3__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2273:1: ( rule__ExtraData__Group_3__0 )
            {
             before(grammarAccess.getExtraDataAccess().getGroup_3()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2274:1: ( rule__ExtraData__Group_3__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2274:2: rule__ExtraData__Group_3__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtraData__Group_3__0_in_rule__ExtraData__Group__3__Impl4461);
            rule__ExtraData__Group_3__0();

            state._fsp--;


            }

             after(grammarAccess.getExtraDataAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtraData__Group__3__Impl"


    // $ANTLR start "rule__ExtraData__Group__4"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2284:1: rule__ExtraData__Group__4 : rule__ExtraData__Group__4__Impl ;
    public final void rule__ExtraData__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2288:1: ( rule__ExtraData__Group__4__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2289:2: rule__ExtraData__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtraData__Group__4__Impl_in_rule__ExtraData__Group__44491);
            rule__ExtraData__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtraData__Group__4"


    // $ANTLR start "rule__ExtraData__Group__4__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2295:1: rule__ExtraData__Group__4__Impl : ( '}' ) ;
    public final void rule__ExtraData__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2299:1: ( ( '}' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2300:1: ( '}' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2300:1: ( '}' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2301:1: '}'
            {
             before(grammarAccess.getExtraDataAccess().getRightCurlyBracketKeyword_4()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__ExtraData__Group__4__Impl4519); 
             after(grammarAccess.getExtraDataAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtraData__Group__4__Impl"


    // $ANTLR start "rule__ExtraData__Group_2__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2324:1: rule__ExtraData__Group_2__0 : rule__ExtraData__Group_2__0__Impl rule__ExtraData__Group_2__1 ;
    public final void rule__ExtraData__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2328:1: ( rule__ExtraData__Group_2__0__Impl rule__ExtraData__Group_2__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2329:2: rule__ExtraData__Group_2__0__Impl rule__ExtraData__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtraData__Group_2__0__Impl_in_rule__ExtraData__Group_2__04560);
            rule__ExtraData__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ExtraData__Group_2__1_in_rule__ExtraData__Group_2__04563);
            rule__ExtraData__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtraData__Group_2__0"


    // $ANTLR start "rule__ExtraData__Group_2__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2336:1: rule__ExtraData__Group_2__0__Impl : ( 'Name' ) ;
    public final void rule__ExtraData__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2340:1: ( ( 'Name' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2341:1: ( 'Name' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2341:1: ( 'Name' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2342:1: 'Name'
            {
             before(grammarAccess.getExtraDataAccess().getNameKeyword_2_0()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__ExtraData__Group_2__0__Impl4591); 
             after(grammarAccess.getExtraDataAccess().getNameKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtraData__Group_2__0__Impl"


    // $ANTLR start "rule__ExtraData__Group_2__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2355:1: rule__ExtraData__Group_2__1 : rule__ExtraData__Group_2__1__Impl rule__ExtraData__Group_2__2 ;
    public final void rule__ExtraData__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2359:1: ( rule__ExtraData__Group_2__1__Impl rule__ExtraData__Group_2__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2360:2: rule__ExtraData__Group_2__1__Impl rule__ExtraData__Group_2__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtraData__Group_2__1__Impl_in_rule__ExtraData__Group_2__14622);
            rule__ExtraData__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ExtraData__Group_2__2_in_rule__ExtraData__Group_2__14625);
            rule__ExtraData__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtraData__Group_2__1"


    // $ANTLR start "rule__ExtraData__Group_2__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2367:1: rule__ExtraData__Group_2__1__Impl : ( ':' ) ;
    public final void rule__ExtraData__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2371:1: ( ( ':' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2372:1: ( ':' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2372:1: ( ':' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2373:1: ':'
            {
             before(grammarAccess.getExtraDataAccess().getColonKeyword_2_1()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__ExtraData__Group_2__1__Impl4653); 
             after(grammarAccess.getExtraDataAccess().getColonKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtraData__Group_2__1__Impl"


    // $ANTLR start "rule__ExtraData__Group_2__2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2386:1: rule__ExtraData__Group_2__2 : rule__ExtraData__Group_2__2__Impl ;
    public final void rule__ExtraData__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2390:1: ( rule__ExtraData__Group_2__2__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2391:2: rule__ExtraData__Group_2__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtraData__Group_2__2__Impl_in_rule__ExtraData__Group_2__24684);
            rule__ExtraData__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtraData__Group_2__2"


    // $ANTLR start "rule__ExtraData__Group_2__2__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2397:1: rule__ExtraData__Group_2__2__Impl : ( ( rule__ExtraData__NameAssignment_2_2 ) ) ;
    public final void rule__ExtraData__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2401:1: ( ( ( rule__ExtraData__NameAssignment_2_2 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2402:1: ( ( rule__ExtraData__NameAssignment_2_2 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2402:1: ( ( rule__ExtraData__NameAssignment_2_2 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2403:1: ( rule__ExtraData__NameAssignment_2_2 )
            {
             before(grammarAccess.getExtraDataAccess().getNameAssignment_2_2()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2404:1: ( rule__ExtraData__NameAssignment_2_2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2404:2: rule__ExtraData__NameAssignment_2_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtraData__NameAssignment_2_2_in_rule__ExtraData__Group_2__2__Impl4711);
            rule__ExtraData__NameAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getExtraDataAccess().getNameAssignment_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtraData__Group_2__2__Impl"


    // $ANTLR start "rule__ExtraData__Group_3__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2420:1: rule__ExtraData__Group_3__0 : rule__ExtraData__Group_3__0__Impl rule__ExtraData__Group_3__1 ;
    public final void rule__ExtraData__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2424:1: ( rule__ExtraData__Group_3__0__Impl rule__ExtraData__Group_3__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2425:2: rule__ExtraData__Group_3__0__Impl rule__ExtraData__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtraData__Group_3__0__Impl_in_rule__ExtraData__Group_3__04747);
            rule__ExtraData__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ExtraData__Group_3__1_in_rule__ExtraData__Group_3__04750);
            rule__ExtraData__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtraData__Group_3__0"


    // $ANTLR start "rule__ExtraData__Group_3__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2432:1: rule__ExtraData__Group_3__0__Impl : ( 'Type' ) ;
    public final void rule__ExtraData__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2436:1: ( ( 'Type' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2437:1: ( 'Type' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2437:1: ( 'Type' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2438:1: 'Type'
            {
             before(grammarAccess.getExtraDataAccess().getTypeKeyword_3_0()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__ExtraData__Group_3__0__Impl4778); 
             after(grammarAccess.getExtraDataAccess().getTypeKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtraData__Group_3__0__Impl"


    // $ANTLR start "rule__ExtraData__Group_3__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2451:1: rule__ExtraData__Group_3__1 : rule__ExtraData__Group_3__1__Impl rule__ExtraData__Group_3__2 ;
    public final void rule__ExtraData__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2455:1: ( rule__ExtraData__Group_3__1__Impl rule__ExtraData__Group_3__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2456:2: rule__ExtraData__Group_3__1__Impl rule__ExtraData__Group_3__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtraData__Group_3__1__Impl_in_rule__ExtraData__Group_3__14809);
            rule__ExtraData__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ExtraData__Group_3__2_in_rule__ExtraData__Group_3__14812);
            rule__ExtraData__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtraData__Group_3__1"


    // $ANTLR start "rule__ExtraData__Group_3__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2463:1: rule__ExtraData__Group_3__1__Impl : ( ':' ) ;
    public final void rule__ExtraData__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2467:1: ( ( ':' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2468:1: ( ':' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2468:1: ( ':' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2469:1: ':'
            {
             before(grammarAccess.getExtraDataAccess().getColonKeyword_3_1()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__ExtraData__Group_3__1__Impl4840); 
             after(grammarAccess.getExtraDataAccess().getColonKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtraData__Group_3__1__Impl"


    // $ANTLR start "rule__ExtraData__Group_3__2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2482:1: rule__ExtraData__Group_3__2 : rule__ExtraData__Group_3__2__Impl ;
    public final void rule__ExtraData__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2486:1: ( rule__ExtraData__Group_3__2__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2487:2: rule__ExtraData__Group_3__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtraData__Group_3__2__Impl_in_rule__ExtraData__Group_3__24871);
            rule__ExtraData__Group_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtraData__Group_3__2"


    // $ANTLR start "rule__ExtraData__Group_3__2__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2493:1: rule__ExtraData__Group_3__2__Impl : ( ( rule__ExtraData__TypeAssignment_3_2 ) ) ;
    public final void rule__ExtraData__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2497:1: ( ( ( rule__ExtraData__TypeAssignment_3_2 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2498:1: ( ( rule__ExtraData__TypeAssignment_3_2 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2498:1: ( ( rule__ExtraData__TypeAssignment_3_2 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2499:1: ( rule__ExtraData__TypeAssignment_3_2 )
            {
             before(grammarAccess.getExtraDataAccess().getTypeAssignment_3_2()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2500:1: ( rule__ExtraData__TypeAssignment_3_2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2500:2: rule__ExtraData__TypeAssignment_3_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtraData__TypeAssignment_3_2_in_rule__ExtraData__Group_3__2__Impl4898);
            rule__ExtraData__TypeAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getExtraDataAccess().getTypeAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtraData__Group_3__2__Impl"


    // $ANTLR start "rule__ExplicitIntent__Group__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2516:1: rule__ExplicitIntent__Group__0 : rule__ExplicitIntent__Group__0__Impl rule__ExplicitIntent__Group__1 ;
    public final void rule__ExplicitIntent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2520:1: ( rule__ExplicitIntent__Group__0__Impl rule__ExplicitIntent__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2521:2: rule__ExplicitIntent__Group__0__Impl rule__ExplicitIntent__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExplicitIntent__Group__0__Impl_in_rule__ExplicitIntent__Group__04934);
            rule__ExplicitIntent__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ExplicitIntent__Group__1_in_rule__ExplicitIntent__Group__04937);
            rule__ExplicitIntent__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExplicitIntent__Group__0"


    // $ANTLR start "rule__ExplicitIntent__Group__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2528:1: rule__ExplicitIntent__Group__0__Impl : ( () ) ;
    public final void rule__ExplicitIntent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2532:1: ( ( () ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2533:1: ( () )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2533:1: ( () )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2534:1: ()
            {
             before(grammarAccess.getExplicitIntentAccess().getExplicitIntentAction_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2535:1: ()
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2537:1: 
            {
            }

             after(grammarAccess.getExplicitIntentAccess().getExplicitIntentAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExplicitIntent__Group__0__Impl"


    // $ANTLR start "rule__ExplicitIntent__Group__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2547:1: rule__ExplicitIntent__Group__1 : rule__ExplicitIntent__Group__1__Impl ;
    public final void rule__ExplicitIntent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2551:1: ( rule__ExplicitIntent__Group__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2552:2: rule__ExplicitIntent__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExplicitIntent__Group__1__Impl_in_rule__ExplicitIntent__Group__14995);
            rule__ExplicitIntent__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExplicitIntent__Group__1"


    // $ANTLR start "rule__ExplicitIntent__Group__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2558:1: rule__ExplicitIntent__Group__1__Impl : ( '\\'ExplicitIntent\\'' ) ;
    public final void rule__ExplicitIntent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2562:1: ( ( '\\'ExplicitIntent\\'' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2563:1: ( '\\'ExplicitIntent\\'' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2563:1: ( '\\'ExplicitIntent\\'' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2564:1: '\\'ExplicitIntent\\''
            {
             before(grammarAccess.getExplicitIntentAccess().getExplicitIntentKeyword_1()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__ExplicitIntent__Group__1__Impl5023); 
             after(grammarAccess.getExplicitIntentAccess().getExplicitIntentKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExplicitIntent__Group__1__Impl"


    // $ANTLR start "rule__ImplicitIntent__Group__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2581:1: rule__ImplicitIntent__Group__0 : rule__ImplicitIntent__Group__0__Impl rule__ImplicitIntent__Group__1 ;
    public final void rule__ImplicitIntent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2585:1: ( rule__ImplicitIntent__Group__0__Impl rule__ImplicitIntent__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2586:2: rule__ImplicitIntent__Group__0__Impl rule__ImplicitIntent__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ImplicitIntent__Group__0__Impl_in_rule__ImplicitIntent__Group__05058);
            rule__ImplicitIntent__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ImplicitIntent__Group__1_in_rule__ImplicitIntent__Group__05061);
            rule__ImplicitIntent__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImplicitIntent__Group__0"


    // $ANTLR start "rule__ImplicitIntent__Group__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2593:1: rule__ImplicitIntent__Group__0__Impl : ( () ) ;
    public final void rule__ImplicitIntent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2597:1: ( ( () ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2598:1: ( () )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2598:1: ( () )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2599:1: ()
            {
             before(grammarAccess.getImplicitIntentAccess().getImplicitIntentAction_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2600:1: ()
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2602:1: 
            {
            }

             after(grammarAccess.getImplicitIntentAccess().getImplicitIntentAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImplicitIntent__Group__0__Impl"


    // $ANTLR start "rule__ImplicitIntent__Group__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2612:1: rule__ImplicitIntent__Group__1 : rule__ImplicitIntent__Group__1__Impl ;
    public final void rule__ImplicitIntent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2616:1: ( rule__ImplicitIntent__Group__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2617:2: rule__ImplicitIntent__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ImplicitIntent__Group__1__Impl_in_rule__ImplicitIntent__Group__15119);
            rule__ImplicitIntent__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImplicitIntent__Group__1"


    // $ANTLR start "rule__ImplicitIntent__Group__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2623:1: rule__ImplicitIntent__Group__1__Impl : ( '\\'ImplicitIntent\\'' ) ;
    public final void rule__ImplicitIntent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2627:1: ( ( '\\'ImplicitIntent\\'' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2628:1: ( '\\'ImplicitIntent\\'' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2628:1: ( '\\'ImplicitIntent\\'' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2629:1: '\\'ImplicitIntent\\''
            {
             before(grammarAccess.getImplicitIntentAccess().getImplicitIntentKeyword_1()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__ImplicitIntent__Group__1__Impl5147); 
             after(grammarAccess.getImplicitIntentAccess().getImplicitIntentKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImplicitIntent__Group__1__Impl"


    // $ANTLR start "rule__BroadcastIntent__Group__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2646:1: rule__BroadcastIntent__Group__0 : rule__BroadcastIntent__Group__0__Impl rule__BroadcastIntent__Group__1 ;
    public final void rule__BroadcastIntent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2650:1: ( rule__BroadcastIntent__Group__0__Impl rule__BroadcastIntent__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2651:2: rule__BroadcastIntent__Group__0__Impl rule__BroadcastIntent__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BroadcastIntent__Group__0__Impl_in_rule__BroadcastIntent__Group__05182);
            rule__BroadcastIntent__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BroadcastIntent__Group__1_in_rule__BroadcastIntent__Group__05185);
            rule__BroadcastIntent__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BroadcastIntent__Group__0"


    // $ANTLR start "rule__BroadcastIntent__Group__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2658:1: rule__BroadcastIntent__Group__0__Impl : ( () ) ;
    public final void rule__BroadcastIntent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2662:1: ( ( () ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2663:1: ( () )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2663:1: ( () )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2664:1: ()
            {
             before(grammarAccess.getBroadcastIntentAccess().getBroadCastIntentAction_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2665:1: ()
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2667:1: 
            {
            }

             after(grammarAccess.getBroadcastIntentAccess().getBroadCastIntentAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BroadcastIntent__Group__0__Impl"


    // $ANTLR start "rule__BroadcastIntent__Group__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2677:1: rule__BroadcastIntent__Group__1 : rule__BroadcastIntent__Group__1__Impl ;
    public final void rule__BroadcastIntent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2681:1: ( rule__BroadcastIntent__Group__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2682:2: rule__BroadcastIntent__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__BroadcastIntent__Group__1__Impl_in_rule__BroadcastIntent__Group__15243);
            rule__BroadcastIntent__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BroadcastIntent__Group__1"


    // $ANTLR start "rule__BroadcastIntent__Group__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2688:1: rule__BroadcastIntent__Group__1__Impl : ( '\\'BroadcastIntent\\'' ) ;
    public final void rule__BroadcastIntent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2692:1: ( ( '\\'BroadcastIntent\\'' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2693:1: ( '\\'BroadcastIntent\\'' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2693:1: ( '\\'BroadcastIntent\\'' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2694:1: '\\'BroadcastIntent\\''
            {
             before(grammarAccess.getBroadcastIntentAccess().getBroadcastIntentKeyword_1()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__BroadcastIntent__Group__1__Impl5271); 
             after(grammarAccess.getBroadcastIntentAccess().getBroadcastIntentKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BroadcastIntent__Group__1__Impl"


    // $ANTLR start "rule__ServiceIntent__Group__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2711:1: rule__ServiceIntent__Group__0 : rule__ServiceIntent__Group__0__Impl rule__ServiceIntent__Group__1 ;
    public final void rule__ServiceIntent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2715:1: ( rule__ServiceIntent__Group__0__Impl rule__ServiceIntent__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2716:2: rule__ServiceIntent__Group__0__Impl rule__ServiceIntent__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ServiceIntent__Group__0__Impl_in_rule__ServiceIntent__Group__05306);
            rule__ServiceIntent__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ServiceIntent__Group__1_in_rule__ServiceIntent__Group__05309);
            rule__ServiceIntent__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceIntent__Group__0"


    // $ANTLR start "rule__ServiceIntent__Group__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2723:1: rule__ServiceIntent__Group__0__Impl : ( () ) ;
    public final void rule__ServiceIntent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2727:1: ( ( () ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2728:1: ( () )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2728:1: ( () )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2729:1: ()
            {
             before(grammarAccess.getServiceIntentAccess().getServiceIntentAction_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2730:1: ()
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2732:1: 
            {
            }

             after(grammarAccess.getServiceIntentAccess().getServiceIntentAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceIntent__Group__0__Impl"


    // $ANTLR start "rule__ServiceIntent__Group__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2742:1: rule__ServiceIntent__Group__1 : rule__ServiceIntent__Group__1__Impl ;
    public final void rule__ServiceIntent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2746:1: ( rule__ServiceIntent__Group__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2747:2: rule__ServiceIntent__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ServiceIntent__Group__1__Impl_in_rule__ServiceIntent__Group__15367);
            rule__ServiceIntent__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceIntent__Group__1"


    // $ANTLR start "rule__ServiceIntent__Group__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2753:1: rule__ServiceIntent__Group__1__Impl : ( '\\'ServiceIntent\\'' ) ;
    public final void rule__ServiceIntent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2757:1: ( ( '\\'ServiceIntent\\'' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2758:1: ( '\\'ServiceIntent\\'' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2758:1: ( '\\'ServiceIntent\\'' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2759:1: '\\'ServiceIntent\\''
            {
             before(grammarAccess.getServiceIntentAccess().getServiceIntentKeyword_1()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__ServiceIntent__Group__1__Impl5395); 
             after(grammarAccess.getServiceIntentAccess().getServiceIntentKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceIntent__Group__1__Impl"


    // $ANTLR start "rule__IntentModel__NameAssignment_1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2777:1: rule__IntentModel__NameAssignment_1 : ( ( 'Model' ) ) ;
    public final void rule__IntentModel__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2781:1: ( ( ( 'Model' ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2782:1: ( ( 'Model' ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2782:1: ( ( 'Model' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2783:1: ( 'Model' )
            {
             before(grammarAccess.getIntentModelAccess().getNameModelKeyword_1_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2784:1: ( 'Model' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2785:1: 'Model'
            {
             before(grammarAccess.getIntentModelAccess().getNameModelKeyword_1_0()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__IntentModel__NameAssignment_15440); 
             after(grammarAccess.getIntentModelAccess().getNameModelKeyword_1_0()); 

            }

             after(grammarAccess.getIntentModelAccess().getNameModelKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntentModel__NameAssignment_1"


    // $ANTLR start "rule__IntentModel__IntentsAssignment_4_1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2800:1: rule__IntentModel__IntentsAssignment_4_1 : ( ruleIntent ) ;
    public final void rule__IntentModel__IntentsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2804:1: ( ( ruleIntent ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2805:1: ( ruleIntent )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2805:1: ( ruleIntent )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2806:1: ruleIntent
            {
             before(grammarAccess.getIntentModelAccess().getIntentsIntentParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleIntent_in_rule__IntentModel__IntentsAssignment_4_15479);
            ruleIntent();

            state._fsp--;

             after(grammarAccess.getIntentModelAccess().getIntentsIntentParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntentModel__IntentsAssignment_4_1"


    // $ANTLR start "rule__IntentModel__IntentsAssignment_4_2_1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2815:1: rule__IntentModel__IntentsAssignment_4_2_1 : ( ruleIntent ) ;
    public final void rule__IntentModel__IntentsAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2819:1: ( ( ruleIntent ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2820:1: ( ruleIntent )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2820:1: ( ruleIntent )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2821:1: ruleIntent
            {
             before(grammarAccess.getIntentModelAccess().getIntentsIntentParserRuleCall_4_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleIntent_in_rule__IntentModel__IntentsAssignment_4_2_15510);
            ruleIntent();

            state._fsp--;

             after(grammarAccess.getIntentModelAccess().getIntentsIntentParserRuleCall_4_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntentModel__IntentsAssignment_4_2_1"


    // $ANTLR start "rule__Intent__NameAssignment_4_0_2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2830:1: rule__Intent__NameAssignment_4_0_2 : ( ruleEString ) ;
    public final void rule__Intent__NameAssignment_4_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2834:1: ( ( ruleEString ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2835:1: ( ruleEString )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2835:1: ( ruleEString )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2836:1: ruleEString
            {
             before(grammarAccess.getIntentAccess().getNameEStringParserRuleCall_4_0_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Intent__NameAssignment_4_0_25541);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getIntentAccess().getNameEStringParserRuleCall_4_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__NameAssignment_4_0_2"


    // $ANTLR start "rule__Intent__ActionAssignment_4_1_2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2845:1: rule__Intent__ActionAssignment_4_1_2 : ( ruleEString ) ;
    public final void rule__Intent__ActionAssignment_4_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2849:1: ( ( ruleEString ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2850:1: ( ruleEString )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2850:1: ( ruleEString )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2851:1: ruleEString
            {
             before(grammarAccess.getIntentAccess().getActionEStringParserRuleCall_4_1_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Intent__ActionAssignment_4_1_25572);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getIntentAccess().getActionEStringParserRuleCall_4_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__ActionAssignment_4_1_2"


    // $ANTLR start "rule__Intent__CategoryAssignment_4_2_2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2860:1: rule__Intent__CategoryAssignment_4_2_2 : ( ruleEString ) ;
    public final void rule__Intent__CategoryAssignment_4_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2864:1: ( ( ruleEString ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2865:1: ( ruleEString )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2865:1: ( ruleEString )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2866:1: ruleEString
            {
             before(grammarAccess.getIntentAccess().getCategoryEStringParserRuleCall_4_2_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Intent__CategoryAssignment_4_2_25603);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getIntentAccess().getCategoryEStringParserRuleCall_4_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__CategoryAssignment_4_2_2"


    // $ANTLR start "rule__Intent__DataURIAssignment_4_3_2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2875:1: rule__Intent__DataURIAssignment_4_3_2 : ( ruleEString ) ;
    public final void rule__Intent__DataURIAssignment_4_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2879:1: ( ( ruleEString ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2880:1: ( ruleEString )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2880:1: ( ruleEString )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2881:1: ruleEString
            {
             before(grammarAccess.getIntentAccess().getDataURIEStringParserRuleCall_4_3_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Intent__DataURIAssignment_4_3_25634);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getIntentAccess().getDataURIEStringParserRuleCall_4_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__DataURIAssignment_4_3_2"


    // $ANTLR start "rule__Intent__ExtraDataAssignment_4_4_3"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2890:1: rule__Intent__ExtraDataAssignment_4_4_3 : ( ruleExtraData ) ;
    public final void rule__Intent__ExtraDataAssignment_4_4_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2894:1: ( ( ruleExtraData ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2895:1: ( ruleExtraData )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2895:1: ( ruleExtraData )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2896:1: ruleExtraData
            {
             before(grammarAccess.getIntentAccess().getExtraDataExtraDataParserRuleCall_4_4_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleExtraData_in_rule__Intent__ExtraDataAssignment_4_4_35665);
            ruleExtraData();

            state._fsp--;

             after(grammarAccess.getIntentAccess().getExtraDataExtraDataParserRuleCall_4_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__ExtraDataAssignment_4_4_3"


    // $ANTLR start "rule__Intent__ExtraDataAssignment_4_4_4_1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2905:1: rule__Intent__ExtraDataAssignment_4_4_4_1 : ( ruleExtraData ) ;
    public final void rule__Intent__ExtraDataAssignment_4_4_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2909:1: ( ( ruleExtraData ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2910:1: ( ruleExtraData )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2910:1: ( ruleExtraData )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2911:1: ruleExtraData
            {
             before(grammarAccess.getIntentAccess().getExtraDataExtraDataParserRuleCall_4_4_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleExtraData_in_rule__Intent__ExtraDataAssignment_4_4_4_15696);
            ruleExtraData();

            state._fsp--;

             after(grammarAccess.getIntentAccess().getExtraDataExtraDataParserRuleCall_4_4_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__ExtraDataAssignment_4_4_4_1"


    // $ANTLR start "rule__Intent__ReturnDataAssignment_4_5_3"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2920:1: rule__Intent__ReturnDataAssignment_4_5_3 : ( ruleExtraData ) ;
    public final void rule__Intent__ReturnDataAssignment_4_5_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2924:1: ( ( ruleExtraData ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2925:1: ( ruleExtraData )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2925:1: ( ruleExtraData )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2926:1: ruleExtraData
            {
             before(grammarAccess.getIntentAccess().getReturnDataExtraDataParserRuleCall_4_5_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleExtraData_in_rule__Intent__ReturnDataAssignment_4_5_35727);
            ruleExtraData();

            state._fsp--;

             after(grammarAccess.getIntentAccess().getReturnDataExtraDataParserRuleCall_4_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__ReturnDataAssignment_4_5_3"


    // $ANTLR start "rule__Intent__ReturnDataAssignment_4_5_4_1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2935:1: rule__Intent__ReturnDataAssignment_4_5_4_1 : ( ruleExtraData ) ;
    public final void rule__Intent__ReturnDataAssignment_4_5_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2939:1: ( ( ruleExtraData ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2940:1: ( ruleExtraData )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2940:1: ( ruleExtraData )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2941:1: ruleExtraData
            {
             before(grammarAccess.getIntentAccess().getReturnDataExtraDataParserRuleCall_4_5_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleExtraData_in_rule__Intent__ReturnDataAssignment_4_5_4_15758);
            ruleExtraData();

            state._fsp--;

             after(grammarAccess.getIntentAccess().getReturnDataExtraDataParserRuleCall_4_5_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__ReturnDataAssignment_4_5_4_1"


    // $ANTLR start "rule__ExtraData__NameAssignment_2_2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2950:1: rule__ExtraData__NameAssignment_2_2 : ( ruleEString ) ;
    public final void rule__ExtraData__NameAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2954:1: ( ( ruleEString ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2955:1: ( ruleEString )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2955:1: ( ruleEString )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2956:1: ruleEString
            {
             before(grammarAccess.getExtraDataAccess().getNameEStringParserRuleCall_2_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__ExtraData__NameAssignment_2_25789);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getExtraDataAccess().getNameEStringParserRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtraData__NameAssignment_2_2"


    // $ANTLR start "rule__ExtraData__TypeAssignment_3_2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2965:1: rule__ExtraData__TypeAssignment_3_2 : ( ruleEString ) ;
    public final void rule__ExtraData__TypeAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2969:1: ( ( ruleEString ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2970:1: ( ruleEString )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2970:1: ( ruleEString )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2971:1: ruleEString
            {
             before(grammarAccess.getExtraDataAccess().getTypeEStringParserRuleCall_3_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__ExtraData__TypeAssignment_3_25820);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getExtraDataAccess().getTypeEStringParserRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtraData__TypeAssignment_3_2"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleIntentModel_in_entryRuleIntentModel61 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIntentModel68 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntentModel__Group__0_in_ruleIntentModel94 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIntent_in_entryRuleIntent121 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIntent128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group__0_in_ruleIntent154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString181 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EString__Alternatives_in_ruleEString214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExtraData_in_entryRuleExtraData241 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExtraData248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtraData__Group__0_in_ruleExtraData274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExplicitIntent_in_entryRuleExplicitIntent301 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExplicitIntent308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExplicitIntent__Group__0_in_ruleExplicitIntent334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleImplicitIntent_in_entryRuleImplicitIntent361 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleImplicitIntent368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ImplicitIntent__Group__0_in_ruleImplicitIntent394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBroadcastIntent_in_entryRuleBroadcastIntent421 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBroadcastIntent428 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BroadcastIntent__Group__0_in_ruleBroadcastIntent454 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleServiceIntent_in_entryRuleServiceIntent481 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleServiceIntent488 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ServiceIntent__Group__0_in_ruleServiceIntent514 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExplicitIntent_in_rule__Intent__Alternatives_2550 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleImplicitIntent_in_rule__Intent__Alternatives_2567 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBroadcastIntent_in_rule__Intent__Alternatives_2584 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleServiceIntent_in_rule__Intent__Alternatives_2601 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__EString__Alternatives633 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Alternatives650 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntentModel__Group__0__Impl_in_rule__IntentModel__Group__0680 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_rule__IntentModel__Group__1_in_rule__IntentModel__Group__0683 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntentModel__Group__1__Impl_in_rule__IntentModel__Group__1741 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_rule__IntentModel__Group__2_in_rule__IntentModel__Group__1744 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntentModel__NameAssignment_1_in_rule__IntentModel__Group__1__Impl771 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntentModel__Group__2__Impl_in_rule__IntentModel__Group__2801 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__IntentModel__Group__3_in_rule__IntentModel__Group__2804 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rule__IntentModel__Group__2__Impl832 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntentModel__Group__3__Impl_in_rule__IntentModel__Group__3863 = new BitSet(new long[]{0x0000000000006000L});
        public static final BitSet FOLLOW_rule__IntentModel__Group__4_in_rule__IntentModel__Group__3866 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__IntentModel__Group__3__Impl894 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntentModel__Group__4__Impl_in_rule__IntentModel__Group__4925 = new BitSet(new long[]{0x0000000000006000L});
        public static final BitSet FOLLOW_rule__IntentModel__Group__5_in_rule__IntentModel__Group__4928 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntentModel__Group_4__0_in_rule__IntentModel__Group__4__Impl955 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntentModel__Group__5__Impl_in_rule__IntentModel__Group__5986 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__IntentModel__Group__5__Impl1014 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntentModel__Group_4__0__Impl_in_rule__IntentModel__Group_4__01057 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__IntentModel__Group_4__1_in_rule__IntentModel__Group_4__01060 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__IntentModel__Group_4__0__Impl1088 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntentModel__Group_4__1__Impl_in_rule__IntentModel__Group_4__11119 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_rule__IntentModel__Group_4__2_in_rule__IntentModel__Group_4__11122 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntentModel__IntentsAssignment_4_1_in_rule__IntentModel__Group_4__1__Impl1149 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntentModel__Group_4__2__Impl_in_rule__IntentModel__Group_4__21179 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_rule__IntentModel__Group_4__3_in_rule__IntentModel__Group_4__21182 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntentModel__Group_4_2__0_in_rule__IntentModel__Group_4__2__Impl1209 = new BitSet(new long[]{0x0000000000010002L});
        public static final BitSet FOLLOW_rule__IntentModel__Group_4__3__Impl_in_rule__IntentModel__Group_4__31240 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__IntentModel__Group_4__3__Impl1268 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntentModel__Group_4_2__0__Impl_in_rule__IntentModel__Group_4_2__01307 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__IntentModel__Group_4_2__1_in_rule__IntentModel__Group_4_2__01310 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__IntentModel__Group_4_2__0__Impl1338 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntentModel__Group_4_2__1__Impl_in_rule__IntentModel__Group_4_2__11369 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntentModel__IntentsAssignment_4_2_1_in_rule__IntentModel__Group_4_2__1__Impl1396 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group__0__Impl_in_rule__Intent__Group__01430 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__Intent__Group__1_in_rule__Intent__Group__01433 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Intent__Group__0__Impl1461 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group__1__Impl_in_rule__Intent__Group__11492 = new BitSet(new long[]{0x000000001E000000L});
        public static final BitSet FOLLOW_rule__Intent__Group__2_in_rule__Intent__Group__11495 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Intent__Group__1__Impl1523 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group__2__Impl_in_rule__Intent__Group__21554 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__Intent__Group__3_in_rule__Intent__Group__21557 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Alternatives_2_in_rule__Intent__Group__2__Impl1584 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group__3__Impl_in_rule__Intent__Group__31614 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__Intent__Group__4_in_rule__Intent__Group__31617 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Intent__Group__3__Impl1645 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group__4__Impl_in_rule__Intent__Group__41676 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4__0_in_rule__Intent__Group__4__Impl1703 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4__0__Impl_in_rule__Intent__Group_4__01743 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_rule__Intent__Group_4__1_in_rule__Intent__Group_4__01746 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_0__0_in_rule__Intent__Group_4__0__Impl1773 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4__1__Impl_in_rule__Intent__Group_4__11803 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__Intent__Group_4__2_in_rule__Intent__Group_4__11806 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_1__0_in_rule__Intent__Group_4__1__Impl1833 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4__2__Impl_in_rule__Intent__Group_4__21863 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__Intent__Group_4__3_in_rule__Intent__Group_4__21866 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_2__0_in_rule__Intent__Group_4__2__Impl1893 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4__3__Impl_in_rule__Intent__Group_4__31923 = new BitSet(new long[]{0x0000000001800000L});
        public static final BitSet FOLLOW_rule__Intent__Group_4__4_in_rule__Intent__Group_4__31926 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_3__0_in_rule__Intent__Group_4__3__Impl1953 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4__4__Impl_in_rule__Intent__Group_4__41983 = new BitSet(new long[]{0x0000000001800000L});
        public static final BitSet FOLLOW_rule__Intent__Group_4__5_in_rule__Intent__Group_4__41986 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_4__0_in_rule__Intent__Group_4__4__Impl2013 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4__5__Impl_in_rule__Intent__Group_4__52044 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_5__0_in_rule__Intent__Group_4__5__Impl2071 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_0__0__Impl_in_rule__Intent__Group_4_0__02114 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_0__1_in_rule__Intent__Group_4_0__02117 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__Intent__Group_4_0__0__Impl2145 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_0__1__Impl_in_rule__Intent__Group_4_0__12176 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_0__2_in_rule__Intent__Group_4_0__12179 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Intent__Group_4_0__1__Impl2207 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_0__2__Impl_in_rule__Intent__Group_4_0__22238 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_0__3_in_rule__Intent__Group_4_0__22241 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__NameAssignment_4_0_2_in_rule__Intent__Group_4_0__2__Impl2268 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_0__3__Impl_in_rule__Intent__Group_4_0__32298 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Intent__Group_4_0__3__Impl2326 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_1__0__Impl_in_rule__Intent__Group_4_1__02365 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_1__1_in_rule__Intent__Group_4_1__02368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__Intent__Group_4_1__0__Impl2396 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_1__1__Impl_in_rule__Intent__Group_4_1__12427 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_1__2_in_rule__Intent__Group_4_1__12430 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Intent__Group_4_1__1__Impl2458 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_1__2__Impl_in_rule__Intent__Group_4_1__22489 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_1__3_in_rule__Intent__Group_4_1__22492 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__ActionAssignment_4_1_2_in_rule__Intent__Group_4_1__2__Impl2519 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_1__3__Impl_in_rule__Intent__Group_4_1__32549 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Intent__Group_4_1__3__Impl2577 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_2__0__Impl_in_rule__Intent__Group_4_2__02616 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_2__1_in_rule__Intent__Group_4_2__02619 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__Intent__Group_4_2__0__Impl2647 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_2__1__Impl_in_rule__Intent__Group_4_2__12678 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_2__2_in_rule__Intent__Group_4_2__12681 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Intent__Group_4_2__1__Impl2709 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_2__2__Impl_in_rule__Intent__Group_4_2__22740 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_2__3_in_rule__Intent__Group_4_2__22743 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__CategoryAssignment_4_2_2_in_rule__Intent__Group_4_2__2__Impl2770 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_2__3__Impl_in_rule__Intent__Group_4_2__32800 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Intent__Group_4_2__3__Impl2828 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_3__0__Impl_in_rule__Intent__Group_4_3__02867 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_3__1_in_rule__Intent__Group_4_3__02870 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__Intent__Group_4_3__0__Impl2898 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_3__1__Impl_in_rule__Intent__Group_4_3__12929 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_3__2_in_rule__Intent__Group_4_3__12932 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Intent__Group_4_3__1__Impl2960 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_3__2__Impl_in_rule__Intent__Group_4_3__22991 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_3__3_in_rule__Intent__Group_4_3__22994 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__DataURIAssignment_4_3_2_in_rule__Intent__Group_4_3__2__Impl3021 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_3__3__Impl_in_rule__Intent__Group_4_3__33051 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Intent__Group_4_3__3__Impl3079 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_4__0__Impl_in_rule__Intent__Group_4_4__03118 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_4__1_in_rule__Intent__Group_4_4__03121 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__Intent__Group_4_4__0__Impl3149 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_4__1__Impl_in_rule__Intent__Group_4_4__13180 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_4__2_in_rule__Intent__Group_4_4__13183 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Intent__Group_4_4__1__Impl3211 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_4__2__Impl_in_rule__Intent__Group_4_4__23242 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_4__3_in_rule__Intent__Group_4_4__23245 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__Intent__Group_4_4__2__Impl3273 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_4__3__Impl_in_rule__Intent__Group_4_4__33304 = new BitSet(new long[]{0x0000000000012000L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_4__4_in_rule__Intent__Group_4_4__33307 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__ExtraDataAssignment_4_4_3_in_rule__Intent__Group_4_4__3__Impl3334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_4__4__Impl_in_rule__Intent__Group_4_4__43364 = new BitSet(new long[]{0x0000000000012000L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_4__5_in_rule__Intent__Group_4_4__43367 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_4_4__0_in_rule__Intent__Group_4_4__4__Impl3394 = new BitSet(new long[]{0x0000000000010002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_4__5__Impl_in_rule__Intent__Group_4_4__53425 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_4__6_in_rule__Intent__Group_4_4__53428 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Intent__Group_4_4__5__Impl3456 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_4__6__Impl_in_rule__Intent__Group_4_4__63487 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Intent__Group_4_4__6__Impl3515 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_4_4__0__Impl_in_rule__Intent__Group_4_4_4__03560 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_4_4__1_in_rule__Intent__Group_4_4_4__03563 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Intent__Group_4_4_4__0__Impl3591 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_4_4__1__Impl_in_rule__Intent__Group_4_4_4__13622 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__ExtraDataAssignment_4_4_4_1_in_rule__Intent__Group_4_4_4__1__Impl3649 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_5__0__Impl_in_rule__Intent__Group_4_5__03683 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_5__1_in_rule__Intent__Group_4_5__03686 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__Intent__Group_4_5__0__Impl3714 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_5__1__Impl_in_rule__Intent__Group_4_5__13745 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_5__2_in_rule__Intent__Group_4_5__13748 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Intent__Group_4_5__1__Impl3776 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_5__2__Impl_in_rule__Intent__Group_4_5__23807 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_5__3_in_rule__Intent__Group_4_5__23810 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__Intent__Group_4_5__2__Impl3838 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_5__3__Impl_in_rule__Intent__Group_4_5__33869 = new BitSet(new long[]{0x0000000000012000L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_5__4_in_rule__Intent__Group_4_5__33872 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__ReturnDataAssignment_4_5_3_in_rule__Intent__Group_4_5__3__Impl3899 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_5__4__Impl_in_rule__Intent__Group_4_5__43929 = new BitSet(new long[]{0x0000000000012000L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_5__5_in_rule__Intent__Group_4_5__43932 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_5_4__0_in_rule__Intent__Group_4_5__4__Impl3959 = new BitSet(new long[]{0x0000000000010002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_5__5__Impl_in_rule__Intent__Group_4_5__53990 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_5__6_in_rule__Intent__Group_4_5__53993 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Intent__Group_4_5__5__Impl4021 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_5__6__Impl_in_rule__Intent__Group_4_5__64052 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Intent__Group_4_5__6__Impl4080 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_5_4__0__Impl_in_rule__Intent__Group_4_5_4__04125 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_5_4__1_in_rule__Intent__Group_4_5_4__04128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Intent__Group_4_5_4__0__Impl4156 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_5_4__1__Impl_in_rule__Intent__Group_4_5_4__14187 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__ReturnDataAssignment_4_5_4_1_in_rule__Intent__Group_4_5_4__1__Impl4214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtraData__Group__0__Impl_in_rule__ExtraData__Group__04248 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__ExtraData__Group__1_in_rule__ExtraData__Group__04251 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtraData__Group__1__Impl_in_rule__ExtraData__Group__14309 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__ExtraData__Group__2_in_rule__ExtraData__Group__14312 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__ExtraData__Group__1__Impl4340 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtraData__Group__2__Impl_in_rule__ExtraData__Group__24371 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__ExtraData__Group__3_in_rule__ExtraData__Group__24374 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtraData__Group_2__0_in_rule__ExtraData__Group__2__Impl4401 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtraData__Group__3__Impl_in_rule__ExtraData__Group__34431 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__ExtraData__Group__4_in_rule__ExtraData__Group__34434 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtraData__Group_3__0_in_rule__ExtraData__Group__3__Impl4461 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtraData__Group__4__Impl_in_rule__ExtraData__Group__44491 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__ExtraData__Group__4__Impl4519 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtraData__Group_2__0__Impl_in_rule__ExtraData__Group_2__04560 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__ExtraData__Group_2__1_in_rule__ExtraData__Group_2__04563 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__ExtraData__Group_2__0__Impl4591 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtraData__Group_2__1__Impl_in_rule__ExtraData__Group_2__14622 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__ExtraData__Group_2__2_in_rule__ExtraData__Group_2__14625 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__ExtraData__Group_2__1__Impl4653 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtraData__Group_2__2__Impl_in_rule__ExtraData__Group_2__24684 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtraData__NameAssignment_2_2_in_rule__ExtraData__Group_2__2__Impl4711 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtraData__Group_3__0__Impl_in_rule__ExtraData__Group_3__04747 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__ExtraData__Group_3__1_in_rule__ExtraData__Group_3__04750 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__ExtraData__Group_3__0__Impl4778 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtraData__Group_3__1__Impl_in_rule__ExtraData__Group_3__14809 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__ExtraData__Group_3__2_in_rule__ExtraData__Group_3__14812 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__ExtraData__Group_3__1__Impl4840 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtraData__Group_3__2__Impl_in_rule__ExtraData__Group_3__24871 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtraData__TypeAssignment_3_2_in_rule__ExtraData__Group_3__2__Impl4898 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExplicitIntent__Group__0__Impl_in_rule__ExplicitIntent__Group__04934 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__ExplicitIntent__Group__1_in_rule__ExplicitIntent__Group__04937 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExplicitIntent__Group__1__Impl_in_rule__ExplicitIntent__Group__14995 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__ExplicitIntent__Group__1__Impl5023 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ImplicitIntent__Group__0__Impl_in_rule__ImplicitIntent__Group__05058 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__ImplicitIntent__Group__1_in_rule__ImplicitIntent__Group__05061 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ImplicitIntent__Group__1__Impl_in_rule__ImplicitIntent__Group__15119 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__ImplicitIntent__Group__1__Impl5147 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BroadcastIntent__Group__0__Impl_in_rule__BroadcastIntent__Group__05182 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__BroadcastIntent__Group__1_in_rule__BroadcastIntent__Group__05185 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BroadcastIntent__Group__1__Impl_in_rule__BroadcastIntent__Group__15243 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__BroadcastIntent__Group__1__Impl5271 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ServiceIntent__Group__0__Impl_in_rule__ServiceIntent__Group__05306 = new BitSet(new long[]{0x000000001E000000L});
        public static final BitSet FOLLOW_rule__ServiceIntent__Group__1_in_rule__ServiceIntent__Group__05309 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ServiceIntent__Group__1__Impl_in_rule__ServiceIntent__Group__15367 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__ServiceIntent__Group__1__Impl5395 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__IntentModel__NameAssignment_15440 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIntent_in_rule__IntentModel__IntentsAssignment_4_15479 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIntent_in_rule__IntentModel__IntentsAssignment_4_2_15510 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Intent__NameAssignment_4_0_25541 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Intent__ActionAssignment_4_1_25572 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Intent__CategoryAssignment_4_2_25603 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Intent__DataURIAssignment_4_3_25634 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExtraData_in_rule__Intent__ExtraDataAssignment_4_4_35665 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExtraData_in_rule__Intent__ExtraDataAssignment_4_4_4_15696 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExtraData_in_rule__Intent__ReturnDataAssignment_4_5_35727 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExtraData_in_rule__Intent__ReturnDataAssignment_4_5_4_15758 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__ExtraData__NameAssignment_2_25789 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__ExtraData__TypeAssignment_3_25820 = new BitSet(new long[]{0x0000000000000002L});
    }


}