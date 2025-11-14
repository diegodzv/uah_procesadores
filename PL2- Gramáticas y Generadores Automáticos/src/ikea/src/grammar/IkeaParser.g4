parser grammar IkeaParser;

options {
    tokenVocab = IkeaLexer;
}

// =============================================
// Entrada principal (CON ITEM opcional)
// =============================================
manual
  : itemHeader? step+ EOF
  ;

itemHeader
  : ITEM COLON IDENT
  ;

// =============================================
// Pasos y subpasos
// =============================================
step
  : stepLabel DOT instructionList
  ;

stepLabel
  : INT (DOT INT)*
  ;

// =============================================
// Lista de instrucciones
// =============================================
instructionList
  : instruction (SEMI instruction)*
  ;

// =============================================
// Tipos de instrucciones
// =============================================
instruction
  : unirInstr
  | ponerInstr
  | girarInstr
  | repetirInstr
  | atornillarInstr
  | conHerramientaAtornillarInstr
  ;

// =============================================
// Instrucciones individuales
// =============================================

unirInstr
  : UNIR PIEZA IDENT Y PIEZA IDENT
  ;

ponerInstr
  : CON herramienta COMMA PONER INT tipoHerraje INT EN PIEZA IDENT
  ;

conHerramientaAtornillarInstr
  : CON herramienta COMMA atornillarInstr
  ;

atornillarInstr
  : ATORNILLAR INT TORNILLO INT
    (EN PIEZA IDENT)?
    (CON TUERCA INT)?
  ;

girarInstr
  : GIRAR orientacion
  ;

repetirInstr
  : REPETIR stepLabel
  ;

// =============================================
// Subreglas
// =============================================

orientacion
  : ARRIBA
  | ABAJO
  | LATERAL
  ;

herramienta
  : DESTORNILLADOR
  | MARTILLO
  | MANO
  ;

tipoHerraje
  : ESPIGA
  | TUERCA
  | HERRAJE
  ;
