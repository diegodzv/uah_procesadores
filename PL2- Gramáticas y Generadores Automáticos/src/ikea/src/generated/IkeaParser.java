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
		TORNILLO=9, TUERCA=10, HERRAJE=11, DESTORNILLADOR=12, MARTILLO=13, MANO=14, 
		ARRIBA=15, ABAJO=16, LATERAL=17, CON=18, EN=19, Y=20, COMMA=21, COLON=22, 
		DOT=23, SEMI=24, INT=25, IDENT=26, WS=27;
	public static final int
		RULE_manual = 0, RULE_itemHeader = 1, RULE_step = 2, RULE_stepLabel = 3, 
		RULE_instructionList = 4, RULE_instruction = 5, RULE_unirInstr = 6, RULE_ponerInstr = 7, 
		RULE_conHerramientaAtornillarInstr = 8, RULE_atornillarInstr = 9, RULE_girarInstr = 10, 
		RULE_repetirInstr = 11, RULE_orientacion = 12, RULE_herramienta = 13, 
		RULE_tipoHerraje = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"manual", "itemHeader", "step", "stepLabel", "instructionList", "instruction", 
			"unirInstr", "ponerInstr", "conHerramientaAtornillarInstr", "atornillarInstr", 
			"girarInstr", "repetirInstr", "orientacion", "herramienta", "tipoHerraje"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "','", "':'", "'.'", 
			"';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ITEM", "UNIR", "PONER", "ATORNILLAR", "GIRAR", "REPETIR", "PIEZA", 
			"ESPIGA", "TORNILLO", "TUERCA", "HERRAJE", "DESTORNILLADOR", "MARTILLO", 
			"MANO", "ARRIBA", "ABAJO", "LATERAL", "CON", "EN", "Y", "COMMA", "COLON", 
			"DOT", "SEMI", "INT", "IDENT", "WS"
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
		public TerminalNode EOF() { return getToken(IkeaParser.EOF, 0); }
		public ItemHeaderContext itemHeader() {
			return getRuleContext(ItemHeaderContext.class,0);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IkeaParserVisitor ) return ((IkeaParserVisitor<? extends T>)visitor).visitManual(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ManualContext manual() throws RecognitionException {
		ManualContext _localctx = new ManualContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_manual);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ITEM) {
				{
				setState(30);
				itemHeader();
				}
			}

			setState(34); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(33);
				step();
				}
				}
				setState(36); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==INT );
			setState(38);
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
	public static class ItemHeaderContext extends ParserRuleContext {
		public TerminalNode ITEM() { return getToken(IkeaParser.ITEM, 0); }
		public TerminalNode COLON() { return getToken(IkeaParser.COLON, 0); }
		public TerminalNode IDENT() { return getToken(IkeaParser.IDENT, 0); }
		public ItemHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_itemHeader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IkeaParserListener ) ((IkeaParserListener)listener).enterItemHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IkeaParserListener ) ((IkeaParserListener)listener).exitItemHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IkeaParserVisitor ) return ((IkeaParserVisitor<? extends T>)visitor).visitItemHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ItemHeaderContext itemHeader() throws RecognitionException {
		ItemHeaderContext _localctx = new ItemHeaderContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_itemHeader);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			match(ITEM);
			setState(41);
			match(COLON);
			setState(42);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IkeaParserVisitor ) return ((IkeaParserVisitor<? extends T>)visitor).visitStep(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StepContext step() throws RecognitionException {
		StepContext _localctx = new StepContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_step);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			stepLabel();
			setState(45);
			match(DOT);
			setState(46);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IkeaParserVisitor ) return ((IkeaParserVisitor<? extends T>)visitor).visitStepLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StepLabelContext stepLabel() throws RecognitionException {
		StepLabelContext _localctx = new StepLabelContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_stepLabel);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(INT);
			setState(53);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(49);
					match(DOT);
					setState(50);
					match(INT);
					}
					} 
				}
				setState(55);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IkeaParserVisitor ) return ((IkeaParserVisitor<? extends T>)visitor).visitInstructionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstructionListContext instructionList() throws RecognitionException {
		InstructionListContext _localctx = new InstructionListContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_instructionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			instruction();
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI) {
				{
				{
				setState(57);
				match(SEMI);
				setState(58);
				instruction();
				}
				}
				setState(63);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IkeaParserListener ) ((IkeaParserListener)listener).enterInstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IkeaParserListener ) ((IkeaParserListener)listener).exitInstruction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IkeaParserVisitor ) return ((IkeaParserVisitor<? extends T>)visitor).visitInstruction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_instruction);
		try {
			setState(70);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(64);
				unirInstr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(65);
				ponerInstr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(66);
				girarInstr();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(67);
				repetirInstr();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(68);
				atornillarInstr();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(69);
				conHerramientaAtornillarInstr();
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IkeaParserVisitor ) return ((IkeaParserVisitor<? extends T>)visitor).visitUnirInstr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnirInstrContext unirInstr() throws RecognitionException {
		UnirInstrContext _localctx = new UnirInstrContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_unirInstr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(UNIR);
			setState(73);
			match(PIEZA);
			setState(74);
			match(IDENT);
			setState(75);
			match(Y);
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
	public static class PonerInstrContext extends ParserRuleContext {
		public TerminalNode CON() { return getToken(IkeaParser.CON, 0); }
		public HerramientaContext herramienta() {
			return getRuleContext(HerramientaContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(IkeaParser.COMMA, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IkeaParserVisitor ) return ((IkeaParserVisitor<? extends T>)visitor).visitPonerInstr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PonerInstrContext ponerInstr() throws RecognitionException {
		PonerInstrContext _localctx = new PonerInstrContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_ponerInstr);
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
			match(PONER);
			setState(83);
			match(INT);
			setState(84);
			tipoHerraje();
			setState(85);
			match(INT);
			setState(86);
			match(EN);
			setState(87);
			match(PIEZA);
			setState(88);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IkeaParserVisitor ) return ((IkeaParserVisitor<? extends T>)visitor).visitConHerramientaAtornillarInstr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConHerramientaAtornillarInstrContext conHerramientaAtornillarInstr() throws RecognitionException {
		ConHerramientaAtornillarInstrContext _localctx = new ConHerramientaAtornillarInstrContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_conHerramientaAtornillarInstr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(CON);
			setState(91);
			herramienta();
			setState(92);
			match(COMMA);
			setState(93);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IkeaParserVisitor ) return ((IkeaParserVisitor<? extends T>)visitor).visitAtornillarInstr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtornillarInstrContext atornillarInstr() throws RecognitionException {
		AtornillarInstrContext _localctx = new AtornillarInstrContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_atornillarInstr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(ATORNILLAR);
			setState(96);
			match(INT);
			setState(97);
			match(TORNILLO);
			setState(98);
			match(INT);
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EN) {
				{
				setState(99);
				match(EN);
				setState(100);
				match(PIEZA);
				setState(101);
				match(IDENT);
				}
			}

			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CON) {
				{
				setState(104);
				match(CON);
				setState(105);
				match(TUERCA);
				setState(106);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IkeaParserListener ) ((IkeaParserListener)listener).enterGirarInstr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IkeaParserListener ) ((IkeaParserListener)listener).exitGirarInstr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IkeaParserVisitor ) return ((IkeaParserVisitor<? extends T>)visitor).visitGirarInstr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GirarInstrContext girarInstr() throws RecognitionException {
		GirarInstrContext _localctx = new GirarInstrContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_girarInstr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(GIRAR);
			setState(110);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IkeaParserListener ) ((IkeaParserListener)listener).enterRepetirInstr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IkeaParserListener ) ((IkeaParserListener)listener).exitRepetirInstr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IkeaParserVisitor ) return ((IkeaParserVisitor<? extends T>)visitor).visitRepetirInstr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RepetirInstrContext repetirInstr() throws RecognitionException {
		RepetirInstrContext _localctx = new RepetirInstrContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_repetirInstr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(REPETIR);
			setState(113);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IkeaParserListener ) ((IkeaParserListener)listener).enterOrientacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IkeaParserListener ) ((IkeaParserListener)listener).exitOrientacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IkeaParserVisitor ) return ((IkeaParserVisitor<? extends T>)visitor).visitOrientacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrientacionContext orientacion() throws RecognitionException {
		OrientacionContext _localctx = new OrientacionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_orientacion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 229376L) != 0)) ) {
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
		public TerminalNode MANO() { return getToken(IkeaParser.MANO, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IkeaParserVisitor ) return ((IkeaParserVisitor<? extends T>)visitor).visitHerramienta(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HerramientaContext herramienta() throws RecognitionException {
		HerramientaContext _localctx = new HerramientaContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_herramienta);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 28672L) != 0)) ) {
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IkeaParserVisitor ) return ((IkeaParserVisitor<? extends T>)visitor).visitTipoHerraje(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoHerrajeContext tipoHerraje() throws RecognitionException {
		TipoHerrajeContext _localctx = new TipoHerrajeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_tipoHerraje);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
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
		"\u0004\u0001\u001bz\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0001\u0000\u0003\u0000"+
		" \b\u0000\u0001\u0000\u0004\u0000#\b\u0000\u000b\u0000\f\u0000$\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0005\u00034\b\u0003\n\u0003\f\u00037\t\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0005\u0004<\b\u0004\n\u0004\f\u0004?\t\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003"+
		"\u0005G\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\tg\b\t\u0001\t\u0001"+
		"\t\u0001\t\u0003\tl\b\t\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0000\u0000\u000f\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u0000\u0003\u0001\u0000\u000f\u0011\u0001"+
		"\u0000\f\u000e\u0002\u0000\b\b\n\u000bu\u0000\u001f\u0001\u0000\u0000"+
		"\u0000\u0002(\u0001\u0000\u0000\u0000\u0004,\u0001\u0000\u0000\u0000\u0006"+
		"0\u0001\u0000\u0000\u0000\b8\u0001\u0000\u0000\u0000\nF\u0001\u0000\u0000"+
		"\u0000\fH\u0001\u0000\u0000\u0000\u000eO\u0001\u0000\u0000\u0000\u0010"+
		"Z\u0001\u0000\u0000\u0000\u0012_\u0001\u0000\u0000\u0000\u0014m\u0001"+
		"\u0000\u0000\u0000\u0016p\u0001\u0000\u0000\u0000\u0018s\u0001\u0000\u0000"+
		"\u0000\u001au\u0001\u0000\u0000\u0000\u001cw\u0001\u0000\u0000\u0000\u001e"+
		" \u0003\u0002\u0001\u0000\u001f\u001e\u0001\u0000\u0000\u0000\u001f \u0001"+
		"\u0000\u0000\u0000 \"\u0001\u0000\u0000\u0000!#\u0003\u0004\u0002\u0000"+
		"\"!\u0001\u0000\u0000\u0000#$\u0001\u0000\u0000\u0000$\"\u0001\u0000\u0000"+
		"\u0000$%\u0001\u0000\u0000\u0000%&\u0001\u0000\u0000\u0000&\'\u0005\u0000"+
		"\u0000\u0001\'\u0001\u0001\u0000\u0000\u0000()\u0005\u0001\u0000\u0000"+
		")*\u0005\u0016\u0000\u0000*+\u0005\u001a\u0000\u0000+\u0003\u0001\u0000"+
		"\u0000\u0000,-\u0003\u0006\u0003\u0000-.\u0005\u0017\u0000\u0000./\u0003"+
		"\b\u0004\u0000/\u0005\u0001\u0000\u0000\u000005\u0005\u0019\u0000\u0000"+
		"12\u0005\u0017\u0000\u000024\u0005\u0019\u0000\u000031\u0001\u0000\u0000"+
		"\u000047\u0001\u0000\u0000\u000053\u0001\u0000\u0000\u000056\u0001\u0000"+
		"\u0000\u00006\u0007\u0001\u0000\u0000\u000075\u0001\u0000\u0000\u0000"+
		"8=\u0003\n\u0005\u00009:\u0005\u0018\u0000\u0000:<\u0003\n\u0005\u0000"+
		";9\u0001\u0000\u0000\u0000<?\u0001\u0000\u0000\u0000=;\u0001\u0000\u0000"+
		"\u0000=>\u0001\u0000\u0000\u0000>\t\u0001\u0000\u0000\u0000?=\u0001\u0000"+
		"\u0000\u0000@G\u0003\f\u0006\u0000AG\u0003\u000e\u0007\u0000BG\u0003\u0014"+
		"\n\u0000CG\u0003\u0016\u000b\u0000DG\u0003\u0012\t\u0000EG\u0003\u0010"+
		"\b\u0000F@\u0001\u0000\u0000\u0000FA\u0001\u0000\u0000\u0000FB\u0001\u0000"+
		"\u0000\u0000FC\u0001\u0000\u0000\u0000FD\u0001\u0000\u0000\u0000FE\u0001"+
		"\u0000\u0000\u0000G\u000b\u0001\u0000\u0000\u0000HI\u0005\u0002\u0000"+
		"\u0000IJ\u0005\u0007\u0000\u0000JK\u0005\u001a\u0000\u0000KL\u0005\u0014"+
		"\u0000\u0000LM\u0005\u0007\u0000\u0000MN\u0005\u001a\u0000\u0000N\r\u0001"+
		"\u0000\u0000\u0000OP\u0005\u0012\u0000\u0000PQ\u0003\u001a\r\u0000QR\u0005"+
		"\u0015\u0000\u0000RS\u0005\u0003\u0000\u0000ST\u0005\u0019\u0000\u0000"+
		"TU\u0003\u001c\u000e\u0000UV\u0005\u0019\u0000\u0000VW\u0005\u0013\u0000"+
		"\u0000WX\u0005\u0007\u0000\u0000XY\u0005\u001a\u0000\u0000Y\u000f\u0001"+
		"\u0000\u0000\u0000Z[\u0005\u0012\u0000\u0000[\\\u0003\u001a\r\u0000\\"+
		"]\u0005\u0015\u0000\u0000]^\u0003\u0012\t\u0000^\u0011\u0001\u0000\u0000"+
		"\u0000_`\u0005\u0004\u0000\u0000`a\u0005\u0019\u0000\u0000ab\u0005\t\u0000"+
		"\u0000bf\u0005\u0019\u0000\u0000cd\u0005\u0013\u0000\u0000de\u0005\u0007"+
		"\u0000\u0000eg\u0005\u001a\u0000\u0000fc\u0001\u0000\u0000\u0000fg\u0001"+
		"\u0000\u0000\u0000gk\u0001\u0000\u0000\u0000hi\u0005\u0012\u0000\u0000"+
		"ij\u0005\n\u0000\u0000jl\u0005\u0019\u0000\u0000kh\u0001\u0000\u0000\u0000"+
		"kl\u0001\u0000\u0000\u0000l\u0013\u0001\u0000\u0000\u0000mn\u0005\u0005"+
		"\u0000\u0000no\u0003\u0018\f\u0000o\u0015\u0001\u0000\u0000\u0000pq\u0005"+
		"\u0006\u0000\u0000qr\u0003\u0006\u0003\u0000r\u0017\u0001\u0000\u0000"+
		"\u0000st\u0007\u0000\u0000\u0000t\u0019\u0001\u0000\u0000\u0000uv\u0007"+
		"\u0001\u0000\u0000v\u001b\u0001\u0000\u0000\u0000wx\u0007\u0002\u0000"+
		"\u0000x\u001d\u0001\u0000\u0000\u0000\u0007\u001f$5=Ffk";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}