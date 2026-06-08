// Generated from c:/Users/Escritorio/ssl-antlr-calculator/ssl.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class sslLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SI=1, ENTONCES=2, SINO=3, IMPRIMIR=4, SALIR=5, VERDADERO=6, FALSO=7, LLAVE_AP=8, 
		LLAVE_CI=9, PARENT_AP=10, PARENT_CI=11, PUNTO_COMA=12, CADENA_LIT=13, 
		WS=14;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"SI", "ENTONCES", "SINO", "IMPRIMIR", "SALIR", "VERDADERO", "FALSO", 
			"LLAVE_AP", "LLAVE_CI", "PARENT_AP", "PARENT_CI", "PUNTO_COMA", "CADENA_LIT", 
			"WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'si'", "'entonces'", "'sino'", "'imprimir'", "'salir'", "'verdadero'", 
			"'falso'", "'{'", "'}'", "'('", "')'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SI", "ENTONCES", "SINO", "IMPRIMIR", "SALIR", "VERDADERO", "FALSO", 
			"LLAVE_AP", "LLAVE_CI", "PARENT_AP", "PARENT_CI", "PUNTO_COMA", "CADENA_LIT", 
			"WS"
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


	public sslLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ssl.g4"; }

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
		"\u0004\u0000\u000eg\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\f\u0001\f\u0005\fZ\b\f\n\f\f\f]\t\f\u0001\f\u0001\f\u0001\r\u0004\rb"+
		"\b\r\u000b\r\f\rc\u0001\r\u0001\r\u0000\u0000\u000e\u0001\u0001\u0003"+
		"\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011"+
		"\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u0001\u0000\u0002\u0007"+
		"\u0000 !,,..0;??AZaz\u0003\u0000\t\n\r\r  h\u0000\u0001\u0001\u0000\u0000"+
		"\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000"+
		"\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000"+
		"\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000"+
		"\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000"+
		"\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000"+
		"\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000"+
		"\u001b\u0001\u0000\u0000\u0000\u0001\u001d\u0001\u0000\u0000\u0000\u0003"+
		" \u0001\u0000\u0000\u0000\u0005)\u0001\u0000\u0000\u0000\u0007.\u0001"+
		"\u0000\u0000\u0000\t7\u0001\u0000\u0000\u0000\u000b=\u0001\u0000\u0000"+
		"\u0000\rG\u0001\u0000\u0000\u0000\u000fM\u0001\u0000\u0000\u0000\u0011"+
		"O\u0001\u0000\u0000\u0000\u0013Q\u0001\u0000\u0000\u0000\u0015S\u0001"+
		"\u0000\u0000\u0000\u0017U\u0001\u0000\u0000\u0000\u0019W\u0001\u0000\u0000"+
		"\u0000\u001ba\u0001\u0000\u0000\u0000\u001d\u001e\u0005s\u0000\u0000\u001e"+
		"\u001f\u0005i\u0000\u0000\u001f\u0002\u0001\u0000\u0000\u0000 !\u0005"+
		"e\u0000\u0000!\"\u0005n\u0000\u0000\"#\u0005t\u0000\u0000#$\u0005o\u0000"+
		"\u0000$%\u0005n\u0000\u0000%&\u0005c\u0000\u0000&\'\u0005e\u0000\u0000"+
		"\'(\u0005s\u0000\u0000(\u0004\u0001\u0000\u0000\u0000)*\u0005s\u0000\u0000"+
		"*+\u0005i\u0000\u0000+,\u0005n\u0000\u0000,-\u0005o\u0000\u0000-\u0006"+
		"\u0001\u0000\u0000\u0000./\u0005i\u0000\u0000/0\u0005m\u0000\u000001\u0005"+
		"p\u0000\u000012\u0005r\u0000\u000023\u0005i\u0000\u000034\u0005m\u0000"+
		"\u000045\u0005i\u0000\u000056\u0005r\u0000\u00006\b\u0001\u0000\u0000"+
		"\u000078\u0005s\u0000\u000089\u0005a\u0000\u00009:\u0005l\u0000\u0000"+
		":;\u0005i\u0000\u0000;<\u0005r\u0000\u0000<\n\u0001\u0000\u0000\u0000"+
		"=>\u0005v\u0000\u0000>?\u0005e\u0000\u0000?@\u0005r\u0000\u0000@A\u0005"+
		"d\u0000\u0000AB\u0005a\u0000\u0000BC\u0005d\u0000\u0000CD\u0005e\u0000"+
		"\u0000DE\u0005r\u0000\u0000EF\u0005o\u0000\u0000F\f\u0001\u0000\u0000"+
		"\u0000GH\u0005f\u0000\u0000HI\u0005a\u0000\u0000IJ\u0005l\u0000\u0000"+
		"JK\u0005s\u0000\u0000KL\u0005o\u0000\u0000L\u000e\u0001\u0000\u0000\u0000"+
		"MN\u0005{\u0000\u0000N\u0010\u0001\u0000\u0000\u0000OP\u0005}\u0000\u0000"+
		"P\u0012\u0001\u0000\u0000\u0000QR\u0005(\u0000\u0000R\u0014\u0001\u0000"+
		"\u0000\u0000ST\u0005)\u0000\u0000T\u0016\u0001\u0000\u0000\u0000UV\u0005"+
		";\u0000\u0000V\u0018\u0001\u0000\u0000\u0000W[\u0005\"\u0000\u0000XZ\u0007"+
		"\u0000\u0000\u0000YX\u0001\u0000\u0000\u0000Z]\u0001\u0000\u0000\u0000"+
		"[Y\u0001\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000\\^\u0001\u0000\u0000"+
		"\u0000][\u0001\u0000\u0000\u0000^_\u0005\"\u0000\u0000_\u001a\u0001\u0000"+
		"\u0000\u0000`b\u0007\u0001\u0000\u0000a`\u0001\u0000\u0000\u0000bc\u0001"+
		"\u0000\u0000\u0000ca\u0001\u0000\u0000\u0000cd\u0001\u0000\u0000\u0000"+
		"de\u0001\u0000\u0000\u0000ef\u0006\r\u0000\u0000f\u001c\u0001\u0000\u0000"+
		"\u0000\u0003\u0000[c\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}