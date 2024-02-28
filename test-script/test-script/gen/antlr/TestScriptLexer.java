// Generated from D:/study/github/the_compiler/test-script/test-script/src/main/java/antlr/TestScript.g4 by ANTLR 4.13.1
package antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class TestScriptLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, INTEGER=23, FLOAT=24, 
		ID=25, COMMENT=26, WS=27;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "INTEGER", "FLOAT", "ID", 
			"COMMENT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'*'", "'/'", "'+'", "'-'", "'=='", "'!='", "'>'", "'<'", 
			"'if'", "'('", "')'", "'{'", "'}'", "'else'", "'for'", "';'", "'while'", 
			"'do'", "'print'", "'def'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, "INTEGER", 
			"FLOAT", "ID", "COMMENT", "WS"
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


	public TestScriptLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "TestScript.g4"; }

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
		"\u0004\u0000\u001b\u00a0\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001"+
		"\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0016"+
		"\u0004\u0016x\b\u0016\u000b\u0016\f\u0016y\u0001\u0017\u0004\u0017}\b"+
		"\u0017\u000b\u0017\f\u0017~\u0001\u0017\u0001\u0017\u0004\u0017\u0083"+
		"\b\u0017\u000b\u0017\f\u0017\u0084\u0001\u0018\u0001\u0018\u0005\u0018"+
		"\u0089\b\u0018\n\u0018\f\u0018\u008c\t\u0018\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0005\u0019\u0092\b\u0019\n\u0019\f\u0019\u0095\t\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0004\u001a\u009b\b\u001a"+
		"\u000b\u001a\f\u001a\u009c\u0001\u001a\u0001\u001a\u0001\u0093\u0000\u001b"+
		"\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r"+
		"\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e"+
		"\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017"+
		"/\u00181\u00193\u001a5\u001b\u0001\u0000\u0004\u0001\u000009\u0003\u0000"+
		"AZ__az\u0004\u000009AZ__az\u0003\u0000\t\n\r\r  \u00a5\u0000\u0001\u0001"+
		"\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001"+
		"\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000"+
		"\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000"+
		"\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000"+
		"\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000"+
		"\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000"+
		"\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000"+
		"\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000"+
		"\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'"+
		"\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000"+
		"\u0000\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000"+
		"\u00001\u0001\u0000\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u00005"+
		"\u0001\u0000\u0000\u0000\u00017\u0001\u0000\u0000\u0000\u00039\u0001\u0000"+
		"\u0000\u0000\u0005;\u0001\u0000\u0000\u0000\u0007=\u0001\u0000\u0000\u0000"+
		"\t?\u0001\u0000\u0000\u0000\u000bA\u0001\u0000\u0000\u0000\rD\u0001\u0000"+
		"\u0000\u0000\u000fG\u0001\u0000\u0000\u0000\u0011I\u0001\u0000\u0000\u0000"+
		"\u0013K\u0001\u0000\u0000\u0000\u0015N\u0001\u0000\u0000\u0000\u0017P"+
		"\u0001\u0000\u0000\u0000\u0019R\u0001\u0000\u0000\u0000\u001bT\u0001\u0000"+
		"\u0000\u0000\u001dV\u0001\u0000\u0000\u0000\u001f[\u0001\u0000\u0000\u0000"+
		"!_\u0001\u0000\u0000\u0000#a\u0001\u0000\u0000\u0000%g\u0001\u0000\u0000"+
		"\u0000\'j\u0001\u0000\u0000\u0000)p\u0001\u0000\u0000\u0000+t\u0001\u0000"+
		"\u0000\u0000-w\u0001\u0000\u0000\u0000/|\u0001\u0000\u0000\u00001\u0086"+
		"\u0001\u0000\u0000\u00003\u008d\u0001\u0000\u0000\u00005\u009a\u0001\u0000"+
		"\u0000\u000078\u0005=\u0000\u00008\u0002\u0001\u0000\u0000\u00009:\u0005"+
		"*\u0000\u0000:\u0004\u0001\u0000\u0000\u0000;<\u0005/\u0000\u0000<\u0006"+
		"\u0001\u0000\u0000\u0000=>\u0005+\u0000\u0000>\b\u0001\u0000\u0000\u0000"+
		"?@\u0005-\u0000\u0000@\n\u0001\u0000\u0000\u0000AB\u0005=\u0000\u0000"+
		"BC\u0005=\u0000\u0000C\f\u0001\u0000\u0000\u0000DE\u0005!\u0000\u0000"+
		"EF\u0005=\u0000\u0000F\u000e\u0001\u0000\u0000\u0000GH\u0005>\u0000\u0000"+
		"H\u0010\u0001\u0000\u0000\u0000IJ\u0005<\u0000\u0000J\u0012\u0001\u0000"+
		"\u0000\u0000KL\u0005i\u0000\u0000LM\u0005f\u0000\u0000M\u0014\u0001\u0000"+
		"\u0000\u0000NO\u0005(\u0000\u0000O\u0016\u0001\u0000\u0000\u0000PQ\u0005"+
		")\u0000\u0000Q\u0018\u0001\u0000\u0000\u0000RS\u0005{\u0000\u0000S\u001a"+
		"\u0001\u0000\u0000\u0000TU\u0005}\u0000\u0000U\u001c\u0001\u0000\u0000"+
		"\u0000VW\u0005e\u0000\u0000WX\u0005l\u0000\u0000XY\u0005s\u0000\u0000"+
		"YZ\u0005e\u0000\u0000Z\u001e\u0001\u0000\u0000\u0000[\\\u0005f\u0000\u0000"+
		"\\]\u0005o\u0000\u0000]^\u0005r\u0000\u0000^ \u0001\u0000\u0000\u0000"+
		"_`\u0005;\u0000\u0000`\"\u0001\u0000\u0000\u0000ab\u0005w\u0000\u0000"+
		"bc\u0005h\u0000\u0000cd\u0005i\u0000\u0000de\u0005l\u0000\u0000ef\u0005"+
		"e\u0000\u0000f$\u0001\u0000\u0000\u0000gh\u0005d\u0000\u0000hi\u0005o"+
		"\u0000\u0000i&\u0001\u0000\u0000\u0000jk\u0005p\u0000\u0000kl\u0005r\u0000"+
		"\u0000lm\u0005i\u0000\u0000mn\u0005n\u0000\u0000no\u0005t\u0000\u0000"+
		"o(\u0001\u0000\u0000\u0000pq\u0005d\u0000\u0000qr\u0005e\u0000\u0000r"+
		"s\u0005f\u0000\u0000s*\u0001\u0000\u0000\u0000tu\u0005,\u0000\u0000u,"+
		"\u0001\u0000\u0000\u0000vx\u0007\u0000\u0000\u0000wv\u0001\u0000\u0000"+
		"\u0000xy\u0001\u0000\u0000\u0000yw\u0001\u0000\u0000\u0000yz\u0001\u0000"+
		"\u0000\u0000z.\u0001\u0000\u0000\u0000{}\u0007\u0000\u0000\u0000|{\u0001"+
		"\u0000\u0000\u0000}~\u0001\u0000\u0000\u0000~|\u0001\u0000\u0000\u0000"+
		"~\u007f\u0001\u0000\u0000\u0000\u007f\u0080\u0001\u0000\u0000\u0000\u0080"+
		"\u0082\u0005.\u0000\u0000\u0081\u0083\u0007\u0000\u0000\u0000\u0082\u0081"+
		"\u0001\u0000\u0000\u0000\u0083\u0084\u0001\u0000\u0000\u0000\u0084\u0082"+
		"\u0001\u0000\u0000\u0000\u0084\u0085\u0001\u0000\u0000\u0000\u00850\u0001"+
		"\u0000\u0000\u0000\u0086\u008a\u0007\u0001\u0000\u0000\u0087\u0089\u0007"+
		"\u0002\u0000\u0000\u0088\u0087\u0001\u0000\u0000\u0000\u0089\u008c\u0001"+
		"\u0000\u0000\u0000\u008a\u0088\u0001\u0000\u0000\u0000\u008a\u008b\u0001"+
		"\u0000\u0000\u0000\u008b2\u0001\u0000\u0000\u0000\u008c\u008a\u0001\u0000"+
		"\u0000\u0000\u008d\u008e\u0005/\u0000\u0000\u008e\u008f\u0005*\u0000\u0000"+
		"\u008f\u0093\u0001\u0000\u0000\u0000\u0090\u0092\t\u0000\u0000\u0000\u0091"+
		"\u0090\u0001\u0000\u0000\u0000\u0092\u0095\u0001\u0000\u0000\u0000\u0093"+
		"\u0094\u0001\u0000\u0000\u0000\u0093\u0091\u0001\u0000\u0000\u0000\u0094"+
		"\u0096\u0001\u0000\u0000\u0000\u0095\u0093\u0001\u0000\u0000\u0000\u0096"+
		"\u0097\u0005*\u0000\u0000\u0097\u0098\u0005/\u0000\u0000\u00984\u0001"+
		"\u0000\u0000\u0000\u0099\u009b\u0007\u0003\u0000\u0000\u009a\u0099\u0001"+
		"\u0000\u0000\u0000\u009b\u009c\u0001\u0000\u0000\u0000\u009c\u009a\u0001"+
		"\u0000\u0000\u0000\u009c\u009d\u0001\u0000\u0000\u0000\u009d\u009e\u0001"+
		"\u0000\u0000\u0000\u009e\u009f\u0006\u001a\u0000\u0000\u009f6\u0001\u0000"+
		"\u0000\u0000\u0007\u0000y~\u0084\u008a\u0093\u009c\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}