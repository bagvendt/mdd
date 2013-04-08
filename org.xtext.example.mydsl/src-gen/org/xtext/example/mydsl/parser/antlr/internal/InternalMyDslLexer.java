package org.xtext.example.mydsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


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

    public InternalMyDslLexer() {;} 
    public InternalMyDslLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalMyDslLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g"; }

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:11:7: ( 'Model' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:11:9: 'Model'
            {
            match("Model"); 


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
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:12:7: ( '=' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:12:9: '='
            {
            match('='); 

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
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:13:7: ( '[' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:13:9: '['
            {
            match('['); 

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
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:14:7: ( '{' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:14:9: '{'
            {
            match('{'); 

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
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:15:7: ( ',' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:15:9: ','
            {
            match(','); 

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
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:16:7: ( '}' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:16:9: '}'
            {
            match('}'); 

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
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:17:7: ( ']' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:17:9: ']'
            {
            match(']'); 

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
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:18:7: ( 'Type' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:18:9: 'Type'
            {
            match("Type"); 


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
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:19:7: ( ':' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:19:9: ':'
            {
            match(':'); 

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
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:20:7: ( 'Name' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:20:9: 'Name'
            {
            match("Name"); 


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
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:21:7: ( 'Action' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:21:9: 'Action'
            {
            match("Action"); 


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
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:22:7: ( 'Category' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:22:9: 'Category'
            {
            match("Category"); 


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
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:23:7: ( 'DataURI' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:23:9: 'DataURI'
            {
            match("DataURI"); 


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
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:24:7: ( 'DataExtra' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:24:9: 'DataExtra'
            {
            match("DataExtra"); 


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
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:25:7: ( 'ReturnData' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:25:9: 'ReturnData'
            {
            match("ReturnData"); 


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
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:26:7: ( '\\'ExplicitIntent\\'' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:26:9: '\\'ExplicitIntent\\''
            {
            match("'ExplicitIntent'"); 


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
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:27:7: ( '\\'ImplicitIntent\\'' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:27:9: '\\'ImplicitIntent\\''
            {
            match("'ImplicitIntent'"); 


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
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:28:7: ( '\\'BroadcastIntent\\'' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:28:9: '\\'BroadcastIntent\\''
            {
            match("'BroadcastIntent'"); 


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
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:29:7: ( '\\'ServiceIntent\\'' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:29:9: '\\'ServiceIntent\\''
            {
            match("'ServiceIntent'"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:727:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:727:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:727:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:727:11: '^'
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

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:727:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:
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
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:729:10: ( ( '0' .. '9' )+ )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:729:12: ( '0' .. '9' )+
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:729:12: ( '0' .. '9' )+
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
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:729:13: '0' .. '9'
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
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:731:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:731:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:731:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:731:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:731:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:731:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:731:66: ~ ( ( '\\\\' | '\"' ) )
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
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:731:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:731:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:731:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:731:137: ~ ( ( '\\\\' | '\\'' ) )
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
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:733:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:733:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:733:24: ( options {greedy=false; } : . )*
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
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:733:52: .
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
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:735:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:735:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:735:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:735:24: ~ ( ( '\\n' | '\\r' ) )
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

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:735:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:735:41: ( '\\r' )? '\\n'
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:735:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:735:41: '\\r'
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
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:737:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:737:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:737:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:
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
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:739:16: ( . )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:739:18: .
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
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1:8: ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=26;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1:10: T__11
                {
                mT__11(); 

                }
                break;
            case 2 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1:16: T__12
                {
                mT__12(); 

                }
                break;
            case 3 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1:22: T__13
                {
                mT__13(); 

                }
                break;
            case 4 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1:28: T__14
                {
                mT__14(); 

                }
                break;
            case 5 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1:34: T__15
                {
                mT__15(); 

                }
                break;
            case 6 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1:40: T__16
                {
                mT__16(); 

                }
                break;
            case 7 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1:46: T__17
                {
                mT__17(); 

                }
                break;
            case 8 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1:52: T__18
                {
                mT__18(); 

                }
                break;
            case 9 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1:58: T__19
                {
                mT__19(); 

                }
                break;
            case 10 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1:64: T__20
                {
                mT__20(); 

                }
                break;
            case 11 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1:70: T__21
                {
                mT__21(); 

                }
                break;
            case 12 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1:76: T__22
                {
                mT__22(); 

                }
                break;
            case 13 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1:82: T__23
                {
                mT__23(); 

                }
                break;
            case 14 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1:88: T__24
                {
                mT__24(); 

                }
                break;
            case 15 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1:94: T__25
                {
                mT__25(); 

                }
                break;
            case 16 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1:100: T__26
                {
                mT__26(); 

                }
                break;
            case 17 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1:106: T__27
                {
                mT__27(); 

                }
                break;
            case 18 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1:112: T__28
                {
                mT__28(); 

                }
                break;
            case 19 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1:118: T__29
                {
                mT__29(); 

                }
                break;
            case 20 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1:124: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 21 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1:132: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 22 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1:141: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 23 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1:153: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 24 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1:169: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 25 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1:185: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 26 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1:193: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\1\uffff\1\30\6\uffff\1\30\1\uffff\5\30\2\26\2\uffff\2\26\2\uffff"+
        "\1\30\7\uffff\1\30\1\uffff\5\30\11\uffff\7\30\4\uffff\1\30\1\106"+
        "\1\107\4\30\4\uffff\1\121\2\uffff\5\30\5\uffff\1\133\4\30\5\uffff"+
        "\1\30\1\145\2\30\4\uffff\1\154\1\uffff\2\30\5\uffff\1\163\1\30\5"+
        "\uffff\1\171\41\uffff";
    static final String DFA12_eofS =
        "\u0096\uffff";
    static final String DFA12_minS =
        "\1\0\1\157\6\uffff\1\171\1\uffff\1\141\1\143\2\141\1\145\1\0\1\101"+
        "\2\uffff\1\0\1\52\2\uffff\1\144\7\uffff\1\160\1\uffff\1\155\4\164"+
        "\4\0\5\uffff\3\145\1\151\1\145\1\141\1\165\4\0\1\154\2\60\1\157"+
        "\1\147\1\105\1\162\4\0\1\60\2\uffff\1\156\1\157\1\122\1\170\1\156"+
        "\4\0\1\uffff\1\60\1\162\1\111\1\164\1\104\4\0\1\uffff\1\171\1\60"+
        "\1\162\1\141\4\0\1\60\1\uffff\1\141\1\164\4\0\1\uffff\1\60\1\141"+
        "\4\0\1\uffff\1\60\4\0\1\uffff\23\0\3\uffff\1\0\5\uffff";
    static final String DFA12_maxS =
        "\1\uffff\1\157\6\uffff\1\171\1\uffff\1\141\1\143\2\141\1\145\1\uffff"+
        "\1\172\2\uffff\1\uffff\1\57\2\uffff\1\144\7\uffff\1\160\1\uffff"+
        "\1\155\4\164\4\uffff\5\uffff\3\145\1\151\1\145\1\141\1\165\4\uffff"+
        "\1\154\2\172\1\157\1\147\1\125\1\162\4\uffff\1\172\2\uffff\1\156"+
        "\1\157\1\122\1\170\1\156\4\uffff\1\uffff\1\172\1\162\1\111\1\164"+
        "\1\104\4\uffff\1\uffff\1\171\1\172\1\162\1\141\4\uffff\1\172\1\uffff"+
        "\1\141\1\164\4\uffff\1\uffff\1\172\1\141\4\uffff\1\uffff\1\172\4"+
        "\uffff\1\uffff\23\uffff\3\uffff\1\uffff\5\uffff";
    static final String DFA12_acceptS =
        "\2\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\uffff\1\11\7\uffff\1\24\1\25"+
        "\2\uffff\1\31\1\32\1\uffff\1\24\1\2\1\3\1\4\1\5\1\6\1\7\1\uffff"+
        "\1\11\11\uffff\1\26\1\25\1\27\1\30\1\31\27\uffff\1\10\1\12\11\uffff"+
        "\1\1\11\uffff\1\13\11\uffff\1\15\6\uffff\1\14\6\uffff\1\16\5\uffff"+
        "\1\17\23\uffff\1\23\1\20\1\21\1\uffff\1\23\1\20\1\21\2\22";
    static final String DFA12_specialS =
        "\1\70\16\uffff\1\13\3\uffff\1\54\22\uffff\1\14\1\1\1\33\1\67\14"+
        "\uffff\1\16\1\2\1\31\1\72\7\uffff\1\15\1\47\1\32\1\71\10\uffff\1"+
        "\20\1\46\1\36\1\64\6\uffff\1\17\1\45\1\37\1\63\5\uffff\1\3\1\44"+
        "\1\34\1\66\4\uffff\1\4\1\53\1\35\1\65\3\uffff\1\5\1\52\1\23\1\60"+
        "\2\uffff\1\6\1\51\1\24\1\57\1\uffff\1\7\1\50\1\21\1\62\1\10\1\43"+
        "\1\22\1\61\1\11\1\42\1\27\1\55\1\12\1\41\1\30\1\56\1\0\1\40\1\25"+
        "\3\uffff\1\26\5\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\26\2\25\2\26\1\25\22\26\1\25\1\26\1\23\4\26\1\17\4\26\1"+
            "\5\2\26\1\24\12\22\1\11\2\26\1\2\3\26\1\13\1\21\1\14\1\15\10"+
            "\21\1\1\1\12\3\21\1\16\1\21\1\10\6\21\1\3\1\26\1\7\1\20\1\21"+
            "\1\26\32\21\1\4\1\26\1\6\uff82\26",
            "\1\27",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\37",
            "",
            "\1\41",
            "\1\42",
            "\1\43",
            "\1\44",
            "\1\45",
            "\102\52\1\50\2\52\1\46\3\52\1\47\11\52\1\51\uffac\52",
            "\32\30\4\uffff\1\30\1\uffff\32\30",
            "",
            "",
            "\0\52",
            "\1\54\4\uffff\1\55",
            "",
            "",
            "\1\57",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\60",
            "",
            "\1\61",
            "\1\62",
            "\1\63",
            "\1\64",
            "\1\65",
            "\170\52\1\66\uff87\52",
            "\155\52\1\67\uff92\52",
            "\162\52\1\70\uff8d\52",
            "\145\52\1\71\uff9a\52",
            "",
            "",
            "",
            "",
            "",
            "\1\72",
            "\1\73",
            "\1\74",
            "\1\75",
            "\1\76",
            "\1\77",
            "\1\100",
            "\160\52\1\101\uff8f\52",
            "\160\52\1\102\uff8f\52",
            "\157\52\1\103\uff90\52",
            "\162\52\1\104\uff8d\52",
            "\1\105",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\110",
            "\1\111",
            "\1\113\17\uffff\1\112",
            "\1\114",
            "\154\52\1\115\uff93\52",
            "\154\52\1\116\uff93\52",
            "\141\52\1\117\uff9e\52",
            "\166\52\1\120\uff89\52",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "",
            "",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "\151\52\1\127\uff96\52",
            "\151\52\1\130\uff96\52",
            "\144\52\1\131\uff9b\52",
            "\151\52\1\132\uff96\52",
            "",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\143\52\1\140\uff9c\52",
            "\143\52\1\141\uff9c\52",
            "\143\52\1\142\uff9c\52",
            "\143\52\1\143\uff9c\52",
            "",
            "\1\144",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\146",
            "\1\147",
            "\151\52\1\150\uff96\52",
            "\151\52\1\151\uff96\52",
            "\141\52\1\152\uff9e\52",
            "\145\52\1\153\uff9a\52",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "",
            "\1\155",
            "\1\156",
            "\164\52\1\157\uff8b\52",
            "\164\52\1\160\uff8b\52",
            "\163\52\1\161\uff8c\52",
            "\111\52\1\162\uffb6\52",
            "",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\164",
            "\111\52\1\165\uffb6\52",
            "\111\52\1\166\uffb6\52",
            "\164\52\1\167\uff8b\52",
            "\156\52\1\170\uff91\52",
            "",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\156\52\1\172\uff91\52",
            "\156\52\1\173\uff91\52",
            "\111\52\1\174\uffb6\52",
            "\164\52\1\175\uff8b\52",
            "",
            "\164\52\1\176\uff8b\52",
            "\164\52\1\177\uff8b\52",
            "\156\52\1\u0080\uff91\52",
            "\145\52\1\u0081\uff9a\52",
            "\145\52\1\u0082\uff9a\52",
            "\145\52\1\u0083\uff9a\52",
            "\164\52\1\u0084\uff8b\52",
            "\156\52\1\u0085\uff91\52",
            "\156\52\1\u0086\uff91\52",
            "\156\52\1\u0087\uff91\52",
            "\145\52\1\u0088\uff9a\52",
            "\164\52\1\u0089\uff8b\52",
            "\164\52\1\u008a\uff8b\52",
            "\164\52\1\u008b\uff8b\52",
            "\156\52\1\u008c\uff91\52",
            "\47\52\1\u008d\uffd8\52",
            "\47\52\1\u008e\uffd8\52",
            "\47\52\1\u008f\uffd8\52",
            "\164\52\1\u0090\uff8b\52",
            "",
            "",
            "",
            "\47\52\1\u0094\uffd8\52",
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
            return "1:1: Tokens : ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_138 = input.LA(1);

                        s = -1;
                        if ( (LA12_138=='\'') ) {s = 142;}

                        else if ( ((LA12_138>='\u0000' && LA12_138<='&')||(LA12_138>='(' && LA12_138<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_39 = input.LA(1);

                        s = -1;
                        if ( (LA12_39=='m') ) {s = 55;}

                        else if ( ((LA12_39>='\u0000' && LA12_39<='l')||(LA12_39>='n' && LA12_39<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_55 = input.LA(1);

                        s = -1;
                        if ( (LA12_55=='p') ) {s = 66;}

                        else if ( ((LA12_55>='\u0000' && LA12_55<='o')||(LA12_55>='q' && LA12_55<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA12_96 = input.LA(1);

                        s = -1;
                        if ( (LA12_96=='i') ) {s = 104;}

                        else if ( ((LA12_96>='\u0000' && LA12_96<='h')||(LA12_96>='j' && LA12_96<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA12_104 = input.LA(1);

                        s = -1;
                        if ( (LA12_104=='t') ) {s = 111;}

                        else if ( ((LA12_104>='\u0000' && LA12_104<='s')||(LA12_104>='u' && LA12_104<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA12_111 = input.LA(1);

                        s = -1;
                        if ( (LA12_111=='I') ) {s = 117;}

                        else if ( ((LA12_111>='\u0000' && LA12_111<='H')||(LA12_111>='J' && LA12_111<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA12_117 = input.LA(1);

                        s = -1;
                        if ( (LA12_117=='n') ) {s = 122;}

                        else if ( ((LA12_117>='\u0000' && LA12_117<='m')||(LA12_117>='o' && LA12_117<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA12_122 = input.LA(1);

                        s = -1;
                        if ( (LA12_122=='t') ) {s = 126;}

                        else if ( ((LA12_122>='\u0000' && LA12_122<='s')||(LA12_122>='u' && LA12_122<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA12_126 = input.LA(1);

                        s = -1;
                        if ( (LA12_126=='e') ) {s = 130;}

                        else if ( ((LA12_126>='\u0000' && LA12_126<='d')||(LA12_126>='f' && LA12_126<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA12_130 = input.LA(1);

                        s = -1;
                        if ( (LA12_130=='n') ) {s = 134;}

                        else if ( ((LA12_130>='\u0000' && LA12_130<='m')||(LA12_130>='o' && LA12_130<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA12_134 = input.LA(1);

                        s = -1;
                        if ( (LA12_134=='t') ) {s = 138;}

                        else if ( ((LA12_134>='\u0000' && LA12_134<='s')||(LA12_134>='u' && LA12_134<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA12_15 = input.LA(1);

                        s = -1;
                        if ( (LA12_15=='E') ) {s = 38;}

                        else if ( (LA12_15=='I') ) {s = 39;}

                        else if ( (LA12_15=='B') ) {s = 40;}

                        else if ( (LA12_15=='S') ) {s = 41;}

                        else if ( ((LA12_15>='\u0000' && LA12_15<='A')||(LA12_15>='C' && LA12_15<='D')||(LA12_15>='F' && LA12_15<='H')||(LA12_15>='J' && LA12_15<='R')||(LA12_15>='T' && LA12_15<='\uFFFF')) ) {s = 42;}

                        else s = 22;

                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA12_38 = input.LA(1);

                        s = -1;
                        if ( (LA12_38=='x') ) {s = 54;}

                        else if ( ((LA12_38>='\u0000' && LA12_38<='w')||(LA12_38>='y' && LA12_38<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA12_65 = input.LA(1);

                        s = -1;
                        if ( (LA12_65=='l') ) {s = 77;}

                        else if ( ((LA12_65>='\u0000' && LA12_65<='k')||(LA12_65>='m' && LA12_65<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA12_54 = input.LA(1);

                        s = -1;
                        if ( (LA12_54=='p') ) {s = 65;}

                        else if ( ((LA12_54>='\u0000' && LA12_54<='o')||(LA12_54>='q' && LA12_54<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA12_87 = input.LA(1);

                        s = -1;
                        if ( (LA12_87=='c') ) {s = 96;}

                        else if ( ((LA12_87>='\u0000' && LA12_87<='b')||(LA12_87>='d' && LA12_87<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA12_77 = input.LA(1);

                        s = -1;
                        if ( (LA12_77=='i') ) {s = 87;}

                        else if ( ((LA12_77>='\u0000' && LA12_77<='h')||(LA12_77>='j' && LA12_77<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA12_124 = input.LA(1);

                        s = -1;
                        if ( (LA12_124=='n') ) {s = 128;}

                        else if ( ((LA12_124>='\u0000' && LA12_124<='m')||(LA12_124>='o' && LA12_124<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA12_128 = input.LA(1);

                        s = -1;
                        if ( (LA12_128=='t') ) {s = 132;}

                        else if ( ((LA12_128>='\u0000' && LA12_128<='s')||(LA12_128>='u' && LA12_128<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA12_113 = input.LA(1);

                        s = -1;
                        if ( (LA12_113=='t') ) {s = 119;}

                        else if ( ((LA12_113>='\u0000' && LA12_113<='s')||(LA12_113>='u' && LA12_113<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA12_119 = input.LA(1);

                        s = -1;
                        if ( (LA12_119=='I') ) {s = 124;}

                        else if ( ((LA12_119>='\u0000' && LA12_119<='H')||(LA12_119>='J' && LA12_119<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA12_140 = input.LA(1);

                        s = -1;
                        if ( (LA12_140=='t') ) {s = 144;}

                        else if ( ((LA12_140>='\u0000' && LA12_140<='s')||(LA12_140>='u' && LA12_140<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA12_144 = input.LA(1);

                        s = -1;
                        if ( (LA12_144=='\'') ) {s = 148;}

                        else if ( ((LA12_144>='\u0000' && LA12_144<='&')||(LA12_144>='(' && LA12_144<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA12_132 = input.LA(1);

                        s = -1;
                        if ( (LA12_132=='e') ) {s = 136;}

                        else if ( ((LA12_132>='\u0000' && LA12_132<='d')||(LA12_132>='f' && LA12_132<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA12_136 = input.LA(1);

                        s = -1;
                        if ( (LA12_136=='n') ) {s = 140;}

                        else if ( ((LA12_136>='\u0000' && LA12_136<='m')||(LA12_136>='o' && LA12_136<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA12_56 = input.LA(1);

                        s = -1;
                        if ( (LA12_56=='o') ) {s = 67;}

                        else if ( ((LA12_56>='\u0000' && LA12_56<='n')||(LA12_56>='p' && LA12_56<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA12_67 = input.LA(1);

                        s = -1;
                        if ( (LA12_67=='a') ) {s = 79;}

                        else if ( ((LA12_67>='\u0000' && LA12_67<='`')||(LA12_67>='b' && LA12_67<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA12_40 = input.LA(1);

                        s = -1;
                        if ( (LA12_40=='r') ) {s = 56;}

                        else if ( ((LA12_40>='\u0000' && LA12_40<='q')||(LA12_40>='s' && LA12_40<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA12_98 = input.LA(1);

                        s = -1;
                        if ( (LA12_98=='a') ) {s = 106;}

                        else if ( ((LA12_98>='\u0000' && LA12_98<='`')||(LA12_98>='b' && LA12_98<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA12_106 = input.LA(1);

                        s = -1;
                        if ( (LA12_106=='s') ) {s = 113;}

                        else if ( ((LA12_106>='\u0000' && LA12_106<='r')||(LA12_106>='t' && LA12_106<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA12_79 = input.LA(1);

                        s = -1;
                        if ( (LA12_79=='d') ) {s = 89;}

                        else if ( ((LA12_79>='\u0000' && LA12_79<='c')||(LA12_79>='e' && LA12_79<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA12_89 = input.LA(1);

                        s = -1;
                        if ( (LA12_89=='c') ) {s = 98;}

                        else if ( ((LA12_89>='\u0000' && LA12_89<='b')||(LA12_89>='d' && LA12_89<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA12_139 = input.LA(1);

                        s = -1;
                        if ( (LA12_139=='\'') ) {s = 143;}

                        else if ( ((LA12_139>='\u0000' && LA12_139<='&')||(LA12_139>='(' && LA12_139<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA12_135 = input.LA(1);

                        s = -1;
                        if ( (LA12_135=='t') ) {s = 139;}

                        else if ( ((LA12_135>='\u0000' && LA12_135<='s')||(LA12_135>='u' && LA12_135<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 34 : 
                        int LA12_131 = input.LA(1);

                        s = -1;
                        if ( (LA12_131=='n') ) {s = 135;}

                        else if ( ((LA12_131>='\u0000' && LA12_131<='m')||(LA12_131>='o' && LA12_131<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 35 : 
                        int LA12_127 = input.LA(1);

                        s = -1;
                        if ( (LA12_127=='e') ) {s = 131;}

                        else if ( ((LA12_127>='\u0000' && LA12_127<='d')||(LA12_127>='f' && LA12_127<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 36 : 
                        int LA12_97 = input.LA(1);

                        s = -1;
                        if ( (LA12_97=='i') ) {s = 105;}

                        else if ( ((LA12_97>='\u0000' && LA12_97<='h')||(LA12_97>='j' && LA12_97<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 37 : 
                        int LA12_88 = input.LA(1);

                        s = -1;
                        if ( (LA12_88=='c') ) {s = 97;}

                        else if ( ((LA12_88>='\u0000' && LA12_88<='b')||(LA12_88>='d' && LA12_88<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 38 : 
                        int LA12_78 = input.LA(1);

                        s = -1;
                        if ( (LA12_78=='i') ) {s = 88;}

                        else if ( ((LA12_78>='\u0000' && LA12_78<='h')||(LA12_78>='j' && LA12_78<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 39 : 
                        int LA12_66 = input.LA(1);

                        s = -1;
                        if ( (LA12_66=='l') ) {s = 78;}

                        else if ( ((LA12_66>='\u0000' && LA12_66<='k')||(LA12_66>='m' && LA12_66<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 40 : 
                        int LA12_123 = input.LA(1);

                        s = -1;
                        if ( (LA12_123=='t') ) {s = 127;}

                        else if ( ((LA12_123>='\u0000' && LA12_123<='s')||(LA12_123>='u' && LA12_123<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 41 : 
                        int LA12_118 = input.LA(1);

                        s = -1;
                        if ( (LA12_118=='n') ) {s = 123;}

                        else if ( ((LA12_118>='\u0000' && LA12_118<='m')||(LA12_118>='o' && LA12_118<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 42 : 
                        int LA12_112 = input.LA(1);

                        s = -1;
                        if ( (LA12_112=='I') ) {s = 118;}

                        else if ( ((LA12_112>='\u0000' && LA12_112<='H')||(LA12_112>='J' && LA12_112<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 43 : 
                        int LA12_105 = input.LA(1);

                        s = -1;
                        if ( (LA12_105=='t') ) {s = 112;}

                        else if ( ((LA12_105>='\u0000' && LA12_105<='s')||(LA12_105>='u' && LA12_105<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 44 : 
                        int LA12_19 = input.LA(1);

                        s = -1;
                        if ( ((LA12_19>='\u0000' && LA12_19<='\uFFFF')) ) {s = 42;}

                        else s = 22;

                        if ( s>=0 ) return s;
                        break;
                    case 45 : 
                        int LA12_133 = input.LA(1);

                        s = -1;
                        if ( (LA12_133=='t') ) {s = 137;}

                        else if ( ((LA12_133>='\u0000' && LA12_133<='s')||(LA12_133>='u' && LA12_133<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 46 : 
                        int LA12_137 = input.LA(1);

                        s = -1;
                        if ( (LA12_137=='\'') ) {s = 141;}

                        else if ( ((LA12_137>='\u0000' && LA12_137<='&')||(LA12_137>='(' && LA12_137<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 47 : 
                        int LA12_120 = input.LA(1);

                        s = -1;
                        if ( (LA12_120=='t') ) {s = 125;}

                        else if ( ((LA12_120>='\u0000' && LA12_120<='s')||(LA12_120>='u' && LA12_120<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 48 : 
                        int LA12_114 = input.LA(1);

                        s = -1;
                        if ( (LA12_114=='n') ) {s = 120;}

                        else if ( ((LA12_114>='\u0000' && LA12_114<='m')||(LA12_114>='o' && LA12_114<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 49 : 
                        int LA12_129 = input.LA(1);

                        s = -1;
                        if ( (LA12_129=='n') ) {s = 133;}

                        else if ( ((LA12_129>='\u0000' && LA12_129<='m')||(LA12_129>='o' && LA12_129<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 50 : 
                        int LA12_125 = input.LA(1);

                        s = -1;
                        if ( (LA12_125=='e') ) {s = 129;}

                        else if ( ((LA12_125>='\u0000' && LA12_125<='d')||(LA12_125>='f' && LA12_125<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 51 : 
                        int LA12_90 = input.LA(1);

                        s = -1;
                        if ( (LA12_90=='c') ) {s = 99;}

                        else if ( ((LA12_90>='\u0000' && LA12_90<='b')||(LA12_90>='d' && LA12_90<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 52 : 
                        int LA12_80 = input.LA(1);

                        s = -1;
                        if ( (LA12_80=='i') ) {s = 90;}

                        else if ( ((LA12_80>='\u0000' && LA12_80<='h')||(LA12_80>='j' && LA12_80<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 53 : 
                        int LA12_107 = input.LA(1);

                        s = -1;
                        if ( (LA12_107=='I') ) {s = 114;}

                        else if ( ((LA12_107>='\u0000' && LA12_107<='H')||(LA12_107>='J' && LA12_107<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 54 : 
                        int LA12_99 = input.LA(1);

                        s = -1;
                        if ( (LA12_99=='e') ) {s = 107;}

                        else if ( ((LA12_99>='\u0000' && LA12_99<='d')||(LA12_99>='f' && LA12_99<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 55 : 
                        int LA12_41 = input.LA(1);

                        s = -1;
                        if ( (LA12_41=='e') ) {s = 57;}

                        else if ( ((LA12_41>='\u0000' && LA12_41<='d')||(LA12_41>='f' && LA12_41<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 56 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0=='M') ) {s = 1;}

                        else if ( (LA12_0=='=') ) {s = 2;}

                        else if ( (LA12_0=='[') ) {s = 3;}

                        else if ( (LA12_0=='{') ) {s = 4;}

                        else if ( (LA12_0==',') ) {s = 5;}

                        else if ( (LA12_0=='}') ) {s = 6;}

                        else if ( (LA12_0==']') ) {s = 7;}

                        else if ( (LA12_0=='T') ) {s = 8;}

                        else if ( (LA12_0==':') ) {s = 9;}

                        else if ( (LA12_0=='N') ) {s = 10;}

                        else if ( (LA12_0=='A') ) {s = 11;}

                        else if ( (LA12_0=='C') ) {s = 12;}

                        else if ( (LA12_0=='D') ) {s = 13;}

                        else if ( (LA12_0=='R') ) {s = 14;}

                        else if ( (LA12_0=='\'') ) {s = 15;}

                        else if ( (LA12_0=='^') ) {s = 16;}

                        else if ( (LA12_0=='B'||(LA12_0>='E' && LA12_0<='L')||(LA12_0>='O' && LA12_0<='Q')||LA12_0=='S'||(LA12_0>='U' && LA12_0<='Z')||LA12_0=='_'||(LA12_0>='a' && LA12_0<='z')) ) {s = 17;}

                        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {s = 18;}

                        else if ( (LA12_0=='\"') ) {s = 19;}

                        else if ( (LA12_0=='/') ) {s = 20;}

                        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 21;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='#' && LA12_0<='&')||(LA12_0>='(' && LA12_0<='+')||(LA12_0>='-' && LA12_0<='.')||(LA12_0>=';' && LA12_0<='<')||(LA12_0>='>' && LA12_0<='@')||LA12_0=='\\'||LA12_0=='`'||LA12_0=='|'||(LA12_0>='~' && LA12_0<='\uFFFF')) ) {s = 22;}

                        if ( s>=0 ) return s;
                        break;
                    case 57 : 
                        int LA12_68 = input.LA(1);

                        s = -1;
                        if ( (LA12_68=='v') ) {s = 80;}

                        else if ( ((LA12_68>='\u0000' && LA12_68<='u')||(LA12_68>='w' && LA12_68<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 58 : 
                        int LA12_57 = input.LA(1);

                        s = -1;
                        if ( (LA12_57=='r') ) {s = 68;}

                        else if ( ((LA12_57>='\u0000' && LA12_57<='q')||(LA12_57>='s' && LA12_57<='\uFFFF')) ) {s = 42;}

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