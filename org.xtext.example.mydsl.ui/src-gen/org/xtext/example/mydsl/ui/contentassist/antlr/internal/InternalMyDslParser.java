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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'boolean'", "'Bundle'", "'byte'", "'double'", "'float'", "'integer'", "'long'", "'short'", "'String'", "'='", "'['", "'{'", "'}'", "']'", "','", "'Type'", "':'", "'Name'", "'Action'", "'Category'", "'Meta-Category'", "'DataURI'", "'DataExtra'", "'ReturnData'", "'\\'ExplicitIntent\\''", "'\\'ImplicitIntent\\''", "'\\'BroadcastIntent\\''", "'\\'ServiceIntent\\''", "'Model'"
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1141:1: rule__Intent__Group_4__4__Impl : ( ( rule__Intent__Group_4_4__0 ) ) ;
    public final void rule__Intent__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1145:1: ( ( ( rule__Intent__Group_4_4__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1146:1: ( ( rule__Intent__Group_4_4__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1146:1: ( ( rule__Intent__Group_4_4__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1147:1: ( rule__Intent__Group_4_4__0 )
            {
             before(grammarAccess.getIntentAccess().getGroup_4_4()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1148:1: ( rule__Intent__Group_4_4__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1148:2: rule__Intent__Group_4_4__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_4__0_in_rule__Intent__Group_4__4__Impl2322);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1158:1: rule__Intent__Group_4__5 : rule__Intent__Group_4__5__Impl rule__Intent__Group_4__6 ;
    public final void rule__Intent__Group_4__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1162:1: ( rule__Intent__Group_4__5__Impl rule__Intent__Group_4__6 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1163:2: rule__Intent__Group_4__5__Impl rule__Intent__Group_4__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4__5__Impl_in_rule__Intent__Group_4__52352);
            rule__Intent__Group_4__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4__6_in_rule__Intent__Group_4__52355);
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
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==33) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1177:2: rule__Intent__Group_4_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_5__0_in_rule__Intent__Group_4__5__Impl2382);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1187:1: rule__Intent__Group_4__6 : rule__Intent__Group_4__6__Impl ;
    public final void rule__Intent__Group_4__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1191:1: ( rule__Intent__Group_4__6__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1192:2: rule__Intent__Group_4__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4__6__Impl_in_rule__Intent__Group_4__62413);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1198:1: rule__Intent__Group_4__6__Impl : ( ( rule__Intent__Group_4_6__0 )? ) ;
    public final void rule__Intent__Group_4__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1202:1: ( ( ( rule__Intent__Group_4_6__0 )? ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1203:1: ( ( rule__Intent__Group_4_6__0 )? )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1203:1: ( ( rule__Intent__Group_4_6__0 )? )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1204:1: ( rule__Intent__Group_4_6__0 )?
            {
             before(grammarAccess.getIntentAccess().getGroup_4_6()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1205:1: ( rule__Intent__Group_4_6__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==34) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1205:2: rule__Intent__Group_4_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_6__0_in_rule__Intent__Group_4__6__Impl2440);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1229:1: rule__Intent__Group_4_0__0 : rule__Intent__Group_4_0__0__Impl rule__Intent__Group_4_0__1 ;
    public final void rule__Intent__Group_4_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1233:1: ( rule__Intent__Group_4_0__0__Impl rule__Intent__Group_4_0__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1234:2: rule__Intent__Group_4_0__0__Impl rule__Intent__Group_4_0__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_0__0__Impl_in_rule__Intent__Group_4_0__02485);
            rule__Intent__Group_4_0__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_0__1_in_rule__Intent__Group_4_0__02488);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1241:1: rule__Intent__Group_4_0__0__Impl : ( 'Name' ) ;
    public final void rule__Intent__Group_4_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1245:1: ( ( 'Name' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1246:1: ( 'Name' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1246:1: ( 'Name' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1247:1: 'Name'
            {
             before(grammarAccess.getIntentAccess().getNameKeyword_4_0_0()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__Intent__Group_4_0__0__Impl2516); 
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1260:1: rule__Intent__Group_4_0__1 : rule__Intent__Group_4_0__1__Impl rule__Intent__Group_4_0__2 ;
    public final void rule__Intent__Group_4_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1264:1: ( rule__Intent__Group_4_0__1__Impl rule__Intent__Group_4_0__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1265:2: rule__Intent__Group_4_0__1__Impl rule__Intent__Group_4_0__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_0__1__Impl_in_rule__Intent__Group_4_0__12547);
            rule__Intent__Group_4_0__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_0__2_in_rule__Intent__Group_4_0__12550);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1272:1: rule__Intent__Group_4_0__1__Impl : ( ':' ) ;
    public final void rule__Intent__Group_4_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1276:1: ( ( ':' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1277:1: ( ':' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1277:1: ( ':' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1278:1: ':'
            {
             before(grammarAccess.getIntentAccess().getColonKeyword_4_0_1()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__Intent__Group_4_0__1__Impl2578); 
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1291:1: rule__Intent__Group_4_0__2 : rule__Intent__Group_4_0__2__Impl rule__Intent__Group_4_0__3 ;
    public final void rule__Intent__Group_4_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1295:1: ( rule__Intent__Group_4_0__2__Impl rule__Intent__Group_4_0__3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1296:2: rule__Intent__Group_4_0__2__Impl rule__Intent__Group_4_0__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_0__2__Impl_in_rule__Intent__Group_4_0__22609);
            rule__Intent__Group_4_0__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_0__3_in_rule__Intent__Group_4_0__22612);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1303:1: rule__Intent__Group_4_0__2__Impl : ( ( rule__Intent__NameAssignment_4_0_2 ) ) ;
    public final void rule__Intent__Group_4_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1307:1: ( ( ( rule__Intent__NameAssignment_4_0_2 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1308:1: ( ( rule__Intent__NameAssignment_4_0_2 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1308:1: ( ( rule__Intent__NameAssignment_4_0_2 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1309:1: ( rule__Intent__NameAssignment_4_0_2 )
            {
             before(grammarAccess.getIntentAccess().getNameAssignment_4_0_2()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1310:1: ( rule__Intent__NameAssignment_4_0_2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1310:2: rule__Intent__NameAssignment_4_0_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__NameAssignment_4_0_2_in_rule__Intent__Group_4_0__2__Impl2639);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1320:1: rule__Intent__Group_4_0__3 : rule__Intent__Group_4_0__3__Impl ;
    public final void rule__Intent__Group_4_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1324:1: ( rule__Intent__Group_4_0__3__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1325:2: rule__Intent__Group_4_0__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_0__3__Impl_in_rule__Intent__Group_4_0__32669);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1331:1: rule__Intent__Group_4_0__3__Impl : ( ',' ) ;
    public final void rule__Intent__Group_4_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1335:1: ( ( ',' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1336:1: ( ',' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1336:1: ( ',' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1337:1: ','
            {
             before(grammarAccess.getIntentAccess().getCommaKeyword_4_0_3()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Intent__Group_4_0__3__Impl2697); 
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1358:1: rule__Intent__Group_4_1__0 : rule__Intent__Group_4_1__0__Impl rule__Intent__Group_4_1__1 ;
    public final void rule__Intent__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1362:1: ( rule__Intent__Group_4_1__0__Impl rule__Intent__Group_4_1__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1363:2: rule__Intent__Group_4_1__0__Impl rule__Intent__Group_4_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_1__0__Impl_in_rule__Intent__Group_4_1__02736);
            rule__Intent__Group_4_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_1__1_in_rule__Intent__Group_4_1__02739);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1370:1: rule__Intent__Group_4_1__0__Impl : ( 'Action' ) ;
    public final void rule__Intent__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1374:1: ( ( 'Action' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1375:1: ( 'Action' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1375:1: ( 'Action' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1376:1: 'Action'
            {
             before(grammarAccess.getIntentAccess().getActionKeyword_4_1_0()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__Intent__Group_4_1__0__Impl2767); 
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1389:1: rule__Intent__Group_4_1__1 : rule__Intent__Group_4_1__1__Impl rule__Intent__Group_4_1__2 ;
    public final void rule__Intent__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1393:1: ( rule__Intent__Group_4_1__1__Impl rule__Intent__Group_4_1__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1394:2: rule__Intent__Group_4_1__1__Impl rule__Intent__Group_4_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_1__1__Impl_in_rule__Intent__Group_4_1__12798);
            rule__Intent__Group_4_1__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_1__2_in_rule__Intent__Group_4_1__12801);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1401:1: rule__Intent__Group_4_1__1__Impl : ( ':' ) ;
    public final void rule__Intent__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1405:1: ( ( ':' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1406:1: ( ':' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1406:1: ( ':' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1407:1: ':'
            {
             before(grammarAccess.getIntentAccess().getColonKeyword_4_1_1()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__Intent__Group_4_1__1__Impl2829); 
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1420:1: rule__Intent__Group_4_1__2 : rule__Intent__Group_4_1__2__Impl rule__Intent__Group_4_1__3 ;
    public final void rule__Intent__Group_4_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1424:1: ( rule__Intent__Group_4_1__2__Impl rule__Intent__Group_4_1__3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1425:2: rule__Intent__Group_4_1__2__Impl rule__Intent__Group_4_1__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_1__2__Impl_in_rule__Intent__Group_4_1__22860);
            rule__Intent__Group_4_1__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_1__3_in_rule__Intent__Group_4_1__22863);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1432:1: rule__Intent__Group_4_1__2__Impl : ( ( rule__Intent__ActionAssignment_4_1_2 ) ) ;
    public final void rule__Intent__Group_4_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1436:1: ( ( ( rule__Intent__ActionAssignment_4_1_2 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1437:1: ( ( rule__Intent__ActionAssignment_4_1_2 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1437:1: ( ( rule__Intent__ActionAssignment_4_1_2 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1438:1: ( rule__Intent__ActionAssignment_4_1_2 )
            {
             before(grammarAccess.getIntentAccess().getActionAssignment_4_1_2()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1439:1: ( rule__Intent__ActionAssignment_4_1_2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1439:2: rule__Intent__ActionAssignment_4_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__ActionAssignment_4_1_2_in_rule__Intent__Group_4_1__2__Impl2890);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1449:1: rule__Intent__Group_4_1__3 : rule__Intent__Group_4_1__3__Impl ;
    public final void rule__Intent__Group_4_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1453:1: ( rule__Intent__Group_4_1__3__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1454:2: rule__Intent__Group_4_1__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_1__3__Impl_in_rule__Intent__Group_4_1__32920);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1460:1: rule__Intent__Group_4_1__3__Impl : ( ',' ) ;
    public final void rule__Intent__Group_4_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1464:1: ( ( ',' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1465:1: ( ',' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1465:1: ( ',' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1466:1: ','
            {
             before(grammarAccess.getIntentAccess().getCommaKeyword_4_1_3()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Intent__Group_4_1__3__Impl2948); 
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1487:1: rule__Intent__Group_4_2__0 : rule__Intent__Group_4_2__0__Impl rule__Intent__Group_4_2__1 ;
    public final void rule__Intent__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1491:1: ( rule__Intent__Group_4_2__0__Impl rule__Intent__Group_4_2__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1492:2: rule__Intent__Group_4_2__0__Impl rule__Intent__Group_4_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_2__0__Impl_in_rule__Intent__Group_4_2__02987);
            rule__Intent__Group_4_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_2__1_in_rule__Intent__Group_4_2__02990);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1499:1: rule__Intent__Group_4_2__0__Impl : ( 'Category' ) ;
    public final void rule__Intent__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1503:1: ( ( 'Category' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1504:1: ( 'Category' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1504:1: ( 'Category' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1505:1: 'Category'
            {
             before(grammarAccess.getIntentAccess().getCategoryKeyword_4_2_0()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__Intent__Group_4_2__0__Impl3018); 
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1518:1: rule__Intent__Group_4_2__1 : rule__Intent__Group_4_2__1__Impl rule__Intent__Group_4_2__2 ;
    public final void rule__Intent__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1522:1: ( rule__Intent__Group_4_2__1__Impl rule__Intent__Group_4_2__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1523:2: rule__Intent__Group_4_2__1__Impl rule__Intent__Group_4_2__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_2__1__Impl_in_rule__Intent__Group_4_2__13049);
            rule__Intent__Group_4_2__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_2__2_in_rule__Intent__Group_4_2__13052);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1530:1: rule__Intent__Group_4_2__1__Impl : ( ':' ) ;
    public final void rule__Intent__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1534:1: ( ( ':' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1535:1: ( ':' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1535:1: ( ':' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1536:1: ':'
            {
             before(grammarAccess.getIntentAccess().getColonKeyword_4_2_1()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__Intent__Group_4_2__1__Impl3080); 
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1549:1: rule__Intent__Group_4_2__2 : rule__Intent__Group_4_2__2__Impl rule__Intent__Group_4_2__3 ;
    public final void rule__Intent__Group_4_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1553:1: ( rule__Intent__Group_4_2__2__Impl rule__Intent__Group_4_2__3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1554:2: rule__Intent__Group_4_2__2__Impl rule__Intent__Group_4_2__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_2__2__Impl_in_rule__Intent__Group_4_2__23111);
            rule__Intent__Group_4_2__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_2__3_in_rule__Intent__Group_4_2__23114);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1561:1: rule__Intent__Group_4_2__2__Impl : ( ( rule__Intent__CategoryAssignment_4_2_2 ) ) ;
    public final void rule__Intent__Group_4_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1565:1: ( ( ( rule__Intent__CategoryAssignment_4_2_2 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1566:1: ( ( rule__Intent__CategoryAssignment_4_2_2 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1566:1: ( ( rule__Intent__CategoryAssignment_4_2_2 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1567:1: ( rule__Intent__CategoryAssignment_4_2_2 )
            {
             before(grammarAccess.getIntentAccess().getCategoryAssignment_4_2_2()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1568:1: ( rule__Intent__CategoryAssignment_4_2_2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1568:2: rule__Intent__CategoryAssignment_4_2_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__CategoryAssignment_4_2_2_in_rule__Intent__Group_4_2__2__Impl3141);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1578:1: rule__Intent__Group_4_2__3 : rule__Intent__Group_4_2__3__Impl ;
    public final void rule__Intent__Group_4_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1582:1: ( rule__Intent__Group_4_2__3__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1583:2: rule__Intent__Group_4_2__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_2__3__Impl_in_rule__Intent__Group_4_2__33171);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1589:1: rule__Intent__Group_4_2__3__Impl : ( ',' ) ;
    public final void rule__Intent__Group_4_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1593:1: ( ( ',' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1594:1: ( ',' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1594:1: ( ',' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1595:1: ','
            {
             before(grammarAccess.getIntentAccess().getCommaKeyword_4_2_3()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Intent__Group_4_2__3__Impl3199); 
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1616:1: rule__Intent__Group_4_3__0 : rule__Intent__Group_4_3__0__Impl rule__Intent__Group_4_3__1 ;
    public final void rule__Intent__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1620:1: ( rule__Intent__Group_4_3__0__Impl rule__Intent__Group_4_3__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1621:2: rule__Intent__Group_4_3__0__Impl rule__Intent__Group_4_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_3__0__Impl_in_rule__Intent__Group_4_3__03238);
            rule__Intent__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_3__1_in_rule__Intent__Group_4_3__03241);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1628:1: rule__Intent__Group_4_3__0__Impl : ( 'Meta-Category' ) ;
    public final void rule__Intent__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1632:1: ( ( 'Meta-Category' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1633:1: ( 'Meta-Category' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1633:1: ( 'Meta-Category' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1634:1: 'Meta-Category'
            {
             before(grammarAccess.getIntentAccess().getMetaCategoryKeyword_4_3_0()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__Intent__Group_4_3__0__Impl3269); 
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1647:1: rule__Intent__Group_4_3__1 : rule__Intent__Group_4_3__1__Impl rule__Intent__Group_4_3__2 ;
    public final void rule__Intent__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1651:1: ( rule__Intent__Group_4_3__1__Impl rule__Intent__Group_4_3__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1652:2: rule__Intent__Group_4_3__1__Impl rule__Intent__Group_4_3__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_3__1__Impl_in_rule__Intent__Group_4_3__13300);
            rule__Intent__Group_4_3__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_3__2_in_rule__Intent__Group_4_3__13303);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1659:1: rule__Intent__Group_4_3__1__Impl : ( ':' ) ;
    public final void rule__Intent__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1663:1: ( ( ':' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1664:1: ( ':' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1664:1: ( ':' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1665:1: ':'
            {
             before(grammarAccess.getIntentAccess().getColonKeyword_4_3_1()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__Intent__Group_4_3__1__Impl3331); 
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1678:1: rule__Intent__Group_4_3__2 : rule__Intent__Group_4_3__2__Impl rule__Intent__Group_4_3__3 ;
    public final void rule__Intent__Group_4_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1682:1: ( rule__Intent__Group_4_3__2__Impl rule__Intent__Group_4_3__3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1683:2: rule__Intent__Group_4_3__2__Impl rule__Intent__Group_4_3__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_3__2__Impl_in_rule__Intent__Group_4_3__23362);
            rule__Intent__Group_4_3__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_3__3_in_rule__Intent__Group_4_3__23365);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1690:1: rule__Intent__Group_4_3__2__Impl : ( ( rule__Intent__MetaCategoryAssignment_4_3_2 ) ) ;
    public final void rule__Intent__Group_4_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1694:1: ( ( ( rule__Intent__MetaCategoryAssignment_4_3_2 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1695:1: ( ( rule__Intent__MetaCategoryAssignment_4_3_2 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1695:1: ( ( rule__Intent__MetaCategoryAssignment_4_3_2 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1696:1: ( rule__Intent__MetaCategoryAssignment_4_3_2 )
            {
             before(grammarAccess.getIntentAccess().getMetaCategoryAssignment_4_3_2()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1697:1: ( rule__Intent__MetaCategoryAssignment_4_3_2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1697:2: rule__Intent__MetaCategoryAssignment_4_3_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__MetaCategoryAssignment_4_3_2_in_rule__Intent__Group_4_3__2__Impl3392);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1707:1: rule__Intent__Group_4_3__3 : rule__Intent__Group_4_3__3__Impl ;
    public final void rule__Intent__Group_4_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1711:1: ( rule__Intent__Group_4_3__3__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1712:2: rule__Intent__Group_4_3__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_3__3__Impl_in_rule__Intent__Group_4_3__33422);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1718:1: rule__Intent__Group_4_3__3__Impl : ( ',' ) ;
    public final void rule__Intent__Group_4_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1722:1: ( ( ',' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1723:1: ( ',' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1723:1: ( ',' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1724:1: ','
            {
             before(grammarAccess.getIntentAccess().getCommaKeyword_4_3_3()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Intent__Group_4_3__3__Impl3450); 
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1745:1: rule__Intent__Group_4_4__0 : rule__Intent__Group_4_4__0__Impl rule__Intent__Group_4_4__1 ;
    public final void rule__Intent__Group_4_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1749:1: ( rule__Intent__Group_4_4__0__Impl rule__Intent__Group_4_4__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1750:2: rule__Intent__Group_4_4__0__Impl rule__Intent__Group_4_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_4__0__Impl_in_rule__Intent__Group_4_4__03489);
            rule__Intent__Group_4_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_4__1_in_rule__Intent__Group_4_4__03492);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1757:1: rule__Intent__Group_4_4__0__Impl : ( 'DataURI' ) ;
    public final void rule__Intent__Group_4_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1761:1: ( ( 'DataURI' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1762:1: ( 'DataURI' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1762:1: ( 'DataURI' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1763:1: 'DataURI'
            {
             before(grammarAccess.getIntentAccess().getDataURIKeyword_4_4_0()); 
            match(input,32,FollowSets000.FOLLOW_32_in_rule__Intent__Group_4_4__0__Impl3520); 
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1776:1: rule__Intent__Group_4_4__1 : rule__Intent__Group_4_4__1__Impl rule__Intent__Group_4_4__2 ;
    public final void rule__Intent__Group_4_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1780:1: ( rule__Intent__Group_4_4__1__Impl rule__Intent__Group_4_4__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1781:2: rule__Intent__Group_4_4__1__Impl rule__Intent__Group_4_4__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_4__1__Impl_in_rule__Intent__Group_4_4__13551);
            rule__Intent__Group_4_4__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_4__2_in_rule__Intent__Group_4_4__13554);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1788:1: rule__Intent__Group_4_4__1__Impl : ( ':' ) ;
    public final void rule__Intent__Group_4_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1792:1: ( ( ':' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1793:1: ( ':' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1793:1: ( ':' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1794:1: ':'
            {
             before(grammarAccess.getIntentAccess().getColonKeyword_4_4_1()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__Intent__Group_4_4__1__Impl3582); 
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1807:1: rule__Intent__Group_4_4__2 : rule__Intent__Group_4_4__2__Impl rule__Intent__Group_4_4__3 ;
    public final void rule__Intent__Group_4_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1811:1: ( rule__Intent__Group_4_4__2__Impl rule__Intent__Group_4_4__3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1812:2: rule__Intent__Group_4_4__2__Impl rule__Intent__Group_4_4__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_4__2__Impl_in_rule__Intent__Group_4_4__23613);
            rule__Intent__Group_4_4__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_4__3_in_rule__Intent__Group_4_4__23616);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1819:1: rule__Intent__Group_4_4__2__Impl : ( ( rule__Intent__DataURIAssignment_4_4_2 ) ) ;
    public final void rule__Intent__Group_4_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1823:1: ( ( ( rule__Intent__DataURIAssignment_4_4_2 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1824:1: ( ( rule__Intent__DataURIAssignment_4_4_2 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1824:1: ( ( rule__Intent__DataURIAssignment_4_4_2 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1825:1: ( rule__Intent__DataURIAssignment_4_4_2 )
            {
             before(grammarAccess.getIntentAccess().getDataURIAssignment_4_4_2()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1826:1: ( rule__Intent__DataURIAssignment_4_4_2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1826:2: rule__Intent__DataURIAssignment_4_4_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__DataURIAssignment_4_4_2_in_rule__Intent__Group_4_4__2__Impl3643);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1836:1: rule__Intent__Group_4_4__3 : rule__Intent__Group_4_4__3__Impl ;
    public final void rule__Intent__Group_4_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1840:1: ( rule__Intent__Group_4_4__3__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1841:2: rule__Intent__Group_4_4__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_4__3__Impl_in_rule__Intent__Group_4_4__33673);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1847:1: rule__Intent__Group_4_4__3__Impl : ( ',' ) ;
    public final void rule__Intent__Group_4_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1851:1: ( ( ',' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1852:1: ( ',' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1852:1: ( ',' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1853:1: ','
            {
             before(grammarAccess.getIntentAccess().getCommaKeyword_4_4_3()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Intent__Group_4_4__3__Impl3701); 
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1874:1: rule__Intent__Group_4_5__0 : rule__Intent__Group_4_5__0__Impl rule__Intent__Group_4_5__1 ;
    public final void rule__Intent__Group_4_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1878:1: ( rule__Intent__Group_4_5__0__Impl rule__Intent__Group_4_5__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1879:2: rule__Intent__Group_4_5__0__Impl rule__Intent__Group_4_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_5__0__Impl_in_rule__Intent__Group_4_5__03740);
            rule__Intent__Group_4_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_5__1_in_rule__Intent__Group_4_5__03743);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1886:1: rule__Intent__Group_4_5__0__Impl : ( 'DataExtra' ) ;
    public final void rule__Intent__Group_4_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1890:1: ( ( 'DataExtra' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1891:1: ( 'DataExtra' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1891:1: ( 'DataExtra' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1892:1: 'DataExtra'
            {
             before(grammarAccess.getIntentAccess().getDataExtraKeyword_4_5_0()); 
            match(input,33,FollowSets000.FOLLOW_33_in_rule__Intent__Group_4_5__0__Impl3771); 
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1905:1: rule__Intent__Group_4_5__1 : rule__Intent__Group_4_5__1__Impl rule__Intent__Group_4_5__2 ;
    public final void rule__Intent__Group_4_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1909:1: ( rule__Intent__Group_4_5__1__Impl rule__Intent__Group_4_5__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1910:2: rule__Intent__Group_4_5__1__Impl rule__Intent__Group_4_5__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_5__1__Impl_in_rule__Intent__Group_4_5__13802);
            rule__Intent__Group_4_5__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_5__2_in_rule__Intent__Group_4_5__13805);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1917:1: rule__Intent__Group_4_5__1__Impl : ( ':' ) ;
    public final void rule__Intent__Group_4_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1921:1: ( ( ':' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1922:1: ( ':' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1922:1: ( ':' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1923:1: ':'
            {
             before(grammarAccess.getIntentAccess().getColonKeyword_4_5_1()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__Intent__Group_4_5__1__Impl3833); 
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1936:1: rule__Intent__Group_4_5__2 : rule__Intent__Group_4_5__2__Impl rule__Intent__Group_4_5__3 ;
    public final void rule__Intent__Group_4_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1940:1: ( rule__Intent__Group_4_5__2__Impl rule__Intent__Group_4_5__3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1941:2: rule__Intent__Group_4_5__2__Impl rule__Intent__Group_4_5__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_5__2__Impl_in_rule__Intent__Group_4_5__23864);
            rule__Intent__Group_4_5__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_5__3_in_rule__Intent__Group_4_5__23867);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1948:1: rule__Intent__Group_4_5__2__Impl : ( '[' ) ;
    public final void rule__Intent__Group_4_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1952:1: ( ( '[' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1953:1: ( '[' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1953:1: ( '[' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1954:1: '['
            {
             before(grammarAccess.getIntentAccess().getLeftSquareBracketKeyword_4_5_2()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__Intent__Group_4_5__2__Impl3895); 
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1967:1: rule__Intent__Group_4_5__3 : rule__Intent__Group_4_5__3__Impl rule__Intent__Group_4_5__4 ;
    public final void rule__Intent__Group_4_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1971:1: ( rule__Intent__Group_4_5__3__Impl rule__Intent__Group_4_5__4 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1972:2: rule__Intent__Group_4_5__3__Impl rule__Intent__Group_4_5__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_5__3__Impl_in_rule__Intent__Group_4_5__33926);
            rule__Intent__Group_4_5__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_5__4_in_rule__Intent__Group_4_5__33929);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1979:1: rule__Intent__Group_4_5__3__Impl : ( ( rule__Intent__Group_4_5_3__0 )* ) ;
    public final void rule__Intent__Group_4_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1983:1: ( ( ( rule__Intent__Group_4_5_3__0 )* ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1984:1: ( ( rule__Intent__Group_4_5_3__0 )* )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1984:1: ( ( rule__Intent__Group_4_5_3__0 )* )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1985:1: ( rule__Intent__Group_4_5_3__0 )*
            {
             before(grammarAccess.getIntentAccess().getGroup_4_5_3()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1986:1: ( rule__Intent__Group_4_5_3__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==25) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1986:2: rule__Intent__Group_4_5_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_5_3__0_in_rule__Intent__Group_4_5__3__Impl3956);
            	    rule__Intent__Group_4_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getIntentAccess().getGroup_4_5_3()); 

            }


            }

        }
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1996:1: rule__Intent__Group_4_5__4 : rule__Intent__Group_4_5__4__Impl rule__Intent__Group_4_5__5 ;
    public final void rule__Intent__Group_4_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2000:1: ( rule__Intent__Group_4_5__4__Impl rule__Intent__Group_4_5__5 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2001:2: rule__Intent__Group_4_5__4__Impl rule__Intent__Group_4_5__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_5__4__Impl_in_rule__Intent__Group_4_5__43987);
            rule__Intent__Group_4_5__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_5__5_in_rule__Intent__Group_4_5__43990);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2008:1: rule__Intent__Group_4_5__4__Impl : ( ']' ) ;
    public final void rule__Intent__Group_4_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2012:1: ( ( ']' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2013:1: ( ']' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2013:1: ( ']' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2014:1: ']'
            {
             before(grammarAccess.getIntentAccess().getRightSquareBracketKeyword_4_5_4()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__Intent__Group_4_5__4__Impl4018); 
             after(grammarAccess.getIntentAccess().getRightSquareBracketKeyword_4_5_4()); 

            }


            }

        }
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2027:1: rule__Intent__Group_4_5__5 : rule__Intent__Group_4_5__5__Impl ;
    public final void rule__Intent__Group_4_5__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2031:1: ( rule__Intent__Group_4_5__5__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2032:2: rule__Intent__Group_4_5__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_5__5__Impl_in_rule__Intent__Group_4_5__54049);
            rule__Intent__Group_4_5__5__Impl();

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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2038:1: rule__Intent__Group_4_5__5__Impl : ( ',' ) ;
    public final void rule__Intent__Group_4_5__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2042:1: ( ( ',' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2043:1: ( ',' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2043:1: ( ',' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2044:1: ','
            {
             before(grammarAccess.getIntentAccess().getCommaKeyword_4_5_5()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Intent__Group_4_5__5__Impl4077); 
             after(grammarAccess.getIntentAccess().getCommaKeyword_4_5_5()); 

            }


            }

        }
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


    // $ANTLR start "rule__Intent__Group_4_5_3__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2069:1: rule__Intent__Group_4_5_3__0 : rule__Intent__Group_4_5_3__0__Impl rule__Intent__Group_4_5_3__1 ;
    public final void rule__Intent__Group_4_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2073:1: ( rule__Intent__Group_4_5_3__0__Impl rule__Intent__Group_4_5_3__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2074:2: rule__Intent__Group_4_5_3__0__Impl rule__Intent__Group_4_5_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_5_3__0__Impl_in_rule__Intent__Group_4_5_3__04120);
            rule__Intent__Group_4_5_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_5_3__1_in_rule__Intent__Group_4_5_3__04123);
            rule__Intent__Group_4_5_3__1();

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
    // $ANTLR end "rule__Intent__Group_4_5_3__0"


    // $ANTLR start "rule__Intent__Group_4_5_3__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2081:1: rule__Intent__Group_4_5_3__0__Impl : ( ',' ) ;
    public final void rule__Intent__Group_4_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2085:1: ( ( ',' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2086:1: ( ',' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2086:1: ( ',' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2087:1: ','
            {
             before(grammarAccess.getIntentAccess().getCommaKeyword_4_5_3_0()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Intent__Group_4_5_3__0__Impl4151); 
             after(grammarAccess.getIntentAccess().getCommaKeyword_4_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__Group_4_5_3__0__Impl"


    // $ANTLR start "rule__Intent__Group_4_5_3__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2100:1: rule__Intent__Group_4_5_3__1 : rule__Intent__Group_4_5_3__1__Impl ;
    public final void rule__Intent__Group_4_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2104:1: ( rule__Intent__Group_4_5_3__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2105:2: rule__Intent__Group_4_5_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_5_3__1__Impl_in_rule__Intent__Group_4_5_3__14182);
            rule__Intent__Group_4_5_3__1__Impl();

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
    // $ANTLR end "rule__Intent__Group_4_5_3__1"


    // $ANTLR start "rule__Intent__Group_4_5_3__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2111:1: rule__Intent__Group_4_5_3__1__Impl : ( ( rule__Intent__ExtraDataAssignment_4_5_3_1 ) ) ;
    public final void rule__Intent__Group_4_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2115:1: ( ( ( rule__Intent__ExtraDataAssignment_4_5_3_1 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2116:1: ( ( rule__Intent__ExtraDataAssignment_4_5_3_1 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2116:1: ( ( rule__Intent__ExtraDataAssignment_4_5_3_1 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2117:1: ( rule__Intent__ExtraDataAssignment_4_5_3_1 )
            {
             before(grammarAccess.getIntentAccess().getExtraDataAssignment_4_5_3_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2118:1: ( rule__Intent__ExtraDataAssignment_4_5_3_1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2118:2: rule__Intent__ExtraDataAssignment_4_5_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__ExtraDataAssignment_4_5_3_1_in_rule__Intent__Group_4_5_3__1__Impl4209);
            rule__Intent__ExtraDataAssignment_4_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getIntentAccess().getExtraDataAssignment_4_5_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__Group_4_5_3__1__Impl"


    // $ANTLR start "rule__Intent__Group_4_6__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2132:1: rule__Intent__Group_4_6__0 : rule__Intent__Group_4_6__0__Impl rule__Intent__Group_4_6__1 ;
    public final void rule__Intent__Group_4_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2136:1: ( rule__Intent__Group_4_6__0__Impl rule__Intent__Group_4_6__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2137:2: rule__Intent__Group_4_6__0__Impl rule__Intent__Group_4_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_6__0__Impl_in_rule__Intent__Group_4_6__04243);
            rule__Intent__Group_4_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_6__1_in_rule__Intent__Group_4_6__04246);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2144:1: rule__Intent__Group_4_6__0__Impl : ( 'ReturnData' ) ;
    public final void rule__Intent__Group_4_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2148:1: ( ( 'ReturnData' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2149:1: ( 'ReturnData' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2149:1: ( 'ReturnData' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2150:1: 'ReturnData'
            {
             before(grammarAccess.getIntentAccess().getReturnDataKeyword_4_6_0()); 
            match(input,34,FollowSets000.FOLLOW_34_in_rule__Intent__Group_4_6__0__Impl4274); 
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2163:1: rule__Intent__Group_4_6__1 : rule__Intent__Group_4_6__1__Impl rule__Intent__Group_4_6__2 ;
    public final void rule__Intent__Group_4_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2167:1: ( rule__Intent__Group_4_6__1__Impl rule__Intent__Group_4_6__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2168:2: rule__Intent__Group_4_6__1__Impl rule__Intent__Group_4_6__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_6__1__Impl_in_rule__Intent__Group_4_6__14305);
            rule__Intent__Group_4_6__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_6__2_in_rule__Intent__Group_4_6__14308);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2175:1: rule__Intent__Group_4_6__1__Impl : ( ':' ) ;
    public final void rule__Intent__Group_4_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2179:1: ( ( ':' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2180:1: ( ':' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2180:1: ( ':' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2181:1: ':'
            {
             before(grammarAccess.getIntentAccess().getColonKeyword_4_6_1()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__Intent__Group_4_6__1__Impl4336); 
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2194:1: rule__Intent__Group_4_6__2 : rule__Intent__Group_4_6__2__Impl rule__Intent__Group_4_6__3 ;
    public final void rule__Intent__Group_4_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2198:1: ( rule__Intent__Group_4_6__2__Impl rule__Intent__Group_4_6__3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2199:2: rule__Intent__Group_4_6__2__Impl rule__Intent__Group_4_6__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_6__2__Impl_in_rule__Intent__Group_4_6__24367);
            rule__Intent__Group_4_6__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_6__3_in_rule__Intent__Group_4_6__24370);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2206:1: rule__Intent__Group_4_6__2__Impl : ( '[' ) ;
    public final void rule__Intent__Group_4_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2210:1: ( ( '[' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2211:1: ( '[' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2211:1: ( '[' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2212:1: '['
            {
             before(grammarAccess.getIntentAccess().getLeftSquareBracketKeyword_4_6_2()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__Intent__Group_4_6__2__Impl4398); 
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2225:1: rule__Intent__Group_4_6__3 : rule__Intent__Group_4_6__3__Impl rule__Intent__Group_4_6__4 ;
    public final void rule__Intent__Group_4_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2229:1: ( rule__Intent__Group_4_6__3__Impl rule__Intent__Group_4_6__4 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2230:2: rule__Intent__Group_4_6__3__Impl rule__Intent__Group_4_6__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_6__3__Impl_in_rule__Intent__Group_4_6__34429);
            rule__Intent__Group_4_6__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_6__4_in_rule__Intent__Group_4_6__34432);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2237:1: rule__Intent__Group_4_6__3__Impl : ( ( rule__Intent__Group_4_6_3__0 )* ) ;
    public final void rule__Intent__Group_4_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2241:1: ( ( ( rule__Intent__Group_4_6_3__0 )* ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2242:1: ( ( rule__Intent__Group_4_6_3__0 )* )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2242:1: ( ( rule__Intent__Group_4_6_3__0 )* )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2243:1: ( rule__Intent__Group_4_6_3__0 )*
            {
             before(grammarAccess.getIntentAccess().getGroup_4_6_3()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2244:1: ( rule__Intent__Group_4_6_3__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==25) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2244:2: rule__Intent__Group_4_6_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_6_3__0_in_rule__Intent__Group_4_6__3__Impl4459);
            	    rule__Intent__Group_4_6_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2254:1: rule__Intent__Group_4_6__4 : rule__Intent__Group_4_6__4__Impl ;
    public final void rule__Intent__Group_4_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2258:1: ( rule__Intent__Group_4_6__4__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2259:2: rule__Intent__Group_4_6__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_6__4__Impl_in_rule__Intent__Group_4_6__44490);
            rule__Intent__Group_4_6__4__Impl();

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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2265:1: rule__Intent__Group_4_6__4__Impl : ( ']' ) ;
    public final void rule__Intent__Group_4_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2269:1: ( ( ']' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2270:1: ( ']' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2270:1: ( ']' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2271:1: ']'
            {
             before(grammarAccess.getIntentAccess().getRightSquareBracketKeyword_4_6_4()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__Intent__Group_4_6__4__Impl4518); 
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


    // $ANTLR start "rule__Intent__Group_4_6_3__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2294:1: rule__Intent__Group_4_6_3__0 : rule__Intent__Group_4_6_3__0__Impl rule__Intent__Group_4_6_3__1 ;
    public final void rule__Intent__Group_4_6_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2298:1: ( rule__Intent__Group_4_6_3__0__Impl rule__Intent__Group_4_6_3__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2299:2: rule__Intent__Group_4_6_3__0__Impl rule__Intent__Group_4_6_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_6_3__0__Impl_in_rule__Intent__Group_4_6_3__04559);
            rule__Intent__Group_4_6_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_6_3__1_in_rule__Intent__Group_4_6_3__04562);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2306:1: rule__Intent__Group_4_6_3__0__Impl : ( ',' ) ;
    public final void rule__Intent__Group_4_6_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2310:1: ( ( ',' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2311:1: ( ',' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2311:1: ( ',' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2312:1: ','
            {
             before(grammarAccess.getIntentAccess().getCommaKeyword_4_6_3_0()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Intent__Group_4_6_3__0__Impl4590); 
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2325:1: rule__Intent__Group_4_6_3__1 : rule__Intent__Group_4_6_3__1__Impl ;
    public final void rule__Intent__Group_4_6_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2329:1: ( rule__Intent__Group_4_6_3__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2330:2: rule__Intent__Group_4_6_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__Group_4_6_3__1__Impl_in_rule__Intent__Group_4_6_3__14621);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2336:1: rule__Intent__Group_4_6_3__1__Impl : ( ( rule__Intent__ReturnDataAssignment_4_6_3_1 ) ) ;
    public final void rule__Intent__Group_4_6_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2340:1: ( ( ( rule__Intent__ReturnDataAssignment_4_6_3_1 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2341:1: ( ( rule__Intent__ReturnDataAssignment_4_6_3_1 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2341:1: ( ( rule__Intent__ReturnDataAssignment_4_6_3_1 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2342:1: ( rule__Intent__ReturnDataAssignment_4_6_3_1 )
            {
             before(grammarAccess.getIntentAccess().getReturnDataAssignment_4_6_3_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2343:1: ( rule__Intent__ReturnDataAssignment_4_6_3_1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2343:2: rule__Intent__ReturnDataAssignment_4_6_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent__ReturnDataAssignment_4_6_3_1_in_rule__Intent__Group_4_6_3__1__Impl4648);
            rule__Intent__ReturnDataAssignment_4_6_3_1();

            state._fsp--;


            }

             after(grammarAccess.getIntentAccess().getReturnDataAssignment_4_6_3_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__ExtraData__Group__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2357:1: rule__ExtraData__Group__0 : rule__ExtraData__Group__0__Impl rule__ExtraData__Group__1 ;
    public final void rule__ExtraData__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2361:1: ( rule__ExtraData__Group__0__Impl rule__ExtraData__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2362:2: rule__ExtraData__Group__0__Impl rule__ExtraData__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtraData__Group__0__Impl_in_rule__ExtraData__Group__04682);
            rule__ExtraData__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ExtraData__Group__1_in_rule__ExtraData__Group__04685);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2369:1: rule__ExtraData__Group__0__Impl : ( () ) ;
    public final void rule__ExtraData__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2373:1: ( ( () ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2374:1: ( () )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2374:1: ( () )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2375:1: ()
            {
             before(grammarAccess.getExtraDataAccess().getExtraDataAction_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2376:1: ()
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2378:1: 
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2388:1: rule__ExtraData__Group__1 : rule__ExtraData__Group__1__Impl rule__ExtraData__Group__2 ;
    public final void rule__ExtraData__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2392:1: ( rule__ExtraData__Group__1__Impl rule__ExtraData__Group__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2393:2: rule__ExtraData__Group__1__Impl rule__ExtraData__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtraData__Group__1__Impl_in_rule__ExtraData__Group__14743);
            rule__ExtraData__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ExtraData__Group__2_in_rule__ExtraData__Group__14746);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2400:1: rule__ExtraData__Group__1__Impl : ( '{' ) ;
    public final void rule__ExtraData__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2404:1: ( ( '{' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2405:1: ( '{' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2405:1: ( '{' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2406:1: '{'
            {
             before(grammarAccess.getExtraDataAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__ExtraData__Group__1__Impl4774); 
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2419:1: rule__ExtraData__Group__2 : rule__ExtraData__Group__2__Impl rule__ExtraData__Group__3 ;
    public final void rule__ExtraData__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2423:1: ( rule__ExtraData__Group__2__Impl rule__ExtraData__Group__3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2424:2: rule__ExtraData__Group__2__Impl rule__ExtraData__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtraData__Group__2__Impl_in_rule__ExtraData__Group__24805);
            rule__ExtraData__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ExtraData__Group__3_in_rule__ExtraData__Group__24808);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2431:1: rule__ExtraData__Group__2__Impl : ( ( rule__ExtraData__Group_2__0 ) ) ;
    public final void rule__ExtraData__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2435:1: ( ( ( rule__ExtraData__Group_2__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2436:1: ( ( rule__ExtraData__Group_2__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2436:1: ( ( rule__ExtraData__Group_2__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2437:1: ( rule__ExtraData__Group_2__0 )
            {
             before(grammarAccess.getExtraDataAccess().getGroup_2()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2438:1: ( rule__ExtraData__Group_2__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2438:2: rule__ExtraData__Group_2__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtraData__Group_2__0_in_rule__ExtraData__Group__2__Impl4835);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2448:1: rule__ExtraData__Group__3 : rule__ExtraData__Group__3__Impl rule__ExtraData__Group__4 ;
    public final void rule__ExtraData__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2452:1: ( rule__ExtraData__Group__3__Impl rule__ExtraData__Group__4 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2453:2: rule__ExtraData__Group__3__Impl rule__ExtraData__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtraData__Group__3__Impl_in_rule__ExtraData__Group__34865);
            rule__ExtraData__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ExtraData__Group__4_in_rule__ExtraData__Group__34868);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2460:1: rule__ExtraData__Group__3__Impl : ( ',' ) ;
    public final void rule__ExtraData__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2464:1: ( ( ',' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2465:1: ( ',' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2465:1: ( ',' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2466:1: ','
            {
             before(grammarAccess.getExtraDataAccess().getCommaKeyword_3()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__ExtraData__Group__3__Impl4896); 
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2479:1: rule__ExtraData__Group__4 : rule__ExtraData__Group__4__Impl rule__ExtraData__Group__5 ;
    public final void rule__ExtraData__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2483:1: ( rule__ExtraData__Group__4__Impl rule__ExtraData__Group__5 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2484:2: rule__ExtraData__Group__4__Impl rule__ExtraData__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtraData__Group__4__Impl_in_rule__ExtraData__Group__44927);
            rule__ExtraData__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ExtraData__Group__5_in_rule__ExtraData__Group__44930);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2491:1: rule__ExtraData__Group__4__Impl : ( ( rule__ExtraData__Group_4__0 ) ) ;
    public final void rule__ExtraData__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2495:1: ( ( ( rule__ExtraData__Group_4__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2496:1: ( ( rule__ExtraData__Group_4__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2496:1: ( ( rule__ExtraData__Group_4__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2497:1: ( rule__ExtraData__Group_4__0 )
            {
             before(grammarAccess.getExtraDataAccess().getGroup_4()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2498:1: ( rule__ExtraData__Group_4__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2498:2: rule__ExtraData__Group_4__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtraData__Group_4__0_in_rule__ExtraData__Group__4__Impl4957);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2508:1: rule__ExtraData__Group__5 : rule__ExtraData__Group__5__Impl ;
    public final void rule__ExtraData__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2512:1: ( rule__ExtraData__Group__5__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2513:2: rule__ExtraData__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtraData__Group__5__Impl_in_rule__ExtraData__Group__54987);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2519:1: rule__ExtraData__Group__5__Impl : ( '}' ) ;
    public final void rule__ExtraData__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2523:1: ( ( '}' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2524:1: ( '}' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2524:1: ( '}' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2525:1: '}'
            {
             before(grammarAccess.getExtraDataAccess().getRightCurlyBracketKeyword_5()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__ExtraData__Group__5__Impl5015); 
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2550:1: rule__ExtraData__Group_2__0 : rule__ExtraData__Group_2__0__Impl rule__ExtraData__Group_2__1 ;
    public final void rule__ExtraData__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2554:1: ( rule__ExtraData__Group_2__0__Impl rule__ExtraData__Group_2__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2555:2: rule__ExtraData__Group_2__0__Impl rule__ExtraData__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtraData__Group_2__0__Impl_in_rule__ExtraData__Group_2__05058);
            rule__ExtraData__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ExtraData__Group_2__1_in_rule__ExtraData__Group_2__05061);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2562:1: rule__ExtraData__Group_2__0__Impl : ( 'Name' ) ;
    public final void rule__ExtraData__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2566:1: ( ( 'Name' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2567:1: ( 'Name' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2567:1: ( 'Name' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2568:1: 'Name'
            {
             before(grammarAccess.getExtraDataAccess().getNameKeyword_2_0()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__ExtraData__Group_2__0__Impl5089); 
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2581:1: rule__ExtraData__Group_2__1 : rule__ExtraData__Group_2__1__Impl rule__ExtraData__Group_2__2 ;
    public final void rule__ExtraData__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2585:1: ( rule__ExtraData__Group_2__1__Impl rule__ExtraData__Group_2__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2586:2: rule__ExtraData__Group_2__1__Impl rule__ExtraData__Group_2__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtraData__Group_2__1__Impl_in_rule__ExtraData__Group_2__15120);
            rule__ExtraData__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ExtraData__Group_2__2_in_rule__ExtraData__Group_2__15123);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2593:1: rule__ExtraData__Group_2__1__Impl : ( ':' ) ;
    public final void rule__ExtraData__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2597:1: ( ( ':' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2598:1: ( ':' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2598:1: ( ':' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2599:1: ':'
            {
             before(grammarAccess.getExtraDataAccess().getColonKeyword_2_1()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__ExtraData__Group_2__1__Impl5151); 
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2612:1: rule__ExtraData__Group_2__2 : rule__ExtraData__Group_2__2__Impl ;
    public final void rule__ExtraData__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2616:1: ( rule__ExtraData__Group_2__2__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2617:2: rule__ExtraData__Group_2__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtraData__Group_2__2__Impl_in_rule__ExtraData__Group_2__25182);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2623:1: rule__ExtraData__Group_2__2__Impl : ( ( rule__ExtraData__NameAssignment_2_2 ) ) ;
    public final void rule__ExtraData__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2627:1: ( ( ( rule__ExtraData__NameAssignment_2_2 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2628:1: ( ( rule__ExtraData__NameAssignment_2_2 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2628:1: ( ( rule__ExtraData__NameAssignment_2_2 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2629:1: ( rule__ExtraData__NameAssignment_2_2 )
            {
             before(grammarAccess.getExtraDataAccess().getNameAssignment_2_2()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2630:1: ( rule__ExtraData__NameAssignment_2_2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2630:2: rule__ExtraData__NameAssignment_2_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtraData__NameAssignment_2_2_in_rule__ExtraData__Group_2__2__Impl5209);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2646:1: rule__ExtraData__Group_4__0 : rule__ExtraData__Group_4__0__Impl rule__ExtraData__Group_4__1 ;
    public final void rule__ExtraData__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2650:1: ( rule__ExtraData__Group_4__0__Impl rule__ExtraData__Group_4__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2651:2: rule__ExtraData__Group_4__0__Impl rule__ExtraData__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtraData__Group_4__0__Impl_in_rule__ExtraData__Group_4__05245);
            rule__ExtraData__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ExtraData__Group_4__1_in_rule__ExtraData__Group_4__05248);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2658:1: rule__ExtraData__Group_4__0__Impl : ( 'Type' ) ;
    public final void rule__ExtraData__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2662:1: ( ( 'Type' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2663:1: ( 'Type' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2663:1: ( 'Type' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2664:1: 'Type'
            {
             before(grammarAccess.getExtraDataAccess().getTypeKeyword_4_0()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__ExtraData__Group_4__0__Impl5276); 
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2677:1: rule__ExtraData__Group_4__1 : rule__ExtraData__Group_4__1__Impl rule__ExtraData__Group_4__2 ;
    public final void rule__ExtraData__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2681:1: ( rule__ExtraData__Group_4__1__Impl rule__ExtraData__Group_4__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2682:2: rule__ExtraData__Group_4__1__Impl rule__ExtraData__Group_4__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtraData__Group_4__1__Impl_in_rule__ExtraData__Group_4__15307);
            rule__ExtraData__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ExtraData__Group_4__2_in_rule__ExtraData__Group_4__15310);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2689:1: rule__ExtraData__Group_4__1__Impl : ( ':' ) ;
    public final void rule__ExtraData__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2693:1: ( ( ':' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2694:1: ( ':' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2694:1: ( ':' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2695:1: ':'
            {
             before(grammarAccess.getExtraDataAccess().getColonKeyword_4_1()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__ExtraData__Group_4__1__Impl5338); 
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2708:1: rule__ExtraData__Group_4__2 : rule__ExtraData__Group_4__2__Impl ;
    public final void rule__ExtraData__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2712:1: ( rule__ExtraData__Group_4__2__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2713:2: rule__ExtraData__Group_4__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtraData__Group_4__2__Impl_in_rule__ExtraData__Group_4__25369);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2719:1: rule__ExtraData__Group_4__2__Impl : ( ( rule__ExtraData__TypeAssignment_4_2 ) ) ;
    public final void rule__ExtraData__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2723:1: ( ( ( rule__ExtraData__TypeAssignment_4_2 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2724:1: ( ( rule__ExtraData__TypeAssignment_4_2 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2724:1: ( ( rule__ExtraData__TypeAssignment_4_2 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2725:1: ( rule__ExtraData__TypeAssignment_4_2 )
            {
             before(grammarAccess.getExtraDataAccess().getTypeAssignment_4_2()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2726:1: ( rule__ExtraData__TypeAssignment_4_2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2726:2: rule__ExtraData__TypeAssignment_4_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtraData__TypeAssignment_4_2_in_rule__ExtraData__Group_4__2__Impl5396);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2742:1: rule__ExplicitIntent__Group__0 : rule__ExplicitIntent__Group__0__Impl rule__ExplicitIntent__Group__1 ;
    public final void rule__ExplicitIntent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2746:1: ( rule__ExplicitIntent__Group__0__Impl rule__ExplicitIntent__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2747:2: rule__ExplicitIntent__Group__0__Impl rule__ExplicitIntent__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExplicitIntent__Group__0__Impl_in_rule__ExplicitIntent__Group__05432);
            rule__ExplicitIntent__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ExplicitIntent__Group__1_in_rule__ExplicitIntent__Group__05435);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2754:1: rule__ExplicitIntent__Group__0__Impl : ( () ) ;
    public final void rule__ExplicitIntent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2758:1: ( ( () ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2759:1: ( () )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2759:1: ( () )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2760:1: ()
            {
             before(grammarAccess.getExplicitIntentAccess().getExplicitIntentAction_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2761:1: ()
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2763:1: 
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2773:1: rule__ExplicitIntent__Group__1 : rule__ExplicitIntent__Group__1__Impl ;
    public final void rule__ExplicitIntent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2777:1: ( rule__ExplicitIntent__Group__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2778:2: rule__ExplicitIntent__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExplicitIntent__Group__1__Impl_in_rule__ExplicitIntent__Group__15493);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2784:1: rule__ExplicitIntent__Group__1__Impl : ( '\\'ExplicitIntent\\'' ) ;
    public final void rule__ExplicitIntent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2788:1: ( ( '\\'ExplicitIntent\\'' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2789:1: ( '\\'ExplicitIntent\\'' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2789:1: ( '\\'ExplicitIntent\\'' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2790:1: '\\'ExplicitIntent\\''
            {
             before(grammarAccess.getExplicitIntentAccess().getExplicitIntentKeyword_1()); 
            match(input,35,FollowSets000.FOLLOW_35_in_rule__ExplicitIntent__Group__1__Impl5521); 
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2807:1: rule__ImplicitIntent__Group__0 : rule__ImplicitIntent__Group__0__Impl rule__ImplicitIntent__Group__1 ;
    public final void rule__ImplicitIntent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2811:1: ( rule__ImplicitIntent__Group__0__Impl rule__ImplicitIntent__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2812:2: rule__ImplicitIntent__Group__0__Impl rule__ImplicitIntent__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ImplicitIntent__Group__0__Impl_in_rule__ImplicitIntent__Group__05556);
            rule__ImplicitIntent__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ImplicitIntent__Group__1_in_rule__ImplicitIntent__Group__05559);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2819:1: rule__ImplicitIntent__Group__0__Impl : ( () ) ;
    public final void rule__ImplicitIntent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2823:1: ( ( () ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2824:1: ( () )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2824:1: ( () )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2825:1: ()
            {
             before(grammarAccess.getImplicitIntentAccess().getImplicitIntentAction_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2826:1: ()
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2828:1: 
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2838:1: rule__ImplicitIntent__Group__1 : rule__ImplicitIntent__Group__1__Impl ;
    public final void rule__ImplicitIntent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2842:1: ( rule__ImplicitIntent__Group__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2843:2: rule__ImplicitIntent__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ImplicitIntent__Group__1__Impl_in_rule__ImplicitIntent__Group__15617);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2849:1: rule__ImplicitIntent__Group__1__Impl : ( '\\'ImplicitIntent\\'' ) ;
    public final void rule__ImplicitIntent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2853:1: ( ( '\\'ImplicitIntent\\'' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2854:1: ( '\\'ImplicitIntent\\'' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2854:1: ( '\\'ImplicitIntent\\'' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2855:1: '\\'ImplicitIntent\\''
            {
             before(grammarAccess.getImplicitIntentAccess().getImplicitIntentKeyword_1()); 
            match(input,36,FollowSets000.FOLLOW_36_in_rule__ImplicitIntent__Group__1__Impl5645); 
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2872:1: rule__BroadcastIntent__Group__0 : rule__BroadcastIntent__Group__0__Impl rule__BroadcastIntent__Group__1 ;
    public final void rule__BroadcastIntent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2876:1: ( rule__BroadcastIntent__Group__0__Impl rule__BroadcastIntent__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2877:2: rule__BroadcastIntent__Group__0__Impl rule__BroadcastIntent__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BroadcastIntent__Group__0__Impl_in_rule__BroadcastIntent__Group__05680);
            rule__BroadcastIntent__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BroadcastIntent__Group__1_in_rule__BroadcastIntent__Group__05683);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2884:1: rule__BroadcastIntent__Group__0__Impl : ( () ) ;
    public final void rule__BroadcastIntent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2888:1: ( ( () ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2889:1: ( () )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2889:1: ( () )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2890:1: ()
            {
             before(grammarAccess.getBroadcastIntentAccess().getBroadCastIntentAction_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2891:1: ()
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2893:1: 
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2903:1: rule__BroadcastIntent__Group__1 : rule__BroadcastIntent__Group__1__Impl ;
    public final void rule__BroadcastIntent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2907:1: ( rule__BroadcastIntent__Group__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2908:2: rule__BroadcastIntent__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__BroadcastIntent__Group__1__Impl_in_rule__BroadcastIntent__Group__15741);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2914:1: rule__BroadcastIntent__Group__1__Impl : ( '\\'BroadcastIntent\\'' ) ;
    public final void rule__BroadcastIntent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2918:1: ( ( '\\'BroadcastIntent\\'' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2919:1: ( '\\'BroadcastIntent\\'' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2919:1: ( '\\'BroadcastIntent\\'' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2920:1: '\\'BroadcastIntent\\''
            {
             before(grammarAccess.getBroadcastIntentAccess().getBroadcastIntentKeyword_1()); 
            match(input,37,FollowSets000.FOLLOW_37_in_rule__BroadcastIntent__Group__1__Impl5769); 
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2937:1: rule__ServiceIntent__Group__0 : rule__ServiceIntent__Group__0__Impl rule__ServiceIntent__Group__1 ;
    public final void rule__ServiceIntent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2941:1: ( rule__ServiceIntent__Group__0__Impl rule__ServiceIntent__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2942:2: rule__ServiceIntent__Group__0__Impl rule__ServiceIntent__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ServiceIntent__Group__0__Impl_in_rule__ServiceIntent__Group__05804);
            rule__ServiceIntent__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ServiceIntent__Group__1_in_rule__ServiceIntent__Group__05807);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2949:1: rule__ServiceIntent__Group__0__Impl : ( () ) ;
    public final void rule__ServiceIntent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2953:1: ( ( () ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2954:1: ( () )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2954:1: ( () )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2955:1: ()
            {
             before(grammarAccess.getServiceIntentAccess().getServiceIntentAction_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2956:1: ()
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2958:1: 
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2968:1: rule__ServiceIntent__Group__1 : rule__ServiceIntent__Group__1__Impl ;
    public final void rule__ServiceIntent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2972:1: ( rule__ServiceIntent__Group__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2973:2: rule__ServiceIntent__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ServiceIntent__Group__1__Impl_in_rule__ServiceIntent__Group__15865);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2979:1: rule__ServiceIntent__Group__1__Impl : ( '\\'ServiceIntent\\'' ) ;
    public final void rule__ServiceIntent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2983:1: ( ( '\\'ServiceIntent\\'' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2984:1: ( '\\'ServiceIntent\\'' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2984:1: ( '\\'ServiceIntent\\'' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2985:1: '\\'ServiceIntent\\''
            {
             before(grammarAccess.getServiceIntentAccess().getServiceIntentKeyword_1()); 
            match(input,38,FollowSets000.FOLLOW_38_in_rule__ServiceIntent__Group__1__Impl5893); 
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3003:1: rule__IntentModel__NameAssignment_1 : ( ( 'Model' ) ) ;
    public final void rule__IntentModel__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3007:1: ( ( ( 'Model' ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3008:1: ( ( 'Model' ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3008:1: ( ( 'Model' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3009:1: ( 'Model' )
            {
             before(grammarAccess.getIntentModelAccess().getNameModelKeyword_1_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3010:1: ( 'Model' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3011:1: 'Model'
            {
             before(grammarAccess.getIntentModelAccess().getNameModelKeyword_1_0()); 
            match(input,39,FollowSets000.FOLLOW_39_in_rule__IntentModel__NameAssignment_15938); 
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3026:1: rule__IntentModel__IntentsAssignment_5 : ( ruleIntent ) ;
    public final void rule__IntentModel__IntentsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3030:1: ( ( ruleIntent ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3031:1: ( ruleIntent )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3031:1: ( ruleIntent )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3032:1: ruleIntent
            {
             before(grammarAccess.getIntentModelAccess().getIntentsIntentParserRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleIntent_in_rule__IntentModel__IntentsAssignment_55977);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3041:1: rule__IntentModel__IntentsAssignment_7_2 : ( ruleIntent ) ;
    public final void rule__IntentModel__IntentsAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3045:1: ( ( ruleIntent ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3046:1: ( ruleIntent )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3046:1: ( ruleIntent )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3047:1: ruleIntent
            {
             before(grammarAccess.getIntentModelAccess().getIntentsIntentParserRuleCall_7_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleIntent_in_rule__IntentModel__IntentsAssignment_7_26008);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3056:1: rule__Intent__NameAssignment_4_0_2 : ( ruleEString ) ;
    public final void rule__Intent__NameAssignment_4_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3060:1: ( ( ruleEString ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3061:1: ( ruleEString )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3061:1: ( ruleEString )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3062:1: ruleEString
            {
             before(grammarAccess.getIntentAccess().getNameEStringParserRuleCall_4_0_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Intent__NameAssignment_4_0_26039);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3071:1: rule__Intent__ActionAssignment_4_1_2 : ( ruleEString ) ;
    public final void rule__Intent__ActionAssignment_4_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3075:1: ( ( ruleEString ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3076:1: ( ruleEString )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3076:1: ( ruleEString )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3077:1: ruleEString
            {
             before(grammarAccess.getIntentAccess().getActionEStringParserRuleCall_4_1_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Intent__ActionAssignment_4_1_26070);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3086:1: rule__Intent__CategoryAssignment_4_2_2 : ( ruleEString ) ;
    public final void rule__Intent__CategoryAssignment_4_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3090:1: ( ( ruleEString ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3091:1: ( ruleEString )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3091:1: ( ruleEString )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3092:1: ruleEString
            {
             before(grammarAccess.getIntentAccess().getCategoryEStringParserRuleCall_4_2_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Intent__CategoryAssignment_4_2_26101);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3101:1: rule__Intent__MetaCategoryAssignment_4_3_2 : ( ruleEString ) ;
    public final void rule__Intent__MetaCategoryAssignment_4_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3105:1: ( ( ruleEString ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3106:1: ( ruleEString )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3106:1: ( ruleEString )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3107:1: ruleEString
            {
             before(grammarAccess.getIntentAccess().getMetaCategoryEStringParserRuleCall_4_3_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Intent__MetaCategoryAssignment_4_3_26132);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3116:1: rule__Intent__DataURIAssignment_4_4_2 : ( ruleEString ) ;
    public final void rule__Intent__DataURIAssignment_4_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3120:1: ( ( ruleEString ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3121:1: ( ruleEString )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3121:1: ( ruleEString )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3122:1: ruleEString
            {
             before(grammarAccess.getIntentAccess().getDataURIEStringParserRuleCall_4_4_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Intent__DataURIAssignment_4_4_26163);
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


    // $ANTLR start "rule__Intent__ExtraDataAssignment_4_5_3_1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3131:1: rule__Intent__ExtraDataAssignment_4_5_3_1 : ( ruleExtraData ) ;
    public final void rule__Intent__ExtraDataAssignment_4_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3135:1: ( ( ruleExtraData ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3136:1: ( ruleExtraData )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3136:1: ( ruleExtraData )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3137:1: ruleExtraData
            {
             before(grammarAccess.getIntentAccess().getExtraDataExtraDataParserRuleCall_4_5_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleExtraData_in_rule__Intent__ExtraDataAssignment_4_5_3_16194);
            ruleExtraData();

            state._fsp--;

             after(grammarAccess.getIntentAccess().getExtraDataExtraDataParserRuleCall_4_5_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__ExtraDataAssignment_4_5_3_1"


    // $ANTLR start "rule__Intent__ReturnDataAssignment_4_6_3_1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3146:1: rule__Intent__ReturnDataAssignment_4_6_3_1 : ( ruleExtraData ) ;
    public final void rule__Intent__ReturnDataAssignment_4_6_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3150:1: ( ( ruleExtraData ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3151:1: ( ruleExtraData )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3151:1: ( ruleExtraData )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3152:1: ruleExtraData
            {
             before(grammarAccess.getIntentAccess().getReturnDataExtraDataParserRuleCall_4_6_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleExtraData_in_rule__Intent__ReturnDataAssignment_4_6_3_16225);
            ruleExtraData();

            state._fsp--;

             after(grammarAccess.getIntentAccess().getReturnDataExtraDataParserRuleCall_4_6_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__ReturnDataAssignment_4_6_3_1"


    // $ANTLR start "rule__ExtraData__NameAssignment_2_2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3161:1: rule__ExtraData__NameAssignment_2_2 : ( ruleEString ) ;
    public final void rule__ExtraData__NameAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3165:1: ( ( ruleEString ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3166:1: ( ruleEString )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3166:1: ( ruleEString )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3167:1: ruleEString
            {
             before(grammarAccess.getExtraDataAccess().getNameEStringParserRuleCall_2_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__ExtraData__NameAssignment_2_26256);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3176:1: rule__ExtraData__TypeAssignment_4_2 : ( ruleSimpleTypeEnum ) ;
    public final void rule__ExtraData__TypeAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3180:1: ( ( ruleSimpleTypeEnum ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3181:1: ( ruleSimpleTypeEnum )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3181:1: ( ruleSimpleTypeEnum )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3182:1: ruleSimpleTypeEnum
            {
             before(grammarAccess.getExtraDataAccess().getTypeSimpleTypeEnumEnumRuleCall_4_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSimpleTypeEnum_in_rule__ExtraData__TypeAssignment_4_26287);
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
        public static final BitSet FOLLOW_rule__Intent__Group__1__Impl_in_rule__Intent__Group__11800 = new BitSet(new long[]{0x0000007800000000L});
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
        public static final BitSet FOLLOW_rule__Intent__Group_4__3__Impl_in_rule__Intent__Group_4__32232 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_rule__Intent__Group_4__4_in_rule__Intent__Group_4__32235 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_3__0_in_rule__Intent__Group_4__3__Impl2262 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4__4__Impl_in_rule__Intent__Group_4__42292 = new BitSet(new long[]{0x0000000600000000L});
        public static final BitSet FOLLOW_rule__Intent__Group_4__5_in_rule__Intent__Group_4__42295 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_4__0_in_rule__Intent__Group_4__4__Impl2322 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4__5__Impl_in_rule__Intent__Group_4__52352 = new BitSet(new long[]{0x0000000600000000L});
        public static final BitSet FOLLOW_rule__Intent__Group_4__6_in_rule__Intent__Group_4__52355 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_5__0_in_rule__Intent__Group_4__5__Impl2382 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4__6__Impl_in_rule__Intent__Group_4__62413 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_6__0_in_rule__Intent__Group_4__6__Impl2440 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_0__0__Impl_in_rule__Intent__Group_4_0__02485 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_0__1_in_rule__Intent__Group_4_0__02488 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__Intent__Group_4_0__0__Impl2516 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_0__1__Impl_in_rule__Intent__Group_4_0__12547 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_0__2_in_rule__Intent__Group_4_0__12550 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__Intent__Group_4_0__1__Impl2578 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_0__2__Impl_in_rule__Intent__Group_4_0__22609 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_0__3_in_rule__Intent__Group_4_0__22612 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__NameAssignment_4_0_2_in_rule__Intent__Group_4_0__2__Impl2639 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_0__3__Impl_in_rule__Intent__Group_4_0__32669 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Intent__Group_4_0__3__Impl2697 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_1__0__Impl_in_rule__Intent__Group_4_1__02736 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_1__1_in_rule__Intent__Group_4_1__02739 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__Intent__Group_4_1__0__Impl2767 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_1__1__Impl_in_rule__Intent__Group_4_1__12798 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_1__2_in_rule__Intent__Group_4_1__12801 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__Intent__Group_4_1__1__Impl2829 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_1__2__Impl_in_rule__Intent__Group_4_1__22860 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_1__3_in_rule__Intent__Group_4_1__22863 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__ActionAssignment_4_1_2_in_rule__Intent__Group_4_1__2__Impl2890 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_1__3__Impl_in_rule__Intent__Group_4_1__32920 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Intent__Group_4_1__3__Impl2948 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_2__0__Impl_in_rule__Intent__Group_4_2__02987 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_2__1_in_rule__Intent__Group_4_2__02990 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__Intent__Group_4_2__0__Impl3018 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_2__1__Impl_in_rule__Intent__Group_4_2__13049 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_2__2_in_rule__Intent__Group_4_2__13052 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__Intent__Group_4_2__1__Impl3080 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_2__2__Impl_in_rule__Intent__Group_4_2__23111 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_2__3_in_rule__Intent__Group_4_2__23114 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__CategoryAssignment_4_2_2_in_rule__Intent__Group_4_2__2__Impl3141 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_2__3__Impl_in_rule__Intent__Group_4_2__33171 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Intent__Group_4_2__3__Impl3199 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_3__0__Impl_in_rule__Intent__Group_4_3__03238 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_3__1_in_rule__Intent__Group_4_3__03241 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__Intent__Group_4_3__0__Impl3269 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_3__1__Impl_in_rule__Intent__Group_4_3__13300 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_3__2_in_rule__Intent__Group_4_3__13303 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__Intent__Group_4_3__1__Impl3331 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_3__2__Impl_in_rule__Intent__Group_4_3__23362 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_3__3_in_rule__Intent__Group_4_3__23365 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__MetaCategoryAssignment_4_3_2_in_rule__Intent__Group_4_3__2__Impl3392 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_3__3__Impl_in_rule__Intent__Group_4_3__33422 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Intent__Group_4_3__3__Impl3450 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_4__0__Impl_in_rule__Intent__Group_4_4__03489 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_4__1_in_rule__Intent__Group_4_4__03492 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__Intent__Group_4_4__0__Impl3520 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_4__1__Impl_in_rule__Intent__Group_4_4__13551 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_4__2_in_rule__Intent__Group_4_4__13554 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__Intent__Group_4_4__1__Impl3582 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_4__2__Impl_in_rule__Intent__Group_4_4__23613 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_4__3_in_rule__Intent__Group_4_4__23616 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__DataURIAssignment_4_4_2_in_rule__Intent__Group_4_4__2__Impl3643 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_4__3__Impl_in_rule__Intent__Group_4_4__33673 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Intent__Group_4_4__3__Impl3701 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_5__0__Impl_in_rule__Intent__Group_4_5__03740 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_5__1_in_rule__Intent__Group_4_5__03743 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__Intent__Group_4_5__0__Impl3771 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_5__1__Impl_in_rule__Intent__Group_4_5__13802 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_5__2_in_rule__Intent__Group_4_5__13805 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__Intent__Group_4_5__1__Impl3833 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_5__2__Impl_in_rule__Intent__Group_4_5__23864 = new BitSet(new long[]{0x0000000003000000L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_5__3_in_rule__Intent__Group_4_5__23867 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__Intent__Group_4_5__2__Impl3895 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_5__3__Impl_in_rule__Intent__Group_4_5__33926 = new BitSet(new long[]{0x0000000003000000L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_5__4_in_rule__Intent__Group_4_5__33929 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_5_3__0_in_rule__Intent__Group_4_5__3__Impl3956 = new BitSet(new long[]{0x0000000002000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_5__4__Impl_in_rule__Intent__Group_4_5__43987 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_5__5_in_rule__Intent__Group_4_5__43990 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__Intent__Group_4_5__4__Impl4018 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_5__5__Impl_in_rule__Intent__Group_4_5__54049 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Intent__Group_4_5__5__Impl4077 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_5_3__0__Impl_in_rule__Intent__Group_4_5_3__04120 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_5_3__1_in_rule__Intent__Group_4_5_3__04123 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Intent__Group_4_5_3__0__Impl4151 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_5_3__1__Impl_in_rule__Intent__Group_4_5_3__14182 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__ExtraDataAssignment_4_5_3_1_in_rule__Intent__Group_4_5_3__1__Impl4209 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_6__0__Impl_in_rule__Intent__Group_4_6__04243 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_6__1_in_rule__Intent__Group_4_6__04246 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__Intent__Group_4_6__0__Impl4274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_6__1__Impl_in_rule__Intent__Group_4_6__14305 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_6__2_in_rule__Intent__Group_4_6__14308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__Intent__Group_4_6__1__Impl4336 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_6__2__Impl_in_rule__Intent__Group_4_6__24367 = new BitSet(new long[]{0x0000000003000000L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_6__3_in_rule__Intent__Group_4_6__24370 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__Intent__Group_4_6__2__Impl4398 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_6__3__Impl_in_rule__Intent__Group_4_6__34429 = new BitSet(new long[]{0x0000000003000000L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_6__4_in_rule__Intent__Group_4_6__34432 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_6_3__0_in_rule__Intent__Group_4_6__3__Impl4459 = new BitSet(new long[]{0x0000000002000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_6__4__Impl_in_rule__Intent__Group_4_6__44490 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__Intent__Group_4_6__4__Impl4518 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_6_3__0__Impl_in_rule__Intent__Group_4_6_3__04559 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_6_3__1_in_rule__Intent__Group_4_6_3__04562 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Intent__Group_4_6_3__0__Impl4590 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__Group_4_6_3__1__Impl_in_rule__Intent__Group_4_6_3__14621 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent__ReturnDataAssignment_4_6_3_1_in_rule__Intent__Group_4_6_3__1__Impl4648 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtraData__Group__0__Impl_in_rule__ExtraData__Group__04682 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__ExtraData__Group__1_in_rule__ExtraData__Group__04685 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtraData__Group__1__Impl_in_rule__ExtraData__Group__14743 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_rule__ExtraData__Group__2_in_rule__ExtraData__Group__14746 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__ExtraData__Group__1__Impl4774 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtraData__Group__2__Impl_in_rule__ExtraData__Group__24805 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__ExtraData__Group__3_in_rule__ExtraData__Group__24808 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtraData__Group_2__0_in_rule__ExtraData__Group__2__Impl4835 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtraData__Group__3__Impl_in_rule__ExtraData__Group__34865 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__ExtraData__Group__4_in_rule__ExtraData__Group__34868 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__ExtraData__Group__3__Impl4896 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtraData__Group__4__Impl_in_rule__ExtraData__Group__44927 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__ExtraData__Group__5_in_rule__ExtraData__Group__44930 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtraData__Group_4__0_in_rule__ExtraData__Group__4__Impl4957 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtraData__Group__5__Impl_in_rule__ExtraData__Group__54987 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__ExtraData__Group__5__Impl5015 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtraData__Group_2__0__Impl_in_rule__ExtraData__Group_2__05058 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__ExtraData__Group_2__1_in_rule__ExtraData__Group_2__05061 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__ExtraData__Group_2__0__Impl5089 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtraData__Group_2__1__Impl_in_rule__ExtraData__Group_2__15120 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__ExtraData__Group_2__2_in_rule__ExtraData__Group_2__15123 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__ExtraData__Group_2__1__Impl5151 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtraData__Group_2__2__Impl_in_rule__ExtraData__Group_2__25182 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtraData__NameAssignment_2_2_in_rule__ExtraData__Group_2__2__Impl5209 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtraData__Group_4__0__Impl_in_rule__ExtraData__Group_4__05245 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__ExtraData__Group_4__1_in_rule__ExtraData__Group_4__05248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__ExtraData__Group_4__0__Impl5276 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtraData__Group_4__1__Impl_in_rule__ExtraData__Group_4__15307 = new BitSet(new long[]{0x00000000000FF800L});
        public static final BitSet FOLLOW_rule__ExtraData__Group_4__2_in_rule__ExtraData__Group_4__15310 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__ExtraData__Group_4__1__Impl5338 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtraData__Group_4__2__Impl_in_rule__ExtraData__Group_4__25369 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtraData__TypeAssignment_4_2_in_rule__ExtraData__Group_4__2__Impl5396 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExplicitIntent__Group__0__Impl_in_rule__ExplicitIntent__Group__05432 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_rule__ExplicitIntent__Group__1_in_rule__ExplicitIntent__Group__05435 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExplicitIntent__Group__1__Impl_in_rule__ExplicitIntent__Group__15493 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__ExplicitIntent__Group__1__Impl5521 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ImplicitIntent__Group__0__Impl_in_rule__ImplicitIntent__Group__05556 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_rule__ImplicitIntent__Group__1_in_rule__ImplicitIntent__Group__05559 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ImplicitIntent__Group__1__Impl_in_rule__ImplicitIntent__Group__15617 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__ImplicitIntent__Group__1__Impl5645 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BroadcastIntent__Group__0__Impl_in_rule__BroadcastIntent__Group__05680 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_rule__BroadcastIntent__Group__1_in_rule__BroadcastIntent__Group__05683 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BroadcastIntent__Group__1__Impl_in_rule__BroadcastIntent__Group__15741 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_rule__BroadcastIntent__Group__1__Impl5769 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ServiceIntent__Group__0__Impl_in_rule__ServiceIntent__Group__05804 = new BitSet(new long[]{0x0000007800000000L});
        public static final BitSet FOLLOW_rule__ServiceIntent__Group__1_in_rule__ServiceIntent__Group__05807 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ServiceIntent__Group__1__Impl_in_rule__ServiceIntent__Group__15865 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_rule__ServiceIntent__Group__1__Impl5893 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_rule__IntentModel__NameAssignment_15938 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIntent_in_rule__IntentModel__IntentsAssignment_55977 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIntent_in_rule__IntentModel__IntentsAssignment_7_26008 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Intent__NameAssignment_4_0_26039 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Intent__ActionAssignment_4_1_26070 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Intent__CategoryAssignment_4_2_26101 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Intent__MetaCategoryAssignment_4_3_26132 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Intent__DataURIAssignment_4_4_26163 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExtraData_in_rule__Intent__ExtraDataAssignment_4_5_3_16194 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExtraData_in_rule__Intent__ReturnDataAssignment_4_6_3_16225 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__ExtraData__NameAssignment_2_26256 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSimpleTypeEnum_in_rule__ExtraData__TypeAssignment_4_26287 = new BitSet(new long[]{0x0000000000000002L});
    }


}