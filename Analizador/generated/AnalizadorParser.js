// Generated from c:/Users/ue/Analizador/Analizador.g4 by ANTLR 4.13.2
// jshint ignore: start
import antlr4 from 'antlr4';
import AnalizadorListener from './AnalizadorListener.js';
import AnalizadorVisitor from './AnalizadorVisitor.js';

const serializedATN = [4,1,16,91,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,
2,5,7,5,2,6,7,6,2,7,7,7,2,8,7,8,2,9,7,9,2,10,7,10,1,0,1,0,1,0,1,1,1,1,1,
1,1,1,1,1,5,1,31,8,1,10,1,12,1,34,9,1,1,2,1,2,1,3,1,3,1,3,1,3,1,3,1,3,1,
3,1,3,1,3,1,3,1,3,1,3,3,3,50,8,3,1,4,1,4,1,4,1,4,1,4,3,4,57,8,4,1,5,1,5,
1,5,1,5,1,5,1,5,1,6,1,6,1,6,1,7,1,7,3,7,70,8,7,1,8,1,8,1,8,1,8,1,9,1,9,1,
9,1,9,1,9,5,9,81,8,9,10,9,12,9,84,9,9,1,10,1,10,1,10,3,10,89,8,10,1,10,0,
2,2,18,11,0,2,4,6,8,10,12,14,16,18,20,0,0,87,0,22,1,0,0,0,2,25,1,0,0,0,4,
35,1,0,0,0,6,37,1,0,0,0,8,56,1,0,0,0,10,58,1,0,0,0,12,64,1,0,0,0,14,69,1,
0,0,0,16,71,1,0,0,0,18,75,1,0,0,0,20,88,1,0,0,0,22,23,3,2,1,0,23,24,5,0,
0,1,24,1,1,0,0,0,25,26,6,1,-1,0,26,27,3,4,2,0,27,32,1,0,0,0,28,29,10,1,0,
0,29,31,3,4,2,0,30,28,1,0,0,0,31,34,1,0,0,0,32,30,1,0,0,0,32,33,1,0,0,0,
33,3,1,0,0,0,34,32,1,0,0,0,35,36,3,6,3,0,36,5,1,0,0,0,37,38,5,1,0,0,38,39,
5,3,0,0,39,40,3,14,7,0,40,41,5,4,0,0,41,42,5,5,0,0,42,43,3,8,4,0,43,49,5,
6,0,0,44,45,5,2,0,0,45,46,5,5,0,0,46,47,3,8,4,0,47,48,5,6,0,0,48,50,1,0,
0,0,49,44,1,0,0,0,49,50,1,0,0,0,50,7,1,0,0,0,51,57,3,10,5,0,52,53,3,10,5,
0,53,54,3,8,4,0,54,57,1,0,0,0,55,57,3,12,6,0,56,51,1,0,0,0,56,52,1,0,0,0,
56,55,1,0,0,0,57,9,1,0,0,0,58,59,5,7,0,0,59,60,5,3,0,0,60,61,3,16,8,0,61,
62,5,4,0,0,62,63,5,8,0,0,63,11,1,0,0,0,64,65,5,9,0,0,65,66,5,8,0,0,66,13,
1,0,0,0,67,70,5,11,0,0,68,70,5,12,0,0,69,67,1,0,0,0,69,68,1,0,0,0,70,15,
1,0,0,0,71,72,5,10,0,0,72,73,3,18,9,0,73,74,5,10,0,0,74,17,1,0,0,0,75,76,
6,9,-1,0,76,77,3,20,10,0,77,82,1,0,0,0,78,79,10,1,0,0,79,81,3,20,10,0,80,
78,1,0,0,0,81,84,1,0,0,0,82,80,1,0,0,0,82,83,1,0,0,0,83,19,1,0,0,0,84,82,
1,0,0,0,85,89,5,13,0,0,86,89,5,14,0,0,87,89,5,15,0,0,88,85,1,0,0,0,88,86,
1,0,0,0,88,87,1,0,0,0,89,21,1,0,0,0,6,32,49,56,69,82,88];


const atn = new antlr4.atn.ATNDeserializer().deserialize(serializedATN);

const decisionsToDFA = atn.decisionToState.map( (ds, index) => new antlr4.dfa.DFA(ds, index) );

const sharedContextCache = new antlr4.atn.PredictionContextCache();

export default class AnalizadorParser extends antlr4.Parser {

    static grammarFileName = "Analizador.g4";
    static literalNames = [ null, "'if'", "'else'", "'('", "')'", "'{'", 
                            "'}'", "'printf'", "';'", "'return'", "'\"'", 
                            "'0'", "'1'" ];
    static symbolicNames = [ null, "IF", "ELSE", "LPARENT", "RPARENT", "LCBRACES", 
                             "RCBRACES", "PRINTF", "SEMICOLON", "RETURN", 
                             "LDCOMILLA", "CERO", "UNO", "LETRA", "DIGITO", 
                             "SIMBOLO", "WS" ];
    static ruleNames = [ "programa", "instrucciones", "instruccion", "decision", 
                         "sentencia", "salida", "terminar", "condicion", 
                         "cadena", "caracteres", "caracter" ];

    constructor(input) {
        super(input);
        this._interp = new antlr4.atn.ParserATNSimulator(this, atn, decisionsToDFA, sharedContextCache);
        this.ruleNames = AnalizadorParser.ruleNames;
        this.literalNames = AnalizadorParser.literalNames;
        this.symbolicNames = AnalizadorParser.symbolicNames;
    }

    sempred(localctx, ruleIndex, predIndex) {
    	switch(ruleIndex) {
    	case 1:
    	    		return this.instrucciones_sempred(localctx, predIndex);
    	case 9:
    	    		return this.caracteres_sempred(localctx, predIndex);
        default:
            throw "No predicate with index:" + ruleIndex;
       }
    }

    instrucciones_sempred(localctx, predIndex) {
    	switch(predIndex) {
    		case 0:
    			return this.precpred(this._ctx, 1);
    		default:
    			throw "No predicate with index:" + predIndex;
    	}
    };

    caracteres_sempred(localctx, predIndex) {
    	switch(predIndex) {
    		case 1:
    			return this.precpred(this._ctx, 1);
    		default:
    			throw "No predicate with index:" + predIndex;
    	}
    };




	programa() {
	    let localctx = new ProgramaContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 0, AnalizadorParser.RULE_programa);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 22;
	        this.instrucciones(0);
	        this.state = 23;
	        this.match(AnalizadorParser.EOF);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}


	instrucciones(_p) {
		if(_p===undefined) {
		    _p = 0;
		}
	    const _parentctx = this._ctx;
	    const _parentState = this.state;
	    let localctx = new InstruccionesContext(this, this._ctx, _parentState);
	    let _prevctx = localctx;
	    const _startState = 2;
	    this.enterRecursionRule(localctx, 2, AnalizadorParser.RULE_instrucciones, _p);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        localctx = new Instr0Context(this, localctx);
	        this._ctx = localctx;
	        _prevctx = localctx;

	        this.state = 26;
	        this.instruccion();
	        this._ctx.stop = this._input.LT(-1);
	        this.state = 32;
	        this._errHandler.sync(this);
	        var _alt = this._interp.adaptivePredict(this._input,0,this._ctx)
	        while(_alt!=2 && _alt!=antlr4.atn.ATN.INVALID_ALT_NUMBER) {
	            if(_alt===1) {
	                if(this._parseListeners!==null) {
	                    this.triggerExitRuleEvent();
	                }
	                _prevctx = localctx;
	                localctx = new Instr1Context(this, new InstruccionesContext(this, _parentctx, _parentState));
	                this.pushNewRecursionContext(localctx, _startState, AnalizadorParser.RULE_instrucciones);
	                this.state = 28;
	                if (!( this.precpred(this._ctx, 1))) {
	                    throw new antlr4.error.FailedPredicateException(this, "this.precpred(this._ctx, 1)");
	                }
	                this.state = 29;
	                this.instruccion(); 
	            }
	            this.state = 34;
	            this._errHandler.sync(this);
	            _alt = this._interp.adaptivePredict(this._input,0,this._ctx);
	        }

	    } catch( error) {
	        if(error instanceof antlr4.error.RecognitionException) {
		        localctx.exception = error;
		        this._errHandler.reportError(this, error);
		        this._errHandler.recover(this, error);
		    } else {
		    	throw error;
		    }
	    } finally {
	        this.unrollRecursionContexts(_parentctx)
	    }
	    return localctx;
	}



	instruccion() {
	    let localctx = new InstruccionContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 4, AnalizadorParser.RULE_instruccion);
	    try {
	        localctx = new Ins1Context(this, localctx);
	        this.enterOuterAlt(localctx, 1);
	        this.state = 35;
	        this.decision();
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	decision() {
	    let localctx = new DecisionContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 6, AnalizadorParser.RULE_decision);
	    try {
	        localctx = new Dec1Context(this, localctx);
	        this.enterOuterAlt(localctx, 1);
	        this.state = 37;
	        this.match(AnalizadorParser.IF);
	        this.state = 38;
	        this.match(AnalizadorParser.LPARENT);
	        this.state = 39;
	        this.condicion();
	        this.state = 40;
	        this.match(AnalizadorParser.RPARENT);
	        this.state = 41;
	        this.match(AnalizadorParser.LCBRACES);
	        this.state = 42;
	        this.sentencia();
	        this.state = 43;
	        this.match(AnalizadorParser.RCBRACES);
	        this.state = 49;
	        this._errHandler.sync(this);
	        var la_ = this._interp.adaptivePredict(this._input,1,this._ctx);
	        if(la_===1) {
	            this.state = 44;
	            this.match(AnalizadorParser.ELSE);
	            this.state = 45;
	            this.match(AnalizadorParser.LCBRACES);
	            this.state = 46;
	            this.sentencia();
	            this.state = 47;
	            this.match(AnalizadorParser.RCBRACES);

	        }
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	sentencia() {
	    let localctx = new SentenciaContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 8, AnalizadorParser.RULE_sentencia);
	    try {
	        this.state = 56;
	        this._errHandler.sync(this);
	        var la_ = this._interp.adaptivePredict(this._input,2,this._ctx);
	        switch(la_) {
	        case 1:
	            localctx = new Sal1Context(this, localctx);
	            this.enterOuterAlt(localctx, 1);
	            this.state = 51;
	            this.salida();
	            break;

	        case 2:
	            localctx = new Salsen1Context(this, localctx);
	            this.enterOuterAlt(localctx, 2);
	            this.state = 52;
	            this.salida();
	            this.state = 53;
	            this.sentencia();
	            break;

	        case 3:
	            localctx = new Terminar1Context(this, localctx);
	            this.enterOuterAlt(localctx, 3);
	            this.state = 55;
	            this.terminar();
	            break;

	        }
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	salida() {
	    let localctx = new SalidaContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 10, AnalizadorParser.RULE_salida);
	    try {
	        localctx = new Salida1Context(this, localctx);
	        this.enterOuterAlt(localctx, 1);
	        this.state = 58;
	        this.match(AnalizadorParser.PRINTF);
	        this.state = 59;
	        this.match(AnalizadorParser.LPARENT);
	        this.state = 60;
	        this.cadena();
	        this.state = 61;
	        this.match(AnalizadorParser.RPARENT);
	        this.state = 62;
	        this.match(AnalizadorParser.SEMICOLON);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	terminar() {
	    let localctx = new TerminarContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 12, AnalizadorParser.RULE_terminar);
	    try {
	        localctx = new Ter1Context(this, localctx);
	        this.enterOuterAlt(localctx, 1);
	        this.state = 64;
	        this.match(AnalizadorParser.RETURN);
	        this.state = 65;
	        this.match(AnalizadorParser.SEMICOLON);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	condicion() {
	    let localctx = new CondicionContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 14, AnalizadorParser.RULE_condicion);
	    try {
	        this.state = 69;
	        this._errHandler.sync(this);
	        switch(this._input.LA(1)) {
	        case 11:
	            localctx = new Cero1Context(this, localctx);
	            this.enterOuterAlt(localctx, 1);
	            this.state = 67;
	            this.match(AnalizadorParser.CERO);
	            break;
	        case 12:
	            localctx = new Uno1Context(this, localctx);
	            this.enterOuterAlt(localctx, 2);
	            this.state = 68;
	            this.match(AnalizadorParser.UNO);
	            break;
	        default:
	            throw new antlr4.error.NoViableAltException(this);
	        }
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	cadena() {
	    let localctx = new CadenaContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 16, AnalizadorParser.RULE_cadena);
	    try {
	        localctx = new Cadena1Context(this, localctx);
	        this.enterOuterAlt(localctx, 1);
	        this.state = 71;
	        this.match(AnalizadorParser.LDCOMILLA);
	        this.state = 72;
	        this.caracteres(0);
	        this.state = 73;
	        this.match(AnalizadorParser.LDCOMILLA);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}


	caracteres(_p) {
		if(_p===undefined) {
		    _p = 0;
		}
	    const _parentctx = this._ctx;
	    const _parentState = this.state;
	    let localctx = new CaracteresContext(this, this._ctx, _parentState);
	    let _prevctx = localctx;
	    const _startState = 18;
	    this.enterRecursionRule(localctx, 18, AnalizadorParser.RULE_caracteres, _p);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        localctx = new Caracter1Context(this, localctx);
	        this._ctx = localctx;
	        _prevctx = localctx;

	        this.state = 76;
	        this.caracter();
	        this._ctx.stop = this._input.LT(-1);
	        this.state = 82;
	        this._errHandler.sync(this);
	        var _alt = this._interp.adaptivePredict(this._input,4,this._ctx)
	        while(_alt!=2 && _alt!=antlr4.atn.ATN.INVALID_ALT_NUMBER) {
	            if(_alt===1) {
	                if(this._parseListeners!==null) {
	                    this.triggerExitRuleEvent();
	                }
	                _prevctx = localctx;
	                localctx = new Caracteres1Context(this, new CaracteresContext(this, _parentctx, _parentState));
	                this.pushNewRecursionContext(localctx, _startState, AnalizadorParser.RULE_caracteres);
	                this.state = 78;
	                if (!( this.precpred(this._ctx, 1))) {
	                    throw new antlr4.error.FailedPredicateException(this, "this.precpred(this._ctx, 1)");
	                }
	                this.state = 79;
	                this.caracter(); 
	            }
	            this.state = 84;
	            this._errHandler.sync(this);
	            _alt = this._interp.adaptivePredict(this._input,4,this._ctx);
	        }

	    } catch( error) {
	        if(error instanceof antlr4.error.RecognitionException) {
		        localctx.exception = error;
		        this._errHandler.reportError(this, error);
		        this._errHandler.recover(this, error);
		    } else {
		    	throw error;
		    }
	    } finally {
	        this.unrollRecursionContexts(_parentctx)
	    }
	    return localctx;
	}



	caracter() {
	    let localctx = new CaracterContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 20, AnalizadorParser.RULE_caracter);
	    try {
	        this.state = 88;
	        this._errHandler.sync(this);
	        switch(this._input.LA(1)) {
	        case 13:
	            localctx = new LetrContext(this, localctx);
	            this.enterOuterAlt(localctx, 1);
	            this.state = 85;
	            this.match(AnalizadorParser.LETRA);
	            break;
	        case 14:
	            localctx = new DigContext(this, localctx);
	            this.enterOuterAlt(localctx, 2);
	            this.state = 86;
	            this.match(AnalizadorParser.DIGITO);
	            break;
	        case 15:
	            localctx = new SimContext(this, localctx);
	            this.enterOuterAlt(localctx, 3);
	            this.state = 87;
	            this.match(AnalizadorParser.SIMBOLO);
	            break;
	        default:
	            throw new antlr4.error.NoViableAltException(this);
	        }
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}


}

AnalizadorParser.EOF = antlr4.Token.EOF;
AnalizadorParser.IF = 1;
AnalizadorParser.ELSE = 2;
AnalizadorParser.LPARENT = 3;
AnalizadorParser.RPARENT = 4;
AnalizadorParser.LCBRACES = 5;
AnalizadorParser.RCBRACES = 6;
AnalizadorParser.PRINTF = 7;
AnalizadorParser.SEMICOLON = 8;
AnalizadorParser.RETURN = 9;
AnalizadorParser.LDCOMILLA = 10;
AnalizadorParser.CERO = 11;
AnalizadorParser.UNO = 12;
AnalizadorParser.LETRA = 13;
AnalizadorParser.DIGITO = 14;
AnalizadorParser.SIMBOLO = 15;
AnalizadorParser.WS = 16;

AnalizadorParser.RULE_programa = 0;
AnalizadorParser.RULE_instrucciones = 1;
AnalizadorParser.RULE_instruccion = 2;
AnalizadorParser.RULE_decision = 3;
AnalizadorParser.RULE_sentencia = 4;
AnalizadorParser.RULE_salida = 5;
AnalizadorParser.RULE_terminar = 6;
AnalizadorParser.RULE_condicion = 7;
AnalizadorParser.RULE_cadena = 8;
AnalizadorParser.RULE_caracteres = 9;
AnalizadorParser.RULE_caracter = 10;

class ProgramaContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = AnalizadorParser.RULE_programa;
    }

	instrucciones() {
	    return this.getTypedRuleContext(InstruccionesContext,0);
	};

	EOF() {
	    return this.getToken(AnalizadorParser.EOF, 0);
	};

	enterRule(listener) {
	    if(listener instanceof AnalizadorListener ) {
	        listener.enterPrograma(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof AnalizadorListener ) {
	        listener.exitPrograma(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof AnalizadorVisitor ) {
	        return visitor.visitPrograma(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class InstruccionesContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = AnalizadorParser.RULE_instrucciones;
    }


	 
		copyFrom(ctx) {
			super.copyFrom(ctx);
		}

}


class Instr0Context extends InstruccionesContext {

    constructor(parser, ctx) {
        super(parser);
        super.copyFrom(ctx);
    }

	instruccion() {
	    return this.getTypedRuleContext(InstruccionContext,0);
	};

	enterRule(listener) {
	    if(listener instanceof AnalizadorListener ) {
	        listener.enterInstr0(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof AnalizadorListener ) {
	        listener.exitInstr0(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof AnalizadorVisitor ) {
	        return visitor.visitInstr0(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}

AnalizadorParser.Instr0Context = Instr0Context;

class Instr1Context extends InstruccionesContext {

    constructor(parser, ctx) {
        super(parser);
        super.copyFrom(ctx);
    }

	instrucciones() {
	    return this.getTypedRuleContext(InstruccionesContext,0);
	};

	instruccion() {
	    return this.getTypedRuleContext(InstruccionContext,0);
	};

	enterRule(listener) {
	    if(listener instanceof AnalizadorListener ) {
	        listener.enterInstr1(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof AnalizadorListener ) {
	        listener.exitInstr1(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof AnalizadorVisitor ) {
	        return visitor.visitInstr1(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}

AnalizadorParser.Instr1Context = Instr1Context;

class InstruccionContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = AnalizadorParser.RULE_instruccion;
    }


	 
		copyFrom(ctx) {
			super.copyFrom(ctx);
		}

}


class Ins1Context extends InstruccionContext {

    constructor(parser, ctx) {
        super(parser);
        super.copyFrom(ctx);
    }

	decision() {
	    return this.getTypedRuleContext(DecisionContext,0);
	};

	enterRule(listener) {
	    if(listener instanceof AnalizadorListener ) {
	        listener.enterIns1(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof AnalizadorListener ) {
	        listener.exitIns1(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof AnalizadorVisitor ) {
	        return visitor.visitIns1(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}

AnalizadorParser.Ins1Context = Ins1Context;

class DecisionContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = AnalizadorParser.RULE_decision;
    }


	 
		copyFrom(ctx) {
			super.copyFrom(ctx);
		}

}


class Dec1Context extends DecisionContext {

    constructor(parser, ctx) {
        super(parser);
        super.copyFrom(ctx);
    }

	IF() {
	    return this.getToken(AnalizadorParser.IF, 0);
	};

	LPARENT() {
	    return this.getToken(AnalizadorParser.LPARENT, 0);
	};

	condicion() {
	    return this.getTypedRuleContext(CondicionContext,0);
	};

	RPARENT() {
	    return this.getToken(AnalizadorParser.RPARENT, 0);
	};

	LCBRACES = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(AnalizadorParser.LCBRACES);
	    } else {
	        return this.getToken(AnalizadorParser.LCBRACES, i);
	    }
	};


	sentencia = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(SentenciaContext);
	    } else {
	        return this.getTypedRuleContext(SentenciaContext,i);
	    }
	};

	RCBRACES = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(AnalizadorParser.RCBRACES);
	    } else {
	        return this.getToken(AnalizadorParser.RCBRACES, i);
	    }
	};


	ELSE() {
	    return this.getToken(AnalizadorParser.ELSE, 0);
	};

	enterRule(listener) {
	    if(listener instanceof AnalizadorListener ) {
	        listener.enterDec1(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof AnalizadorListener ) {
	        listener.exitDec1(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof AnalizadorVisitor ) {
	        return visitor.visitDec1(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}

AnalizadorParser.Dec1Context = Dec1Context;

class SentenciaContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = AnalizadorParser.RULE_sentencia;
    }


	 
		copyFrom(ctx) {
			super.copyFrom(ctx);
		}

}


class Terminar1Context extends SentenciaContext {

    constructor(parser, ctx) {
        super(parser);
        super.copyFrom(ctx);
    }

	terminar() {
	    return this.getTypedRuleContext(TerminarContext,0);
	};

	enterRule(listener) {
	    if(listener instanceof AnalizadorListener ) {
	        listener.enterTerminar1(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof AnalizadorListener ) {
	        listener.exitTerminar1(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof AnalizadorVisitor ) {
	        return visitor.visitTerminar1(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}

AnalizadorParser.Terminar1Context = Terminar1Context;

class Sal1Context extends SentenciaContext {

    constructor(parser, ctx) {
        super(parser);
        super.copyFrom(ctx);
    }

	salida() {
	    return this.getTypedRuleContext(SalidaContext,0);
	};

	enterRule(listener) {
	    if(listener instanceof AnalizadorListener ) {
	        listener.enterSal1(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof AnalizadorListener ) {
	        listener.exitSal1(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof AnalizadorVisitor ) {
	        return visitor.visitSal1(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}

AnalizadorParser.Sal1Context = Sal1Context;

class Salsen1Context extends SentenciaContext {

    constructor(parser, ctx) {
        super(parser);
        super.copyFrom(ctx);
    }

	salida() {
	    return this.getTypedRuleContext(SalidaContext,0);
	};

	sentencia() {
	    return this.getTypedRuleContext(SentenciaContext,0);
	};

	enterRule(listener) {
	    if(listener instanceof AnalizadorListener ) {
	        listener.enterSalsen1(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof AnalizadorListener ) {
	        listener.exitSalsen1(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof AnalizadorVisitor ) {
	        return visitor.visitSalsen1(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}

AnalizadorParser.Salsen1Context = Salsen1Context;

class SalidaContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = AnalizadorParser.RULE_salida;
    }


	 
		copyFrom(ctx) {
			super.copyFrom(ctx);
		}

}


class Salida1Context extends SalidaContext {

    constructor(parser, ctx) {
        super(parser);
        super.copyFrom(ctx);
    }

	PRINTF() {
	    return this.getToken(AnalizadorParser.PRINTF, 0);
	};

	LPARENT() {
	    return this.getToken(AnalizadorParser.LPARENT, 0);
	};

	cadena() {
	    return this.getTypedRuleContext(CadenaContext,0);
	};

	RPARENT() {
	    return this.getToken(AnalizadorParser.RPARENT, 0);
	};

	SEMICOLON() {
	    return this.getToken(AnalizadorParser.SEMICOLON, 0);
	};

	enterRule(listener) {
	    if(listener instanceof AnalizadorListener ) {
	        listener.enterSalida1(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof AnalizadorListener ) {
	        listener.exitSalida1(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof AnalizadorVisitor ) {
	        return visitor.visitSalida1(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}

AnalizadorParser.Salida1Context = Salida1Context;

class TerminarContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = AnalizadorParser.RULE_terminar;
    }


	 
		copyFrom(ctx) {
			super.copyFrom(ctx);
		}

}


class Ter1Context extends TerminarContext {

    constructor(parser, ctx) {
        super(parser);
        super.copyFrom(ctx);
    }

	RETURN() {
	    return this.getToken(AnalizadorParser.RETURN, 0);
	};

	SEMICOLON() {
	    return this.getToken(AnalizadorParser.SEMICOLON, 0);
	};

	enterRule(listener) {
	    if(listener instanceof AnalizadorListener ) {
	        listener.enterTer1(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof AnalizadorListener ) {
	        listener.exitTer1(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof AnalizadorVisitor ) {
	        return visitor.visitTer1(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}

AnalizadorParser.Ter1Context = Ter1Context;

class CondicionContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = AnalizadorParser.RULE_condicion;
    }


	 
		copyFrom(ctx) {
			super.copyFrom(ctx);
		}

}


class Cero1Context extends CondicionContext {

    constructor(parser, ctx) {
        super(parser);
        super.copyFrom(ctx);
    }

	CERO() {
	    return this.getToken(AnalizadorParser.CERO, 0);
	};

	enterRule(listener) {
	    if(listener instanceof AnalizadorListener ) {
	        listener.enterCero1(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof AnalizadorListener ) {
	        listener.exitCero1(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof AnalizadorVisitor ) {
	        return visitor.visitCero1(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}

AnalizadorParser.Cero1Context = Cero1Context;

class Uno1Context extends CondicionContext {

    constructor(parser, ctx) {
        super(parser);
        super.copyFrom(ctx);
    }

	UNO() {
	    return this.getToken(AnalizadorParser.UNO, 0);
	};

	enterRule(listener) {
	    if(listener instanceof AnalizadorListener ) {
	        listener.enterUno1(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof AnalizadorListener ) {
	        listener.exitUno1(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof AnalizadorVisitor ) {
	        return visitor.visitUno1(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}

AnalizadorParser.Uno1Context = Uno1Context;

class CadenaContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = AnalizadorParser.RULE_cadena;
    }


	 
		copyFrom(ctx) {
			super.copyFrom(ctx);
		}

}


class Cadena1Context extends CadenaContext {

    constructor(parser, ctx) {
        super(parser);
        super.copyFrom(ctx);
    }

	LDCOMILLA = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(AnalizadorParser.LDCOMILLA);
	    } else {
	        return this.getToken(AnalizadorParser.LDCOMILLA, i);
	    }
	};


	caracteres() {
	    return this.getTypedRuleContext(CaracteresContext,0);
	};

	enterRule(listener) {
	    if(listener instanceof AnalizadorListener ) {
	        listener.enterCadena1(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof AnalizadorListener ) {
	        listener.exitCadena1(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof AnalizadorVisitor ) {
	        return visitor.visitCadena1(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}

AnalizadorParser.Cadena1Context = Cadena1Context;

class CaracteresContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = AnalizadorParser.RULE_caracteres;
    }


	 
		copyFrom(ctx) {
			super.copyFrom(ctx);
		}

}


class Caracter1Context extends CaracteresContext {

    constructor(parser, ctx) {
        super(parser);
        super.copyFrom(ctx);
    }

	caracter() {
	    return this.getTypedRuleContext(CaracterContext,0);
	};

	enterRule(listener) {
	    if(listener instanceof AnalizadorListener ) {
	        listener.enterCaracter1(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof AnalizadorListener ) {
	        listener.exitCaracter1(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof AnalizadorVisitor ) {
	        return visitor.visitCaracter1(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}

AnalizadorParser.Caracter1Context = Caracter1Context;

class Caracteres1Context extends CaracteresContext {

    constructor(parser, ctx) {
        super(parser);
        super.copyFrom(ctx);
    }

	caracteres() {
	    return this.getTypedRuleContext(CaracteresContext,0);
	};

	caracter() {
	    return this.getTypedRuleContext(CaracterContext,0);
	};

	enterRule(listener) {
	    if(listener instanceof AnalizadorListener ) {
	        listener.enterCaracteres1(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof AnalizadorListener ) {
	        listener.exitCaracteres1(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof AnalizadorVisitor ) {
	        return visitor.visitCaracteres1(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}

AnalizadorParser.Caracteres1Context = Caracteres1Context;

class CaracterContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = AnalizadorParser.RULE_caracter;
    }


	 
		copyFrom(ctx) {
			super.copyFrom(ctx);
		}

}


class DigContext extends CaracterContext {

    constructor(parser, ctx) {
        super(parser);
        super.copyFrom(ctx);
    }

	DIGITO() {
	    return this.getToken(AnalizadorParser.DIGITO, 0);
	};

	enterRule(listener) {
	    if(listener instanceof AnalizadorListener ) {
	        listener.enterDig(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof AnalizadorListener ) {
	        listener.exitDig(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof AnalizadorVisitor ) {
	        return visitor.visitDig(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}

AnalizadorParser.DigContext = DigContext;

class LetrContext extends CaracterContext {

    constructor(parser, ctx) {
        super(parser);
        super.copyFrom(ctx);
    }

	LETRA() {
	    return this.getToken(AnalizadorParser.LETRA, 0);
	};

	enterRule(listener) {
	    if(listener instanceof AnalizadorListener ) {
	        listener.enterLetr(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof AnalizadorListener ) {
	        listener.exitLetr(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof AnalizadorVisitor ) {
	        return visitor.visitLetr(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}

AnalizadorParser.LetrContext = LetrContext;

class SimContext extends CaracterContext {

    constructor(parser, ctx) {
        super(parser);
        super.copyFrom(ctx);
    }

	SIMBOLO() {
	    return this.getToken(AnalizadorParser.SIMBOLO, 0);
	};

	enterRule(listener) {
	    if(listener instanceof AnalizadorListener ) {
	        listener.enterSim(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof AnalizadorListener ) {
	        listener.exitSim(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof AnalizadorVisitor ) {
	        return visitor.visitSim(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}

AnalizadorParser.SimContext = SimContext;


AnalizadorParser.ProgramaContext = ProgramaContext; 
AnalizadorParser.InstruccionesContext = InstruccionesContext; 
AnalizadorParser.InstruccionContext = InstruccionContext; 
AnalizadorParser.DecisionContext = DecisionContext; 
AnalizadorParser.SentenciaContext = SentenciaContext; 
AnalizadorParser.SalidaContext = SalidaContext; 
AnalizadorParser.TerminarContext = TerminarContext; 
AnalizadorParser.CondicionContext = CondicionContext; 
AnalizadorParser.CadenaContext = CadenaContext; 
AnalizadorParser.CaracteresContext = CaracteresContext; 
AnalizadorParser.CaracterContext = CaracterContext; 
