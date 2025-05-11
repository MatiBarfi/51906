// Generated from c:/Users/ue/Analizador/Analizador.g4 by ANTLR 4.13.2
// jshint ignore: start
import antlr4 from 'antlr4';


const serializedATN = [4,0,16,85,6,-1,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,
4,7,4,2,5,7,5,2,6,7,6,2,7,7,7,2,8,7,8,2,9,7,9,2,10,7,10,2,11,7,11,2,12,7,
12,2,13,7,13,2,14,7,14,2,15,7,15,1,0,1,0,1,0,1,1,1,1,1,1,1,1,1,1,1,2,1,2,
1,3,1,3,1,4,1,4,1,5,1,5,1,6,1,6,1,6,1,6,1,6,1,6,1,6,1,7,1,7,1,8,1,8,1,8,
1,8,1,8,1,8,1,8,1,9,1,9,1,10,1,10,1,11,1,11,1,12,3,12,73,8,12,1,13,1,13,
1,14,1,14,1,15,4,15,80,8,15,11,15,12,15,81,1,15,1,15,0,0,16,1,1,3,2,5,3,
7,4,9,5,11,6,13,7,15,8,17,9,19,10,21,11,23,12,25,13,27,14,29,15,31,16,1,
0,4,2,0,65,90,97,122,1,0,48,57,6,0,33,33,39,39,44,44,46,46,58,59,63,63,3,
0,9,10,13,13,32,32,85,0,1,1,0,0,0,0,3,1,0,0,0,0,5,1,0,0,0,0,7,1,0,0,0,0,
9,1,0,0,0,0,11,1,0,0,0,0,13,1,0,0,0,0,15,1,0,0,0,0,17,1,0,0,0,0,19,1,0,0,
0,0,21,1,0,0,0,0,23,1,0,0,0,0,25,1,0,0,0,0,27,1,0,0,0,0,29,1,0,0,0,0,31,
1,0,0,0,1,33,1,0,0,0,3,36,1,0,0,0,5,41,1,0,0,0,7,43,1,0,0,0,9,45,1,0,0,0,
11,47,1,0,0,0,13,49,1,0,0,0,15,56,1,0,0,0,17,58,1,0,0,0,19,65,1,0,0,0,21,
67,1,0,0,0,23,69,1,0,0,0,25,72,1,0,0,0,27,74,1,0,0,0,29,76,1,0,0,0,31,79,
1,0,0,0,33,34,5,105,0,0,34,35,5,102,0,0,35,2,1,0,0,0,36,37,5,101,0,0,37,
38,5,108,0,0,38,39,5,115,0,0,39,40,5,101,0,0,40,4,1,0,0,0,41,42,5,40,0,0,
42,6,1,0,0,0,43,44,5,41,0,0,44,8,1,0,0,0,45,46,5,123,0,0,46,10,1,0,0,0,47,
48,5,125,0,0,48,12,1,0,0,0,49,50,5,112,0,0,50,51,5,114,0,0,51,52,5,105,0,
0,52,53,5,110,0,0,53,54,5,116,0,0,54,55,5,102,0,0,55,14,1,0,0,0,56,57,5,
59,0,0,57,16,1,0,0,0,58,59,5,114,0,0,59,60,5,101,0,0,60,61,5,116,0,0,61,
62,5,117,0,0,62,63,5,114,0,0,63,64,5,110,0,0,64,18,1,0,0,0,65,66,5,34,0,
0,66,20,1,0,0,0,67,68,5,48,0,0,68,22,1,0,0,0,69,70,5,49,0,0,70,24,1,0,0,
0,71,73,7,0,0,0,72,71,1,0,0,0,73,26,1,0,0,0,74,75,7,1,0,0,75,28,1,0,0,0,
76,77,7,2,0,0,77,30,1,0,0,0,78,80,7,3,0,0,79,78,1,0,0,0,80,81,1,0,0,0,81,
79,1,0,0,0,81,82,1,0,0,0,82,83,1,0,0,0,83,84,6,15,0,0,84,32,1,0,0,0,3,0,
72,81,1,6,0,0];


const atn = new antlr4.atn.ATNDeserializer().deserialize(serializedATN);

const decisionsToDFA = atn.decisionToState.map( (ds, index) => new antlr4.dfa.DFA(ds, index) );

export default class AnalizadorLexer extends antlr4.Lexer {

    static grammarFileName = "Analizador.g4";
    static channelNames = [ "DEFAULT_TOKEN_CHANNEL", "HIDDEN" ];
	static modeNames = [ "DEFAULT_MODE" ];
	static literalNames = [ null, "'if'", "'else'", "'('", "')'", "'{'", "'}'", 
                         "'printf'", "';'", "'return'", "'\"'", "'0'", "'1'" ];
	static symbolicNames = [ null, "IF", "ELSE", "LPARENT", "RPARENT", "LCBRACES", 
                          "RCBRACES", "PRINTF", "SEMICOLON", "RETURN", "LDCOMILLA", 
                          "CERO", "UNO", "LETRA", "DIGITO", "SIMBOLO", "WS" ];
	static ruleNames = [ "IF", "ELSE", "LPARENT", "RPARENT", "LCBRACES", "RCBRACES", 
                      "PRINTF", "SEMICOLON", "RETURN", "LDCOMILLA", "CERO", 
                      "UNO", "LETRA", "DIGITO", "SIMBOLO", "WS" ];

    constructor(input) {
        super(input)
        this._interp = new antlr4.atn.LexerATNSimulator(this, atn, decisionsToDFA, new antlr4.atn.PredictionContextCache());
    }
}

AnalizadorLexer.EOF = antlr4.Token.EOF;
AnalizadorLexer.IF = 1;
AnalizadorLexer.ELSE = 2;
AnalizadorLexer.LPARENT = 3;
AnalizadorLexer.RPARENT = 4;
AnalizadorLexer.LCBRACES = 5;
AnalizadorLexer.RCBRACES = 6;
AnalizadorLexer.PRINTF = 7;
AnalizadorLexer.SEMICOLON = 8;
AnalizadorLexer.RETURN = 9;
AnalizadorLexer.LDCOMILLA = 10;
AnalizadorLexer.CERO = 11;
AnalizadorLexer.UNO = 12;
AnalizadorLexer.LETRA = 13;
AnalizadorLexer.DIGITO = 14;
AnalizadorLexer.SIMBOLO = 15;
AnalizadorLexer.WS = 16;



