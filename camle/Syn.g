// COMS22303: Syntax analyser

parser grammar Syn;

options {
  tokenVocab = Lex;
  output = AST;
}

@members
{
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
}

program :
    (ARRAY^ declaration (COMMA! declaration)* SEMICOL!)?
    compoundstatement
  ;

declaration :
    IDENTIFIER^ OPENSQB! constant CLOSESQB!
  ;
  
compoundstatement :
    BEGIN^ (statement SEMICOL!)* END!
  ;

statement :
    variable ASSIGN^ expression
  | READ^ OPENP! variable CLOSEP!
  | WRITE^ OPENP! (expression | string) CLOSEP!
  | WRITELN
  | IF^ bool compoundstatement (ELSE! compoundstatement)?
  | REPEAT^ compoundstatement UNTIL! bool
  ;
  
expression:
    (PLUS^ | MINUS^ )? term (( PLUS^ | MINUS^ ) term )*  
  ;

bool:
    expression relation^ expression
  ;
  
relation:
    GREATER | GREATEQ | EQ | NEQ | LESSEQ | LESS
  ;
  
constant:
    REALNUM
  ;

term:
    factor ((MULT | DIV)^ factor)*
  ;

factor:
    variable
    | constant
    | OPENP! expression CLOSEP!
  ;

variable:
    IDENTIFIER^ (OPENSQB! expression CLOSESQB!)?
  ;
  
string
    scope { String tmp;}
    :
    s=STRING { $string::tmp = cleanString($s.text); }-> STRING[$string::tmp]
  ;
