// $ANTLR 3.2 Sep 23, 2009 12:02:23 Syn.g 2014-08-28 23:16:11

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class Syn extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "BEGIN", "WRITELN", "WRITE", "READ", "ARRAY", "IF", "ELSE", "REPEAT", "UNTIL", "END", "SEMICOL", "OPENP", "CLOSEP", "OPENSQB", "CLOSESQB", "COMMA", "PLUS", "MINUS", "DIV", "MULT", "GREATER", "GREATEQ", "LESS", "LESSEQ", "EQ", "NEQ", "ASSIGN", "LETTER", "SYMB", "IDENTIFIER", "DIGIT", "INT", "EXPONENT", "REALNUM", "STRING", "COMMENT", "WS"
    };
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
    public static final int CLOSEP=16;
    public static final int LESSEQ=27;
    public static final int GREATEQ=25;
    public static final int SYMB=32;
    public static final int READ=7;
    public static final int COMMA=19;
    public static final int UNTIL=12;
    public static final int IDENTIFIER=33;
    public static final int BEGIN=4;
    public static final int REALNUM=37;
    public static final int LESS=26;
    public static final int ASSIGN=30;
    public static final int SEMICOL=14;
    public static final int PLUS=20;
    public static final int REPEAT=11;
    public static final int DIGIT=34;
    public static final int DIV=22;
    public static final int EQ=28;
    public static final int OPENSQB=17;
    public static final int END=13;
    public static final int COMMENT=39;
    public static final int OPENP=15;
    public static final int ARRAY=8;
    public static final int STRING=38;

    // delegates
    // delegators


        public Syn(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public Syn(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return Syn.tokenNames; }
    public String getGrammarFileName() { return "Syn.g"; }


    	public void displayRecognitionError(String[] tokenNames,RecognitionException e)
    	{
            String hdr = getErrorHeader(e);
            String msg = getErrorMessage(e, tokenNames);
    	}

    	private String cleanString(String s){
    		String tmp;
    		tmp = s.replaceAll("^'", "");
    		s = tmp.replaceAll("'$", "");
    		tmp = s.replaceAll("''", "'");
    		return tmp;
    	}


    public static class program_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "program"
    // Syn.g:27:1: program : ( ARRAY declaration ( COMMA declaration )* SEMICOL )? compoundstatement ;
    public final Syn.program_return program() throws RecognitionException {
        Syn.program_return retval = new Syn.program_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ARRAY1=null;
        Token COMMA3=null;
        Token SEMICOL5=null;
        Syn.declaration_return declaration2 = null;

        Syn.declaration_return declaration4 = null;

        Syn.compoundstatement_return compoundstatement6 = null;


        Object ARRAY1_tree=null;
        Object COMMA3_tree=null;
        Object SEMICOL5_tree=null;

        try {
            // Syn.g:27:9: ( ( ARRAY declaration ( COMMA declaration )* SEMICOL )? compoundstatement )
            // Syn.g:28:5: ( ARRAY declaration ( COMMA declaration )* SEMICOL )? compoundstatement
            {
            root_0 = (Object)adaptor.nil();

            // Syn.g:28:5: ( ARRAY declaration ( COMMA declaration )* SEMICOL )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==ARRAY) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // Syn.g:28:6: ARRAY declaration ( COMMA declaration )* SEMICOL
                    {
                    ARRAY1=(Token)match(input,ARRAY,FOLLOW_ARRAY_in_program48); 
                    ARRAY1_tree = (Object)adaptor.create(ARRAY1);
                    root_0 = (Object)adaptor.becomeRoot(ARRAY1_tree, root_0);

                    pushFollow(FOLLOW_declaration_in_program51);
                    declaration2=declaration();

                    state._fsp--;

                    adaptor.addChild(root_0, declaration2.getTree());
                    // Syn.g:28:25: ( COMMA declaration )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==COMMA) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // Syn.g:28:26: COMMA declaration
                    	    {
                    	    COMMA3=(Token)match(input,COMMA,FOLLOW_COMMA_in_program54); 
                    	    pushFollow(FOLLOW_declaration_in_program57);
                    	    declaration4=declaration();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, declaration4.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    SEMICOL5=(Token)match(input,SEMICOL,FOLLOW_SEMICOL_in_program61); 

                    }
                    break;

            }

            pushFollow(FOLLOW_compoundstatement_in_program70);
            compoundstatement6=compoundstatement();

            state._fsp--;

            adaptor.addChild(root_0, compoundstatement6.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "program"

    public static class declaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "declaration"
    // Syn.g:32:1: declaration : IDENTIFIER OPENSQB constant CLOSESQB ;
    public final Syn.declaration_return declaration() throws RecognitionException {
        Syn.declaration_return retval = new Syn.declaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IDENTIFIER7=null;
        Token OPENSQB8=null;
        Token CLOSESQB10=null;
        Syn.constant_return constant9 = null;


        Object IDENTIFIER7_tree=null;
        Object OPENSQB8_tree=null;
        Object CLOSESQB10_tree=null;

        try {
            // Syn.g:32:13: ( IDENTIFIER OPENSQB constant CLOSESQB )
            // Syn.g:33:5: IDENTIFIER OPENSQB constant CLOSESQB
            {
            root_0 = (Object)adaptor.nil();

            IDENTIFIER7=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_declaration85); 
            IDENTIFIER7_tree = (Object)adaptor.create(IDENTIFIER7);
            root_0 = (Object)adaptor.becomeRoot(IDENTIFIER7_tree, root_0);

            OPENSQB8=(Token)match(input,OPENSQB,FOLLOW_OPENSQB_in_declaration88); 
            pushFollow(FOLLOW_constant_in_declaration91);
            constant9=constant();

            state._fsp--;

            adaptor.addChild(root_0, constant9.getTree());
            CLOSESQB10=(Token)match(input,CLOSESQB,FOLLOW_CLOSESQB_in_declaration93); 

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "declaration"

    public static class compoundstatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "compoundstatement"
    // Syn.g:36:1: compoundstatement : BEGIN ( statement SEMICOL )* END ;
    public final Syn.compoundstatement_return compoundstatement() throws RecognitionException {
        Syn.compoundstatement_return retval = new Syn.compoundstatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token BEGIN11=null;
        Token SEMICOL13=null;
        Token END14=null;
        Syn.statement_return statement12 = null;


        Object BEGIN11_tree=null;
        Object SEMICOL13_tree=null;
        Object END14_tree=null;

        try {
            // Syn.g:36:19: ( BEGIN ( statement SEMICOL )* END )
            // Syn.g:37:5: BEGIN ( statement SEMICOL )* END
            {
            root_0 = (Object)adaptor.nil();

            BEGIN11=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_compoundstatement111); 
            BEGIN11_tree = (Object)adaptor.create(BEGIN11);
            root_0 = (Object)adaptor.becomeRoot(BEGIN11_tree, root_0);

            // Syn.g:37:12: ( statement SEMICOL )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=WRITELN && LA3_0<=READ)||LA3_0==IF||LA3_0==REPEAT||LA3_0==IDENTIFIER) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // Syn.g:37:13: statement SEMICOL
            	    {
            	    pushFollow(FOLLOW_statement_in_compoundstatement115);
            	    statement12=statement();

            	    state._fsp--;

            	    adaptor.addChild(root_0, statement12.getTree());
            	    SEMICOL13=(Token)match(input,SEMICOL,FOLLOW_SEMICOL_in_compoundstatement117); 

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            END14=(Token)match(input,END,FOLLOW_END_in_compoundstatement122); 

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "compoundstatement"

    public static class statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "statement"
    // Syn.g:40:1: statement : ( variable ASSIGN expression | READ OPENP variable CLOSEP | WRITE OPENP ( expression | string ) CLOSEP | WRITELN | IF bool compoundstatement ( ELSE compoundstatement )? | REPEAT compoundstatement UNTIL bool );
    public final Syn.statement_return statement() throws RecognitionException {
        Syn.statement_return retval = new Syn.statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ASSIGN16=null;
        Token READ18=null;
        Token OPENP19=null;
        Token CLOSEP21=null;
        Token WRITE22=null;
        Token OPENP23=null;
        Token CLOSEP26=null;
        Token WRITELN27=null;
        Token IF28=null;
        Token ELSE31=null;
        Token REPEAT33=null;
        Token UNTIL35=null;
        Syn.variable_return variable15 = null;

        Syn.expression_return expression17 = null;

        Syn.variable_return variable20 = null;

        Syn.expression_return expression24 = null;

        Syn.string_return string25 = null;

        Syn.bool_return bool29 = null;

        Syn.compoundstatement_return compoundstatement30 = null;

        Syn.compoundstatement_return compoundstatement32 = null;

        Syn.compoundstatement_return compoundstatement34 = null;

        Syn.bool_return bool36 = null;


        Object ASSIGN16_tree=null;
        Object READ18_tree=null;
        Object OPENP19_tree=null;
        Object CLOSEP21_tree=null;
        Object WRITE22_tree=null;
        Object OPENP23_tree=null;
        Object CLOSEP26_tree=null;
        Object WRITELN27_tree=null;
        Object IF28_tree=null;
        Object ELSE31_tree=null;
        Object REPEAT33_tree=null;
        Object UNTIL35_tree=null;

        try {
            // Syn.g:40:11: ( variable ASSIGN expression | READ OPENP variable CLOSEP | WRITE OPENP ( expression | string ) CLOSEP | WRITELN | IF bool compoundstatement ( ELSE compoundstatement )? | REPEAT compoundstatement UNTIL bool )
            int alt6=6;
            switch ( input.LA(1) ) {
            case IDENTIFIER:
                {
                alt6=1;
                }
                break;
            case READ:
                {
                alt6=2;
                }
                break;
            case WRITE:
                {
                alt6=3;
                }
                break;
            case WRITELN:
                {
                alt6=4;
                }
                break;
            case IF:
                {
                alt6=5;
                }
                break;
            case REPEAT:
                {
                alt6=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // Syn.g:41:5: variable ASSIGN expression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_variable_in_statement138);
                    variable15=variable();

                    state._fsp--;

                    adaptor.addChild(root_0, variable15.getTree());
                    ASSIGN16=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_statement140); 
                    ASSIGN16_tree = (Object)adaptor.create(ASSIGN16);
                    root_0 = (Object)adaptor.becomeRoot(ASSIGN16_tree, root_0);

                    pushFollow(FOLLOW_expression_in_statement143);
                    expression17=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression17.getTree());

                    }
                    break;
                case 2 :
                    // Syn.g:42:5: READ OPENP variable CLOSEP
                    {
                    root_0 = (Object)adaptor.nil();

                    READ18=(Token)match(input,READ,FOLLOW_READ_in_statement149); 
                    READ18_tree = (Object)adaptor.create(READ18);
                    root_0 = (Object)adaptor.becomeRoot(READ18_tree, root_0);

                    OPENP19=(Token)match(input,OPENP,FOLLOW_OPENP_in_statement152); 
                    pushFollow(FOLLOW_variable_in_statement155);
                    variable20=variable();

                    state._fsp--;

                    adaptor.addChild(root_0, variable20.getTree());
                    CLOSEP21=(Token)match(input,CLOSEP,FOLLOW_CLOSEP_in_statement157); 

                    }
                    break;
                case 3 :
                    // Syn.g:43:5: WRITE OPENP ( expression | string ) CLOSEP
                    {
                    root_0 = (Object)adaptor.nil();

                    WRITE22=(Token)match(input,WRITE,FOLLOW_WRITE_in_statement164); 
                    WRITE22_tree = (Object)adaptor.create(WRITE22);
                    root_0 = (Object)adaptor.becomeRoot(WRITE22_tree, root_0);

                    OPENP23=(Token)match(input,OPENP,FOLLOW_OPENP_in_statement167); 
                    // Syn.g:43:19: ( expression | string )
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==OPENP||(LA4_0>=PLUS && LA4_0<=MINUS)||LA4_0==IDENTIFIER||LA4_0==REALNUM) ) {
                        alt4=1;
                    }
                    else if ( (LA4_0==STRING) ) {
                        alt4=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 0, input);

                        throw nvae;
                    }
                    switch (alt4) {
                        case 1 :
                            // Syn.g:43:20: expression
                            {
                            pushFollow(FOLLOW_expression_in_statement171);
                            expression24=expression();

                            state._fsp--;

                            adaptor.addChild(root_0, expression24.getTree());

                            }
                            break;
                        case 2 :
                            // Syn.g:43:33: string
                            {
                            pushFollow(FOLLOW_string_in_statement175);
                            string25=string();

                            state._fsp--;

                            adaptor.addChild(root_0, string25.getTree());

                            }
                            break;

                    }

                    CLOSEP26=(Token)match(input,CLOSEP,FOLLOW_CLOSEP_in_statement178); 

                    }
                    break;
                case 4 :
                    // Syn.g:44:5: WRITELN
                    {
                    root_0 = (Object)adaptor.nil();

                    WRITELN27=(Token)match(input,WRITELN,FOLLOW_WRITELN_in_statement185); 
                    WRITELN27_tree = (Object)adaptor.create(WRITELN27);
                    adaptor.addChild(root_0, WRITELN27_tree);


                    }
                    break;
                case 5 :
                    // Syn.g:45:5: IF bool compoundstatement ( ELSE compoundstatement )?
                    {
                    root_0 = (Object)adaptor.nil();

                    IF28=(Token)match(input,IF,FOLLOW_IF_in_statement191); 
                    IF28_tree = (Object)adaptor.create(IF28);
                    root_0 = (Object)adaptor.becomeRoot(IF28_tree, root_0);

                    pushFollow(FOLLOW_bool_in_statement194);
                    bool29=bool();

                    state._fsp--;

                    adaptor.addChild(root_0, bool29.getTree());
                    pushFollow(FOLLOW_compoundstatement_in_statement196);
                    compoundstatement30=compoundstatement();

                    state._fsp--;

                    adaptor.addChild(root_0, compoundstatement30.getTree());
                    // Syn.g:45:32: ( ELSE compoundstatement )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==ELSE) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // Syn.g:45:33: ELSE compoundstatement
                            {
                            ELSE31=(Token)match(input,ELSE,FOLLOW_ELSE_in_statement199); 
                            pushFollow(FOLLOW_compoundstatement_in_statement202);
                            compoundstatement32=compoundstatement();

                            state._fsp--;

                            adaptor.addChild(root_0, compoundstatement32.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 6 :
                    // Syn.g:46:5: REPEAT compoundstatement UNTIL bool
                    {
                    root_0 = (Object)adaptor.nil();

                    REPEAT33=(Token)match(input,REPEAT,FOLLOW_REPEAT_in_statement210); 
                    REPEAT33_tree = (Object)adaptor.create(REPEAT33);
                    root_0 = (Object)adaptor.becomeRoot(REPEAT33_tree, root_0);

                    pushFollow(FOLLOW_compoundstatement_in_statement213);
                    compoundstatement34=compoundstatement();

                    state._fsp--;

                    adaptor.addChild(root_0, compoundstatement34.getTree());
                    UNTIL35=(Token)match(input,UNTIL,FOLLOW_UNTIL_in_statement215); 
                    pushFollow(FOLLOW_bool_in_statement218);
                    bool36=bool();

                    state._fsp--;

                    adaptor.addChild(root_0, bool36.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "statement"

    public static class expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expression"
    // Syn.g:49:1: expression : ( PLUS | MINUS )? term ( ( PLUS | MINUS ) term )* ;
    public final Syn.expression_return expression() throws RecognitionException {
        Syn.expression_return retval = new Syn.expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token PLUS37=null;
        Token MINUS38=null;
        Token PLUS40=null;
        Token MINUS41=null;
        Syn.term_return term39 = null;

        Syn.term_return term42 = null;


        Object PLUS37_tree=null;
        Object MINUS38_tree=null;
        Object PLUS40_tree=null;
        Object MINUS41_tree=null;

        try {
            // Syn.g:49:11: ( ( PLUS | MINUS )? term ( ( PLUS | MINUS ) term )* )
            // Syn.g:50:5: ( PLUS | MINUS )? term ( ( PLUS | MINUS ) term )*
            {
            root_0 = (Object)adaptor.nil();

            // Syn.g:50:5: ( PLUS | MINUS )?
            int alt7=3;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==PLUS) ) {
                alt7=1;
            }
            else if ( (LA7_0==MINUS) ) {
                alt7=2;
            }
            switch (alt7) {
                case 1 :
                    // Syn.g:50:6: PLUS
                    {
                    PLUS37=(Token)match(input,PLUS,FOLLOW_PLUS_in_expression235); 
                    PLUS37_tree = (Object)adaptor.create(PLUS37);
                    root_0 = (Object)adaptor.becomeRoot(PLUS37_tree, root_0);


                    }
                    break;
                case 2 :
                    // Syn.g:50:14: MINUS
                    {
                    MINUS38=(Token)match(input,MINUS,FOLLOW_MINUS_in_expression240); 
                    MINUS38_tree = (Object)adaptor.create(MINUS38);
                    root_0 = (Object)adaptor.becomeRoot(MINUS38_tree, root_0);


                    }
                    break;

            }

            pushFollow(FOLLOW_term_in_expression246);
            term39=term();

            state._fsp--;

            adaptor.addChild(root_0, term39.getTree());
            // Syn.g:50:29: ( ( PLUS | MINUS ) term )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=PLUS && LA9_0<=MINUS)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // Syn.g:50:30: ( PLUS | MINUS ) term
            	    {
            	    // Syn.g:50:30: ( PLUS | MINUS )
            	    int alt8=2;
            	    int LA8_0 = input.LA(1);

            	    if ( (LA8_0==PLUS) ) {
            	        alt8=1;
            	    }
            	    else if ( (LA8_0==MINUS) ) {
            	        alt8=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 8, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt8) {
            	        case 1 :
            	            // Syn.g:50:32: PLUS
            	            {
            	            PLUS40=(Token)match(input,PLUS,FOLLOW_PLUS_in_expression251); 
            	            PLUS40_tree = (Object)adaptor.create(PLUS40);
            	            root_0 = (Object)adaptor.becomeRoot(PLUS40_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // Syn.g:50:40: MINUS
            	            {
            	            MINUS41=(Token)match(input,MINUS,FOLLOW_MINUS_in_expression256); 
            	            MINUS41_tree = (Object)adaptor.create(MINUS41);
            	            root_0 = (Object)adaptor.becomeRoot(MINUS41_tree, root_0);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_term_in_expression261);
            	    term42=term();

            	    state._fsp--;

            	    adaptor.addChild(root_0, term42.getTree());

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expression"

    public static class bool_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "bool"
    // Syn.g:53:1: bool : expression relation expression ;
    public final Syn.bool_return bool() throws RecognitionException {
        Syn.bool_return retval = new Syn.bool_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Syn.expression_return expression43 = null;

        Syn.relation_return relation44 = null;

        Syn.expression_return expression45 = null;



        try {
            // Syn.g:53:5: ( expression relation expression )
            // Syn.g:54:5: expression relation expression
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_expression_in_bool280);
            expression43=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression43.getTree());
            pushFollow(FOLLOW_relation_in_bool282);
            relation44=relation();

            state._fsp--;

            root_0 = (Object)adaptor.becomeRoot(relation44.getTree(), root_0);
            pushFollow(FOLLOW_expression_in_bool285);
            expression45=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression45.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "bool"

    public static class relation_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "relation"
    // Syn.g:57:1: relation : ( GREATER | GREATEQ | EQ | NEQ | LESSEQ | LESS );
    public final Syn.relation_return relation() throws RecognitionException {
        Syn.relation_return retval = new Syn.relation_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set46=null;

        Object set46_tree=null;

        try {
            // Syn.g:57:9: ( GREATER | GREATEQ | EQ | NEQ | LESSEQ | LESS )
            // Syn.g:
            {
            root_0 = (Object)adaptor.nil();

            set46=(Token)input.LT(1);
            if ( (input.LA(1)>=GREATER && input.LA(1)<=NEQ) ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set46));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "relation"

    public static class constant_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "constant"
    // Syn.g:61:1: constant : REALNUM ;
    public final Syn.constant_return constant() throws RecognitionException {
        Syn.constant_return retval = new Syn.constant_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token REALNUM47=null;

        Object REALNUM47_tree=null;

        try {
            // Syn.g:61:9: ( REALNUM )
            // Syn.g:62:5: REALNUM
            {
            root_0 = (Object)adaptor.nil();

            REALNUM47=(Token)match(input,REALNUM,FOLLOW_REALNUM_in_constant337); 
            REALNUM47_tree = (Object)adaptor.create(REALNUM47);
            adaptor.addChild(root_0, REALNUM47_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "constant"

    public static class term_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "term"
    // Syn.g:65:1: term : factor ( ( MULT | DIV ) factor )* ;
    public final Syn.term_return term() throws RecognitionException {
        Syn.term_return retval = new Syn.term_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set49=null;
        Syn.factor_return factor48 = null;

        Syn.factor_return factor50 = null;


        Object set49_tree=null;

        try {
            // Syn.g:65:5: ( factor ( ( MULT | DIV ) factor )* )
            // Syn.g:66:5: factor ( ( MULT | DIV ) factor )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_factor_in_term351);
            factor48=factor();

            state._fsp--;

            adaptor.addChild(root_0, factor48.getTree());
            // Syn.g:66:12: ( ( MULT | DIV ) factor )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=DIV && LA10_0<=MULT)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // Syn.g:66:13: ( MULT | DIV ) factor
            	    {
            	    set49=(Token)input.LT(1);
            	    set49=(Token)input.LT(1);
            	    if ( (input.LA(1)>=DIV && input.LA(1)<=MULT) ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set49), root_0);
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_factor_in_term363);
            	    factor50=factor();

            	    state._fsp--;

            	    adaptor.addChild(root_0, factor50.getTree());

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "term"

    public static class factor_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "factor"
    // Syn.g:69:1: factor : ( variable | constant | OPENP expression CLOSEP );
    public final Syn.factor_return factor() throws RecognitionException {
        Syn.factor_return retval = new Syn.factor_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OPENP53=null;
        Token CLOSEP55=null;
        Syn.variable_return variable51 = null;

        Syn.constant_return constant52 = null;

        Syn.expression_return expression54 = null;


        Object OPENP53_tree=null;
        Object CLOSEP55_tree=null;

        try {
            // Syn.g:69:7: ( variable | constant | OPENP expression CLOSEP )
            int alt11=3;
            switch ( input.LA(1) ) {
            case IDENTIFIER:
                {
                alt11=1;
                }
                break;
            case REALNUM:
                {
                alt11=2;
                }
                break;
            case OPENP:
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // Syn.g:70:5: variable
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_variable_in_factor379);
                    variable51=variable();

                    state._fsp--;

                    adaptor.addChild(root_0, variable51.getTree());

                    }
                    break;
                case 2 :
                    // Syn.g:71:7: constant
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_constant_in_factor387);
                    constant52=constant();

                    state._fsp--;

                    adaptor.addChild(root_0, constant52.getTree());

                    }
                    break;
                case 3 :
                    // Syn.g:72:7: OPENP expression CLOSEP
                    {
                    root_0 = (Object)adaptor.nil();

                    OPENP53=(Token)match(input,OPENP,FOLLOW_OPENP_in_factor395); 
                    pushFollow(FOLLOW_expression_in_factor398);
                    expression54=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression54.getTree());
                    CLOSEP55=(Token)match(input,CLOSEP,FOLLOW_CLOSEP_in_factor400); 

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "factor"

    public static class variable_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "variable"
    // Syn.g:75:1: variable : IDENTIFIER ( OPENSQB expression CLOSESQB )? ;
    public final Syn.variable_return variable() throws RecognitionException {
        Syn.variable_return retval = new Syn.variable_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IDENTIFIER56=null;
        Token OPENSQB57=null;
        Token CLOSESQB59=null;
        Syn.expression_return expression58 = null;


        Object IDENTIFIER56_tree=null;
        Object OPENSQB57_tree=null;
        Object CLOSESQB59_tree=null;

        try {
            // Syn.g:75:9: ( IDENTIFIER ( OPENSQB expression CLOSESQB )? )
            // Syn.g:76:5: IDENTIFIER ( OPENSQB expression CLOSESQB )?
            {
            root_0 = (Object)adaptor.nil();

            IDENTIFIER56=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_variable415); 
            IDENTIFIER56_tree = (Object)adaptor.create(IDENTIFIER56);
            root_0 = (Object)adaptor.becomeRoot(IDENTIFIER56_tree, root_0);

            // Syn.g:76:17: ( OPENSQB expression CLOSESQB )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==OPENSQB) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // Syn.g:76:18: OPENSQB expression CLOSESQB
                    {
                    OPENSQB57=(Token)match(input,OPENSQB,FOLLOW_OPENSQB_in_variable419); 
                    pushFollow(FOLLOW_expression_in_variable422);
                    expression58=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression58.getTree());
                    CLOSESQB59=(Token)match(input,CLOSESQB,FOLLOW_CLOSESQB_in_variable424); 

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "variable"

    protected static class string_scope {
        String tmp;
    }
    protected Stack string_stack = new Stack();

    public static class string_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "string"
    // Syn.g:79:1: string : s= STRING -> STRING[$string::tmp] ;
    public final Syn.string_return string() throws RecognitionException {
        string_stack.push(new string_scope());
        Syn.string_return retval = new Syn.string_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token s=null;

        Object s_tree=null;
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");

        try {
            // Syn.g:81:5: (s= STRING -> STRING[$string::tmp] )
            // Syn.g:82:5: s= STRING
            {
            s=(Token)match(input,STRING,FOLLOW_STRING_in_string458);  
            stream_STRING.add(s);

             ((string_scope)string_stack.peek()).tmp = cleanString((s!=null?s.getText():null)); 


            // AST REWRITE
            // elements: STRING
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 82:54: -> STRING[$string::tmp]
            {
                adaptor.addChild(root_0, (Object)adaptor.create(STRING, ((string_scope)string_stack.peek()).tmp));

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            string_stack.pop();
        }
        return retval;
    }
    // $ANTLR end "string"

    // Delegated rules


 

    public static final BitSet FOLLOW_ARRAY_in_program48 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_declaration_in_program51 = new BitSet(new long[]{0x0000000000084000L});
    public static final BitSet FOLLOW_COMMA_in_program54 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_declaration_in_program57 = new BitSet(new long[]{0x0000000000084000L});
    public static final BitSet FOLLOW_SEMICOL_in_program61 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_compoundstatement_in_program70 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_declaration85 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_OPENSQB_in_declaration88 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_constant_in_declaration91 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_CLOSESQB_in_declaration93 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BEGIN_in_compoundstatement111 = new BitSet(new long[]{0x0000000200002AE0L});
    public static final BitSet FOLLOW_statement_in_compoundstatement115 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_SEMICOL_in_compoundstatement117 = new BitSet(new long[]{0x0000000200002AE0L});
    public static final BitSet FOLLOW_END_in_compoundstatement122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_statement138 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_ASSIGN_in_statement140 = new BitSet(new long[]{0x0000002200308000L});
    public static final BitSet FOLLOW_expression_in_statement143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_READ_in_statement149 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_OPENP_in_statement152 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_variable_in_statement155 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_CLOSEP_in_statement157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WRITE_in_statement164 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_OPENP_in_statement167 = new BitSet(new long[]{0x0000006200308000L});
    public static final BitSet FOLLOW_expression_in_statement171 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_string_in_statement175 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_CLOSEP_in_statement178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WRITELN_in_statement185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_statement191 = new BitSet(new long[]{0x0000002200308000L});
    public static final BitSet FOLLOW_bool_in_statement194 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_compoundstatement_in_statement196 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_ELSE_in_statement199 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_compoundstatement_in_statement202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REPEAT_in_statement210 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_compoundstatement_in_statement213 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_UNTIL_in_statement215 = new BitSet(new long[]{0x0000002200308000L});
    public static final BitSet FOLLOW_bool_in_statement218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLUS_in_expression235 = new BitSet(new long[]{0x0000002200308000L});
    public static final BitSet FOLLOW_MINUS_in_expression240 = new BitSet(new long[]{0x0000002200308000L});
    public static final BitSet FOLLOW_term_in_expression246 = new BitSet(new long[]{0x0000000000300002L});
    public static final BitSet FOLLOW_PLUS_in_expression251 = new BitSet(new long[]{0x0000002200308000L});
    public static final BitSet FOLLOW_MINUS_in_expression256 = new BitSet(new long[]{0x0000002200308000L});
    public static final BitSet FOLLOW_term_in_expression261 = new BitSet(new long[]{0x0000000000300002L});
    public static final BitSet FOLLOW_expression_in_bool280 = new BitSet(new long[]{0x000000003F000000L});
    public static final BitSet FOLLOW_relation_in_bool282 = new BitSet(new long[]{0x0000002200308000L});
    public static final BitSet FOLLOW_expression_in_bool285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_relation0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REALNUM_in_constant337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_factor_in_term351 = new BitSet(new long[]{0x0000000000C00002L});
    public static final BitSet FOLLOW_set_in_term354 = new BitSet(new long[]{0x0000002200308000L});
    public static final BitSet FOLLOW_factor_in_term363 = new BitSet(new long[]{0x0000000000C00002L});
    public static final BitSet FOLLOW_variable_in_factor379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constant_in_factor387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPENP_in_factor395 = new BitSet(new long[]{0x0000002200308000L});
    public static final BitSet FOLLOW_expression_in_factor398 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_CLOSEP_in_factor400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_variable415 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_OPENSQB_in_variable419 = new BitSet(new long[]{0x0000002200308000L});
    public static final BitSet FOLLOW_expression_in_variable422 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_CLOSESQB_in_variable424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_string458 = new BitSet(new long[]{0x0000000000000002L});

}