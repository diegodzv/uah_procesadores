// Generated from IkeaParser.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class IkeaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ITEM=1, UNIR=2, PONER=3, ATORNILLAR=4, GIRAR=5, REPETIR=6, PIEZA=7, ESPIGA=8, 
		TORNILLO=9, TUERCA=10, HERRAJE=11, DESTORNILLADOR=12, MARTILLO=13, CON=14, 
		EN=15, Y=16, COMMA=17, COLON=18, DOT=19, SEMI=20, IDENT=21, INT=22, WS=23;
	public static final int
		RULE_manual = 0, RULE_step = 1, RULE_stepLabel = 2, RULE_instructionList = 3, 
		RULE_instruction = 4, RULE_unirInstr = 5, RULE_ponerInstr = 6, RULE_conHerramientaAtornillarInstr = 7, 
		RULE_atornillarInstr = 8, RULE_girarInstr = 9, RULE_repetirInstr = 10, 
		RULE_herramienta = 11, RULE_tipoHerraje = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"manual", "step", "stepLabel", "instructionList", "instruction", "unirInstr", 
			"ponerInstr", "conHerramientaAtornillarInstr", "atornillarInstr", "girarInstr", 
			"repetirInstr", "herramienta", "tipoHerraje"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'ITEM'", "'UNIR'", "'PONER'", "'ATORNILLAR'", "'GIRAR'", "'REPETIR'", 
			"'PIEZA'", "'ESPIGA'", "'TORNILLO'", "'TUERCA'", "'HERRAJE'", "'DESTORNILLADOR'", 
			"'MARTILLO'", "'Con'", "'en'", "'y'", "','", "':'", "'.'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ITEM", "UNIR", "PONER", "ATORNILLAR", "GIRAR", "REPETIR", "PIEZA", 
			"ESPIGA", "TORNILLO", "TUERCA", "HERRAJE", "DESTORNILLADOR", "MARTILLO", 
			"CON", "EN", "Y", "COMMA", "COLON", "DOT", "SEMI", "IDENT", "INT", "WS"
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IkeaParserListener ) ((IkeaParserListener)listener).enterManual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IkeaParserListener ) ((IkeaParserListener)listener).exitManual(this);
		}
	}

	public final ManualContext manual() throws RecognitionException {
		ManualContext _localctx = new ManualContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_manual);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			match(ITEM);
			setState(27);
			match(COLON);
			setState(28);
			match(IDENT);
			setState(30); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(29);
				step();
				}
				}
				setState(32); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==INT );
			setState(34);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IkeaParserListener ) ((IkeaParserListener)listener).enterStep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IkeaParserListener ) ((IkeaParserListener)listener).exitStep(this);
		}
	}

	public final StepContext step() throws RecognitionException {
		StepContext _localctx = new StepContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_step);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			stepLabel();
			setState(37);
			match(DOT);
			setState(38);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IkeaParserListener ) ((IkeaParserListener)listener).enterStepLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IkeaParserListener ) ((IkeaParserListener)listener).exitStepLabel(this);
		}
	}

	public final StepLabelContext stepLabel() throws RecognitionException {
		StepLabelContext _localctx = new StepLabelContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_stepLabel);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			match(INT);
			setState(45);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(41);
					match(DOT);
					setState(42);
					match(INT);
					}
					} 
				}
				setState(47);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IkeaParserListener ) ((IkeaParserListener)listener).enterInstructionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IkeaParserListener ) ((IkeaParserListener)listener).exitInstructionList(this);
		}
	}

	public final InstructionListContext instructionList() throws RecognitionException {
		InstructionListContext _localctx = new InstructionListContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_instructionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			instruction();
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI) {
				{
				{
				setState(49);
				match(SEMI);
				setState(50);
				instruction();
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
	public static class InstructionContext extends ParserRuleContext {
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
	 
		public InstructionContext() { }
		public void copyFrom(InstructionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PonerInstrNodeContext extends InstructionContext {
		public PonerInstrContext ponerInstr() {
			return getRuleContext(PonerInstrContext.class,0);
		}
		public PonerInstrNodeContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IkeaParserListener ) ((IkeaParserListener)listener).enterPonerInstrNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IkeaParserListener ) ((IkeaParserListener)listener).exitPonerInstrNode(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AtornillarInstrNodeContext extends InstructionContext {
		public AtornillarInstrContext atornillarInstr() {
			return getRuleContext(AtornillarInstrContext.class,0);
		}
		public AtornillarInstrNodeContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IkeaParserListener ) ((IkeaParserListener)listener).enterAtornillarInstrNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IkeaParserListener ) ((IkeaParserListener)listener).exitAtornillarInstrNode(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ConHerramientaAtornillarInstrNodeContext extends InstructionContext {
		public ConHerramientaAtornillarInstrContext conHerramientaAtornillarInstr() {
			return getRuleContext(ConHerramientaAtornillarInstrContext.class,0);
		}
		public ConHerramientaAtornillarInstrNodeContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IkeaParserListener ) ((IkeaParserListener)listener).enterConHerramientaAtornillarInstrNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IkeaParserListener ) ((IkeaParserListener)listener).exitConHerramientaAtornillarInstrNode(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GirarInstrNodeContext extends InstructionContext {
		public GirarInstrContext girarInstr() {
			return getRuleContext(GirarInstrContext.class,0);
		}
		public GirarInstrNodeContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IkeaParserListener ) ((IkeaParserListener)listener).enterGirarInstrNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IkeaParserListener ) ((IkeaParserListener)listener).exitGirarInstrNode(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RepetirInstrNodeContext extends InstructionContext {
		public RepetirInstrContext repetirInstr() {
			return getRuleContext(RepetirInstrContext.class,0);
		}
		public RepetirInstrNodeContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IkeaParserListener ) ((IkeaParserListener)listener).enterRepetirInstrNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IkeaParserListener ) ((IkeaParserListener)listener).exitRepetirInstrNode(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnirInstrNodeContext extends InstructionContext {
		public UnirInstrContext unirInstr() {
			return getRuleContext(UnirInstrContext.class,0);
		}
		public UnirInstrNodeContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IkeaParserListener ) ((IkeaParserListener)listener).enterUnirInstrNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IkeaParserListener ) ((IkeaParserListener)listener).exitUnirInstrNode(this);
		}
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_instruction);
		try {
			setState(62);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case UNIR:
				_localctx = new UnirInstrNodeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(56);
				unirInstr();
				}
				break;
			case PONER:
				_localctx = new PonerInstrNodeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(57);
				ponerInstr();
				}
				break;
			case GIRAR:
				_localctx = new GirarInstrNodeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(58);
				girarInstr();
				}
				break;
			case REPETIR:
				_localctx = new RepetirInstrNodeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(59);
				repetirInstr();
				}
				break;
			case ATORNILLAR:
				_localctx = new AtornillarInstrNodeContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(60);
				atornillarInstr();
				}
				break;
			case CON:
				_localctx = new ConHerramientaAtornillarInstrNodeContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(61);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IkeaParserListener ) ((IkeaParserListener)listener).enterUnirInstr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IkeaParserListener ) ((IkeaParserListener)listener).exitUnirInstr(this);
		}
	}

	public final UnirInstrContext unirInstr() throws RecognitionException {
		UnirInstrContext _localctx = new UnirInstrContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_unirInstr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(UNIR);
			setState(65);
			match(PIEZA);
			setState(66);
			match(IDENT);
			setState(67);
			match(Y);
			setState(68);
			match(PIEZA);
			setState(69);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IkeaParserListener ) ((IkeaParserListener)listener).enterPonerInstr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IkeaParserListener ) ((IkeaParserListener)listener).exitPonerInstr(this);
		}
	}

	public final PonerInstrContext ponerInstr() throws RecognitionException {
		PonerInstrContext _localctx = new PonerInstrContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_ponerInstr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(PONER);
			setState(72);
			match(INT);
			setState(73);
			tipoHerraje();
			setState(74);
			match(INT);
			setState(75);
			match(EN);
			setState(76);
			match(PIEZA);
			setState(77);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IkeaParserListener ) ((IkeaParserListener)listener).enterConHerramientaAtornillarInstr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IkeaParserListener ) ((IkeaParserListener)listener).exitConHerramientaAtornillarInstr(this);
		}
	}

	public final ConHerramientaAtornillarInstrContext conHerramientaAtornillarInstr() throws RecognitionException {
		ConHerramientaAtornillarInstrContext _localctx = new ConHerramientaAtornillarInstrContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_conHerramientaAtornillarInstr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(CON);
			setState(80);
			herramienta();
			setState(81);
			match(COMMA);
			setState(82);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IkeaParserListener ) ((IkeaParserListener)listener).enterAtornillarInstr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IkeaParserListener ) ((IkeaParserListener)listener).exitAtornillarInstr(this);
		}
	}

	public final AtornillarInstrContext atornillarInstr() throws RecognitionException {
		AtornillarInstrContext _localctx = new AtornillarInstrContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_atornillarInstr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(ATORNILLAR);
			setState(85);
			match(INT);
			setState(86);
			match(TORNILLO);
			setState(87);
			match(INT);
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EN) {
				{
				setState(88);
				match(EN);
				setState(89);
				match(PIEZA);
				setState(90);
				match(IDENT);
				}
			}

			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CON) {
				{
				setState(93);
				match(CON);
				setState(94);
				match(TUERCA);
				setState(95);
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
		public TerminalNode IDENT() { return getToken(IkeaParser.IDENT, 0); }
		public GirarInstrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_girarInstr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IkeaParserListener ) ((IkeaParserListener)listener).enterGirarInstr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IkeaParserListener ) ((IkeaParserListener)listener).exitGirarInstr(this);
		}
	}

	public final GirarInstrContext girarInstr() throws RecognitionException {
		GirarInstrContext _localctx = new GirarInstrContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_girarInstr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(GIRAR);
			setState(99);
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
	public static class RepetirInstrContext extends ParserRuleContext {
		public TerminalNode REPETIR() { return getToken(IkeaParser.REPETIR, 0); }
		public StepLabelContext stepLabel() {
			return getRuleContext(StepLabelContext.class,0);
		}
		public RepetirInstrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repetirInstr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IkeaParserListener ) ((IkeaParserListener)listener).enterRepetirInstr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IkeaParserListener ) ((IkeaParserListener)listener).exitRepetirInstr(this);
		}
	}

	public final RepetirInstrContext repetirInstr() throws RecognitionException {
		RepetirInstrContext _localctx = new RepetirInstrContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_repetirInstr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(REPETIR);
			setState(102);
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
	public static class HerramientaContext extends ParserRuleContext {
		public TerminalNode DESTORNILLADOR() { return getToken(IkeaParser.DESTORNILLADOR, 0); }
		public TerminalNode MARTILLO() { return getToken(IkeaParser.MARTILLO, 0); }
		public HerramientaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_herramienta; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IkeaParserListener ) ((IkeaParserListener)listener).enterHerramienta(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IkeaParserListener ) ((IkeaParserListener)listener).exitHerramienta(this);
		}
	}

	public final HerramientaContext herramienta() throws RecognitionException {
		HerramientaContext _localctx = new HerramientaContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_herramienta);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IkeaParserListener ) ((IkeaParserListener)listener).enterTipoHerraje(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IkeaParserListener ) ((IkeaParserListener)listener).exitTipoHerraje(this);
		}
	}

	public final TipoHerrajeContext tipoHerraje() throws RecognitionException {
		TipoHerrajeContext _localctx = new TipoHerrajeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_tipoHerraje);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
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
		"\u0004\u0001\u0017m\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0004\u0000"+
		"\u001f\b\u0000\u000b\u0000\f\u0000 \u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0005\u0002,\b\u0002\n\u0002\f\u0002/\t\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0005\u00034\b\u0003\n\u0003\f\u00037\t\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004"+
		"?\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0003\b\\\b\b\u0001\b\u0001\b\u0001\b\u0003\ba\b\b"+
		"\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0001\f\u0000\u0000\r\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u0000\u0002\u0001\u0000\f\r\u0002\u0000"+
		"\b\b\n\u000bi\u0000\u001a\u0001\u0000\u0000\u0000\u0002$\u0001\u0000\u0000"+
		"\u0000\u0004(\u0001\u0000\u0000\u0000\u00060\u0001\u0000\u0000\u0000\b"+
		">\u0001\u0000\u0000\u0000\n@\u0001\u0000\u0000\u0000\fG\u0001\u0000\u0000"+
		"\u0000\u000eO\u0001\u0000\u0000\u0000\u0010T\u0001\u0000\u0000\u0000\u0012"+
		"b\u0001\u0000\u0000\u0000\u0014e\u0001\u0000\u0000\u0000\u0016h\u0001"+
		"\u0000\u0000\u0000\u0018j\u0001\u0000\u0000\u0000\u001a\u001b\u0005\u0001"+
		"\u0000\u0000\u001b\u001c\u0005\u0012\u0000\u0000\u001c\u001e\u0005\u0015"+
		"\u0000\u0000\u001d\u001f\u0003\u0002\u0001\u0000\u001e\u001d\u0001\u0000"+
		"\u0000\u0000\u001f \u0001\u0000\u0000\u0000 \u001e\u0001\u0000\u0000\u0000"+
		" !\u0001\u0000\u0000\u0000!\"\u0001\u0000\u0000\u0000\"#\u0005\u0000\u0000"+
		"\u0001#\u0001\u0001\u0000\u0000\u0000$%\u0003\u0004\u0002\u0000%&\u0005"+
		"\u0013\u0000\u0000&\'\u0003\u0006\u0003\u0000\'\u0003\u0001\u0000\u0000"+
		"\u0000(-\u0005\u0016\u0000\u0000)*\u0005\u0013\u0000\u0000*,\u0005\u0016"+
		"\u0000\u0000+)\u0001\u0000\u0000\u0000,/\u0001\u0000\u0000\u0000-+\u0001"+
		"\u0000\u0000\u0000-.\u0001\u0000\u0000\u0000.\u0005\u0001\u0000\u0000"+
		"\u0000/-\u0001\u0000\u0000\u000005\u0003\b\u0004\u000012\u0005\u0014\u0000"+
		"\u000024\u0003\b\u0004\u000031\u0001\u0000\u0000\u000047\u0001\u0000\u0000"+
		"\u000053\u0001\u0000\u0000\u000056\u0001\u0000\u0000\u00006\u0007\u0001"+
		"\u0000\u0000\u000075\u0001\u0000\u0000\u00008?\u0003\n\u0005\u00009?\u0003"+
		"\f\u0006\u0000:?\u0003\u0012\t\u0000;?\u0003\u0014\n\u0000<?\u0003\u0010"+
		"\b\u0000=?\u0003\u000e\u0007\u0000>8\u0001\u0000\u0000\u0000>9\u0001\u0000"+
		"\u0000\u0000>:\u0001\u0000\u0000\u0000>;\u0001\u0000\u0000\u0000><\u0001"+
		"\u0000\u0000\u0000>=\u0001\u0000\u0000\u0000?\t\u0001\u0000\u0000\u0000"+
		"@A\u0005\u0002\u0000\u0000AB\u0005\u0007\u0000\u0000BC\u0005\u0015\u0000"+
		"\u0000CD\u0005\u0010\u0000\u0000DE\u0005\u0007\u0000\u0000EF\u0005\u0015"+
		"\u0000\u0000F\u000b\u0001\u0000\u0000\u0000GH\u0005\u0003\u0000\u0000"+
		"HI\u0005\u0016\u0000\u0000IJ\u0003\u0018\f\u0000JK\u0005\u0016\u0000\u0000"+
		"KL\u0005\u000f\u0000\u0000LM\u0005\u0007\u0000\u0000MN\u0005\u0015\u0000"+
		"\u0000N\r\u0001\u0000\u0000\u0000OP\u0005\u000e\u0000\u0000PQ\u0003\u0016"+
		"\u000b\u0000QR\u0005\u0011\u0000\u0000RS\u0003\u0010\b\u0000S\u000f\u0001"+
		"\u0000\u0000\u0000TU\u0005\u0004\u0000\u0000UV\u0005\u0016\u0000\u0000"+
		"VW\u0005\t\u0000\u0000W[\u0005\u0016\u0000\u0000XY\u0005\u000f\u0000\u0000"+
		"YZ\u0005\u0007\u0000\u0000Z\\\u0005\u0015\u0000\u0000[X\u0001\u0000\u0000"+
		"\u0000[\\\u0001\u0000\u0000\u0000\\`\u0001\u0000\u0000\u0000]^\u0005\u000e"+
		"\u0000\u0000^_\u0005\n\u0000\u0000_a\u0005\u0016\u0000\u0000`]\u0001\u0000"+
		"\u0000\u0000`a\u0001\u0000\u0000\u0000a\u0011\u0001\u0000\u0000\u0000"+
		"bc\u0005\u0005\u0000\u0000cd\u0005\u0015\u0000\u0000d\u0013\u0001\u0000"+
		"\u0000\u0000ef\u0005\u0006\u0000\u0000fg\u0003\u0004\u0002\u0000g\u0015"+
		"\u0001\u0000\u0000\u0000hi\u0007\u0000\u0000\u0000i\u0017\u0001\u0000"+
		"\u0000\u0000jk\u0007\u0001\u0000\u0000k\u0019\u0001\u0000\u0000\u0000"+
		"\u0006 -5>[`";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}