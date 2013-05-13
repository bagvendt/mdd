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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'boolean'", "'Bundle'", "'byte'", "'double'", "'float'", "'integer'", "'long'", "'short'", "'String'", "'='", "'['", "'{'", "'}'", "']'", "','", "'Type'", "':'", "'Name'", "'Action'", "'Category'", "'Meta-Category'", "'DataURI'", "'Permission'", "'DataExtra'", "'ReturnData'", "'\\'ExplicitIntent\\''", "'\\'ImplicitIntent\\''", "'\\'BroadcastIntent\\''", "'\\'ServiceIntent\\''", "'Model'"
    };
    public static final int RULE_ID=5;
    public static final int T__40=40;
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


    // $ANTLR start "ruleSimpleTypeEnum"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:285:1: ruleSimpleTypeEnum : ( ( rule__SimpleTypeEnum__Alternatives ) ) ;
    public final void ruleSimpleTypeEnum() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:289:1: ( ( ( rule__SimpleTypeEnum__Alternatives ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:290:1: ( ( rule__SimpleTypeEnum__Alternatives ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:290:1: ( ( rule__SimpleTypeEnum__Alternatives ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:291:1: ( rule__SimpleTypeEnum__Alternatives )
            {
             before(grammarAccess.getSimpleTypeEnumAccess().getAlternatives()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:292:1: ( rule__SimpleTypeEnum__Alternatives )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:292:2: rule__SimpleTypeEnum__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleTypeEnum__Alternatives_in_ruleSimpleTypeEnum551);
            rule__SimpleTypeEnum__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSimpleTypeEnumAccess().getAlternatives()); 

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
    // $ANTLR end "ruleSimpleTypeEnum"


    // $ANTLR start "rule__Intent__Alternatives_2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:303:1: rule__Intent__Alternatives_2 : ( ( ruleExplicitIntent ) | ( ruleImplicitIntent ) | ( ruleBroadcastIntent ) | ( ruleServiceIntent ) );
    public final void rule__Intent__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:307:1: ( ( ruleExplicitIntent ) | ( ruleImplicitIntent ) | ( ruleBroadcastIntent ) | ( ruleServiceIntent ) )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt1=1;
                }
                break;
            case 37:
                {
                alt1=2;
                }
                break;
            case 38:
                {
                alt1=3;
                }
                break;
            case 39:
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
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:308:1: ( ruleExplicitIntent )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:308:1: ( ruleExplicitIntent )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:309:1: ruleExplicitIntent
                    {
                     before(grammarAccess.getIntentAccess().getExplicitIntentParserRuleCall_2_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleExplicitIntent_in_rule__Intent__Alternatives_2586);
                    ruleExplicitIntent();

                    state._fsp--;

                     after(grammarAccess.getIntentAccess().getExplicitIntentParserRuleCall_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:314:6: ( ruleImplicitIntent )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:314:6: ( ruleImplicitIntent )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:315:1: ruleImplicitIntent
                    {
                     before(grammarAccess.getIntentAccess().getImplicitIntentParserRuleCall_2_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleImplicitIntent_in_rule__Intent__Alternatives_2603);
                    ruleImplicitIntent();

                    state._fsp--;

                     after(grammarAccess.getIntentAccess().getImplicitIntentParserRuleCall_2_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:320:6: ( ruleBroadcastIntent )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:320:6: ( ruleBroadcastIntent )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:321:1: ruleBroadcastIntent
                    {
                     before(grammarAccess.getIntentAccess().getBroadcastIntentParserRuleCall_2_2()); 
                    pushFollow(FollowSets000.FOLLOW_ruleBroadcastIntent_in_rule__Intent__Alternatives_2620);
                    ruleBroadcastIntent();

                    state._fsp--;

                     after(grammarAccess.getIntentAccess().getBroadcastIntentParserRuleCall_2_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:326:6: ( ruleServiceIntent )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:326:6: ( ruleServiceIntent )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:327:1: ruleServiceIntent
                    {
                     before(grammarAccess.getIntentAccess().getServiceIntentParserRuleCall_2_3()); 
                    pushFollow(FollowSets000.FOLLOW_ruleServiceIntent_in_rule__Intent__Alternatives_2637);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:337:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:341:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:342:1: ( RULE_STRING )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:342:1: ( RULE_STRING )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:343:1: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__EString__Alternatives669); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:348:6: ( RULE_ID )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:348:6: ( RULE_ID )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:349:1: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__EString__Alternatives686); 
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


    // $ANTLR start "rule__SimpleTypeEnum__Alternatives"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:359:1: rule__SimpleTypeEnum__Alternatives : ( ( ( 'boolean' ) ) | ( ( 'Bundle' ) ) | ( ( 'byte' ) ) | ( ( 'double' ) ) | ( ( 'float' ) ) | ( ( 'integer' ) ) | ( ( 'long' ) ) | ( ( 'short' ) ) | ( ( 'String' ) ) );
    public final void rule__SimpleTypeEnum__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:363:1: ( ( ( 'boolean' ) ) | ( ( 'Bundle' ) ) | ( ( 'byte' ) ) | ( ( 'double' ) ) | ( ( 'float' ) ) | ( ( 'integer' ) ) | ( ( 'long' ) ) | ( ( 'short' ) ) | ( ( 'String' ) ) )
            int alt3=9;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt3=1;
                }
                break;
            case 12:
                {
                alt3=2;
                }
                break;
            case 13:
                {
                alt3=3;
                }
                break;
            case 14:
                {
                alt3=4;
                }
                break;
            case 15:
                {
                alt3=5;
                }
                break;
            case 16:
                {
                alt3=6;
                }
                break;
            case 17:
                {
                alt3=7;
                }
                break;
            case 18:
                {
                alt3=8;
                }
                break;
            case 19:
                {
                alt3=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:364:1: ( ( 'boolean' ) )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:364:1: ( ( 'boolean' ) )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:365:1: ( 'boolean' )
                    {
                     before(grammarAccess.getSimpleTypeEnumAccess().getBOOLEANEnumLiteralDeclaration_0()); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:366:1: ( 'boolean' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:366:3: 'boolean'
                    {
                    match(input,11,FollowSets000.FOLLOW_11_in_rule__SimpleTypeEnum__Alternatives719); 

                    }

                     after(grammarAccess.getSimpleTypeEnumAccess().getBOOLEANEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:371:6: ( ( 'Bundle' ) )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:371:6: ( ( 'Bundle' ) )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:372:1: ( 'Bundle' )
                    {
                     before(grammarAccess.getSimpleTypeEnumAccess().getBUNDLEEnumLiteralDeclaration_1()); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:373:1: ( 'Bundle' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:373:3: 'Bundle'
                    {
                    match(input,12,FollowSets000.FOLLOW_12_in_rule__SimpleTypeEnum__Alternatives740); 

                    }

                     after(grammarAccess.getSimpleTypeEnumAccess().getBUNDLEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:378:6: ( ( 'byte' ) )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:378:6: ( ( 'byte' ) )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:379:1: ( 'byte' )
                    {
                     before(grammarAccess.getSimpleTypeEnumAccess().getBYTEEnumLiteralDeclaration_2()); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:380:1: ( 'byte' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:380:3: 'byte'
                    {
                    match(input,13,FollowSets000.FOLLOW_13_in_rule__SimpleTypeEnum__Alternatives761); 

                    }

                     after(grammarAccess.getSimpleTypeEnumAccess().getBYTEEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:385:6: ( ( 'double' ) )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:385:6: ( ( 'double' ) )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:386:1: ( 'double' )
                    {
                     before(grammarAccess.getSimpleTypeEnumAccess().getDOUBLEEnumLiteralDeclaration_3()); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:387:1: ( 'double' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:387:3: 'double'
                    {
                    match(input,14,FollowSets000.FOLLOW_14_in_rule__SimpleTypeEnum__Alternatives782); 

                    }

                     after(grammarAccess.getSimpleTypeEnumAccess().getDOUBLEEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:392:6: ( ( 'float' ) )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:392:6: ( ( 'float' ) )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:393:1: ( 'float' )
                    {
                     before(grammarAccess.getSimpleTypeEnumAccess().getFLOATEnumLiteralDeclaration_4()); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:394:1: ( 'float' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:394:3: 'float'
                    {
                    match(input,15,FollowSets000.FOLLOW_15_in_rule__SimpleTypeEnum__Alternatives803); 

                    }

                     after(grammarAccess.getSimpleTypeEnumAccess().getFLOATEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:399:6: ( ( 'integer' ) )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:399:6: ( ( 'integer' ) )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:400:1: ( 'integer' )
                    {
                     before(grammarAccess.getSimpleTypeEnumAccess().getINTEnumLiteralDeclaration_5()); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:401:1: ( 'integer' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:401:3: 'integer'
                    {
                    match(input,16,FollowSets000.FOLLOW_16_in_rule__SimpleTypeEnum__Alternatives824); 

                    }

                     after(grammarAccess.getSimpleTypeEnumAccess().getINTEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:406:6: ( ( 'long' ) )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:406:6: ( ( 'long' ) )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:407:1: ( 'long' )
                    {
                     before(grammarAccess.getSimpleTypeEnumAccess().getLONGEnumLiteralDeclaration_6()); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:408:1: ( 'long' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:408:3: 'long'
                    {
                    match(input,17,FollowSets000.FOLLOW_17_in_rule__SimpleTypeEnum__Alternatives845); 

                    }

                     after(grammarAccess.getSimpleTypeEnumAccess().getLONGEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:413:6: ( ( 'short' ) )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:413:6: ( ( 'short' ) )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:414:1: ( 'short' )
                    {
                     before(grammarAccess.getSimpleTypeEnumAccess().getSHORTEnumLiteralDeclaration_7()); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:415:1: ( 'short' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:415:3: 'short'
                    {
                    match(input,18,FollowSets000.FOLLOW_18_in_rule__SimpleTypeEnum__Alternatives866); 

                    }

                     after(grammarAccess.getSimpleTypeEnumAccess().getSHORTEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:420:6: ( ( 'String' ) )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:420:6: ( ( 'String' ) )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:421:1: ( 'String' )
                    {
                     before(grammarAccess.getSimpleTypeEnumAccess().getSTRINGEnumLiteralDeclaration_8()); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:422:1: ( 'String' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:422:3: 'String'
                    {
                    match(input,19,FollowSets000.FOLLOW_19_in_rule__SimpleTypeEnum__Alternatives887); 

                    }

                     after(grammarAccess.getSimpleTypeEnumAccess().getSTRINGEnumLiteralDeclaration_8()); 

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
    // $ANTLR end "rule__SimpleTypeEnum__Alternatives"


    // $ANTLR start "rule__IntentModel__Group__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:434:1: rule__IntentModel__Group__0 : rule__IntentModel__Group__0__Impl rule__IntentModel__Group__1 ;
    public final void rule__IntentModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:438:1: ( rule__IntentModel__Group__0__Impl rule__IntentModel__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:439:2: rule__IntentModel__Group__0__Impl rule__IntentModel__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntentModel__Group__0__Impl_in_rule__IntentModel__Group__0920);
            rule__IntentModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IntentModel__Group__1_in_rule__IntentModel__Group__0923);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:446:1: rule__IntentModel__Group__0__Impl : ( () ) ;
    public final void rule__IntentModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:450:1: ( ( () ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:451:1: ( () )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:451:1: ( () )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:452:1: ()
            {
             before(grammarAccess.getIntentModelAccess().getIntentModelAction_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:453:1: ()
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:455:1: 
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:465:1: rule__IntentModel__Group__1 : rule__IntentModel__Group__1__Impl rule__IntentModel__Group__2 ;
    public final void rule__IntentModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:469:1: ( rule__IntentModel__Group__1__Impl rule__IntentModel__Group__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:470:2: rule__IntentModel__Group__1__Impl rule__IntentModel__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntentModel__Group__1__Impl_in_rule__IntentModel__Group__1981);
            rule__IntentModel__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IntentModel__Group__2_in_rule__IntentModel__Group__1984);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:477:1: rule__IntentModel__Group__1__Impl : ( ( rule__IntentModel__NameAssignment_1 ) ) ;
    public final void rule__IntentModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:481:1: ( ( ( rule__IntentModel__NameAssignment_1 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:482:1: ( ( rule__IntentModel__NameAssignment_1 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:482:1: ( ( rule__IntentModel__NameAssignment_1 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:483:1: ( rule__IntentModel__NameAssignment_1 )
            {
             before(grammarAccess.getIntentModelAccess().getNameAssignment_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:484:1: ( rule__IntentModel__NameAssignment_1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:484:2: rule__IntentModel__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntentModel__NameAssignment_1_in_rule__IntentModel__Group__1__Impl1011);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:494:1: rule__IntentModel__Group__2 : rule__IntentModel__Group__2__Impl rule__IntentModel__Group__3 ;
    public final void rule__IntentModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:498:1: ( rule__IntentModel__Group__2__Impl rule__IntentModel__Group__3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:499:2: rule__IntentModel__Group__2__Impl rule__IntentModel__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntentModel__Group__2__Impl_in_rule__IntentModel__Group__21041);
            rule__IntentModel__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IntentModel__Group__3_in_rule__IntentModel__Group__21044);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:506:1: rule__IntentModel__Group__2__Impl : ( '=' ) ;
    public final void rule__IntentModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:510:1: ( ( '=' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:511:1: ( '=' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:511:1: ( '=' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:512:1: '='
            {
             before(grammarAccess.getIntentModelAccess().getEqualsSignKeyword_2()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__IntentModel__Group__2__Impl1072); 
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:525:1: rule__IntentModel__Group__3 : rule__IntentModel__Group__3__Impl rule__IntentModel__Group__4 ;
    public final void rule__IntentModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:529:1: ( rule__IntentModel__Group__3__Impl rule__IntentModel__Group__4 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:530:2: rule__IntentModel__Group__3__Impl rule__IntentModel__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntentModel__Group__3__Impl_in_rule__IntentModel__Group__31103);
            rule__IntentModel__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IntentModel__Group__4_in_rule__IntentModel__Group__31106);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:537:1: rule__IntentModel__Group__3__Impl : ( '[' ) ;
    public final void rule__IntentModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:541:1: ( ( '[' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:542:1: ( '[' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:542:1: ( '[' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:543:1: '['
            {
             before(grammarAccess.getIntentModelAccess().getLeftSquareBracketKeyword_3()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__IntentModel__Group__3__Impl1134); 
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:556:1: rule__IntentModel__Group__4 : rule__IntentModel__Group__4__Impl rule__IntentModel__Group__5 ;
    public final void rule__IntentModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:560:1: ( rule__IntentModel__Group__4__Impl rule__IntentModel__Group__5 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:561:2: rule__IntentModel__Group__4__Impl rule__IntentModel__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntentModel__Group__4__Impl_in_rule__IntentModel__Group__41165);
            rule__IntentModel__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IntentModel__Group__5_in_rule__IntentModel__Group__41168);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:568:1: rule__IntentModel__Group__4__Impl : ( '{' ) ;
    public final void rule__IntentModel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:572:1: ( ( '{' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:573:1: ( '{' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:573:1: ( '{' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:574:1: '{'
            {
             before(grammarAccess.getIntentModelAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__IntentModel__Group__4__Impl1196); 
             after(grammarAccess.getIntentModelAccess().getLeftCurlyBracketKeyword_4()); 

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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:587:1: rule__IntentModel__Group__5 : rule__IntentModel__Group__5__Impl rule__IntentModel__Group__6 ;
    public final void rule__IntentModel__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:591:1: ( rule__IntentModel__Group__5__Impl rule__IntentModel__Group__6 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:592:2: rule__IntentModel__Group__5__Impl rule__IntentModel__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntentModel__Group__5__Impl_in_rule__IntentModel__Group__51227);
            rule__IntentModel__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IntentModel__Group__6_in_rule__IntentModel__Group__51230);
            rule__IntentModel__Group__6();

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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:599:1: rule__IntentModel__Group__5__Impl : ( ( rule__IntentModel__IntentsAssignment_5 ) ) ;
    public final void rule__IntentModel__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:603:1: ( ( ( rule__IntentModel__IntentsAssignment_5 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:604:1: ( ( rule__IntentModel__IntentsAssignment_5 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:604:1: ( ( rule__IntentModel__IntentsAssignment_5 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:605:1: ( rule__IntentModel__IntentsAssignment_5 )
            {
             before(grammarAccess.getIntentModelAccess().getIntentsAssignment_5()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:606:1: ( rule__IntentModel__IntentsAssignment_5 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:606:2: rule__IntentModel__IntentsAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntentModel__IntentsAssignment_5_in_rule__IntentModel__Group__5__Impl1257);
            rule__IntentModel__IntentsAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getIntentModelAccess().getIntentsAssignment_5()); 

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


    // $ANTLR start "rule__IntentModel__Group__6"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:616:1: rule__IntentModel__Group__6 : rule__IntentModel__Group__6__Impl rule__IntentModel__Group__7 ;
    public final void rule__IntentModel__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:620:1: ( rule__IntentModel__Group__6__Impl rule__IntentModel__Group__7 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:621:2: rule__IntentModel__Group__6__Impl rule__IntentModel__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntentModel__Group__6__Impl_in_rule__IntentModel__Group__61287);
            rule__IntentModel__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IntentModel__Group__7_in_rule__IntentModel__Group__61290);
            rule__IntentModel__Group__7();

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
    // $ANTLR end "rule__IntentModel__Group__6"


    // $ANTLR start "rule__IntentModel__Group__6__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:628:1: rule__IntentModel__Group__6__Impl : ( '}' ) ;
    public final void rule__IntentModel__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:632:1: ( ( '}' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:633:1: ( '}' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:633:1: ( '}' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:634:1: '}'
            {
             before(grammarAccess.getIntentModelAccess().getRightCurlyBracketKeyword_6()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__IntentModel__Group__6__Impl1318); 
             after(grammarAccess.getIntentModelAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__IntentModel__Group__6__Impl"


    // $ANTLR start "rule__IntentModel__Group__7"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:647:1: rule__IntentModel__Group__7 : rule__IntentModel__Group__7__Impl rule__IntentModel__Group__8 ;
    public final void rule__IntentModel__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:651:1: ( rule__IntentModel__Group__7__Impl rule__IntentModel__Group__8 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:652:2: rule__IntentModel__Group__7__Impl rule__IntentModel__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntentModel__Group__7__Impl_in_rule__IntentModel__Group__71349);
            rule__IntentModel__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IntentModel__Group__8_in_rule__IntentModel__Group__71352);
            rule__IntentModel__Group__8();

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
    // $ANTLR end "rule__IntentModel__Group__7"


    // $ANTLR start "rule__IntentModel__Group__7__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:659:1: rule__IntentModel__Group__7__Impl : ( ( rule__IntentModel__Group_7__0 )* ) ;
    public final void rule__IntentModel__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:663:1: ( ( ( rule__IntentModel__Group_7__0 )* ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:664:1: ( ( rule__IntentModel__Group_7__0 )* )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:664:1: ( ( rule__IntentModel__Group_7__0 )* )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:665:1: ( rule__IntentModel__Group_7__0 )*
            {
             before(grammarAccess.getIntentModelAccess().getGroup_7()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:666:1: ( rule__IntentModel__Group_7__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==25) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:666:2: rule__IntentModel__Group_7__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__IntentModel__Group_7__0_in_rule__IntentModel__Group__7__Impl1379);
            	    rule__IntentModel__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getIntentModelAccess().getGroup_7()); 

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
    // $ANTLR end "rule__IntentModel__Group__7__Impl"


    // $ANTLR start "rule__IntentModel__Group__8"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:676:1: rule__IntentModel__Group__8 : rule__IntentModel__Group__8__Impl ;
    public final void rule__IntentModel__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:680:1: ( rule__IntentModel__Group__8__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:681:2: rule__IntentModel__Group__8__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntentModel__Group__8__Impl_in_rule__IntentModel__Group__81410);
            rule__IntentModel__Group__8__Impl();

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
    // $ANTLR end "rule__IntentModel__Group__8"


    // $ANTLR start "rule__IntentModel__Group__8__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:687:1: rule__IntentModel__Group__8__Impl : ( ']' ) ;
    public final void rule__IntentModel__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:691:1: ( ( ']' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:692:1: ( ']' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:692:1: ( ']' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:693:1: ']'
            {
             before(grammarAccess.getIntentModelAccess().getRightSquareBracketKeyword_8()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__IntentModel__Group__8__Impl1438); 
             after(grammarAccess.getIntentModelAccess().getRightSquareBracketKeyword_8()); 

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
    // $ANTLR end "rule__IntentModel__Group__8__Impl"


    // $ANTLR start "rule__IntentModel__Group_7__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:724:1: rule__IntentModel__Group_7__0 : rule__IntentModel__Group_7__0__Impl rule__IntentModel__Group_7__1 ;
    public final void rule__IntentModel__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:728:1: ( rule__IntentModel__Group_7__0__Impl rule__IntentModel__Group_7__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:729:2: rule__IntentModel__Group_7__0__Impl rule__IntentModel__Group_7__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntentModel__Group_7__0__Impl_in_rule__IntentModel__Group_7__01487);
            rule__IntentModel__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IntentModel__Group_7__1_in_rule__IntentModel__Group_7__01490);
            rule__IntentModel__Group_7__1();

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
    // $ANTLR end "rule__IntentModel__Group_7__0"


    // $ANTLR start "rule__IntentModel__Group_7__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:736:1: rule__IntentModel__Group_7__0__Impl : ( ',' ) ;
    public final void rule__IntentModel__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:740:1: ( ( ',' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:741:1: ( ',' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:741:1: ( ',' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:742:1: ','
            {
             before(grammarAccess.getIntentModelAccess().getCommaKeyword_7_0()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__IntentModel__Group_7__0__Impl1518); 
             after(grammarAccess.getIntentModelAccess().getCommaKeyword_7_0()); 

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
    // $ANTLR end "rule__IntentModel__Group_7__0__Impl"


    // $ANTLR start "rule__IntentModel__Group_7__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:755:1: rule__IntentModel__Group_7__1 : rule__IntentModel__Group_7__1__Impl rule__IntentModel__Group_7__2 ;
    public final void rule__IntentModel__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:759:1: ( rule__IntentModel__Group_7__1__Impl rule__IntentModel__Group_7__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:760:2: rule__IntentModel__Group_7__1__Impl rule__IntentModel__Group_7__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntentModel__Group_7__1__Impl_in_rule__IntentModel__Group_7__11549);
            rule__IntentModel__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IntentModel__Group_7__2_in_rule__IntentModel__Group_7__11552);
            rule__IntentModel__Group_7__2();

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
    // $ANTLR end "rule__IntentModel__Group_7__1"


    // $ANTLR start "rule__IntentModel__Group_7__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:767:1: rule__IntentModel__Group_7__1__Impl : ( '{' ) ;
    public final void rule__IntentModel__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:771:1: ( ( '{' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:772:1: ( '{' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:772:1: ( '{' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:773:1: '{'
            {
             before(grammarAccess.getIntentModelAccess().getLeftCurlyBracketKeyword_7_1()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__IntentModel__Group_7__1__Impl1580); 
             after(grammarAccess.getIntentModelAccess().getLeftCurlyBracketKeyword_7_1()); 

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
    // $ANTLR end "rule__IntentModel__Group_7__1__Impl"


    // $ANTLR start "rule__IntentModel__Group_7__2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:786:1: rule__IntentModel__Group_7__2 : rule__IntentModel__Group_7__2__Impl rule__IntentModel__Group_7__3 ;
    public final void rule__IntentModel__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:790:1: ( rule__IntentModel__Group_7__2__Impl rule__IntentModel__Group_7__3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:791:2: rule__IntentModel__Group_7__2__Impl rule__IntentModel__Group_7__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntentModel__Group_7__2__Impl_in_rule__IntentModel__Group_7__21611);
            rule__IntentModel__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IntentModel__Group_7__3_in_rule__IntentModel__Group_7__21614);
            rule__IntentModel__Group_7__3();

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
    // $ANTLR end "rule__IntentModel__Group_7__2"


    // $ANTLR start "rule__IntentModel__Group_7__2__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:798:1: rule__IntentModel__Group_7__2__Impl : ( ( rule__IntentModel__IntentsAssignment_7_2 ) ) ;
    public final void rule__IntentModel__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:802:1: ( ( ( rule__IntentModel__IntentsAssignment_7_2 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:803:1: ( ( rule__IntentModel__IntentsAssignment_7_2 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:803:1: ( ( rule__IntentModel__IntentsAssignment_7_2 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:804:1: ( rule__IntentModel__IntentsAssignment_7_2 )
            {
             before(grammarAccess.getIntentModelAccess().getIntentsAssignment_7_2()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:805:1: ( rule__IntentModel__IntentsAssignment_7_2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:805:2: rule__IntentModel__IntentsAssignment_7_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntentModel__IntentsAssignment_7_2_in_rule__IntentModel__Group_7__2__Impl1641);
            rule__IntentModel__IntentsAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getIntentModelAccess().getIntentsAssignment_7_2()); 

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
    // $ANTLR end "rule__IntentModel__Group_7__2__Impl"


    // $ANTLR start "rule__IntentModel__Group_7__3"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:815:1: rule__IntentModel__Group_7__3 : rule__IntentModel__Group_7__3__Impl ;
    public final void rule__IntentModel__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:819:1: ( rule__IntentModel__Group_7__3__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:820:2: rule__IntentModel__Group_7__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntentModel__Group_7__3__Impl_in_rule__IntentModel__Group_7__31671);
            rule__IntentModel__Group_7__3__Impl();

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
    // $ANTLR end "rule__IntentModel__Group_7__3"


    // $ANTLR start "rule__IntentModel__Group_7__3__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:826:1: rule__IntentModel__Group_7__3__Impl : ( '}' ) ;
    public final void rule__IntentModel__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:830:1: ( ( '}' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:831:1: ( '}' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:831:1: ( '}' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:832:1: '}'
            {
             before(grammarAccess.getIntentModelAccess().getRightCurlyBracketKeyword_7_3()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__IntentModel__Group_7__3__Impl1699); 
             after(grammarAccess.getIntentModelAccess().getRightCurlyBracketKeyword_7_3()); 

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
    // $ANTLR end "rule__IntentModel__Group_7__3__Impl"


    // $ANTLR start "rule__Intent__Group__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:853:1: rule__Intent__Group__0 : rule__Intent__Group__0__Impl rule__Intent__Group__1 ;
    public final void rule__Intent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:857:1: ( rule__Intent__Group__0__Impl rule__Intent__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:858:2: rule__Intent__Group__0__Impl rule__Intent__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group__0__Impl_in_rule__Intent__Group__01738);
            rule__Intent__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group__1_in_rule__Intent__Group__01741);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:865:1: rule__Intent__Group__0__Impl : ( 'Type' ) ;
    public final void rule__Intent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:869:1: ( ( 'Type' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:870:1: ( 'Type' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:870:1: ( 'Type' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:871:1: 'Type'
            {
             before(grammarAccess.getIntentAccess().getTypeKeyword_0()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__Intent__Group__0__Impl1769); 
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:884:1: rule__Intent__Group__1 : rule__Intent__Group__1__Impl rule__Intent__Group__2 ;
    public final void rule__Intent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:888:1: ( rule__Intent__Group__1__Impl rule__Intent__Group__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:889:2: rule__Intent__Group__1__Impl rule__Intent__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group__1__Impl_in_rule__Intent__Group__11800);
            rule__Intent__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group__2_in_rule__Intent__Group__11803);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:896:1: rule__Intent__Group__1__Impl : ( ':' ) ;
    public final void rule__Intent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:900:1: ( ( ':' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:901:1: ( ':' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:901:1: ( ':' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:902:1: ':'
            {
             before(grammarAccess.getIntentAccess().getColonKeyword_1()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__Intent__Group__1__Impl1831); 
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:915:1: rule__Intent__Group__2 : rule__Intent__Group__2__Impl rule__Intent__Group__3 ;
    public final void rule__Intent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:919:1: ( rule__Intent__Group__2__Impl rule__Intent__Group__3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:920:2: rule__Intent__Group__2__Impl rule__Intent__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group__2__Impl_in_rule__Intent__Group__21862);
            rule__Intent__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group__3_in_rule__Intent__Group__21865);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:927:1: rule__Intent__Group__2__Impl : ( ( rule__Intent__Alternatives_2 ) ) ;
    public final void rule__Intent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:931:1: ( ( ( rule__Intent__Alternatives_2 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:932:1: ( ( rule__Intent__Alternatives_2 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:932:1: ( ( rule__Intent__Alternatives_2 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:933:1: ( rule__Intent__Alternatives_2 )
            {
             before(grammarAccess.getIntentAccess().getAlternatives_2()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:934:1: ( rule__Intent__Alternatives_2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:934:2: rule__Intent__Alternatives_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Alternatives_2_in_rule__Intent__Group__2__Impl1892);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:944:1: rule__Intent__Group__3 : rule__Intent__Group__3__Impl rule__Intent__Group__4 ;
    public final void rule__Intent__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:948:1: ( rule__Intent__Group__3__Impl rule__Intent__Group__4 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:949:2: rule__Intent__Group__3__Impl rule__Intent__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group__3__Impl_in_rule__Intent__Group__31922);
            rule__Intent__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group__4_in_rule__Intent__Group__31925);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:956:1: rule__Intent__Group__3__Impl : ( ',' ) ;
    public final void rule__Intent__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:960:1: ( ( ',' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:961:1: ( ',' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:961:1: ( ',' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:962:1: ','
            {
             before(grammarAccess.getIntentAccess().getCommaKeyword_3()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Intent__Group__3__Impl1953); 
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:975:1: rule__Intent__Group__4 : rule__Intent__Group__4__Impl ;
    public final void rule__Intent__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:979:1: ( rule__Intent__Group__4__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:980:2: rule__Intent__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group__4__Impl_in_rule__Intent__Group__41984);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:986:1: rule__Intent__Group__4__Impl : ( ( rule__Intent__Group_4__0 ) ) ;
    public final void rule__Intent__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:990:1: ( ( ( rule__Intent__Group_4__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:991:1: ( ( rule__Intent__Group_4__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:991:1: ( ( rule__Intent__Group_4__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:992:1: ( rule__Intent__Group_4__0 )
            {
             before(grammarAccess.getIntentAccess().getGroup_4()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:993:1: ( rule__Intent__Group_4__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:993:2: rule__Intent__Group_4__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4__0_in_rule__Intent__Group__4__Impl2011);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1013:1: rule__Intent__Group_4__0 : rule__Intent__Group_4__0__Impl rule__Intent__Group_4__1 ;
    public final void rule__Intent__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1017:1: ( rule__Intent__Group_4__0__Impl rule__Intent__Group_4__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1018:2: rule__Intent__Group_4__0__Impl rule__Intent__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4__0__Impl_in_rule__Intent__Group_4__02051);
            rule__Intent__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4__1_in_rule__Intent__Group_4__02054);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1025:1: rule__Intent__Group_4__0__Impl : ( ( rule__Intent__Group_4_0__0 ) ) ;
    public final void rule__Intent__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1029:1: ( ( ( rule__Intent__Group_4_0__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1030:1: ( ( rule__Intent__Group_4_0__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1030:1: ( ( rule__Intent__Group_4_0__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1031:1: ( rule__Intent__Group_4_0__0 )
            {
             before(grammarAccess.getIntentAccess().getGroup_4_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1032:1: ( rule__Intent__Group_4_0__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1032:2: rule__Intent__Group_4_0__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_0__0_in_rule__Intent__Group_4__0__Impl2081);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1042:1: rule__Intent__Group_4__1 : rule__Intent__Group_4__1__Impl rule__Intent__Group_4__2 ;
    public final void rule__Intent__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1046:1: ( rule__Intent__Group_4__1__Impl rule__Intent__Group_4__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1047:2: rule__Intent__Group_4__1__Impl rule__Intent__Group_4__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4__1__Impl_in_rule__Intent__Group_4__12111);
            rule__Intent__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4__2_in_rule__Intent__Group_4__12114);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1054:1: rule__Intent__Group_4__1__Impl : ( ( rule__Intent__Group_4_1__0 ) ) ;
    public final void rule__Intent__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1058:1: ( ( ( rule__Intent__Group_4_1__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1059:1: ( ( rule__Intent__Group_4_1__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1059:1: ( ( rule__Intent__Group_4_1__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1060:1: ( rule__Intent__Group_4_1__0 )
            {
             before(grammarAccess.getIntentAccess().getGroup_4_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1061:1: ( rule__Intent__Group_4_1__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1061:2: rule__Intent__Group_4_1__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_1__0_in_rule__Intent__Group_4__1__Impl2141);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1071:1: rule__Intent__Group_4__2 : rule__Intent__Group_4__2__Impl rule__Intent__Group_4__3 ;
    public final void rule__Intent__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1075:1: ( rule__Intent__Group_4__2__Impl rule__Intent__Group_4__3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1076:2: rule__Intent__Group_4__2__Impl rule__Intent__Group_4__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4__2__Impl_in_rule__Intent__Group_4__22171);
            rule__Intent__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4__3_in_rule__Intent__Group_4__22174);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1083:1: rule__Intent__Group_4__2__Impl : ( ( rule__Intent__Group_4_2__0 )? ) ;
    public final void rule__Intent__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1087:1: ( ( ( rule__Intent__Group_4_2__0 )? ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1088:1: ( ( rule__Intent__Group_4_2__0 )? )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1088:1: ( ( rule__Intent__Group_4_2__0 )? )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1089:1: ( rule__Intent__Group_4_2__0 )?
            {
             before(grammarAccess.getIntentAccess().getGroup_4_2()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1090:1: ( rule__Intent__Group_4_2__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==30) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1090:2: rule__Intent__Group_4_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_2__0_in_rule__Intent__Group_4__2__Impl2201);
                    rule__Intent__Group_4_2__0();

                    state._fsp--;


                    }
                    break;

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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1100:1: rule__Intent__Group_4__3 : rule__Intent__Group_4__3__Impl rule__Intent__Group_4__4 ;
    public final void rule__Intent__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1104:1: ( rule__Intent__Group_4__3__Impl rule__Intent__Group_4__4 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1105:2: rule__Intent__Group_4__3__Impl rule__Intent__Group_4__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4__3__Impl_in_rule__Intent__Group_4__32232);
            rule__Intent__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4__4_in_rule__Intent__Group_4__32235);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1112:1: rule__Intent__Group_4__3__Impl : ( ( rule__Intent__Group_4_3__0 ) ) ;
    public final void rule__Intent__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1116:1: ( ( ( rule__Intent__Group_4_3__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1117:1: ( ( rule__Intent__Group_4_3__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1117:1: ( ( rule__Intent__Group_4_3__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1118:1: ( rule__Intent__Group_4_3__0 )
            {
             before(grammarAccess.getIntentAccess().getGroup_4_3()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1119:1: ( rule__Intent__Group_4_3__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1119:2: rule__Intent__Group_4_3__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_3__0_in_rule__Intent__Group_4__3__Impl2262);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1129:1: rule__Intent__Group_4__4 : rule__Intent__Group_4__4__Impl rule__Intent__Group_4__5 ;
    public final void rule__Intent__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1133:1: ( rule__Intent__Group_4__4__Impl rule__Intent__Group_4__5 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1134:2: rule__Intent__Group_4__4__Impl rule__Intent__Group_4__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4__4__Impl_in_rule__Intent__Group_4__42292);
            rule__Intent__Group_4__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4__5_in_rule__Intent__Group_4__42295);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1141:1: rule__Intent__Group_4__4__Impl : ( ( rule__Intent__Group_4_4__0 )? ) ;
    public final void rule__Intent__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1145:1: ( ( ( rule__Intent__Group_4_4__0 )? ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1146:1: ( ( rule__Intent__Group_4_4__0 )? )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1146:1: ( ( rule__Intent__Group_4_4__0 )? )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1147:1: ( rule__Intent__Group_4_4__0 )?
            {
             before(grammarAccess.getIntentAccess().getGroup_4_4()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1148:1: ( rule__Intent__Group_4_4__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==32) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1148:2: rule__Intent__Group_4_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_4__0_in_rule__Intent__Group_4__4__Impl2322);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1158:1: rule__Intent__Group_4__5 : rule__Intent__Group_4__5__Impl rule__Intent__Group_4__6 ;
    public final void rule__Intent__Group_4__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1162:1: ( rule__Intent__Group_4__5__Impl rule__Intent__Group_4__6 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1163:2: rule__Intent__Group_4__5__Impl rule__Intent__Group_4__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4__5__Impl_in_rule__Intent__Group_4__52353);
            rule__Intent__Group_4__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4__6_in_rule__Intent__Group_4__52356);
            rule__Intent__Group_4__6();

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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1170:1: rule__Intent__Group_4__5__Impl : ( ( rule__Intent__Group_4_5__0 )? ) ;
    public final void rule__Intent__Group_4__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1174:1: ( ( ( rule__Intent__Group_4_5__0 )? ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1175:1: ( ( rule__Intent__Group_4_5__0 )? )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1175:1: ( ( rule__Intent__Group_4_5__0 )? )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1176:1: ( rule__Intent__Group_4_5__0 )?
            {
             before(grammarAccess.getIntentAccess().getGroup_4_5()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1177:1: ( rule__Intent__Group_4_5__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==33) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1177:2: rule__Intent__Group_4_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_5__0_in_rule__Intent__Group_4__5__Impl2383);
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


    // $ANTLR start "rule__Intent__Group_4__6"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1187:1: rule__Intent__Group_4__6 : rule__Intent__Group_4__6__Impl rule__Intent__Group_4__7 ;
    public final void rule__Intent__Group_4__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1191:1: ( rule__Intent__Group_4__6__Impl rule__Intent__Group_4__7 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1192:2: rule__Intent__Group_4__6__Impl rule__Intent__Group_4__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4__6__Impl_in_rule__Intent__Group_4__62414);
            rule__Intent__Group_4__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4__7_in_rule__Intent__Group_4__62417);
            rule__Intent__Group_4__7();

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
    // $ANTLR end "rule__Intent__Group_4__6"


    // $ANTLR start "rule__Intent__Group_4__6__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1199:1: rule__Intent__Group_4__6__Impl : ( ( rule__Intent__Group_4_6__0 )? ) ;
    public final void rule__Intent__Group_4__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1203:1: ( ( ( rule__Intent__Group_4_6__0 )? ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1204:1: ( ( rule__Intent__Group_4_6__0 )? )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1204:1: ( ( rule__Intent__Group_4_6__0 )? )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1205:1: ( rule__Intent__Group_4_6__0 )?
            {
             before(grammarAccess.getIntentAccess().getGroup_4_6()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1206:1: ( rule__Intent__Group_4_6__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==34) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1206:2: rule__Intent__Group_4_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_6__0_in_rule__Intent__Group_4__6__Impl2444);
                    rule__Intent__Group_4_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIntentAccess().getGroup_4_6()); 

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
    // $ANTLR end "rule__Intent__Group_4__6__Impl"


    // $ANTLR start "rule__Intent__Group_4__7"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1216:1: rule__Intent__Group_4__7 : rule__Intent__Group_4__7__Impl ;
    public final void rule__Intent__Group_4__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1220:1: ( rule__Intent__Group_4__7__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1221:2: rule__Intent__Group_4__7__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4__7__Impl_in_rule__Intent__Group_4__72475);
            rule__Intent__Group_4__7__Impl();

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
    // $ANTLR end "rule__Intent__Group_4__7"


    // $ANTLR start "rule__Intent__Group_4__7__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1227:1: rule__Intent__Group_4__7__Impl : ( ( rule__Intent__Group_4_7__0 )? ) ;
    public final void rule__Intent__Group_4__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1231:1: ( ( ( rule__Intent__Group_4_7__0 )? ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1232:1: ( ( rule__Intent__Group_4_7__0 )? )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1232:1: ( ( rule__Intent__Group_4_7__0 )? )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1233:1: ( rule__Intent__Group_4_7__0 )?
            {
             before(grammarAccess.getIntentAccess().getGroup_4_7()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1234:1: ( rule__Intent__Group_4_7__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==35) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1234:2: rule__Intent__Group_4_7__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_7__0_in_rule__Intent__Group_4__7__Impl2502);
                    rule__Intent__Group_4_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIntentAccess().getGroup_4_7()); 

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
    // $ANTLR end "rule__Intent__Group_4__7__Impl"


    // $ANTLR start "rule__Intent__Group_4_0__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1260:1: rule__Intent__Group_4_0__0 : rule__Intent__Group_4_0__0__Impl rule__Intent__Group_4_0__1 ;
    public final void rule__Intent__Group_4_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1264:1: ( rule__Intent__Group_4_0__0__Impl rule__Intent__Group_4_0__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1265:2: rule__Intent__Group_4_0__0__Impl rule__Intent__Group_4_0__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_0__0__Impl_in_rule__Intent__Group_4_0__02549);
            rule__Intent__Group_4_0__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_0__1_in_rule__Intent__Group_4_0__02552);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1272:1: rule__Intent__Group_4_0__0__Impl : ( 'Name' ) ;
    public final void rule__Intent__Group_4_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1276:1: ( ( 'Name' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1277:1: ( 'Name' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1277:1: ( 'Name' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1278:1: 'Name'
            {
             before(grammarAccess.getIntentAccess().getNameKeyword_4_0_0()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__Intent__Group_4_0__0__Impl2580); 
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1291:1: rule__Intent__Group_4_0__1 : rule__Intent__Group_4_0__1__Impl rule__Intent__Group_4_0__2 ;
    public final void rule__Intent__Group_4_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1295:1: ( rule__Intent__Group_4_0__1__Impl rule__Intent__Group_4_0__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1296:2: rule__Intent__Group_4_0__1__Impl rule__Intent__Group_4_0__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_0__1__Impl_in_rule__Intent__Group_4_0__12611);
            rule__Intent__Group_4_0__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_0__2_in_rule__Intent__Group_4_0__12614);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1303:1: rule__Intent__Group_4_0__1__Impl : ( ':' ) ;
    public final void rule__Intent__Group_4_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1307:1: ( ( ':' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1308:1: ( ':' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1308:1: ( ':' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1309:1: ':'
            {
             before(grammarAccess.getIntentAccess().getColonKeyword_4_0_1()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__Intent__Group_4_0__1__Impl2642); 
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1322:1: rule__Intent__Group_4_0__2 : rule__Intent__Group_4_0__2__Impl rule__Intent__Group_4_0__3 ;
    public final void rule__Intent__Group_4_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1326:1: ( rule__Intent__Group_4_0__2__Impl rule__Intent__Group_4_0__3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1327:2: rule__Intent__Group_4_0__2__Impl rule__Intent__Group_4_0__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_0__2__Impl_in_rule__Intent__Group_4_0__22673);
            rule__Intent__Group_4_0__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_0__3_in_rule__Intent__Group_4_0__22676);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1334:1: rule__Intent__Group_4_0__2__Impl : ( ( rule__Intent__NameAssignment_4_0_2 ) ) ;
    public final void rule__Intent__Group_4_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1338:1: ( ( ( rule__Intent__NameAssignment_4_0_2 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1339:1: ( ( rule__Intent__NameAssignment_4_0_2 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1339:1: ( ( rule__Intent__NameAssignment_4_0_2 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1340:1: ( rule__Intent__NameAssignment_4_0_2 )
            {
             before(grammarAccess.getIntentAccess().getNameAssignment_4_0_2()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1341:1: ( rule__Intent__NameAssignment_4_0_2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1341:2: rule__Intent__NameAssignment_4_0_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__NameAssignment_4_0_2_in_rule__Intent__Group_4_0__2__Impl2703);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1351:1: rule__Intent__Group_4_0__3 : rule__Intent__Group_4_0__3__Impl ;
    public final void rule__Intent__Group_4_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1355:1: ( rule__Intent__Group_4_0__3__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1356:2: rule__Intent__Group_4_0__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_0__3__Impl_in_rule__Intent__Group_4_0__32733);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1362:1: rule__Intent__Group_4_0__3__Impl : ( ',' ) ;
    public final void rule__Intent__Group_4_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1366:1: ( ( ',' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1367:1: ( ',' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1367:1: ( ',' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1368:1: ','
            {
             before(grammarAccess.getIntentAccess().getCommaKeyword_4_0_3()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Intent__Group_4_0__3__Impl2761); 
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1389:1: rule__Intent__Group_4_1__0 : rule__Intent__Group_4_1__0__Impl rule__Intent__Group_4_1__1 ;
    public final void rule__Intent__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1393:1: ( rule__Intent__Group_4_1__0__Impl rule__Intent__Group_4_1__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1394:2: rule__Intent__Group_4_1__0__Impl rule__Intent__Group_4_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_1__0__Impl_in_rule__Intent__Group_4_1__02800);
            rule__Intent__Group_4_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_1__1_in_rule__Intent__Group_4_1__02803);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1401:1: rule__Intent__Group_4_1__0__Impl : ( 'Action' ) ;
    public final void rule__Intent__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1405:1: ( ( 'Action' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1406:1: ( 'Action' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1406:1: ( 'Action' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1407:1: 'Action'
            {
             before(grammarAccess.getIntentAccess().getActionKeyword_4_1_0()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__Intent__Group_4_1__0__Impl2831); 
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1420:1: rule__Intent__Group_4_1__1 : rule__Intent__Group_4_1__1__Impl rule__Intent__Group_4_1__2 ;
    public final void rule__Intent__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1424:1: ( rule__Intent__Group_4_1__1__Impl rule__Intent__Group_4_1__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1425:2: rule__Intent__Group_4_1__1__Impl rule__Intent__Group_4_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_1__1__Impl_in_rule__Intent__Group_4_1__12862);
            rule__Intent__Group_4_1__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_1__2_in_rule__Intent__Group_4_1__12865);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1432:1: rule__Intent__Group_4_1__1__Impl : ( ':' ) ;
    public final void rule__Intent__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1436:1: ( ( ':' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1437:1: ( ':' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1437:1: ( ':' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1438:1: ':'
            {
             before(grammarAccess.getIntentAccess().getColonKeyword_4_1_1()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__Intent__Group_4_1__1__Impl2893); 
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1451:1: rule__Intent__Group_4_1__2 : rule__Intent__Group_4_1__2__Impl rule__Intent__Group_4_1__3 ;
    public final void rule__Intent__Group_4_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1455:1: ( rule__Intent__Group_4_1__2__Impl rule__Intent__Group_4_1__3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1456:2: rule__Intent__Group_4_1__2__Impl rule__Intent__Group_4_1__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_1__2__Impl_in_rule__Intent__Group_4_1__22924);
            rule__Intent__Group_4_1__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_1__3_in_rule__Intent__Group_4_1__22927);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1463:1: rule__Intent__Group_4_1__2__Impl : ( ( rule__Intent__ActionAssignment_4_1_2 ) ) ;
    public final void rule__Intent__Group_4_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1467:1: ( ( ( rule__Intent__ActionAssignment_4_1_2 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1468:1: ( ( rule__Intent__ActionAssignment_4_1_2 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1468:1: ( ( rule__Intent__ActionAssignment_4_1_2 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1469:1: ( rule__Intent__ActionAssignment_4_1_2 )
            {
             before(grammarAccess.getIntentAccess().getActionAssignment_4_1_2()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1470:1: ( rule__Intent__ActionAssignment_4_1_2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1470:2: rule__Intent__ActionAssignment_4_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__ActionAssignment_4_1_2_in_rule__Intent__Group_4_1__2__Impl2954);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1480:1: rule__Intent__Group_4_1__3 : rule__Intent__Group_4_1__3__Impl ;
    public final void rule__Intent__Group_4_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1484:1: ( rule__Intent__Group_4_1__3__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1485:2: rule__Intent__Group_4_1__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_1__3__Impl_in_rule__Intent__Group_4_1__32984);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1491:1: rule__Intent__Group_4_1__3__Impl : ( ',' ) ;
    public final void rule__Intent__Group_4_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1495:1: ( ( ',' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1496:1: ( ',' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1496:1: ( ',' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1497:1: ','
            {
             before(grammarAccess.getIntentAccess().getCommaKeyword_4_1_3()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Intent__Group_4_1__3__Impl3012); 
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1518:1: rule__Intent__Group_4_2__0 : rule__Intent__Group_4_2__0__Impl rule__Intent__Group_4_2__1 ;
    public final void rule__Intent__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1522:1: ( rule__Intent__Group_4_2__0__Impl rule__Intent__Group_4_2__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1523:2: rule__Intent__Group_4_2__0__Impl rule__Intent__Group_4_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_2__0__Impl_in_rule__Intent__Group_4_2__03051);
            rule__Intent__Group_4_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_2__1_in_rule__Intent__Group_4_2__03054);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1530:1: rule__Intent__Group_4_2__0__Impl : ( 'Category' ) ;
    public final void rule__Intent__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1534:1: ( ( 'Category' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1535:1: ( 'Category' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1535:1: ( 'Category' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1536:1: 'Category'
            {
             before(grammarAccess.getIntentAccess().getCategoryKeyword_4_2_0()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__Intent__Group_4_2__0__Impl3082); 
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1549:1: rule__Intent__Group_4_2__1 : rule__Intent__Group_4_2__1__Impl rule__Intent__Group_4_2__2 ;
    public final void rule__Intent__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1553:1: ( rule__Intent__Group_4_2__1__Impl rule__Intent__Group_4_2__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1554:2: rule__Intent__Group_4_2__1__Impl rule__Intent__Group_4_2__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_2__1__Impl_in_rule__Intent__Group_4_2__13113);
            rule__Intent__Group_4_2__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_2__2_in_rule__Intent__Group_4_2__13116);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1561:1: rule__Intent__Group_4_2__1__Impl : ( ':' ) ;
    public final void rule__Intent__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1565:1: ( ( ':' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1566:1: ( ':' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1566:1: ( ':' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1567:1: ':'
            {
             before(grammarAccess.getIntentAccess().getColonKeyword_4_2_1()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__Intent__Group_4_2__1__Impl3144); 
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1580:1: rule__Intent__Group_4_2__2 : rule__Intent__Group_4_2__2__Impl rule__Intent__Group_4_2__3 ;
    public final void rule__Intent__Group_4_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1584:1: ( rule__Intent__Group_4_2__2__Impl rule__Intent__Group_4_2__3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1585:2: rule__Intent__Group_4_2__2__Impl rule__Intent__Group_4_2__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_2__2__Impl_in_rule__Intent__Group_4_2__23175);
            rule__Intent__Group_4_2__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_2__3_in_rule__Intent__Group_4_2__23178);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1592:1: rule__Intent__Group_4_2__2__Impl : ( ( rule__Intent__CategoryAssignment_4_2_2 ) ) ;
    public final void rule__Intent__Group_4_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1596:1: ( ( ( rule__Intent__CategoryAssignment_4_2_2 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1597:1: ( ( rule__Intent__CategoryAssignment_4_2_2 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1597:1: ( ( rule__Intent__CategoryAssignment_4_2_2 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1598:1: ( rule__Intent__CategoryAssignment_4_2_2 )
            {
             before(grammarAccess.getIntentAccess().getCategoryAssignment_4_2_2()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1599:1: ( rule__Intent__CategoryAssignment_4_2_2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1599:2: rule__Intent__CategoryAssignment_4_2_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__CategoryAssignment_4_2_2_in_rule__Intent__Group_4_2__2__Impl3205);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1609:1: rule__Intent__Group_4_2__3 : rule__Intent__Group_4_2__3__Impl ;
    public final void rule__Intent__Group_4_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1613:1: ( rule__Intent__Group_4_2__3__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1614:2: rule__Intent__Group_4_2__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_2__3__Impl_in_rule__Intent__Group_4_2__33235);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1620:1: rule__Intent__Group_4_2__3__Impl : ( ',' ) ;
    public final void rule__Intent__Group_4_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1624:1: ( ( ',' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1625:1: ( ',' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1625:1: ( ',' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1626:1: ','
            {
             before(grammarAccess.getIntentAccess().getCommaKeyword_4_2_3()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Intent__Group_4_2__3__Impl3263); 
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1647:1: rule__Intent__Group_4_3__0 : rule__Intent__Group_4_3__0__Impl rule__Intent__Group_4_3__1 ;
    public final void rule__Intent__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1651:1: ( rule__Intent__Group_4_3__0__Impl rule__Intent__Group_4_3__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1652:2: rule__Intent__Group_4_3__0__Impl rule__Intent__Group_4_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_3__0__Impl_in_rule__Intent__Group_4_3__03302);
            rule__Intent__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_3__1_in_rule__Intent__Group_4_3__03305);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1659:1: rule__Intent__Group_4_3__0__Impl : ( 'Meta-Category' ) ;
    public final void rule__Intent__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1663:1: ( ( 'Meta-Category' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1664:1: ( 'Meta-Category' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1664:1: ( 'Meta-Category' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1665:1: 'Meta-Category'
            {
             before(grammarAccess.getIntentAccess().getMetaCategoryKeyword_4_3_0()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__Intent__Group_4_3__0__Impl3333); 
             after(grammarAccess.getIntentAccess().getMetaCategoryKeyword_4_3_0()); 

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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1678:1: rule__Intent__Group_4_3__1 : rule__Intent__Group_4_3__1__Impl rule__Intent__Group_4_3__2 ;
    public final void rule__Intent__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1682:1: ( rule__Intent__Group_4_3__1__Impl rule__Intent__Group_4_3__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1683:2: rule__Intent__Group_4_3__1__Impl rule__Intent__Group_4_3__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_3__1__Impl_in_rule__Intent__Group_4_3__13364);
            rule__Intent__Group_4_3__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_3__2_in_rule__Intent__Group_4_3__13367);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1690:1: rule__Intent__Group_4_3__1__Impl : ( ':' ) ;
    public final void rule__Intent__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1694:1: ( ( ':' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1695:1: ( ':' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1695:1: ( ':' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1696:1: ':'
            {
             before(grammarAccess.getIntentAccess().getColonKeyword_4_3_1()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__Intent__Group_4_3__1__Impl3395); 
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1709:1: rule__Intent__Group_4_3__2 : rule__Intent__Group_4_3__2__Impl rule__Intent__Group_4_3__3 ;
    public final void rule__Intent__Group_4_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1713:1: ( rule__Intent__Group_4_3__2__Impl rule__Intent__Group_4_3__3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1714:2: rule__Intent__Group_4_3__2__Impl rule__Intent__Group_4_3__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_3__2__Impl_in_rule__Intent__Group_4_3__23426);
            rule__Intent__Group_4_3__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_3__3_in_rule__Intent__Group_4_3__23429);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1721:1: rule__Intent__Group_4_3__2__Impl : ( ( rule__Intent__MetaCategoryAssignment_4_3_2 ) ) ;
    public final void rule__Intent__Group_4_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1725:1: ( ( ( rule__Intent__MetaCategoryAssignment_4_3_2 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1726:1: ( ( rule__Intent__MetaCategoryAssignment_4_3_2 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1726:1: ( ( rule__Intent__MetaCategoryAssignment_4_3_2 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1727:1: ( rule__Intent__MetaCategoryAssignment_4_3_2 )
            {
             before(grammarAccess.getIntentAccess().getMetaCategoryAssignment_4_3_2()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1728:1: ( rule__Intent__MetaCategoryAssignment_4_3_2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1728:2: rule__Intent__MetaCategoryAssignment_4_3_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__MetaCategoryAssignment_4_3_2_in_rule__Intent__Group_4_3__2__Impl3456);
            rule__Intent__MetaCategoryAssignment_4_3_2();

            state._fsp--;


            }

             after(grammarAccess.getIntentAccess().getMetaCategoryAssignment_4_3_2()); 

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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1738:1: rule__Intent__Group_4_3__3 : rule__Intent__Group_4_3__3__Impl ;
    public final void rule__Intent__Group_4_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1742:1: ( rule__Intent__Group_4_3__3__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1743:2: rule__Intent__Group_4_3__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_3__3__Impl_in_rule__Intent__Group_4_3__33486);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1749:1: rule__Intent__Group_4_3__3__Impl : ( ',' ) ;
    public final void rule__Intent__Group_4_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1753:1: ( ( ',' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1754:1: ( ',' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1754:1: ( ',' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1755:1: ','
            {
             before(grammarAccess.getIntentAccess().getCommaKeyword_4_3_3()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Intent__Group_4_3__3__Impl3514); 
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1776:1: rule__Intent__Group_4_4__0 : rule__Intent__Group_4_4__0__Impl rule__Intent__Group_4_4__1 ;
    public final void rule__Intent__Group_4_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1780:1: ( rule__Intent__Group_4_4__0__Impl rule__Intent__Group_4_4__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1781:2: rule__Intent__Group_4_4__0__Impl rule__Intent__Group_4_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_4__0__Impl_in_rule__Intent__Group_4_4__03553);
            rule__Intent__Group_4_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_4__1_in_rule__Intent__Group_4_4__03556);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1788:1: rule__Intent__Group_4_4__0__Impl : ( 'DataURI' ) ;
    public final void rule__Intent__Group_4_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1792:1: ( ( 'DataURI' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1793:1: ( 'DataURI' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1793:1: ( 'DataURI' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1794:1: 'DataURI'
            {
             before(grammarAccess.getIntentAccess().getDataURIKeyword_4_4_0()); 
            match(input,32,FollowSets000.FOLLOW_32_in_rule__Intent__Group_4_4__0__Impl3584); 
             after(grammarAccess.getIntentAccess().getDataURIKeyword_4_4_0()); 

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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1807:1: rule__Intent__Group_4_4__1 : rule__Intent__Group_4_4__1__Impl rule__Intent__Group_4_4__2 ;
    public final void rule__Intent__Group_4_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1811:1: ( rule__Intent__Group_4_4__1__Impl rule__Intent__Group_4_4__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1812:2: rule__Intent__Group_4_4__1__Impl rule__Intent__Group_4_4__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_4__1__Impl_in_rule__Intent__Group_4_4__13615);
            rule__Intent__Group_4_4__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_4__2_in_rule__Intent__Group_4_4__13618);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1819:1: rule__Intent__Group_4_4__1__Impl : ( ':' ) ;
    public final void rule__Intent__Group_4_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1823:1: ( ( ':' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1824:1: ( ':' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1824:1: ( ':' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1825:1: ':'
            {
             before(grammarAccess.getIntentAccess().getColonKeyword_4_4_1()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__Intent__Group_4_4__1__Impl3646); 
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1838:1: rule__Intent__Group_4_4__2 : rule__Intent__Group_4_4__2__Impl rule__Intent__Group_4_4__3 ;
    public final void rule__Intent__Group_4_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1842:1: ( rule__Intent__Group_4_4__2__Impl rule__Intent__Group_4_4__3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1843:2: rule__Intent__Group_4_4__2__Impl rule__Intent__Group_4_4__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_4__2__Impl_in_rule__Intent__Group_4_4__23677);
            rule__Intent__Group_4_4__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_4__3_in_rule__Intent__Group_4_4__23680);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1850:1: rule__Intent__Group_4_4__2__Impl : ( ( rule__Intent__DataURIAssignment_4_4_2 ) ) ;
    public final void rule__Intent__Group_4_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1854:1: ( ( ( rule__Intent__DataURIAssignment_4_4_2 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1855:1: ( ( rule__Intent__DataURIAssignment_4_4_2 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1855:1: ( ( rule__Intent__DataURIAssignment_4_4_2 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1856:1: ( rule__Intent__DataURIAssignment_4_4_2 )
            {
             before(grammarAccess.getIntentAccess().getDataURIAssignment_4_4_2()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1857:1: ( rule__Intent__DataURIAssignment_4_4_2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1857:2: rule__Intent__DataURIAssignment_4_4_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__DataURIAssignment_4_4_2_in_rule__Intent__Group_4_4__2__Impl3707);
            rule__Intent__DataURIAssignment_4_4_2();

            state._fsp--;


            }

             after(grammarAccess.getIntentAccess().getDataURIAssignment_4_4_2()); 

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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1867:1: rule__Intent__Group_4_4__3 : rule__Intent__Group_4_4__3__Impl ;
    public final void rule__Intent__Group_4_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1871:1: ( rule__Intent__Group_4_4__3__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1872:2: rule__Intent__Group_4_4__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_4__3__Impl_in_rule__Intent__Group_4_4__33737);
            rule__Intent__Group_4_4__3__Impl();

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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1878:1: rule__Intent__Group_4_4__3__Impl : ( ',' ) ;
    public final void rule__Intent__Group_4_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1882:1: ( ( ',' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1883:1: ( ',' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1883:1: ( ',' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1884:1: ','
            {
             before(grammarAccess.getIntentAccess().getCommaKeyword_4_4_3()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Intent__Group_4_4__3__Impl3765); 
             after(grammarAccess.getIntentAccess().getCommaKeyword_4_4_3()); 

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


    // $ANTLR start "rule__Intent__Group_4_5__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1905:1: rule__Intent__Group_4_5__0 : rule__Intent__Group_4_5__0__Impl rule__Intent__Group_4_5__1 ;
    public final void rule__Intent__Group_4_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1909:1: ( rule__Intent__Group_4_5__0__Impl rule__Intent__Group_4_5__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1910:2: rule__Intent__Group_4_5__0__Impl rule__Intent__Group_4_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_5__0__Impl_in_rule__Intent__Group_4_5__03804);
            rule__Intent__Group_4_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_5__1_in_rule__Intent__Group_4_5__03807);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1917:1: rule__Intent__Group_4_5__0__Impl : ( 'Permission' ) ;
    public final void rule__Intent__Group_4_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1921:1: ( ( 'Permission' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1922:1: ( 'Permission' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1922:1: ( 'Permission' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1923:1: 'Permission'
            {
             before(grammarAccess.getIntentAccess().getPermissionKeyword_4_5_0()); 
            match(input,33,FollowSets000.FOLLOW_33_in_rule__Intent__Group_4_5__0__Impl3835); 
             after(grammarAccess.getIntentAccess().getPermissionKeyword_4_5_0()); 

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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1936:1: rule__Intent__Group_4_5__1 : rule__Intent__Group_4_5__1__Impl rule__Intent__Group_4_5__2 ;
    public final void rule__Intent__Group_4_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1940:1: ( rule__Intent__Group_4_5__1__Impl rule__Intent__Group_4_5__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1941:2: rule__Intent__Group_4_5__1__Impl rule__Intent__Group_4_5__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_5__1__Impl_in_rule__Intent__Group_4_5__13866);
            rule__Intent__Group_4_5__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_5__2_in_rule__Intent__Group_4_5__13869);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1948:1: rule__Intent__Group_4_5__1__Impl : ( ':' ) ;
    public final void rule__Intent__Group_4_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1952:1: ( ( ':' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1953:1: ( ':' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1953:1: ( ':' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1954:1: ':'
            {
             before(grammarAccess.getIntentAccess().getColonKeyword_4_5_1()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__Intent__Group_4_5__1__Impl3897); 
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1967:1: rule__Intent__Group_4_5__2 : rule__Intent__Group_4_5__2__Impl rule__Intent__Group_4_5__3 ;
    public final void rule__Intent__Group_4_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1971:1: ( rule__Intent__Group_4_5__2__Impl rule__Intent__Group_4_5__3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1972:2: rule__Intent__Group_4_5__2__Impl rule__Intent__Group_4_5__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_5__2__Impl_in_rule__Intent__Group_4_5__23928);
            rule__Intent__Group_4_5__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_5__3_in_rule__Intent__Group_4_5__23931);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1979:1: rule__Intent__Group_4_5__2__Impl : ( ( rule__Intent__PermissionAssignment_4_5_2 ) ) ;
    public final void rule__Intent__Group_4_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1983:1: ( ( ( rule__Intent__PermissionAssignment_4_5_2 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1984:1: ( ( rule__Intent__PermissionAssignment_4_5_2 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1984:1: ( ( rule__Intent__PermissionAssignment_4_5_2 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1985:1: ( rule__Intent__PermissionAssignment_4_5_2 )
            {
             before(grammarAccess.getIntentAccess().getPermissionAssignment_4_5_2()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1986:1: ( rule__Intent__PermissionAssignment_4_5_2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1986:2: rule__Intent__PermissionAssignment_4_5_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__PermissionAssignment_4_5_2_in_rule__Intent__Group_4_5__2__Impl3958);
            rule__Intent__PermissionAssignment_4_5_2();

            state._fsp--;


            }

             after(grammarAccess.getIntentAccess().getPermissionAssignment_4_5_2()); 

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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1996:1: rule__Intent__Group_4_5__3 : rule__Intent__Group_4_5__3__Impl ;
    public final void rule__Intent__Group_4_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2000:1: ( rule__Intent__Group_4_5__3__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2001:2: rule__Intent__Group_4_5__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_5__3__Impl_in_rule__Intent__Group_4_5__33988);
            rule__Intent__Group_4_5__3__Impl();

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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2007:1: rule__Intent__Group_4_5__3__Impl : ( ',' ) ;
    public final void rule__Intent__Group_4_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2011:1: ( ( ',' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2012:1: ( ',' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2012:1: ( ',' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2013:1: ','
            {
             before(grammarAccess.getIntentAccess().getCommaKeyword_4_5_3()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Intent__Group_4_5__3__Impl4016); 
             after(grammarAccess.getIntentAccess().getCommaKeyword_4_5_3()); 

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


    // $ANTLR start "rule__Intent__Group_4_6__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2034:1: rule__Intent__Group_4_6__0 : rule__Intent__Group_4_6__0__Impl rule__Intent__Group_4_6__1 ;
    public final void rule__Intent__Group_4_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2038:1: ( rule__Intent__Group_4_6__0__Impl rule__Intent__Group_4_6__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2039:2: rule__Intent__Group_4_6__0__Impl rule__Intent__Group_4_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_6__0__Impl_in_rule__Intent__Group_4_6__04055);
            rule__Intent__Group_4_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_6__1_in_rule__Intent__Group_4_6__04058);
            rule__Intent__Group_4_6__1();

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
    // $ANTLR end "rule__Intent__Group_4_6__0"


    // $ANTLR start "rule__Intent__Group_4_6__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2046:1: rule__Intent__Group_4_6__0__Impl : ( 'DataExtra' ) ;
    public final void rule__Intent__Group_4_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2050:1: ( ( 'DataExtra' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2051:1: ( 'DataExtra' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2051:1: ( 'DataExtra' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2052:1: 'DataExtra'
            {
             before(grammarAccess.getIntentAccess().getDataExtraKeyword_4_6_0()); 
            match(input,34,FollowSets000.FOLLOW_34_in_rule__Intent__Group_4_6__0__Impl4086); 
             after(grammarAccess.getIntentAccess().getDataExtraKeyword_4_6_0()); 

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
    // $ANTLR end "rule__Intent__Group_4_6__0__Impl"


    // $ANTLR start "rule__Intent__Group_4_6__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2065:1: rule__Intent__Group_4_6__1 : rule__Intent__Group_4_6__1__Impl rule__Intent__Group_4_6__2 ;
    public final void rule__Intent__Group_4_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2069:1: ( rule__Intent__Group_4_6__1__Impl rule__Intent__Group_4_6__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2070:2: rule__Intent__Group_4_6__1__Impl rule__Intent__Group_4_6__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_6__1__Impl_in_rule__Intent__Group_4_6__14117);
            rule__Intent__Group_4_6__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_6__2_in_rule__Intent__Group_4_6__14120);
            rule__Intent__Group_4_6__2();

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
    // $ANTLR end "rule__Intent__Group_4_6__1"


    // $ANTLR start "rule__Intent__Group_4_6__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2077:1: rule__Intent__Group_4_6__1__Impl : ( ':' ) ;
    public final void rule__Intent__Group_4_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2081:1: ( ( ':' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2082:1: ( ':' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2082:1: ( ':' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2083:1: ':'
            {
             before(grammarAccess.getIntentAccess().getColonKeyword_4_6_1()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__Intent__Group_4_6__1__Impl4148); 
             after(grammarAccess.getIntentAccess().getColonKeyword_4_6_1()); 

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
    // $ANTLR end "rule__Intent__Group_4_6__1__Impl"


    // $ANTLR start "rule__Intent__Group_4_6__2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2096:1: rule__Intent__Group_4_6__2 : rule__Intent__Group_4_6__2__Impl rule__Intent__Group_4_6__3 ;
    public final void rule__Intent__Group_4_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2100:1: ( rule__Intent__Group_4_6__2__Impl rule__Intent__Group_4_6__3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2101:2: rule__Intent__Group_4_6__2__Impl rule__Intent__Group_4_6__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_6__2__Impl_in_rule__Intent__Group_4_6__24179);
            rule__Intent__Group_4_6__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_6__3_in_rule__Intent__Group_4_6__24182);
            rule__Intent__Group_4_6__3();

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
    // $ANTLR end "rule__Intent__Group_4_6__2"


    // $ANTLR start "rule__Intent__Group_4_6__2__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2108:1: rule__Intent__Group_4_6__2__Impl : ( '[' ) ;
    public final void rule__Intent__Group_4_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2112:1: ( ( '[' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2113:1: ( '[' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2113:1: ( '[' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2114:1: '['
            {
             before(grammarAccess.getIntentAccess().getLeftSquareBracketKeyword_4_6_2()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__Intent__Group_4_6__2__Impl4210); 
             after(grammarAccess.getIntentAccess().getLeftSquareBracketKeyword_4_6_2()); 

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
    // $ANTLR end "rule__Intent__Group_4_6__2__Impl"


    // $ANTLR start "rule__Intent__Group_4_6__3"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2127:1: rule__Intent__Group_4_6__3 : rule__Intent__Group_4_6__3__Impl rule__Intent__Group_4_6__4 ;
    public final void rule__Intent__Group_4_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2131:1: ( rule__Intent__Group_4_6__3__Impl rule__Intent__Group_4_6__4 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2132:2: rule__Intent__Group_4_6__3__Impl rule__Intent__Group_4_6__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_6__3__Impl_in_rule__Intent__Group_4_6__34241);
            rule__Intent__Group_4_6__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_6__4_in_rule__Intent__Group_4_6__34244);
            rule__Intent__Group_4_6__4();

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
    // $ANTLR end "rule__Intent__Group_4_6__3"


    // $ANTLR start "rule__Intent__Group_4_6__3__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2139:1: rule__Intent__Group_4_6__3__Impl : ( ( rule__Intent__Group_4_6_3__0 )* ) ;
    public final void rule__Intent__Group_4_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2143:1: ( ( ( rule__Intent__Group_4_6_3__0 )* ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2144:1: ( ( rule__Intent__Group_4_6_3__0 )* )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2144:1: ( ( rule__Intent__Group_4_6_3__0 )* )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2145:1: ( rule__Intent__Group_4_6_3__0 )*
            {
             before(grammarAccess.getIntentAccess().getGroup_4_6_3()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2146:1: ( rule__Intent__Group_4_6_3__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==22||LA10_0==25) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2146:2: rule__Intent__Group_4_6_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_6_3__0_in_rule__Intent__Group_4_6__3__Impl4271);
            	    rule__Intent__Group_4_6_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getIntentAccess().getGroup_4_6_3()); 

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
    // $ANTLR end "rule__Intent__Group_4_6__3__Impl"


    // $ANTLR start "rule__Intent__Group_4_6__4"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2156:1: rule__Intent__Group_4_6__4 : rule__Intent__Group_4_6__4__Impl rule__Intent__Group_4_6__5 ;
    public final void rule__Intent__Group_4_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2160:1: ( rule__Intent__Group_4_6__4__Impl rule__Intent__Group_4_6__5 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2161:2: rule__Intent__Group_4_6__4__Impl rule__Intent__Group_4_6__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_6__4__Impl_in_rule__Intent__Group_4_6__44302);
            rule__Intent__Group_4_6__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_6__5_in_rule__Intent__Group_4_6__44305);
            rule__Intent__Group_4_6__5();

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
    // $ANTLR end "rule__Intent__Group_4_6__4"


    // $ANTLR start "rule__Intent__Group_4_6__4__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2168:1: rule__Intent__Group_4_6__4__Impl : ( ']' ) ;
    public final void rule__Intent__Group_4_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2172:1: ( ( ']' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2173:1: ( ']' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2173:1: ( ']' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2174:1: ']'
            {
             before(grammarAccess.getIntentAccess().getRightSquareBracketKeyword_4_6_4()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__Intent__Group_4_6__4__Impl4333); 
             after(grammarAccess.getIntentAccess().getRightSquareBracketKeyword_4_6_4()); 

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
    // $ANTLR end "rule__Intent__Group_4_6__4__Impl"


    // $ANTLR start "rule__Intent__Group_4_6__5"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2187:1: rule__Intent__Group_4_6__5 : rule__Intent__Group_4_6__5__Impl ;
    public final void rule__Intent__Group_4_6__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2191:1: ( rule__Intent__Group_4_6__5__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2192:2: rule__Intent__Group_4_6__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_6__5__Impl_in_rule__Intent__Group_4_6__54364);
            rule__Intent__Group_4_6__5__Impl();

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
    // $ANTLR end "rule__Intent__Group_4_6__5"


    // $ANTLR start "rule__Intent__Group_4_6__5__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2198:1: rule__Intent__Group_4_6__5__Impl : ( ',' ) ;
    public final void rule__Intent__Group_4_6__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2202:1: ( ( ',' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2203:1: ( ',' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2203:1: ( ',' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2204:1: ','
            {
             before(grammarAccess.getIntentAccess().getCommaKeyword_4_6_5()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Intent__Group_4_6__5__Impl4392); 
             after(grammarAccess.getIntentAccess().getCommaKeyword_4_6_5()); 

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
    // $ANTLR end "rule__Intent__Group_4_6__5__Impl"


    // $ANTLR start "rule__Intent__Group_4_6_3__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2229:1: rule__Intent__Group_4_6_3__0 : rule__Intent__Group_4_6_3__0__Impl rule__Intent__Group_4_6_3__1 ;
    public final void rule__Intent__Group_4_6_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2233:1: ( rule__Intent__Group_4_6_3__0__Impl rule__Intent__Group_4_6_3__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2234:2: rule__Intent__Group_4_6_3__0__Impl rule__Intent__Group_4_6_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_6_3__0__Impl_in_rule__Intent__Group_4_6_3__04435);
            rule__Intent__Group_4_6_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_6_3__1_in_rule__Intent__Group_4_6_3__04438);
            rule__Intent__Group_4_6_3__1();

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
    // $ANTLR end "rule__Intent__Group_4_6_3__0"


    // $ANTLR start "rule__Intent__Group_4_6_3__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2241:1: rule__Intent__Group_4_6_3__0__Impl : ( ( ',' )? ) ;
    public final void rule__Intent__Group_4_6_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2245:1: ( ( ( ',' )? ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2246:1: ( ( ',' )? )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2246:1: ( ( ',' )? )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2247:1: ( ',' )?
            {
             before(grammarAccess.getIntentAccess().getCommaKeyword_4_6_3_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2248:1: ( ',' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==25) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2249:2: ','
                    {
                    match(input,25,FollowSets000.FOLLOW_25_in_rule__Intent__Group_4_6_3__0__Impl4467); 

                    }
                    break;

            }

             after(grammarAccess.getIntentAccess().getCommaKeyword_4_6_3_0()); 

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
    // $ANTLR end "rule__Intent__Group_4_6_3__0__Impl"


    // $ANTLR start "rule__Intent__Group_4_6_3__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2260:1: rule__Intent__Group_4_6_3__1 : rule__Intent__Group_4_6_3__1__Impl ;
    public final void rule__Intent__Group_4_6_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2264:1: ( rule__Intent__Group_4_6_3__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2265:2: rule__Intent__Group_4_6_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_6_3__1__Impl_in_rule__Intent__Group_4_6_3__14500);
            rule__Intent__Group_4_6_3__1__Impl();

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
    // $ANTLR end "rule__Intent__Group_4_6_3__1"


    // $ANTLR start "rule__Intent__Group_4_6_3__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2271:1: rule__Intent__Group_4_6_3__1__Impl : ( ( rule__Intent__ExtraDataAssignment_4_6_3_1 ) ) ;
    public final void rule__Intent__Group_4_6_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2275:1: ( ( ( rule__Intent__ExtraDataAssignment_4_6_3_1 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2276:1: ( ( rule__Intent__ExtraDataAssignment_4_6_3_1 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2276:1: ( ( rule__Intent__ExtraDataAssignment_4_6_3_1 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2277:1: ( rule__Intent__ExtraDataAssignment_4_6_3_1 )
            {
             before(grammarAccess.getIntentAccess().getExtraDataAssignment_4_6_3_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2278:1: ( rule__Intent__ExtraDataAssignment_4_6_3_1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2278:2: rule__Intent__ExtraDataAssignment_4_6_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__ExtraDataAssignment_4_6_3_1_in_rule__Intent__Group_4_6_3__1__Impl4527);
            rule__Intent__ExtraDataAssignment_4_6_3_1();

            state._fsp--;


            }

             after(grammarAccess.getIntentAccess().getExtraDataAssignment_4_6_3_1()); 

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
    // $ANTLR end "rule__Intent__Group_4_6_3__1__Impl"


    // $ANTLR start "rule__Intent__Group_4_7__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2292:1: rule__Intent__Group_4_7__0 : rule__Intent__Group_4_7__0__Impl rule__Intent__Group_4_7__1 ;
    public final void rule__Intent__Group_4_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2296:1: ( rule__Intent__Group_4_7__0__Impl rule__Intent__Group_4_7__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2297:2: rule__Intent__Group_4_7__0__Impl rule__Intent__Group_4_7__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_7__0__Impl_in_rule__Intent__Group_4_7__04561);
            rule__Intent__Group_4_7__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_7__1_in_rule__Intent__Group_4_7__04564);
            rule__Intent__Group_4_7__1();

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
    // $ANTLR end "rule__Intent__Group_4_7__0"


    // $ANTLR start "rule__Intent__Group_4_7__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2304:1: rule__Intent__Group_4_7__0__Impl : ( 'ReturnData' ) ;
    public final void rule__Intent__Group_4_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2308:1: ( ( 'ReturnData' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2309:1: ( 'ReturnData' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2309:1: ( 'ReturnData' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2310:1: 'ReturnData'
            {
             before(grammarAccess.getIntentAccess().getReturnDataKeyword_4_7_0()); 
            match(input,35,FollowSets000.FOLLOW_35_in_rule__Intent__Group_4_7__0__Impl4592); 
             after(grammarAccess.getIntentAccess().getReturnDataKeyword_4_7_0()); 

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
    // $ANTLR end "rule__Intent__Group_4_7__0__Impl"


    // $ANTLR start "rule__Intent__Group_4_7__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2323:1: rule__Intent__Group_4_7__1 : rule__Intent__Group_4_7__1__Impl rule__Intent__Group_4_7__2 ;
    public final void rule__Intent__Group_4_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2327:1: ( rule__Intent__Group_4_7__1__Impl rule__Intent__Group_4_7__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2328:2: rule__Intent__Group_4_7__1__Impl rule__Intent__Group_4_7__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_7__1__Impl_in_rule__Intent__Group_4_7__14623);
            rule__Intent__Group_4_7__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_7__2_in_rule__Intent__Group_4_7__14626);
            rule__Intent__Group_4_7__2();

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
    // $ANTLR end "rule__Intent__Group_4_7__1"


    // $ANTLR start "rule__Intent__Group_4_7__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2335:1: rule__Intent__Group_4_7__1__Impl : ( ':' ) ;
    public final void rule__Intent__Group_4_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2339:1: ( ( ':' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2340:1: ( ':' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2340:1: ( ':' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2341:1: ':'
            {
             before(grammarAccess.getIntentAccess().getColonKeyword_4_7_1()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__Intent__Group_4_7__1__Impl4654); 
             after(grammarAccess.getIntentAccess().getColonKeyword_4_7_1()); 

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
    // $ANTLR end "rule__Intent__Group_4_7__1__Impl"


    // $ANTLR start "rule__Intent__Group_4_7__2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2354:1: rule__Intent__Group_4_7__2 : rule__Intent__Group_4_7__2__Impl rule__Intent__Group_4_7__3 ;
    public final void rule__Intent__Group_4_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2358:1: ( rule__Intent__Group_4_7__2__Impl rule__Intent__Group_4_7__3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2359:2: rule__Intent__Group_4_7__2__Impl rule__Intent__Group_4_7__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_7__2__Impl_in_rule__Intent__Group_4_7__24685);
            rule__Intent__Group_4_7__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_7__3_in_rule__Intent__Group_4_7__24688);
            rule__Intent__Group_4_7__3();

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
    // $ANTLR end "rule__Intent__Group_4_7__2"


    // $ANTLR start "rule__Intent__Group_4_7__2__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2366:1: rule__Intent__Group_4_7__2__Impl : ( '[' ) ;
    public final void rule__Intent__Group_4_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2370:1: ( ( '[' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2371:1: ( '[' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2371:1: ( '[' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2372:1: '['
            {
             before(grammarAccess.getIntentAccess().getLeftSquareBracketKeyword_4_7_2()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__Intent__Group_4_7__2__Impl4716); 
             after(grammarAccess.getIntentAccess().getLeftSquareBracketKeyword_4_7_2()); 

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
    // $ANTLR end "rule__Intent__Group_4_7__2__Impl"


    // $ANTLR start "rule__Intent__Group_4_7__3"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2385:1: rule__Intent__Group_4_7__3 : rule__Intent__Group_4_7__3__Impl rule__Intent__Group_4_7__4 ;
    public final void rule__Intent__Group_4_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2389:1: ( rule__Intent__Group_4_7__3__Impl rule__Intent__Group_4_7__4 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2390:2: rule__Intent__Group_4_7__3__Impl rule__Intent__Group_4_7__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_7__3__Impl_in_rule__Intent__Group_4_7__34747);
            rule__Intent__Group_4_7__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_7__4_in_rule__Intent__Group_4_7__34750);
            rule__Intent__Group_4_7__4();

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
    // $ANTLR end "rule__Intent__Group_4_7__3"


    // $ANTLR start "rule__Intent__Group_4_7__3__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2397:1: rule__Intent__Group_4_7__3__Impl : ( ( rule__Intent__Group_4_7_3__0 )* ) ;
    public final void rule__Intent__Group_4_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2401:1: ( ( ( rule__Intent__Group_4_7_3__0 )* ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2402:1: ( ( rule__Intent__Group_4_7_3__0 )* )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2402:1: ( ( rule__Intent__Group_4_7_3__0 )* )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2403:1: ( rule__Intent__Group_4_7_3__0 )*
            {
             before(grammarAccess.getIntentAccess().getGroup_4_7_3()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2404:1: ( rule__Intent__Group_4_7_3__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==22||LA12_0==25) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2404:2: rule__Intent__Group_4_7_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_7_3__0_in_rule__Intent__Group_4_7__3__Impl4777);
            	    rule__Intent__Group_4_7_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getIntentAccess().getGroup_4_7_3()); 

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
    // $ANTLR end "rule__Intent__Group_4_7__3__Impl"


    // $ANTLR start "rule__Intent__Group_4_7__4"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2414:1: rule__Intent__Group_4_7__4 : rule__Intent__Group_4_7__4__Impl ;
    public final void rule__Intent__Group_4_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2418:1: ( rule__Intent__Group_4_7__4__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2419:2: rule__Intent__Group_4_7__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_7__4__Impl_in_rule__Intent__Group_4_7__44808);
            rule__Intent__Group_4_7__4__Impl();

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
    // $ANTLR end "rule__Intent__Group_4_7__4"


    // $ANTLR start "rule__Intent__Group_4_7__4__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2425:1: rule__Intent__Group_4_7__4__Impl : ( ']' ) ;
    public final void rule__Intent__Group_4_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2429:1: ( ( ']' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2430:1: ( ']' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2430:1: ( ']' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2431:1: ']'
            {
             before(grammarAccess.getIntentAccess().getRightSquareBracketKeyword_4_7_4()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__Intent__Group_4_7__4__Impl4836); 
             after(grammarAccess.getIntentAccess().getRightSquareBracketKeyword_4_7_4()); 

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
    // $ANTLR end "rule__Intent__Group_4_7__4__Impl"


    // $ANTLR start "rule__Intent__Group_4_7_3__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2454:1: rule__Intent__Group_4_7_3__0 : rule__Intent__Group_4_7_3__0__Impl rule__Intent__Group_4_7_3__1 ;
    public final void rule__Intent__Group_4_7_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2458:1: ( rule__Intent__Group_4_7_3__0__Impl rule__Intent__Group_4_7_3__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2459:2: rule__Intent__Group_4_7_3__0__Impl rule__Intent__Group_4_7_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_7_3__0__Impl_in_rule__Intent__Group_4_7_3__04877);
            rule__Intent__Group_4_7_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_7_3__1_in_rule__Intent__Group_4_7_3__04880);
            rule__Intent__Group_4_7_3__1();

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
    // $ANTLR end "rule__Intent__Group_4_7_3__0"


    // $ANTLR start "rule__Intent__Group_4_7_3__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2466:1: rule__Intent__Group_4_7_3__0__Impl : ( ( ',' )? ) ;
    public final void rule__Intent__Group_4_7_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2470:1: ( ( ( ',' )? ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2471:1: ( ( ',' )? )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2471:1: ( ( ',' )? )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2472:1: ( ',' )?
            {
             before(grammarAccess.getIntentAccess().getCommaKeyword_4_7_3_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2473:1: ( ',' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==25) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2474:2: ','
                    {
                    match(input,25,FollowSets000.FOLLOW_25_in_rule__Intent__Group_4_7_3__0__Impl4909); 

                    }
                    break;

            }

             after(grammarAccess.getIntentAccess().getCommaKeyword_4_7_3_0()); 

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
    // $ANTLR end "rule__Intent__Group_4_7_3__0__Impl"


    // $ANTLR start "rule__Intent__Group_4_7_3__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2485:1: rule__Intent__Group_4_7_3__1 : rule__Intent__Group_4_7_3__1__Impl ;
    public final void rule__Intent__Group_4_7_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2489:1: ( rule__Intent__Group_4_7_3__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2490:2: rule__Intent__Group_4_7_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_7_3__1__Impl_in_rule__Intent__Group_4_7_3__14942);
            rule__Intent__Group_4_7_3__1__Impl();

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
    // $ANTLR end "rule__Intent__Group_4_7_3__1"


    // $ANTLR start "rule__Intent__Group_4_7_3__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2496:1: rule__Intent__Group_4_7_3__1__Impl : ( ( rule__Intent__ReturnDataAssignment_4_7_3_1 ) ) ;
    public final void rule__Intent__Group_4_7_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2500:1: ( ( ( rule__Intent__ReturnDataAssignment_4_7_3_1 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2501:1: ( ( rule__Intent__ReturnDataAssignment_4_7_3_1 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2501:1: ( ( rule__Intent__ReturnDataAssignment_4_7_3_1 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2502:1: ( rule__Intent__ReturnDataAssignment_4_7_3_1 )
            {
             before(grammarAccess.getIntentAccess().getReturnDataAssignment_4_7_3_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2503:1: ( rule__Intent__ReturnDataAssignment_4_7_3_1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2503:2: rule__Intent__ReturnDataAssignment_4_7_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__ReturnDataAssignment_4_7_3_1_in_rule__Intent__Group_4_7_3__1__Impl4969);
            rule__Intent__ReturnDataAssignment_4_7_3_1();

            state._fsp--;


            }

             after(grammarAccess.getIntentAccess().getReturnDataAssignment_4_7_3_1()); 

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
    // $ANTLR end "rule__Intent__Group_4_7_3__1__Impl"


    // $ANTLR start "rule__ExtraData__Group__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2517:1: rule__ExtraData__Group__0 : rule__ExtraData__Group__0__Impl rule__ExtraData__Group__1 ;
    public final void rule__ExtraData__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2521:1: ( rule__ExtraData__Group__0__Impl rule__ExtraData__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2522:2: rule__ExtraData__Group__0__Impl rule__ExtraData__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtraData__Group__0__Impl_in_rule__ExtraData__Group__05003);
            rule__ExtraData__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ExtraData__Group__1_in_rule__ExtraData__Group__05006);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2529:1: rule__ExtraData__Group__0__Impl : ( () ) ;
    public final void rule__ExtraData__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2533:1: ( ( () ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2534:1: ( () )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2534:1: ( () )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2535:1: ()
            {
             before(grammarAccess.getExtraDataAccess().getExtraDataAction_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2536:1: ()
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2538:1: 
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2548:1: rule__ExtraData__Group__1 : rule__ExtraData__Group__1__Impl rule__ExtraData__Group__2 ;
    public final void rule__ExtraData__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2552:1: ( rule__ExtraData__Group__1__Impl rule__ExtraData__Group__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2553:2: rule__ExtraData__Group__1__Impl rule__ExtraData__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtraData__Group__1__Impl_in_rule__ExtraData__Group__15064);
            rule__ExtraData__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ExtraData__Group__2_in_rule__ExtraData__Group__15067);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2560:1: rule__ExtraData__Group__1__Impl : ( '{' ) ;
    public final void rule__ExtraData__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2564:1: ( ( '{' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2565:1: ( '{' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2565:1: ( '{' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2566:1: '{'
            {
             before(grammarAccess.getExtraDataAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__ExtraData__Group__1__Impl5095); 
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2579:1: rule__ExtraData__Group__2 : rule__ExtraData__Group__2__Impl rule__ExtraData__Group__3 ;
    public final void rule__ExtraData__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2583:1: ( rule__ExtraData__Group__2__Impl rule__ExtraData__Group__3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2584:2: rule__ExtraData__Group__2__Impl rule__ExtraData__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtraData__Group__2__Impl_in_rule__ExtraData__Group__25126);
            rule__ExtraData__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ExtraData__Group__3_in_rule__ExtraData__Group__25129);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2591:1: rule__ExtraData__Group__2__Impl : ( ( rule__ExtraData__Group_2__0 ) ) ;
    public final void rule__ExtraData__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2595:1: ( ( ( rule__ExtraData__Group_2__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2596:1: ( ( rule__ExtraData__Group_2__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2596:1: ( ( rule__ExtraData__Group_2__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2597:1: ( rule__ExtraData__Group_2__0 )
            {
             before(grammarAccess.getExtraDataAccess().getGroup_2()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2598:1: ( rule__ExtraData__Group_2__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2598:2: rule__ExtraData__Group_2__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtraData__Group_2__0_in_rule__ExtraData__Group__2__Impl5156);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2608:1: rule__ExtraData__Group__3 : rule__ExtraData__Group__3__Impl rule__ExtraData__Group__4 ;
    public final void rule__ExtraData__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2612:1: ( rule__ExtraData__Group__3__Impl rule__ExtraData__Group__4 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2613:2: rule__ExtraData__Group__3__Impl rule__ExtraData__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtraData__Group__3__Impl_in_rule__ExtraData__Group__35186);
            rule__ExtraData__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ExtraData__Group__4_in_rule__ExtraData__Group__35189);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2620:1: rule__ExtraData__Group__3__Impl : ( ',' ) ;
    public final void rule__ExtraData__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2624:1: ( ( ',' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2625:1: ( ',' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2625:1: ( ',' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2626:1: ','
            {
             before(grammarAccess.getExtraDataAccess().getCommaKeyword_3()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__ExtraData__Group__3__Impl5217); 
             after(grammarAccess.getExtraDataAccess().getCommaKeyword_3()); 

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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2639:1: rule__ExtraData__Group__4 : rule__ExtraData__Group__4__Impl rule__ExtraData__Group__5 ;
    public final void rule__ExtraData__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2643:1: ( rule__ExtraData__Group__4__Impl rule__ExtraData__Group__5 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2644:2: rule__ExtraData__Group__4__Impl rule__ExtraData__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtraData__Group__4__Impl_in_rule__ExtraData__Group__45248);
            rule__ExtraData__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ExtraData__Group__5_in_rule__ExtraData__Group__45251);
            rule__ExtraData__Group__5();

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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2651:1: rule__ExtraData__Group__4__Impl : ( ( rule__ExtraData__Group_4__0 ) ) ;
    public final void rule__ExtraData__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2655:1: ( ( ( rule__ExtraData__Group_4__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2656:1: ( ( rule__ExtraData__Group_4__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2656:1: ( ( rule__ExtraData__Group_4__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2657:1: ( rule__ExtraData__Group_4__0 )
            {
             before(grammarAccess.getExtraDataAccess().getGroup_4()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2658:1: ( rule__ExtraData__Group_4__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2658:2: rule__ExtraData__Group_4__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtraData__Group_4__0_in_rule__ExtraData__Group__4__Impl5278);
            rule__ExtraData__Group_4__0();

            state._fsp--;


            }

             after(grammarAccess.getExtraDataAccess().getGroup_4()); 

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


    // $ANTLR start "rule__ExtraData__Group__5"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2668:1: rule__ExtraData__Group__5 : rule__ExtraData__Group__5__Impl ;
    public final void rule__ExtraData__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2672:1: ( rule__ExtraData__Group__5__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2673:2: rule__ExtraData__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtraData__Group__5__Impl_in_rule__ExtraData__Group__55308);
            rule__ExtraData__Group__5__Impl();

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
    // $ANTLR end "rule__ExtraData__Group__5"


    // $ANTLR start "rule__ExtraData__Group__5__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2679:1: rule__ExtraData__Group__5__Impl : ( '}' ) ;
    public final void rule__ExtraData__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2683:1: ( ( '}' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2684:1: ( '}' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2684:1: ( '}' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2685:1: '}'
            {
             before(grammarAccess.getExtraDataAccess().getRightCurlyBracketKeyword_5()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__ExtraData__Group__5__Impl5336); 
             after(grammarAccess.getExtraDataAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__ExtraData__Group__5__Impl"


    // $ANTLR start "rule__ExtraData__Group_2__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2710:1: rule__ExtraData__Group_2__0 : rule__ExtraData__Group_2__0__Impl rule__ExtraData__Group_2__1 ;
    public final void rule__ExtraData__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2714:1: ( rule__ExtraData__Group_2__0__Impl rule__ExtraData__Group_2__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2715:2: rule__ExtraData__Group_2__0__Impl rule__ExtraData__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtraData__Group_2__0__Impl_in_rule__ExtraData__Group_2__05379);
            rule__ExtraData__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ExtraData__Group_2__1_in_rule__ExtraData__Group_2__05382);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2722:1: rule__ExtraData__Group_2__0__Impl : ( 'Name' ) ;
    public final void rule__ExtraData__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2726:1: ( ( 'Name' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2727:1: ( 'Name' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2727:1: ( 'Name' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2728:1: 'Name'
            {
             before(grammarAccess.getExtraDataAccess().getNameKeyword_2_0()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__ExtraData__Group_2__0__Impl5410); 
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2741:1: rule__ExtraData__Group_2__1 : rule__ExtraData__Group_2__1__Impl rule__ExtraData__Group_2__2 ;
    public final void rule__ExtraData__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2745:1: ( rule__ExtraData__Group_2__1__Impl rule__ExtraData__Group_2__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2746:2: rule__ExtraData__Group_2__1__Impl rule__ExtraData__Group_2__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtraData__Group_2__1__Impl_in_rule__ExtraData__Group_2__15441);
            rule__ExtraData__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ExtraData__Group_2__2_in_rule__ExtraData__Group_2__15444);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2753:1: rule__ExtraData__Group_2__1__Impl : ( ':' ) ;
    public final void rule__ExtraData__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2757:1: ( ( ':' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2758:1: ( ':' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2758:1: ( ':' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2759:1: ':'
            {
             before(grammarAccess.getExtraDataAccess().getColonKeyword_2_1()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__ExtraData__Group_2__1__Impl5472); 
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2772:1: rule__ExtraData__Group_2__2 : rule__ExtraData__Group_2__2__Impl ;
    public final void rule__ExtraData__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2776:1: ( rule__ExtraData__Group_2__2__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2777:2: rule__ExtraData__Group_2__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtraData__Group_2__2__Impl_in_rule__ExtraData__Group_2__25503);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2783:1: rule__ExtraData__Group_2__2__Impl : ( ( rule__ExtraData__NameAssignment_2_2 ) ) ;
    public final void rule__ExtraData__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2787:1: ( ( ( rule__ExtraData__NameAssignment_2_2 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2788:1: ( ( rule__ExtraData__NameAssignment_2_2 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2788:1: ( ( rule__ExtraData__NameAssignment_2_2 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2789:1: ( rule__ExtraData__NameAssignment_2_2 )
            {
             before(grammarAccess.getExtraDataAccess().getNameAssignment_2_2()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2790:1: ( rule__ExtraData__NameAssignment_2_2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2790:2: rule__ExtraData__NameAssignment_2_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtraData__NameAssignment_2_2_in_rule__ExtraData__Group_2__2__Impl5530);
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


    // $ANTLR start "rule__ExtraData__Group_4__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2806:1: rule__ExtraData__Group_4__0 : rule__ExtraData__Group_4__0__Impl rule__ExtraData__Group_4__1 ;
    public final void rule__ExtraData__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2810:1: ( rule__ExtraData__Group_4__0__Impl rule__ExtraData__Group_4__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2811:2: rule__ExtraData__Group_4__0__Impl rule__ExtraData__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtraData__Group_4__0__Impl_in_rule__ExtraData__Group_4__05566);
            rule__ExtraData__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ExtraData__Group_4__1_in_rule__ExtraData__Group_4__05569);
            rule__ExtraData__Group_4__1();

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
    // $ANTLR end "rule__ExtraData__Group_4__0"


    // $ANTLR start "rule__ExtraData__Group_4__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2818:1: rule__ExtraData__Group_4__0__Impl : ( 'Type' ) ;
    public final void rule__ExtraData__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2822:1: ( ( 'Type' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2823:1: ( 'Type' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2823:1: ( 'Type' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2824:1: 'Type'
            {
             before(grammarAccess.getExtraDataAccess().getTypeKeyword_4_0()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__ExtraData__Group_4__0__Impl5597); 
             after(grammarAccess.getExtraDataAccess().getTypeKeyword_4_0()); 

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
    // $ANTLR end "rule__ExtraData__Group_4__0__Impl"


    // $ANTLR start "rule__ExtraData__Group_4__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2837:1: rule__ExtraData__Group_4__1 : rule__ExtraData__Group_4__1__Impl rule__ExtraData__Group_4__2 ;
    public final void rule__ExtraData__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2841:1: ( rule__ExtraData__Group_4__1__Impl rule__ExtraData__Group_4__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2842:2: rule__ExtraData__Group_4__1__Impl rule__ExtraData__Group_4__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtraData__Group_4__1__Impl_in_rule__ExtraData__Group_4__15628);
            rule__ExtraData__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ExtraData__Group_4__2_in_rule__ExtraData__Group_4__15631);
            rule__ExtraData__Group_4__2();

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
    // $ANTLR end "rule__ExtraData__Group_4__1"


    // $ANTLR start "rule__ExtraData__Group_4__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2849:1: rule__ExtraData__Group_4__1__Impl : ( ':' ) ;
    public final void rule__ExtraData__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2853:1: ( ( ':' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2854:1: ( ':' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2854:1: ( ':' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2855:1: ':'
            {
             before(grammarAccess.getExtraDataAccess().getColonKeyword_4_1()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__ExtraData__Group_4__1__Impl5659); 
             after(grammarAccess.getExtraDataAccess().getColonKeyword_4_1()); 

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
    // $ANTLR end "rule__ExtraData__Group_4__1__Impl"


    // $ANTLR start "rule__ExtraData__Group_4__2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2868:1: rule__ExtraData__Group_4__2 : rule__ExtraData__Group_4__2__Impl ;
    public final void rule__ExtraData__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2872:1: ( rule__ExtraData__Group_4__2__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2873:2: rule__ExtraData__Group_4__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtraData__Group_4__2__Impl_in_rule__ExtraData__Group_4__25690);
            rule__ExtraData__Group_4__2__Impl();

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
    // $ANTLR end "rule__ExtraData__Group_4__2"


    // $ANTLR start "rule__ExtraData__Group_4__2__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2879:1: rule__ExtraData__Group_4__2__Impl : ( ( rule__ExtraData__TypeAssignment_4_2 ) ) ;
    public final void rule__ExtraData__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2883:1: ( ( ( rule__ExtraData__TypeAssignment_4_2 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2884:1: ( ( rule__ExtraData__TypeAssignment_4_2 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2884:1: ( ( rule__ExtraData__TypeAssignment_4_2 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2885:1: ( rule__ExtraData__TypeAssignment_4_2 )
            {
             before(grammarAccess.getExtraDataAccess().getTypeAssignment_4_2()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2886:1: ( rule__ExtraData__TypeAssignment_4_2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2886:2: rule__ExtraData__TypeAssignment_4_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtraData__TypeAssignment_4_2_in_rule__ExtraData__Group_4__2__Impl5717);
            rule__ExtraData__TypeAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getExtraDataAccess().getTypeAssignment_4_2()); 

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
    // $ANTLR end "rule__ExtraData__Group_4__2__Impl"


    // $ANTLR start "rule__ExplicitIntent__Group__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2902:1: rule__ExplicitIntent__Group__0 : rule__ExplicitIntent__Group__0__Impl rule__ExplicitIntent__Group__1 ;
    public final void rule__ExplicitIntent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2906:1: ( rule__ExplicitIntent__Group__0__Impl rule__ExplicitIntent__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2907:2: rule__ExplicitIntent__Group__0__Impl rule__ExplicitIntent__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExplicitIntent__Group__0__Impl_in_rule__ExplicitIntent__Group__05753);
            rule__ExplicitIntent__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ExplicitIntent__Group__1_in_rule__ExplicitIntent__Group__05756);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2914:1: rule__ExplicitIntent__Group__0__Impl : ( () ) ;
    public final void rule__ExplicitIntent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2918:1: ( ( () ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2919:1: ( () )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2919:1: ( () )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2920:1: ()
            {
             before(grammarAccess.getExplicitIntentAccess().getExplicitIntentAction_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2921:1: ()
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2923:1: 
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2933:1: rule__ExplicitIntent__Group__1 : rule__ExplicitIntent__Group__1__Impl ;
    public final void rule__ExplicitIntent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2937:1: ( rule__ExplicitIntent__Group__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2938:2: rule__ExplicitIntent__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExplicitIntent__Group__1__Impl_in_rule__ExplicitIntent__Group__15814);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2944:1: rule__ExplicitIntent__Group__1__Impl : ( '\\'ExplicitIntent\\'' ) ;
    public final void rule__ExplicitIntent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2948:1: ( ( '\\'ExplicitIntent\\'' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2949:1: ( '\\'ExplicitIntent\\'' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2949:1: ( '\\'ExplicitIntent\\'' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2950:1: '\\'ExplicitIntent\\''
            {
             before(grammarAccess.getExplicitIntentAccess().getExplicitIntentKeyword_1()); 
            match(input,36,FollowSets000.FOLLOW_36_in_rule__ExplicitIntent__Group__1__Impl5842); 
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2967:1: rule__ImplicitIntent__Group__0 : rule__ImplicitIntent__Group__0__Impl rule__ImplicitIntent__Group__1 ;
    public final void rule__ImplicitIntent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2971:1: ( rule__ImplicitIntent__Group__0__Impl rule__ImplicitIntent__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2972:2: rule__ImplicitIntent__Group__0__Impl rule__ImplicitIntent__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ImplicitIntent__Group__0__Impl_in_rule__ImplicitIntent__Group__05877);
            rule__ImplicitIntent__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ImplicitIntent__Group__1_in_rule__ImplicitIntent__Group__05880);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2979:1: rule__ImplicitIntent__Group__0__Impl : ( () ) ;
    public final void rule__ImplicitIntent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2983:1: ( ( () ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2984:1: ( () )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2984:1: ( () )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2985:1: ()
            {
             before(grammarAccess.getImplicitIntentAccess().getImplicitIntentAction_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2986:1: ()
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2988:1: 
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2998:1: rule__ImplicitIntent__Group__1 : rule__ImplicitIntent__Group__1__Impl ;
    public final void rule__ImplicitIntent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3002:1: ( rule__ImplicitIntent__Group__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3003:2: rule__ImplicitIntent__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ImplicitIntent__Group__1__Impl_in_rule__ImplicitIntent__Group__15938);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3009:1: rule__ImplicitIntent__Group__1__Impl : ( '\\'ImplicitIntent\\'' ) ;
    public final void rule__ImplicitIntent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3013:1: ( ( '\\'ImplicitIntent\\'' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3014:1: ( '\\'ImplicitIntent\\'' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3014:1: ( '\\'ImplicitIntent\\'' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3015:1: '\\'ImplicitIntent\\''
            {
             before(grammarAccess.getImplicitIntentAccess().getImplicitIntentKeyword_1()); 
            match(input,37,FollowSets000.FOLLOW_37_in_rule__ImplicitIntent__Group__1__Impl5966); 
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3032:1: rule__BroadcastIntent__Group__0 : rule__BroadcastIntent__Group__0__Impl rule__BroadcastIntent__Group__1 ;
    public final void rule__BroadcastIntent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3036:1: ( rule__BroadcastIntent__Group__0__Impl rule__BroadcastIntent__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3037:2: rule__BroadcastIntent__Group__0__Impl rule__BroadcastIntent__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BroadcastIntent__Group__0__Impl_in_rule__BroadcastIntent__Group__06001);
            rule__BroadcastIntent__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BroadcastIntent__Group__1_in_rule__BroadcastIntent__Group__06004);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3044:1: rule__BroadcastIntent__Group__0__Impl : ( () ) ;
    public final void rule__BroadcastIntent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3048:1: ( ( () ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3049:1: ( () )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3049:1: ( () )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3050:1: ()
            {
             before(grammarAccess.getBroadcastIntentAccess().getBroadCastIntentAction_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3051:1: ()
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3053:1: 
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3063:1: rule__BroadcastIntent__Group__1 : rule__BroadcastIntent__Group__1__Impl ;
    public final void rule__BroadcastIntent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3067:1: ( rule__BroadcastIntent__Group__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3068:2: rule__BroadcastIntent__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__BroadcastIntent__Group__1__Impl_in_rule__BroadcastIntent__Group__16062);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3074:1: rule__BroadcastIntent__Group__1__Impl : ( '\\'BroadcastIntent\\'' ) ;
    public final void rule__BroadcastIntent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3078:1: ( ( '\\'BroadcastIntent\\'' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3079:1: ( '\\'BroadcastIntent\\'' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3079:1: ( '\\'BroadcastIntent\\'' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3080:1: '\\'BroadcastIntent\\''
            {
             before(grammarAccess.getBroadcastIntentAccess().getBroadcastIntentKeyword_1()); 
            match(input,38,FollowSets000.FOLLOW_38_in_rule__BroadcastIntent__Group__1__Impl6090); 
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3097:1: rule__ServiceIntent__Group__0 : rule__ServiceIntent__Group__0__Impl rule__ServiceIntent__Group__1 ;
    public final void rule__ServiceIntent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3101:1: ( rule__ServiceIntent__Group__0__Impl rule__ServiceIntent__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3102:2: rule__ServiceIntent__Group__0__Impl rule__ServiceIntent__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ServiceIntent__Group__0__Impl_in_rule__ServiceIntent__Group__06125);
            rule__ServiceIntent__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ServiceIntent__Group__1_in_rule__ServiceIntent__Group__06128);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3109:1: rule__ServiceIntent__Group__0__Impl : ( () ) ;
    public final void rule__ServiceIntent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3113:1: ( ( () ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3114:1: ( () )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3114:1: ( () )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3115:1: ()
            {
             before(grammarAccess.getServiceIntentAccess().getServiceIntentAction_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3116:1: ()
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3118:1: 
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3128:1: rule__ServiceIntent__Group__1 : rule__ServiceIntent__Group__1__Impl ;
    public final void rule__ServiceIntent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3132:1: ( rule__ServiceIntent__Group__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3133:2: rule__ServiceIntent__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ServiceIntent__Group__1__Impl_in_rule__ServiceIntent__Group__16186);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3139:1: rule__ServiceIntent__Group__1__Impl : ( '\\'ServiceIntent\\'' ) ;
    public final void rule__ServiceIntent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3143:1: ( ( '\\'ServiceIntent\\'' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3144:1: ( '\\'ServiceIntent\\'' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3144:1: ( '\\'ServiceIntent\\'' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3145:1: '\\'ServiceIntent\\''
            {
             before(grammarAccess.getServiceIntentAccess().getServiceIntentKeyword_1()); 
            match(input,39,FollowSets000.FOLLOW_39_in_rule__ServiceIntent__Group__1__Impl6214); 
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3163:1: rule__IntentModel__NameAssignment_1 : ( ( 'Model' ) ) ;
    public final void rule__IntentModel__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3167:1: ( ( ( 'Model' ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3168:1: ( ( 'Model' ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3168:1: ( ( 'Model' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3169:1: ( 'Model' )
            {
             before(grammarAccess.getIntentModelAccess().getNameModelKeyword_1_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3170:1: ( 'Model' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3171:1: 'Model'
            {
             before(grammarAccess.getIntentModelAccess().getNameModelKeyword_1_0()); 
            match(input,40,FollowSets000.FOLLOW_40_in_rule__IntentModel__NameAssignment_16259); 
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


    // $ANTLR start "rule__IntentModel__IntentsAssignment_5"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3186:1: rule__IntentModel__IntentsAssignment_5 : ( ruleIntent ) ;
    public final void rule__IntentModel__IntentsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3190:1: ( ( ruleIntent ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3191:1: ( ruleIntent )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3191:1: ( ruleIntent )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3192:1: ruleIntent
            {
             before(grammarAccess.getIntentModelAccess().getIntentsIntentParserRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleIntent_in_rule__IntentModel__IntentsAssignment_56298);
            ruleIntent();

            state._fsp--;

             after(grammarAccess.getIntentModelAccess().getIntentsIntentParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__IntentModel__IntentsAssignment_5"


    // $ANTLR start "rule__IntentModel__IntentsAssignment_7_2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3201:1: rule__IntentModel__IntentsAssignment_7_2 : ( ruleIntent ) ;
    public final void rule__IntentModel__IntentsAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3205:1: ( ( ruleIntent ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3206:1: ( ruleIntent )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3206:1: ( ruleIntent )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3207:1: ruleIntent
            {
             before(grammarAccess.getIntentModelAccess().getIntentsIntentParserRuleCall_7_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleIntent_in_rule__IntentModel__IntentsAssignment_7_26329);
            ruleIntent();

            state._fsp--;

             after(grammarAccess.getIntentModelAccess().getIntentsIntentParserRuleCall_7_2_0()); 

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
    // $ANTLR end "rule__IntentModel__IntentsAssignment_7_2"


    // $ANTLR start "rule__Intent__NameAssignment_4_0_2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3216:1: rule__Intent__NameAssignment_4_0_2 : ( ruleEString ) ;
    public final void rule__Intent__NameAssignment_4_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3220:1: ( ( ruleEString ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3221:1: ( ruleEString )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3221:1: ( ruleEString )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3222:1: ruleEString
            {
             before(grammarAccess.getIntentAccess().getNameEStringParserRuleCall_4_0_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Intent__NameAssignment_4_0_26360);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3231:1: rule__Intent__ActionAssignment_4_1_2 : ( ruleEString ) ;
    public final void rule__Intent__ActionAssignment_4_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3235:1: ( ( ruleEString ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3236:1: ( ruleEString )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3236:1: ( ruleEString )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3237:1: ruleEString
            {
             before(grammarAccess.getIntentAccess().getActionEStringParserRuleCall_4_1_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Intent__ActionAssignment_4_1_26391);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3246:1: rule__Intent__CategoryAssignment_4_2_2 : ( ruleEString ) ;
    public final void rule__Intent__CategoryAssignment_4_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3250:1: ( ( ruleEString ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3251:1: ( ruleEString )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3251:1: ( ruleEString )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3252:1: ruleEString
            {
             before(grammarAccess.getIntentAccess().getCategoryEStringParserRuleCall_4_2_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Intent__CategoryAssignment_4_2_26422);
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


    // $ANTLR start "rule__Intent__MetaCategoryAssignment_4_3_2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3261:1: rule__Intent__MetaCategoryAssignment_4_3_2 : ( ruleEString ) ;
    public final void rule__Intent__MetaCategoryAssignment_4_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3265:1: ( ( ruleEString ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3266:1: ( ruleEString )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3266:1: ( ruleEString )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3267:1: ruleEString
            {
             before(grammarAccess.getIntentAccess().getMetaCategoryEStringParserRuleCall_4_3_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Intent__MetaCategoryAssignment_4_3_26453);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getIntentAccess().getMetaCategoryEStringParserRuleCall_4_3_2_0()); 

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
    // $ANTLR end "rule__Intent__MetaCategoryAssignment_4_3_2"


    // $ANTLR start "rule__Intent__DataURIAssignment_4_4_2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3276:1: rule__Intent__DataURIAssignment_4_4_2 : ( ruleEString ) ;
    public final void rule__Intent__DataURIAssignment_4_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3280:1: ( ( ruleEString ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3281:1: ( ruleEString )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3281:1: ( ruleEString )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3282:1: ruleEString
            {
             before(grammarAccess.getIntentAccess().getDataURIEStringParserRuleCall_4_4_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Intent__DataURIAssignment_4_4_26484);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getIntentAccess().getDataURIEStringParserRuleCall_4_4_2_0()); 

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
    // $ANTLR end "rule__Intent__DataURIAssignment_4_4_2"


    // $ANTLR start "rule__Intent__PermissionAssignment_4_5_2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3291:1: rule__Intent__PermissionAssignment_4_5_2 : ( ruleEString ) ;
    public final void rule__Intent__PermissionAssignment_4_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3295:1: ( ( ruleEString ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3296:1: ( ruleEString )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3296:1: ( ruleEString )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3297:1: ruleEString
            {
             before(grammarAccess.getIntentAccess().getPermissionEStringParserRuleCall_4_5_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Intent__PermissionAssignment_4_5_26515);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getIntentAccess().getPermissionEStringParserRuleCall_4_5_2_0()); 

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
    // $ANTLR end "rule__Intent__PermissionAssignment_4_5_2"


    // $ANTLR start "rule__Intent__ExtraDataAssignment_4_6_3_1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3306:1: rule__Intent__ExtraDataAssignment_4_6_3_1 : ( ruleExtraData ) ;
    public final void rule__Intent__ExtraDataAssignment_4_6_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3310:1: ( ( ruleExtraData ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3311:1: ( ruleExtraData )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3311:1: ( ruleExtraData )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3312:1: ruleExtraData
            {
             before(grammarAccess.getIntentAccess().getExtraDataExtraDataParserRuleCall_4_6_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleExtraData_in_rule__Intent__ExtraDataAssignment_4_6_3_16546);
            ruleExtraData();

            state._fsp--;

             after(grammarAccess.getIntentAccess().getExtraDataExtraDataParserRuleCall_4_6_3_1_0()); 

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
    // $ANTLR end "rule__Intent__ExtraDataAssignment_4_6_3_1"


    // $ANTLR start "rule__Intent__ReturnDataAssignment_4_7_3_1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3321:1: rule__Intent__ReturnDataAssignment_4_7_3_1 : ( ruleExtraData ) ;
    public final void rule__Intent__ReturnDataAssignment_4_7_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3325:1: ( ( ruleExtraData ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3326:1: ( ruleExtraData )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3326:1: ( ruleExtraData )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3327:1: ruleExtraData
            {
             before(grammarAccess.getIntentAccess().getReturnDataExtraDataParserRuleCall_4_7_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleExtraData_in_rule__Intent__ReturnDataAssignment_4_7_3_16577);
            ruleExtraData();

            state._fsp--;

             after(grammarAccess.getIntentAccess().getReturnDataExtraDataParserRuleCall_4_7_3_1_0()); 

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
    // $ANTLR end "rule__Intent__ReturnDataAssignment_4_7_3_1"


    // $ANTLR start "rule__ExtraData__NameAssignment_2_2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3336:1: rule__ExtraData__NameAssignment_2_2 : ( ruleEString ) ;
    public final void rule__ExtraData__NameAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3340:1: ( ( ruleEString ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3341:1: ( ruleEString )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3341:1: ( ruleEString )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3342:1: ruleEString
            {
             before(grammarAccess.getExtraDataAccess().getNameEStringParserRuleCall_2_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__ExtraData__NameAssignment_2_26608);
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


    // $ANTLR start "rule__ExtraData__TypeAssignment_4_2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3351:1: rule__ExtraData__TypeAssignment_4_2 : ( ruleSimpleTypeEnum ) ;
    public final void rule__ExtraData__TypeAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3355:1: ( ( ruleSimpleTypeEnum ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3356:1: ( ruleSimpleTypeEnum )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3356:1: ( ruleSimpleTypeEnum )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3357:1: ruleSimpleTypeEnum
            {
             before(grammarAccess.getExtraDataAccess().getTypeSimpleTypeEnumEnumRuleCall_4_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSimpleTypeEnum_in_rule__ExtraData__TypeAssignment_4_26639);
            ruleSimpleTypeEnum();

            state._fsp--;

             after(grammarAccess.getExtraDataAccess().getTypeSimpleTypeEnumEnumRuleCall_4_2_0()); 

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
    // $ANTLR end "rule__ExtraData__TypeAssignment_4_2"

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
        public static final BitSet FOLLOW_rule__SimpleTypeEnum__Alternatives_in_ruleSimpleTypeEnum551 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExplicitIntent_in_rule__Intent__Alternatives_2586 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleImplicitIntent_in_rule__Intent__Alternatives_2603 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBroadcastIntent_in_rule__Intent__Alternatives_2620 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleServiceIntent_in_rule__Intent__Alternatives_2637 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__EString__Alternatives669 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Alternatives686 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rule__SimpleTypeEnum__Alternatives719 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__SimpleTypeEnum__Alternatives740 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__SimpleTypeEnum__Alternatives761 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__SimpleTypeEnum__Alternatives782 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__SimpleTypeEnum__Alternatives803 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__SimpleTypeEnum__Alternatives824 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__SimpleTypeEnum__Alternatives845 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__SimpleTypeEnum__Alternatives866 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__SimpleTypeEnum__Alternatives887 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntentModel__Group__0__Impl_in_rule__IntentModel__Group__0920 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_rule__IntentModel__Group__1_in_rule__IntentModel__Group__0923 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntentModel__Group__1__Impl_in_rule__IntentModel__Group__1981 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_rule__IntentModel__Group__2_in_rule__IntentModel__Group__1984 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntentModel__NameAssignment_1_in_rule__IntentModel__Group__1__Impl1011 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntentModel__Group__2__Impl_in_rule__IntentModel__Group__21041 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__IntentModel__Group__3_in_rule__IntentModel__Group__21044 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__IntentModel__Group__2__Impl1072 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntentModel__Group__3__Impl_in_rule__IntentModel__Group__31103 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__IntentModel__Group__4_in_rule__IntentModel__Group__31106 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__IntentModel__Group__3__Impl1134 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntentModel__Group__4__Impl_in_rule__IntentModel__Group__41165 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__IntentModel__Group__5_in_rule__IntentModel__Group__41168 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__IntentModel__Group__4__Impl1196 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntentModel__Group__5__Impl_in_rule__IntentModel__Group__51227 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__IntentModel__Group__6_in_rule__IntentModel__Group__51230 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntentModel__IntentsAssignment_5_in_rule__IntentModel__Group__5__Impl1257 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntentModel__Group__6__Impl_in_rule__IntentModel__Group__61287 = new BitSet(new long[]{0x0000000003000000L});
        public static final BitSet FOLLOW_rule__IntentModel__Group__7_in_rule__IntentModel__Group__61290 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__IntentModel__Group__6__Impl1318 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntentModel__Group__7__Impl_in_rule__IntentModel__Group__71349 = new BitSet(new long[]{0x0000000003000000L});
        public static final BitSet FOLLOW_rule__IntentModel__Group__8_in_rule__IntentModel__Group__71352 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntentModel__Group_7__0_in_rule__IntentModel__Group__7__Impl1379 = new BitSet(new long[]{0x0000000002000002L});
        public static final BitSet FOLLOW_rule__IntentModel__Group__8__Impl_in_rule__IntentModel__Group__81410 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__IntentModel__Group__8__Impl1438 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntentModel__Group_7__0__Impl_in_rule__IntentModel__Group_7__01487 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__IntentModel__Group_7__1_in_rule__IntentModel__Group_7__01490 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__IntentModel__Group_7__0__Impl1518 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntentModel__Group_7__1__Impl_in_rule__IntentModel__Group_7__11549 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__IntentModel__Group_7__2_in_rule__IntentModel__Group_7__11552 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__IntentModel__Group_7__1__Impl1580 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntentModel__Group_7__2__Impl_in_rule__IntentModel__Group_7__21611 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__IntentModel__Group_7__3_in_rule__IntentModel__Group_7__21614 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntentModel__IntentsAssignment_7_2_in_rule__IntentModel__Group_7__2__Impl1641 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntentModel__Group_7__3__Impl_in_rule__IntentModel__Group_7__31671 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__IntentModel__Group_7__3__Impl1699 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group__0__Impl_in_rule__Intent__Group__01738 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__Intent__Group__1_in_rule__Intent__Group__01741 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__Intent__Group__0__Impl1769 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group__1__Impl_in_rule__Intent__Group__11800 = new BitSet(new long[]{0x000000F000000000L});
        public static final BitSet FOLLOW_rule__Intent__Group__2_in_rule__Intent__Group__11803 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__Intent__Group__1__Impl1831 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group__2__Impl_in_rule__Intent__Group__21862 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__Intent__Group__3_in_rule__Intent__Group__21865 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Alternatives_2_in_rule__Intent__Group__2__Impl1892 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group__3__Impl_in_rule__Intent__Group__31922 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_rule__Intent__Group__4_in_rule__Intent__Group__31925 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Intent__Group__3__Impl1953 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group__4__Impl_in_rule__Intent__Group__41984 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4__0_in_rule__Intent__Group__4__Impl2011 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4__0__Impl_in_rule__Intent__Group_4__02051 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_rule__Intent__Group_4__1_in_rule__Intent__Group_4__02054 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_0__0_in_rule__Intent__Group_4__0__Impl2081 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4__1__Impl_in_rule__Intent__Group_4__12111 = new BitSet(new long[]{0x00000000C0000000L});
        public static final BitSet FOLLOW_rule__Intent__Group_4__2_in_rule__Intent__Group_4__12114 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_1__0_in_rule__Intent__Group_4__1__Impl2141 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4__2__Impl_in_rule__Intent__Group_4__22171 = new BitSet(new long[]{0x00000000C0000000L});
        public static final BitSet FOLLOW_rule__Intent__Group_4__3_in_rule__Intent__Group_4__22174 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_2__0_in_rule__Intent__Group_4__2__Impl2201 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4__3__Impl_in_rule__Intent__Group_4__32232 = new BitSet(new long[]{0x0000000F00000000L});
        public static final BitSet FOLLOW_rule__Intent__Group_4__4_in_rule__Intent__Group_4__32235 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_3__0_in_rule__Intent__Group_4__3__Impl2262 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4__4__Impl_in_rule__Intent__Group_4__42292 = new BitSet(new long[]{0x0000000F00000000L});
        public static final BitSet FOLLOW_rule__Intent__Group_4__5_in_rule__Intent__Group_4__42295 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_4__0_in_rule__Intent__Group_4__4__Impl2322 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4__5__Impl_in_rule__Intent__Group_4__52353 = new BitSet(new long[]{0x0000000F00000000L});
        public static final BitSet FOLLOW_rule__Intent__Group_4__6_in_rule__Intent__Group_4__52356 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_5__0_in_rule__Intent__Group_4__5__Impl2383 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4__6__Impl_in_rule__Intent__Group_4__62414 = new BitSet(new long[]{0x0000000F00000000L});
        public static final BitSet FOLLOW_rule__Intent__Group_4__7_in_rule__Intent__Group_4__62417 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_6__0_in_rule__Intent__Group_4__6__Impl2444 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4__7__Impl_in_rule__Intent__Group_4__72475 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_7__0_in_rule__Intent__Group_4__7__Impl2502 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_0__0__Impl_in_rule__Intent__Group_4_0__02549 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_0__1_in_rule__Intent__Group_4_0__02552 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__Intent__Group_4_0__0__Impl2580 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_0__1__Impl_in_rule__Intent__Group_4_0__12611 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_0__2_in_rule__Intent__Group_4_0__12614 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__Intent__Group_4_0__1__Impl2642 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_0__2__Impl_in_rule__Intent__Group_4_0__22673 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_0__3_in_rule__Intent__Group_4_0__22676 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__NameAssignment_4_0_2_in_rule__Intent__Group_4_0__2__Impl2703 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_0__3__Impl_in_rule__Intent__Group_4_0__32733 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Intent__Group_4_0__3__Impl2761 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_1__0__Impl_in_rule__Intent__Group_4_1__02800 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_1__1_in_rule__Intent__Group_4_1__02803 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__Intent__Group_4_1__0__Impl2831 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_1__1__Impl_in_rule__Intent__Group_4_1__12862 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_1__2_in_rule__Intent__Group_4_1__12865 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__Intent__Group_4_1__1__Impl2893 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_1__2__Impl_in_rule__Intent__Group_4_1__22924 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_1__3_in_rule__Intent__Group_4_1__22927 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__ActionAssignment_4_1_2_in_rule__Intent__Group_4_1__2__Impl2954 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_1__3__Impl_in_rule__Intent__Group_4_1__32984 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Intent__Group_4_1__3__Impl3012 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_2__0__Impl_in_rule__Intent__Group_4_2__03051 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_2__1_in_rule__Intent__Group_4_2__03054 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__Intent__Group_4_2__0__Impl3082 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_2__1__Impl_in_rule__Intent__Group_4_2__13113 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_2__2_in_rule__Intent__Group_4_2__13116 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__Intent__Group_4_2__1__Impl3144 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_2__2__Impl_in_rule__Intent__Group_4_2__23175 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_2__3_in_rule__Intent__Group_4_2__23178 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__CategoryAssignment_4_2_2_in_rule__Intent__Group_4_2__2__Impl3205 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_2__3__Impl_in_rule__Intent__Group_4_2__33235 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Intent__Group_4_2__3__Impl3263 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_3__0__Impl_in_rule__Intent__Group_4_3__03302 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_3__1_in_rule__Intent__Group_4_3__03305 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__Intent__Group_4_3__0__Impl3333 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_3__1__Impl_in_rule__Intent__Group_4_3__13364 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_3__2_in_rule__Intent__Group_4_3__13367 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__Intent__Group_4_3__1__Impl3395 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_3__2__Impl_in_rule__Intent__Group_4_3__23426 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_3__3_in_rule__Intent__Group_4_3__23429 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__MetaCategoryAssignment_4_3_2_in_rule__Intent__Group_4_3__2__Impl3456 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_3__3__Impl_in_rule__Intent__Group_4_3__33486 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Intent__Group_4_3__3__Impl3514 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_4__0__Impl_in_rule__Intent__Group_4_4__03553 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_4__1_in_rule__Intent__Group_4_4__03556 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__Intent__Group_4_4__0__Impl3584 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_4__1__Impl_in_rule__Intent__Group_4_4__13615 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_4__2_in_rule__Intent__Group_4_4__13618 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__Intent__Group_4_4__1__Impl3646 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_4__2__Impl_in_rule__Intent__Group_4_4__23677 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_4__3_in_rule__Intent__Group_4_4__23680 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__DataURIAssignment_4_4_2_in_rule__Intent__Group_4_4__2__Impl3707 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_4__3__Impl_in_rule__Intent__Group_4_4__33737 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Intent__Group_4_4__3__Impl3765 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_5__0__Impl_in_rule__Intent__Group_4_5__03804 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_5__1_in_rule__Intent__Group_4_5__03807 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__Intent__Group_4_5__0__Impl3835 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_5__1__Impl_in_rule__Intent__Group_4_5__13866 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_5__2_in_rule__Intent__Group_4_5__13869 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__Intent__Group_4_5__1__Impl3897 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_5__2__Impl_in_rule__Intent__Group_4_5__23928 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_5__3_in_rule__Intent__Group_4_5__23931 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__PermissionAssignment_4_5_2_in_rule__Intent__Group_4_5__2__Impl3958 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_5__3__Impl_in_rule__Intent__Group_4_5__33988 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Intent__Group_4_5__3__Impl4016 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_6__0__Impl_in_rule__Intent__Group_4_6__04055 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_6__1_in_rule__Intent__Group_4_6__04058 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__Intent__Group_4_6__0__Impl4086 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_6__1__Impl_in_rule__Intent__Group_4_6__14117 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_6__2_in_rule__Intent__Group_4_6__14120 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__Intent__Group_4_6__1__Impl4148 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_6__2__Impl_in_rule__Intent__Group_4_6__24179 = new BitSet(new long[]{0x0000000003400000L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_6__3_in_rule__Intent__Group_4_6__24182 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__Intent__Group_4_6__2__Impl4210 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_6__3__Impl_in_rule__Intent__Group_4_6__34241 = new BitSet(new long[]{0x0000000003400000L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_6__4_in_rule__Intent__Group_4_6__34244 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_6_3__0_in_rule__Intent__Group_4_6__3__Impl4271 = new BitSet(new long[]{0x0000000002400002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_6__4__Impl_in_rule__Intent__Group_4_6__44302 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_6__5_in_rule__Intent__Group_4_6__44305 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__Intent__Group_4_6__4__Impl4333 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_6__5__Impl_in_rule__Intent__Group_4_6__54364 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Intent__Group_4_6__5__Impl4392 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_6_3__0__Impl_in_rule__Intent__Group_4_6_3__04435 = new BitSet(new long[]{0x0000000002400000L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_6_3__1_in_rule__Intent__Group_4_6_3__04438 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Intent__Group_4_6_3__0__Impl4467 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_6_3__1__Impl_in_rule__Intent__Group_4_6_3__14500 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__ExtraDataAssignment_4_6_3_1_in_rule__Intent__Group_4_6_3__1__Impl4527 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_7__0__Impl_in_rule__Intent__Group_4_7__04561 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_7__1_in_rule__Intent__Group_4_7__04564 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__Intent__Group_4_7__0__Impl4592 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_7__1__Impl_in_rule__Intent__Group_4_7__14623 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_7__2_in_rule__Intent__Group_4_7__14626 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__Intent__Group_4_7__1__Impl4654 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_7__2__Impl_in_rule__Intent__Group_4_7__24685 = new BitSet(new long[]{0x0000000003400000L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_7__3_in_rule__Intent__Group_4_7__24688 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__Intent__Group_4_7__2__Impl4716 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_7__3__Impl_in_rule__Intent__Group_4_7__34747 = new BitSet(new long[]{0x0000000003400000L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_7__4_in_rule__Intent__Group_4_7__34750 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_7_3__0_in_rule__Intent__Group_4_7__3__Impl4777 = new BitSet(new long[]{0x0000000002400002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_7__4__Impl_in_rule__Intent__Group_4_7__44808 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__Intent__Group_4_7__4__Impl4836 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_7_3__0__Impl_in_rule__Intent__Group_4_7_3__04877 = new BitSet(new long[]{0x0000000002400000L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_7_3__1_in_rule__Intent__Group_4_7_3__04880 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Intent__Group_4_7_3__0__Impl4909 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_7_3__1__Impl_in_rule__Intent__Group_4_7_3__14942 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__ReturnDataAssignment_4_7_3_1_in_rule__Intent__Group_4_7_3__1__Impl4969 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtraData__Group__0__Impl_in_rule__ExtraData__Group__05003 = new BitSet(new long[]{0x0000000002400000L});
        public static final BitSet FOLLOW_rule__ExtraData__Group__1_in_rule__ExtraData__Group__05006 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtraData__Group__1__Impl_in_rule__ExtraData__Group__15064 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_rule__ExtraData__Group__2_in_rule__ExtraData__Group__15067 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__ExtraData__Group__1__Impl5095 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtraData__Group__2__Impl_in_rule__ExtraData__Group__25126 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__ExtraData__Group__3_in_rule__ExtraData__Group__25129 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtraData__Group_2__0_in_rule__ExtraData__Group__2__Impl5156 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtraData__Group__3__Impl_in_rule__ExtraData__Group__35186 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__ExtraData__Group__4_in_rule__ExtraData__Group__35189 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__ExtraData__Group__3__Impl5217 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtraData__Group__4__Impl_in_rule__ExtraData__Group__45248 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__ExtraData__Group__5_in_rule__ExtraData__Group__45251 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtraData__Group_4__0_in_rule__ExtraData__Group__4__Impl5278 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtraData__Group__5__Impl_in_rule__ExtraData__Group__55308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__ExtraData__Group__5__Impl5336 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtraData__Group_2__0__Impl_in_rule__ExtraData__Group_2__05379 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__ExtraData__Group_2__1_in_rule__ExtraData__Group_2__05382 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__ExtraData__Group_2__0__Impl5410 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtraData__Group_2__1__Impl_in_rule__ExtraData__Group_2__15441 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__ExtraData__Group_2__2_in_rule__ExtraData__Group_2__15444 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__ExtraData__Group_2__1__Impl5472 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtraData__Group_2__2__Impl_in_rule__ExtraData__Group_2__25503 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtraData__NameAssignment_2_2_in_rule__ExtraData__Group_2__2__Impl5530 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtraData__Group_4__0__Impl_in_rule__ExtraData__Group_4__05566 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__ExtraData__Group_4__1_in_rule__ExtraData__Group_4__05569 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__ExtraData__Group_4__0__Impl5597 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtraData__Group_4__1__Impl_in_rule__ExtraData__Group_4__15628 = new BitSet(new long[]{0x00000000000FF800L});
        public static final BitSet FOLLOW_rule__ExtraData__Group_4__2_in_rule__ExtraData__Group_4__15631 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__ExtraData__Group_4__1__Impl5659 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtraData__Group_4__2__Impl_in_rule__ExtraData__Group_4__25690 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtraData__TypeAssignment_4_2_in_rule__ExtraData__Group_4__2__Impl5717 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExplicitIntent__Group__0__Impl_in_rule__ExplicitIntent__Group__05753 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_rule__ExplicitIntent__Group__1_in_rule__ExplicitIntent__Group__05756 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExplicitIntent__Group__1__Impl_in_rule__ExplicitIntent__Group__15814 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__ExplicitIntent__Group__1__Impl5842 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ImplicitIntent__Group__0__Impl_in_rule__ImplicitIntent__Group__05877 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_rule__ImplicitIntent__Group__1_in_rule__ImplicitIntent__Group__05880 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ImplicitIntent__Group__1__Impl_in_rule__ImplicitIntent__Group__15938 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_rule__ImplicitIntent__Group__1__Impl5966 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BroadcastIntent__Group__0__Impl_in_rule__BroadcastIntent__Group__06001 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_rule__BroadcastIntent__Group__1_in_rule__BroadcastIntent__Group__06004 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BroadcastIntent__Group__1__Impl_in_rule__BroadcastIntent__Group__16062 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_rule__BroadcastIntent__Group__1__Impl6090 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ServiceIntent__Group__0__Impl_in_rule__ServiceIntent__Group__06125 = new BitSet(new long[]{0x000000F000000000L});
        public static final BitSet FOLLOW_rule__ServiceIntent__Group__1_in_rule__ServiceIntent__Group__06128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ServiceIntent__Group__1__Impl_in_rule__ServiceIntent__Group__16186 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_rule__ServiceIntent__Group__1__Impl6214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_rule__IntentModel__NameAssignment_16259 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIntent_in_rule__IntentModel__IntentsAssignment_56298 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIntent_in_rule__IntentModel__IntentsAssignment_7_26329 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Intent__NameAssignment_4_0_26360 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Intent__ActionAssignment_4_1_26391 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Intent__CategoryAssignment_4_2_26422 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Intent__MetaCategoryAssignment_4_3_26453 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Intent__DataURIAssignment_4_4_26484 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Intent__PermissionAssignment_4_5_26515 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExtraData_in_rule__Intent__ExtraDataAssignment_4_6_3_16546 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExtraData_in_rule__Intent__ReturnDataAssignment_4_7_3_16577 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__ExtraData__NameAssignment_2_26608 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSimpleTypeEnum_in_rule__ExtraData__TypeAssignment_4_26639 = new BitSet(new long[]{0x0000000000000002L});
    }


}