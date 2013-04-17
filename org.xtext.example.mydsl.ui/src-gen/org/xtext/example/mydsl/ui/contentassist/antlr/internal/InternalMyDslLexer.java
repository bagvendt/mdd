package org.xtext.example.mydsl.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslLexer extends Lexer {
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
    public static final int EOF=-1;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__19=19;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_STRING=4;
    public static final int T__16=16;
    public static final int T__33=33;
    public static final int T__15=15;
    public static final int T__34=34;
    public static final int T__18=18;
    public static final int T__35=35;
    public static final int T__17=17;
    public static final int T__36=36;
    public static final int T__12=12;
    public static final int T__37=37;
    public static final int T__11=11;
    public static final int T__38=38;
    public static final int T__14=14;
    public static final int T__39=39;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;

    // delegates
    // delegators

    public InternalMyDslLexer() {;} 
    public InternalMyDslLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalMyDslLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g"; }

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:11:7: ( 'boolean' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:11:9: 'boolean'
            {
            match("boolean"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:12:7: ( 'Bundle' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:12:9: 'Bundle'
            {
            match("Bundle"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:13:7: ( 'byte' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:13:9: 'byte'
            {
            match("byte"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:14:7: ( 'double' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:14:9: 'double'
            {
            match("double"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:15:7: ( 'float' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:15:9: 'float'
            {
            match("float"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:16:7: ( 'integer' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:16:9: 'integer'
            {
            match("integer"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:17:7: ( 'long' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:17:9: 'long'
            {
            match("long"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:18:7: ( 'short' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:18:9: 'short'
            {
            match("short"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19:7: ( 'String' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19:9: 'String'
            {
            match("String"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:20:7: ( '=' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:20:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:21:7: ( '[' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:21:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:22:7: ( '{' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:22:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:23:7: ( '}' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:23:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:24:7: ( ']' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:24:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:25:7: ( ',' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:25:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:26:7: ( 'Type' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:26:9: 'Type'
            {
            match("Type"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:27:7: ( ':' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:27:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:28:7: ( 'Name' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:28:9: 'Name'
            {
            match("Name"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:29:7: ( 'Action' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:29:9: 'Action'
            {
            match("Action"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:30:7: ( 'Category' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:30:9: 'Category'
            {
            match("Category"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:31:7: ( 'Meta-Category' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:31:9: 'Meta-Category'
            {
            match("Meta-Category"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:32:7: ( 'DataURI' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:32:9: 'DataURI'
            {
            match("DataURI"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:33:7: ( 'DataExtra' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:33:9: 'DataExtra'
            {
            match("DataExtra"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:34:7: ( 'ReturnData' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:34:9: 'ReturnData'
            {
            match("ReturnData"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:35:7: ( '\\'ExplicitIntent\\'' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:35:9: '\\'ExplicitIntent\\''
            {
            match("'ExplicitIntent'"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:36:7: ( '\\'ImplicitIntent\\'' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:36:9: '\\'ImplicitIntent\\''
            {
            match("'ImplicitIntent'"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:37:7: ( '\\'BroadcastIntent\\'' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:37:9: '\\'BroadcastIntent\\''
            {
            match("'BroadcastIntent'"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:38:7: ( '\\'ServiceIntent\\'' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:38:9: '\\'ServiceIntent\\''
            {
            match("'ServiceIntent'"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:39:7: ( 'Model' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:39:9: 'Model'
            {
            match("Model"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3284:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3284:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3284:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3284:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3284:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3286:10: ( ( '0' .. '9' )+ )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3286:12: ( '0' .. '9' )+
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3286:12: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3286:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3288:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3288:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3288:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\"') ) {
                alt6=1;
            }
            else if ( (LA6_0=='\'') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3288:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3288:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFF')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3288:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3288:66: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3288:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3288:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3288:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3288:137: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3290:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3290:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3290:24: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFF')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3290:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3292:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3292:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3292:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3292:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3292:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3292:41: ( '\\r' )? '\\n'
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3292:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3292:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3294:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3294:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3294:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3296:16: ( . )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3296:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:8: ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=36;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:10: T__11
                {
                mT__11(); 

                }
                break;
            case 2 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:16: T__12
                {
                mT__12(); 

                }
                break;
            case 3 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:22: T__13
                {
                mT__13(); 

                }
                break;
            case 4 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:28: T__14
                {
                mT__14(); 

                }
                break;
            case 5 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:34: T__15
                {
                mT__15(); 

                }
                break;
            case 6 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:40: T__16
                {
                mT__16(); 

                }
                break;
            case 7 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:46: T__17
                {
                mT__17(); 

                }
                break;
            case 8 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:52: T__18
                {
                mT__18(); 

                }
                break;
            case 9 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:58: T__19
                {
                mT__19(); 

                }
                break;
            case 10 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:64: T__20
                {
                mT__20(); 

                }
                break;
            case 11 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:70: T__21
                {
                mT__21(); 

                }
                break;
            case 12 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:76: T__22
                {
                mT__22(); 

                }
                break;
            case 13 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:82: T__23
                {
                mT__23(); 

                }
                break;
            case 14 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:88: T__24
                {
                mT__24(); 

                }
                break;
            case 15 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:94: T__25
                {
                mT__25(); 

                }
                break;
            case 16 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:100: T__26
                {
                mT__26(); 

                }
                break;
            case 17 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:106: T__27
                {
                mT__27(); 

                }
                break;
            case 18 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:112: T__28
                {
                mT__28(); 

                }
                break;
            case 19 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:118: T__29
                {
                mT__29(); 

                }
                break;
            case 20 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:124: T__30
                {
                mT__30(); 

                }
                break;
            case 21 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:130: T__31
                {
                mT__31(); 

                }
                break;
            case 22 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:136: T__32
                {
                mT__32(); 

                }
                break;
            case 23 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:142: T__33
                {
                mT__33(); 

                }
                break;
            case 24 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:148: T__34
                {
                mT__34(); 

                }
                break;
            case 25 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:154: T__35
                {
                mT__35(); 

                }
                break;
            case 26 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:160: T__36
                {
                mT__36(); 

                }
                break;
            case 27 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:166: T__37
                {
                mT__37(); 

                }
                break;
            case 28 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:172: T__38
                {
                mT__38(); 

                }
                break;
            case 29 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:178: T__39
                {
                mT__39(); 

                }
                break;
            case 30 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:184: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 31 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:192: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 32 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:201: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 33 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:213: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 34 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:229: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 35 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:245: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 36 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:253: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\1\uffff\10\41\6\uffff\1\41\1\uffff\6\41\2\36\2\uffff\2\36\2\uffff"+
        "\2\41\1\uffff\7\41\6\uffff\1\41\1\uffff\7\41\11\uffff\21\41\4\uffff"+
        "\1\41\1\154\4\41\1\161\2\41\1\164\1\165\6\41\4\uffff\1\41\1\uffff"+
        "\2\41\1\u0084\1\41\1\uffff\1\u0086\1\41\2\uffff\2\41\1\uffff\1\u008a"+
        "\3\41\4\uffff\1\41\1\u0093\1\u0094\1\uffff\1\41\1\uffff\1\u0096"+
        "\1\u0097\1\41\1\uffff\3\41\4\uffff\1\u00a0\2\uffff\1\u00a1\2\uffff"+
        "\1\41\1\u00a3\2\41\6\uffff\1\u00aa\1\uffff\2\41\5\uffff\1\u00b1"+
        "\1\41\5\uffff\1\u00b7\41\uffff";
    static final String DFA12_eofS =
        "\u00d4\uffff";
    static final String DFA12_minS =
        "\1\0\1\157\1\165\1\157\1\154\1\156\1\157\1\150\1\164\6\uffff\1"+
        "\171\1\uffff\1\141\1\143\1\141\1\145\1\141\1\145\1\0\1\101\2\uffff"+
        "\1\0\1\52\2\uffff\1\157\1\164\1\uffff\1\156\1\165\1\157\1\164\1"+
        "\156\1\157\1\162\6\uffff\1\160\1\uffff\1\155\3\164\1\144\2\164\4"+
        "\0\5\uffff\1\154\1\145\1\144\1\142\1\141\1\145\1\147\1\162\1\151"+
        "\2\145\1\151\1\145\1\141\1\145\1\141\1\165\4\0\1\145\1\60\2\154"+
        "\1\164\1\147\1\60\1\164\1\156\2\60\1\157\1\147\1\55\1\154\1\105"+
        "\1\162\4\0\1\141\1\uffff\2\145\1\60\1\145\1\uffff\1\60\1\147\2\uffff"+
        "\1\156\1\157\1\uffff\1\60\1\122\1\170\1\156\4\0\1\156\2\60\1\uffff"+
        "\1\162\1\uffff\2\60\1\162\1\uffff\1\111\1\164\1\104\4\0\1\60\2\uffff"+
        "\1\60\2\uffff\1\171\1\60\1\162\1\141\4\0\2\uffff\1\60\1\uffff\1"+
        "\141\1\164\4\0\1\uffff\1\60\1\141\4\0\1\uffff\1\60\4\0\1\uffff\23"+
        "\0\3\uffff\1\0\5\uffff";
    static final String DFA12_maxS =
        "\1\uffff\1\171\1\165\1\157\1\154\1\156\1\157\1\150\1\164\6\uffff"+
        "\1\171\1\uffff\1\141\1\143\1\141\1\157\1\141\1\145\1\uffff\1\172"+
        "\2\uffff\1\uffff\1\57\2\uffff\1\157\1\164\1\uffff\1\156\1\165\1"+
        "\157\1\164\1\156\1\157\1\162\6\uffff\1\160\1\uffff\1\155\3\164\1"+
        "\144\2\164\4\uffff\5\uffff\1\154\1\145\1\144\1\142\1\141\1\145\1"+
        "\147\1\162\1\151\2\145\1\151\1\145\1\141\1\145\1\141\1\165\4\uffff"+
        "\1\145\1\172\2\154\1\164\1\147\1\172\1\164\1\156\2\172\1\157\1\147"+
        "\1\55\1\154\1\125\1\162\4\uffff\1\141\1\uffff\2\145\1\172\1\145"+
        "\1\uffff\1\172\1\147\2\uffff\1\156\1\157\1\uffff\1\172\1\122\1\170"+
        "\1\156\4\uffff\1\156\2\172\1\uffff\1\162\1\uffff\2\172\1\162\1\uffff"+
        "\1\111\1\164\1\104\4\uffff\1\172\2\uffff\1\172\2\uffff\1\171\1\172"+
        "\1\162\1\141\4\uffff\2\uffff\1\172\1\uffff\1\141\1\164\4\uffff\1"+
        "\uffff\1\172\1\141\4\uffff\1\uffff\1\172\4\uffff\1\uffff\23\uffff"+
        "\3\uffff\1\uffff\5\uffff";
    static final String DFA12_acceptS =
        "\11\uffff\1\12\1\13\1\14\1\15\1\16\1\17\1\uffff\1\21\10\uffff\1"+
        "\36\1\37\2\uffff\1\43\1\44\2\uffff\1\36\7\uffff\1\12\1\13\1\14\1"+
        "\15\1\16\1\17\1\uffff\1\21\13\uffff\1\40\1\37\1\41\1\42\1\43\53"+
        "\uffff\1\3\4\uffff\1\7\2\uffff\1\20\1\22\2\uffff\1\25\13\uffff\1"+
        "\5\1\uffff\1\10\3\uffff\1\35\10\uffff\1\2\1\4\1\uffff\1\11\1\23"+
        "\10\uffff\1\1\1\6\1\uffff\1\26\6\uffff\1\24\6\uffff\1\27\5\uffff"+
        "\1\30\23\uffff\1\34\1\31\1\32\1\uffff\1\34\1\31\1\32\2\33";
    static final String DFA12_specialS =
        "\1\60\26\uffff\1\71\3\uffff\1\72\34\uffff\1\30\1\17\1\47\1\12\26"+
        "\uffff\1\31\1\16\1\46\1\13\21\uffff\1\32\1\63\1\45\1\14\22\uffff"+
        "\1\33\1\64\1\53\1\6\15\uffff\1\34\1\61\1\52\1\7\12\uffff\1\21\1"+
        "\62\1\51\1\10\6\uffff\1\20\1\67\1\50\1\11\3\uffff\1\23\1\70\1\40"+
        "\1\2\2\uffff\1\22\1\65\1\37\1\3\1\uffff\1\25\1\66\1\36\1\4\1\24"+
        "\1\56\1\35\1\5\1\27\1\57\1\44\1\1\1\26\1\54\1\43\1\0\1\15\1\55\1"+
        "\42\3\uffff\1\41\5\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\36\2\35\2\36\1\35\22\36\1\35\1\36\1\33\4\36\1\27\4\36\1"+
            "\16\2\36\1\34\12\32\1\20\2\36\1\11\3\36\1\22\1\2\1\23\1\25\10"+
            "\31\1\24\1\21\3\31\1\26\1\10\1\17\6\31\1\12\1\36\1\15\1\30\1"+
            "\31\1\36\1\31\1\1\1\31\1\3\1\31\1\4\2\31\1\5\2\31\1\6\6\31\1"+
            "\7\7\31\1\13\1\36\1\14\uff82\36",
            "\1\37\11\uffff\1\40",
            "\1\42",
            "\1\43",
            "\1\44",
            "\1\45",
            "\1\46",
            "\1\47",
            "\1\50",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\57",
            "",
            "\1\61",
            "\1\62",
            "\1\63",
            "\1\64\11\uffff\1\65",
            "\1\66",
            "\1\67",
            "\102\74\1\72\2\74\1\70\3\74\1\71\11\74\1\73\uffac\74",
            "\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "",
            "\0\74",
            "\1\76\4\uffff\1\77",
            "",
            "",
            "\1\101",
            "\1\102",
            "",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\112",
            "",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "\170\74\1\122\uff87\74",
            "\155\74\1\123\uff92\74",
            "\162\74\1\124\uff8d\74",
            "\145\74\1\125\uff9a\74",
            "",
            "",
            "",
            "",
            "",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\160\74\1\147\uff8f\74",
            "\160\74\1\150\uff8f\74",
            "\157\74\1\151\uff90\74",
            "\162\74\1\152\uff8d\74",
            "\1\153",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\162",
            "\1\163",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\173\17\uffff\1\172",
            "\1\174",
            "\154\74\1\175\uff93\74",
            "\154\74\1\176\uff93\74",
            "\141\74\1\177\uff9e\74",
            "\166\74\1\u0080\uff89\74",
            "\1\u0081",
            "",
            "\1\u0082",
            "\1\u0083",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u0085",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u0087",
            "",
            "",
            "\1\u0088",
            "\1\u0089",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\151\74\1\u008e\uff96\74",
            "\151\74\1\u008f\uff96\74",
            "\144\74\1\u0090\uff9b\74",
            "\151\74\1\u0091\uff96\74",
            "\1\u0092",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "\1\u0095",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u0098",
            "",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "\143\74\1\u009c\uff9c\74",
            "\143\74\1\u009d\uff9c\74",
            "\143\74\1\u009e\uff9c\74",
            "\143\74\1\u009f\uff9c\74",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "",
            "\1\u00a2",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u00a4",
            "\1\u00a5",
            "\151\74\1\u00a6\uff96\74",
            "\151\74\1\u00a7\uff96\74",
            "\141\74\1\u00a8\uff9e\74",
            "\145\74\1\u00a9\uff9a\74",
            "",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "\1\u00ab",
            "\1\u00ac",
            "\164\74\1\u00ad\uff8b\74",
            "\164\74\1\u00ae\uff8b\74",
            "\163\74\1\u00af\uff8c\74",
            "\111\74\1\u00b0\uffb6\74",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u00b2",
            "\111\74\1\u00b3\uffb6\74",
            "\111\74\1\u00b4\uffb6\74",
            "\164\74\1\u00b5\uff8b\74",
            "\156\74\1\u00b6\uff91\74",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\156\74\1\u00b8\uff91\74",
            "\156\74\1\u00b9\uff91\74",
            "\111\74\1\u00ba\uffb6\74",
            "\164\74\1\u00bb\uff8b\74",
            "",
            "\164\74\1\u00bc\uff8b\74",
            "\164\74\1\u00bd\uff8b\74",
            "\156\74\1\u00be\uff91\74",
            "\145\74\1\u00bf\uff9a\74",
            "\145\74\1\u00c0\uff9a\74",
            "\145\74\1\u00c1\uff9a\74",
            "\164\74\1\u00c2\uff8b\74",
            "\156\74\1\u00c3\uff91\74",
            "\156\74\1\u00c4\uff91\74",
            "\156\74\1\u00c5\uff91\74",
            "\145\74\1\u00c6\uff9a\74",
            "\164\74\1\u00c7\uff8b\74",
            "\164\74\1\u00c8\uff8b\74",
            "\164\74\1\u00c9\uff8b\74",
            "\156\74\1\u00ca\uff91\74",
            "\47\74\1\u00cb\uffd8\74",
            "\47\74\1\u00cc\uffd8\74",
            "\47\74\1\u00cd\uffd8\74",
            "\164\74\1\u00ce\uff8b\74",
            "",
            "",
            "",
            "\47\74\1\u00d2\uffd8\74",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    static class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_199 = input.LA(1);

                        s = -1;
                        if ( (LA12_199=='\'') ) {s = 203;}

                        else if ( ((LA12_199>='\u0000' && LA12_199<='&')||(LA12_199>='(' && LA12_199<='\uFFFF')) ) {s = 60;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_195 = input.LA(1);

                        s = -1;
                        if ( (LA12_195=='t') ) {s = 199;}

                        else if ( ((LA12_195>='\u0000' && LA12_195<='s')||(LA12_195>='u' && LA12_195<='\uFFFF')) ) {s = 60;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_176 = input.LA(1);

                        s = -1;
                        if ( (LA12_176=='n') ) {s = 182;}

                        else if ( ((LA12_176>='\u0000' && LA12_176<='m')||(LA12_176>='o' && LA12_176<='\uFFFF')) ) {s = 60;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA12_182 = input.LA(1);

                        s = -1;
                        if ( (LA12_182=='t') ) {s = 187;}

                        else if ( ((LA12_182>='\u0000' && LA12_182<='s')||(LA12_182>='u' && LA12_182<='\uFFFF')) ) {s = 60;}

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA12_187 = input.LA(1);

                        s = -1;
                        if ( (LA12_187=='e') ) {s = 191;}

                        else if ( ((LA12_187>='\u0000' && LA12_187<='d')||(LA12_187>='f' && LA12_187<='\uFFFF')) ) {s = 60;}

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA12_191 = input.LA(1);

                        s = -1;
                        if ( (LA12_191=='n') ) {s = 195;}

                        else if ( ((LA12_191>='\u0000' && LA12_191<='m')||(LA12_191>='o' && LA12_191<='\uFFFF')) ) {s = 60;}

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA12_128 = input.LA(1);

                        s = -1;
                        if ( (LA12_128=='i') ) {s = 145;}

                        else if ( ((LA12_128>='\u0000' && LA12_128<='h')||(LA12_128>='j' && LA12_128<='\uFFFF')) ) {s = 60;}

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA12_145 = input.LA(1);

                        s = -1;
                        if ( (LA12_145=='c') ) {s = 159;}

                        else if ( ((LA12_145>='\u0000' && LA12_145<='b')||(LA12_145>='d' && LA12_145<='\uFFFF')) ) {s = 60;}

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA12_159 = input.LA(1);

                        s = -1;
                        if ( (LA12_159=='e') ) {s = 169;}

                        else if ( ((LA12_159>='\u0000' && LA12_159<='d')||(LA12_159>='f' && LA12_159<='\uFFFF')) ) {s = 60;}

                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA12_169 = input.LA(1);

                        s = -1;
                        if ( (LA12_169=='I') ) {s = 176;}

                        else if ( ((LA12_169>='\u0000' && LA12_169<='H')||(LA12_169>='J' && LA12_169<='\uFFFF')) ) {s = 60;}

                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA12_59 = input.LA(1);

                        s = -1;
                        if ( (LA12_59=='e') ) {s = 85;}

                        else if ( ((LA12_59>='\u0000' && LA12_59<='d')||(LA12_59>='f' && LA12_59<='\uFFFF')) ) {s = 60;}

                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA12_85 = input.LA(1);

                        s = -1;
                        if ( (LA12_85=='r') ) {s = 106;}

                        else if ( ((LA12_85>='\u0000' && LA12_85<='q')||(LA12_85>='s' && LA12_85<='\uFFFF')) ) {s = 60;}

                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA12_106 = input.LA(1);

                        s = -1;
                        if ( (LA12_106=='v') ) {s = 128;}

                        else if ( ((LA12_106>='\u0000' && LA12_106<='u')||(LA12_106>='w' && LA12_106<='\uFFFF')) ) {s = 60;}

                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA12_200 = input.LA(1);

                        s = -1;
                        if ( (LA12_200=='\'') ) {s = 204;}

                        else if ( ((LA12_200>='\u0000' && LA12_200<='&')||(LA12_200>='(' && LA12_200<='\uFFFF')) ) {s = 60;}

                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA12_83 = input.LA(1);

                        s = -1;
                        if ( (LA12_83=='p') ) {s = 104;}

                        else if ( ((LA12_83>='\u0000' && LA12_83<='o')||(LA12_83>='q' && LA12_83<='\uFFFF')) ) {s = 60;}

                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA12_57 = input.LA(1);

                        s = -1;
                        if ( (LA12_57=='m') ) {s = 83;}

                        else if ( ((LA12_57>='\u0000' && LA12_57<='l')||(LA12_57>='n' && LA12_57<='\uFFFF')) ) {s = 60;}

                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA12_166 = input.LA(1);

                        s = -1;
                        if ( (LA12_166=='t') ) {s = 173;}

                        else if ( ((LA12_166>='\u0000' && LA12_166<='s')||(LA12_166>='u' && LA12_166<='\uFFFF')) ) {s = 60;}

                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA12_156 = input.LA(1);

                        s = -1;
                        if ( (LA12_156=='i') ) {s = 166;}

                        else if ( ((LA12_156>='\u0000' && LA12_156<='h')||(LA12_156>='j' && LA12_156<='\uFFFF')) ) {s = 60;}

                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA12_179 = input.LA(1);

                        s = -1;
                        if ( (LA12_179=='n') ) {s = 184;}

                        else if ( ((LA12_179>='\u0000' && LA12_179<='m')||(LA12_179>='o' && LA12_179<='\uFFFF')) ) {s = 60;}

                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA12_173 = input.LA(1);

                        s = -1;
                        if ( (LA12_173=='I') ) {s = 179;}

                        else if ( ((LA12_173>='\u0000' && LA12_173<='H')||(LA12_173>='J' && LA12_173<='\uFFFF')) ) {s = 60;}

                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA12_188 = input.LA(1);

                        s = -1;
                        if ( (LA12_188=='e') ) {s = 192;}

                        else if ( ((LA12_188>='\u0000' && LA12_188<='d')||(LA12_188>='f' && LA12_188<='\uFFFF')) ) {s = 60;}

                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA12_184 = input.LA(1);

                        s = -1;
                        if ( (LA12_184=='t') ) {s = 188;}

                        else if ( ((LA12_184>='\u0000' && LA12_184<='s')||(LA12_184>='u' && LA12_184<='\uFFFF')) ) {s = 60;}

                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA12_196 = input.LA(1);

                        s = -1;
                        if ( (LA12_196=='t') ) {s = 200;}

                        else if ( ((LA12_196>='\u0000' && LA12_196<='s')||(LA12_196>='u' && LA12_196<='\uFFFF')) ) {s = 60;}

                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA12_192 = input.LA(1);

                        s = -1;
                        if ( (LA12_192=='n') ) {s = 196;}

                        else if ( ((LA12_192>='\u0000' && LA12_192<='m')||(LA12_192>='o' && LA12_192<='\uFFFF')) ) {s = 60;}

                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA12_56 = input.LA(1);

                        s = -1;
                        if ( (LA12_56=='x') ) {s = 82;}

                        else if ( ((LA12_56>='\u0000' && LA12_56<='w')||(LA12_56>='y' && LA12_56<='\uFFFF')) ) {s = 60;}

                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA12_82 = input.LA(1);

                        s = -1;
                        if ( (LA12_82=='p') ) {s = 103;}

                        else if ( ((LA12_82>='\u0000' && LA12_82<='o')||(LA12_82>='q' && LA12_82<='\uFFFF')) ) {s = 60;}

                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA12_103 = input.LA(1);

                        s = -1;
                        if ( (LA12_103=='l') ) {s = 125;}

                        else if ( ((LA12_103>='\u0000' && LA12_103<='k')||(LA12_103>='m' && LA12_103<='\uFFFF')) ) {s = 60;}

                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA12_125 = input.LA(1);

                        s = -1;
                        if ( (LA12_125=='i') ) {s = 142;}

                        else if ( ((LA12_125>='\u0000' && LA12_125<='h')||(LA12_125>='j' && LA12_125<='\uFFFF')) ) {s = 60;}

                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA12_142 = input.LA(1);

                        s = -1;
                        if ( (LA12_142=='c') ) {s = 156;}

                        else if ( ((LA12_142>='\u0000' && LA12_142<='b')||(LA12_142>='d' && LA12_142<='\uFFFF')) ) {s = 60;}

                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA12_190 = input.LA(1);

                        s = -1;
                        if ( (LA12_190=='t') ) {s = 194;}

                        else if ( ((LA12_190>='\u0000' && LA12_190<='s')||(LA12_190>='u' && LA12_190<='\uFFFF')) ) {s = 60;}

                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA12_186 = input.LA(1);

                        s = -1;
                        if ( (LA12_186=='n') ) {s = 190;}

                        else if ( ((LA12_186>='\u0000' && LA12_186<='m')||(LA12_186>='o' && LA12_186<='\uFFFF')) ) {s = 60;}

                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA12_181 = input.LA(1);

                        s = -1;
                        if ( (LA12_181=='I') ) {s = 186;}

                        else if ( ((LA12_181>='\u0000' && LA12_181<='H')||(LA12_181>='J' && LA12_181<='\uFFFF')) ) {s = 60;}

                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA12_175 = input.LA(1);

                        s = -1;
                        if ( (LA12_175=='t') ) {s = 181;}

                        else if ( ((LA12_175>='\u0000' && LA12_175<='s')||(LA12_175>='u' && LA12_175<='\uFFFF')) ) {s = 60;}

                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA12_206 = input.LA(1);

                        s = -1;
                        if ( (LA12_206=='\'') ) {s = 210;}

                        else if ( ((LA12_206>='\u0000' && LA12_206<='&')||(LA12_206>='(' && LA12_206<='\uFFFF')) ) {s = 60;}

                        if ( s>=0 ) return s;
                        break;
                    case 34 : 
                        int LA12_202 = input.LA(1);

                        s = -1;
                        if ( (LA12_202=='t') ) {s = 206;}

                        else if ( ((LA12_202>='\u0000' && LA12_202<='s')||(LA12_202>='u' && LA12_202<='\uFFFF')) ) {s = 60;}

                        if ( s>=0 ) return s;
                        break;
                    case 35 : 
                        int LA12_198 = input.LA(1);

                        s = -1;
                        if ( (LA12_198=='n') ) {s = 202;}

                        else if ( ((LA12_198>='\u0000' && LA12_198<='m')||(LA12_198>='o' && LA12_198<='\uFFFF')) ) {s = 60;}

                        if ( s>=0 ) return s;
                        break;
                    case 36 : 
                        int LA12_194 = input.LA(1);

                        s = -1;
                        if ( (LA12_194=='e') ) {s = 198;}

                        else if ( ((LA12_194>='\u0000' && LA12_194<='d')||(LA12_194>='f' && LA12_194<='\uFFFF')) ) {s = 60;}

                        if ( s>=0 ) return s;
                        break;
                    case 37 : 
                        int LA12_105 = input.LA(1);

                        s = -1;
                        if ( (LA12_105=='a') ) {s = 127;}

                        else if ( ((LA12_105>='\u0000' && LA12_105<='`')||(LA12_105>='b' && LA12_105<='\uFFFF')) ) {s = 60;}

                        if ( s>=0 ) return s;
                        break;
                    case 38 : 
                        int LA12_84 = input.LA(1);

                        s = -1;
                        if ( (LA12_84=='o') ) {s = 105;}

                        else if ( ((LA12_84>='\u0000' && LA12_84<='n')||(LA12_84>='p' && LA12_84<='\uFFFF')) ) {s = 60;}

                        if ( s>=0 ) return s;
                        break;
                    case 39 : 
                        int LA12_58 = input.LA(1);

                        s = -1;
                        if ( (LA12_58=='r') ) {s = 84;}

                        else if ( ((LA12_58>='\u0000' && LA12_58<='q')||(LA12_58>='s' && LA12_58<='\uFFFF')) ) {s = 60;}

                        if ( s>=0 ) return s;
                        break;
                    case 40 : 
                        int LA12_168 = input.LA(1);

                        s = -1;
                        if ( (LA12_168=='s') ) {s = 175;}

                        else if ( ((LA12_168>='\u0000' && LA12_168<='r')||(LA12_168>='t' && LA12_168<='\uFFFF')) ) {s = 60;}

                        if ( s>=0 ) return s;
                        break;
                    case 41 : 
                        int LA12_158 = input.LA(1);

                        s = -1;
                        if ( (LA12_158=='a') ) {s = 168;}

                        else if ( ((LA12_158>='\u0000' && LA12_158<='`')||(LA12_158>='b' && LA12_158<='\uFFFF')) ) {s = 60;}

                        if ( s>=0 ) return s;
                        break;
                    case 42 : 
                        int LA12_144 = input.LA(1);

                        s = -1;
                        if ( (LA12_144=='c') ) {s = 158;}

                        else if ( ((LA12_144>='\u0000' && LA12_144<='b')||(LA12_144>='d' && LA12_144<='\uFFFF')) ) {s = 60;}

                        if ( s>=0 ) return s;
                        break;
                    case 43 : 
                        int LA12_127 = input.LA(1);

                        s = -1;
                        if ( (LA12_127=='d') ) {s = 144;}

                        else if ( ((LA12_127>='\u0000' && LA12_127<='c')||(LA12_127>='e' && LA12_127<='\uFFFF')) ) {s = 60;}

                        if ( s>=0 ) return s;
                        break;
                    case 44 : 
                        int LA12_197 = input.LA(1);

                        s = -1;
                        if ( (LA12_197=='t') ) {s = 201;}

                        else if ( ((LA12_197>='\u0000' && LA12_197<='s')||(LA12_197>='u' && LA12_197<='\uFFFF')) ) {s = 60;}

                        if ( s>=0 ) return s;
                        break;
                    case 45 : 
                        int LA12_201 = input.LA(1);

                        s = -1;
                        if ( (LA12_201=='\'') ) {s = 205;}

                        else if ( ((LA12_201>='\u0000' && LA12_201<='&')||(LA12_201>='(' && LA12_201<='\uFFFF')) ) {s = 60;}

                        if ( s>=0 ) return s;
                        break;
                    case 46 : 
                        int LA12_189 = input.LA(1);

                        s = -1;
                        if ( (LA12_189=='e') ) {s = 193;}

                        else if ( ((LA12_189>='\u0000' && LA12_189<='d')||(LA12_189>='f' && LA12_189<='\uFFFF')) ) {s = 60;}

                        if ( s>=0 ) return s;
                        break;
                    case 47 : 
                        int LA12_193 = input.LA(1);

                        s = -1;
                        if ( (LA12_193=='n') ) {s = 197;}

                        else if ( ((LA12_193>='\u0000' && LA12_193<='m')||(LA12_193>='o' && LA12_193<='\uFFFF')) ) {s = 60;}

                        if ( s>=0 ) return s;
                        break;
                    case 48 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0=='b') ) {s = 1;}

                        else if ( (LA12_0=='B') ) {s = 2;}

                        else if ( (LA12_0=='d') ) {s = 3;}

                        else if ( (LA12_0=='f') ) {s = 4;}

                        else if ( (LA12_0=='i') ) {s = 5;}

                        else if ( (LA12_0=='l') ) {s = 6;}

                        else if ( (LA12_0=='s') ) {s = 7;}

                        else if ( (LA12_0=='S') ) {s = 8;}

                        else if ( (LA12_0=='=') ) {s = 9;}

                        else if ( (LA12_0=='[') ) {s = 10;}

                        else if ( (LA12_0=='{') ) {s = 11;}

                        else if ( (LA12_0=='}') ) {s = 12;}

                        else if ( (LA12_0==']') ) {s = 13;}

                        else if ( (LA12_0==',') ) {s = 14;}

                        else if ( (LA12_0=='T') ) {s = 15;}

                        else if ( (LA12_0==':') ) {s = 16;}

                        else if ( (LA12_0=='N') ) {s = 17;}

                        else if ( (LA12_0=='A') ) {s = 18;}

                        else if ( (LA12_0=='C') ) {s = 19;}

                        else if ( (LA12_0=='M') ) {s = 20;}

                        else if ( (LA12_0=='D') ) {s = 21;}

                        else if ( (LA12_0=='R') ) {s = 22;}

                        else if ( (LA12_0=='\'') ) {s = 23;}

                        else if ( (LA12_0=='^') ) {s = 24;}

                        else if ( ((LA12_0>='E' && LA12_0<='L')||(LA12_0>='O' && LA12_0<='Q')||(LA12_0>='U' && LA12_0<='Z')||LA12_0=='_'||LA12_0=='a'||LA12_0=='c'||LA12_0=='e'||(LA12_0>='g' && LA12_0<='h')||(LA12_0>='j' && LA12_0<='k')||(LA12_0>='m' && LA12_0<='r')||(LA12_0>='t' && LA12_0<='z')) ) {s = 25;}

                        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {s = 26;}

                        else if ( (LA12_0=='\"') ) {s = 27;}

                        else if ( (LA12_0=='/') ) {s = 28;}

                        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 29;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='#' && LA12_0<='&')||(LA12_0>='(' && LA12_0<='+')||(LA12_0>='-' && LA12_0<='.')||(LA12_0>=';' && LA12_0<='<')||(LA12_0>='>' && LA12_0<='@')||LA12_0=='\\'||LA12_0=='`'||LA12_0=='|'||(LA12_0>='~' && LA12_0<='\uFFFF')) ) {s = 30;}

                        if ( s>=0 ) return s;
                        break;
                    case 49 : 
                        int LA12_143 = input.LA(1);

                        s = -1;
                        if ( (LA12_143=='c') ) {s = 157;}

                        else if ( ((LA12_143>='\u0000' && LA12_143<='b')||(LA12_143>='d' && LA12_143<='\uFFFF')) ) {s = 60;}

                        if ( s>=0 ) return s;
                        break;
                    case 50 : 
                        int LA12_157 = input.LA(1);

                        s = -1;
                        if ( (LA12_157=='i') ) {s = 167;}

                        else if ( ((LA12_157>='\u0000' && LA12_157<='h')||(LA12_157>='j' && LA12_157<='\uFFFF')) ) {s = 60;}

                        if ( s>=0 ) return s;
                        break;
                    case 51 : 
                        int LA12_104 = input.LA(1);

                        s = -1;
                        if ( (LA12_104=='l') ) {s = 126;}

                        else if ( ((LA12_104>='\u0000' && LA12_104<='k')||(LA12_104>='m' && LA12_104<='\uFFFF')) ) {s = 60;}

                        if ( s>=0 ) return s;
                        break;
                    case 52 : 
                        int LA12_126 = input.LA(1);

                        s = -1;
                        if ( (LA12_126=='i') ) {s = 143;}

                        else if ( ((LA12_126>='\u0000' && LA12_126<='h')||(LA12_126>='j' && LA12_126<='\uFFFF')) ) {s = 60;}

                        if ( s>=0 ) return s;
                        break;
                    case 53 : 
                        int LA12_180 = input.LA(1);

                        s = -1;
                        if ( (LA12_180=='n') ) {s = 185;}

                        else if ( ((LA12_180>='\u0000' && LA12_180<='m')||(LA12_180>='o' && LA12_180<='\uFFFF')) ) {s = 60;}

                        if ( s>=0 ) return s;
                        break;
                    case 54 : 
                        int LA12_185 = input.LA(1);

                        s = -1;
                        if ( (LA12_185=='t') ) {s = 189;}

                        else if ( ((LA12_185>='\u0000' && LA12_185<='s')||(LA12_185>='u' && LA12_185<='\uFFFF')) ) {s = 60;}

                        if ( s>=0 ) return s;
                        break;
                    case 55 : 
                        int LA12_167 = input.LA(1);

                        s = -1;
                        if ( (LA12_167=='t') ) {s = 174;}

                        else if ( ((LA12_167>='\u0000' && LA12_167<='s')||(LA12_167>='u' && LA12_167<='\uFFFF')) ) {s = 60;}

                        if ( s>=0 ) return s;
                        break;
                    case 56 : 
                        int LA12_174 = input.LA(1);

                        s = -1;
                        if ( (LA12_174=='I') ) {s = 180;}

                        else if ( ((LA12_174>='\u0000' && LA12_174<='H')||(LA12_174>='J' && LA12_174<='\uFFFF')) ) {s = 60;}

                        if ( s>=0 ) return s;
                        break;
                    case 57 : 
                        int LA12_23 = input.LA(1);

                        s = -1;
                        if ( (LA12_23=='E') ) {s = 56;}

                        else if ( (LA12_23=='I') ) {s = 57;}

                        else if ( (LA12_23=='B') ) {s = 58;}

                        else if ( (LA12_23=='S') ) {s = 59;}

                        else if ( ((LA12_23>='\u0000' && LA12_23<='A')||(LA12_23>='C' && LA12_23<='D')||(LA12_23>='F' && LA12_23<='H')||(LA12_23>='J' && LA12_23<='R')||(LA12_23>='T' && LA12_23<='\uFFFF')) ) {s = 60;}

                        else s = 30;

                        if ( s>=0 ) return s;
                        break;
                    case 58 : 
                        int LA12_27 = input.LA(1);

                        s = -1;
                        if ( ((LA12_27>='\u0000' && LA12_27<='\uFFFF')) ) {s = 60;}

                        else s = 30;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}