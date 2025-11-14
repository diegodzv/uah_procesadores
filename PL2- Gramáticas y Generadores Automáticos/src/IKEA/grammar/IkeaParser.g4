parser grammar IkeaParser;

options {
    tokenVocab = IkeaLexer;
}

// =============================================
// Entrada principal (SIN ITEM)
// =============================================
manual
  : step+ EOF
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
  : PONER INT tipoHerraje INT EN PIEZA IDENT
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
  ;

tipoHerraje
  : ESPIGA
  | TUERCA
  | HERRAJE
  ;
