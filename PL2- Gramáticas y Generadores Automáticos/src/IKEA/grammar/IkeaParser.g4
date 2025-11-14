parser grammar IkeaParser;

options {
    tokenVocab = IkeaLexer;
}

manual
  : ITEM COLON IDENT step+ EOF
  ;

step
  : stepLabel DOT instructionList
  ;

stepLabel
  : INT (DOT INT)*
  ;

instructionList
  : instruction (SEMI instruction)*
  ;

instruction
  : unirInstr
  | ponerInstr
  | girarInstr
  | repetirInstr
  | atornillarInstr
  | conHerramientaAtornillarInstr
  ;

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
