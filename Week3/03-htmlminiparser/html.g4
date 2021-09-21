grammar html;

// Parser:
start   : html EOF ;

html : BEGINTAG html ENDTAG
     | TEXT
     |
     ;

// Lexer:

/*
BOLDTAG : '<b>' ;
BOLDEND : '</b>' ;
....
*/

BEGINTAG : '<' IDENT '>' ; 

ENDTAG : '</' IDENT '>' ;

fragment
IDENT : [a-zA-Z][a-zA-Z_0-9]*;

TEXT : ~[<>/ \t\n]+ ;

WHITESPACE : [ \t\n] -> skip;