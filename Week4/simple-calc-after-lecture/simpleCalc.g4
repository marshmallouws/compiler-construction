grammar simpleCalc;

start   : e=expr EOF;

expr : d=CONST                        # Constant
     | e1=expr op='*'       e2=expr   # Multiplication
     | e1=expr op=('+'|'-') e2=expr   # Addition
     | '(' e=expr ')'   	      # Parenthesis
     ;

IDENTIFIER : [a-zA-Z_] [a-zA-Z0-9_]*;

CONST : [0-9]+ ('.' [0-9]+)? ;

HVIDRUM : [ \t\n]+ -> skip ;
KOMMENTAR : ('//' (~[\n])*) -> skip ;
MULTILINECOMMENTS :  ( '/*'  (( '*'~[/] | ~[*]  )*) '*/') -> skip; 

