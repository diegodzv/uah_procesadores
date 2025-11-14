lexer grammar IkeaLexer;

// Palabras clave
ITEM           : 'ITEM';
UNIR           : 'UNIR';
PONER          : 'PONER';
ATORNILLAR     : 'ATORNILLAR';
GIRAR          : 'GIRAR';
REPETIR        : 'REPETIR';

PIEZA          : 'PIEZA';

ESPIGA         : 'ESPIGA';
TORNILLO       : 'TORNILLO';
TUERCA         : 'TUERCA';
HERRAJE        : 'HERRAJE';

DESTORNILLADOR : 'DESTORNILLADOR';
MARTILLO       : 'MARTILLO';

CON            : 'Con';
EN             : 'en';
Y              : 'y';
COMMA          : ',';

// NECESARIO PARA EL PARSER
COLON          : ':' ;
DOT            : '.' ;
SEMI           : ';' ;

IDENT          : [A-Z_][A-Z_0-9]*;
INT            : [0-9]+;

WS             : [ \t\r\n]+ -> skip;
