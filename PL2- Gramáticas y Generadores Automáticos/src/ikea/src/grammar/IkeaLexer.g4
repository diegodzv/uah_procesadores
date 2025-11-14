lexer grammar IkeaLexer;

// Palabras clave (case-insensitive)
ITEM           : [Ii][Tt][Ee][Mm];
UNIR           : [Uu][Nn][Ii][Rr];
PONER          : [Pp][Oo][Nn][Ee][Rr];
ATORNILLAR     : [Aa][Tt][Oo][Rr][Nn][Ii][Ll][Ll][Aa][Rr];
GIRAR          : [Gg][Ii][Rr][Aa][Rr];
REPETIR        : [Rr][Ee][Pp][Ee][Tt][Ii][Rr];

PIEZA          : [Pp][Ii][Ee][Zz][Aa];

ESPIGA         : [Ee][Ss][Pp][Ii][Gg][Aa];
TORNILLO       : [Tt][Oo][Rr][Nn][Ii][Ll][Ll][Oo];
TUERCA         : [Tt][Uu][Ee][Rr][Cc][Aa];
HERRAJE        : [Hh][Ee][Rr][Rr][Aa][Jj][Ee];

DESTORNILLADOR : [Dd][Ee][Ss][Tt][Oo][Rr][Nn][Ii][Ll][Ll][Aa][Dd][Oo][Rr];
MARTILLO       : [Mm][Aa][Rr][Tt][Ii][Ll][Ll][Oo];
MANO           : [Mm][Aa][Nn][Oo];

// Palabras para orientación
ARRIBA         : [Aa][Rr][Rr][Ii][Bb][Aa];
ABAJO          : [Aa][Bb][Aa][Jj][Oo];
LATERAL        : [Ll][Aa][Tt][Ee][Rr][Aa][Ll];

// Conectores
CON            : [Cc][Oo][Nn];
EN             : [Ee][Nn];
Y              : [Yy];
COMMA          : ',';

// Símbolos
COLON          : ':';
DOT            : '.';
SEMI           : ';';

// Datos
INT            : [0-9]+;
IDENT          : [A-Za-z_][A-Za-z_0-9]*;

// Ignorar espacios
WS             : [ \t\r\n]+ -> skip;
