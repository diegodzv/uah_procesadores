parser grammar CSVParser;

options { tokenVocab=CSVLexer; }

csv         : header NEWLINE row+ EOF ;  // un CSV tiene cabecera y varias filas
header      : field (SEP field)* ;       // los campos del encabezado
row         : field (SEP field)* ;       // los campos de una fila
field       : TEXT | STRING ;            // un campo puede ser texto o cadena
