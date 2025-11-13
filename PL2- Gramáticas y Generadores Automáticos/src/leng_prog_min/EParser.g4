parser grammar EParser;

options { tokenVocab=ELexer; }

programa    : instruccion+ EOF ;

instruccion
    : asignacion
    | impresion
    | condicional
    | bucle    //añadido
    ;

bucle
    : MIENTRAS expresion NL* bloque FIN_MIENTRAS;   //añadido
    
asignacion  : ASIGNAR listaIDs ASIG expresion PUNTOYFIN ;

listaIDs : ID (COMA ID)*;  //añadido

impresion   : MOSTRAR expresion PUNTOYFIN ;

condicional
    : expresion CONDICIONAL SI bloque (NO bloque)? FIN_SI
    ;

bloque      : instruccion+ ;

expresion
    : expresion (MAS | MENOS) expresion
    | expresion (MAYOR | MENOR | MAYORIGUAL | MENORIGUAL | IGUAL | DISTINTO) expresion
    | REAL
    | ENTERO
    | CADENA
    | ID
    | PAR_IZQ expresion PAR_DER      //añadido
    ;

