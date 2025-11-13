// Generated from EParser.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class EParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ASIGNAR=1, MOSTRAR=2, SI=3, NO=4, FIN_SI=5, CONDICIONAL=6, PUNTOYFIN=7, 
		MIENTRAS=8, FIN_MIENTRAS=9, MAS=10, MENOS=11, MUL=12, DIV=13, MAYOR=14, 
		MENOR=15, MAYORIGUAL=16, MENORIGUAL=17, IGUAL=18, DISTINTO=19, ASIG=20, 
		COMA=21, PAR_IZQ=22, PAR_DER=23, ENTERO=24, REAL=25, CADENA=26, ID=27, 
		COMENTARIO=28, NL=29, WS=30;
	public static final int
		RULE_programa = 0, RULE_instruccion = 1, RULE_bucle = 2, RULE_asignacion = 3, 
		RULE_listaIDs = 4, RULE_impresion = 5, RULE_condicional = 6, RULE_bloque = 7, 
		RULE_expresion = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "instruccion", "bucle", "asignacion", "listaIDs", "impresion", 
			"condicional", "bloque", "expresion"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'asignar'", "'mostrar'", null, null, "'terminar'", "'???'", "';P'", 
			null, "'finmientras'", "'+'", "'-'", "'*'", "'/'", "'>'", "'<'", "'>='", 
			"'<='", "'=='", "'!='", "'='", "','", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ASIGNAR", "MOSTRAR", "SI", "NO", "FIN_SI", "CONDICIONAL", "PUNTOYFIN", 
			"MIENTRAS", "FIN_MIENTRAS", "MAS", "MENOS", "MUL", "DIV", "MAYOR", "MENOR", 
			"MAYORIGUAL", "MENORIGUAL", "IGUAL", "DISTINTO", "ASIG", "COMA", "PAR_IZQ", 
			"PAR_DER", "ENTERO", "REAL", "CADENA", "ID", "COMENTARIO", "NL", "WS"
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
	public String getGrammarFileName() { return "EParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public EParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramaContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(EParser.EOF, 0); }
		public List<InstruccionContext> instruccion() {
			return getRuleContexts(InstruccionContext.class);
		}
		public InstruccionContext instruccion(int i) {
			return getRuleContext(InstruccionContext.class,i);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitPrograma(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(19); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(18);
				instruccion();
				}
				}
				setState(21); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 255852806L) != 0) );
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
	public static class InstruccionContext extends ParserRuleContext {
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public ImpresionContext impresion() {
			return getRuleContext(ImpresionContext.class,0);
		}
		public CondicionalContext condicional() {
			return getRuleContext(CondicionalContext.class,0);
		}
		public BucleContext bucle() {
			return getRuleContext(BucleContext.class,0);
		}
		public InstruccionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruccion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterInstruccion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitInstruccion(this);
		}
	}

	public final InstruccionContext instruccion() throws RecognitionException {
		InstruccionContext _localctx = new InstruccionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_instruccion);
		try {
			setState(29);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASIGNAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(25);
				asignacion();
				}
				break;
			case MOSTRAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(26);
				impresion();
				}
				break;
			case PAR_IZQ:
			case ENTERO:
			case REAL:
			case CADENA:
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(27);
				condicional();
				}
				break;
			case MIENTRAS:
				enterOuterAlt(_localctx, 4);
				{
				setState(28);
				bucle();
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
	public static class BucleContext extends ParserRuleContext {
		public TerminalNode MIENTRAS() { return getToken(EParser.MIENTRAS, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public TerminalNode FIN_MIENTRAS() { return getToken(EParser.FIN_MIENTRAS, 0); }
		public List<TerminalNode> NL() { return getTokens(EParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(EParser.NL, i);
		}
		public BucleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bucle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterBucle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitBucle(this);
		}
	}

	public final BucleContext bucle() throws RecognitionException {
		BucleContext _localctx = new BucleContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_bucle);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			match(MIENTRAS);
			setState(32);
			expresion(0);
			setState(36);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(33);
				match(NL);
				}
				}
				setState(38);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(39);
			bloque();
			setState(40);
			match(FIN_MIENTRAS);
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
	public static class AsignacionContext extends ParserRuleContext {
		public TerminalNode ASIGNAR() { return getToken(EParser.ASIGNAR, 0); }
		public ListaIDsContext listaIDs() {
			return getRuleContext(ListaIDsContext.class,0);
		}
		public TerminalNode ASIG() { return getToken(EParser.ASIG, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode PUNTOYFIN() { return getToken(EParser.PUNTOYFIN, 0); }
		public AsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterAsignacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitAsignacion(this);
		}
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_asignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			match(ASIGNAR);
			setState(43);
			listaIDs();
			setState(44);
			match(ASIG);
			setState(45);
			expresion(0);
			setState(46);
			match(PUNTOYFIN);
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
	public static class ListaIDsContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(EParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(EParser.ID, i);
		}
		public List<TerminalNode> COMA() { return getTokens(EParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(EParser.COMA, i);
		}
		public ListaIDsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaIDs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterListaIDs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitListaIDs(this);
		}
	}

	public final ListaIDsContext listaIDs() throws RecognitionException {
		ListaIDsContext _localctx = new ListaIDsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_listaIDs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(ID);
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(49);
				match(COMA);
				setState(50);
				match(ID);
				}
				}
				setState(55);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
	public static class ImpresionContext extends ParserRuleContext {
		public TerminalNode MOSTRAR() { return getToken(EParser.MOSTRAR, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode PUNTOYFIN() { return getToken(EParser.PUNTOYFIN, 0); }
		public ImpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_impresion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterImpresion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitImpresion(this);
		}
	}

	public final ImpresionContext impresion() throws RecognitionException {
		ImpresionContext _localctx = new ImpresionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_impresion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(MOSTRAR);
			setState(57);
			expresion(0);
			setState(58);
			match(PUNTOYFIN);
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
	public static class CondicionalContext extends ParserRuleContext {
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode CONDICIONAL() { return getToken(EParser.CONDICIONAL, 0); }
		public TerminalNode SI() { return getToken(EParser.SI, 0); }
		public List<BloqueContext> bloque() {
			return getRuleContexts(BloqueContext.class);
		}
		public BloqueContext bloque(int i) {
			return getRuleContext(BloqueContext.class,i);
		}
		public TerminalNode FIN_SI() { return getToken(EParser.FIN_SI, 0); }
		public TerminalNode NO() { return getToken(EParser.NO, 0); }
		public CondicionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterCondicional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitCondicional(this);
		}
	}

	public final CondicionalContext condicional() throws RecognitionException {
		CondicionalContext _localctx = new CondicionalContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_condicional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			expresion(0);
			setState(61);
			match(CONDICIONAL);
			setState(62);
			match(SI);
			setState(63);
			bloque();
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NO) {
				{
				setState(64);
				match(NO);
				setState(65);
				bloque();
				}
			}

			setState(68);
			match(FIN_SI);
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
	public static class BloqueContext extends ParserRuleContext {
		public List<InstruccionContext> instruccion() {
			return getRuleContexts(InstruccionContext.class);
		}
		public InstruccionContext instruccion(int i) {
			return getRuleContext(InstruccionContext.class,i);
		}
		public BloqueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloque; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterBloque(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitBloque(this);
		}
	}

	public final BloqueContext bloque() throws RecognitionException {
		BloqueContext _localctx = new BloqueContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_bloque);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(70);
				instruccion();
				}
				}
				setState(73); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 255852806L) != 0) );
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
	public static class ExpresionContext extends ParserRuleContext {
		public TerminalNode REAL() { return getToken(EParser.REAL, 0); }
		public TerminalNode ENTERO() { return getToken(EParser.ENTERO, 0); }
		public TerminalNode CADENA() { return getToken(EParser.CADENA, 0); }
		public TerminalNode ID() { return getToken(EParser.ID, 0); }
		public TerminalNode PAR_IZQ() { return getToken(EParser.PAR_IZQ, 0); }
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode PAR_DER() { return getToken(EParser.PAR_DER, 0); }
		public TerminalNode MAS() { return getToken(EParser.MAS, 0); }
		public TerminalNode MENOS() { return getToken(EParser.MENOS, 0); }
		public TerminalNode MAYOR() { return getToken(EParser.MAYOR, 0); }
		public TerminalNode MENOR() { return getToken(EParser.MENOR, 0); }
		public TerminalNode MAYORIGUAL() { return getToken(EParser.MAYORIGUAL, 0); }
		public TerminalNode MENORIGUAL() { return getToken(EParser.MENORIGUAL, 0); }
		public TerminalNode IGUAL() { return getToken(EParser.IGUAL, 0); }
		public TerminalNode DISTINTO() { return getToken(EParser.DISTINTO, 0); }
		public ExpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterExpresion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitExpresion(this);
		}
	}

	public final ExpresionContext expresion() throws RecognitionException {
		return expresion(0);
	}

	private ExpresionContext expresion(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpresionContext _localctx = new ExpresionContext(_ctx, _parentState);
		ExpresionContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_expresion, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case REAL:
				{
				setState(76);
				match(REAL);
				}
				break;
			case ENTERO:
				{
				setState(77);
				match(ENTERO);
				}
				break;
			case CADENA:
				{
				setState(78);
				match(CADENA);
				}
				break;
			case ID:
				{
				setState(79);
				match(ID);
				}
				break;
			case PAR_IZQ:
				{
				setState(80);
				match(PAR_IZQ);
				setState(81);
				expresion(0);
				setState(82);
				match(PAR_DER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(94);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(92);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new ExpresionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(86);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(87);
						_la = _input.LA(1);
						if ( !(_la==MAS || _la==MENOS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(88);
						expresion(8);
						}
						break;
					case 2:
						{
						_localctx = new ExpresionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(89);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(90);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1032192L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(91);
						expresion(7);
						}
						break;
					}
					} 
				}
				setState(96);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 8:
			return expresion_sempred((ExpresionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expresion_sempred(ExpresionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u001eb\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0001\u0000\u0004\u0000\u0014\b\u0000\u000b\u0000\f\u0000\u0015"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u0001\u001e\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002"+
		"#\b\u0002\n\u0002\f\u0002&\t\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u00044\b\u0004\n\u0004\f\u0004"+
		"7\t\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006"+
		"C\b\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0004\u0007H\b\u0007\u000b"+
		"\u0007\f\u0007I\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0003\bU\b\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0005\b]\b\b\n\b\f\b`\t\b\u0001\b\u0000\u0001\u0010\t\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0000\u0002\u0001\u0000\n\u000b\u0001"+
		"\u0000\u000e\u0013f\u0000\u0013\u0001\u0000\u0000\u0000\u0002\u001d\u0001"+
		"\u0000\u0000\u0000\u0004\u001f\u0001\u0000\u0000\u0000\u0006*\u0001\u0000"+
		"\u0000\u0000\b0\u0001\u0000\u0000\u0000\n8\u0001\u0000\u0000\u0000\f<"+
		"\u0001\u0000\u0000\u0000\u000eG\u0001\u0000\u0000\u0000\u0010T\u0001\u0000"+
		"\u0000\u0000\u0012\u0014\u0003\u0002\u0001\u0000\u0013\u0012\u0001\u0000"+
		"\u0000\u0000\u0014\u0015\u0001\u0000\u0000\u0000\u0015\u0013\u0001\u0000"+
		"\u0000\u0000\u0015\u0016\u0001\u0000\u0000\u0000\u0016\u0017\u0001\u0000"+
		"\u0000\u0000\u0017\u0018\u0005\u0000\u0000\u0001\u0018\u0001\u0001\u0000"+
		"\u0000\u0000\u0019\u001e\u0003\u0006\u0003\u0000\u001a\u001e\u0003\n\u0005"+
		"\u0000\u001b\u001e\u0003\f\u0006\u0000\u001c\u001e\u0003\u0004\u0002\u0000"+
		"\u001d\u0019\u0001\u0000\u0000\u0000\u001d\u001a\u0001\u0000\u0000\u0000"+
		"\u001d\u001b\u0001\u0000\u0000\u0000\u001d\u001c\u0001\u0000\u0000\u0000"+
		"\u001e\u0003\u0001\u0000\u0000\u0000\u001f \u0005\b\u0000\u0000 $\u0003"+
		"\u0010\b\u0000!#\u0005\u001d\u0000\u0000\"!\u0001\u0000\u0000\u0000#&"+
		"\u0001\u0000\u0000\u0000$\"\u0001\u0000\u0000\u0000$%\u0001\u0000\u0000"+
		"\u0000%\'\u0001\u0000\u0000\u0000&$\u0001\u0000\u0000\u0000\'(\u0003\u000e"+
		"\u0007\u0000()\u0005\t\u0000\u0000)\u0005\u0001\u0000\u0000\u0000*+\u0005"+
		"\u0001\u0000\u0000+,\u0003\b\u0004\u0000,-\u0005\u0014\u0000\u0000-.\u0003"+
		"\u0010\b\u0000./\u0005\u0007\u0000\u0000/\u0007\u0001\u0000\u0000\u0000"+
		"05\u0005\u001b\u0000\u000012\u0005\u0015\u0000\u000024\u0005\u001b\u0000"+
		"\u000031\u0001\u0000\u0000\u000047\u0001\u0000\u0000\u000053\u0001\u0000"+
		"\u0000\u000056\u0001\u0000\u0000\u00006\t\u0001\u0000\u0000\u000075\u0001"+
		"\u0000\u0000\u000089\u0005\u0002\u0000\u00009:\u0003\u0010\b\u0000:;\u0005"+
		"\u0007\u0000\u0000;\u000b\u0001\u0000\u0000\u0000<=\u0003\u0010\b\u0000"+
		"=>\u0005\u0006\u0000\u0000>?\u0005\u0003\u0000\u0000?B\u0003\u000e\u0007"+
		"\u0000@A\u0005\u0004\u0000\u0000AC\u0003\u000e\u0007\u0000B@\u0001\u0000"+
		"\u0000\u0000BC\u0001\u0000\u0000\u0000CD\u0001\u0000\u0000\u0000DE\u0005"+
		"\u0005\u0000\u0000E\r\u0001\u0000\u0000\u0000FH\u0003\u0002\u0001\u0000"+
		"GF\u0001\u0000\u0000\u0000HI\u0001\u0000\u0000\u0000IG\u0001\u0000\u0000"+
		"\u0000IJ\u0001\u0000\u0000\u0000J\u000f\u0001\u0000\u0000\u0000KL\u0006"+
		"\b\uffff\uffff\u0000LU\u0005\u0019\u0000\u0000MU\u0005\u0018\u0000\u0000"+
		"NU\u0005\u001a\u0000\u0000OU\u0005\u001b\u0000\u0000PQ\u0005\u0016\u0000"+
		"\u0000QR\u0003\u0010\b\u0000RS\u0005\u0017\u0000\u0000SU\u0001\u0000\u0000"+
		"\u0000TK\u0001\u0000\u0000\u0000TM\u0001\u0000\u0000\u0000TN\u0001\u0000"+
		"\u0000\u0000TO\u0001\u0000\u0000\u0000TP\u0001\u0000\u0000\u0000U^\u0001"+
		"\u0000\u0000\u0000VW\n\u0007\u0000\u0000WX\u0007\u0000\u0000\u0000X]\u0003"+
		"\u0010\b\bYZ\n\u0006\u0000\u0000Z[\u0007\u0001\u0000\u0000[]\u0003\u0010"+
		"\b\u0007\\V\u0001\u0000\u0000\u0000\\Y\u0001\u0000\u0000\u0000]`\u0001"+
		"\u0000\u0000\u0000^\\\u0001\u0000\u0000\u0000^_\u0001\u0000\u0000\u0000"+
		"_\u0011\u0001\u0000\u0000\u0000`^\u0001\u0000\u0000\u0000\t\u0015\u001d"+
		"$5BIT\\^";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}