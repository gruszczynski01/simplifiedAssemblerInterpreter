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
		MULTIPY=9, L_BRACKET=10, P_BRACKET=11, REGISTER=12, EOL=13, WS=14;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"INT_RULE", "PUSH", "MOV", "XOR", "PLUS", "MINUS", "DIGIT", "SEPARATOR", 
			"MULTIPY", "L_BRACKET", "P_BRACKET", "REGISTER", "EOL", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, "'+'", "'-'", null, "','", "'*'", "'('", 
			"')'", null, "'\n'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INT_RULE", "PUSH", "MOV", "XOR", "PLUS", "MINUS", "DIGIT", "SEPARATOR", 
			"MULTIPY", "L_BRACKET", "P_BRACKET", "REGISTER", "EOL", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\20\u008c\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2\60\n\2\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\5\3<\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4F\n\4"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5P\n\5\3\6\3\6\3\7\3\7\3\b\6\bW\n\b"+
		"\r\b\16\bX\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0083\n\r\3\16\3\16\3\17\3\17\5\17"+
		"\u0089\n\17\3\17\3\17\2\2\20\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\20\3\2\4\3\2\62;\4\2\13\13\"\"\2\u0098\2\3\3"+
		"\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2"+
		"\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3"+
		"\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\3/\3\2\2\2\5;\3\2\2\2\7E\3\2\2\2\tO\3"+
		"\2\2\2\13Q\3\2\2\2\rS\3\2\2\2\17V\3\2\2\2\21Z\3\2\2\2\23\\\3\2\2\2\25"+
		"^\3\2\2\2\27`\3\2\2\2\31\u0082\3\2\2\2\33\u0084\3\2\2\2\35\u0088\3\2\2"+
		"\2\37 \7k\2\2 !\7p\2\2!\"\7v\2\2\"#\7\"\2\2#$\7\62\2\2$%\7z\2\2%&\7:\2"+
		"\2&\60\7\62\2\2\'(\7K\2\2()\7P\2\2)*\7V\2\2*+\7\"\2\2+,\7\62\2\2,-\7z"+
		"\2\2-.\7:\2\2.\60\7\62\2\2/\37\3\2\2\2/\'\3\2\2\2\60\4\3\2\2\2\61\62\7"+
		"r\2\2\62\63\7w\2\2\63\64\7u\2\2\64\65\7j\2\2\65<\7\"\2\2\66\67\7R\2\2"+
		"\678\7W\2\289\7U\2\29:\7J\2\2:<\7\"\2\2;\61\3\2\2\2;\66\3\2\2\2<\6\3\2"+
		"\2\2=>\7o\2\2>?\7q\2\2?@\7x\2\2@F\7\"\2\2AB\7O\2\2BC\7Q\2\2CD\7X\2\2D"+
		"F\7\"\2\2E=\3\2\2\2EA\3\2\2\2F\b\3\2\2\2GH\7z\2\2HI\7q\2\2IJ\7t\2\2JP"+
		"\7\"\2\2KL\7Z\2\2LM\7Q\2\2MN\7T\2\2NP\7\"\2\2OG\3\2\2\2OK\3\2\2\2P\n\3"+
		"\2\2\2QR\7-\2\2R\f\3\2\2\2ST\7/\2\2T\16\3\2\2\2UW\t\2\2\2VU\3\2\2\2WX"+
		"\3\2\2\2XV\3\2\2\2XY\3\2\2\2Y\20\3\2\2\2Z[\7.\2\2[\22\3\2\2\2\\]\7,\2"+
		"\2]\24\3\2\2\2^_\7*\2\2_\26\3\2\2\2`a\7+\2\2a\30\3\2\2\2bc\7\'\2\2cd\7"+
		"g\2\2de\7c\2\2e\u0083\7z\2\2fg\7\'\2\2gh\7g\2\2hi\7d\2\2i\u0083\7z\2\2"+
		"jk\7\'\2\2kl\7g\2\2lm\7e\2\2m\u0083\7z\2\2no\7\'\2\2op\7g\2\2pq\7f\2\2"+
		"q\u0083\7z\2\2rs\7\'\2\2st\7G\2\2tu\7C\2\2u\u0083\7Z\2\2vw\7\'\2\2wx\7"+
		"G\2\2xy\7D\2\2y\u0083\7Z\2\2z{\7\'\2\2{|\7G\2\2|}\7E\2\2}\u0083\7Z\2\2"+
		"~\177\7\'\2\2\177\u0080\7G\2\2\u0080\u0081\7F\2\2\u0081\u0083\7Z\2\2\u0082"+
		"b\3\2\2\2\u0082f\3\2\2\2\u0082j\3\2\2\2\u0082n\3\2\2\2\u0082r\3\2\2\2"+
		"\u0082v\3\2\2\2\u0082z\3\2\2\2\u0082~\3\2\2\2\u0083\32\3\2\2\2\u0084\u0085"+
		"\7\f\2\2\u0085\34\3\2\2\2\u0086\u0089\t\3\2\2\u0087\u0089\5\33\16\2\u0088"+
		"\u0086\3\2\2\2\u0088\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008b\b\17"+
		"\2\2\u008b\36\3\2\2\2\n\2/;EOX\u0082\u0088\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}