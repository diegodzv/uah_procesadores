// Generated from c:/Users/diego/DIEGO/UAH/Curso 2025-2026/1 Cuatrimestre/PDL/Laboratorio/uah_procesadores/PL2- Gramáticas y Generadores Automáticos/src/IKEA/grammar/IkeaLexer.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class IkeaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ITEM=1, UNIR=2, PONER=3, ATORNILLAR=4, GIRAR=5, REPETIR=6, PIEZA=7, ESPIGA=8, 
		TORNILLO=9, TUERCA=10, HERRAJE=11, DESTORNILLADOR=12, MARTILLO=13, CON=14, 
		EN=15, Y=16, COMMA=17, COLON=18, DOT=19, SEMI=20, IDENT=21, INT=22, WS=23;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"ITEM", "UNIR", "PONER", "ATORNILLAR", "GIRAR", "REPETIR", "PIEZA", "ESPIGA", 
			"TORNILLO", "TUERCA", "HERRAJE", "DESTORNILLADOR", "MARTILLO", "CON", 
			"EN", "Y", "COMMA", "COLON", "DOT", "SEMI", "IDENT", "INT", "WS"
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


	public IkeaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "IkeaLexer.g4"; }

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
		"\u0004\u0000\u0017\u00b9\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001"+
		"\u0012\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0005\u0014\u00a9"+
		"\b\u0014\n\u0014\f\u0014\u00ac\t\u0014\u0001\u0015\u0004\u0015\u00af\b"+
		"\u0015\u000b\u0015\f\u0015\u00b0\u0001\u0016\u0004\u0016\u00b4\b\u0016"+
		"\u000b\u0016\f\u0016\u00b5\u0001\u0016\u0001\u0016\u0000\u0000\u0017\u0001"+
		"\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007"+
		"\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d"+
		"\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017\u0001"+
		"\u0000\u0004\u0002\u0000AZ__\u0003\u000009AZ__\u0001\u000009\u0003\u0000"+
		"\t\n\r\r  \u00bb\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001"+
		"\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001"+
		"\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000"+
		"\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000"+
		"\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000"+
		"\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000"+
		"\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000"+
		"\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000"+
		"\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000"+
		"%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001"+
		"\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000"+
		"\u0000\u0001/\u0001\u0000\u0000\u0000\u00034\u0001\u0000\u0000\u0000\u0005"+
		"9\u0001\u0000\u0000\u0000\u0007?\u0001\u0000\u0000\u0000\tJ\u0001\u0000"+
		"\u0000\u0000\u000bP\u0001\u0000\u0000\u0000\rX\u0001\u0000\u0000\u0000"+
		"\u000f^\u0001\u0000\u0000\u0000\u0011e\u0001\u0000\u0000\u0000\u0013n"+
		"\u0001\u0000\u0000\u0000\u0015u\u0001\u0000\u0000\u0000\u0017}\u0001\u0000"+
		"\u0000\u0000\u0019\u008c\u0001\u0000\u0000\u0000\u001b\u0095\u0001\u0000"+
		"\u0000\u0000\u001d\u0099\u0001\u0000\u0000\u0000\u001f\u009c\u0001\u0000"+
		"\u0000\u0000!\u009e\u0001\u0000\u0000\u0000#\u00a0\u0001\u0000\u0000\u0000"+
		"%\u00a2\u0001\u0000\u0000\u0000\'\u00a4\u0001\u0000\u0000\u0000)\u00a6"+
		"\u0001\u0000\u0000\u0000+\u00ae\u0001\u0000\u0000\u0000-\u00b3\u0001\u0000"+
		"\u0000\u0000/0\u0005I\u0000\u000001\u0005T\u0000\u000012\u0005E\u0000"+
		"\u000023\u0005M\u0000\u00003\u0002\u0001\u0000\u0000\u000045\u0005U\u0000"+
		"\u000056\u0005N\u0000\u000067\u0005I\u0000\u000078\u0005R\u0000\u0000"+
		"8\u0004\u0001\u0000\u0000\u00009:\u0005P\u0000\u0000:;\u0005O\u0000\u0000"+
		";<\u0005N\u0000\u0000<=\u0005E\u0000\u0000=>\u0005R\u0000\u0000>\u0006"+
		"\u0001\u0000\u0000\u0000?@\u0005A\u0000\u0000@A\u0005T\u0000\u0000AB\u0005"+
		"O\u0000\u0000BC\u0005R\u0000\u0000CD\u0005N\u0000\u0000DE\u0005I\u0000"+
		"\u0000EF\u0005L\u0000\u0000FG\u0005L\u0000\u0000GH\u0005A\u0000\u0000"+
		"HI\u0005R\u0000\u0000I\b\u0001\u0000\u0000\u0000JK\u0005G\u0000\u0000"+
		"KL\u0005I\u0000\u0000LM\u0005R\u0000\u0000MN\u0005A\u0000\u0000NO\u0005"+
		"R\u0000\u0000O\n\u0001\u0000\u0000\u0000PQ\u0005R\u0000\u0000QR\u0005"+
		"E\u0000\u0000RS\u0005P\u0000\u0000ST\u0005E\u0000\u0000TU\u0005T\u0000"+
		"\u0000UV\u0005I\u0000\u0000VW\u0005R\u0000\u0000W\f\u0001\u0000\u0000"+
		"\u0000XY\u0005P\u0000\u0000YZ\u0005I\u0000\u0000Z[\u0005E\u0000\u0000"+
		"[\\\u0005Z\u0000\u0000\\]\u0005A\u0000\u0000]\u000e\u0001\u0000\u0000"+
		"\u0000^_\u0005E\u0000\u0000_`\u0005S\u0000\u0000`a\u0005P\u0000\u0000"+
		"ab\u0005I\u0000\u0000bc\u0005G\u0000\u0000cd\u0005A\u0000\u0000d\u0010"+
		"\u0001\u0000\u0000\u0000ef\u0005T\u0000\u0000fg\u0005O\u0000\u0000gh\u0005"+
		"R\u0000\u0000hi\u0005N\u0000\u0000ij\u0005I\u0000\u0000jk\u0005L\u0000"+
		"\u0000kl\u0005L\u0000\u0000lm\u0005O\u0000\u0000m\u0012\u0001\u0000\u0000"+
		"\u0000no\u0005T\u0000\u0000op\u0005U\u0000\u0000pq\u0005E\u0000\u0000"+
		"qr\u0005R\u0000\u0000rs\u0005C\u0000\u0000st\u0005A\u0000\u0000t\u0014"+
		"\u0001\u0000\u0000\u0000uv\u0005H\u0000\u0000vw\u0005E\u0000\u0000wx\u0005"+
		"R\u0000\u0000xy\u0005R\u0000\u0000yz\u0005A\u0000\u0000z{\u0005J\u0000"+
		"\u0000{|\u0005E\u0000\u0000|\u0016\u0001\u0000\u0000\u0000}~\u0005D\u0000"+
		"\u0000~\u007f\u0005E\u0000\u0000\u007f\u0080\u0005S\u0000\u0000\u0080"+
		"\u0081\u0005T\u0000\u0000\u0081\u0082\u0005O\u0000\u0000\u0082\u0083\u0005"+
		"R\u0000\u0000\u0083\u0084\u0005N\u0000\u0000\u0084\u0085\u0005I\u0000"+
		"\u0000\u0085\u0086\u0005L\u0000\u0000\u0086\u0087\u0005L\u0000\u0000\u0087"+
		"\u0088\u0005A\u0000\u0000\u0088\u0089\u0005D\u0000\u0000\u0089\u008a\u0005"+
		"O\u0000\u0000\u008a\u008b\u0005R\u0000\u0000\u008b\u0018\u0001\u0000\u0000"+
		"\u0000\u008c\u008d\u0005M\u0000\u0000\u008d\u008e\u0005A\u0000\u0000\u008e"+
		"\u008f\u0005R\u0000\u0000\u008f\u0090\u0005T\u0000\u0000\u0090\u0091\u0005"+
		"I\u0000\u0000\u0091\u0092\u0005L\u0000\u0000\u0092\u0093\u0005L\u0000"+
		"\u0000\u0093\u0094\u0005O\u0000\u0000\u0094\u001a\u0001\u0000\u0000\u0000"+
		"\u0095\u0096\u0005C\u0000\u0000\u0096\u0097\u0005o\u0000\u0000\u0097\u0098"+
		"\u0005n\u0000\u0000\u0098\u001c\u0001\u0000\u0000\u0000\u0099\u009a\u0005"+
		"e\u0000\u0000\u009a\u009b\u0005n\u0000\u0000\u009b\u001e\u0001\u0000\u0000"+
		"\u0000\u009c\u009d\u0005y\u0000\u0000\u009d \u0001\u0000\u0000\u0000\u009e"+
		"\u009f\u0005,\u0000\u0000\u009f\"\u0001\u0000\u0000\u0000\u00a0\u00a1"+
		"\u0005:\u0000\u0000\u00a1$\u0001\u0000\u0000\u0000\u00a2\u00a3\u0005."+
		"\u0000\u0000\u00a3&\u0001\u0000\u0000\u0000\u00a4\u00a5\u0005;\u0000\u0000"+
		"\u00a5(\u0001\u0000\u0000\u0000\u00a6\u00aa\u0007\u0000\u0000\u0000\u00a7"+
		"\u00a9\u0007\u0001\u0000\u0000\u00a8\u00a7\u0001\u0000\u0000\u0000\u00a9"+
		"\u00ac\u0001\u0000\u0000\u0000\u00aa\u00a8\u0001\u0000\u0000\u0000\u00aa"+
		"\u00ab\u0001\u0000\u0000\u0000\u00ab*\u0001\u0000\u0000\u0000\u00ac\u00aa"+
		"\u0001\u0000\u0000\u0000\u00ad\u00af\u0007\u0002\u0000\u0000\u00ae\u00ad"+
		"\u0001\u0000\u0000\u0000\u00af\u00b0\u0001\u0000\u0000\u0000\u00b0\u00ae"+
		"\u0001\u0000\u0000\u0000\u00b0\u00b1\u0001\u0000\u0000\u0000\u00b1,\u0001"+
		"\u0000\u0000\u0000\u00b2\u00b4\u0007\u0003\u0000\u0000\u00b3\u00b2\u0001"+
		"\u0000\u0000\u0000\u00b4\u00b5\u0001\u0000\u0000\u0000\u00b5\u00b3\u0001"+
		"\u0000\u0000\u0000\u00b5\u00b6\u0001\u0000\u0000\u0000\u00b6\u00b7\u0001"+
		"\u0000\u0000\u0000\u00b7\u00b8\u0006\u0016\u0000\u0000\u00b8.\u0001\u0000"+
		"\u0000\u0000\u0004\u0000\u00aa\u00b0\u00b5\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}