// Generated from /Users/szymongruszczynski/SEM5/JFK/assemblerInterpeter/simplifiedAssemblerInterpreter/src/main/java/simplifiedAssembler.g4 by ANTLR 4.7.2
package grammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class simplifiedAssemblerParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INT_RULE=1, PUSH=2, MOV=3, XOR=4, PLUS=5, MINUS=6, DIGIT=7, SEPARATOR=8, 
		MULTIPY=9, L_BRACKET=10, P_BRACKET=11, REGISTER=12, EOL=13, WS=14;
	public static final int
		RULE_parser_rule = 0, RULE_push_rule = 1, RULE_mov_rule = 2, RULE_xor_rule = 3, 
		RULE_exp = 4, RULE_term = 5, RULE_factor = 6, RULE_value = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"parser_rule", "push_rule", "mov_rule", "xor_rule", "exp", "term", "factor", 
			"value"
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

	@Override
	public String getGrammarFileName() { return "simplifiedAssembler.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public simplifiedAssemblerParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class Parser_ruleContext extends ParserRuleContext {
		public TerminalNode EOL() { return getToken(simplifiedAssemblerParser.EOL, 0); }
		public TerminalNode INT_RULE() { return getToken(simplifiedAssemblerParser.INT_RULE, 0); }
		public Push_ruleContext push_rule() {
			return getRuleContext(Push_ruleContext.class,0);
		}
		public Mov_ruleContext mov_rule() {
			return getRuleContext(Mov_ruleContext.class,0);
		}
		public Xor_ruleContext xor_rule() {
			return getRuleContext(Xor_ruleContext.class,0);
		}
		public Parser_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parser_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simplifiedAssemblerListener ) ((simplifiedAssemblerListener)listener).enterParser_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simplifiedAssemblerListener ) ((simplifiedAssemblerListener)listener).exitParser_rule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simplifiedAssemblerVisitor ) return ((simplifiedAssemblerVisitor<? extends T>)visitor).visitParser_rule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parser_ruleContext parser_rule() throws RecognitionException {
		Parser_ruleContext _localctx = new Parser_ruleContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_parser_rule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_RULE:
				{
				setState(16);
				match(INT_RULE);
				}
				break;
			case PUSH:
				{
				setState(17);
				push_rule();
				}
				break;
			case MOV:
				{
				setState(18);
				mov_rule();
				}
				break;
			case XOR:
				{
				setState(19);
				xor_rule();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(22);
			match(EOL);
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

	public static class Push_ruleContext extends ParserRuleContext {
		public TerminalNode PUSH() { return getToken(simplifiedAssemblerParser.PUSH, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Push_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_push_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simplifiedAssemblerListener ) ((simplifiedAssemblerListener)listener).enterPush_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simplifiedAssemblerListener ) ((simplifiedAssemblerListener)listener).exitPush_rule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simplifiedAssemblerVisitor ) return ((simplifiedAssemblerVisitor<? extends T>)visitor).visitPush_rule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Push_ruleContext push_rule() throws RecognitionException {
		Push_ruleContext _localctx = new Push_ruleContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_push_rule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			match(PUSH);
			setState(25);
			exp(0);
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

	public static class Mov_ruleContext extends ParserRuleContext {
		public TerminalNode MOV() { return getToken(simplifiedAssemblerParser.MOV, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode SEPARATOR() { return getToken(simplifiedAssemblerParser.SEPARATOR, 0); }
		public TerminalNode REGISTER() { return getToken(simplifiedAssemblerParser.REGISTER, 0); }
		public Mov_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mov_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simplifiedAssemblerListener ) ((simplifiedAssemblerListener)listener).enterMov_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simplifiedAssemblerListener ) ((simplifiedAssemblerListener)listener).exitMov_rule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simplifiedAssemblerVisitor ) return ((simplifiedAssemblerVisitor<? extends T>)visitor).visitMov_rule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Mov_ruleContext mov_rule() throws RecognitionException {
		Mov_ruleContext _localctx = new Mov_ruleContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_mov_rule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			match(MOV);
			setState(28);
			exp(0);
			setState(29);
			match(SEPARATOR);
			setState(30);
			match(REGISTER);
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

	public static class Xor_ruleContext extends ParserRuleContext {
		public TerminalNode XOR() { return getToken(simplifiedAssemblerParser.XOR, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode SEPARATOR() { return getToken(simplifiedAssemblerParser.SEPARATOR, 0); }
		public TerminalNode REGISTER() { return getToken(simplifiedAssemblerParser.REGISTER, 0); }
		public Xor_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xor_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simplifiedAssemblerListener ) ((simplifiedAssemblerListener)listener).enterXor_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simplifiedAssemblerListener ) ((simplifiedAssemblerListener)listener).exitXor_rule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simplifiedAssemblerVisitor ) return ((simplifiedAssemblerVisitor<? extends T>)visitor).visitXor_rule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Xor_ruleContext xor_rule() throws RecognitionException {
		Xor_ruleContext _localctx = new Xor_ruleContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_xor_rule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			match(XOR);
			setState(33);
			exp(0);
			setState(34);
			match(SEPARATOR);
			setState(35);
			match(REGISTER);
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

	public static class ExpContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(simplifiedAssemblerParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(simplifiedAssemblerParser.MINUS, 0); }
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simplifiedAssemblerListener ) ((simplifiedAssemblerListener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simplifiedAssemblerListener ) ((simplifiedAssemblerListener)listener).exitExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simplifiedAssemblerVisitor ) return ((simplifiedAssemblerVisitor<? extends T>)visitor).visitExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		return exp(0);
	}

	private ExpContext exp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpContext _localctx = new ExpContext(_ctx, _parentState);
		ExpContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_exp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(38);
			term(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(48);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(46);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(40);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(41);
						match(PLUS);
						setState(42);
						term(0);
						}
						break;
					case 2:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(43);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(44);
						match(MINUS);
						setState(45);
						term(0);
						}
						break;
					}
					} 
				}
				setState(50);
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
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class TermContext extends ParserRuleContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode MULTIPY() { return getToken(simplifiedAssemblerParser.MULTIPY, 0); }
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simplifiedAssemblerListener ) ((simplifiedAssemblerListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simplifiedAssemblerListener ) ((simplifiedAssemblerListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simplifiedAssemblerVisitor ) return ((simplifiedAssemblerVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		return term(0);
	}

	private TermContext term(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TermContext _localctx = new TermContext(_ctx, _parentState);
		TermContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_term, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(52);
			factor();
			}
			_ctx.stop = _input.LT(-1);
			setState(59);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TermContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_term);
					setState(54);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(55);
					match(MULTIPY);
					setState(56);
					factor();
					}
					} 
				}
				setState(61);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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

	public static class FactorContext extends ParserRuleContext {
		public TerminalNode L_BRACKET() { return getToken(simplifiedAssemblerParser.L_BRACKET, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode P_BRACKET() { return getToken(simplifiedAssemblerParser.P_BRACKET, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simplifiedAssemblerListener ) ((simplifiedAssemblerListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simplifiedAssemblerListener ) ((simplifiedAssemblerListener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simplifiedAssemblerVisitor ) return ((simplifiedAssemblerVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_factor);
		try {
			setState(67);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case L_BRACKET:
				enterOuterAlt(_localctx, 1);
				{
				setState(62);
				match(L_BRACKET);
				setState(63);
				exp(0);
				setState(64);
				match(P_BRACKET);
				}
				break;
			case DIGIT:
			case REGISTER:
				enterOuterAlt(_localctx, 2);
				{
				setState(66);
				value();
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

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode DIGIT() { return getToken(simplifiedAssemblerParser.DIGIT, 0); }
		public TerminalNode REGISTER() { return getToken(simplifiedAssemblerParser.REGISTER, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simplifiedAssemblerListener ) ((simplifiedAssemblerListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simplifiedAssemblerListener ) ((simplifiedAssemblerListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simplifiedAssemblerVisitor ) return ((simplifiedAssemblerVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			_la = _input.LA(1);
			if ( !(_la==DIGIT || _la==REGISTER) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 4:
			return exp_sempred((ExpContext)_localctx, predIndex);
		case 5:
			return term_sempred((TermContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean term_sempred(TermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\20J\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\2\3\2\5\2"+
		"\27\n\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\61\n\6\f\6\16\6\64\13\6\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\7\7<\n\7\f\7\16\7?\13\7\3\b\3\b\3\b\3\b\3\b\5\bF\n\b"+
		"\3\t\3\t\3\t\2\4\n\f\n\2\4\6\b\n\f\16\20\2\3\4\2\t\t\16\16\2H\2\26\3\2"+
		"\2\2\4\32\3\2\2\2\6\35\3\2\2\2\b\"\3\2\2\2\n\'\3\2\2\2\f\65\3\2\2\2\16"+
		"E\3\2\2\2\20G\3\2\2\2\22\27\7\3\2\2\23\27\5\4\3\2\24\27\5\6\4\2\25\27"+
		"\5\b\5\2\26\22\3\2\2\2\26\23\3\2\2\2\26\24\3\2\2\2\26\25\3\2\2\2\27\30"+
		"\3\2\2\2\30\31\7\17\2\2\31\3\3\2\2\2\32\33\7\4\2\2\33\34\5\n\6\2\34\5"+
		"\3\2\2\2\35\36\7\5\2\2\36\37\5\n\6\2\37 \7\n\2\2 !\7\16\2\2!\7\3\2\2\2"+
		"\"#\7\6\2\2#$\5\n\6\2$%\7\n\2\2%&\7\16\2\2&\t\3\2\2\2\'(\b\6\1\2()\5\f"+
		"\7\2)\62\3\2\2\2*+\f\5\2\2+,\7\7\2\2,\61\5\f\7\2-.\f\4\2\2./\7\b\2\2/"+
		"\61\5\f\7\2\60*\3\2\2\2\60-\3\2\2\2\61\64\3\2\2\2\62\60\3\2\2\2\62\63"+
		"\3\2\2\2\63\13\3\2\2\2\64\62\3\2\2\2\65\66\b\7\1\2\66\67\5\16\b\2\67="+
		"\3\2\2\289\f\4\2\29:\7\13\2\2:<\5\16\b\2;8\3\2\2\2<?\3\2\2\2=;\3\2\2\2"+
		"=>\3\2\2\2>\r\3\2\2\2?=\3\2\2\2@A\7\f\2\2AB\5\n\6\2BC\7\r\2\2CF\3\2\2"+
		"\2DF\5\20\t\2E@\3\2\2\2ED\3\2\2\2F\17\3\2\2\2GH\t\2\2\2H\21\3\2\2\2\7"+
		"\26\60\62=E";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}