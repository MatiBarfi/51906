// Generated from c:/Users/ue/51906/Analizador/Analizador.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class AnalizadorParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IF=1, PRINTF=2, ELSE=3, LPARENT=4, RPARENT=5, LCBRACES=6, RCBRACES=7, 
		SEMICOLON=8, RETURN=9, CERO=10, UNO=11, WS=12, LDCOMILLA=13, STRING_MODE_ESPACIO=14, 
		LDCOMILLA_END=15, LETRA=16, DIGITO=17, SIMBOLO=18;
	public static final int
		RULE_programa = 0, RULE_instrucciones = 1, RULE_instruccion = 2, RULE_decision = 3, 
		RULE_sentencia = 4, RULE_salida = 5, RULE_terminar = 6, RULE_condicion = 7, 
		RULE_cadena = 8, RULE_caracteres = 9, RULE_caracter = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "instrucciones", "instruccion", "decision", "sentencia", 
			"salida", "terminar", "condicion", "cadena", "caracteres", "caracter"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'if'", "'printf'", "'else'", "'('", "')'", "'{'", "'}'", "';'", 
			"'return'", "'0'", "'1'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IF", "PRINTF", "ELSE", "LPARENT", "RPARENT", "LCBRACES", "RCBRACES", 
			"SEMICOLON", "RETURN", "CERO", "UNO", "WS", "LDCOMILLA", "STRING_MODE_ESPACIO", 
			"LDCOMILLA_END", "LETRA", "DIGITO", "SIMBOLO"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Analizador.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AnalizadorParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramaContext extends ParserRuleContext {
		public InstruccionesContext instrucciones() {
			return getRuleContext(InstruccionesContext.class,0);
		}
		public TerminalNode EOF() { return getToken(AnalizadorParser.EOF, 0); }
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnalizadorListener ) ((AnalizadorListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnalizadorListener ) ((AnalizadorListener)listener).exitPrograma(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			instrucciones(0);
			setState(23);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InstruccionesContext extends ParserRuleContext {
		public InstruccionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrucciones; }
	 
		public InstruccionesContext() { }
		public void copyFrom(InstruccionesContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Instr0Context extends InstruccionesContext {
		public InstruccionContext instruccion() {
			return getRuleContext(InstruccionContext.class,0);
		}
		public Instr0Context(InstruccionesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnalizadorListener ) ((AnalizadorListener)listener).enterInstr0(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnalizadorListener ) ((AnalizadorListener)listener).exitInstr0(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Instr1Context extends InstruccionesContext {
		public InstruccionesContext instrucciones() {
			return getRuleContext(InstruccionesContext.class,0);
		}
		public InstruccionContext instruccion() {
			return getRuleContext(InstruccionContext.class,0);
		}
		public Instr1Context(InstruccionesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnalizadorListener ) ((AnalizadorListener)listener).enterInstr1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnalizadorListener ) ((AnalizadorListener)listener).exitInstr1(this);
		}
	}

	public final InstruccionesContext instrucciones() throws RecognitionException {
		return instrucciones(0);
	}

	private InstruccionesContext instrucciones(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		InstruccionesContext _localctx = new InstruccionesContext(_ctx, _parentState);
		InstruccionesContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_instrucciones, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new Instr0Context(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(26);
			instruccion();
			}
			_ctx.stop = _input.LT(-1);
			setState(32);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Instr1Context(new InstruccionesContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_instrucciones);
					setState(28);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(29);
					instruccion();
					}
					} 
				}
				setState(34);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InstruccionContext extends ParserRuleContext {
		public InstruccionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruccion; }
	 
		public InstruccionContext() { }
		public void copyFrom(InstruccionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Ins1Context extends InstruccionContext {
		public DecisionContext decision() {
			return getRuleContext(DecisionContext.class,0);
		}
		public Ins1Context(InstruccionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnalizadorListener ) ((AnalizadorListener)listener).enterIns1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnalizadorListener ) ((AnalizadorListener)listener).exitIns1(this);
		}
	}

	public final InstruccionContext instruccion() throws RecognitionException {
		InstruccionContext _localctx = new InstruccionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_instruccion);
		try {
			_localctx = new Ins1Context(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			decision();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DecisionContext extends ParserRuleContext {
		public DecisionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decision; }
	 
		public DecisionContext() { }
		public void copyFrom(DecisionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Dec1Context extends DecisionContext {
		public TerminalNode IF() { return getToken(AnalizadorParser.IF, 0); }
		public TerminalNode LPARENT() { return getToken(AnalizadorParser.LPARENT, 0); }
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public TerminalNode RPARENT() { return getToken(AnalizadorParser.RPARENT, 0); }
		public List<TerminalNode> LCBRACES() { return getTokens(AnalizadorParser.LCBRACES); }
		public TerminalNode LCBRACES(int i) {
			return getToken(AnalizadorParser.LCBRACES, i);
		}
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public List<TerminalNode> RCBRACES() { return getTokens(AnalizadorParser.RCBRACES); }
		public TerminalNode RCBRACES(int i) {
			return getToken(AnalizadorParser.RCBRACES, i);
		}
		public TerminalNode ELSE() { return getToken(AnalizadorParser.ELSE, 0); }
		public Dec1Context(DecisionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnalizadorListener ) ((AnalizadorListener)listener).enterDec1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnalizadorListener ) ((AnalizadorListener)listener).exitDec1(this);
		}
	}

	public final DecisionContext decision() throws RecognitionException {
		DecisionContext _localctx = new DecisionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_decision);
		try {
			_localctx = new Dec1Context(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			match(IF);
			setState(38);
			match(LPARENT);
			setState(39);
			condicion();
			setState(40);
			match(RPARENT);
			setState(41);
			match(LCBRACES);
			setState(42);
			sentencia();
			setState(43);
			match(RCBRACES);
			setState(49);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(44);
				match(ELSE);
				setState(45);
				match(LCBRACES);
				setState(46);
				sentencia();
				setState(47);
				match(RCBRACES);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SentenciaContext extends ParserRuleContext {
		public SentenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencia; }
	 
		public SentenciaContext() { }
		public void copyFrom(SentenciaContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Terminar1Context extends SentenciaContext {
		public TerminarContext terminar() {
			return getRuleContext(TerminarContext.class,0);
		}
		public Terminar1Context(SentenciaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnalizadorListener ) ((AnalizadorListener)listener).enterTerminar1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnalizadorListener ) ((AnalizadorListener)listener).exitTerminar1(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Sal1Context extends SentenciaContext {
		public SalidaContext salida() {
			return getRuleContext(SalidaContext.class,0);
		}
		public Sal1Context(SentenciaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnalizadorListener ) ((AnalizadorListener)listener).enterSal1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnalizadorListener ) ((AnalizadorListener)listener).exitSal1(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Salsen1Context extends SentenciaContext {
		public SalidaContext salida() {
			return getRuleContext(SalidaContext.class,0);
		}
		public SentenciaContext sentencia() {
			return getRuleContext(SentenciaContext.class,0);
		}
		public Salsen1Context(SentenciaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnalizadorListener ) ((AnalizadorListener)listener).enterSalsen1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnalizadorListener ) ((AnalizadorListener)listener).exitSalsen1(this);
		}
	}

	public final SentenciaContext sentencia() throws RecognitionException {
		SentenciaContext _localctx = new SentenciaContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_sentencia);
		try {
			setState(56);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new Sal1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(51);
				salida();
				}
				break;
			case 2:
				_localctx = new Salsen1Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(52);
				salida();
				setState(53);
				sentencia();
				}
				break;
			case 3:
				_localctx = new Terminar1Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(55);
				terminar();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SalidaContext extends ParserRuleContext {
		public SalidaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_salida; }
	 
		public SalidaContext() { }
		public void copyFrom(SalidaContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Salida1Context extends SalidaContext {
		public TerminalNode PRINTF() { return getToken(AnalizadorParser.PRINTF, 0); }
		public TerminalNode LPARENT() { return getToken(AnalizadorParser.LPARENT, 0); }
		public CadenaContext cadena() {
			return getRuleContext(CadenaContext.class,0);
		}
		public TerminalNode RPARENT() { return getToken(AnalizadorParser.RPARENT, 0); }
		public TerminalNode SEMICOLON() { return getToken(AnalizadorParser.SEMICOLON, 0); }
		public Salida1Context(SalidaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnalizadorListener ) ((AnalizadorListener)listener).enterSalida1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnalizadorListener ) ((AnalizadorListener)listener).exitSalida1(this);
		}
	}

	public final SalidaContext salida() throws RecognitionException {
		SalidaContext _localctx = new SalidaContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_salida);
		try {
			_localctx = new Salida1Context(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(PRINTF);
			setState(59);
			match(LPARENT);
			setState(60);
			cadena();
			setState(61);
			match(RPARENT);
			setState(62);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TerminarContext extends ParserRuleContext {
		public TerminarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_terminar; }
	 
		public TerminarContext() { }
		public void copyFrom(TerminarContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Ter1Context extends TerminarContext {
		public TerminalNode RETURN() { return getToken(AnalizadorParser.RETURN, 0); }
		public TerminalNode SEMICOLON() { return getToken(AnalizadorParser.SEMICOLON, 0); }
		public Ter1Context(TerminarContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnalizadorListener ) ((AnalizadorListener)listener).enterTer1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnalizadorListener ) ((AnalizadorListener)listener).exitTer1(this);
		}
	}

	public final TerminarContext terminar() throws RecognitionException {
		TerminarContext _localctx = new TerminarContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_terminar);
		try {
			_localctx = new Ter1Context(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(RETURN);
			setState(65);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CondicionContext extends ParserRuleContext {
		public CondicionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicion; }
	 
		public CondicionContext() { }
		public void copyFrom(CondicionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Cero1Context extends CondicionContext {
		public TerminalNode CERO() { return getToken(AnalizadorParser.CERO, 0); }
		public Cero1Context(CondicionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnalizadorListener ) ((AnalizadorListener)listener).enterCero1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnalizadorListener ) ((AnalizadorListener)listener).exitCero1(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Uno1Context extends CondicionContext {
		public TerminalNode UNO() { return getToken(AnalizadorParser.UNO, 0); }
		public Uno1Context(CondicionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnalizadorListener ) ((AnalizadorListener)listener).enterUno1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnalizadorListener ) ((AnalizadorListener)listener).exitUno1(this);
		}
	}

	public final CondicionContext condicion() throws RecognitionException {
		CondicionContext _localctx = new CondicionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_condicion);
		try {
			setState(69);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CERO:
				_localctx = new Cero1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(67);
				match(CERO);
				}
				break;
			case UNO:
				_localctx = new Uno1Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(68);
				match(UNO);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CadenaContext extends ParserRuleContext {
		public CadenaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cadena; }
	 
		public CadenaContext() { }
		public void copyFrom(CadenaContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Cadena1Context extends CadenaContext {
		public TerminalNode LDCOMILLA() { return getToken(AnalizadorParser.LDCOMILLA, 0); }
		public CaracteresContext caracteres() {
			return getRuleContext(CaracteresContext.class,0);
		}
		public TerminalNode LDCOMILLA_END() { return getToken(AnalizadorParser.LDCOMILLA_END, 0); }
		public Cadena1Context(CadenaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnalizadorListener ) ((AnalizadorListener)listener).enterCadena1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnalizadorListener ) ((AnalizadorListener)listener).exitCadena1(this);
		}
	}

	public final CadenaContext cadena() throws RecognitionException {
		CadenaContext _localctx = new CadenaContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_cadena);
		try {
			_localctx = new Cadena1Context(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(LDCOMILLA);
			setState(72);
			caracteres(0);
			setState(73);
			match(LDCOMILLA_END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CaracteresContext extends ParserRuleContext {
		public CaracteresContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caracteres; }
	 
		public CaracteresContext() { }
		public void copyFrom(CaracteresContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Caracter1Context extends CaracteresContext {
		public CaracterContext caracter() {
			return getRuleContext(CaracterContext.class,0);
		}
		public Caracter1Context(CaracteresContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnalizadorListener ) ((AnalizadorListener)listener).enterCaracter1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnalizadorListener ) ((AnalizadorListener)listener).exitCaracter1(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Caracteres1Context extends CaracteresContext {
		public CaracteresContext caracteres() {
			return getRuleContext(CaracteresContext.class,0);
		}
		public CaracterContext caracter() {
			return getRuleContext(CaracterContext.class,0);
		}
		public Caracteres1Context(CaracteresContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnalizadorListener ) ((AnalizadorListener)listener).enterCaracteres1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnalizadorListener ) ((AnalizadorListener)listener).exitCaracteres1(this);
		}
	}

	public final CaracteresContext caracteres() throws RecognitionException {
		return caracteres(0);
	}

	private CaracteresContext caracteres(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		CaracteresContext _localctx = new CaracteresContext(_ctx, _parentState);
		CaracteresContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_caracteres, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new Caracter1Context(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(76);
			caracter();
			}
			_ctx.stop = _input.LT(-1);
			setState(82);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Caracteres1Context(new CaracteresContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_caracteres);
					setState(78);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(79);
					caracter();
					}
					} 
				}
				setState(84);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CaracterContext extends ParserRuleContext {
		public CaracterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caracter; }
	 
		public CaracterContext() { }
		public void copyFrom(CaracterContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DigContext extends CaracterContext {
		public TerminalNode DIGITO() { return getToken(AnalizadorParser.DIGITO, 0); }
		public DigContext(CaracterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnalizadorListener ) ((AnalizadorListener)listener).enterDig(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnalizadorListener ) ((AnalizadorListener)listener).exitDig(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LetrContext extends CaracterContext {
		public TerminalNode LETRA() { return getToken(AnalizadorParser.LETRA, 0); }
		public LetrContext(CaracterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnalizadorListener ) ((AnalizadorListener)listener).enterLetr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnalizadorListener ) ((AnalizadorListener)listener).exitLetr(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SimContext extends CaracterContext {
		public TerminalNode SIMBOLO() { return getToken(AnalizadorParser.SIMBOLO, 0); }
		public SimContext(CaracterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnalizadorListener ) ((AnalizadorListener)listener).enterSim(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnalizadorListener ) ((AnalizadorListener)listener).exitSim(this);
		}
	}

	public final CaracterContext caracter() throws RecognitionException {
		CaracterContext _localctx = new CaracterContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_caracter);
		try {
			setState(88);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LETRA:
				_localctx = new LetrContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(85);
				match(LETRA);
				}
				break;
			case DIGITO:
				_localctx = new DigContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(86);
				match(DIGITO);
				}
				break;
			case SIMBOLO:
				_localctx = new SimContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(87);
				match(SIMBOLO);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return instrucciones_sempred((InstruccionesContext)_localctx, predIndex);
		case 9:
			return caracteres_sempred((CaracteresContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean instrucciones_sempred(InstruccionesContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean caracteres_sempred(CaracteresContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0012[\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005"+
		"\u0001\u001f\b\u0001\n\u0001\f\u0001\"\t\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0003\u00032\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0003\u00049\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0003\u0007F\b\u0007\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005\tQ\b\t\n\t\f\t"+
		"T\t\t\u0001\n\u0001\n\u0001\n\u0003\nY\b\n\u0001\n\u0000\u0002\u0002\u0012"+
		"\u000b\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0000\u0000"+
		"W\u0000\u0016\u0001\u0000\u0000\u0000\u0002\u0019\u0001\u0000\u0000\u0000"+
		"\u0004#\u0001\u0000\u0000\u0000\u0006%\u0001\u0000\u0000\u0000\b8\u0001"+
		"\u0000\u0000\u0000\n:\u0001\u0000\u0000\u0000\f@\u0001\u0000\u0000\u0000"+
		"\u000eE\u0001\u0000\u0000\u0000\u0010G\u0001\u0000\u0000\u0000\u0012K"+
		"\u0001\u0000\u0000\u0000\u0014X\u0001\u0000\u0000\u0000\u0016\u0017\u0003"+
		"\u0002\u0001\u0000\u0017\u0018\u0005\u0000\u0000\u0001\u0018\u0001\u0001"+
		"\u0000\u0000\u0000\u0019\u001a\u0006\u0001\uffff\uffff\u0000\u001a\u001b"+
		"\u0003\u0004\u0002\u0000\u001b \u0001\u0000\u0000\u0000\u001c\u001d\n"+
		"\u0001\u0000\u0000\u001d\u001f\u0003\u0004\u0002\u0000\u001e\u001c\u0001"+
		"\u0000\u0000\u0000\u001f\"\u0001\u0000\u0000\u0000 \u001e\u0001\u0000"+
		"\u0000\u0000 !\u0001\u0000\u0000\u0000!\u0003\u0001\u0000\u0000\u0000"+
		"\" \u0001\u0000\u0000\u0000#$\u0003\u0006\u0003\u0000$\u0005\u0001\u0000"+
		"\u0000\u0000%&\u0005\u0001\u0000\u0000&\'\u0005\u0004\u0000\u0000\'(\u0003"+
		"\u000e\u0007\u0000()\u0005\u0005\u0000\u0000)*\u0005\u0006\u0000\u0000"+
		"*+\u0003\b\u0004\u0000+1\u0005\u0007\u0000\u0000,-\u0005\u0003\u0000\u0000"+
		"-.\u0005\u0006\u0000\u0000./\u0003\b\u0004\u0000/0\u0005\u0007\u0000\u0000"+
		"02\u0001\u0000\u0000\u00001,\u0001\u0000\u0000\u000012\u0001\u0000\u0000"+
		"\u00002\u0007\u0001\u0000\u0000\u000039\u0003\n\u0005\u000045\u0003\n"+
		"\u0005\u000056\u0003\b\u0004\u000069\u0001\u0000\u0000\u000079\u0003\f"+
		"\u0006\u000083\u0001\u0000\u0000\u000084\u0001\u0000\u0000\u000087\u0001"+
		"\u0000\u0000\u00009\t\u0001\u0000\u0000\u0000:;\u0005\u0002\u0000\u0000"+
		";<\u0005\u0004\u0000\u0000<=\u0003\u0010\b\u0000=>\u0005\u0005\u0000\u0000"+
		">?\u0005\b\u0000\u0000?\u000b\u0001\u0000\u0000\u0000@A\u0005\t\u0000"+
		"\u0000AB\u0005\b\u0000\u0000B\r\u0001\u0000\u0000\u0000CF\u0005\n\u0000"+
		"\u0000DF\u0005\u000b\u0000\u0000EC\u0001\u0000\u0000\u0000ED\u0001\u0000"+
		"\u0000\u0000F\u000f\u0001\u0000\u0000\u0000GH\u0005\r\u0000\u0000HI\u0003"+
		"\u0012\t\u0000IJ\u0005\u000f\u0000\u0000J\u0011\u0001\u0000\u0000\u0000"+
		"KL\u0006\t\uffff\uffff\u0000LM\u0003\u0014\n\u0000MR\u0001\u0000\u0000"+
		"\u0000NO\n\u0001\u0000\u0000OQ\u0003\u0014\n\u0000PN\u0001\u0000\u0000"+
		"\u0000QT\u0001\u0000\u0000\u0000RP\u0001\u0000\u0000\u0000RS\u0001\u0000"+
		"\u0000\u0000S\u0013\u0001\u0000\u0000\u0000TR\u0001\u0000\u0000\u0000"+
		"UY\u0005\u0010\u0000\u0000VY\u0005\u0011\u0000\u0000WY\u0005\u0012\u0000"+
		"\u0000XU\u0001\u0000\u0000\u0000XV\u0001\u0000\u0000\u0000XW\u0001\u0000"+
		"\u0000\u0000Y\u0015\u0001\u0000\u0000\u0000\u0006 18ERX";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}