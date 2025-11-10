lexer grammar CSVLexer;

// --- Tokens ---
SEP        : [;,|] ;                    // separadores válidos
STRING     : '"' (~["\r\n])* '"' ;      // cadenas entre comillas
TEXT       : ~[;\n\r,|"]+ ;             // texto normal (sin separadores ni comillas)
NEWLINE    : '\r'? '\n' ;               // salto de línea
WS         : [ \t]+ -> skip ;           // espacios o tabulaciones, se ignoran
