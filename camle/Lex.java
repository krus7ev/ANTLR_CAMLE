// $ANTLR 3.2 Sep 23, 2009 12:02:23 Lex.g 2014-08-28 23:16:11

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class Lex extends Lexer {
    public static final int EXPONENT=36;
    public static final int LETTER=31;
    public static final int ELSE=10;
    public static final int INT=35;
    public static final int MULT=23;
    public static final int MINUS=21;
    public static final int EOF=-1;
    public static final int WRITE=6;
    public static final int IF=9;
    public static final int CLOSESQB=18;
    public static final int WS=40;
    public static final int NEQ=29;
    public static final int GREATER=24;
    public static final int WRITELN=5;
    public static final int LESSEQ=27;
    public static final int GREATEQ=25;
    public static final int CLOSEP=16;
    public static final int SYMB=32;
    public static final int COMMA=19;
    public static final int READ=7;
    public static final int UNTIL=12;
    public static final int IDENTIFIER=33;
    public static final int REALNUM=37;
    public static final int BEGIN=4;
    public static final int ASSIGN=30;
    public static final int LESS=26;
    public static final int SEMICOL=14;
    public static final int PLUS=20;
    public static final int REPEAT=11;
    public static final int DIGIT=34;
    public static final int EQ=28;
    public static final int DIV=22;
    public static final int COMMENT=39;
    public static final int END=13;
    public static final int OPENSQB=17;
    public static final int ARRAY=8;
    public static final int OPENP=15;
    public static final int STRING=38;

    // delegates
    // delegators

    public Lex() {;} 
    public Lex(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public Lex(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "Lex.g"; }

    // $ANTLR start "BEGIN"
    public final void mBEGIN() throws RecognitionException {
        try {
            int _type = BEGIN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:6:14: ( 'begin' )
            // Lex.g:6:16: 'begin'
            {
            match("begin"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BEGIN"

    // $ANTLR start "WRITELN"
    public final void mWRITELN() throws RecognitionException {
        try {
            int _type = WRITELN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:7:14: ( 'writeln' )
            // Lex.g:7:16: 'writeln'
            {
            match("writeln"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WRITELN"

    // $ANTLR start "WRITE"
    public final void mWRITE() throws RecognitionException {
        try {
            int _type = WRITE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:8:14: ( 'write' )
            // Lex.g:8:16: 'write'
            {
            match("write"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WRITE"

    // $ANTLR start "READ"
    public final void mREAD() throws RecognitionException {
        try {
            int _type = READ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:9:14: ( 'read' )
            // Lex.g:9:16: 'read'
            {
            match("read"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "READ"

    // $ANTLR start "ARRAY"
    public final void mARRAY() throws RecognitionException {
        try {
            int _type = ARRAY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:10:14: ( 'array' )
            // Lex.g:10:16: 'array'
            {
            match("array"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ARRAY"

    // $ANTLR start "IF"
    public final void mIF() throws RecognitionException {
        try {
            int _type = IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:11:14: ( 'if' )
            // Lex.g:11:16: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IF"

    // $ANTLR start "ELSE"
    public final void mELSE() throws RecognitionException {
        try {
            int _type = ELSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:12:14: ( 'else' )
            // Lex.g:12:16: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ELSE"

    // $ANTLR start "REPEAT"
    public final void mREPEAT() throws RecognitionException {
        try {
            int _type = REPEAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:13:14: ( 'repeat' )
            // Lex.g:13:16: 'repeat'
            {
            match("repeat"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "REPEAT"

    // $ANTLR start "UNTIL"
    public final void mUNTIL() throws RecognitionException {
        try {
            int _type = UNTIL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:14:14: ( 'until' )
            // Lex.g:14:16: 'until'
            {
            match("until"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "UNTIL"

    // $ANTLR start "END"
    public final void mEND() throws RecognitionException {
        try {
            int _type = END;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:15:14: ( 'end' )
            // Lex.g:15:16: 'end'
            {
            match("end"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "END"

    // $ANTLR start "SEMICOL"
    public final void mSEMICOL() throws RecognitionException {
        try {
            int _type = SEMICOL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:18:14: ( ';' )
            // Lex.g:18:16: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SEMICOL"

    // $ANTLR start "OPENP"
    public final void mOPENP() throws RecognitionException {
        try {
            int _type = OPENP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:19:14: ( '(' )
            // Lex.g:19:16: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OPENP"

    // $ANTLR start "CLOSEP"
    public final void mCLOSEP() throws RecognitionException {
        try {
            int _type = CLOSEP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:20:14: ( ')' )
            // Lex.g:20:16: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CLOSEP"

    // $ANTLR start "OPENSQB"
    public final void mOPENSQB() throws RecognitionException {
        try {
            int _type = OPENSQB;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:21:14: ( '[' )
            // Lex.g:21:16: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OPENSQB"

    // $ANTLR start "CLOSESQB"
    public final void mCLOSESQB() throws RecognitionException {
        try {
            int _type = CLOSESQB;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:22:14: ( ']' )
            // Lex.g:22:16: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CLOSESQB"

    // $ANTLR start "COMMA"
    public final void mCOMMA() throws RecognitionException {
        try {
            int _type = COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:23:14: ( ',' )
            // Lex.g:23:16: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMA"

    // $ANTLR start "PLUS"
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:24:14: ( '+' )
            // Lex.g:24:16: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PLUS"

    // $ANTLR start "MINUS"
    public final void mMINUS() throws RecognitionException {
        try {
            int _type = MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:25:14: ( '-' )
            // Lex.g:25:16: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MINUS"

    // $ANTLR start "DIV"
    public final void mDIV() throws RecognitionException {
        try {
            int _type = DIV;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:26:14: ( '/' )
            // Lex.g:26:16: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DIV"

    // $ANTLR start "MULT"
    public final void mMULT() throws RecognitionException {
        try {
            int _type = MULT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:27:14: ( '*' )
            // Lex.g:27:16: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MULT"

    // $ANTLR start "GREATER"
    public final void mGREATER() throws RecognitionException {
        try {
            int _type = GREATER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:28:14: ( '>' )
            // Lex.g:28:16: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GREATER"

    // $ANTLR start "GREATEQ"
    public final void mGREATEQ() throws RecognitionException {
        try {
            int _type = GREATEQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:29:14: ( '>=' )
            // Lex.g:29:16: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GREATEQ"

    // $ANTLR start "LESS"
    public final void mLESS() throws RecognitionException {
        try {
            int _type = LESS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:30:14: ( '<' )
            // Lex.g:30:16: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LESS"

    // $ANTLR start "LESSEQ"
    public final void mLESSEQ() throws RecognitionException {
        try {
            int _type = LESSEQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:31:14: ( '<=' )
            // Lex.g:31:16: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LESSEQ"

    // $ANTLR start "EQ"
    public final void mEQ() throws RecognitionException {
        try {
            int _type = EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:32:14: ( '=' )
            // Lex.g:32:16: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EQ"

    // $ANTLR start "NEQ"
    public final void mNEQ() throws RecognitionException {
        try {
            int _type = NEQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:33:14: ( '!=' )
            // Lex.g:33:16: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NEQ"

    // $ANTLR start "ASSIGN"
    public final void mASSIGN() throws RecognitionException {
        try {
            int _type = ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:34:14: ( ':=' )
            // Lex.g:34:16: ':='
            {
            match(":="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ASSIGN"

    // $ANTLR start "IDENTIFIER"
    public final void mIDENTIFIER() throws RecognitionException {
        try {
            int _type = IDENTIFIER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:37:14: ( LETTER ( SYMB ( SYMB ( SYMB ( SYMB ( SYMB ( SYMB ( SYMB ( SYMB )? )? )? )? )? )? )? )? )
            // Lex.g:37:16: LETTER ( SYMB ( SYMB ( SYMB ( SYMB ( SYMB ( SYMB ( SYMB ( SYMB )? )? )? )? )? )? )? )?
            {
            mLETTER(); 
            // Lex.g:37:23: ( SYMB ( SYMB ( SYMB ( SYMB ( SYMB ( SYMB ( SYMB ( SYMB )? )? )? )? )? )? )? )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>='0' && LA8_0<='9')||(LA8_0>='A' && LA8_0<='Z')||(LA8_0>='a' && LA8_0<='z')) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // Lex.g:37:24: SYMB ( SYMB ( SYMB ( SYMB ( SYMB ( SYMB ( SYMB ( SYMB )? )? )? )? )? )? )?
                    {
                    mSYMB(); 
                    // Lex.g:37:28: ( SYMB ( SYMB ( SYMB ( SYMB ( SYMB ( SYMB ( SYMB )? )? )? )? )? )? )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( ((LA7_0>='0' && LA7_0<='9')||(LA7_0>='A' && LA7_0<='Z')||(LA7_0>='a' && LA7_0<='z')) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // Lex.g:37:29: SYMB ( SYMB ( SYMB ( SYMB ( SYMB ( SYMB ( SYMB )? )? )? )? )? )?
                            {
                            mSYMB(); 
                            // Lex.g:37:33: ( SYMB ( SYMB ( SYMB ( SYMB ( SYMB ( SYMB )? )? )? )? )? )?
                            int alt6=2;
                            int LA6_0 = input.LA(1);

                            if ( ((LA6_0>='0' && LA6_0<='9')||(LA6_0>='A' && LA6_0<='Z')||(LA6_0>='a' && LA6_0<='z')) ) {
                                alt6=1;
                            }
                            switch (alt6) {
                                case 1 :
                                    // Lex.g:37:34: SYMB ( SYMB ( SYMB ( SYMB ( SYMB ( SYMB )? )? )? )? )?
                                    {
                                    mSYMB(); 
                                    // Lex.g:37:38: ( SYMB ( SYMB ( SYMB ( SYMB ( SYMB )? )? )? )? )?
                                    int alt5=2;
                                    int LA5_0 = input.LA(1);

                                    if ( ((LA5_0>='0' && LA5_0<='9')||(LA5_0>='A' && LA5_0<='Z')||(LA5_0>='a' && LA5_0<='z')) ) {
                                        alt5=1;
                                    }
                                    switch (alt5) {
                                        case 1 :
                                            // Lex.g:37:39: SYMB ( SYMB ( SYMB ( SYMB ( SYMB )? )? )? )?
                                            {
                                            mSYMB(); 
                                            // Lex.g:37:43: ( SYMB ( SYMB ( SYMB ( SYMB )? )? )? )?
                                            int alt4=2;
                                            int LA4_0 = input.LA(1);

                                            if ( ((LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||(LA4_0>='a' && LA4_0<='z')) ) {
                                                alt4=1;
                                            }
                                            switch (alt4) {
                                                case 1 :
                                                    // Lex.g:37:44: SYMB ( SYMB ( SYMB ( SYMB )? )? )?
                                                    {
                                                    mSYMB(); 
                                                    // Lex.g:37:48: ( SYMB ( SYMB ( SYMB )? )? )?
                                                    int alt3=2;
                                                    int LA3_0 = input.LA(1);

                                                    if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||(LA3_0>='a' && LA3_0<='z')) ) {
                                                        alt3=1;
                                                    }
                                                    switch (alt3) {
                                                        case 1 :
                                                            // Lex.g:37:49: SYMB ( SYMB ( SYMB )? )?
                                                            {
                                                            mSYMB(); 
                                                            // Lex.g:37:53: ( SYMB ( SYMB )? )?
                                                            int alt2=2;
                                                            int LA2_0 = input.LA(1);

                                                            if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||(LA2_0>='a' && LA2_0<='z')) ) {
                                                                alt2=1;
                                                            }
                                                            switch (alt2) {
                                                                case 1 :
                                                                    // Lex.g:37:54: SYMB ( SYMB )?
                                                                    {
                                                                    mSYMB(); 
                                                                    // Lex.g:37:58: ( SYMB )?
                                                                    int alt1=2;
                                                                    int LA1_0 = input.LA(1);

                                                                    if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||(LA1_0>='a' && LA1_0<='z')) ) {
                                                                        alt1=1;
                                                                    }
                                                                    switch (alt1) {
                                                                        case 1 :
                                                                            // Lex.g:37:59: SYMB
                                                                            {
                                                                            mSYMB(); 

                                                                            }
                                                                            break;

                                                                    }


                                                                    }
                                                                    break;

                                                            }


                                                            }
                                                            break;

                                                    }


                                                    }
                                                    break;

                                            }


                                            }
                                            break;

                                    }


                                    }
                                    break;

                            }


                            }
                            break;

                    }


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
    // $ANTLR end "IDENTIFIER"

    // $ANTLR start "SYMB"
    public final void mSYMB() throws RecognitionException {
        try {
            // Lex.g:40:12: ( ( LETTER | DIGIT ) )
            // Lex.g:40:14: ( LETTER | DIGIT )
            {
            // Lex.g:40:14: ( LETTER | DIGIT )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>='A' && LA9_0<='Z')||(LA9_0>='a' && LA9_0<='z')) ) {
                alt9=1;
            }
            else if ( ((LA9_0>='0' && LA9_0<='9')) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // Lex.g:40:15: LETTER
                    {
                    mLETTER(); 

                    }
                    break;
                case 2 :
                    // Lex.g:40:24: DIGIT
                    {
                    mDIGIT(); 

                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "SYMB"

    // $ANTLR start "REALNUM"
    public final void mREALNUM() throws RecognitionException {
        try {
            int _type = REALNUM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:42:14: ( INT '.' INT ( EXPONENT )? )
            // Lex.g:42:16: INT '.' INT ( EXPONENT )?
            {
            mINT(); 
            match('.'); 
            mINT(); 
            // Lex.g:42:28: ( EXPONENT )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='e') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // Lex.g:42:29: EXPONENT
                    {
                    mEXPONENT(); 

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
    // $ANTLR end "REALNUM"

    // $ANTLR start "LETTER"
    public final void mLETTER() throws RecognitionException {
        try {
            // Lex.g:45:14: ( ( 'a' .. 'z' ) | ( 'A' .. 'Z' ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>='a' && LA11_0<='z')) ) {
                alt11=1;
            }
            else if ( ((LA11_0>='A' && LA11_0<='Z')) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // Lex.g:45:16: ( 'a' .. 'z' )
                    {
                    // Lex.g:45:16: ( 'a' .. 'z' )
                    // Lex.g:45:17: 'a' .. 'z'
                    {
                    matchRange('a','z'); 

                    }


                    }
                    break;
                case 2 :
                    // Lex.g:45:29: ( 'A' .. 'Z' )
                    {
                    // Lex.g:45:29: ( 'A' .. 'Z' )
                    // Lex.g:45:30: 'A' .. 'Z'
                    {
                    matchRange('A','Z'); 

                    }


                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end "LETTER"

    // $ANTLR start "EXPONENT"
    public final void mEXPONENT() throws RecognitionException {
        try {
            // Lex.g:48:14: ( 'e' ( '-' )? INT )
            // Lex.g:48:16: 'e' ( '-' )? INT
            {
            match('e'); 
            // Lex.g:48:20: ( '-' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='-') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // Lex.g:48:21: '-'
                    {
                    match('-'); 

                    }
                    break;

            }

            mINT(); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "EXPONENT"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            // Lex.g:51:14: ( ( DIGIT )+ )
            // Lex.g:51:16: ( DIGIT )+
            {
            // Lex.g:51:16: ( DIGIT )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='0' && LA13_0<='9')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // Lex.g:51:17: DIGIT
            	    {
            	    mDIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "DIGIT"
    public final void mDIGIT() throws RecognitionException {
        try {
            // Lex.g:54:14: ( ( '0' .. '9' ) )
            // Lex.g:54:16: ( '0' .. '9' )
            {
            // Lex.g:54:16: ( '0' .. '9' )
            // Lex.g:54:17: '0' .. '9'
            {
            matchRange('0','9'); 

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "DIGIT"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:56:14: ( '\\'' ( '\\'' '\\'' | ~ '\\'' )* '\\'' )
            // Lex.g:56:16: '\\'' ( '\\'' '\\'' | ~ '\\'' )* '\\''
            {
            match('\''); 
            // Lex.g:56:21: ( '\\'' '\\'' | ~ '\\'' )*
            loop14:
            do {
                int alt14=3;
                int LA14_0 = input.LA(1);

                if ( (LA14_0=='\'') ) {
                    int LA14_1 = input.LA(2);

                    if ( (LA14_1=='\'') ) {
                        alt14=1;
                    }


                }
                else if ( ((LA14_0>='\u0000' && LA14_0<='&')||(LA14_0>='(' && LA14_0<='\uFFFF')) ) {
                    alt14=2;
                }


                switch (alt14) {
            	case 1 :
            	    // Lex.g:56:22: '\\'' '\\''
            	    {
            	    match('\''); 
            	    match('\''); 

            	    }
            	    break;
            	case 2 :
            	    // Lex.g:56:34: ~ '\\''
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STRING"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:59:14: ( '{' (~ '}' )* '}' )
            // Lex.g:59:16: '{' (~ '}' )* '}'
            {
            match('{'); 
            // Lex.g:59:20: (~ '}' )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>='\u0000' && LA15_0<='|')||(LA15_0>='~' && LA15_0<='\uFFFF')) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // Lex.g:59:21: ~ '}'
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='|')||(input.LA(1)>='~' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            match('}'); 
            skip();

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:61:14: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // Lex.g:61:16: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // Lex.g:61:16: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>='\t' && LA16_0<='\n')||LA16_0=='\r'||LA16_0==' ') ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // Lex.g:
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
            	    if ( cnt16 >= 1 ) break loop16;
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
            } while (true);

            skip();

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    public void mTokens() throws RecognitionException {
        // Lex.g:1:8: ( BEGIN | WRITELN | WRITE | READ | ARRAY | IF | ELSE | REPEAT | UNTIL | END | SEMICOL | OPENP | CLOSEP | OPENSQB | CLOSESQB | COMMA | PLUS | MINUS | DIV | MULT | GREATER | GREATEQ | LESS | LESSEQ | EQ | NEQ | ASSIGN | IDENTIFIER | REALNUM | STRING | COMMENT | WS )
        int alt17=32;
        alt17 = dfa17.predict(input);
        switch (alt17) {
            case 1 :
                // Lex.g:1:10: BEGIN
                {
                mBEGIN(); 

                }
                break;
            case 2 :
                // Lex.g:1:16: WRITELN
                {
                mWRITELN(); 

                }
                break;
            case 3 :
                // Lex.g:1:24: WRITE
                {
                mWRITE(); 

                }
                break;
            case 4 :
                // Lex.g:1:30: READ
                {
                mREAD(); 

                }
                break;
            case 5 :
                // Lex.g:1:35: ARRAY
                {
                mARRAY(); 

                }
                break;
            case 6 :
                // Lex.g:1:41: IF
                {
                mIF(); 

                }
                break;
            case 7 :
                // Lex.g:1:44: ELSE
                {
                mELSE(); 

                }
                break;
            case 8 :
                // Lex.g:1:49: REPEAT
                {
                mREPEAT(); 

                }
                break;
            case 9 :
                // Lex.g:1:56: UNTIL
                {
                mUNTIL(); 

                }
                break;
            case 10 :
                // Lex.g:1:62: END
                {
                mEND(); 

                }
                break;
            case 11 :
                // Lex.g:1:66: SEMICOL
                {
                mSEMICOL(); 

                }
                break;
            case 12 :
                // Lex.g:1:74: OPENP
                {
                mOPENP(); 

                }
                break;
            case 13 :
                // Lex.g:1:80: CLOSEP
                {
                mCLOSEP(); 

                }
                break;
            case 14 :
                // Lex.g:1:87: OPENSQB
                {
                mOPENSQB(); 

                }
                break;
            case 15 :
                // Lex.g:1:95: CLOSESQB
                {
                mCLOSESQB(); 

                }
                break;
            case 16 :
                // Lex.g:1:104: COMMA
                {
                mCOMMA(); 

                }
                break;
            case 17 :
                // Lex.g:1:110: PLUS
                {
                mPLUS(); 

                }
                break;
            case 18 :
                // Lex.g:1:115: MINUS
                {
                mMINUS(); 

                }
                break;
            case 19 :
                // Lex.g:1:121: DIV
                {
                mDIV(); 

                }
                break;
            case 20 :
                // Lex.g:1:125: MULT
                {
                mMULT(); 

                }
                break;
            case 21 :
                // Lex.g:1:130: GREATER
                {
                mGREATER(); 

                }
                break;
            case 22 :
                // Lex.g:1:138: GREATEQ
                {
                mGREATEQ(); 

                }
                break;
            case 23 :
                // Lex.g:1:146: LESS
                {
                mLESS(); 

                }
                break;
            case 24 :
                // Lex.g:1:151: LESSEQ
                {
                mLESSEQ(); 

                }
                break;
            case 25 :
                // Lex.g:1:158: EQ
                {
                mEQ(); 

                }
                break;
            case 26 :
                // Lex.g:1:161: NEQ
                {
                mNEQ(); 

                }
                break;
            case 27 :
                // Lex.g:1:165: ASSIGN
                {
                mASSIGN(); 

                }
                break;
            case 28 :
                // Lex.g:1:172: IDENTIFIER
                {
                mIDENTIFIER(); 

                }
                break;
            case 29 :
                // Lex.g:1:183: REALNUM
                {
                mREALNUM(); 

                }
                break;
            case 30 :
                // Lex.g:1:191: STRING
                {
                mSTRING(); 

                }
                break;
            case 31 :
                // Lex.g:1:198: COMMENT
                {
                mCOMMENT(); 

                }
                break;
            case 32 :
                // Lex.g:1:206: WS
                {
                mWS(); 

                }
                break;

        }

    }


    protected DFA17 dfa17 = new DFA17(this);
    static final String DFA17_eotS =
        "\1\uffff\7\27\12\uffff\1\45\1\47\10\uffff\4\27\1\55\3\27\4\uffff"+
        "\5\27\1\uffff\1\27\1\67\3\27\1\73\2\27\1\76\1\uffff\1\27\1\100\1"+
        "\102\1\uffff\1\27\1\104\1\uffff\1\105\1\uffff\1\27\1\uffff\1\107"+
        "\2\uffff\1\110\2\uffff";
    static final String DFA17_eofS =
        "\111\uffff";
    static final String DFA17_minS =
        "\1\11\1\145\1\162\1\145\1\162\1\146\1\154\1\156\12\uffff\2\75\10"+
        "\uffff\1\147\1\151\1\141\1\162\1\60\1\163\1\144\1\164\4\uffff\1"+
        "\151\1\164\1\144\1\145\1\141\1\uffff\1\145\1\60\1\151\1\156\1\145"+
        "\1\60\1\141\1\171\1\60\1\uffff\1\154\2\60\1\uffff\1\164\1\60\1\uffff"+
        "\1\60\1\uffff\1\156\1\uffff\1\60\2\uffff\1\60\2\uffff";
    static final String DFA17_maxS =
        "\1\173\1\145\1\162\1\145\1\162\1\146\2\156\12\uffff\2\75\10\uffff"+
        "\1\147\1\151\1\160\1\162\1\172\1\163\1\144\1\164\4\uffff\1\151\1"+
        "\164\1\144\1\145\1\141\1\uffff\1\145\1\172\1\151\1\156\1\145\1\172"+
        "\1\141\1\171\1\172\1\uffff\1\154\2\172\1\uffff\1\164\1\172\1\uffff"+
        "\1\172\1\uffff\1\156\1\uffff\1\172\2\uffff\1\172\2\uffff";
    static final String DFA17_acceptS =
        "\10\uffff\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\2\uffff"+
        "\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40\10\uffff\1\26\1\25\1\30"+
        "\1\27\5\uffff\1\6\11\uffff\1\12\3\uffff\1\4\2\uffff\1\7\1\uffff"+
        "\1\1\1\uffff\1\3\1\uffff\1\5\1\11\1\uffff\1\10\1\2";
    static final String DFA17_specialS =
        "\111\uffff}>";
    static final String[] DFA17_transitionS = {
            "\2\33\2\uffff\1\33\22\uffff\1\33\1\25\5\uffff\1\31\1\11\1\12"+
            "\1\21\1\16\1\15\1\17\1\uffff\1\20\12\30\1\26\1\10\1\23\1\24"+
            "\1\22\2\uffff\32\27\1\13\1\uffff\1\14\3\uffff\1\4\1\1\2\27\1"+
            "\6\3\27\1\5\10\27\1\3\2\27\1\7\1\27\1\2\3\27\1\32",
            "\1\34",
            "\1\35",
            "\1\36",
            "\1\37",
            "\1\40",
            "\1\41\1\uffff\1\42",
            "\1\43",
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
            "\1\44",
            "\1\46",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\50",
            "\1\51",
            "\1\52\16\uffff\1\53",
            "\1\54",
            "\12\27\7\uffff\32\27\6\uffff\32\27",
            "\1\56",
            "\1\57",
            "\1\60",
            "",
            "",
            "",
            "",
            "\1\61",
            "\1\62",
            "\1\63",
            "\1\64",
            "\1\65",
            "",
            "\1\66",
            "\12\27\7\uffff\32\27\6\uffff\32\27",
            "\1\70",
            "\1\71",
            "\1\72",
            "\12\27\7\uffff\32\27\6\uffff\32\27",
            "\1\74",
            "\1\75",
            "\12\27\7\uffff\32\27\6\uffff\32\27",
            "",
            "\1\77",
            "\12\27\7\uffff\32\27\6\uffff\32\27",
            "\12\27\7\uffff\32\27\6\uffff\13\27\1\101\16\27",
            "",
            "\1\103",
            "\12\27\7\uffff\32\27\6\uffff\32\27",
            "",
            "\12\27\7\uffff\32\27\6\uffff\32\27",
            "",
            "\1\106",
            "",
            "\12\27\7\uffff\32\27\6\uffff\32\27",
            "",
            "",
            "\12\27\7\uffff\32\27\6\uffff\32\27",
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
            return "1:1: Tokens : ( BEGIN | WRITELN | WRITE | READ | ARRAY | IF | ELSE | REPEAT | UNTIL | END | SEMICOL | OPENP | CLOSEP | OPENSQB | CLOSESQB | COMMA | PLUS | MINUS | DIV | MULT | GREATER | GREATEQ | LESS | LESSEQ | EQ | NEQ | ASSIGN | IDENTIFIER | REALNUM | STRING | COMMENT | WS );";
        }
    }
 

}