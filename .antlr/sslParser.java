// Generated from c:/Users/Escritorio/ssl-antlr-calculator/ssl.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class sslParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SI=1, ENTONCES=2, SINO=3, IMPRIMIR=4, SALIR=5, VERDADERO=6, FALSO=7, LLAVE_AP=8, 
		LLAVE_CI=9, PARENT_AP=10, PARENT_CI=11, PUNTO_COMA=12, CADENA_LIT=13, 
		WS=14;
	public static final int
		RULE_prog = 0, RULE_instruccion = 1, RULE_decision = 2, RULE_sentencia = 3, 
		RULE_salida = 4, RULE_terminar = 5, RULE_condicion = 6, RULE_cadena = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "instruccion", "decision", "sentencia", "salida", "terminar", 
			"condicion", "cadena"
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

	@Override
	public String getGrammarFileName() { return "ssl.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public sslParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(sslParser.EOF, 0); }
		public List<InstruccionContext> instruccion() {
			return getRuleContexts(InstruccionContext.class);
		}
		public InstruccionContext instruccion(int i) {
			return getRuleContext(InstruccionContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(17); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(16);
				instruccion();
				}
				}
				setState(19); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SI );
			setState(21);
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
	public static class InstruccionContext extends ParserRuleContext {
		public DecisionContext decision() {
			return getRuleContext(DecisionContext.class,0);
		}
		public InstruccionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruccion; }
	}

	public final InstruccionContext instruccion() throws RecognitionException {
		InstruccionContext _localctx = new InstruccionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_instruccion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23);
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
		public TerminalNode SI() { return getToken(sslParser.SI, 0); }
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public TerminalNode ENTONCES() { return getToken(sslParser.ENTONCES, 0); }
		public List<TerminalNode> LLAVE_AP() { return getTokens(sslParser.LLAVE_AP); }
		public TerminalNode LLAVE_AP(int i) {
			return getToken(sslParser.LLAVE_AP, i);
		}
		public List<TerminalNode> LLAVE_CI() { return getTokens(sslParser.LLAVE_CI); }
		public TerminalNode LLAVE_CI(int i) {
			return getToken(sslParser.LLAVE_CI, i);
		}
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public TerminalNode SINO() { return getToken(sslParser.SINO, 0); }
		public DecisionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decision; }
	}

	public final DecisionContext decision() throws RecognitionException {
		DecisionContext _localctx = new DecisionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_decision);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			match(SI);
			setState(26);
			condicion();
			setState(27);
			match(ENTONCES);
			setState(28);
			match(LLAVE_AP);
			setState(32);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPRIMIR || _la==SALIR) {
				{
				{
				setState(29);
				sentencia();
				}
				}
				setState(34);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(35);
			match(LLAVE_CI);
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SINO) {
				{
				setState(36);
				match(SINO);
				setState(37);
				match(LLAVE_AP);
				setState(41);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IMPRIMIR || _la==SALIR) {
					{
					{
					setState(38);
					sentencia();
					}
					}
					setState(43);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(44);
				match(LLAVE_CI);
				}
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
		public List<SalidaContext> salida() {
			return getRuleContexts(SalidaContext.class);
		}
		public SalidaContext salida(int i) {
			return getRuleContext(SalidaContext.class,i);
		}
		public TerminarContext terminar() {
			return getRuleContext(TerminarContext.class,0);
		}
		public SentenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencia; }
	}

	public final SentenciaContext sentencia() throws RecognitionException {
		SentenciaContext _localctx = new SentenciaContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_sentencia);
		try {
			int _alt;
			setState(53);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IMPRIMIR:
				enterOuterAlt(_localctx, 1);
				{
				setState(48); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(47);
						salida();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(50); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case SALIR:
				enterOuterAlt(_localctx, 2);
				{
				setState(52);
				terminar();
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
	public static class SalidaContext extends ParserRuleContext {
		public TerminalNode IMPRIMIR() { return getToken(sslParser.IMPRIMIR, 0); }
		public TerminalNode PARENT_AP() { return getToken(sslParser.PARENT_AP, 0); }
		public CadenaContext cadena() {
			return getRuleContext(CadenaContext.class,0);
		}
		public TerminalNode PARENT_CI() { return getToken(sslParser.PARENT_CI, 0); }
		public TerminalNode PUNTO_COMA() { return getToken(sslParser.PUNTO_COMA, 0); }
		public SalidaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_salida; }
	}

	public final SalidaContext salida() throws RecognitionException {
		SalidaContext _localctx = new SalidaContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_salida);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(IMPRIMIR);
			setState(56);
			match(PARENT_AP);
			setState(57);
			cadena();
			setState(58);
			match(PARENT_CI);
			setState(59);
			match(PUNTO_COMA);
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
		public TerminalNode SALIR() { return getToken(sslParser.SALIR, 0); }
		public TerminalNode PUNTO_COMA() { return getToken(sslParser.PUNTO_COMA, 0); }
		public TerminarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_terminar; }
	}

	public final TerminarContext terminar() throws RecognitionException {
		TerminarContext _localctx = new TerminarContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_terminar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(SALIR);
			setState(62);
			match(PUNTO_COMA);
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
		public TerminalNode VERDADERO() { return getToken(sslParser.VERDADERO, 0); }
		public TerminalNode FALSO() { return getToken(sslParser.FALSO, 0); }
		public CondicionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicion; }
	}

	public final CondicionContext condicion() throws RecognitionException {
		CondicionContext _localctx = new CondicionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_condicion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			_la = _input.LA(1);
			if ( !(_la==VERDADERO || _la==FALSO) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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
	public static class CadenaContext extends ParserRuleContext {
		public TerminalNode CADENA_LIT() { return getToken(sslParser.CADENA_LIT, 0); }
		public CadenaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cadena; }
	}

	public final CadenaContext cadena() throws RecognitionException {
		CadenaContext _localctx = new CadenaContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_cadena);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(CADENA_LIT);
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

	public static final String _serializedATN =
		"\u0004\u0001\u000eE\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0001"+
		"\u0000\u0004\u0000\u0012\b\u0000\u000b\u0000\f\u0000\u0013\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0005\u0002\u001f\b\u0002\n\u0002\f\u0002\"\t"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002(\b"+
		"\u0002\n\u0002\f\u0002+\t\u0002\u0001\u0002\u0003\u0002.\b\u0002\u0001"+
		"\u0003\u0004\u00031\b\u0003\u000b\u0003\f\u00032\u0001\u0003\u0003\u0003"+
		"6\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0000\u0000\b\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0000\u0001\u0001\u0000\u0006\u0007B\u0000\u0011\u0001\u0000"+
		"\u0000\u0000\u0002\u0017\u0001\u0000\u0000\u0000\u0004\u0019\u0001\u0000"+
		"\u0000\u0000\u00065\u0001\u0000\u0000\u0000\b7\u0001\u0000\u0000\u0000"+
		"\n=\u0001\u0000\u0000\u0000\f@\u0001\u0000\u0000\u0000\u000eB\u0001\u0000"+
		"\u0000\u0000\u0010\u0012\u0003\u0002\u0001\u0000\u0011\u0010\u0001\u0000"+
		"\u0000\u0000\u0012\u0013\u0001\u0000\u0000\u0000\u0013\u0011\u0001\u0000"+
		"\u0000\u0000\u0013\u0014\u0001\u0000\u0000\u0000\u0014\u0015\u0001\u0000"+
		"\u0000\u0000\u0015\u0016\u0005\u0000\u0000\u0001\u0016\u0001\u0001\u0000"+
		"\u0000\u0000\u0017\u0018\u0003\u0004\u0002\u0000\u0018\u0003\u0001\u0000"+
		"\u0000\u0000\u0019\u001a\u0005\u0001\u0000\u0000\u001a\u001b\u0003\f\u0006"+
		"\u0000\u001b\u001c\u0005\u0002\u0000\u0000\u001c \u0005\b\u0000\u0000"+
		"\u001d\u001f\u0003\u0006\u0003\u0000\u001e\u001d\u0001\u0000\u0000\u0000"+
		"\u001f\"\u0001\u0000\u0000\u0000 \u001e\u0001\u0000\u0000\u0000 !\u0001"+
		"\u0000\u0000\u0000!#\u0001\u0000\u0000\u0000\" \u0001\u0000\u0000\u0000"+
		"#-\u0005\t\u0000\u0000$%\u0005\u0003\u0000\u0000%)\u0005\b\u0000\u0000"+
		"&(\u0003\u0006\u0003\u0000\'&\u0001\u0000\u0000\u0000(+\u0001\u0000\u0000"+
		"\u0000)\'\u0001\u0000\u0000\u0000)*\u0001\u0000\u0000\u0000*,\u0001\u0000"+
		"\u0000\u0000+)\u0001\u0000\u0000\u0000,.\u0005\t\u0000\u0000-$\u0001\u0000"+
		"\u0000\u0000-.\u0001\u0000\u0000\u0000.\u0005\u0001\u0000\u0000\u0000"+
		"/1\u0003\b\u0004\u00000/\u0001\u0000\u0000\u000012\u0001\u0000\u0000\u0000"+
		"20\u0001\u0000\u0000\u000023\u0001\u0000\u0000\u000036\u0001\u0000\u0000"+
		"\u000046\u0003\n\u0005\u000050\u0001\u0000\u0000\u000054\u0001\u0000\u0000"+
		"\u00006\u0007\u0001\u0000\u0000\u000078\u0005\u0004\u0000\u000089\u0005"+
		"\n\u0000\u00009:\u0003\u000e\u0007\u0000:;\u0005\u000b\u0000\u0000;<\u0005"+
		"\f\u0000\u0000<\t\u0001\u0000\u0000\u0000=>\u0005\u0005\u0000\u0000>?"+
		"\u0005\f\u0000\u0000?\u000b\u0001\u0000\u0000\u0000@A\u0007\u0000\u0000"+
		"\u0000A\r\u0001\u0000\u0000\u0000BC\u0005\r\u0000\u0000C\u000f\u0001\u0000"+
		"\u0000\u0000\u0006\u0013 )-25";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}