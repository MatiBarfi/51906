lexer grammar AnalizadorLexer;

//Lexemas
IF: 'if';
PRINTF:'printf';
ELSE:'else';
LPARENT:'(';
RPARENT:')';
LCBRACES:'{';
RCBRACES:'}';
SEMICOLON: ';';
RETURN: 'return';
CERO: '0';
UNO: '1';
WS: [ \t\r\n]+ -> skip ;
LDCOMILLA : '"' -> pushMode(STRING_MODE);
mode STRING_MODE;
    STRING_MODE_LETRA  : [a-zA-Z]    -> type(LETRA);
    STRING_MODE_DIGITO : [0-9]       -> type(DIGITO);
    STRING_MODE_SIMBOLO: [.,!?:;']   -> type(SIMBOLO);
    STRING_MODE_ESPACIO : [ \t\r\n]+ -> skip;     
LDCOMILLA_END  : '"' -> popMode;
LETRA: ([a-z]|[A-Z]);
DIGITO: [0-9];
SIMBOLO: [.,!?:;'];