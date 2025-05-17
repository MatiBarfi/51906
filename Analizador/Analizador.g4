grammar Analizador;
options { tokenVocab=AnalizadorLexer; }
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
cadena:LDCOMILLA caracteres LDCOMILLA_END #cadena1
;
caracteres:caracter #caracter1
         |caracteres caracter #caracteres1
;
caracter:LETRA #letr
         |DIGITO #dig
         |SIMBOLO #sim
;
