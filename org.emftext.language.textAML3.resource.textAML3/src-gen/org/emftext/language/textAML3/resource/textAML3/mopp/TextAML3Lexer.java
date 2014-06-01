// $ANTLR 3.4

	package org.emftext.language.textAML3.resource.textAML3.mopp;


import org.antlr.runtime3_4_0.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class TextAML3Lexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__19=19;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__50=50;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int LINEBREAKS=4;
    public static final int NUMBER=5;
    public static final int QUOTED_34_34=6;
    public static final int REFERENCE=7;
    public static final int TEXT=8;
    public static final int URL=9;
    public static final int VARID=10;
    public static final int WHITESPACE=11;

    	public java.util.List<org.antlr.runtime3_4_0.RecognitionException> lexerExceptions  = new java.util.ArrayList<org.antlr.runtime3_4_0.RecognitionException>();
    	public java.util.List<Integer> lexerExceptionsPosition = new java.util.ArrayList<Integer>();
    	
    	public void reportError(org.antlr.runtime3_4_0.RecognitionException e) {
    		lexerExceptions.add(e);
    		lexerExceptionsPosition.add(((org.antlr.runtime3_4_0.ANTLRStringStream) input).index());
    	}


    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public TextAML3Lexer() {} 
    public TextAML3Lexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public TextAML3Lexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "TextAML3.g"; }

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TextAML3.g:15:7: ( '#' )
            // TextAML3.g:15:9: '#'
            {
            match('#'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TextAML3.g:16:7: ( '&' )
            // TextAML3.g:16:9: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TextAML3.g:17:7: ( '(' )
            // TextAML3.g:17:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TextAML3.g:18:7: ( ')' )
            // TextAML3.g:18:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TextAML3.g:19:7: ( '*' )
            // TextAML3.g:19:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TextAML3.g:20:7: ( '+' )
            // TextAML3.g:20:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TextAML3.g:21:7: ( ',' )
            // TextAML3.g:21:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TextAML3.g:22:7: ( '-' )
            // TextAML3.g:22:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TextAML3.g:23:7: ( '.' )
            // TextAML3.g:23:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TextAML3.g:24:7: ( ':' )
            // TextAML3.g:24:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TextAML3.g:25:7: ( ';' )
            // TextAML3.g:25:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TextAML3.g:26:7: ( '<' )
            // TextAML3.g:26:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TextAML3.g:27:7: ( '=' )
            // TextAML3.g:27:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TextAML3.g:28:7: ( '>' )
            // TextAML3.g:28:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TextAML3.g:29:7: ( 'OclUndefined' )
            // TextAML3.g:29:9: 'OclUndefined'
            {
            match("OclUndefined"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TextAML3.g:30:7: ( 'error' )
            // TextAML3.g:30:9: 'error'
            {
            match("error"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TextAML3.g:31:7: ( 'first' )
            // TextAML3.g:31:9: 'first'
            {
            match("first"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TextAML3.g:32:7: ( 'flatten' )
            // TextAML3.g:32:9: 'flatten'
            {
            match("flatten"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TextAML3.g:33:7: ( 'for' )
            // TextAML3.g:33:9: 'for'
            {
            match("for"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TextAML3.g:34:7: ( 'from' )
            // TextAML3.g:34:9: 'from'
            {
            match("from"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TextAML3.g:35:7: ( 'if' )
            // TextAML3.g:35:9: 'if'
            {
            match("if"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TextAML3.g:36:7: ( 'imports' )
            // TextAML3.g:36:9: 'imports'
            {
            match("imports"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TextAML3.g:37:7: ( 'in' )
            // TextAML3.g:37:9: 'in'
            {
            match("in"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TextAML3.g:38:7: ( 'last' )
            // TextAML3.g:38:9: 'last'
            {
            match("last"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TextAML3.g:39:7: ( 'length' )
            // TextAML3.g:39:9: 'length'
            {
            match("length"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TextAML3.g:40:7: ( 'message' )
            // TextAML3.g:40:9: 'message'
            {
            match("message"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TextAML3.g:41:7: ( 'pairs' )
            // TextAML3.g:41:9: 'pairs'
            {
            match("pairs"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TextAML3.g:42:7: ( 'rules' )
            // TextAML3.g:42:9: 'rules'
            {
            match("rules"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TextAML3.g:43:7: ( 'set' )
            // TextAML3.g:43:9: 'set'
            {
            match("set"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TextAML3.g:44:7: ( 'sourceposition' )
            // TextAML3.g:44:9: 'sourceposition'
            {
            match("sourceposition"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TextAML3.g:45:7: ( 'start' )
            // TextAML3.g:45:9: 'start'
            {
            match("start"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TextAML3.g:46:7: ( 'strategy' )
            // TextAML3.g:46:9: 'strategy'
            {
            match("strategy"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TextAML3.g:47:7: ( 'strategytarget' )
            // TextAML3.g:47:9: 'strategytarget'
            {
            match("strategytarget"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TextAML3.g:48:7: ( 'to' )
            // TextAML3.g:48:9: 'to'
            {
            match("to"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TextAML3.g:49:7: ( 'typesystem' )
            // TextAML3.g:49:9: 'typesystem'
            {
            match("typesystem"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TextAML3.g:50:7: ( 'where' )
            // TextAML3.g:50:9: 'where'
            {
            match("where"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TextAML3.g:51:7: ( 'widening' )
            // TextAML3.g:51:9: 'widening'
            {
            match("widening"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TextAML3.g:52:7: ( 'with' )
            // TextAML3.g:52:9: 'with'
            {
            match("with"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TextAML3.g:53:7: ( '{' )
            // TextAML3.g:53:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TextAML3.g:54:7: ( '{{' )
            // TextAML3.g:54:9: '{{'
            {
            match("{{"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TextAML3.g:55:7: ( '}' )
            // TextAML3.g:55:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TextAML3.g:56:7: ( '}}' )
            // TextAML3.g:56:9: '}}'
            {
            match("}}"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "URL"
    public final void mURL() throws RecognitionException {
        try {
            int _type = URL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TextAML3.g:5637:4: ( ( ( 'A' .. 'Z' | 'a' .. 'z' | '_' ) ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )* '://' ( ( 'A' .. 'Z' | 'a' .. 'z' | '_' ) ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )* | ( '0' .. '9' )+ ) ( ( '.' | '/' ) ( ( 'A' .. 'Z' | 'a' .. 'z' | '_' ) ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )* | ( '0' .. '9' )+ ) )* ) )
            // TextAML3.g:5638:2: ( ( 'A' .. 'Z' | 'a' .. 'z' | '_' ) ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )* '://' ( ( 'A' .. 'Z' | 'a' .. 'z' | '_' ) ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )* | ( '0' .. '9' )+ ) ( ( '.' | '/' ) ( ( 'A' .. 'Z' | 'a' .. 'z' | '_' ) ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )* | ( '0' .. '9' )+ ) )* )
            {
            // TextAML3.g:5638:2: ( ( 'A' .. 'Z' | 'a' .. 'z' | '_' ) ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )* '://' ( ( 'A' .. 'Z' | 'a' .. 'z' | '_' ) ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )* | ( '0' .. '9' )+ ) ( ( '.' | '/' ) ( ( 'A' .. 'Z' | 'a' .. 'z' | '_' ) ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )* | ( '0' .. '9' )+ ) )* )
            // TextAML3.g:5638:2: ( 'A' .. 'Z' | 'a' .. 'z' | '_' ) ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )* '://' ( ( 'A' .. 'Z' | 'a' .. 'z' | '_' ) ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )* | ( '0' .. '9' )+ ) ( ( '.' | '/' ) ( ( 'A' .. 'Z' | 'a' .. 'z' | '_' ) ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )* | ( '0' .. '9' )+ ) )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // TextAML3.g:5638:28: ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='-'||(LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // TextAML3.g:
            	    {
            	    if ( input.LA(1)=='-'||(input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            match("://"); 



            // TextAML3.g:5638:78: ( ( 'A' .. 'Z' | 'a' .. 'z' | '_' ) ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )* | ( '0' .. '9' )+ )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0 >= 'A' && LA4_0 <= 'Z')||LA4_0=='_'||(LA4_0 >= 'a' && LA4_0 <= 'z')) ) {
                alt4=1;
            }
            else if ( ((LA4_0 >= '0' && LA4_0 <= '9')) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }
            switch (alt4) {
                case 1 :
                    // TextAML3.g:5638:79: ( 'A' .. 'Z' | 'a' .. 'z' | '_' ) ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )*
                    {
                    if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    // TextAML3.g:5638:105: ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0=='-'||(LA2_0 >= '0' && LA2_0 <= '9')||(LA2_0 >= 'A' && LA2_0 <= 'Z')||LA2_0=='_'||(LA2_0 >= 'a' && LA2_0 <= 'z')) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // TextAML3.g:
                    	    {
                    	    if ( input.LA(1)=='-'||(input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // TextAML3.g:5638:151: ( '0' .. '9' )+
                    {
                    // TextAML3.g:5638:151: ( '0' .. '9' )+
                    int cnt3=0;
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // TextAML3.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


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
                    break;

            }


            // TextAML3.g:5638:164: ( ( '.' | '/' ) ( ( 'A' .. 'Z' | 'a' .. 'z' | '_' ) ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )* | ( '0' .. '9' )+ ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0 >= '.' && LA8_0 <= '/')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // TextAML3.g:5638:165: ( '.' | '/' ) ( ( 'A' .. 'Z' | 'a' .. 'z' | '_' ) ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )* | ( '0' .. '9' )+ )
            	    {
            	    if ( (input.LA(1) >= '.' && input.LA(1) <= '/') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    // TextAML3.g:5638:174: ( ( 'A' .. 'Z' | 'a' .. 'z' | '_' ) ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )* | ( '0' .. '9' )+ )
            	    int alt7=2;
            	    int LA7_0 = input.LA(1);

            	    if ( ((LA7_0 >= 'A' && LA7_0 <= 'Z')||LA7_0=='_'||(LA7_0 >= 'a' && LA7_0 <= 'z')) ) {
            	        alt7=1;
            	    }
            	    else if ( ((LA7_0 >= '0' && LA7_0 <= '9')) ) {
            	        alt7=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 7, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt7) {
            	        case 1 :
            	            // TextAML3.g:5638:175: ( 'A' .. 'Z' | 'a' .. 'z' | '_' ) ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )*
            	            {
            	            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	                input.consume();
            	            }
            	            else {
            	                MismatchedSetException mse = new MismatchedSetException(null,input);
            	                recover(mse);
            	                throw mse;
            	            }


            	            // TextAML3.g:5638:201: ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )*
            	            loop5:
            	            do {
            	                int alt5=2;
            	                int LA5_0 = input.LA(1);

            	                if ( (LA5_0=='-'||(LA5_0 >= '0' && LA5_0 <= '9')||(LA5_0 >= 'A' && LA5_0 <= 'Z')||LA5_0=='_'||(LA5_0 >= 'a' && LA5_0 <= 'z')) ) {
            	                    alt5=1;
            	                }


            	                switch (alt5) {
            	            	case 1 :
            	            	    // TextAML3.g:
            	            	    {
            	            	    if ( input.LA(1)=='-'||(input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	            	        input.consume();
            	            	    }
            	            	    else {
            	            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	            	        recover(mse);
            	            	        throw mse;
            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop5;
            	                }
            	            } while (true);


            	            }
            	            break;
            	        case 2 :
            	            // TextAML3.g:5638:247: ( '0' .. '9' )+
            	            {
            	            // TextAML3.g:5638:247: ( '0' .. '9' )+
            	            int cnt6=0;
            	            loop6:
            	            do {
            	                int alt6=2;
            	                int LA6_0 = input.LA(1);

            	                if ( ((LA6_0 >= '0' && LA6_0 <= '9')) ) {
            	                    alt6=1;
            	                }


            	                switch (alt6) {
            	            	case 1 :
            	            	    // TextAML3.g:
            	            	    {
            	            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	            	        input.consume();
            	            	    }
            	            	    else {
            	            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	            	        recover(mse);
            	            	        throw mse;
            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    if ( cnt6 >= 1 ) break loop6;
            	                        EarlyExitException eee =
            	                            new EarlyExitException(6, input);
            	                        throw eee;
            	                }
            	                cnt6++;
            	            } while (true);


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "URL"

    // $ANTLR start "WHITESPACE"
    public final void mWHITESPACE() throws RecognitionException {
        try {
            int _type = WHITESPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TextAML3.g:5640:11: ( ( ( ' ' | '\\t' | '\\f' ) ) )
            // TextAML3.g:5641:2: ( ( ' ' | '\\t' | '\\f' ) )
            {
            if ( input.LA(1)=='\t'||input.LA(1)=='\f'||input.LA(1)==' ' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


             _channel = 99; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WHITESPACE"

    // $ANTLR start "LINEBREAKS"
    public final void mLINEBREAKS() throws RecognitionException {
        try {
            int _type = LINEBREAKS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TextAML3.g:5644:11: ( ( ( '\\r\\n' | '\\r' | '\\n' ) ) )
            // TextAML3.g:5645:2: ( ( '\\r\\n' | '\\r' | '\\n' ) )
            {
            // TextAML3.g:5645:2: ( ( '\\r\\n' | '\\r' | '\\n' ) )
            // TextAML3.g:5645:2: ( '\\r\\n' | '\\r' | '\\n' )
            {
            // TextAML3.g:5645:2: ( '\\r\\n' | '\\r' | '\\n' )
            int alt9=3;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='\r') ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1=='\n') ) {
                    alt9=1;
                }
                else {
                    alt9=2;
                }
            }
            else if ( (LA9_0=='\n') ) {
                alt9=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;

            }
            switch (alt9) {
                case 1 :
                    // TextAML3.g:5645:3: '\\r\\n'
                    {
                    match("\r\n"); 



                    }
                    break;
                case 2 :
                    // TextAML3.g:5645:10: '\\r'
                    {
                    match('\r'); 

                    }
                    break;
                case 3 :
                    // TextAML3.g:5645:15: '\\n'
                    {
                    match('\n'); 

                    }
                    break;

            }


            }


             _channel = 99; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LINEBREAKS"

    // $ANTLR start "VARID"
    public final void mVARID() throws RecognitionException {
        try {
            int _type = VARID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TextAML3.g:5648:6: ( ( '\\u0024' ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' )* ) )
            // TextAML3.g:5649:2: ( '\\u0024' ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' )* )
            {
            // TextAML3.g:5649:2: ( '\\u0024' ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' )* )
            // TextAML3.g:5649:2: '\\u0024' ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' )*
            {
            match('$'); 

            // TextAML3.g:5649:10: ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0 >= '0' && LA10_0 <= '9')||(LA10_0 >= 'A' && LA10_0 <= 'Z')||(LA10_0 >= 'a' && LA10_0 <= 'z')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // TextAML3.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "VARID"

    // $ANTLR start "NUMBER"
    public final void mNUMBER() throws RecognitionException {
        try {
            int _type = NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TextAML3.g:5651:7: ( ( ( '0' .. '9' )+ ) )
            // TextAML3.g:5652:2: ( ( '0' .. '9' )+ )
            {
            // TextAML3.g:5652:2: ( ( '0' .. '9' )+ )
            // TextAML3.g:5652:2: ( '0' .. '9' )+
            {
            // TextAML3.g:5652:2: ( '0' .. '9' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0 >= '0' && LA11_0 <= '9')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // TextAML3.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


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


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NUMBER"

    // $ANTLR start "TEXT"
    public final void mTEXT() throws RecognitionException {
        try {
            int _type = TEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TextAML3.g:5654:5: ( ( ( 'A' .. 'Z' | 'a' .. 'z' | '_' ) ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )* ) )
            // TextAML3.g:5655:2: ( ( 'A' .. 'Z' | 'a' .. 'z' | '_' ) ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )* )
            {
            // TextAML3.g:5655:2: ( ( 'A' .. 'Z' | 'a' .. 'z' | '_' ) ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )* )
            // TextAML3.g:5655:2: ( 'A' .. 'Z' | 'a' .. 'z' | '_' ) ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // TextAML3.g:5655:28: ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0=='-'||(LA12_0 >= '0' && LA12_0 <= '9')||(LA12_0 >= 'A' && LA12_0 <= 'Z')||LA12_0=='_'||(LA12_0 >= 'a' && LA12_0 <= 'z')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // TextAML3.g:
            	    {
            	    if ( input.LA(1)=='-'||(input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TEXT"

    // $ANTLR start "REFERENCE"
    public final void mREFERENCE() throws RecognitionException {
        try {
            int _type = REFERENCE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TextAML3.g:5657:10: ( ( ( ( 'A' .. 'Z' | 'a' .. 'z' | '_' ) ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )* '::' )+ ( 'A' .. 'Z' | 'a' .. 'z' | '_' ) ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )* ) )
            // TextAML3.g:5658:2: ( ( ( 'A' .. 'Z' | 'a' .. 'z' | '_' ) ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )* '::' )+ ( 'A' .. 'Z' | 'a' .. 'z' | '_' ) ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )* )
            {
            // TextAML3.g:5658:2: ( ( ( 'A' .. 'Z' | 'a' .. 'z' | '_' ) ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )* '::' )+ ( 'A' .. 'Z' | 'a' .. 'z' | '_' ) ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )* )
            // TextAML3.g:5658:2: ( ( 'A' .. 'Z' | 'a' .. 'z' | '_' ) ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )* '::' )+ ( 'A' .. 'Z' | 'a' .. 'z' | '_' ) ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )*
            {
            // TextAML3.g:5658:2: ( ( 'A' .. 'Z' | 'a' .. 'z' | '_' ) ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )* '::' )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                alt14 = dfa14.predict(input);
                switch (alt14) {
            	case 1 :
            	    // TextAML3.g:5658:3: ( 'A' .. 'Z' | 'a' .. 'z' | '_' ) ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )* '::'
            	    {
            	    if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    // TextAML3.g:5658:29: ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )*
            	    loop13:
            	    do {
            	        int alt13=2;
            	        int LA13_0 = input.LA(1);

            	        if ( (LA13_0=='-'||(LA13_0 >= '0' && LA13_0 <= '9')||(LA13_0 >= 'A' && LA13_0 <= 'Z')||LA13_0=='_'||(LA13_0 >= 'a' && LA13_0 <= 'z')) ) {
            	            alt13=1;
            	        }


            	        switch (alt13) {
            	    	case 1 :
            	    	    // TextAML3.g:
            	    	    {
            	    	    if ( input.LA(1)=='-'||(input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	    	        input.consume();
            	    	    }
            	    	    else {
            	    	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	    	        recover(mse);
            	    	        throw mse;
            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop13;
            	        }
            	    } while (true);


            	    match("::"); 



            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);


            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // TextAML3.g:5658:106: ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0=='-'||(LA15_0 >= '0' && LA15_0 <= '9')||(LA15_0 >= 'A' && LA15_0 <= 'Z')||LA15_0=='_'||(LA15_0 >= 'a' && LA15_0 <= 'z')) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // TextAML3.g:
            	    {
            	    if ( input.LA(1)=='-'||(input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "REFERENCE"

    // $ANTLR start "QUOTED_34_34"
    public final void mQUOTED_34_34() throws RecognitionException {
        try {
            int _type = QUOTED_34_34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TextAML3.g:5660:13: ( ( ( '\"' ) (~ ( '\"' ) )* ( '\"' ) ) )
            // TextAML3.g:5661:2: ( ( '\"' ) (~ ( '\"' ) )* ( '\"' ) )
            {
            // TextAML3.g:5661:2: ( ( '\"' ) (~ ( '\"' ) )* ( '\"' ) )
            // TextAML3.g:5661:2: ( '\"' ) (~ ( '\"' ) )* ( '\"' )
            {
            // TextAML3.g:5661:2: ( '\"' )
            // TextAML3.g:5661:3: '\"'
            {
            match('\"'); 

            }


            // TextAML3.g:5661:7: (~ ( '\"' ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0 >= '\u0000' && LA16_0 <= '!')||(LA16_0 >= '#' && LA16_0 <= '\uFFFF')) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // TextAML3.g:
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            // TextAML3.g:5661:16: ( '\"' )
            // TextAML3.g:5661:17: '\"'
            {
            match('\"'); 

            }


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "QUOTED_34_34"

    public void mTokens() throws RecognitionException {
        // TextAML3.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | URL | WHITESPACE | LINEBREAKS | VARID | NUMBER | TEXT | REFERENCE | QUOTED_34_34 )
        int alt17=50;
        alt17 = dfa17.predict(input);
        switch (alt17) {
            case 1 :
                // TextAML3.g:1:10: T__12
                {
                mT__12(); 


                }
                break;
            case 2 :
                // TextAML3.g:1:16: T__13
                {
                mT__13(); 


                }
                break;
            case 3 :
                // TextAML3.g:1:22: T__14
                {
                mT__14(); 


                }
                break;
            case 4 :
                // TextAML3.g:1:28: T__15
                {
                mT__15(); 


                }
                break;
            case 5 :
                // TextAML3.g:1:34: T__16
                {
                mT__16(); 


                }
                break;
            case 6 :
                // TextAML3.g:1:40: T__17
                {
                mT__17(); 


                }
                break;
            case 7 :
                // TextAML3.g:1:46: T__18
                {
                mT__18(); 


                }
                break;
            case 8 :
                // TextAML3.g:1:52: T__19
                {
                mT__19(); 


                }
                break;
            case 9 :
                // TextAML3.g:1:58: T__20
                {
                mT__20(); 


                }
                break;
            case 10 :
                // TextAML3.g:1:64: T__21
                {
                mT__21(); 


                }
                break;
            case 11 :
                // TextAML3.g:1:70: T__22
                {
                mT__22(); 


                }
                break;
            case 12 :
                // TextAML3.g:1:76: T__23
                {
                mT__23(); 


                }
                break;
            case 13 :
                // TextAML3.g:1:82: T__24
                {
                mT__24(); 


                }
                break;
            case 14 :
                // TextAML3.g:1:88: T__25
                {
                mT__25(); 


                }
                break;
            case 15 :
                // TextAML3.g:1:94: T__26
                {
                mT__26(); 


                }
                break;
            case 16 :
                // TextAML3.g:1:100: T__27
                {
                mT__27(); 


                }
                break;
            case 17 :
                // TextAML3.g:1:106: T__28
                {
                mT__28(); 


                }
                break;
            case 18 :
                // TextAML3.g:1:112: T__29
                {
                mT__29(); 


                }
                break;
            case 19 :
                // TextAML3.g:1:118: T__30
                {
                mT__30(); 


                }
                break;
            case 20 :
                // TextAML3.g:1:124: T__31
                {
                mT__31(); 


                }
                break;
            case 21 :
                // TextAML3.g:1:130: T__32
                {
                mT__32(); 


                }
                break;
            case 22 :
                // TextAML3.g:1:136: T__33
                {
                mT__33(); 


                }
                break;
            case 23 :
                // TextAML3.g:1:142: T__34
                {
                mT__34(); 


                }
                break;
            case 24 :
                // TextAML3.g:1:148: T__35
                {
                mT__35(); 


                }
                break;
            case 25 :
                // TextAML3.g:1:154: T__36
                {
                mT__36(); 


                }
                break;
            case 26 :
                // TextAML3.g:1:160: T__37
                {
                mT__37(); 


                }
                break;
            case 27 :
                // TextAML3.g:1:166: T__38
                {
                mT__38(); 


                }
                break;
            case 28 :
                // TextAML3.g:1:172: T__39
                {
                mT__39(); 


                }
                break;
            case 29 :
                // TextAML3.g:1:178: T__40
                {
                mT__40(); 


                }
                break;
            case 30 :
                // TextAML3.g:1:184: T__41
                {
                mT__41(); 


                }
                break;
            case 31 :
                // TextAML3.g:1:190: T__42
                {
                mT__42(); 


                }
                break;
            case 32 :
                // TextAML3.g:1:196: T__43
                {
                mT__43(); 


                }
                break;
            case 33 :
                // TextAML3.g:1:202: T__44
                {
                mT__44(); 


                }
                break;
            case 34 :
                // TextAML3.g:1:208: T__45
                {
                mT__45(); 


                }
                break;
            case 35 :
                // TextAML3.g:1:214: T__46
                {
                mT__46(); 


                }
                break;
            case 36 :
                // TextAML3.g:1:220: T__47
                {
                mT__47(); 


                }
                break;
            case 37 :
                // TextAML3.g:1:226: T__48
                {
                mT__48(); 


                }
                break;
            case 38 :
                // TextAML3.g:1:232: T__49
                {
                mT__49(); 


                }
                break;
            case 39 :
                // TextAML3.g:1:238: T__50
                {
                mT__50(); 


                }
                break;
            case 40 :
                // TextAML3.g:1:244: T__51
                {
                mT__51(); 


                }
                break;
            case 41 :
                // TextAML3.g:1:250: T__52
                {
                mT__52(); 


                }
                break;
            case 42 :
                // TextAML3.g:1:256: T__53
                {
                mT__53(); 


                }
                break;
            case 43 :
                // TextAML3.g:1:262: URL
                {
                mURL(); 


                }
                break;
            case 44 :
                // TextAML3.g:1:266: WHITESPACE
                {
                mWHITESPACE(); 


                }
                break;
            case 45 :
                // TextAML3.g:1:277: LINEBREAKS
                {
                mLINEBREAKS(); 


                }
                break;
            case 46 :
                // TextAML3.g:1:288: VARID
                {
                mVARID(); 


                }
                break;
            case 47 :
                // TextAML3.g:1:294: NUMBER
                {
                mNUMBER(); 


                }
                break;
            case 48 :
                // TextAML3.g:1:301: TEXT
                {
                mTEXT(); 


                }
                break;
            case 49 :
                // TextAML3.g:1:306: REFERENCE
                {
                mREFERENCE(); 


                }
                break;
            case 50 :
                // TextAML3.g:1:316: QUOTED_34_34
                {
                mQUOTED_34_34(); 


                }
                break;

        }

    }


    protected DFA14 dfa14 = new DFA14(this);
    protected DFA17 dfa17 = new DFA17(this);
    static final String DFA14_eotS =
        "\1\uffff\2\3\2\uffff";
    static final String DFA14_eofS =
        "\5\uffff";
    static final String DFA14_minS =
        "\1\101\2\55\2\uffff";
    static final String DFA14_maxS =
        "\3\172\2\uffff";
    static final String DFA14_acceptS =
        "\3\uffff\1\2\1\1";
    static final String DFA14_specialS =
        "\5\uffff}>";
    static final String[] DFA14_transitionS = {
            "\32\1\4\uffff\1\1\1\uffff\32\1",
            "\1\2\2\uffff\12\2\1\4\6\uffff\32\2\4\uffff\1\2\1\uffff\32\2",
            "\1\2\2\uffff\12\2\1\4\6\uffff\32\2\4\uffff\1\2\1\uffff\32\2",
            "",
            ""
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "()+ loopback of 5658:2: ( ( 'A' .. 'Z' | 'a' .. 'z' | '_' ) ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )* '::' )+";
        }
    }
    static final String DFA17_eotS =
        "\17\uffff\13\45\1\73\1\75\1\45\5\uffff\2\45\2\uffff\5\45\1\106\1"+
        "\45\1\110\10\45\1\122\3\45\4\uffff\1\45\2\uffff\3\45\1\133\1\45"+
        "\1\uffff\1\45\1\uffff\5\45\1\143\3\45\1\uffff\10\45\1\uffff\1\157"+
        "\1\45\1\161\4\45\1\uffff\6\45\1\174\1\45\1\176\1\177\1\45\1\uffff"+
        "\1\45\1\uffff\2\45\1\u0084\1\u0085\1\45\1\u0087\2\45\1\u008a\1\45"+
        "\1\uffff\1\45\2\uffff\2\45\1\u008f\1\45\2\uffff\1\45\1\uffff\2\45"+
        "\1\uffff\2\45\1\u0096\1\u0097\1\uffff\1\u0098\5\45\3\uffff\1\45"+
        "\1\u00a0\1\45\1\u00a2\3\45\1\uffff\1\45\1\uffff\3\45\1\u00aa\3\45"+
        "\1\uffff\1\u00ae\2\45\1\uffff\2\45\1\u00b3\1\u00b4\2\uffff";
    static final String DFA17_eofS =
        "\u00b5\uffff";
    static final String DFA17_minS =
        "\1\11\16\uffff\13\55\1\173\1\175\1\55\5\uffff\2\55\1\57\1\uffff"+
        "\24\55\4\uffff\1\55\2\uffff\5\55\1\uffff\1\55\1\uffff\11\55\1\uffff"+
        "\10\55\1\uffff\7\55\1\uffff\13\55\1\uffff\1\55\1\uffff\12\55\1\uffff"+
        "\1\55\2\uffff\4\55\2\uffff\1\55\1\uffff\2\55\1\uffff\4\55\1\uffff"+
        "\6\55\3\uffff\7\55\1\uffff\1\55\1\uffff\7\55\1\uffff\3\55\1\uffff"+
        "\4\55\2\uffff";
    static final String DFA17_maxS =
        "\1\175\16\uffff\13\172\1\173\1\175\1\172\5\uffff\2\172\1\72\1\uffff"+
        "\24\172\4\uffff\1\172\2\uffff\5\172\1\uffff\1\172\1\uffff\11\172"+
        "\1\uffff\10\172\1\uffff\7\172\1\uffff\13\172\1\uffff\1\172\1\uffff"+
        "\12\172\1\uffff\1\172\2\uffff\4\172\2\uffff\1\172\1\uffff\2\172"+
        "\1\uffff\4\172\1\uffff\6\172\3\uffff\7\172\1\uffff\1\172\1\uffff"+
        "\7\172\1\uffff\3\172\1\uffff\4\172\2\uffff";
    static final String DFA17_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1"+
        "\15\1\16\16\uffff\1\54\1\55\1\56\1\57\1\62\3\uffff\1\60\24\uffff"+
        "\1\50\1\47\1\52\1\51\1\uffff\1\53\1\61\5\uffff\1\25\1\uffff\1\27"+
        "\11\uffff\1\42\10\uffff\1\23\7\uffff\1\35\13\uffff\1\24\1\uffff"+
        "\1\30\12\uffff\1\46\1\uffff\1\20\1\21\4\uffff\1\33\1\34\1\uffff"+
        "\1\37\2\uffff\1\44\4\uffff\1\31\6\uffff\1\22\1\26\1\32\7\uffff\1"+
        "\40\1\uffff\1\45\7\uffff\1\43\3\uffff\1\17\4\uffff\1\36\1\41";
    static final String DFA17_specialS =
        "\u00b5\uffff}>";
    static final String[] DFA17_transitionS = {
            "\1\35\1\36\1\uffff\1\35\1\36\22\uffff\1\35\1\uffff\1\41\1\1"+
            "\1\37\1\uffff\1\2\1\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\uffff"+
            "\12\40\1\12\1\13\1\14\1\15\1\16\2\uffff\16\34\1\17\13\34\4\uffff"+
            "\1\34\1\uffff\4\34\1\20\1\21\2\34\1\22\2\34\1\23\1\24\2\34\1"+
            "\25\1\34\1\26\1\27\1\30\2\34\1\31\3\34\1\32\1\uffff\1\33",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\43\2\uffff\12\43\1\44\6\uffff\32\43\4\uffff\1\43\1\uffff"+
            "\2\43\1\42\27\43",
            "\1\43\2\uffff\12\43\1\44\6\uffff\32\43\4\uffff\1\43\1\uffff"+
            "\21\43\1\46\10\43",
            "\1\43\2\uffff\12\43\1\44\6\uffff\32\43\4\uffff\1\43\1\uffff"+
            "\10\43\1\47\2\43\1\50\2\43\1\51\2\43\1\52\10\43",
            "\1\43\2\uffff\12\43\1\44\6\uffff\32\43\4\uffff\1\43\1\uffff"+
            "\5\43\1\53\6\43\1\54\1\55\14\43",
            "\1\43\2\uffff\12\43\1\44\6\uffff\32\43\4\uffff\1\43\1\uffff"+
            "\1\56\3\43\1\57\25\43",
            "\1\43\2\uffff\12\43\1\44\6\uffff\32\43\4\uffff\1\43\1\uffff"+
            "\4\43\1\60\25\43",
            "\1\43\2\uffff\12\43\1\44\6\uffff\32\43\4\uffff\1\43\1\uffff"+
            "\1\61\31\43",
            "\1\43\2\uffff\12\43\1\44\6\uffff\32\43\4\uffff\1\43\1\uffff"+
            "\24\43\1\62\5\43",
            "\1\43\2\uffff\12\43\1\44\6\uffff\32\43\4\uffff\1\43\1\uffff"+
            "\4\43\1\63\11\43\1\64\4\43\1\65\6\43",
            "\1\43\2\uffff\12\43\1\44\6\uffff\32\43\4\uffff\1\43\1\uffff"+
            "\16\43\1\66\11\43\1\67\1\43",
            "\1\43\2\uffff\12\43\1\44\6\uffff\32\43\4\uffff\1\43\1\uffff"+
            "\7\43\1\70\1\71\21\43",
            "\1\72",
            "\1\74",
            "\1\43\2\uffff\12\43\1\44\6\uffff\32\43\4\uffff\1\43\1\uffff"+
            "\32\43",
            "",
            "",
            "",
            "",
            "",
            "\1\43\2\uffff\12\43\1\44\6\uffff\32\43\4\uffff\1\43\1\uffff"+
            "\13\43\1\76\16\43",
            "\1\43\2\uffff\12\43\1\44\6\uffff\32\43\4\uffff\1\43\1\uffff"+
            "\32\43",
            "\1\77\12\uffff\1\100",
            "",
            "\1\43\2\uffff\12\43\1\44\6\uffff\32\43\4\uffff\1\43\1\uffff"+
            "\21\43\1\101\10\43",
            "\1\43\2\uffff\12\43\1\44\6\uffff\32\43\4\uffff\1\43\1\uffff"+
            "\21\43\1\102\10\43",
            "\1\43\2\uffff\12\43\1\44\6\uffff\32\43\4\uffff\1\43\1\uffff"+
            "\1\103\31\43",
            "\1\43\2\uffff\12\43\1\44\6\uffff\32\43\4\uffff\1\43\1\uffff"+
            "\21\43\1\104\10\43",
            "\1\43\2\uffff\12\43\1\44\6\uffff\32\43\4\uffff\1\43\1\uffff"+
            "\16\43\1\105\13\43",
            "\1\43\2\uffff\12\43\1\44\6\uffff\32\43\4\uffff\1\43\1\uffff"+
            "\32\43",
            "\1\43\2\uffff\12\43\1\44\6\uffff\32\43\4\uffff\1\43\1\uffff"+
            "\17\43\1\107\12\43",
            "\1\43\2\uffff\12\43\1\44\6\uffff\32\43\4\uffff\1\43\1\uffff"+
            "\32\43",
            "\1\43\2\uffff\12\43\1\44\6\uffff\32\43\4\uffff\1\43\1\uffff"+
            "\22\43\1\111\7\43",
            "\1\43\2\uffff\12\43\1\44\6\uffff\32\43\4\uffff\1\43\1\uffff"+
            "\15\43\1\112\14\43",
            "\1\43\2\uffff\12\43\1\44\6\uffff\32\43\4\uffff\1\43\1\uffff"+
            "\22\43\1\113\7\43",
            "\1\43\2\uffff\12\43\1\44\6\uffff\32\43\4\uffff\1\43\1\uffff"+
            "\10\43\1\114\21\43",
            "\1\43\2\uffff\12\43\1\44\6\uffff\32\43\4\uffff\1\43\1\uffff"+
            "\13\43\1\115\16\43",
            "\1\43\2\uffff\12\43\1\44\6\uffff\32\43\4\uffff\1\43\1\uffff"+
            "\23\43\1\116\6\43",
            "\1\43\2\uffff\12\43\1\44\6\uffff\32\43\4\uffff\1\43\1\uffff"+
            "\24\43\1\117\5\43",
            "\1\43\2\uffff\12\43\1\44\6\uffff\32\43\4\uffff\1\43\1\uffff"+
            "\1\120\20\43\1\121\10\43",
            "\1\43\2\uffff\12\43\1\44\6\uffff\32\43\4\uffff\1\43\1\uffff"+
            "\32\43",
            "\1\43\2\uffff\12\43\1\44\6\uffff\32\43\4\uffff\1\43\1\uffff"+
            "\17\43\1\123\12\43",
            "\1\43\2\uffff\12\43\1\44\6\uffff\32\43\4\uffff\1\43\1\uffff"+
            "\4\43\1\124\25\43",
            "\1\43\2\uffff\12\43\1\44\6\uffff\32\43\4\uffff\1\43\1\uffff"+
            "\3\43\1\125\17\43\1\126\6\43",
            "",
            "",
            "",
            "",
            "\1\43\2\uffff\12\43\1\44\6\uffff\24\43\1\127\5\43\4\uffff\1"+
            "\43\1\uffff\32\43",
            "",
            "",
            "\1\43\2\uffff\12\43\1\44\6\uffff\32\43\4\uffff\1\43\1\uffff"+
            "\16\43\1\130\13\43",
            "\1\43\2\uffff\12\43\1\44\6\uffff\32\43\4\uffff\1\43\1\uffff"+
            "\22\43\1\131\7\43",
            "\1\43\2\uffff\12\43\1\44\6\uffff\32\43\4\uffff\1\43\1\uffff"+
            "\23\43\1\132\6\43",
            "\1\43\2\uffff\12\43\1\44\6\uffff\32\43\4\uffff\1\43\1\uffff"+
            "\32\43",
            "\1\43\2\uffff\12\43\1\44\6\uffff\32\43\4\uffff\1\43\1\uffff"+
            "\14\43\1\134\15\43",
            "",
            "\1\43\2\uffff\12\43\1\44\6\uffff\32\43\4\uffff\1\43\1\uffff"+
            "\16\43\1\135\13\43",
            "",
            "\1\43\2\uffff\12\43\1\44\6\uffff\32\43\4\uffff\1\43\1\uffff"+
            "\23\43\1\136\6\43",
            "\1\43\2\uffff\12\43\1\44\6\uffff\32\43\4\uffff\1\43\1\uffff"+
            "\6\43\1\137\23\43",
            "\1\43\2\uffff\12\43\1\44\6\uffff\32\43\4\uffff\1\43\1\uffff"+
            "\22\43\1\140\7\43",
            "\1\43\2\uffff\12\43\1\44\6\uffff\32\43\4\uffff\1\43\1\uffff"+
            "\21\43\1\141\10\43",
            "\1\43\2\uffff\12\43\1\44\6\uffff\32\43\4\uffff\1\43\1\uffff"+
            "\4\43\1\142\25\43",
            "\1\43\2\uffff\12\43\1\44\6\uffff\32\43\4\uffff\1\43\1\uffff"+
            "\32\43",
            "\1\43\2\uffff\12\43\1\44\6\uffff\32\43\4\uffff\1\43\1\uffff"+
            "\21\43\1\144\10\43",
            "\1\43\2\uffff\12\43\1\44\6\uffff\32\43\4\uffff\1\43\1\uffff"+
            "\21\43\1\145\10\43",
            "\1\43\2\uffff\12\43\1\44\6\uffff\32\43\4\uffff\1\43\1\uffff"+
            "\1\146\31\43",
            "",
            "\1\43\2\uffff\12\43\1\44\6\uffff\32\43\4\uffff\1\43\1\uffff"+
            "\4\43\1\147\25\43",
            "\1\43\2\uffff\12\43\1\44\6\uffff\32\43\4\uffff\1\43\1\uffff"+
            "\21\43\1\150\10\43",
            "\1\43\2\uffff\12\43\1\44\6\uffff\32\43\4\uffff\1\43\1\uffff"+
            "\4\43\1\151\25\43",
            "\1\43\2\uffff\12\43\1\44\6\uffff\32\43\4\uffff\1\43\1\uffff"+
            "\7\43\1\152\22\43",
            "\1\43\2\uffff\12\43\1\44\6\uffff\32\43\4\uffff\1\43\1\uffff"+
            "\15\43\1\153\14\43",
            "\1\43\2\uffff\12\43\1\44\6\uffff\32\43\4\uffff\1\43\1\uffff"+
            "\21\43\1\154\10\43",
            "\1\43\2\uffff\12\43\1\44\6\uffff\32\43\4\uffff\1\43\1\uffff"+
            "\23\43\1\155\6\43",
            "\1\43\2\uffff\12\43\1\44\6\uffff\32\43\4\uffff\1\43\1\uffff"+
            "\23\43\1\156\6\43",
            "",
            "\1\43\2\uffff\12\43\1\44\6\uffff\32\43\4\uffff\1\43\1\uffff"+
            "\32\43",
            "\1\43\2\uffff\12\43\1\44\6\uffff\32\43\4\uffff\1\43\1\uffff"+
            "\21\43\1\160\10\43",
            "\1\43\2\uffff\12\43\1\44\6\uffff\32\43\4\uffff\1\43\1\uffff"+
            "\32\43",
            "\1\43\2\uffff\12\43\1\44\6\uffff\32\43\4\uffff\1\43\1\uffff"+
            "\23\43\1\162\6\43",
            "\1\43\2\uffff\12\43\1\44\6\uffff\32\43\4\uffff\1\43\1\uffff"+
            "\1\163\31\43",
            "\1\43\2\uffff\12\43\1\44\6\uffff\32\43\4\uffff\1\43\1\uffff"+
            "\22\43\1\164\7\43",
            "\1\43\2\uffff\12\43\1\44\6\uffff\32\43\4\uffff\1\43\1\uffff"+
            "\22\43\1\165\7\43",
            "",
            "\1\43\2\uffff\12\43\1\44\6\uffff\32\43\4\uffff\1\43\1\uffff"+
            "\2\43\1\166\27\43",
            "\1\43\2\uffff\12\43\1\44\6\uffff\32\43\4\uffff\1\43\1\uffff"+
            "\23\43\1\167\6\43",
            "\1\43\2\uffff\12\43\1\44\6\uffff\32\43\4\uffff\1\43\1\uffff"+
            "\23\43\1\170\6\43",
            "\1\43\2\uffff\12\43\1\44\6\uffff\32\43\4\uffff\1\43\1\uffff"+
            "\22\43\1\171\7\43",
            "\1\43\2\uffff\12\43\1\44\6\uffff\32\43\4\uffff\1\43\1\uffff"+
            "\4\43\1\172\25\43",
            "\1\43\2\uffff\12\43\1\44\6\uffff\32\43\4\uffff\1\43\1\uffff"+
            "\15\43\1\173\14\43",
            "\1\43\2\uffff\12\43\1\44\6\uffff\32\43\4\uffff\1\43\1\uffff"+
            "\32\43",
            "\1\43\2\uffff\12\43\1\44\6\uffff\32\43\4\uffff\1\43\1\uffff"+
            "\3\43\1\175\26\43",
            "\1\43\2\uffff\12\43\1\44\6\uffff\32\43\4\uffff\1\43\1\uffff"+
            "\32\43",
            "\1\43\2\uffff\12\43\1\44\6\uffff\32\43\4\uffff\1\43\1\uffff"+
            "\32\43",
            "\1\43\2\uffff\12\43\1\44\6\uffff\32\43\4\uffff\1\43\1\uffff"+
            "\4\43\1\u0080\25\43",
            "",
            "\1\43\2\uffff\12\43\1\44\6\uffff\32\43\4\uffff\1\43\1\uffff"+
            "\23\43\1\u0081\6\43",
            "",
            "\1\43\2\uffff\12\43\1\44\6\uffff\32\43\4\uffff\1\43\1\uffff"+
            "\7\43\1\u0082\22\43",
            "\1\43\2\uffff\12\43\1\44\6\uffff\32\43\4\uffff\1\43\1\uffff"+
            "\6\43\1\u0083\23\43",
            "\1\43\2\uffff\12\43\1\44\6\uffff\32\43\4\uffff\1\43\1\uffff"+
            "\32\43",
            "\1\43\2\uffff\12\43\1\44\6\uffff\32\43\4\uffff\1\43\1\uffff"+
            "\32\43",
            "\1\43\2\uffff\12\43\1\44\6\uffff\32\43\4\uffff\1\43\1\uffff"+
            "\4\43\1\u0086\25\43",
            "\1\43\2\uffff\12\43\1\44\6\uffff\32\43\4\uffff\1\43\1\uffff"+
            "\32\43",
            "\1\43\2\uffff\12\43\1\44\6\uffff\32\43\4\uffff\1\43\1\uffff"+
            "\4\43\1\u0088\25\43",
            "\1\43\2\uffff\12\43\1\44\6\uffff\32\43\4\uffff\1\43\1\uffff"+
            "\30\43\1\u0089\1\43",
            "\1\43\2\uffff\12\43\1\44\6\uffff\32\43\4\uffff\1\43\1\uffff"+
            "\32\43",
            "\1\43\2\uffff\12\43\1\44\6\uffff\32\43\4\uffff\1\43\1\uffff"+
            "\10\43\1\u008b\21\43",
            "",
            "\1\43\2\uffff\12\43\1\44\6\uffff\32\43\4\uffff\1\43\1\uffff"+
            "\4\43\1\u008c\25\43",
            "",
            "",
            "\1\43\2\uffff\12\43\1\44\6\uffff\32\43\4\uffff\1\43\1\uffff"+
            "\15\43\1\u008d\14\43",
            "\1\43\2\uffff\12\43\1\44\6\uffff\32\43\4\uffff\1\43\1\uffff"+
            "\22\43\1\u008e\7\43",
            "\1\43\2\uffff\12\43\1\44\6\uffff\32\43\4\uffff\1\43\1\uffff"+
            "\32\43",
            "\1\43\2\uffff\12\43\1\44\6\uffff\32\43\4\uffff\1\43\1\uffff"+
            "\4\43\1\u0090\25\43",
            "",
            "",
            "\1\43\2\uffff\12\43\1\44\6\uffff\32\43\4\uffff\1\43\1\uffff"+
            "\17\43\1\u0091\12\43",
            "",
            "\1\43\2\uffff\12\43\1\44\6\uffff\32\43\4\uffff\1\43\1\uffff"+
            "\6\43\1\u0092\23\43",
            "\1\43\2\uffff\12\43\1\44\6\uffff\32\43\4\uffff\1\43\1\uffff"+
            "\22\43\1\u0093\7\43",
            "",
            "\1\43\2\uffff\12\43\1\44\6\uffff\32\43\4\uffff\1\43\1\uffff"+
            "\15\43\1\u0094\14\43",
            "\1\43\2\uffff\12\43\1\44\6\uffff\32\43\4\uffff\1\43\1\uffff"+
            "\5\43\1\u0095\24\43",
            "\1\43\2\uffff\12\43\1\44\6\uffff\32\43\4\uffff\1\43\1\uffff"+
            "\32\43",
            "\1\43\2\uffff\12\43\1\44\6\uffff\32\43\4\uffff\1\43\1\uffff"+
            "\32\43",
            "",
            "\1\43\2\uffff\12\43\1\44\6\uffff\32\43\4\uffff\1\43\1\uffff"+
            "\32\43",
            "\1\43\2\uffff\12\43\1\44\6\uffff\32\43\4\uffff\1\43\1\uffff"+
            "\16\43\1\u0099\13\43",
            "\1\43\2\uffff\12\43\1\44\6\uffff\32\43\4\uffff\1\43\1\uffff"+
            "\30\43\1\u009a\1\43",
            "\1\43\2\uffff\12\43\1\44\6\uffff\32\43\4\uffff\1\43\1\uffff"+
            "\23\43\1\u009b\6\43",
            "\1\43\2\uffff\12\43\1\44\6\uffff\32\43\4\uffff\1\43\1\uffff"+
            "\6\43\1\u009c\23\43",
            "\1\43\2\uffff\12\43\1\44\6\uffff\32\43\4\uffff\1\43\1\uffff"+
            "\10\43\1\u009d\21\43",
            "",
            "",
            "",
            "\1\43\2\uffff\12\43\1\44\6\uffff\32\43\4\uffff\1\43\1\uffff"+
            "\22\43\1\u009e\7\43",
            "\1\43\2\uffff\12\43\1\44\6\uffff\32\43\4\uffff\1\43\1\uffff"+
            "\23\43\1\u009f\6\43",
            "\1\43\2\uffff\12\43\1\44\6\uffff\32\43\4\uffff\1\43\1\uffff"+
            "\4\43\1\u00a1\25\43",
            "\1\43\2\uffff\12\43\1\44\6\uffff\32\43\4\uffff\1\43\1\uffff"+
            "\32\43",
            "\1\43\2\uffff\12\43\1\44\6\uffff\32\43\4\uffff\1\43\1\uffff"+
            "\15\43\1\u00a3\14\43",
            "\1\43\2\uffff\12\43\1\44\6\uffff\32\43\4\uffff\1\43\1\uffff"+
            "\10\43\1\u00a4\21\43",
            "\1\43\2\uffff\12\43\1\44\6\uffff\32\43\4\uffff\1\43\1\uffff"+
            "\1\u00a5\31\43",
            "",
            "\1\43\2\uffff\12\43\1\44\6\uffff\32\43\4\uffff\1\43\1\uffff"+
            "\14\43\1\u00a6\15\43",
            "",
            "\1\43\2\uffff\12\43\1\44\6\uffff\32\43\4\uffff\1\43\1\uffff"+
            "\4\43\1\u00a7\25\43",
            "\1\43\2\uffff\12\43\1\44\6\uffff\32\43\4\uffff\1\43\1\uffff"+
            "\23\43\1\u00a8\6\43",
            "\1\43\2\uffff\12\43\1\44\6\uffff\32\43\4\uffff\1\43\1\uffff"+
            "\21\43\1\u00a9\10\43",
            "\1\43\2\uffff\12\43\1\44\6\uffff\32\43\4\uffff\1\43\1\uffff"+
            "\32\43",
            "\1\43\2\uffff\12\43\1\44\6\uffff\32\43\4\uffff\1\43\1\uffff"+
            "\3\43\1\u00ab\26\43",
            "\1\43\2\uffff\12\43\1\44\6\uffff\32\43\4\uffff\1\43\1\uffff"+
            "\10\43\1\u00ac\21\43",
            "\1\43\2\uffff\12\43\1\44\6\uffff\32\43\4\uffff\1\43\1\uffff"+
            "\6\43\1\u00ad\23\43",
            "",
            "\1\43\2\uffff\12\43\1\44\6\uffff\32\43\4\uffff\1\43\1\uffff"+
            "\32\43",
            "\1\43\2\uffff\12\43\1\44\6\uffff\32\43\4\uffff\1\43\1\uffff"+
            "\16\43\1\u00af\13\43",
            "\1\43\2\uffff\12\43\1\44\6\uffff\32\43\4\uffff\1\43\1\uffff"+
            "\4\43\1\u00b0\25\43",
            "",
            "\1\43\2\uffff\12\43\1\44\6\uffff\32\43\4\uffff\1\43\1\uffff"+
            "\15\43\1\u00b1\14\43",
            "\1\43\2\uffff\12\43\1\44\6\uffff\32\43\4\uffff\1\43\1\uffff"+
            "\23\43\1\u00b2\6\43",
            "\1\43\2\uffff\12\43\1\44\6\uffff\32\43\4\uffff\1\43\1\uffff"+
            "\32\43",
            "\1\43\2\uffff\12\43\1\44\6\uffff\32\43\4\uffff\1\43\1\uffff"+
            "\32\43",
            "",
            ""
    };

    static final short[] DFA17_eot = DFA.unpackEncodedString(DFA17_eotS);
    static final short[] DFA17_eof = DFA.unpackEncodedString(DFA17_eofS);
    static final char[] DFA17_min = DFA.unpackEncodedStringToUnsignedChars(DFA17_minS);
    static final char[] DFA17_max = DFA.unpackEncodedStringToUnsignedChars(DFA17_maxS);
    static final short[] DFA17_accept = DFA.unpackEncodedString(DFA17_acceptS);
    static final short[] DFA17_special = DFA.unpackEncodedString(DFA17_specialS);
    static final short[][] DFA17_transition;

    static {
        int numStates = DFA17_transitionS.length;
        DFA17_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA17_transition[i] = DFA.unpackEncodedString(DFA17_transitionS[i]);
        }
    }

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = DFA17_eot;
            this.eof = DFA17_eof;
            this.min = DFA17_min;
            this.max = DFA17_max;
            this.accept = DFA17_accept;
            this.special = DFA17_special;
            this.transition = DFA17_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | URL | WHITESPACE | LINEBREAKS | VARID | NUMBER | TEXT | REFERENCE | QUOTED_34_34 );";
        }
    }
 

}