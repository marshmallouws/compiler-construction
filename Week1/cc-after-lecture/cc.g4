grammar cc;

// Parser:
start   : 'Holder:' NAVN 'Number:' CCNUM+ 'Expiry:' CCEXP EOF ;

// Lexer:

NAVN   : [a-zA-Z-]+ (' ' [a-zA-Z-]+) *;

//
CCNUM  : CCBLOCK CCBLOCK CCBLOCK CCBLOCK ;

fragment CCBLOCK : [0-9][0-9][0-9][0-9] ' '* ;
//

CCEXP  : MONTH '/' [0-9][0-9];
fragment
MONTH : ('0'? [1-9]) | ('1' [0-2]) ;

WHITESPACE : [ \t\n]+ -> skip ;

COMMENT : '//' ~[\n]* '\n' -> skip ;