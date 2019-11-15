// Generated from /Users/szymongruszczynski/SEM5/JFK/assemblerInterpeter/simplifiedAssemblerInterpreter/src/main/java/simplifiedAssembler.g4 by ANTLR 4.7.2
package grammar;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class simplifiedAssemblerLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INT_RULE=1, PUSH=2, MOV=3, XOR=4, PLUS=5, MINUS=6, DIGIT=7, SEPARATOR=8, 
		MULTIPY=9, L_BRACKET=10, P_BRACKET=11, REGISTER=12, WS=13;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"INT_RULE", "PUSH", "MOV", "XOR", "PLUS", "MINUS", "DIGIT", "SEPARATOR", 
			"MULTIPY", "L_BRACKET", "P_BRACKET", "REGISTER", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, "'+'", "'-'", null, "','", "'*'", "'('", 
			"')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INT_RULE", "PUSH", "MOV", "XOR", "PLUS", "MINUS", "DIGIT", "SEPARATOR", 
			"MULTIPY", "L_BRACKET", "P_BRACKET", "REGISTER", "WS"
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


	public simplifiedAssemblerLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "simplifiedAssembler.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\17\u0086\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2.\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\5\3:\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4D\n\4\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\5\5N\n\5\3\6\3\6\3\7\3\7\3\b\6\bU\n\b\r\b\16\bV\3"+
		"\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\5\r\u0081\n\r\3\16\3\16\3\16\3\16\2\2\17\3\3\5\4"+
		"\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\3\2\4\3\2\62;"+
		"\4\2\13\13\"\"\2\u0091\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2"+
		"\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\3-\3\2\2\2\59\3\2\2\2"+
		"\7C\3\2\2\2\tM\3\2\2\2\13O\3\2\2\2\rQ\3\2\2\2\17T\3\2\2\2\21X\3\2\2\2"+
		"\23Z\3\2\2\2\25\\\3\2\2\2\27^\3\2\2\2\31\u0080\3\2\2\2\33\u0082\3\2\2"+
		"\2\35\36\7k\2\2\36\37\7p\2\2\37 \7v\2\2 !\7\"\2\2!\"\7\62\2\2\"#\7z\2"+
		"\2#$\7:\2\2$.\7\62\2\2%&\7K\2\2&\'\7P\2\2\'(\7V\2\2()\7\"\2\2)*\7\62\2"+
		"\2*+\7z\2\2+,\7:\2\2,.\7\62\2\2-\35\3\2\2\2-%\3\2\2\2.\4\3\2\2\2/\60\7"+
		"r\2\2\60\61\7w\2\2\61\62\7u\2\2\62\63\7j\2\2\63:\7\"\2\2\64\65\7R\2\2"+
		"\65\66\7W\2\2\66\67\7U\2\2\678\7J\2\28:\7\"\2\29/\3\2\2\29\64\3\2\2\2"+
		":\6\3\2\2\2;<\7o\2\2<=\7q\2\2=>\7x\2\2>D\7\"\2\2?@\7O\2\2@A\7Q\2\2AB\7"+
		"X\2\2BD\7\"\2\2C;\3\2\2\2C?\3\2\2\2D\b\3\2\2\2EF\7z\2\2FG\7q\2\2GH\7t"+
		"\2\2HN\7\"\2\2IJ\7Z\2\2JK\7Q\2\2KL\7T\2\2LN\7\"\2\2ME\3\2\2\2MI\3\2\2"+
		"\2N\n\3\2\2\2OP\7-\2\2P\f\3\2\2\2QR\7/\2\2R\16\3\2\2\2SU\t\2\2\2TS\3\2"+
		"\2\2UV\3\2\2\2VT\3\2\2\2VW\3\2\2\2W\20\3\2\2\2XY\7.\2\2Y\22\3\2\2\2Z["+
		"\7,\2\2[\24\3\2\2\2\\]\7*\2\2]\26\3\2\2\2^_\7+\2\2_\30\3\2\2\2`a\7\'\2"+
		"\2ab\7g\2\2bc\7c\2\2c\u0081\7z\2\2de\7\'\2\2ef\7g\2\2fg\7d\2\2g\u0081"+
		"\7z\2\2hi\7\'\2\2ij\7g\2\2jk\7e\2\2k\u0081\7z\2\2lm\7\'\2\2mn\7g\2\2n"+
		"o\7f\2\2o\u0081\7z\2\2pq\7\'\2\2qr\7G\2\2rs\7C\2\2s\u0081\7Z\2\2tu\7\'"+
		"\2\2uv\7G\2\2vw\7D\2\2w\u0081\7Z\2\2xy\7\'\2\2yz\7G\2\2z{\7E\2\2{\u0081"+
		"\7Z\2\2|}\7\'\2\2}~\7G\2\2~\177\7F\2\2\177\u0081\7Z\2\2\u0080`\3\2\2\2"+
		"\u0080d\3\2\2\2\u0080h\3\2\2\2\u0080l\3\2\2\2\u0080p\3\2\2\2\u0080t\3"+
		"\2\2\2\u0080x\3\2\2\2\u0080|\3\2\2\2\u0081\32\3\2\2\2\u0082\u0083\t\3"+
		"\2\2\u0083\u0084\3\2\2\2\u0084\u0085\b\16\2\2\u0085\34\3\2\2\2\t\2-9C"+
		"MV\u0080\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}