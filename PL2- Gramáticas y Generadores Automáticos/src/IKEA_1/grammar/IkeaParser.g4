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
  : unirInstr                        #UnirInstrNode
  | ponerInstr                       #PonerInstrNode
  | girarInstr                       #GirarInstrNode
  | repetirInstr                     #RepetirInstrNode
  | atornillarInstr                  #AtornillarInstrNode
  | conHerramientaAtornillarInstr    #ConHerramientaAtornillarInstrNode
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
  : GIRAR IDENT
  ;

repetirInstr
  : REPETIR stepLabel
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
