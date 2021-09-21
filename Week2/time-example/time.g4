grammar time;

// Parser:
start   : DATO TIME* EOF ;

// Lexer:

DATO :   DAG '.' MAANED '.' ;

fragment
DAG : '0'?[1-9] | [1-2][0-9] | '3'[0-1];

fragment
MAANED: ('0'? [1-9]) | '1' [0-2];

TIME : ([01]?[0-9] | '2'[0-3]) [0-5][0-9]'\n';

INT : '-'? DIGIT+ ;

fragment
DIGIT : [0-9] ;

FLOAT :  '-'? DIGIT+ ('.' DIGIT+)? ('E' DIGIT+)? ;

IDENT : [a-zA-Z_][a-zA-Z_0-9]* ;

COMMENT : '//' ~[\n]* '\n' -> skip ;
WHITESPACE : [ \t\n] -> skip;