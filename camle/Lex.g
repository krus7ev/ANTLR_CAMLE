// COMS22303: Lexical analyser

lexer grammar Lex;

// KEYWORD TOKENS
BEGIN        : 'begin'  ;
WRITELN      : 'writeln';
WRITE        : 'write'  ;
READ         : 'read'   ;
ARRAY        : 'array'  ;
IF           : 'if'     ;
ELSE         : 'else'   ;
REPEAT       : 'repeat' ;
UNTIL        : 'until'  ;
END          : 'end'    ;

// OPERATOR TOKENS
SEMICOL      : ';' ;
OPENP        : '(' ;
CLOSEP       : ')' ;
OPENSQB      : '[' ;
CLOSESQB     : ']' ;
COMMA        : ',' ;
PLUS         : '+' ;
MINUS        : '-' ;
DIV          : '/' ;
MULT         : '*' ;
GREATER      : '>' ;
GREATEQ      : '>=';
LESS         : '<' ;
LESSEQ       : '<=';
EQ           : '=' ;
NEQ          : '!=';
ASSIGN       : ':=';

// VARIABLE TOKENS
IDENTIFIER   : LETTER (SYMB(SYMB(SYMB(SYMB(SYMB(SYMB(SYMB(SYMB)?)?)?)?)?)?)?)?;

fragment
SYMB       : (LETTER | DIGIT);

REALNUM      : INT '.' INT (EXPONENT)?;

fragment
LETTER       : ('a'..'z') | ('A'..'Z');

fragment 
EXPONENT     : 'e' ('-')? INT ;

fragment
INT          : (DIGIT)+ ;

fragment
DIGIT        : ('0'..'9');

STRING       : '\'' ('\'' '\'' | ~'\'')* '\'';

// SPECIAL TOKENS
COMMENT      : '{' (~'}')* '}' {skip();} ;

WS           : (' ' | '\t' | '\r' | '\n' )+ {skip();} ;
