grammar Analizador;

//Gramatica
programa: instrucciones EOF
;
instrucciones:instruccion #instr0
              | instrucciones instruccion #instr1
;
instruccion:decision #ins1
;   
decision:IF LPARENT condicion RPARENT LCBRACES sentencia RCBRACES (ELSE LCBRACES sentencia RCBRACES)? #dec1
;
sentencia:salida #sal1
         |salida sentencia #salsen1
         |terminar #terminar1
;
salida:PRINTF LPARENT cadena RPARENT SEMICOLON #salida1
;
terminar:RETURN SEMICOLON #ter1
;
condicion:CERO #cero1
          |UNO #uno1
;
cadena:LDCOMILLA caracteres LDCOMILLA #cadena1
;
caracteres:caracter #caracter1
         |caracteres caracter #caracteres1
;
caracter:LETRA #letr
         |DIGITO #dig
         |SIMBOLO #sim
;
//Lexemas
IF: 'if';
ELSE:'else';
LPARENT:'(';
RPARENT:')';
LCBRACES:'{';
RCBRACES:'}';
PRINTF:'printf';
SEMICOLON: ';';
RETURN: 'return';
LDCOMILLA: '"';
CERO: '0';
UNO: '1';
LETRA: ([a-z]|[A-Z]);
DIGITO: [0-9];
SIMBOLO: [.,!?:;'];
WS: [ \t\r\n]+ -> skip ;