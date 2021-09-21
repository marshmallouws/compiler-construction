grammar simpleCalc;

start   : expr EOF;

expr : CONST
     | expr '+' expr
     | expr '*' expr
     | '(' expr ')'
     ;

IDENTIFIER : [a-zA-Z_] [a-zA-Z0-9_]+;

CONST : [0-9]+ ('.' [0-9]+)? ;

HVIDRUM : [ \t\n]+ -> skip ;
KOMMENTAR : ('//' (~[\n])*) -> skip ;
MULTILINECOMMENTS :  ( '/*'  (( '*'~[/] | ~[*]  )*) '*/') -> skip; 

