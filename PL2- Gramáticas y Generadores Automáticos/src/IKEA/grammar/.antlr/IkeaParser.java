// Generated from c:/Users/diego/DIEGO/UAH/Curso 2025-2026/1 Cuatrimestre/PDL/Laboratorio/uah_procesadores/PL2- Gramáticas y Generadores Automáticos/src/ikea/grammar/IkeaParser.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class IkeaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ITEM=1, UNIR=2, PONER=3, ATORNILLAR=4, GIRAR=5, REPETIR=6, PIEZA=7, ESPIGA=8, 
		TORNILLO=9, TUERCA=10, HERRAJE=11, DESTORNILLADOR=12, MARTILLO=13, ARRIBA=14, 
		ABAJO=15, LATERAL=16, CON=17, EN=18, Y=19, COMMA=20, COLON=21, DOT=22, 
		SEMI=23, INT=24, IDENT=25, WS=26;
	public static final int
		RULE_manual = 0, RULE_step = 1, RULE_stepLabel = 2, RULE_instructionList = 3, 
		RULE_instruction = 4, RULE_unirInstr = 5, RULE_ponerInstr = 6, RULE_conHerramientaAtornillarInstr = 7, 
		RULE_atornillarInstr = 8, RULE_girarInstr = 9, RULE_repetirInstr = 10, 
		RULE_orientacion = 11, RULE_herramienta = 12, RULE_tipoHerraje = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"manual", "step", "stepLabel", "instructionList", "instruction", "unirInstr", 
			"ponerInstr", "conHerramientaAtornillarInstr", "atornillarInstr", "girarInstr", 
			"repetirInstr", "orientacion", "herramienta", "tipoHerraje"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "','", "':'", "'.'", 
			"';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ITEM", "UNIR", "PONER", "ATORNILLAR", "GIRAR", "REPETIR", "PIEZA", 
			"ESPIGA", "TORNILLO", "TUERCA", "HERRAJE", "DESTORNILLADOR", "MARTILLO", 
			"ARRIBA", "ABAJO", "LATERAL", "CON", "EN", "Y", "COMMA", "COLON", "DOT", 
			"SEMI", "INT", "IDENT", "WS"
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
	public String getGrammarFileName() { return "IkeaParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public IkeaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ManualContext extends ParserRuleContext {
		public TerminalNode ITEM() { return getToken(IkeaParser.ITEM, 0); }
		public TerminalNode COLON() { return getToken(IkeaParser.COLON, 0); }
		public TerminalNode IDENT() { return getToken(IkeaParser.IDENT, 0); }
		public TerminalNode EOF() { return getToken(IkeaParser.EOF, 0); }
		public List<StepContext> step() {
			return getRuleContexts(StepContext.class);
		}
		public StepContext step(int i) {
			return getRuleContext(StepContext.class,i);
		}
		public ManualContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_manual; }
	}

	public final ManualContext manual() throws RecognitionException {
		ManualContext _localctx = new ManualContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_manual);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			match(ITEM);
			setState(29);
			match(COLON);
			setState(30);
			match(IDENT);
			setState(32); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(31);
				step();
				}
				}
				setState(34); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==INT );
			setState(36);
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
	public static class StepContext extends ParserRuleContext {
		public StepLabelContext stepLabel() {
			return getRuleContext(StepLabelContext.class,0);
		}
		public TerminalNode DOT() { return getToken(IkeaParser.DOT, 0); }
		public InstructionListContext instructionList() {
			return getRuleContext(InstructionListContext.class,0);
		}
		public StepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_step; }
	}

	public final StepContext step() throws RecognitionException {
		StepContext _localctx = new StepContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_step);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			stepLabel();
			setState(39);
			match(DOT);
			setState(40);
			instructionList();
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
	public static class StepLabelContext extends ParserRuleContext {
		public List<TerminalNode> INT() { return getTokens(IkeaParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(IkeaParser.INT, i);
		}
		public List<TerminalNode> DOT() { return getTokens(IkeaParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(IkeaParser.DOT, i);
		}
		public StepLabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stepLabel; }
	}

	public final StepLabelContext stepLabel() throws RecognitionException {
		StepLabelContext _localctx = new StepLabelContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_stepLabel);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			match(INT);
			setState(47);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(43);
					match(DOT);
					setState(44);
					match(INT);
					}
					} 
				}
				setState(49);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
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
	public static class InstructionListContext extends ParserRuleContext {
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(IkeaParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(IkeaParser.SEMI, i);
		}
		public InstructionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instructionList; }
	}

	public final InstructionListContext instructionList() throws RecognitionException {
		InstructionListContext _localctx = new InstructionListContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_instructionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			instruction();
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI) {
				{
				{
				setState(51);
				match(SEMI);
				setState(52);
				instruction();
				}
				}
				setState(57);
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
	public static class InstructionContext extends ParserRuleContext {
		public UnirInstrContext unirInstr() {
			return getRuleContext(UnirInstrContext.class,0);
		}
		public PonerInstrContext ponerInstr() {
			return getRuleContext(PonerInstrContext.class,0);
		}
		public GirarInstrContext girarInstr() {
			return getRuleContext(GirarInstrContext.class,0);
		}
		public RepetirInstrContext repetirInstr() {
			return getRuleContext(RepetirInstrContext.class,0);
		}
		public AtornillarInstrContext atornillarInstr() {
			return getRuleContext(AtornillarInstrContext.class,0);
		}
		public ConHerramientaAtornillarInstrContext conHerramientaAtornillarInstr() {
			return getRuleContext(ConHerramientaAtornillarInstrContext.class,0);
		}
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_instruction);
		try {
			setState(64);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case UNIR:
				enterOuterAlt(_localctx, 1);
				{
				setState(58);
				unirInstr();
				}
				break;
			case PONER:
				enterOuterAlt(_localctx, 2);
				{
				setState(59);
				ponerInstr();
				}
				break;
			case GIRAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(60);
				girarInstr();
				}
				break;
			case REPETIR:
				enterOuterAlt(_localctx, 4);
				{
				setState(61);
				repetirInstr();
				}
				break;
			case ATORNILLAR:
				enterOuterAlt(_localctx, 5);
				{
				setState(62);
				atornillarInstr();
				}
				break;
			case CON:
				enterOuterAlt(_localctx, 6);
				{
				setState(63);
				conHerramientaAtornillarInstr();
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
	public static class UnirInstrContext extends ParserRuleContext {
		public TerminalNode UNIR() { return getToken(IkeaParser.UNIR, 0); }
		public List<TerminalNode> PIEZA() { return getTokens(IkeaParser.PIEZA); }
		public TerminalNode PIEZA(int i) {
			return getToken(IkeaParser.PIEZA, i);
		}
		public List<TerminalNode> IDENT() { return getTokens(IkeaParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(IkeaParser.IDENT, i);
		}
		public TerminalNode Y() { return getToken(IkeaParser.Y, 0); }
		public UnirInstrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unirInstr; }
	}

	public final UnirInstrContext unirInstr() throws RecognitionException {
		UnirInstrContext _localctx = new UnirInstrContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_unirInstr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(UNIR);
			setState(67);
			match(PIEZA);
			setState(68);
			match(IDENT);
			setState(69);
			match(Y);
			setState(70);
			match(PIEZA);
			setState(71);
			match(IDENT);
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
	public static class PonerInstrContext extends ParserRuleContext {
		public TerminalNode PONER() { return getToken(IkeaParser.PONER, 0); }
		public List<TerminalNode> INT() { return getTokens(IkeaParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(IkeaParser.INT, i);
		}
		public TipoHerrajeContext tipoHerraje() {
			return getRuleContext(TipoHerrajeContext.class,0);
		}
		public TerminalNode EN() { return getToken(IkeaParser.EN, 0); }
		public TerminalNode PIEZA() { return getToken(IkeaParser.PIEZA, 0); }
		public TerminalNode IDENT() { return getToken(IkeaParser.IDENT, 0); }
		public PonerInstrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ponerInstr; }
	}

	public final PonerInstrContext ponerInstr() throws RecognitionException {
		PonerInstrContext _localctx = new PonerInstrContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_ponerInstr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(PONER);
			setState(74);
			match(INT);
			setState(75);
			tipoHerraje();
			setState(76);
			match(INT);
			setState(77);
			match(EN);
			setState(78);
			match(PIEZA);
			setState(79);
			match(IDENT);
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
	public static class ConHerramientaAtornillarInstrContext extends ParserRuleContext {
		public TerminalNode CON() { return getToken(IkeaParser.CON, 0); }
		public HerramientaContext herramienta() {
			return getRuleContext(HerramientaContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(IkeaParser.COMMA, 0); }
		public AtornillarInstrContext atornillarInstr() {
			return getRuleContext(AtornillarInstrContext.class,0);
		}
		public ConHerramientaAtornillarInstrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conHerramientaAtornillarInstr; }
	}

	public final ConHerramientaAtornillarInstrContext conHerramientaAtornillarInstr() throws RecognitionException {
		ConHerramientaAtornillarInstrContext _localctx = new ConHerramientaAtornillarInstrContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_conHerramientaAtornillarInstr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(CON);
			setState(82);
			herramienta();
			setState(83);
			match(COMMA);
			setState(84);
			atornillarInstr();
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
	public static class AtornillarInstrContext extends ParserRuleContext {
		public TerminalNode ATORNILLAR() { return getToken(IkeaParser.ATORNILLAR, 0); }
		public List<TerminalNode> INT() { return getTokens(IkeaParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(IkeaParser.INT, i);
		}
		public TerminalNode TORNILLO() { return getToken(IkeaParser.TORNILLO, 0); }
		public TerminalNode EN() { return getToken(IkeaParser.EN, 0); }
		public TerminalNode PIEZA() { return getToken(IkeaParser.PIEZA, 0); }
		public TerminalNode IDENT() { return getToken(IkeaParser.IDENT, 0); }
		public TerminalNode CON() { return getToken(IkeaParser.CON, 0); }
		public TerminalNode TUERCA() { return getToken(IkeaParser.TUERCA, 0); }
		public AtornillarInstrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atornillarInstr; }
	}

	public final AtornillarInstrContext atornillarInstr() throws RecognitionException {
		AtornillarInstrContext _localctx = new AtornillarInstrContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_atornillarInstr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(ATORNILLAR);
			setState(87);
			match(INT);
			setState(88);
			match(TORNILLO);
			setState(89);
			match(INT);
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EN) {
				{
				setState(90);
				match(EN);
				setState(91);
				match(PIEZA);
				setState(92);
				match(IDENT);
				}
			}

			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CON) {
				{
				setState(95);
				match(CON);
				setState(96);
				match(TUERCA);
				setState(97);
				match(INT);
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
	public static class GirarInstrContext extends ParserRuleContext {
		public TerminalNode GIRAR() { return getToken(IkeaParser.GIRAR, 0); }
		public OrientacionContext orientacion() {
			return getRuleContext(OrientacionContext.class,0);
		}
		public GirarInstrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_girarInstr; }
	}

	public final GirarInstrContext girarInstr() throws RecognitionException {
		GirarInstrContext _localctx = new GirarInstrContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_girarInstr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(GIRAR);
			setState(101);
			orientacion();
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
	public static class RepetirInstrContext extends ParserRuleContext {
		public TerminalNode REPETIR() { return getToken(IkeaParser.REPETIR, 0); }
		public StepLabelContext stepLabel() {
			return getRuleContext(StepLabelContext.class,0);
		}
		public RepetirInstrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repetirInstr; }
	}

	public final RepetirInstrContext repetirInstr() throws RecognitionException {
		RepetirInstrContext _localctx = new RepetirInstrContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_repetirInstr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(REPETIR);
			setState(104);
			stepLabel();
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
	public static class OrientacionContext extends ParserRuleContext {
		public TerminalNode ARRIBA() { return getToken(IkeaParser.ARRIBA, 0); }
		public TerminalNode ABAJO() { return getToken(IkeaParser.ABAJO, 0); }
		public TerminalNode LATERAL() { return getToken(IkeaParser.LATERAL, 0); }
		public OrientacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orientacion; }
	}

	public final OrientacionContext orientacion() throws RecognitionException {
		OrientacionContext _localctx = new OrientacionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_orientacion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 114688L) != 0)) ) {
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
	public static class HerramientaContext extends ParserRuleContext {
		public TerminalNode DESTORNILLADOR() { return getToken(IkeaParser.DESTORNILLADOR, 0); }
		public TerminalNode MARTILLO() { return getToken(IkeaParser.MARTILLO, 0); }
		public HerramientaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_herramienta; }
	}

	public final HerramientaContext herramienta() throws RecognitionException {
		HerramientaContext _localctx = new HerramientaContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_herramienta);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			_la = _input.LA(1);
			if ( !(_la==DESTORNILLADOR || _la==MARTILLO) ) {
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
	public static class TipoHerrajeContext extends ParserRuleContext {
		public TerminalNode ESPIGA() { return getToken(IkeaParser.ESPIGA, 0); }
		public TerminalNode TUERCA() { return getToken(IkeaParser.TUERCA, 0); }
		public TerminalNode HERRAJE() { return getToken(IkeaParser.HERRAJE, 0); }
		public TipoHerrajeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipoHerraje; }
	}

	public final TipoHerrajeContext tipoHerraje() throws RecognitionException {
		TipoHerrajeContext _localctx = new TipoHerrajeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_tipoHerraje);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3328L) != 0)) ) {
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

	public static final String _serializedATN =
		"\u0004\u0001\u001aq\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0004\u0000!\b\u0000\u000b\u0000\f\u0000\"\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0005\u0002.\b\u0002\n\u0002\f\u00021\t\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0005\u00036\b\u0003\n\u0003\f\u00039\t\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003"+
		"\u0004A\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0003\b^\b\b\u0001\b\u0001\b\u0001\b\u0003"+
		"\bc\b\b\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001"+
		"\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0000\u0000\u000e\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u0000"+
		"\u0003\u0001\u0000\u000e\u0010\u0001\u0000\f\r\u0002\u0000\b\b\n\u000b"+
		"l\u0000\u001c\u0001\u0000\u0000\u0000\u0002&\u0001\u0000\u0000\u0000\u0004"+
		"*\u0001\u0000\u0000\u0000\u00062\u0001\u0000\u0000\u0000\b@\u0001\u0000"+
		"\u0000\u0000\nB\u0001\u0000\u0000\u0000\fI\u0001\u0000\u0000\u0000\u000e"+
		"Q\u0001\u0000\u0000\u0000\u0010V\u0001\u0000\u0000\u0000\u0012d\u0001"+
		"\u0000\u0000\u0000\u0014g\u0001\u0000\u0000\u0000\u0016j\u0001\u0000\u0000"+
		"\u0000\u0018l\u0001\u0000\u0000\u0000\u001an\u0001\u0000\u0000\u0000\u001c"+
		"\u001d\u0005\u0001\u0000\u0000\u001d\u001e\u0005\u0015\u0000\u0000\u001e"+
		" \u0005\u0019\u0000\u0000\u001f!\u0003\u0002\u0001\u0000 \u001f\u0001"+
		"\u0000\u0000\u0000!\"\u0001\u0000\u0000\u0000\" \u0001\u0000\u0000\u0000"+
		"\"#\u0001\u0000\u0000\u0000#$\u0001\u0000\u0000\u0000$%\u0005\u0000\u0000"+
		"\u0001%\u0001\u0001\u0000\u0000\u0000&\'\u0003\u0004\u0002\u0000\'(\u0005"+
		"\u0016\u0000\u0000()\u0003\u0006\u0003\u0000)\u0003\u0001\u0000\u0000"+
		"\u0000*/\u0005\u0018\u0000\u0000+,\u0005\u0016\u0000\u0000,.\u0005\u0018"+
		"\u0000\u0000-+\u0001\u0000\u0000\u0000.1\u0001\u0000\u0000\u0000/-\u0001"+
		"\u0000\u0000\u0000/0\u0001\u0000\u0000\u00000\u0005\u0001\u0000\u0000"+
		"\u00001/\u0001\u0000\u0000\u000027\u0003\b\u0004\u000034\u0005\u0017\u0000"+
		"\u000046\u0003\b\u0004\u000053\u0001\u0000\u0000\u000069\u0001\u0000\u0000"+
		"\u000075\u0001\u0000\u0000\u000078\u0001\u0000\u0000\u00008\u0007\u0001"+
		"\u0000\u0000\u000097\u0001\u0000\u0000\u0000:A\u0003\n\u0005\u0000;A\u0003"+
		"\f\u0006\u0000<A\u0003\u0012\t\u0000=A\u0003\u0014\n\u0000>A\u0003\u0010"+
		"\b\u0000?A\u0003\u000e\u0007\u0000@:\u0001\u0000\u0000\u0000@;\u0001\u0000"+
		"\u0000\u0000@<\u0001\u0000\u0000\u0000@=\u0001\u0000\u0000\u0000@>\u0001"+
		"\u0000\u0000\u0000@?\u0001\u0000\u0000\u0000A\t\u0001\u0000\u0000\u0000"+
		"BC\u0005\u0002\u0000\u0000CD\u0005\u0007\u0000\u0000DE\u0005\u0019\u0000"+
		"\u0000EF\u0005\u0013\u0000\u0000FG\u0005\u0007\u0000\u0000GH\u0005\u0019"+
		"\u0000\u0000H\u000b\u0001\u0000\u0000\u0000IJ\u0005\u0003\u0000\u0000"+
		"JK\u0005\u0018\u0000\u0000KL\u0003\u001a\r\u0000LM\u0005\u0018\u0000\u0000"+
		"MN\u0005\u0012\u0000\u0000NO\u0005\u0007\u0000\u0000OP\u0005\u0019\u0000"+
		"\u0000P\r\u0001\u0000\u0000\u0000QR\u0005\u0011\u0000\u0000RS\u0003\u0018"+
		"\f\u0000ST\u0005\u0014\u0000\u0000TU\u0003\u0010\b\u0000U\u000f\u0001"+
		"\u0000\u0000\u0000VW\u0005\u0004\u0000\u0000WX\u0005\u0018\u0000\u0000"+
		"XY\u0005\t\u0000\u0000Y]\u0005\u0018\u0000\u0000Z[\u0005\u0012\u0000\u0000"+
		"[\\\u0005\u0007\u0000\u0000\\^\u0005\u0019\u0000\u0000]Z\u0001\u0000\u0000"+
		"\u0000]^\u0001\u0000\u0000\u0000^b\u0001\u0000\u0000\u0000_`\u0005\u0011"+
		"\u0000\u0000`a\u0005\n\u0000\u0000ac\u0005\u0018\u0000\u0000b_\u0001\u0000"+
		"\u0000\u0000bc\u0001\u0000\u0000\u0000c\u0011\u0001\u0000\u0000\u0000"+
		"de\u0005\u0005\u0000\u0000ef\u0003\u0016\u000b\u0000f\u0013\u0001\u0000"+
		"\u0000\u0000gh\u0005\u0006\u0000\u0000hi\u0003\u0004\u0002\u0000i\u0015"+
		"\u0001\u0000\u0000\u0000jk\u0007\u0000\u0000\u0000k\u0017\u0001\u0000"+
		"\u0000\u0000lm\u0007\u0001\u0000\u0000m\u0019\u0001\u0000\u0000\u0000"+
		"no\u0007\u0002\u0000\u0000o\u001b\u0001\u0000\u0000\u0000\u0006\"/7@]"+
		"b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}