// Generated from c:/Users/ue/51906/Analizador/AnalizadorLexer.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class AnalizadorLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IF=1, PRINTF=2, ELSE=3, LPARENT=4, RPARENT=5, LCBRACES=6, RCBRACES=7, 
		SEMICOLON=8, RETURN=9, CERO=10, UNO=11, WS=12, LDCOMILLA=13, STRING_MODE_ESPACIO=14, 
		LDCOMILLA_END=15, LETRA=16, DIGITO=17, SIMBOLO=18;
	public static final int
		STRING_MODE=1;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE", "STRING_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"IF", "PRINTF", "ELSE", "LPARENT", "RPARENT", "LCBRACES", "RCBRACES", 
			"SEMICOLON", "RETURN", "CERO", "UNO", "WS", "LDCOMILLA", "STRING_MODE_LETRA", 
			"STRING_MODE_DIGITO", "STRING_MODE_SIMBOLO", "STRING_MODE_ESPACIO", "LDCOMILLA_END", 
			"LETRA", "DIGITO", "SIMBOLO"
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


	public AnalizadorLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "AnalizadorLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u0012y\u0006\uffff\uffff\u0006\uffff\uffff\u0002\u0000\u0007"+
		"\u0000\u0002\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007"+
		"\u0003\u0002\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007"+
		"\u0006\u0002\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n"+
		"\u0007\n\u0002\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002"+
		"\u000e\u0007\u000e\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002"+
		"\u0011\u0007\u0011\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002"+
		"\u0014\u0007\u0014\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0004\u000b"+
		"R\b\u000b\u000b\u000b\f\u000bS\u0001\u000b\u0001\u000b\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u0010\u0004\u0010i\b\u0010\u000b\u0010\f\u0010j\u0001\u0010\u0001"+
		"\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0003"+
		"\u0012t\b\u0012\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0000"+
		"\u0000\u0015\u0002\u0001\u0004\u0002\u0006\u0003\b\u0004\n\u0005\f\u0006"+
		"\u000e\u0007\u0010\b\u0012\t\u0014\n\u0016\u000b\u0018\f\u001a\r\u001c"+
		"\u0000\u001e\u0000 \u0000\"\u000e$\u000f&\u0010(\u0011*\u0012\u0002\u0000"+
		"\u0001\u0004\u0003\u0000\t\n\r\r  \u0002\u0000AZaz\u0001\u000009\u0006"+
		"\u0000!!\'\',,..:;??y\u0000\u0002\u0001\u0000\u0000\u0000\u0000\u0004"+
		"\u0001\u0000\u0000\u0000\u0000\u0006\u0001\u0000\u0000\u0000\u0000\b\u0001"+
		"\u0000\u0000\u0000\u0000\n\u0001\u0000\u0000\u0000\u0000\f\u0001\u0000"+
		"\u0000\u0000\u0000\u000e\u0001\u0000\u0000\u0000\u0000\u0010\u0001\u0000"+
		"\u0000\u0000\u0000\u0012\u0001\u0000\u0000\u0000\u0000\u0014\u0001\u0000"+
		"\u0000\u0000\u0000\u0016\u0001\u0000\u0000\u0000\u0000\u0018\u0001\u0000"+
		"\u0000\u0000\u0000\u001a\u0001\u0000\u0000\u0000\u0001\u001c\u0001\u0000"+
		"\u0000\u0000\u0001\u001e\u0001\u0000\u0000\u0000\u0001 \u0001\u0000\u0000"+
		"\u0000\u0001\"\u0001\u0000\u0000\u0000\u0001$\u0001\u0000\u0000\u0000"+
		"\u0001&\u0001\u0000\u0000\u0000\u0001(\u0001\u0000\u0000\u0000\u0001*"+
		"\u0001\u0000\u0000\u0000\u0002,\u0001\u0000\u0000\u0000\u0004/\u0001\u0000"+
		"\u0000\u0000\u00066\u0001\u0000\u0000\u0000\b;\u0001\u0000\u0000\u0000"+
		"\n=\u0001\u0000\u0000\u0000\f?\u0001\u0000\u0000\u0000\u000eA\u0001\u0000"+
		"\u0000\u0000\u0010C\u0001\u0000\u0000\u0000\u0012E\u0001\u0000\u0000\u0000"+
		"\u0014L\u0001\u0000\u0000\u0000\u0016N\u0001\u0000\u0000\u0000\u0018Q"+
		"\u0001\u0000\u0000\u0000\u001aW\u0001\u0000\u0000\u0000\u001c[\u0001\u0000"+
		"\u0000\u0000\u001e_\u0001\u0000\u0000\u0000 c\u0001\u0000\u0000\u0000"+
		"\"h\u0001\u0000\u0000\u0000$n\u0001\u0000\u0000\u0000&s\u0001\u0000\u0000"+
		"\u0000(u\u0001\u0000\u0000\u0000*w\u0001\u0000\u0000\u0000,-\u0005i\u0000"+
		"\u0000-.\u0005f\u0000\u0000.\u0003\u0001\u0000\u0000\u0000/0\u0005p\u0000"+
		"\u000001\u0005r\u0000\u000012\u0005i\u0000\u000023\u0005n\u0000\u0000"+
		"34\u0005t\u0000\u000045\u0005f\u0000\u00005\u0005\u0001\u0000\u0000\u0000"+
		"67\u0005e\u0000\u000078\u0005l\u0000\u000089\u0005s\u0000\u00009:\u0005"+
		"e\u0000\u0000:\u0007\u0001\u0000\u0000\u0000;<\u0005(\u0000\u0000<\t\u0001"+
		"\u0000\u0000\u0000=>\u0005)\u0000\u0000>\u000b\u0001\u0000\u0000\u0000"+
		"?@\u0005{\u0000\u0000@\r\u0001\u0000\u0000\u0000AB\u0005}\u0000\u0000"+
		"B\u000f\u0001\u0000\u0000\u0000CD\u0005;\u0000\u0000D\u0011\u0001\u0000"+
		"\u0000\u0000EF\u0005r\u0000\u0000FG\u0005e\u0000\u0000GH\u0005t\u0000"+
		"\u0000HI\u0005u\u0000\u0000IJ\u0005r\u0000\u0000JK\u0005n\u0000\u0000"+
		"K\u0013\u0001\u0000\u0000\u0000LM\u00050\u0000\u0000M\u0015\u0001\u0000"+
		"\u0000\u0000NO\u00051\u0000\u0000O\u0017\u0001\u0000\u0000\u0000PR\u0007"+
		"\u0000\u0000\u0000QP\u0001\u0000\u0000\u0000RS\u0001\u0000\u0000\u0000"+
		"SQ\u0001\u0000\u0000\u0000ST\u0001\u0000\u0000\u0000TU\u0001\u0000\u0000"+
		"\u0000UV\u0006\u000b\u0000\u0000V\u0019\u0001\u0000\u0000\u0000WX\u0005"+
		"\"\u0000\u0000XY\u0001\u0000\u0000\u0000YZ\u0006\f\u0001\u0000Z\u001b"+
		"\u0001\u0000\u0000\u0000[\\\u0007\u0001\u0000\u0000\\]\u0001\u0000\u0000"+
		"\u0000]^\u0006\r\u0002\u0000^\u001d\u0001\u0000\u0000\u0000_`\u0007\u0002"+
		"\u0000\u0000`a\u0001\u0000\u0000\u0000ab\u0006\u000e\u0003\u0000b\u001f"+
		"\u0001\u0000\u0000\u0000cd\u0007\u0003\u0000\u0000de\u0001\u0000\u0000"+
		"\u0000ef\u0006\u000f\u0004\u0000f!\u0001\u0000\u0000\u0000gi\u0007\u0000"+
		"\u0000\u0000hg\u0001\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000jh\u0001"+
		"\u0000\u0000\u0000jk\u0001\u0000\u0000\u0000kl\u0001\u0000\u0000\u0000"+
		"lm\u0006\u0010\u0000\u0000m#\u0001\u0000\u0000\u0000no\u0005\"\u0000\u0000"+
		"op\u0001\u0000\u0000\u0000pq\u0006\u0011\u0005\u0000q%\u0001\u0000\u0000"+
		"\u0000rt\u0007\u0001\u0000\u0000sr\u0001\u0000\u0000\u0000t\'\u0001\u0000"+
		"\u0000\u0000uv\u0007\u0002\u0000\u0000v)\u0001\u0000\u0000\u0000wx\u0007"+
		"\u0003\u0000\u0000x+\u0001\u0000\u0000\u0000\u0005\u0000\u0001Sjs\u0006"+
		"\u0006\u0000\u0000\u0005\u0001\u0000\u0007\u0010\u0000\u0007\u0011\u0000"+
		"\u0007\u0012\u0000\u0004\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}