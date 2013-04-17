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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'boolean'", "'Bundle'", "'byte'", "'double'", "'float'", "'integer'", "'long'", "'short'", "'String'", "'='", "'['", "']'", "'{'", "'}'", "','", "'Type'", "':'", "'Name'", "'Action'", "'Category'", "'Meta-Category'", "'DataURI'", "'DataExtra'", "'ReturnData'", "'\\'ExplicitIntent\\''", "'\\'ImplicitIntent\\''", "'\\'BroadcastIntent\\''", "'\\'ServiceIntent\\''", "'Model'"
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
            case 35:
                {
                alt1=1;
                }
                break;
            case 36:
                {
                alt1=2;
                }
                break;
            case 37:
                {
                alt1=3;
                }
                break;
            case 38:
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:568:1: rule__IntentModel__Group__4__Impl : ( ( rule__IntentModel__Group_4__0 )? ) ;
    public final void rule__IntentModel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:572:1: ( ( ( rule__IntentModel__Group_4__0 )? ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:573:1: ( ( rule__IntentModel__Group_4__0 )? )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:573:1: ( ( rule__IntentModel__Group_4__0 )? )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:574:1: ( rule__IntentModel__Group_4__0 )?
            {
             before(grammarAccess.getIntentModelAccess().getGroup_4()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:575:1: ( rule__IntentModel__Group_4__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==23) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:575:2: rule__IntentModel__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__IntentModel__Group_4__0_in_rule__IntentModel__Group__4__Impl1195);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:585:1: rule__IntentModel__Group__5 : rule__IntentModel__Group__5__Impl ;
    public final void rule__IntentModel__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:589:1: ( rule__IntentModel__Group__5__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:590:2: rule__IntentModel__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntentModel__Group__5__Impl_in_rule__IntentModel__Group__51226);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:596:1: rule__IntentModel__Group__5__Impl : ( ']' ) ;
    public final void rule__IntentModel__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:600:1: ( ( ']' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:601:1: ( ']' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:601:1: ( ']' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:602:1: ']'
            {
             before(grammarAccess.getIntentModelAccess().getRightSquareBracketKeyword_5()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__IntentModel__Group__5__Impl1254); 
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:627:1: rule__IntentModel__Group_4__0 : rule__IntentModel__Group_4__0__Impl rule__IntentModel__Group_4__1 ;
    public final void rule__IntentModel__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:631:1: ( rule__IntentModel__Group_4__0__Impl rule__IntentModel__Group_4__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:632:2: rule__IntentModel__Group_4__0__Impl rule__IntentModel__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntentModel__Group_4__0__Impl_in_rule__IntentModel__Group_4__01297);
            rule__IntentModel__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IntentModel__Group_4__1_in_rule__IntentModel__Group_4__01300);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:639:1: rule__IntentModel__Group_4__0__Impl : ( '{' ) ;
    public final void rule__IntentModel__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:643:1: ( ( '{' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:644:1: ( '{' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:644:1: ( '{' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:645:1: '{'
            {
             before(grammarAccess.getIntentModelAccess().getLeftCurlyBracketKeyword_4_0()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__IntentModel__Group_4__0__Impl1328); 
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:658:1: rule__IntentModel__Group_4__1 : rule__IntentModel__Group_4__1__Impl rule__IntentModel__Group_4__2 ;
    public final void rule__IntentModel__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:662:1: ( rule__IntentModel__Group_4__1__Impl rule__IntentModel__Group_4__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:663:2: rule__IntentModel__Group_4__1__Impl rule__IntentModel__Group_4__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntentModel__Group_4__1__Impl_in_rule__IntentModel__Group_4__11359);
            rule__IntentModel__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IntentModel__Group_4__2_in_rule__IntentModel__Group_4__11362);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:670:1: rule__IntentModel__Group_4__1__Impl : ( ( rule__IntentModel__IntentsAssignment_4_1 ) ) ;
    public final void rule__IntentModel__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:674:1: ( ( ( rule__IntentModel__IntentsAssignment_4_1 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:675:1: ( ( rule__IntentModel__IntentsAssignment_4_1 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:675:1: ( ( rule__IntentModel__IntentsAssignment_4_1 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:676:1: ( rule__IntentModel__IntentsAssignment_4_1 )
            {
             before(grammarAccess.getIntentModelAccess().getIntentsAssignment_4_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:677:1: ( rule__IntentModel__IntentsAssignment_4_1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:677:2: rule__IntentModel__IntentsAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntentModel__IntentsAssignment_4_1_in_rule__IntentModel__Group_4__1__Impl1389);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:687:1: rule__IntentModel__Group_4__2 : rule__IntentModel__Group_4__2__Impl rule__IntentModel__Group_4__3 ;
    public final void rule__IntentModel__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:691:1: ( rule__IntentModel__Group_4__2__Impl rule__IntentModel__Group_4__3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:692:2: rule__IntentModel__Group_4__2__Impl rule__IntentModel__Group_4__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntentModel__Group_4__2__Impl_in_rule__IntentModel__Group_4__21419);
            rule__IntentModel__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IntentModel__Group_4__3_in_rule__IntentModel__Group_4__21422);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:699:1: rule__IntentModel__Group_4__2__Impl : ( ( rule__IntentModel__Group_4_2__0 )* ) ;
    public final void rule__IntentModel__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:703:1: ( ( ( rule__IntentModel__Group_4_2__0 )* ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:704:1: ( ( rule__IntentModel__Group_4_2__0 )* )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:704:1: ( ( rule__IntentModel__Group_4_2__0 )* )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:705:1: ( rule__IntentModel__Group_4_2__0 )*
            {
             before(grammarAccess.getIntentModelAccess().getGroup_4_2()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:706:1: ( rule__IntentModel__Group_4_2__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==25) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:706:2: rule__IntentModel__Group_4_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__IntentModel__Group_4_2__0_in_rule__IntentModel__Group_4__2__Impl1449);
            	    rule__IntentModel__Group_4_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:716:1: rule__IntentModel__Group_4__3 : rule__IntentModel__Group_4__3__Impl ;
    public final void rule__IntentModel__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:720:1: ( rule__IntentModel__Group_4__3__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:721:2: rule__IntentModel__Group_4__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntentModel__Group_4__3__Impl_in_rule__IntentModel__Group_4__31480);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:727:1: rule__IntentModel__Group_4__3__Impl : ( '}' ) ;
    public final void rule__IntentModel__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:731:1: ( ( '}' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:732:1: ( '}' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:732:1: ( '}' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:733:1: '}'
            {
             before(grammarAccess.getIntentModelAccess().getRightCurlyBracketKeyword_4_3()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__IntentModel__Group_4__3__Impl1508); 
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:754:1: rule__IntentModel__Group_4_2__0 : rule__IntentModel__Group_4_2__0__Impl rule__IntentModel__Group_4_2__1 ;
    public final void rule__IntentModel__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:758:1: ( rule__IntentModel__Group_4_2__0__Impl rule__IntentModel__Group_4_2__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:759:2: rule__IntentModel__Group_4_2__0__Impl rule__IntentModel__Group_4_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntentModel__Group_4_2__0__Impl_in_rule__IntentModel__Group_4_2__01547);
            rule__IntentModel__Group_4_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IntentModel__Group_4_2__1_in_rule__IntentModel__Group_4_2__01550);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:766:1: rule__IntentModel__Group_4_2__0__Impl : ( ',' ) ;
    public final void rule__IntentModel__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:770:1: ( ( ',' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:771:1: ( ',' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:771:1: ( ',' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:772:1: ','
            {
             before(grammarAccess.getIntentModelAccess().getCommaKeyword_4_2_0()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__IntentModel__Group_4_2__0__Impl1578); 
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:785:1: rule__IntentModel__Group_4_2__1 : rule__IntentModel__Group_4_2__1__Impl ;
    public final void rule__IntentModel__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:789:1: ( rule__IntentModel__Group_4_2__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:790:2: rule__IntentModel__Group_4_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntentModel__Group_4_2__1__Impl_in_rule__IntentModel__Group_4_2__11609);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:796:1: rule__IntentModel__Group_4_2__1__Impl : ( ( rule__IntentModel__IntentsAssignment_4_2_1 ) ) ;
    public final void rule__IntentModel__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:800:1: ( ( ( rule__IntentModel__IntentsAssignment_4_2_1 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:801:1: ( ( rule__IntentModel__IntentsAssignment_4_2_1 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:801:1: ( ( rule__IntentModel__IntentsAssignment_4_2_1 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:802:1: ( rule__IntentModel__IntentsAssignment_4_2_1 )
            {
             before(grammarAccess.getIntentModelAccess().getIntentsAssignment_4_2_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:803:1: ( rule__IntentModel__IntentsAssignment_4_2_1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:803:2: rule__IntentModel__IntentsAssignment_4_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntentModel__IntentsAssignment_4_2_1_in_rule__IntentModel__Group_4_2__1__Impl1636);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:817:1: rule__Intent__Group__0 : rule__Intent__Group__0__Impl rule__Intent__Group__1 ;
    public final void rule__Intent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:821:1: ( rule__Intent__Group__0__Impl rule__Intent__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:822:2: rule__Intent__Group__0__Impl rule__Intent__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group__0__Impl_in_rule__Intent__Group__01670);
            rule__Intent__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group__1_in_rule__Intent__Group__01673);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:829:1: rule__Intent__Group__0__Impl : ( 'Type' ) ;
    public final void rule__Intent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:833:1: ( ( 'Type' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:834:1: ( 'Type' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:834:1: ( 'Type' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:835:1: 'Type'
            {
             before(grammarAccess.getIntentAccess().getTypeKeyword_0()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__Intent__Group__0__Impl1701); 
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:848:1: rule__Intent__Group__1 : rule__Intent__Group__1__Impl rule__Intent__Group__2 ;
    public final void rule__Intent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:852:1: ( rule__Intent__Group__1__Impl rule__Intent__Group__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:853:2: rule__Intent__Group__1__Impl rule__Intent__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group__1__Impl_in_rule__Intent__Group__11732);
            rule__Intent__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group__2_in_rule__Intent__Group__11735);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:860:1: rule__Intent__Group__1__Impl : ( ':' ) ;
    public final void rule__Intent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:864:1: ( ( ':' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:865:1: ( ':' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:865:1: ( ':' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:866:1: ':'
            {
             before(grammarAccess.getIntentAccess().getColonKeyword_1()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__Intent__Group__1__Impl1763); 
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:879:1: rule__Intent__Group__2 : rule__Intent__Group__2__Impl rule__Intent__Group__3 ;
    public final void rule__Intent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:883:1: ( rule__Intent__Group__2__Impl rule__Intent__Group__3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:884:2: rule__Intent__Group__2__Impl rule__Intent__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group__2__Impl_in_rule__Intent__Group__21794);
            rule__Intent__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group__3_in_rule__Intent__Group__21797);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:891:1: rule__Intent__Group__2__Impl : ( ( rule__Intent__Alternatives_2 ) ) ;
    public final void rule__Intent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:895:1: ( ( ( rule__Intent__Alternatives_2 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:896:1: ( ( rule__Intent__Alternatives_2 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:896:1: ( ( rule__Intent__Alternatives_2 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:897:1: ( rule__Intent__Alternatives_2 )
            {
             before(grammarAccess.getIntentAccess().getAlternatives_2()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:898:1: ( rule__Intent__Alternatives_2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:898:2: rule__Intent__Alternatives_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Alternatives_2_in_rule__Intent__Group__2__Impl1824);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:908:1: rule__Intent__Group__3 : rule__Intent__Group__3__Impl rule__Intent__Group__4 ;
    public final void rule__Intent__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:912:1: ( rule__Intent__Group__3__Impl rule__Intent__Group__4 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:913:2: rule__Intent__Group__3__Impl rule__Intent__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group__3__Impl_in_rule__Intent__Group__31854);
            rule__Intent__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group__4_in_rule__Intent__Group__31857);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:920:1: rule__Intent__Group__3__Impl : ( ',' ) ;
    public final void rule__Intent__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:924:1: ( ( ',' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:925:1: ( ',' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:925:1: ( ',' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:926:1: ','
            {
             before(grammarAccess.getIntentAccess().getCommaKeyword_3()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Intent__Group__3__Impl1885); 
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:939:1: rule__Intent__Group__4 : rule__Intent__Group__4__Impl ;
    public final void rule__Intent__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:943:1: ( rule__Intent__Group__4__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:944:2: rule__Intent__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group__4__Impl_in_rule__Intent__Group__41916);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:950:1: rule__Intent__Group__4__Impl : ( ( rule__Intent__Group_4__0 ) ) ;
    public final void rule__Intent__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:954:1: ( ( ( rule__Intent__Group_4__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:955:1: ( ( rule__Intent__Group_4__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:955:1: ( ( rule__Intent__Group_4__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:956:1: ( rule__Intent__Group_4__0 )
            {
             before(grammarAccess.getIntentAccess().getGroup_4()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:957:1: ( rule__Intent__Group_4__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:957:2: rule__Intent__Group_4__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4__0_in_rule__Intent__Group__4__Impl1943);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:977:1: rule__Intent__Group_4__0 : rule__Intent__Group_4__0__Impl rule__Intent__Group_4__1 ;
    public final void rule__Intent__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:981:1: ( rule__Intent__Group_4__0__Impl rule__Intent__Group_4__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:982:2: rule__Intent__Group_4__0__Impl rule__Intent__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4__0__Impl_in_rule__Intent__Group_4__01983);
            rule__Intent__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4__1_in_rule__Intent__Group_4__01986);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:989:1: rule__Intent__Group_4__0__Impl : ( ( rule__Intent__Group_4_0__0 ) ) ;
    public final void rule__Intent__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:993:1: ( ( ( rule__Intent__Group_4_0__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:994:1: ( ( rule__Intent__Group_4_0__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:994:1: ( ( rule__Intent__Group_4_0__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:995:1: ( rule__Intent__Group_4_0__0 )
            {
             before(grammarAccess.getIntentAccess().getGroup_4_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:996:1: ( rule__Intent__Group_4_0__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:996:2: rule__Intent__Group_4_0__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_0__0_in_rule__Intent__Group_4__0__Impl2013);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1006:1: rule__Intent__Group_4__1 : rule__Intent__Group_4__1__Impl rule__Intent__Group_4__2 ;
    public final void rule__Intent__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1010:1: ( rule__Intent__Group_4__1__Impl rule__Intent__Group_4__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1011:2: rule__Intent__Group_4__1__Impl rule__Intent__Group_4__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4__1__Impl_in_rule__Intent__Group_4__12043);
            rule__Intent__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4__2_in_rule__Intent__Group_4__12046);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1018:1: rule__Intent__Group_4__1__Impl : ( ( rule__Intent__Group_4_1__0 ) ) ;
    public final void rule__Intent__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1022:1: ( ( ( rule__Intent__Group_4_1__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1023:1: ( ( rule__Intent__Group_4_1__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1023:1: ( ( rule__Intent__Group_4_1__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1024:1: ( rule__Intent__Group_4_1__0 )
            {
             before(grammarAccess.getIntentAccess().getGroup_4_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1025:1: ( rule__Intent__Group_4_1__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1025:2: rule__Intent__Group_4_1__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_1__0_in_rule__Intent__Group_4__1__Impl2073);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1035:1: rule__Intent__Group_4__2 : rule__Intent__Group_4__2__Impl rule__Intent__Group_4__3 ;
    public final void rule__Intent__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1039:1: ( rule__Intent__Group_4__2__Impl rule__Intent__Group_4__3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1040:2: rule__Intent__Group_4__2__Impl rule__Intent__Group_4__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4__2__Impl_in_rule__Intent__Group_4__22103);
            rule__Intent__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4__3_in_rule__Intent__Group_4__22106);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1047:1: rule__Intent__Group_4__2__Impl : ( ( rule__Intent__Group_4_2__0 )? ) ;
    public final void rule__Intent__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1051:1: ( ( ( rule__Intent__Group_4_2__0 )? ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1052:1: ( ( rule__Intent__Group_4_2__0 )? )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1052:1: ( ( rule__Intent__Group_4_2__0 )? )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1053:1: ( rule__Intent__Group_4_2__0 )?
            {
             before(grammarAccess.getIntentAccess().getGroup_4_2()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1054:1: ( rule__Intent__Group_4_2__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==30) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1054:2: rule__Intent__Group_4_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_2__0_in_rule__Intent__Group_4__2__Impl2133);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1064:1: rule__Intent__Group_4__3 : rule__Intent__Group_4__3__Impl rule__Intent__Group_4__4 ;
    public final void rule__Intent__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1068:1: ( rule__Intent__Group_4__3__Impl rule__Intent__Group_4__4 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1069:2: rule__Intent__Group_4__3__Impl rule__Intent__Group_4__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4__3__Impl_in_rule__Intent__Group_4__32164);
            rule__Intent__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4__4_in_rule__Intent__Group_4__32167);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1076:1: rule__Intent__Group_4__3__Impl : ( ( rule__Intent__Group_4_3__0 ) ) ;
    public final void rule__Intent__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1080:1: ( ( ( rule__Intent__Group_4_3__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1081:1: ( ( rule__Intent__Group_4_3__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1081:1: ( ( rule__Intent__Group_4_3__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1082:1: ( rule__Intent__Group_4_3__0 )
            {
             before(grammarAccess.getIntentAccess().getGroup_4_3()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1083:1: ( rule__Intent__Group_4_3__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1083:2: rule__Intent__Group_4_3__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_3__0_in_rule__Intent__Group_4__3__Impl2194);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1093:1: rule__Intent__Group_4__4 : rule__Intent__Group_4__4__Impl rule__Intent__Group_4__5 ;
    public final void rule__Intent__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1097:1: ( rule__Intent__Group_4__4__Impl rule__Intent__Group_4__5 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1098:2: rule__Intent__Group_4__4__Impl rule__Intent__Group_4__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4__4__Impl_in_rule__Intent__Group_4__42224);
            rule__Intent__Group_4__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4__5_in_rule__Intent__Group_4__42227);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1105:1: rule__Intent__Group_4__4__Impl : ( ( rule__Intent__Group_4_4__0 ) ) ;
    public final void rule__Intent__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1109:1: ( ( ( rule__Intent__Group_4_4__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1110:1: ( ( rule__Intent__Group_4_4__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1110:1: ( ( rule__Intent__Group_4_4__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1111:1: ( rule__Intent__Group_4_4__0 )
            {
             before(grammarAccess.getIntentAccess().getGroup_4_4()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1112:1: ( rule__Intent__Group_4_4__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1112:2: rule__Intent__Group_4_4__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_4__0_in_rule__Intent__Group_4__4__Impl2254);
            rule__Intent__Group_4_4__0();

            state._fsp--;


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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1122:1: rule__Intent__Group_4__5 : rule__Intent__Group_4__5__Impl rule__Intent__Group_4__6 ;
    public final void rule__Intent__Group_4__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1126:1: ( rule__Intent__Group_4__5__Impl rule__Intent__Group_4__6 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1127:2: rule__Intent__Group_4__5__Impl rule__Intent__Group_4__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4__5__Impl_in_rule__Intent__Group_4__52284);
            rule__Intent__Group_4__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4__6_in_rule__Intent__Group_4__52287);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1134:1: rule__Intent__Group_4__5__Impl : ( ( rule__Intent__Group_4_5__0 )? ) ;
    public final void rule__Intent__Group_4__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1138:1: ( ( ( rule__Intent__Group_4_5__0 )? ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1139:1: ( ( rule__Intent__Group_4_5__0 )? )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1139:1: ( ( rule__Intent__Group_4_5__0 )? )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1140:1: ( rule__Intent__Group_4_5__0 )?
            {
             before(grammarAccess.getIntentAccess().getGroup_4_5()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1141:1: ( rule__Intent__Group_4_5__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==33) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1141:2: rule__Intent__Group_4_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_5__0_in_rule__Intent__Group_4__5__Impl2314);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1151:1: rule__Intent__Group_4__6 : rule__Intent__Group_4__6__Impl ;
    public final void rule__Intent__Group_4__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1155:1: ( rule__Intent__Group_4__6__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1156:2: rule__Intent__Group_4__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4__6__Impl_in_rule__Intent__Group_4__62345);
            rule__Intent__Group_4__6__Impl();

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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1162:1: rule__Intent__Group_4__6__Impl : ( ( rule__Intent__Group_4_6__0 )? ) ;
    public final void rule__Intent__Group_4__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1166:1: ( ( ( rule__Intent__Group_4_6__0 )? ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1167:1: ( ( rule__Intent__Group_4_6__0 )? )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1167:1: ( ( rule__Intent__Group_4_6__0 )? )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1168:1: ( rule__Intent__Group_4_6__0 )?
            {
             before(grammarAccess.getIntentAccess().getGroup_4_6()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1169:1: ( rule__Intent__Group_4_6__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==34) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1169:2: rule__Intent__Group_4_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_6__0_in_rule__Intent__Group_4__6__Impl2372);
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


    // $ANTLR start "rule__Intent__Group_4_0__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1193:1: rule__Intent__Group_4_0__0 : rule__Intent__Group_4_0__0__Impl rule__Intent__Group_4_0__1 ;
    public final void rule__Intent__Group_4_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1197:1: ( rule__Intent__Group_4_0__0__Impl rule__Intent__Group_4_0__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1198:2: rule__Intent__Group_4_0__0__Impl rule__Intent__Group_4_0__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_0__0__Impl_in_rule__Intent__Group_4_0__02417);
            rule__Intent__Group_4_0__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_0__1_in_rule__Intent__Group_4_0__02420);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1205:1: rule__Intent__Group_4_0__0__Impl : ( 'Name' ) ;
    public final void rule__Intent__Group_4_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1209:1: ( ( 'Name' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1210:1: ( 'Name' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1210:1: ( 'Name' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1211:1: 'Name'
            {
             before(grammarAccess.getIntentAccess().getNameKeyword_4_0_0()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__Intent__Group_4_0__0__Impl2448); 
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1224:1: rule__Intent__Group_4_0__1 : rule__Intent__Group_4_0__1__Impl rule__Intent__Group_4_0__2 ;
    public final void rule__Intent__Group_4_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1228:1: ( rule__Intent__Group_4_0__1__Impl rule__Intent__Group_4_0__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1229:2: rule__Intent__Group_4_0__1__Impl rule__Intent__Group_4_0__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_0__1__Impl_in_rule__Intent__Group_4_0__12479);
            rule__Intent__Group_4_0__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_0__2_in_rule__Intent__Group_4_0__12482);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1236:1: rule__Intent__Group_4_0__1__Impl : ( ':' ) ;
    public final void rule__Intent__Group_4_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1240:1: ( ( ':' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1241:1: ( ':' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1241:1: ( ':' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1242:1: ':'
            {
             before(grammarAccess.getIntentAccess().getColonKeyword_4_0_1()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__Intent__Group_4_0__1__Impl2510); 
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1255:1: rule__Intent__Group_4_0__2 : rule__Intent__Group_4_0__2__Impl rule__Intent__Group_4_0__3 ;
    public final void rule__Intent__Group_4_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1259:1: ( rule__Intent__Group_4_0__2__Impl rule__Intent__Group_4_0__3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1260:2: rule__Intent__Group_4_0__2__Impl rule__Intent__Group_4_0__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_0__2__Impl_in_rule__Intent__Group_4_0__22541);
            rule__Intent__Group_4_0__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_0__3_in_rule__Intent__Group_4_0__22544);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1267:1: rule__Intent__Group_4_0__2__Impl : ( ( rule__Intent__NameAssignment_4_0_2 ) ) ;
    public final void rule__Intent__Group_4_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1271:1: ( ( ( rule__Intent__NameAssignment_4_0_2 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1272:1: ( ( rule__Intent__NameAssignment_4_0_2 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1272:1: ( ( rule__Intent__NameAssignment_4_0_2 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1273:1: ( rule__Intent__NameAssignment_4_0_2 )
            {
             before(grammarAccess.getIntentAccess().getNameAssignment_4_0_2()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1274:1: ( rule__Intent__NameAssignment_4_0_2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1274:2: rule__Intent__NameAssignment_4_0_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__NameAssignment_4_0_2_in_rule__Intent__Group_4_0__2__Impl2571);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1284:1: rule__Intent__Group_4_0__3 : rule__Intent__Group_4_0__3__Impl ;
    public final void rule__Intent__Group_4_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1288:1: ( rule__Intent__Group_4_0__3__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1289:2: rule__Intent__Group_4_0__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_0__3__Impl_in_rule__Intent__Group_4_0__32601);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1295:1: rule__Intent__Group_4_0__3__Impl : ( ',' ) ;
    public final void rule__Intent__Group_4_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1299:1: ( ( ',' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1300:1: ( ',' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1300:1: ( ',' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1301:1: ','
            {
             before(grammarAccess.getIntentAccess().getCommaKeyword_4_0_3()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Intent__Group_4_0__3__Impl2629); 
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1322:1: rule__Intent__Group_4_1__0 : rule__Intent__Group_4_1__0__Impl rule__Intent__Group_4_1__1 ;
    public final void rule__Intent__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1326:1: ( rule__Intent__Group_4_1__0__Impl rule__Intent__Group_4_1__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1327:2: rule__Intent__Group_4_1__0__Impl rule__Intent__Group_4_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_1__0__Impl_in_rule__Intent__Group_4_1__02668);
            rule__Intent__Group_4_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_1__1_in_rule__Intent__Group_4_1__02671);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1334:1: rule__Intent__Group_4_1__0__Impl : ( 'Action' ) ;
    public final void rule__Intent__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1338:1: ( ( 'Action' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1339:1: ( 'Action' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1339:1: ( 'Action' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1340:1: 'Action'
            {
             before(grammarAccess.getIntentAccess().getActionKeyword_4_1_0()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__Intent__Group_4_1__0__Impl2699); 
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1353:1: rule__Intent__Group_4_1__1 : rule__Intent__Group_4_1__1__Impl rule__Intent__Group_4_1__2 ;
    public final void rule__Intent__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1357:1: ( rule__Intent__Group_4_1__1__Impl rule__Intent__Group_4_1__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1358:2: rule__Intent__Group_4_1__1__Impl rule__Intent__Group_4_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_1__1__Impl_in_rule__Intent__Group_4_1__12730);
            rule__Intent__Group_4_1__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_1__2_in_rule__Intent__Group_4_1__12733);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1365:1: rule__Intent__Group_4_1__1__Impl : ( ':' ) ;
    public final void rule__Intent__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1369:1: ( ( ':' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1370:1: ( ':' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1370:1: ( ':' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1371:1: ':'
            {
             before(grammarAccess.getIntentAccess().getColonKeyword_4_1_1()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__Intent__Group_4_1__1__Impl2761); 
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1384:1: rule__Intent__Group_4_1__2 : rule__Intent__Group_4_1__2__Impl rule__Intent__Group_4_1__3 ;
    public final void rule__Intent__Group_4_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1388:1: ( rule__Intent__Group_4_1__2__Impl rule__Intent__Group_4_1__3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1389:2: rule__Intent__Group_4_1__2__Impl rule__Intent__Group_4_1__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_1__2__Impl_in_rule__Intent__Group_4_1__22792);
            rule__Intent__Group_4_1__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_1__3_in_rule__Intent__Group_4_1__22795);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1396:1: rule__Intent__Group_4_1__2__Impl : ( ( rule__Intent__ActionAssignment_4_1_2 ) ) ;
    public final void rule__Intent__Group_4_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1400:1: ( ( ( rule__Intent__ActionAssignment_4_1_2 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1401:1: ( ( rule__Intent__ActionAssignment_4_1_2 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1401:1: ( ( rule__Intent__ActionAssignment_4_1_2 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1402:1: ( rule__Intent__ActionAssignment_4_1_2 )
            {
             before(grammarAccess.getIntentAccess().getActionAssignment_4_1_2()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1403:1: ( rule__Intent__ActionAssignment_4_1_2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1403:2: rule__Intent__ActionAssignment_4_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__ActionAssignment_4_1_2_in_rule__Intent__Group_4_1__2__Impl2822);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1413:1: rule__Intent__Group_4_1__3 : rule__Intent__Group_4_1__3__Impl ;
    public final void rule__Intent__Group_4_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1417:1: ( rule__Intent__Group_4_1__3__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1418:2: rule__Intent__Group_4_1__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_1__3__Impl_in_rule__Intent__Group_4_1__32852);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1424:1: rule__Intent__Group_4_1__3__Impl : ( ',' ) ;
    public final void rule__Intent__Group_4_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1428:1: ( ( ',' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1429:1: ( ',' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1429:1: ( ',' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1430:1: ','
            {
             before(grammarAccess.getIntentAccess().getCommaKeyword_4_1_3()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Intent__Group_4_1__3__Impl2880); 
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1451:1: rule__Intent__Group_4_2__0 : rule__Intent__Group_4_2__0__Impl rule__Intent__Group_4_2__1 ;
    public final void rule__Intent__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1455:1: ( rule__Intent__Group_4_2__0__Impl rule__Intent__Group_4_2__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1456:2: rule__Intent__Group_4_2__0__Impl rule__Intent__Group_4_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_2__0__Impl_in_rule__Intent__Group_4_2__02919);
            rule__Intent__Group_4_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_2__1_in_rule__Intent__Group_4_2__02922);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1463:1: rule__Intent__Group_4_2__0__Impl : ( 'Category' ) ;
    public final void rule__Intent__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1467:1: ( ( 'Category' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1468:1: ( 'Category' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1468:1: ( 'Category' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1469:1: 'Category'
            {
             before(grammarAccess.getIntentAccess().getCategoryKeyword_4_2_0()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__Intent__Group_4_2__0__Impl2950); 
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1482:1: rule__Intent__Group_4_2__1 : rule__Intent__Group_4_2__1__Impl rule__Intent__Group_4_2__2 ;
    public final void rule__Intent__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1486:1: ( rule__Intent__Group_4_2__1__Impl rule__Intent__Group_4_2__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1487:2: rule__Intent__Group_4_2__1__Impl rule__Intent__Group_4_2__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_2__1__Impl_in_rule__Intent__Group_4_2__12981);
            rule__Intent__Group_4_2__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_2__2_in_rule__Intent__Group_4_2__12984);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1494:1: rule__Intent__Group_4_2__1__Impl : ( ':' ) ;
    public final void rule__Intent__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1498:1: ( ( ':' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1499:1: ( ':' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1499:1: ( ':' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1500:1: ':'
            {
             before(grammarAccess.getIntentAccess().getColonKeyword_4_2_1()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__Intent__Group_4_2__1__Impl3012); 
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1513:1: rule__Intent__Group_4_2__2 : rule__Intent__Group_4_2__2__Impl rule__Intent__Group_4_2__3 ;
    public final void rule__Intent__Group_4_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1517:1: ( rule__Intent__Group_4_2__2__Impl rule__Intent__Group_4_2__3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1518:2: rule__Intent__Group_4_2__2__Impl rule__Intent__Group_4_2__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_2__2__Impl_in_rule__Intent__Group_4_2__23043);
            rule__Intent__Group_4_2__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_2__3_in_rule__Intent__Group_4_2__23046);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1525:1: rule__Intent__Group_4_2__2__Impl : ( ( rule__Intent__CategoryAssignment_4_2_2 ) ) ;
    public final void rule__Intent__Group_4_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1529:1: ( ( ( rule__Intent__CategoryAssignment_4_2_2 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1530:1: ( ( rule__Intent__CategoryAssignment_4_2_2 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1530:1: ( ( rule__Intent__CategoryAssignment_4_2_2 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1531:1: ( rule__Intent__CategoryAssignment_4_2_2 )
            {
             before(grammarAccess.getIntentAccess().getCategoryAssignment_4_2_2()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1532:1: ( rule__Intent__CategoryAssignment_4_2_2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1532:2: rule__Intent__CategoryAssignment_4_2_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__CategoryAssignment_4_2_2_in_rule__Intent__Group_4_2__2__Impl3073);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1542:1: rule__Intent__Group_4_2__3 : rule__Intent__Group_4_2__3__Impl ;
    public final void rule__Intent__Group_4_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1546:1: ( rule__Intent__Group_4_2__3__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1547:2: rule__Intent__Group_4_2__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_2__3__Impl_in_rule__Intent__Group_4_2__33103);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1553:1: rule__Intent__Group_4_2__3__Impl : ( ',' ) ;
    public final void rule__Intent__Group_4_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1557:1: ( ( ',' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1558:1: ( ',' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1558:1: ( ',' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1559:1: ','
            {
             before(grammarAccess.getIntentAccess().getCommaKeyword_4_2_3()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Intent__Group_4_2__3__Impl3131); 
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1580:1: rule__Intent__Group_4_3__0 : rule__Intent__Group_4_3__0__Impl rule__Intent__Group_4_3__1 ;
    public final void rule__Intent__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1584:1: ( rule__Intent__Group_4_3__0__Impl rule__Intent__Group_4_3__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1585:2: rule__Intent__Group_4_3__0__Impl rule__Intent__Group_4_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_3__0__Impl_in_rule__Intent__Group_4_3__03170);
            rule__Intent__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_3__1_in_rule__Intent__Group_4_3__03173);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1592:1: rule__Intent__Group_4_3__0__Impl : ( 'Meta-Category' ) ;
    public final void rule__Intent__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1596:1: ( ( 'Meta-Category' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1597:1: ( 'Meta-Category' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1597:1: ( 'Meta-Category' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1598:1: 'Meta-Category'
            {
             before(grammarAccess.getIntentAccess().getMetaCategoryKeyword_4_3_0()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__Intent__Group_4_3__0__Impl3201); 
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1611:1: rule__Intent__Group_4_3__1 : rule__Intent__Group_4_3__1__Impl rule__Intent__Group_4_3__2 ;
    public final void rule__Intent__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1615:1: ( rule__Intent__Group_4_3__1__Impl rule__Intent__Group_4_3__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1616:2: rule__Intent__Group_4_3__1__Impl rule__Intent__Group_4_3__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_3__1__Impl_in_rule__Intent__Group_4_3__13232);
            rule__Intent__Group_4_3__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_3__2_in_rule__Intent__Group_4_3__13235);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1623:1: rule__Intent__Group_4_3__1__Impl : ( ':' ) ;
    public final void rule__Intent__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1627:1: ( ( ':' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1628:1: ( ':' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1628:1: ( ':' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1629:1: ':'
            {
             before(grammarAccess.getIntentAccess().getColonKeyword_4_3_1()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__Intent__Group_4_3__1__Impl3263); 
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1642:1: rule__Intent__Group_4_3__2 : rule__Intent__Group_4_3__2__Impl rule__Intent__Group_4_3__3 ;
    public final void rule__Intent__Group_4_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1646:1: ( rule__Intent__Group_4_3__2__Impl rule__Intent__Group_4_3__3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1647:2: rule__Intent__Group_4_3__2__Impl rule__Intent__Group_4_3__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_3__2__Impl_in_rule__Intent__Group_4_3__23294);
            rule__Intent__Group_4_3__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_3__3_in_rule__Intent__Group_4_3__23297);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1654:1: rule__Intent__Group_4_3__2__Impl : ( ( rule__Intent__MetaCategoryAssignment_4_3_2 ) ) ;
    public final void rule__Intent__Group_4_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1658:1: ( ( ( rule__Intent__MetaCategoryAssignment_4_3_2 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1659:1: ( ( rule__Intent__MetaCategoryAssignment_4_3_2 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1659:1: ( ( rule__Intent__MetaCategoryAssignment_4_3_2 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1660:1: ( rule__Intent__MetaCategoryAssignment_4_3_2 )
            {
             before(grammarAccess.getIntentAccess().getMetaCategoryAssignment_4_3_2()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1661:1: ( rule__Intent__MetaCategoryAssignment_4_3_2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1661:2: rule__Intent__MetaCategoryAssignment_4_3_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__MetaCategoryAssignment_4_3_2_in_rule__Intent__Group_4_3__2__Impl3324);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1671:1: rule__Intent__Group_4_3__3 : rule__Intent__Group_4_3__3__Impl ;
    public final void rule__Intent__Group_4_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1675:1: ( rule__Intent__Group_4_3__3__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1676:2: rule__Intent__Group_4_3__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_3__3__Impl_in_rule__Intent__Group_4_3__33354);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1682:1: rule__Intent__Group_4_3__3__Impl : ( ',' ) ;
    public final void rule__Intent__Group_4_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1686:1: ( ( ',' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1687:1: ( ',' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1687:1: ( ',' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1688:1: ','
            {
             before(grammarAccess.getIntentAccess().getCommaKeyword_4_3_3()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Intent__Group_4_3__3__Impl3382); 
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1709:1: rule__Intent__Group_4_4__0 : rule__Intent__Group_4_4__0__Impl rule__Intent__Group_4_4__1 ;
    public final void rule__Intent__Group_4_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1713:1: ( rule__Intent__Group_4_4__0__Impl rule__Intent__Group_4_4__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1714:2: rule__Intent__Group_4_4__0__Impl rule__Intent__Group_4_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_4__0__Impl_in_rule__Intent__Group_4_4__03421);
            rule__Intent__Group_4_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_4__1_in_rule__Intent__Group_4_4__03424);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1721:1: rule__Intent__Group_4_4__0__Impl : ( 'DataURI' ) ;
    public final void rule__Intent__Group_4_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1725:1: ( ( 'DataURI' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1726:1: ( 'DataURI' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1726:1: ( 'DataURI' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1727:1: 'DataURI'
            {
             before(grammarAccess.getIntentAccess().getDataURIKeyword_4_4_0()); 
            match(input,32,FollowSets000.FOLLOW_32_in_rule__Intent__Group_4_4__0__Impl3452); 
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1740:1: rule__Intent__Group_4_4__1 : rule__Intent__Group_4_4__1__Impl rule__Intent__Group_4_4__2 ;
    public final void rule__Intent__Group_4_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1744:1: ( rule__Intent__Group_4_4__1__Impl rule__Intent__Group_4_4__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1745:2: rule__Intent__Group_4_4__1__Impl rule__Intent__Group_4_4__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_4__1__Impl_in_rule__Intent__Group_4_4__13483);
            rule__Intent__Group_4_4__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_4__2_in_rule__Intent__Group_4_4__13486);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1752:1: rule__Intent__Group_4_4__1__Impl : ( ':' ) ;
    public final void rule__Intent__Group_4_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1756:1: ( ( ':' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1757:1: ( ':' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1757:1: ( ':' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1758:1: ':'
            {
             before(grammarAccess.getIntentAccess().getColonKeyword_4_4_1()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__Intent__Group_4_4__1__Impl3514); 
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1771:1: rule__Intent__Group_4_4__2 : rule__Intent__Group_4_4__2__Impl rule__Intent__Group_4_4__3 ;
    public final void rule__Intent__Group_4_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1775:1: ( rule__Intent__Group_4_4__2__Impl rule__Intent__Group_4_4__3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1776:2: rule__Intent__Group_4_4__2__Impl rule__Intent__Group_4_4__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_4__2__Impl_in_rule__Intent__Group_4_4__23545);
            rule__Intent__Group_4_4__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_4__3_in_rule__Intent__Group_4_4__23548);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1783:1: rule__Intent__Group_4_4__2__Impl : ( ( rule__Intent__DataURIAssignment_4_4_2 ) ) ;
    public final void rule__Intent__Group_4_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1787:1: ( ( ( rule__Intent__DataURIAssignment_4_4_2 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1788:1: ( ( rule__Intent__DataURIAssignment_4_4_2 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1788:1: ( ( rule__Intent__DataURIAssignment_4_4_2 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1789:1: ( rule__Intent__DataURIAssignment_4_4_2 )
            {
             before(grammarAccess.getIntentAccess().getDataURIAssignment_4_4_2()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1790:1: ( rule__Intent__DataURIAssignment_4_4_2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1790:2: rule__Intent__DataURIAssignment_4_4_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__DataURIAssignment_4_4_2_in_rule__Intent__Group_4_4__2__Impl3575);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1800:1: rule__Intent__Group_4_4__3 : rule__Intent__Group_4_4__3__Impl ;
    public final void rule__Intent__Group_4_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1804:1: ( rule__Intent__Group_4_4__3__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1805:2: rule__Intent__Group_4_4__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_4__3__Impl_in_rule__Intent__Group_4_4__33605);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1811:1: rule__Intent__Group_4_4__3__Impl : ( ',' ) ;
    public final void rule__Intent__Group_4_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1815:1: ( ( ',' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1816:1: ( ',' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1816:1: ( ',' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1817:1: ','
            {
             before(grammarAccess.getIntentAccess().getCommaKeyword_4_4_3()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Intent__Group_4_4__3__Impl3633); 
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1838:1: rule__Intent__Group_4_5__0 : rule__Intent__Group_4_5__0__Impl rule__Intent__Group_4_5__1 ;
    public final void rule__Intent__Group_4_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1842:1: ( rule__Intent__Group_4_5__0__Impl rule__Intent__Group_4_5__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1843:2: rule__Intent__Group_4_5__0__Impl rule__Intent__Group_4_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_5__0__Impl_in_rule__Intent__Group_4_5__03672);
            rule__Intent__Group_4_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_5__1_in_rule__Intent__Group_4_5__03675);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1850:1: rule__Intent__Group_4_5__0__Impl : ( 'DataExtra' ) ;
    public final void rule__Intent__Group_4_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1854:1: ( ( 'DataExtra' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1855:1: ( 'DataExtra' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1855:1: ( 'DataExtra' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1856:1: 'DataExtra'
            {
             before(grammarAccess.getIntentAccess().getDataExtraKeyword_4_5_0()); 
            match(input,33,FollowSets000.FOLLOW_33_in_rule__Intent__Group_4_5__0__Impl3703); 
             after(grammarAccess.getIntentAccess().getDataExtraKeyword_4_5_0()); 

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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1869:1: rule__Intent__Group_4_5__1 : rule__Intent__Group_4_5__1__Impl rule__Intent__Group_4_5__2 ;
    public final void rule__Intent__Group_4_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1873:1: ( rule__Intent__Group_4_5__1__Impl rule__Intent__Group_4_5__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1874:2: rule__Intent__Group_4_5__1__Impl rule__Intent__Group_4_5__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_5__1__Impl_in_rule__Intent__Group_4_5__13734);
            rule__Intent__Group_4_5__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_5__2_in_rule__Intent__Group_4_5__13737);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1881:1: rule__Intent__Group_4_5__1__Impl : ( ':' ) ;
    public final void rule__Intent__Group_4_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1885:1: ( ( ':' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1886:1: ( ':' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1886:1: ( ':' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1887:1: ':'
            {
             before(grammarAccess.getIntentAccess().getColonKeyword_4_5_1()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__Intent__Group_4_5__1__Impl3765); 
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1900:1: rule__Intent__Group_4_5__2 : rule__Intent__Group_4_5__2__Impl rule__Intent__Group_4_5__3 ;
    public final void rule__Intent__Group_4_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1904:1: ( rule__Intent__Group_4_5__2__Impl rule__Intent__Group_4_5__3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1905:2: rule__Intent__Group_4_5__2__Impl rule__Intent__Group_4_5__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_5__2__Impl_in_rule__Intent__Group_4_5__23796);
            rule__Intent__Group_4_5__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_5__3_in_rule__Intent__Group_4_5__23799);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1912:1: rule__Intent__Group_4_5__2__Impl : ( '[' ) ;
    public final void rule__Intent__Group_4_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1916:1: ( ( '[' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1917:1: ( '[' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1917:1: ( '[' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1918:1: '['
            {
             before(grammarAccess.getIntentAccess().getLeftSquareBracketKeyword_4_5_2()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__Intent__Group_4_5__2__Impl3827); 
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1931:1: rule__Intent__Group_4_5__3 : rule__Intent__Group_4_5__3__Impl rule__Intent__Group_4_5__4 ;
    public final void rule__Intent__Group_4_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1935:1: ( rule__Intent__Group_4_5__3__Impl rule__Intent__Group_4_5__4 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1936:2: rule__Intent__Group_4_5__3__Impl rule__Intent__Group_4_5__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_5__3__Impl_in_rule__Intent__Group_4_5__33858);
            rule__Intent__Group_4_5__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_5__4_in_rule__Intent__Group_4_5__33861);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1943:1: rule__Intent__Group_4_5__3__Impl : ( ( rule__Intent__ExtraDataAssignment_4_5_3 ) ) ;
    public final void rule__Intent__Group_4_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1947:1: ( ( ( rule__Intent__ExtraDataAssignment_4_5_3 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1948:1: ( ( rule__Intent__ExtraDataAssignment_4_5_3 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1948:1: ( ( rule__Intent__ExtraDataAssignment_4_5_3 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1949:1: ( rule__Intent__ExtraDataAssignment_4_5_3 )
            {
             before(grammarAccess.getIntentAccess().getExtraDataAssignment_4_5_3()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1950:1: ( rule__Intent__ExtraDataAssignment_4_5_3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1950:2: rule__Intent__ExtraDataAssignment_4_5_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__ExtraDataAssignment_4_5_3_in_rule__Intent__Group_4_5__3__Impl3888);
            rule__Intent__ExtraDataAssignment_4_5_3();

            state._fsp--;


            }

             after(grammarAccess.getIntentAccess().getExtraDataAssignment_4_5_3()); 

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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1960:1: rule__Intent__Group_4_5__4 : rule__Intent__Group_4_5__4__Impl rule__Intent__Group_4_5__5 ;
    public final void rule__Intent__Group_4_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1964:1: ( rule__Intent__Group_4_5__4__Impl rule__Intent__Group_4_5__5 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1965:2: rule__Intent__Group_4_5__4__Impl rule__Intent__Group_4_5__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_5__4__Impl_in_rule__Intent__Group_4_5__43918);
            rule__Intent__Group_4_5__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_5__5_in_rule__Intent__Group_4_5__43921);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1972:1: rule__Intent__Group_4_5__4__Impl : ( ( rule__Intent__Group_4_5_4__0 )* ) ;
    public final void rule__Intent__Group_4_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1976:1: ( ( ( rule__Intent__Group_4_5_4__0 )* ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1977:1: ( ( rule__Intent__Group_4_5_4__0 )* )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1977:1: ( ( rule__Intent__Group_4_5_4__0 )* )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1978:1: ( rule__Intent__Group_4_5_4__0 )*
            {
             before(grammarAccess.getIntentAccess().getGroup_4_5_4()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1979:1: ( rule__Intent__Group_4_5_4__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==25) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1979:2: rule__Intent__Group_4_5_4__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_5_4__0_in_rule__Intent__Group_4_5__4__Impl3948);
            	    rule__Intent__Group_4_5_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1989:1: rule__Intent__Group_4_5__5 : rule__Intent__Group_4_5__5__Impl rule__Intent__Group_4_5__6 ;
    public final void rule__Intent__Group_4_5__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1993:1: ( rule__Intent__Group_4_5__5__Impl rule__Intent__Group_4_5__6 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1994:2: rule__Intent__Group_4_5__5__Impl rule__Intent__Group_4_5__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_5__5__Impl_in_rule__Intent__Group_4_5__53979);
            rule__Intent__Group_4_5__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_5__6_in_rule__Intent__Group_4_5__53982);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2001:1: rule__Intent__Group_4_5__5__Impl : ( ']' ) ;
    public final void rule__Intent__Group_4_5__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2005:1: ( ( ']' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2006:1: ( ']' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2006:1: ( ']' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2007:1: ']'
            {
             before(grammarAccess.getIntentAccess().getRightSquareBracketKeyword_4_5_5()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__Intent__Group_4_5__5__Impl4010); 
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2020:1: rule__Intent__Group_4_5__6 : rule__Intent__Group_4_5__6__Impl ;
    public final void rule__Intent__Group_4_5__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2024:1: ( rule__Intent__Group_4_5__6__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2025:2: rule__Intent__Group_4_5__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_5__6__Impl_in_rule__Intent__Group_4_5__64041);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2031:1: rule__Intent__Group_4_5__6__Impl : ( ',' ) ;
    public final void rule__Intent__Group_4_5__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2035:1: ( ( ',' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2036:1: ( ',' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2036:1: ( ',' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2037:1: ','
            {
             before(grammarAccess.getIntentAccess().getCommaKeyword_4_5_6()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Intent__Group_4_5__6__Impl4069); 
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2064:1: rule__Intent__Group_4_5_4__0 : rule__Intent__Group_4_5_4__0__Impl rule__Intent__Group_4_5_4__1 ;
    public final void rule__Intent__Group_4_5_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2068:1: ( rule__Intent__Group_4_5_4__0__Impl rule__Intent__Group_4_5_4__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2069:2: rule__Intent__Group_4_5_4__0__Impl rule__Intent__Group_4_5_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_5_4__0__Impl_in_rule__Intent__Group_4_5_4__04114);
            rule__Intent__Group_4_5_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_5_4__1_in_rule__Intent__Group_4_5_4__04117);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2076:1: rule__Intent__Group_4_5_4__0__Impl : ( ',' ) ;
    public final void rule__Intent__Group_4_5_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2080:1: ( ( ',' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2081:1: ( ',' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2081:1: ( ',' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2082:1: ','
            {
             before(grammarAccess.getIntentAccess().getCommaKeyword_4_5_4_0()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Intent__Group_4_5_4__0__Impl4145); 
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2095:1: rule__Intent__Group_4_5_4__1 : rule__Intent__Group_4_5_4__1__Impl ;
    public final void rule__Intent__Group_4_5_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2099:1: ( rule__Intent__Group_4_5_4__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2100:2: rule__Intent__Group_4_5_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_5_4__1__Impl_in_rule__Intent__Group_4_5_4__14176);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2106:1: rule__Intent__Group_4_5_4__1__Impl : ( ( rule__Intent__ExtraDataAssignment_4_5_4_1 ) ) ;
    public final void rule__Intent__Group_4_5_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2110:1: ( ( ( rule__Intent__ExtraDataAssignment_4_5_4_1 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2111:1: ( ( rule__Intent__ExtraDataAssignment_4_5_4_1 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2111:1: ( ( rule__Intent__ExtraDataAssignment_4_5_4_1 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2112:1: ( rule__Intent__ExtraDataAssignment_4_5_4_1 )
            {
             before(grammarAccess.getIntentAccess().getExtraDataAssignment_4_5_4_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2113:1: ( rule__Intent__ExtraDataAssignment_4_5_4_1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2113:2: rule__Intent__ExtraDataAssignment_4_5_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__ExtraDataAssignment_4_5_4_1_in_rule__Intent__Group_4_5_4__1__Impl4203);
            rule__Intent__ExtraDataAssignment_4_5_4_1();

            state._fsp--;


            }

             after(grammarAccess.getIntentAccess().getExtraDataAssignment_4_5_4_1()); 

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


    // $ANTLR start "rule__Intent__Group_4_6__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2127:1: rule__Intent__Group_4_6__0 : rule__Intent__Group_4_6__0__Impl rule__Intent__Group_4_6__1 ;
    public final void rule__Intent__Group_4_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2131:1: ( rule__Intent__Group_4_6__0__Impl rule__Intent__Group_4_6__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2132:2: rule__Intent__Group_4_6__0__Impl rule__Intent__Group_4_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_6__0__Impl_in_rule__Intent__Group_4_6__04237);
            rule__Intent__Group_4_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_6__1_in_rule__Intent__Group_4_6__04240);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2139:1: rule__Intent__Group_4_6__0__Impl : ( 'ReturnData' ) ;
    public final void rule__Intent__Group_4_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2143:1: ( ( 'ReturnData' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2144:1: ( 'ReturnData' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2144:1: ( 'ReturnData' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2145:1: 'ReturnData'
            {
             before(grammarAccess.getIntentAccess().getReturnDataKeyword_4_6_0()); 
            match(input,34,FollowSets000.FOLLOW_34_in_rule__Intent__Group_4_6__0__Impl4268); 
             after(grammarAccess.getIntentAccess().getReturnDataKeyword_4_6_0()); 

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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2158:1: rule__Intent__Group_4_6__1 : rule__Intent__Group_4_6__1__Impl rule__Intent__Group_4_6__2 ;
    public final void rule__Intent__Group_4_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2162:1: ( rule__Intent__Group_4_6__1__Impl rule__Intent__Group_4_6__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2163:2: rule__Intent__Group_4_6__1__Impl rule__Intent__Group_4_6__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_6__1__Impl_in_rule__Intent__Group_4_6__14299);
            rule__Intent__Group_4_6__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_6__2_in_rule__Intent__Group_4_6__14302);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2170:1: rule__Intent__Group_4_6__1__Impl : ( ':' ) ;
    public final void rule__Intent__Group_4_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2174:1: ( ( ':' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2175:1: ( ':' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2175:1: ( ':' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2176:1: ':'
            {
             before(grammarAccess.getIntentAccess().getColonKeyword_4_6_1()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__Intent__Group_4_6__1__Impl4330); 
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2189:1: rule__Intent__Group_4_6__2 : rule__Intent__Group_4_6__2__Impl rule__Intent__Group_4_6__3 ;
    public final void rule__Intent__Group_4_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2193:1: ( rule__Intent__Group_4_6__2__Impl rule__Intent__Group_4_6__3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2194:2: rule__Intent__Group_4_6__2__Impl rule__Intent__Group_4_6__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_6__2__Impl_in_rule__Intent__Group_4_6__24361);
            rule__Intent__Group_4_6__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_6__3_in_rule__Intent__Group_4_6__24364);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2201:1: rule__Intent__Group_4_6__2__Impl : ( '[' ) ;
    public final void rule__Intent__Group_4_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2205:1: ( ( '[' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2206:1: ( '[' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2206:1: ( '[' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2207:1: '['
            {
             before(grammarAccess.getIntentAccess().getLeftSquareBracketKeyword_4_6_2()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__Intent__Group_4_6__2__Impl4392); 
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2220:1: rule__Intent__Group_4_6__3 : rule__Intent__Group_4_6__3__Impl rule__Intent__Group_4_6__4 ;
    public final void rule__Intent__Group_4_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2224:1: ( rule__Intent__Group_4_6__3__Impl rule__Intent__Group_4_6__4 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2225:2: rule__Intent__Group_4_6__3__Impl rule__Intent__Group_4_6__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_6__3__Impl_in_rule__Intent__Group_4_6__34423);
            rule__Intent__Group_4_6__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_6__4_in_rule__Intent__Group_4_6__34426);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2232:1: rule__Intent__Group_4_6__3__Impl : ( ( rule__Intent__ReturnDataAssignment_4_6_3 ) ) ;
    public final void rule__Intent__Group_4_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2236:1: ( ( ( rule__Intent__ReturnDataAssignment_4_6_3 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2237:1: ( ( rule__Intent__ReturnDataAssignment_4_6_3 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2237:1: ( ( rule__Intent__ReturnDataAssignment_4_6_3 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2238:1: ( rule__Intent__ReturnDataAssignment_4_6_3 )
            {
             before(grammarAccess.getIntentAccess().getReturnDataAssignment_4_6_3()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2239:1: ( rule__Intent__ReturnDataAssignment_4_6_3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2239:2: rule__Intent__ReturnDataAssignment_4_6_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__ReturnDataAssignment_4_6_3_in_rule__Intent__Group_4_6__3__Impl4453);
            rule__Intent__ReturnDataAssignment_4_6_3();

            state._fsp--;


            }

             after(grammarAccess.getIntentAccess().getReturnDataAssignment_4_6_3()); 

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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2249:1: rule__Intent__Group_4_6__4 : rule__Intent__Group_4_6__4__Impl rule__Intent__Group_4_6__5 ;
    public final void rule__Intent__Group_4_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2253:1: ( rule__Intent__Group_4_6__4__Impl rule__Intent__Group_4_6__5 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2254:2: rule__Intent__Group_4_6__4__Impl rule__Intent__Group_4_6__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_6__4__Impl_in_rule__Intent__Group_4_6__44483);
            rule__Intent__Group_4_6__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_6__5_in_rule__Intent__Group_4_6__44486);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2261:1: rule__Intent__Group_4_6__4__Impl : ( ( rule__Intent__Group_4_6_4__0 )* ) ;
    public final void rule__Intent__Group_4_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2265:1: ( ( ( rule__Intent__Group_4_6_4__0 )* ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2266:1: ( ( rule__Intent__Group_4_6_4__0 )* )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2266:1: ( ( rule__Intent__Group_4_6_4__0 )* )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2267:1: ( rule__Intent__Group_4_6_4__0 )*
            {
             before(grammarAccess.getIntentAccess().getGroup_4_6_4()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2268:1: ( rule__Intent__Group_4_6_4__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==25) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2268:2: rule__Intent__Group_4_6_4__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_6_4__0_in_rule__Intent__Group_4_6__4__Impl4513);
            	    rule__Intent__Group_4_6_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getIntentAccess().getGroup_4_6_4()); 

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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2278:1: rule__Intent__Group_4_6__5 : rule__Intent__Group_4_6__5__Impl rule__Intent__Group_4_6__6 ;
    public final void rule__Intent__Group_4_6__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2282:1: ( rule__Intent__Group_4_6__5__Impl rule__Intent__Group_4_6__6 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2283:2: rule__Intent__Group_4_6__5__Impl rule__Intent__Group_4_6__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_6__5__Impl_in_rule__Intent__Group_4_6__54544);
            rule__Intent__Group_4_6__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_6__6_in_rule__Intent__Group_4_6__54547);
            rule__Intent__Group_4_6__6();

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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2290:1: rule__Intent__Group_4_6__5__Impl : ( ']' ) ;
    public final void rule__Intent__Group_4_6__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2294:1: ( ( ']' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2295:1: ( ']' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2295:1: ( ']' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2296:1: ']'
            {
             before(grammarAccess.getIntentAccess().getRightSquareBracketKeyword_4_6_5()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__Intent__Group_4_6__5__Impl4575); 
             after(grammarAccess.getIntentAccess().getRightSquareBracketKeyword_4_6_5()); 

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


    // $ANTLR start "rule__Intent__Group_4_6__6"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2309:1: rule__Intent__Group_4_6__6 : rule__Intent__Group_4_6__6__Impl ;
    public final void rule__Intent__Group_4_6__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2313:1: ( rule__Intent__Group_4_6__6__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2314:2: rule__Intent__Group_4_6__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_6__6__Impl_in_rule__Intent__Group_4_6__64606);
            rule__Intent__Group_4_6__6__Impl();

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
    // $ANTLR end "rule__Intent__Group_4_6__6"


    // $ANTLR start "rule__Intent__Group_4_6__6__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2320:1: rule__Intent__Group_4_6__6__Impl : ( ',' ) ;
    public final void rule__Intent__Group_4_6__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2324:1: ( ( ',' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2325:1: ( ',' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2325:1: ( ',' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2326:1: ','
            {
             before(grammarAccess.getIntentAccess().getCommaKeyword_4_6_6()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Intent__Group_4_6__6__Impl4634); 
             after(grammarAccess.getIntentAccess().getCommaKeyword_4_6_6()); 

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
    // $ANTLR end "rule__Intent__Group_4_6__6__Impl"


    // $ANTLR start "rule__Intent__Group_4_6_4__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2353:1: rule__Intent__Group_4_6_4__0 : rule__Intent__Group_4_6_4__0__Impl rule__Intent__Group_4_6_4__1 ;
    public final void rule__Intent__Group_4_6_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2357:1: ( rule__Intent__Group_4_6_4__0__Impl rule__Intent__Group_4_6_4__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2358:2: rule__Intent__Group_4_6_4__0__Impl rule__Intent__Group_4_6_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_6_4__0__Impl_in_rule__Intent__Group_4_6_4__04679);
            rule__Intent__Group_4_6_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_6_4__1_in_rule__Intent__Group_4_6_4__04682);
            rule__Intent__Group_4_6_4__1();

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
    // $ANTLR end "rule__Intent__Group_4_6_4__0"


    // $ANTLR start "rule__Intent__Group_4_6_4__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2365:1: rule__Intent__Group_4_6_4__0__Impl : ( ',' ) ;
    public final void rule__Intent__Group_4_6_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2369:1: ( ( ',' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2370:1: ( ',' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2370:1: ( ',' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2371:1: ','
            {
             before(grammarAccess.getIntentAccess().getCommaKeyword_4_6_4_0()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Intent__Group_4_6_4__0__Impl4710); 
             after(grammarAccess.getIntentAccess().getCommaKeyword_4_6_4_0()); 

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
    // $ANTLR end "rule__Intent__Group_4_6_4__0__Impl"


    // $ANTLR start "rule__Intent__Group_4_6_4__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2384:1: rule__Intent__Group_4_6_4__1 : rule__Intent__Group_4_6_4__1__Impl ;
    public final void rule__Intent__Group_4_6_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2388:1: ( rule__Intent__Group_4_6_4__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2389:2: rule__Intent__Group_4_6_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_6_4__1__Impl_in_rule__Intent__Group_4_6_4__14741);
            rule__Intent__Group_4_6_4__1__Impl();

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
    // $ANTLR end "rule__Intent__Group_4_6_4__1"


    // $ANTLR start "rule__Intent__Group_4_6_4__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2395:1: rule__Intent__Group_4_6_4__1__Impl : ( ( rule__Intent__ReturnDataAssignment_4_6_4_1 ) ) ;
    public final void rule__Intent__Group_4_6_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2399:1: ( ( ( rule__Intent__ReturnDataAssignment_4_6_4_1 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2400:1: ( ( rule__Intent__ReturnDataAssignment_4_6_4_1 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2400:1: ( ( rule__Intent__ReturnDataAssignment_4_6_4_1 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2401:1: ( rule__Intent__ReturnDataAssignment_4_6_4_1 )
            {
             before(grammarAccess.getIntentAccess().getReturnDataAssignment_4_6_4_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2402:1: ( rule__Intent__ReturnDataAssignment_4_6_4_1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2402:2: rule__Intent__ReturnDataAssignment_4_6_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__ReturnDataAssignment_4_6_4_1_in_rule__Intent__Group_4_6_4__1__Impl4768);
            rule__Intent__ReturnDataAssignment_4_6_4_1();

            state._fsp--;


            }

             after(grammarAccess.getIntentAccess().getReturnDataAssignment_4_6_4_1()); 

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
    // $ANTLR end "rule__Intent__Group_4_6_4__1__Impl"


    // $ANTLR start "rule__ExtraData__Group__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2416:1: rule__ExtraData__Group__0 : rule__ExtraData__Group__0__Impl rule__ExtraData__Group__1 ;
    public final void rule__ExtraData__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2420:1: ( rule__ExtraData__Group__0__Impl rule__ExtraData__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2421:2: rule__ExtraData__Group__0__Impl rule__ExtraData__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtraData__Group__0__Impl_in_rule__ExtraData__Group__04802);
            rule__ExtraData__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ExtraData__Group__1_in_rule__ExtraData__Group__04805);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2428:1: rule__ExtraData__Group__0__Impl : ( () ) ;
    public final void rule__ExtraData__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2432:1: ( ( () ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2433:1: ( () )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2433:1: ( () )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2434:1: ()
            {
             before(grammarAccess.getExtraDataAccess().getExtraDataAction_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2435:1: ()
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2437:1: 
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2447:1: rule__ExtraData__Group__1 : rule__ExtraData__Group__1__Impl rule__ExtraData__Group__2 ;
    public final void rule__ExtraData__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2451:1: ( rule__ExtraData__Group__1__Impl rule__ExtraData__Group__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2452:2: rule__ExtraData__Group__1__Impl rule__ExtraData__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtraData__Group__1__Impl_in_rule__ExtraData__Group__14863);
            rule__ExtraData__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ExtraData__Group__2_in_rule__ExtraData__Group__14866);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2459:1: rule__ExtraData__Group__1__Impl : ( '{' ) ;
    public final void rule__ExtraData__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2463:1: ( ( '{' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2464:1: ( '{' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2464:1: ( '{' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2465:1: '{'
            {
             before(grammarAccess.getExtraDataAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__ExtraData__Group__1__Impl4894); 
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2478:1: rule__ExtraData__Group__2 : rule__ExtraData__Group__2__Impl rule__ExtraData__Group__3 ;
    public final void rule__ExtraData__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2482:1: ( rule__ExtraData__Group__2__Impl rule__ExtraData__Group__3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2483:2: rule__ExtraData__Group__2__Impl rule__ExtraData__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtraData__Group__2__Impl_in_rule__ExtraData__Group__24925);
            rule__ExtraData__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ExtraData__Group__3_in_rule__ExtraData__Group__24928);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2490:1: rule__ExtraData__Group__2__Impl : ( ( rule__ExtraData__Group_2__0 ) ) ;
    public final void rule__ExtraData__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2494:1: ( ( ( rule__ExtraData__Group_2__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2495:1: ( ( rule__ExtraData__Group_2__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2495:1: ( ( rule__ExtraData__Group_2__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2496:1: ( rule__ExtraData__Group_2__0 )
            {
             before(grammarAccess.getExtraDataAccess().getGroup_2()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2497:1: ( rule__ExtraData__Group_2__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2497:2: rule__ExtraData__Group_2__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtraData__Group_2__0_in_rule__ExtraData__Group__2__Impl4955);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2507:1: rule__ExtraData__Group__3 : rule__ExtraData__Group__3__Impl rule__ExtraData__Group__4 ;
    public final void rule__ExtraData__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2511:1: ( rule__ExtraData__Group__3__Impl rule__ExtraData__Group__4 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2512:2: rule__ExtraData__Group__3__Impl rule__ExtraData__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtraData__Group__3__Impl_in_rule__ExtraData__Group__34985);
            rule__ExtraData__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ExtraData__Group__4_in_rule__ExtraData__Group__34988);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2519:1: rule__ExtraData__Group__3__Impl : ( ',' ) ;
    public final void rule__ExtraData__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2523:1: ( ( ',' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2524:1: ( ',' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2524:1: ( ',' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2525:1: ','
            {
             before(grammarAccess.getExtraDataAccess().getCommaKeyword_3()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__ExtraData__Group__3__Impl5016); 
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2538:1: rule__ExtraData__Group__4 : rule__ExtraData__Group__4__Impl rule__ExtraData__Group__5 ;
    public final void rule__ExtraData__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2542:1: ( rule__ExtraData__Group__4__Impl rule__ExtraData__Group__5 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2543:2: rule__ExtraData__Group__4__Impl rule__ExtraData__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtraData__Group__4__Impl_in_rule__ExtraData__Group__45047);
            rule__ExtraData__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ExtraData__Group__5_in_rule__ExtraData__Group__45050);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2550:1: rule__ExtraData__Group__4__Impl : ( ( rule__ExtraData__Group_4__0 ) ) ;
    public final void rule__ExtraData__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2554:1: ( ( ( rule__ExtraData__Group_4__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2555:1: ( ( rule__ExtraData__Group_4__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2555:1: ( ( rule__ExtraData__Group_4__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2556:1: ( rule__ExtraData__Group_4__0 )
            {
             before(grammarAccess.getExtraDataAccess().getGroup_4()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2557:1: ( rule__ExtraData__Group_4__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2557:2: rule__ExtraData__Group_4__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtraData__Group_4__0_in_rule__ExtraData__Group__4__Impl5077);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2567:1: rule__ExtraData__Group__5 : rule__ExtraData__Group__5__Impl ;
    public final void rule__ExtraData__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2571:1: ( rule__ExtraData__Group__5__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2572:2: rule__ExtraData__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtraData__Group__5__Impl_in_rule__ExtraData__Group__55107);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2578:1: rule__ExtraData__Group__5__Impl : ( '}' ) ;
    public final void rule__ExtraData__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2582:1: ( ( '}' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2583:1: ( '}' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2583:1: ( '}' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2584:1: '}'
            {
             before(grammarAccess.getExtraDataAccess().getRightCurlyBracketKeyword_5()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__ExtraData__Group__5__Impl5135); 
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2609:1: rule__ExtraData__Group_2__0 : rule__ExtraData__Group_2__0__Impl rule__ExtraData__Group_2__1 ;
    public final void rule__ExtraData__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2613:1: ( rule__ExtraData__Group_2__0__Impl rule__ExtraData__Group_2__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2614:2: rule__ExtraData__Group_2__0__Impl rule__ExtraData__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtraData__Group_2__0__Impl_in_rule__ExtraData__Group_2__05178);
            rule__ExtraData__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ExtraData__Group_2__1_in_rule__ExtraData__Group_2__05181);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2621:1: rule__ExtraData__Group_2__0__Impl : ( 'Name' ) ;
    public final void rule__ExtraData__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2625:1: ( ( 'Name' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2626:1: ( 'Name' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2626:1: ( 'Name' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2627:1: 'Name'
            {
             before(grammarAccess.getExtraDataAccess().getNameKeyword_2_0()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__ExtraData__Group_2__0__Impl5209); 
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2640:1: rule__ExtraData__Group_2__1 : rule__ExtraData__Group_2__1__Impl rule__ExtraData__Group_2__2 ;
    public final void rule__ExtraData__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2644:1: ( rule__ExtraData__Group_2__1__Impl rule__ExtraData__Group_2__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2645:2: rule__ExtraData__Group_2__1__Impl rule__ExtraData__Group_2__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtraData__Group_2__1__Impl_in_rule__ExtraData__Group_2__15240);
            rule__ExtraData__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ExtraData__Group_2__2_in_rule__ExtraData__Group_2__15243);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2652:1: rule__ExtraData__Group_2__1__Impl : ( ':' ) ;
    public final void rule__ExtraData__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2656:1: ( ( ':' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2657:1: ( ':' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2657:1: ( ':' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2658:1: ':'
            {
             before(grammarAccess.getExtraDataAccess().getColonKeyword_2_1()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__ExtraData__Group_2__1__Impl5271); 
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2671:1: rule__ExtraData__Group_2__2 : rule__ExtraData__Group_2__2__Impl ;
    public final void rule__ExtraData__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2675:1: ( rule__ExtraData__Group_2__2__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2676:2: rule__ExtraData__Group_2__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtraData__Group_2__2__Impl_in_rule__ExtraData__Group_2__25302);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2682:1: rule__ExtraData__Group_2__2__Impl : ( ( rule__ExtraData__NameAssignment_2_2 ) ) ;
    public final void rule__ExtraData__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2686:1: ( ( ( rule__ExtraData__NameAssignment_2_2 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2687:1: ( ( rule__ExtraData__NameAssignment_2_2 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2687:1: ( ( rule__ExtraData__NameAssignment_2_2 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2688:1: ( rule__ExtraData__NameAssignment_2_2 )
            {
             before(grammarAccess.getExtraDataAccess().getNameAssignment_2_2()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2689:1: ( rule__ExtraData__NameAssignment_2_2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2689:2: rule__ExtraData__NameAssignment_2_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtraData__NameAssignment_2_2_in_rule__ExtraData__Group_2__2__Impl5329);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2705:1: rule__ExtraData__Group_4__0 : rule__ExtraData__Group_4__0__Impl rule__ExtraData__Group_4__1 ;
    public final void rule__ExtraData__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2709:1: ( rule__ExtraData__Group_4__0__Impl rule__ExtraData__Group_4__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2710:2: rule__ExtraData__Group_4__0__Impl rule__ExtraData__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtraData__Group_4__0__Impl_in_rule__ExtraData__Group_4__05365);
            rule__ExtraData__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ExtraData__Group_4__1_in_rule__ExtraData__Group_4__05368);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2717:1: rule__ExtraData__Group_4__0__Impl : ( 'Type' ) ;
    public final void rule__ExtraData__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2721:1: ( ( 'Type' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2722:1: ( 'Type' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2722:1: ( 'Type' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2723:1: 'Type'
            {
             before(grammarAccess.getExtraDataAccess().getTypeKeyword_4_0()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__ExtraData__Group_4__0__Impl5396); 
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2736:1: rule__ExtraData__Group_4__1 : rule__ExtraData__Group_4__1__Impl rule__ExtraData__Group_4__2 ;
    public final void rule__ExtraData__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2740:1: ( rule__ExtraData__Group_4__1__Impl rule__ExtraData__Group_4__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2741:2: rule__ExtraData__Group_4__1__Impl rule__ExtraData__Group_4__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtraData__Group_4__1__Impl_in_rule__ExtraData__Group_4__15427);
            rule__ExtraData__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ExtraData__Group_4__2_in_rule__ExtraData__Group_4__15430);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2748:1: rule__ExtraData__Group_4__1__Impl : ( ':' ) ;
    public final void rule__ExtraData__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2752:1: ( ( ':' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2753:1: ( ':' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2753:1: ( ':' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2754:1: ':'
            {
             before(grammarAccess.getExtraDataAccess().getColonKeyword_4_1()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__ExtraData__Group_4__1__Impl5458); 
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2767:1: rule__ExtraData__Group_4__2 : rule__ExtraData__Group_4__2__Impl ;
    public final void rule__ExtraData__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2771:1: ( rule__ExtraData__Group_4__2__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2772:2: rule__ExtraData__Group_4__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtraData__Group_4__2__Impl_in_rule__ExtraData__Group_4__25489);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2778:1: rule__ExtraData__Group_4__2__Impl : ( ( rule__ExtraData__TypeAssignment_4_2 ) ) ;
    public final void rule__ExtraData__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2782:1: ( ( ( rule__ExtraData__TypeAssignment_4_2 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2783:1: ( ( rule__ExtraData__TypeAssignment_4_2 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2783:1: ( ( rule__ExtraData__TypeAssignment_4_2 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2784:1: ( rule__ExtraData__TypeAssignment_4_2 )
            {
             before(grammarAccess.getExtraDataAccess().getTypeAssignment_4_2()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2785:1: ( rule__ExtraData__TypeAssignment_4_2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2785:2: rule__ExtraData__TypeAssignment_4_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtraData__TypeAssignment_4_2_in_rule__ExtraData__Group_4__2__Impl5516);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2801:1: rule__ExplicitIntent__Group__0 : rule__ExplicitIntent__Group__0__Impl rule__ExplicitIntent__Group__1 ;
    public final void rule__ExplicitIntent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2805:1: ( rule__ExplicitIntent__Group__0__Impl rule__ExplicitIntent__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2806:2: rule__ExplicitIntent__Group__0__Impl rule__ExplicitIntent__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExplicitIntent__Group__0__Impl_in_rule__ExplicitIntent__Group__05552);
            rule__ExplicitIntent__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ExplicitIntent__Group__1_in_rule__ExplicitIntent__Group__05555);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2813:1: rule__ExplicitIntent__Group__0__Impl : ( () ) ;
    public final void rule__ExplicitIntent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2817:1: ( ( () ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2818:1: ( () )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2818:1: ( () )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2819:1: ()
            {
             before(grammarAccess.getExplicitIntentAccess().getExplicitIntentAction_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2820:1: ()
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2822:1: 
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2832:1: rule__ExplicitIntent__Group__1 : rule__ExplicitIntent__Group__1__Impl ;
    public final void rule__ExplicitIntent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2836:1: ( rule__ExplicitIntent__Group__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2837:2: rule__ExplicitIntent__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExplicitIntent__Group__1__Impl_in_rule__ExplicitIntent__Group__15613);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2843:1: rule__ExplicitIntent__Group__1__Impl : ( '\\'ExplicitIntent\\'' ) ;
    public final void rule__ExplicitIntent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2847:1: ( ( '\\'ExplicitIntent\\'' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2848:1: ( '\\'ExplicitIntent\\'' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2848:1: ( '\\'ExplicitIntent\\'' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2849:1: '\\'ExplicitIntent\\''
            {
             before(grammarAccess.getExplicitIntentAccess().getExplicitIntentKeyword_1()); 
            match(input,35,FollowSets000.FOLLOW_35_in_rule__ExplicitIntent__Group__1__Impl5641); 
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2866:1: rule__ImplicitIntent__Group__0 : rule__ImplicitIntent__Group__0__Impl rule__ImplicitIntent__Group__1 ;
    public final void rule__ImplicitIntent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2870:1: ( rule__ImplicitIntent__Group__0__Impl rule__ImplicitIntent__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2871:2: rule__ImplicitIntent__Group__0__Impl rule__ImplicitIntent__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ImplicitIntent__Group__0__Impl_in_rule__ImplicitIntent__Group__05676);
            rule__ImplicitIntent__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ImplicitIntent__Group__1_in_rule__ImplicitIntent__Group__05679);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2878:1: rule__ImplicitIntent__Group__0__Impl : ( () ) ;
    public final void rule__ImplicitIntent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2882:1: ( ( () ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2883:1: ( () )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2883:1: ( () )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2884:1: ()
            {
             before(grammarAccess.getImplicitIntentAccess().getImplicitIntentAction_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2885:1: ()
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2887:1: 
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2897:1: rule__ImplicitIntent__Group__1 : rule__ImplicitIntent__Group__1__Impl ;
    public final void rule__ImplicitIntent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2901:1: ( rule__ImplicitIntent__Group__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2902:2: rule__ImplicitIntent__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ImplicitIntent__Group__1__Impl_in_rule__ImplicitIntent__Group__15737);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2908:1: rule__ImplicitIntent__Group__1__Impl : ( '\\'ImplicitIntent\\'' ) ;
    public final void rule__ImplicitIntent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2912:1: ( ( '\\'ImplicitIntent\\'' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2913:1: ( '\\'ImplicitIntent\\'' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2913:1: ( '\\'ImplicitIntent\\'' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2914:1: '\\'ImplicitIntent\\''
            {
             before(grammarAccess.getImplicitIntentAccess().getImplicitIntentKeyword_1()); 
            match(input,36,FollowSets000.FOLLOW_36_in_rule__ImplicitIntent__Group__1__Impl5765); 
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2931:1: rule__BroadcastIntent__Group__0 : rule__BroadcastIntent__Group__0__Impl rule__BroadcastIntent__Group__1 ;
    public final void rule__BroadcastIntent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2935:1: ( rule__BroadcastIntent__Group__0__Impl rule__BroadcastIntent__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2936:2: rule__BroadcastIntent__Group__0__Impl rule__BroadcastIntent__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BroadcastIntent__Group__0__Impl_in_rule__BroadcastIntent__Group__05800);
            rule__BroadcastIntent__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BroadcastIntent__Group__1_in_rule__BroadcastIntent__Group__05803);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2943:1: rule__BroadcastIntent__Group__0__Impl : ( () ) ;
    public final void rule__BroadcastIntent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2947:1: ( ( () ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2948:1: ( () )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2948:1: ( () )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2949:1: ()
            {
             before(grammarAccess.getBroadcastIntentAccess().getBroadCastIntentAction_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2950:1: ()
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2952:1: 
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2962:1: rule__BroadcastIntent__Group__1 : rule__BroadcastIntent__Group__1__Impl ;
    public final void rule__BroadcastIntent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2966:1: ( rule__BroadcastIntent__Group__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2967:2: rule__BroadcastIntent__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__BroadcastIntent__Group__1__Impl_in_rule__BroadcastIntent__Group__15861);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2973:1: rule__BroadcastIntent__Group__1__Impl : ( '\\'BroadcastIntent\\'' ) ;
    public final void rule__BroadcastIntent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2977:1: ( ( '\\'BroadcastIntent\\'' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2978:1: ( '\\'BroadcastIntent\\'' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2978:1: ( '\\'BroadcastIntent\\'' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2979:1: '\\'BroadcastIntent\\''
            {
             before(grammarAccess.getBroadcastIntentAccess().getBroadcastIntentKeyword_1()); 
            match(input,37,FollowSets000.FOLLOW_37_in_rule__BroadcastIntent__Group__1__Impl5889); 
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2996:1: rule__ServiceIntent__Group__0 : rule__ServiceIntent__Group__0__Impl rule__ServiceIntent__Group__1 ;
    public final void rule__ServiceIntent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3000:1: ( rule__ServiceIntent__Group__0__Impl rule__ServiceIntent__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3001:2: rule__ServiceIntent__Group__0__Impl rule__ServiceIntent__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ServiceIntent__Group__0__Impl_in_rule__ServiceIntent__Group__05924);
            rule__ServiceIntent__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ServiceIntent__Group__1_in_rule__ServiceIntent__Group__05927);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3008:1: rule__ServiceIntent__Group__0__Impl : ( () ) ;
    public final void rule__ServiceIntent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3012:1: ( ( () ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3013:1: ( () )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3013:1: ( () )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3014:1: ()
            {
             before(grammarAccess.getServiceIntentAccess().getServiceIntentAction_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3015:1: ()
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3017:1: 
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3027:1: rule__ServiceIntent__Group__1 : rule__ServiceIntent__Group__1__Impl ;
    public final void rule__ServiceIntent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3031:1: ( rule__ServiceIntent__Group__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3032:2: rule__ServiceIntent__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ServiceIntent__Group__1__Impl_in_rule__ServiceIntent__Group__15985);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3038:1: rule__ServiceIntent__Group__1__Impl : ( '\\'ServiceIntent\\'' ) ;
    public final void rule__ServiceIntent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3042:1: ( ( '\\'ServiceIntent\\'' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3043:1: ( '\\'ServiceIntent\\'' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3043:1: ( '\\'ServiceIntent\\'' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3044:1: '\\'ServiceIntent\\''
            {
             before(grammarAccess.getServiceIntentAccess().getServiceIntentKeyword_1()); 
            match(input,38,FollowSets000.FOLLOW_38_in_rule__ServiceIntent__Group__1__Impl6013); 
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3062:1: rule__IntentModel__NameAssignment_1 : ( ( 'Model' ) ) ;
    public final void rule__IntentModel__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3066:1: ( ( ( 'Model' ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3067:1: ( ( 'Model' ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3067:1: ( ( 'Model' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3068:1: ( 'Model' )
            {
             before(grammarAccess.getIntentModelAccess().getNameModelKeyword_1_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3069:1: ( 'Model' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3070:1: 'Model'
            {
             before(grammarAccess.getIntentModelAccess().getNameModelKeyword_1_0()); 
            match(input,39,FollowSets000.FOLLOW_39_in_rule__IntentModel__NameAssignment_16058); 
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3085:1: rule__IntentModel__IntentsAssignment_4_1 : ( ruleIntent ) ;
    public final void rule__IntentModel__IntentsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3089:1: ( ( ruleIntent ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3090:1: ( ruleIntent )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3090:1: ( ruleIntent )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3091:1: ruleIntent
            {
             before(grammarAccess.getIntentModelAccess().getIntentsIntentParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleIntent_in_rule__IntentModel__IntentsAssignment_4_16097);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3100:1: rule__IntentModel__IntentsAssignment_4_2_1 : ( ruleIntent ) ;
    public final void rule__IntentModel__IntentsAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3104:1: ( ( ruleIntent ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3105:1: ( ruleIntent )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3105:1: ( ruleIntent )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3106:1: ruleIntent
            {
             before(grammarAccess.getIntentModelAccess().getIntentsIntentParserRuleCall_4_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleIntent_in_rule__IntentModel__IntentsAssignment_4_2_16128);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3115:1: rule__Intent__NameAssignment_4_0_2 : ( ruleEString ) ;
    public final void rule__Intent__NameAssignment_4_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3119:1: ( ( ruleEString ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3120:1: ( ruleEString )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3120:1: ( ruleEString )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3121:1: ruleEString
            {
             before(grammarAccess.getIntentAccess().getNameEStringParserRuleCall_4_0_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Intent__NameAssignment_4_0_26159);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3130:1: rule__Intent__ActionAssignment_4_1_2 : ( ruleEString ) ;
    public final void rule__Intent__ActionAssignment_4_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3134:1: ( ( ruleEString ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3135:1: ( ruleEString )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3135:1: ( ruleEString )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3136:1: ruleEString
            {
             before(grammarAccess.getIntentAccess().getActionEStringParserRuleCall_4_1_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Intent__ActionAssignment_4_1_26190);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3145:1: rule__Intent__CategoryAssignment_4_2_2 : ( ruleEString ) ;
    public final void rule__Intent__CategoryAssignment_4_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3149:1: ( ( ruleEString ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3150:1: ( ruleEString )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3150:1: ( ruleEString )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3151:1: ruleEString
            {
             before(grammarAccess.getIntentAccess().getCategoryEStringParserRuleCall_4_2_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Intent__CategoryAssignment_4_2_26221);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3160:1: rule__Intent__MetaCategoryAssignment_4_3_2 : ( ruleEString ) ;
    public final void rule__Intent__MetaCategoryAssignment_4_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3164:1: ( ( ruleEString ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3165:1: ( ruleEString )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3165:1: ( ruleEString )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3166:1: ruleEString
            {
             before(grammarAccess.getIntentAccess().getMetaCategoryEStringParserRuleCall_4_3_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Intent__MetaCategoryAssignment_4_3_26252);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3175:1: rule__Intent__DataURIAssignment_4_4_2 : ( ruleEString ) ;
    public final void rule__Intent__DataURIAssignment_4_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3179:1: ( ( ruleEString ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3180:1: ( ruleEString )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3180:1: ( ruleEString )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3181:1: ruleEString
            {
             before(grammarAccess.getIntentAccess().getDataURIEStringParserRuleCall_4_4_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Intent__DataURIAssignment_4_4_26283);
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


    // $ANTLR start "rule__Intent__ExtraDataAssignment_4_5_3"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3190:1: rule__Intent__ExtraDataAssignment_4_5_3 : ( ruleExtraData ) ;
    public final void rule__Intent__ExtraDataAssignment_4_5_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3194:1: ( ( ruleExtraData ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3195:1: ( ruleExtraData )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3195:1: ( ruleExtraData )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3196:1: ruleExtraData
            {
             before(grammarAccess.getIntentAccess().getExtraDataExtraDataParserRuleCall_4_5_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleExtraData_in_rule__Intent__ExtraDataAssignment_4_5_36314);
            ruleExtraData();

            state._fsp--;

             after(grammarAccess.getIntentAccess().getExtraDataExtraDataParserRuleCall_4_5_3_0()); 

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
    // $ANTLR end "rule__Intent__ExtraDataAssignment_4_5_3"


    // $ANTLR start "rule__Intent__ExtraDataAssignment_4_5_4_1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3205:1: rule__Intent__ExtraDataAssignment_4_5_4_1 : ( ruleExtraData ) ;
    public final void rule__Intent__ExtraDataAssignment_4_5_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3209:1: ( ( ruleExtraData ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3210:1: ( ruleExtraData )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3210:1: ( ruleExtraData )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3211:1: ruleExtraData
            {
             before(grammarAccess.getIntentAccess().getExtraDataExtraDataParserRuleCall_4_5_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleExtraData_in_rule__Intent__ExtraDataAssignment_4_5_4_16345);
            ruleExtraData();

            state._fsp--;

             after(grammarAccess.getIntentAccess().getExtraDataExtraDataParserRuleCall_4_5_4_1_0()); 

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
    // $ANTLR end "rule__Intent__ExtraDataAssignment_4_5_4_1"


    // $ANTLR start "rule__Intent__ReturnDataAssignment_4_6_3"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3220:1: rule__Intent__ReturnDataAssignment_4_6_3 : ( ruleExtraData ) ;
    public final void rule__Intent__ReturnDataAssignment_4_6_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3224:1: ( ( ruleExtraData ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3225:1: ( ruleExtraData )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3225:1: ( ruleExtraData )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3226:1: ruleExtraData
            {
             before(grammarAccess.getIntentAccess().getReturnDataExtraDataParserRuleCall_4_6_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleExtraData_in_rule__Intent__ReturnDataAssignment_4_6_36376);
            ruleExtraData();

            state._fsp--;

             after(grammarAccess.getIntentAccess().getReturnDataExtraDataParserRuleCall_4_6_3_0()); 

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
    // $ANTLR end "rule__Intent__ReturnDataAssignment_4_6_3"


    // $ANTLR start "rule__Intent__ReturnDataAssignment_4_6_4_1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3235:1: rule__Intent__ReturnDataAssignment_4_6_4_1 : ( ruleExtraData ) ;
    public final void rule__Intent__ReturnDataAssignment_4_6_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3239:1: ( ( ruleExtraData ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3240:1: ( ruleExtraData )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3240:1: ( ruleExtraData )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3241:1: ruleExtraData
            {
             before(grammarAccess.getIntentAccess().getReturnDataExtraDataParserRuleCall_4_6_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleExtraData_in_rule__Intent__ReturnDataAssignment_4_6_4_16407);
            ruleExtraData();

            state._fsp--;

             after(grammarAccess.getIntentAccess().getReturnDataExtraDataParserRuleCall_4_6_4_1_0()); 

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
    // $ANTLR end "rule__Intent__ReturnDataAssignment_4_6_4_1"


    // $ANTLR start "rule__ExtraData__NameAssignment_2_2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3250:1: rule__ExtraData__NameAssignment_2_2 : ( ruleEString ) ;
    public final void rule__ExtraData__NameAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3254:1: ( ( ruleEString ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3255:1: ( ruleEString )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3255:1: ( ruleEString )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3256:1: ruleEString
            {
             before(grammarAccess.getExtraDataAccess().getNameEStringParserRuleCall_2_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__ExtraData__NameAssignment_2_26438);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3265:1: rule__ExtraData__TypeAssignment_4_2 : ( ruleSimpleTypeEnum ) ;
    public final void rule__ExtraData__TypeAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3269:1: ( ( ruleSimpleTypeEnum ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3270:1: ( ruleSimpleTypeEnum )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3270:1: ( ruleSimpleTypeEnum )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3271:1: ruleSimpleTypeEnum
            {
             before(grammarAccess.getExtraDataAccess().getTypeSimpleTypeEnumEnumRuleCall_4_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSimpleTypeEnum_in_rule__ExtraData__TypeAssignment_4_26469);
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
        public static final BitSet FOLLOW_rule__IntentModel__Group__0__Impl_in_rule__IntentModel__Group__0920 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_rule__IntentModel__Group__1_in_rule__IntentModel__Group__0923 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntentModel__Group__1__Impl_in_rule__IntentModel__Group__1981 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_rule__IntentModel__Group__2_in_rule__IntentModel__Group__1984 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntentModel__NameAssignment_1_in_rule__IntentModel__Group__1__Impl1011 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntentModel__Group__2__Impl_in_rule__IntentModel__Group__21041 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__IntentModel__Group__3_in_rule__IntentModel__Group__21044 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__IntentModel__Group__2__Impl1072 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntentModel__Group__3__Impl_in_rule__IntentModel__Group__31103 = new BitSet(new long[]{0x0000000000C00000L});
        public static final BitSet FOLLOW_rule__IntentModel__Group__4_in_rule__IntentModel__Group__31106 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__IntentModel__Group__3__Impl1134 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntentModel__Group__4__Impl_in_rule__IntentModel__Group__41165 = new BitSet(new long[]{0x0000000000C00000L});
        public static final BitSet FOLLOW_rule__IntentModel__Group__5_in_rule__IntentModel__Group__41168 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntentModel__Group_4__0_in_rule__IntentModel__Group__4__Impl1195 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntentModel__Group__5__Impl_in_rule__IntentModel__Group__51226 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__IntentModel__Group__5__Impl1254 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntentModel__Group_4__0__Impl_in_rule__IntentModel__Group_4__01297 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__IntentModel__Group_4__1_in_rule__IntentModel__Group_4__01300 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__IntentModel__Group_4__0__Impl1328 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntentModel__Group_4__1__Impl_in_rule__IntentModel__Group_4__11359 = new BitSet(new long[]{0x0000000003000000L});
        public static final BitSet FOLLOW_rule__IntentModel__Group_4__2_in_rule__IntentModel__Group_4__11362 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntentModel__IntentsAssignment_4_1_in_rule__IntentModel__Group_4__1__Impl1389 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntentModel__Group_4__2__Impl_in_rule__IntentModel__Group_4__21419 = new BitSet(new long[]{0x0000000003000000L});
        public static final BitSet FOLLOW_rule__IntentModel__Group_4__3_in_rule__IntentModel__Group_4__21422 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntentModel__Group_4_2__0_in_rule__IntentModel__Group_4__2__Impl1449 = new BitSet(new long[]{0x0000000002000002L});
        public static final BitSet FOLLOW_rule__IntentModel__Group_4__3__Impl_in_rule__IntentModel__Group_4__31480 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__IntentModel__Group_4__3__Impl1508 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntentModel__Group_4_2__0__Impl_in_rule__IntentModel__Group_4_2__01547 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__IntentModel__Group_4_2__1_in_rule__IntentModel__Group_4_2__01550 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__IntentModel__Group_4_2__0__Impl1578 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntentModel__Group_4_2__1__Impl_in_rule__IntentModel__Group_4_2__11609 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntentModel__IntentsAssignment_4_2_1_in_rule__IntentModel__Group_4_2__1__Impl1636 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group__0__Impl_in_rule__Intent__Group__01670 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__Intent__Group__1_in_rule__Intent__Group__01673 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__Intent__Group__0__Impl1701 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group__1__Impl_in_rule__Intent__Group__11732 = new BitSet(new long[]{0x0000007800000000L});
        public static final BitSet FOLLOW_rule__Intent__Group__2_in_rule__Intent__Group__11735 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__Intent__Group__1__Impl1763 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group__2__Impl_in_rule__Intent__Group__21794 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__Intent__Group__3_in_rule__Intent__Group__21797 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Alternatives_2_in_rule__Intent__Group__2__Impl1824 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group__3__Impl_in_rule__Intent__Group__31854 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_rule__Intent__Group__4_in_rule__Intent__Group__31857 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Intent__Group__3__Impl1885 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group__4__Impl_in_rule__Intent__Group__41916 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4__0_in_rule__Intent__Group__4__Impl1943 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4__0__Impl_in_rule__Intent__Group_4__01983 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_rule__Intent__Group_4__1_in_rule__Intent__Group_4__01986 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_0__0_in_rule__Intent__Group_4__0__Impl2013 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4__1__Impl_in_rule__Intent__Group_4__12043 = new BitSet(new long[]{0x00000000C0000000L});
        public static final BitSet FOLLOW_rule__Intent__Group_4__2_in_rule__Intent__Group_4__12046 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_1__0_in_rule__Intent__Group_4__1__Impl2073 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4__2__Impl_in_rule__Intent__Group_4__22103 = new BitSet(new long[]{0x00000000C0000000L});
        public static final BitSet FOLLOW_rule__Intent__Group_4__3_in_rule__Intent__Group_4__22106 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_2__0_in_rule__Intent__Group_4__2__Impl2133 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4__3__Impl_in_rule__Intent__Group_4__32164 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_rule__Intent__Group_4__4_in_rule__Intent__Group_4__32167 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_3__0_in_rule__Intent__Group_4__3__Impl2194 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4__4__Impl_in_rule__Intent__Group_4__42224 = new BitSet(new long[]{0x0000000600000000L});
        public static final BitSet FOLLOW_rule__Intent__Group_4__5_in_rule__Intent__Group_4__42227 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_4__0_in_rule__Intent__Group_4__4__Impl2254 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4__5__Impl_in_rule__Intent__Group_4__52284 = new BitSet(new long[]{0x0000000600000000L});
        public static final BitSet FOLLOW_rule__Intent__Group_4__6_in_rule__Intent__Group_4__52287 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_5__0_in_rule__Intent__Group_4__5__Impl2314 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4__6__Impl_in_rule__Intent__Group_4__62345 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_6__0_in_rule__Intent__Group_4__6__Impl2372 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_0__0__Impl_in_rule__Intent__Group_4_0__02417 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_0__1_in_rule__Intent__Group_4_0__02420 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__Intent__Group_4_0__0__Impl2448 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_0__1__Impl_in_rule__Intent__Group_4_0__12479 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_0__2_in_rule__Intent__Group_4_0__12482 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__Intent__Group_4_0__1__Impl2510 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_0__2__Impl_in_rule__Intent__Group_4_0__22541 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_0__3_in_rule__Intent__Group_4_0__22544 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__NameAssignment_4_0_2_in_rule__Intent__Group_4_0__2__Impl2571 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_0__3__Impl_in_rule__Intent__Group_4_0__32601 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Intent__Group_4_0__3__Impl2629 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_1__0__Impl_in_rule__Intent__Group_4_1__02668 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_1__1_in_rule__Intent__Group_4_1__02671 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__Intent__Group_4_1__0__Impl2699 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_1__1__Impl_in_rule__Intent__Group_4_1__12730 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_1__2_in_rule__Intent__Group_4_1__12733 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__Intent__Group_4_1__1__Impl2761 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_1__2__Impl_in_rule__Intent__Group_4_1__22792 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_1__3_in_rule__Intent__Group_4_1__22795 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__ActionAssignment_4_1_2_in_rule__Intent__Group_4_1__2__Impl2822 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_1__3__Impl_in_rule__Intent__Group_4_1__32852 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Intent__Group_4_1__3__Impl2880 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_2__0__Impl_in_rule__Intent__Group_4_2__02919 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_2__1_in_rule__Intent__Group_4_2__02922 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__Intent__Group_4_2__0__Impl2950 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_2__1__Impl_in_rule__Intent__Group_4_2__12981 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_2__2_in_rule__Intent__Group_4_2__12984 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__Intent__Group_4_2__1__Impl3012 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_2__2__Impl_in_rule__Intent__Group_4_2__23043 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_2__3_in_rule__Intent__Group_4_2__23046 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__CategoryAssignment_4_2_2_in_rule__Intent__Group_4_2__2__Impl3073 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_2__3__Impl_in_rule__Intent__Group_4_2__33103 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Intent__Group_4_2__3__Impl3131 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_3__0__Impl_in_rule__Intent__Group_4_3__03170 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_3__1_in_rule__Intent__Group_4_3__03173 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__Intent__Group_4_3__0__Impl3201 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_3__1__Impl_in_rule__Intent__Group_4_3__13232 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_3__2_in_rule__Intent__Group_4_3__13235 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__Intent__Group_4_3__1__Impl3263 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_3__2__Impl_in_rule__Intent__Group_4_3__23294 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_3__3_in_rule__Intent__Group_4_3__23297 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__MetaCategoryAssignment_4_3_2_in_rule__Intent__Group_4_3__2__Impl3324 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_3__3__Impl_in_rule__Intent__Group_4_3__33354 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Intent__Group_4_3__3__Impl3382 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_4__0__Impl_in_rule__Intent__Group_4_4__03421 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_4__1_in_rule__Intent__Group_4_4__03424 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__Intent__Group_4_4__0__Impl3452 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_4__1__Impl_in_rule__Intent__Group_4_4__13483 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_4__2_in_rule__Intent__Group_4_4__13486 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__Intent__Group_4_4__1__Impl3514 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_4__2__Impl_in_rule__Intent__Group_4_4__23545 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_4__3_in_rule__Intent__Group_4_4__23548 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__DataURIAssignment_4_4_2_in_rule__Intent__Group_4_4__2__Impl3575 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_4__3__Impl_in_rule__Intent__Group_4_4__33605 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Intent__Group_4_4__3__Impl3633 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_5__0__Impl_in_rule__Intent__Group_4_5__03672 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_5__1_in_rule__Intent__Group_4_5__03675 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__Intent__Group_4_5__0__Impl3703 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_5__1__Impl_in_rule__Intent__Group_4_5__13734 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_5__2_in_rule__Intent__Group_4_5__13737 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__Intent__Group_4_5__1__Impl3765 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_5__2__Impl_in_rule__Intent__Group_4_5__23796 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_5__3_in_rule__Intent__Group_4_5__23799 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__Intent__Group_4_5__2__Impl3827 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_5__3__Impl_in_rule__Intent__Group_4_5__33858 = new BitSet(new long[]{0x0000000002400000L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_5__4_in_rule__Intent__Group_4_5__33861 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__ExtraDataAssignment_4_5_3_in_rule__Intent__Group_4_5__3__Impl3888 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_5__4__Impl_in_rule__Intent__Group_4_5__43918 = new BitSet(new long[]{0x0000000002400000L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_5__5_in_rule__Intent__Group_4_5__43921 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_5_4__0_in_rule__Intent__Group_4_5__4__Impl3948 = new BitSet(new long[]{0x0000000002000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_5__5__Impl_in_rule__Intent__Group_4_5__53979 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_5__6_in_rule__Intent__Group_4_5__53982 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__Intent__Group_4_5__5__Impl4010 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_5__6__Impl_in_rule__Intent__Group_4_5__64041 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Intent__Group_4_5__6__Impl4069 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_5_4__0__Impl_in_rule__Intent__Group_4_5_4__04114 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_5_4__1_in_rule__Intent__Group_4_5_4__04117 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Intent__Group_4_5_4__0__Impl4145 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_5_4__1__Impl_in_rule__Intent__Group_4_5_4__14176 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__ExtraDataAssignment_4_5_4_1_in_rule__Intent__Group_4_5_4__1__Impl4203 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_6__0__Impl_in_rule__Intent__Group_4_6__04237 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_6__1_in_rule__Intent__Group_4_6__04240 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__Intent__Group_4_6__0__Impl4268 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_6__1__Impl_in_rule__Intent__Group_4_6__14299 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_6__2_in_rule__Intent__Group_4_6__14302 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__Intent__Group_4_6__1__Impl4330 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_6__2__Impl_in_rule__Intent__Group_4_6__24361 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_6__3_in_rule__Intent__Group_4_6__24364 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__Intent__Group_4_6__2__Impl4392 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_6__3__Impl_in_rule__Intent__Group_4_6__34423 = new BitSet(new long[]{0x0000000002400000L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_6__4_in_rule__Intent__Group_4_6__34426 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__ReturnDataAssignment_4_6_3_in_rule__Intent__Group_4_6__3__Impl4453 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_6__4__Impl_in_rule__Intent__Group_4_6__44483 = new BitSet(new long[]{0x0000000002400000L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_6__5_in_rule__Intent__Group_4_6__44486 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_6_4__0_in_rule__Intent__Group_4_6__4__Impl4513 = new BitSet(new long[]{0x0000000002000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_6__5__Impl_in_rule__Intent__Group_4_6__54544 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_6__6_in_rule__Intent__Group_4_6__54547 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__Intent__Group_4_6__5__Impl4575 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_6__6__Impl_in_rule__Intent__Group_4_6__64606 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Intent__Group_4_6__6__Impl4634 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_6_4__0__Impl_in_rule__Intent__Group_4_6_4__04679 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_6_4__1_in_rule__Intent__Group_4_6_4__04682 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Intent__Group_4_6_4__0__Impl4710 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_6_4__1__Impl_in_rule__Intent__Group_4_6_4__14741 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__ReturnDataAssignment_4_6_4_1_in_rule__Intent__Group_4_6_4__1__Impl4768 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtraData__Group__0__Impl_in_rule__ExtraData__Group__04802 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__ExtraData__Group__1_in_rule__ExtraData__Group__04805 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtraData__Group__1__Impl_in_rule__ExtraData__Group__14863 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_rule__ExtraData__Group__2_in_rule__ExtraData__Group__14866 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__ExtraData__Group__1__Impl4894 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtraData__Group__2__Impl_in_rule__ExtraData__Group__24925 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__ExtraData__Group__3_in_rule__ExtraData__Group__24928 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtraData__Group_2__0_in_rule__ExtraData__Group__2__Impl4955 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtraData__Group__3__Impl_in_rule__ExtraData__Group__34985 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__ExtraData__Group__4_in_rule__ExtraData__Group__34988 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__ExtraData__Group__3__Impl5016 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtraData__Group__4__Impl_in_rule__ExtraData__Group__45047 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__ExtraData__Group__5_in_rule__ExtraData__Group__45050 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtraData__Group_4__0_in_rule__ExtraData__Group__4__Impl5077 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtraData__Group__5__Impl_in_rule__ExtraData__Group__55107 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__ExtraData__Group__5__Impl5135 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtraData__Group_2__0__Impl_in_rule__ExtraData__Group_2__05178 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__ExtraData__Group_2__1_in_rule__ExtraData__Group_2__05181 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__ExtraData__Group_2__0__Impl5209 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtraData__Group_2__1__Impl_in_rule__ExtraData__Group_2__15240 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__ExtraData__Group_2__2_in_rule__ExtraData__Group_2__15243 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__ExtraData__Group_2__1__Impl5271 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtraData__Group_2__2__Impl_in_rule__ExtraData__Group_2__25302 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtraData__NameAssignment_2_2_in_rule__ExtraData__Group_2__2__Impl5329 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtraData__Group_4__0__Impl_in_rule__ExtraData__Group_4__05365 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__ExtraData__Group_4__1_in_rule__ExtraData__Group_4__05368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__ExtraData__Group_4__0__Impl5396 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtraData__Group_4__1__Impl_in_rule__ExtraData__Group_4__15427 = new BitSet(new long[]{0x00000000000FF800L});
        public static final BitSet FOLLOW_rule__ExtraData__Group_4__2_in_rule__ExtraData__Group_4__15430 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__ExtraData__Group_4__1__Impl5458 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtraData__Group_4__2__Impl_in_rule__ExtraData__Group_4__25489 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtraData__TypeAssignment_4_2_in_rule__ExtraData__Group_4__2__Impl5516 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExplicitIntent__Group__0__Impl_in_rule__ExplicitIntent__Group__05552 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_rule__ExplicitIntent__Group__1_in_rule__ExplicitIntent__Group__05555 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExplicitIntent__Group__1__Impl_in_rule__ExplicitIntent__Group__15613 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__ExplicitIntent__Group__1__Impl5641 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ImplicitIntent__Group__0__Impl_in_rule__ImplicitIntent__Group__05676 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_rule__ImplicitIntent__Group__1_in_rule__ImplicitIntent__Group__05679 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ImplicitIntent__Group__1__Impl_in_rule__ImplicitIntent__Group__15737 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__ImplicitIntent__Group__1__Impl5765 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BroadcastIntent__Group__0__Impl_in_rule__BroadcastIntent__Group__05800 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_rule__BroadcastIntent__Group__1_in_rule__BroadcastIntent__Group__05803 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BroadcastIntent__Group__1__Impl_in_rule__BroadcastIntent__Group__15861 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_rule__BroadcastIntent__Group__1__Impl5889 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ServiceIntent__Group__0__Impl_in_rule__ServiceIntent__Group__05924 = new BitSet(new long[]{0x0000007800000000L});
        public static final BitSet FOLLOW_rule__ServiceIntent__Group__1_in_rule__ServiceIntent__Group__05927 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ServiceIntent__Group__1__Impl_in_rule__ServiceIntent__Group__15985 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_rule__ServiceIntent__Group__1__Impl6013 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_rule__IntentModel__NameAssignment_16058 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIntent_in_rule__IntentModel__IntentsAssignment_4_16097 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIntent_in_rule__IntentModel__IntentsAssignment_4_2_16128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Intent__NameAssignment_4_0_26159 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Intent__ActionAssignment_4_1_26190 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Intent__CategoryAssignment_4_2_26221 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Intent__MetaCategoryAssignment_4_3_26252 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Intent__DataURIAssignment_4_4_26283 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExtraData_in_rule__Intent__ExtraDataAssignment_4_5_36314 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExtraData_in_rule__Intent__ExtraDataAssignment_4_5_4_16345 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExtraData_in_rule__Intent__ReturnDataAssignment_4_6_36376 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExtraData_in_rule__Intent__ReturnDataAssignment_4_6_4_16407 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__ExtraData__NameAssignment_2_26438 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSimpleTypeEnum_in_rule__ExtraData__TypeAssignment_4_26469 = new BitSet(new long[]{0x0000000000000002L});
    }


}