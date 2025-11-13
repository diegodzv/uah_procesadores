lexer grammar ELexer;

ASIGNAR     : 'asignar';
MOSTRAR     : 'mostrar';
SI          : 'si' '->';
NO          : 'no' '->';    
FIN_SI      : 'terminar';
CONDICIONAL : '???';
PUNTOYFIN   : ';P';
MIENTRAS    : 'mientras' [ \t]* '->';      //añadido
FIN_MIENTRAS: 'finmientras';               //añadido  

MAS         : '+';         
MENOS       : '-';
MUL         : '*';     //añadido
DIV         : '/';     //añadido

MAYOR       : '>';
MENOR       : '<';         
MAYORIGUAL  : '>=';        
MENORIGUAL  : '<=';        
IGUAL       : '==';       
DISTINTO    : '!=';        

ASIG        : '=';
COMA        : ',';

PAR_IZQ : '(' ;             //añadido
PAR_DER : ')' ;             //añadido

ENTERO      : [0-9]+;
REAL        : [0-9]+ '.' [0-9]+;  
CADENA      : '"' (~["\r\n])* '"' ;

ID          : [a-zA-Z_][a-zA-Z_0-9]*;

COMENTARIO  : '#' ~[\r\n]* -> skip;
NL          : '\r'? '\n' -> skip;
WS          : [ \t]+ -> skip;
