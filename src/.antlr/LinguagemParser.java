// Generated from /home/smc/Projects/repositorios/compilador-java/src/Linguagem.g4 by ANTLR 4.13.1

    import java.util.Map;
    import java.util.HashMap;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class LinguagemParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PROGRAM=1, VAR=2, PRINTLN=3, IF=4, ELSE=5, FOR=6, WHILE=7, PLUS=8, MINUS=9, 
		MULT=10, DIV=11, AND=12, OR=13, NOT=14, GT=15, LT=16, GEQ=17, LEQ=18, 
		EQ=19, NEQ=20, ASSIGN=21, BRACKET_OPEN=22, BRACKET_CLOSE=23, PAR_OPEN=24, 
		PAR_CLOSE=25, SEMICOLON=26, BOOLEAN=27, ID=28, NUMBER=29, WS=30;
	public static final int
		RULE_program = 0, RULE_sentence = 1, RULE_var_decl = 2, RULE_var_assign = 3, 
		RULE_println = 4, RULE_conditional = 5, RULE_while_loop = 6, RULE_expression = 7, 
		RULE_comparison = 8, RULE_additive = 9, RULE_multiplicative = 10, RULE_factor = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "sentence", "var_decl", "var_assign", "println", "conditional", 
			"while_loop", "expression", "comparison", "additive", "multiplicative", 
			"factor"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'program'", "'var'", "'println'", "'if'", "'else'", "'for'", "'while'", 
			"'+'", "'-'", "'*'", "'/'", "'&&'", "'||'", "'!'", "'>'", "'<'", "'>='", 
			"'<='", "'=='", "'!='", "'='", "'{'", "'}'", "'('", "')'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PROGRAM", "VAR", "PRINTLN", "IF", "ELSE", "FOR", "WHILE", "PLUS", 
			"MINUS", "MULT", "DIV", "AND", "OR", "NOT", "GT", "LT", "GEQ", "LEQ", 
			"EQ", "NEQ", "ASSIGN", "BRACKET_OPEN", "BRACKET_CLOSE", "PAR_OPEN", "PAR_CLOSE", 
			"SEMICOLON", "BOOLEAN", "ID", "NUMBER", "WS"
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
	public String getGrammarFileName() { return "Linguagem.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    Map<String, Object> symbolTable = new HashMap<String, Object>();

	public LinguagemParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode PROGRAM() { return getToken(LinguagemParser.PROGRAM, 0); }
		public TerminalNode ID() { return getToken(LinguagemParser.ID, 0); }
		public TerminalNode BRACKET_OPEN() { return getToken(LinguagemParser.BRACKET_OPEN, 0); }
		public TerminalNode BRACKET_CLOSE() { return getToken(LinguagemParser.BRACKET_CLOSE, 0); }
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			match(PROGRAM);
			setState(25);
			match(ID);
			setState(26);
			match(BRACKET_OPEN);
			setState(30);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 268435612L) != 0)) {
				{
				{
				setState(27);
				sentence();
				}
				}
				setState(32);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(33);
			match(BRACKET_CLOSE);
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
	public static class SentenceContext extends ParserRuleContext {
		public Var_declContext var_decl() {
			return getRuleContext(Var_declContext.class,0);
		}
		public Var_assignContext var_assign() {
			return getRuleContext(Var_assignContext.class,0);
		}
		public PrintlnContext println() {
			return getRuleContext(PrintlnContext.class,0);
		}
		public ConditionalContext conditional() {
			return getRuleContext(ConditionalContext.class,0);
		}
		public While_loopContext while_loop() {
			return getRuleContext(While_loopContext.class,0);
		}
		public SentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentence; }
	}

	public final SentenceContext sentence() throws RecognitionException {
		SentenceContext _localctx = new SentenceContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sentence);
		try {
			setState(40);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(35);
				var_decl();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(36);
				var_assign();
				}
				break;
			case PRINTLN:
				enterOuterAlt(_localctx, 3);
				{
				setState(37);
				println();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 4);
				{
				setState(38);
				conditional();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 5);
				{
				setState(39);
				while_loop();
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
	public static class Var_declContext extends ParserRuleContext {
		public Token ID;
		public TerminalNode VAR() { return getToken(LinguagemParser.VAR, 0); }
		public TerminalNode ID() { return getToken(LinguagemParser.ID, 0); }
		public TerminalNode SEMICOLON() { return getToken(LinguagemParser.SEMICOLON, 0); }
		public Var_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_decl; }
	}

	public final Var_declContext var_decl() throws RecognitionException {
		Var_declContext _localctx = new Var_declContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_var_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			match(VAR);
			setState(43);
			((Var_declContext)_localctx).ID = match(ID);
			setState(44);
			match(SEMICOLON);
			symbolTable.put((((Var_declContext)_localctx).ID!=null?((Var_declContext)_localctx).ID.getText():null), 0);
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
	public static class Var_assignContext extends ParserRuleContext {
		public Token ID;
		public ExpressionContext expression;
		public TerminalNode ID() { return getToken(LinguagemParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(LinguagemParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(LinguagemParser.SEMICOLON, 0); }
		public Var_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_assign; }
	}

	public final Var_assignContext var_assign() throws RecognitionException {
		Var_assignContext _localctx = new Var_assignContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_var_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			((Var_assignContext)_localctx).ID = match(ID);
			setState(48);
			match(ASSIGN);
			setState(49);
			((Var_assignContext)_localctx).expression = expression();
			setState(50);
			match(SEMICOLON);
			symbolTable.put((((Var_assignContext)_localctx).ID!=null?((Var_assignContext)_localctx).ID.getText():null), ((Var_assignContext)_localctx).expression.value);
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
	public static class PrintlnContext extends ParserRuleContext {
		public ExpressionContext expression;
		public TerminalNode PRINTLN() { return getToken(LinguagemParser.PRINTLN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(LinguagemParser.SEMICOLON, 0); }
		public PrintlnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_println; }
	}

	public final PrintlnContext println() throws RecognitionException {
		PrintlnContext _localctx = new PrintlnContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_println);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			match(PRINTLN);
			setState(54);
			((PrintlnContext)_localctx).expression = expression();
			setState(55);
			match(SEMICOLON);
			System.out.println(((PrintlnContext)_localctx).expression.value);
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
	public static class ConditionalContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(LinguagemParser.IF, 0); }
		public TerminalNode PAR_OPEN() { return getToken(LinguagemParser.PAR_OPEN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PAR_CLOSE() { return getToken(LinguagemParser.PAR_CLOSE, 0); }
		public List<TerminalNode> BRACKET_OPEN() { return getTokens(LinguagemParser.BRACKET_OPEN); }
		public TerminalNode BRACKET_OPEN(int i) {
			return getToken(LinguagemParser.BRACKET_OPEN, i);
		}
		public List<TerminalNode> BRACKET_CLOSE() { return getTokens(LinguagemParser.BRACKET_CLOSE); }
		public TerminalNode BRACKET_CLOSE(int i) {
			return getToken(LinguagemParser.BRACKET_CLOSE, i);
		}
		public TerminalNode ELSE() { return getToken(LinguagemParser.ELSE, 0); }
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public ConditionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional; }
	}

	public final ConditionalContext conditional() throws RecognitionException {
		ConditionalContext _localctx = new ConditionalContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_conditional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(IF);
			setState(59);
			match(PAR_OPEN);
			setState(60);
			expression();
			setState(61);
			match(PAR_CLOSE);
			setState(62);
			match(BRACKET_OPEN);
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 268435612L) != 0)) {
				{
				{
				setState(63);
				sentence();
				}
				}
				setState(68);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(69);
			match(BRACKET_CLOSE);
			setState(70);
			match(ELSE);
			setState(71);
			match(BRACKET_OPEN);
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 268435612L) != 0)) {
				{
				{
				setState(72);
				sentence();
				}
				}
				setState(77);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(78);
			match(BRACKET_CLOSE);
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
	public static class While_loopContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(LinguagemParser.WHILE, 0); }
		public TerminalNode PAR_OPEN() { return getToken(LinguagemParser.PAR_OPEN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PAR_CLOSE() { return getToken(LinguagemParser.PAR_CLOSE, 0); }
		public TerminalNode BRACKET_OPEN() { return getToken(LinguagemParser.BRACKET_OPEN, 0); }
		public TerminalNode BRACKET_CLOSE() { return getToken(LinguagemParser.BRACKET_CLOSE, 0); }
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public While_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_loop; }
	}

	public final While_loopContext while_loop() throws RecognitionException {
		While_loopContext _localctx = new While_loopContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_while_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(WHILE);
			setState(81);
			match(PAR_OPEN);
			setState(82);
			expression();
			setState(83);
			match(PAR_CLOSE);
			setState(84);
			match(BRACKET_OPEN);
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 268435612L) != 0)) {
				{
				{
				setState(85);
				sentence();
				}
				}
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(91);
			match(BRACKET_CLOSE);
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
	public static class ExpressionContext extends ParserRuleContext {
		public Object value;
		public ComparisonContext t1;
		public ComparisonContext t2;
		public List<ComparisonContext> comparison() {
			return getRuleContexts(ComparisonContext.class);
		}
		public ComparisonContext comparison(int i) {
			return getRuleContext(ComparisonContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(LinguagemParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(LinguagemParser.OR, i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			((ExpressionContext)_localctx).t1 = comparison();
			((ExpressionContext)_localctx).value =  ((ExpressionContext)_localctx).t1.value;
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(95);
				match(OR);
				setState(96);
				((ExpressionContext)_localctx).t2 = comparison();
				((ExpressionContext)_localctx).value =  (boolean)_localctx.value || (boolean)((ExpressionContext)_localctx).t2.value;
				}
				}
				setState(103);
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
	public static class ComparisonContext extends ParserRuleContext {
		public Object value;
		public AdditiveContext t1;
		public AdditiveContext t2;
		public List<AdditiveContext> additive() {
			return getRuleContexts(AdditiveContext.class);
		}
		public AdditiveContext additive(int i) {
			return getRuleContext(AdditiveContext.class,i);
		}
		public List<TerminalNode> LT() { return getTokens(LinguagemParser.LT); }
		public TerminalNode LT(int i) {
			return getToken(LinguagemParser.LT, i);
		}
		public List<TerminalNode> GT() { return getTokens(LinguagemParser.GT); }
		public TerminalNode GT(int i) {
			return getToken(LinguagemParser.GT, i);
		}
		public List<TerminalNode> LEQ() { return getTokens(LinguagemParser.LEQ); }
		public TerminalNode LEQ(int i) {
			return getToken(LinguagemParser.LEQ, i);
		}
		public List<TerminalNode> GEQ() { return getTokens(LinguagemParser.GEQ); }
		public TerminalNode GEQ(int i) {
			return getToken(LinguagemParser.GEQ, i);
		}
		public List<TerminalNode> EQ() { return getTokens(LinguagemParser.EQ); }
		public TerminalNode EQ(int i) {
			return getToken(LinguagemParser.EQ, i);
		}
		public List<TerminalNode> NEQ() { return getTokens(LinguagemParser.NEQ); }
		public TerminalNode NEQ(int i) {
			return getToken(LinguagemParser.NEQ, i);
		}
		public ComparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison; }
	}

	public final ComparisonContext comparison() throws RecognitionException {
		ComparisonContext _localctx = new ComparisonContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_comparison);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			((ComparisonContext)_localctx).t1 = additive();
			((ComparisonContext)_localctx).value =  ((ComparisonContext)_localctx).t1.value;
			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2064384L) != 0)) {
				{
				setState(130);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LT:
					{
					setState(106);
					match(LT);
					setState(107);
					((ComparisonContext)_localctx).t2 = additive();
					((ComparisonContext)_localctx).value =  (int)_localctx.value < (int)((ComparisonContext)_localctx).t2.value;
					}
					break;
				case GT:
					{
					setState(110);
					match(GT);
					setState(111);
					((ComparisonContext)_localctx).t2 = additive();
					((ComparisonContext)_localctx).value =  (int)_localctx.value > (int)((ComparisonContext)_localctx).t2.value;
					}
					break;
				case LEQ:
					{
					setState(114);
					match(LEQ);
					setState(115);
					((ComparisonContext)_localctx).t2 = additive();
					((ComparisonContext)_localctx).value =  (int)_localctx.value <= (int)((ComparisonContext)_localctx).t2.value;
					}
					break;
				case GEQ:
					{
					setState(118);
					match(GEQ);
					setState(119);
					((ComparisonContext)_localctx).t2 = additive();
					((ComparisonContext)_localctx).value =  (int)_localctx.value >= (int)((ComparisonContext)_localctx).t2.value;
					}
					break;
				case EQ:
					{
					setState(122);
					match(EQ);
					setState(123);
					((ComparisonContext)_localctx).t2 = additive();
					((ComparisonContext)_localctx).value =  _localctx.value.equals(((ComparisonContext)_localctx).t2.value);
					}
					break;
				case NEQ:
					{
					setState(126);
					match(NEQ);
					setState(127);
					((ComparisonContext)_localctx).t2 = additive();
					((ComparisonContext)_localctx).value =  !_localctx.value.equals(((ComparisonContext)_localctx).t2.value);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(134);
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
	public static class AdditiveContext extends ParserRuleContext {
		public Object value;
		public MultiplicativeContext t1;
		public MultiplicativeContext t2;
		public List<MultiplicativeContext> multiplicative() {
			return getRuleContexts(MultiplicativeContext.class);
		}
		public MultiplicativeContext multiplicative(int i) {
			return getRuleContext(MultiplicativeContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(LinguagemParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(LinguagemParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(LinguagemParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(LinguagemParser.MINUS, i);
		}
		public AdditiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additive; }
	}

	public final AdditiveContext additive() throws RecognitionException {
		AdditiveContext _localctx = new AdditiveContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_additive);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			((AdditiveContext)_localctx).t1 = multiplicative();
			((AdditiveContext)_localctx).value =  ((AdditiveContext)_localctx).t1.value;
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				setState(145);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PLUS:
					{
					setState(137);
					match(PLUS);
					setState(138);
					((AdditiveContext)_localctx).t2 = multiplicative();
					((AdditiveContext)_localctx).value =  (int)_localctx.value + (int)((AdditiveContext)_localctx).t2.value;
					}
					break;
				case MINUS:
					{
					setState(141);
					match(MINUS);
					setState(142);
					((AdditiveContext)_localctx).t2 = multiplicative();
					((AdditiveContext)_localctx).value =  (int)_localctx.value - (int)((AdditiveContext)_localctx).t2.value;
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(149);
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
	public static class MultiplicativeContext extends ParserRuleContext {
		public Object value;
		public FactorContext t1;
		public FactorContext t2;
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<TerminalNode> MULT() { return getTokens(LinguagemParser.MULT); }
		public TerminalNode MULT(int i) {
			return getToken(LinguagemParser.MULT, i);
		}
		public List<TerminalNode> DIV() { return getTokens(LinguagemParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(LinguagemParser.DIV, i);
		}
		public MultiplicativeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicative; }
	}

	public final MultiplicativeContext multiplicative() throws RecognitionException {
		MultiplicativeContext _localctx = new MultiplicativeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_multiplicative);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			((MultiplicativeContext)_localctx).t1 = factor();
			((MultiplicativeContext)_localctx).value =  ((MultiplicativeContext)_localctx).t1.value;
			setState(162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MULT || _la==DIV) {
				{
				setState(160);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MULT:
					{
					setState(152);
					match(MULT);
					setState(153);
					((MultiplicativeContext)_localctx).t2 = factor();
					((MultiplicativeContext)_localctx).value =  (int)_localctx.value * (int)((MultiplicativeContext)_localctx).t2.value;
					}
					break;
				case DIV:
					{
					setState(156);
					match(DIV);
					setState(157);
					((MultiplicativeContext)_localctx).t2 = factor();
					((MultiplicativeContext)_localctx).value =  (int)_localctx.value / (int)((MultiplicativeContext)_localctx).t2.value;
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(164);
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
	public static class FactorContext extends ParserRuleContext {
		public Object value;
		public Token NUMBER;
		public Token ID;
		public Token BOOLEAN;
		public TerminalNode NUMBER() { return getToken(LinguagemParser.NUMBER, 0); }
		public TerminalNode ID() { return getToken(LinguagemParser.ID, 0); }
		public TerminalNode BOOLEAN() { return getToken(LinguagemParser.BOOLEAN, 0); }
		public TerminalNode PAR_OPEN() { return getToken(LinguagemParser.PAR_OPEN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PAR_CLOSE() { return getToken(LinguagemParser.PAR_CLOSE, 0); }
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_factor);
		try {
			setState(175);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(165);
				((FactorContext)_localctx).NUMBER = match(NUMBER);
				((FactorContext)_localctx).value =  Integer.parseInt((((FactorContext)_localctx).NUMBER!=null?((FactorContext)_localctx).NUMBER.getText():null));
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(167);
				((FactorContext)_localctx).ID = match(ID);
				((FactorContext)_localctx).value =  symbolTable.get((((FactorContext)_localctx).ID!=null?((FactorContext)_localctx).ID.getText():null));
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 3);
				{
				setState(169);
				((FactorContext)_localctx).BOOLEAN = match(BOOLEAN);
				((FactorContext)_localctx).value =  Boolean.parseBoolean((((FactorContext)_localctx).BOOLEAN!=null?((FactorContext)_localctx).BOOLEAN.getText():null));
				}
				break;
			case PAR_OPEN:
				enterOuterAlt(_localctx, 4);
				{
				setState(171);
				match(PAR_OPEN);
				setState(172);
				expression();
				setState(173);
				match(PAR_CLOSE);
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

	public static final String _serializedATN =
		"\u0004\u0001\u001e\u00b2\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000\u001d\b\u0000"+
		"\n\u0000\f\u0000 \t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001)\b\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005A\b\u0005\n\u0005\f\u0005"+
		"D\t\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005"+
		"J\b\u0005\n\u0005\f\u0005M\t\u0005\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006"+
		"W\b\u0006\n\u0006\f\u0006Z\t\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007"+
		"d\b\u0007\n\u0007\f\u0007g\t\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0005\b\u0083\b\b\n\b\f\b\u0086\t\b\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0005\t\u0092\b\t\n\t\f\t\u0095\t\t\u0001\n\u0001\n\u0001\n\u0001\n"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u00a1\b\n\n\n"+
		"\f\n\u00a4\t\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b"+
		"\u00b0\b\u000b\u0001\u000b\u0000\u0000\f\u0000\u0002\u0004\u0006\b\n\f"+
		"\u000e\u0010\u0012\u0014\u0016\u0000\u0000\u00bb\u0000\u0018\u0001\u0000"+
		"\u0000\u0000\u0002(\u0001\u0000\u0000\u0000\u0004*\u0001\u0000\u0000\u0000"+
		"\u0006/\u0001\u0000\u0000\u0000\b5\u0001\u0000\u0000\u0000\n:\u0001\u0000"+
		"\u0000\u0000\fP\u0001\u0000\u0000\u0000\u000e]\u0001\u0000\u0000\u0000"+
		"\u0010h\u0001\u0000\u0000\u0000\u0012\u0087\u0001\u0000\u0000\u0000\u0014"+
		"\u0096\u0001\u0000\u0000\u0000\u0016\u00af\u0001\u0000\u0000\u0000\u0018"+
		"\u0019\u0005\u0001\u0000\u0000\u0019\u001a\u0005\u001c\u0000\u0000\u001a"+
		"\u001e\u0005\u0016\u0000\u0000\u001b\u001d\u0003\u0002\u0001\u0000\u001c"+
		"\u001b\u0001\u0000\u0000\u0000\u001d \u0001\u0000\u0000\u0000\u001e\u001c"+
		"\u0001\u0000\u0000\u0000\u001e\u001f\u0001\u0000\u0000\u0000\u001f!\u0001"+
		"\u0000\u0000\u0000 \u001e\u0001\u0000\u0000\u0000!\"\u0005\u0017\u0000"+
		"\u0000\"\u0001\u0001\u0000\u0000\u0000#)\u0003\u0004\u0002\u0000$)\u0003"+
		"\u0006\u0003\u0000%)\u0003\b\u0004\u0000&)\u0003\n\u0005\u0000\')\u0003"+
		"\f\u0006\u0000(#\u0001\u0000\u0000\u0000($\u0001\u0000\u0000\u0000(%\u0001"+
		"\u0000\u0000\u0000(&\u0001\u0000\u0000\u0000(\'\u0001\u0000\u0000\u0000"+
		")\u0003\u0001\u0000\u0000\u0000*+\u0005\u0002\u0000\u0000+,\u0005\u001c"+
		"\u0000\u0000,-\u0005\u001a\u0000\u0000-.\u0006\u0002\uffff\uffff\u0000"+
		".\u0005\u0001\u0000\u0000\u0000/0\u0005\u001c\u0000\u000001\u0005\u0015"+
		"\u0000\u000012\u0003\u000e\u0007\u000023\u0005\u001a\u0000\u000034\u0006"+
		"\u0003\uffff\uffff\u00004\u0007\u0001\u0000\u0000\u000056\u0005\u0003"+
		"\u0000\u000067\u0003\u000e\u0007\u000078\u0005\u001a\u0000\u000089\u0006"+
		"\u0004\uffff\uffff\u00009\t\u0001\u0000\u0000\u0000:;\u0005\u0004\u0000"+
		"\u0000;<\u0005\u0018\u0000\u0000<=\u0003\u000e\u0007\u0000=>\u0005\u0019"+
		"\u0000\u0000>B\u0005\u0016\u0000\u0000?A\u0003\u0002\u0001\u0000@?\u0001"+
		"\u0000\u0000\u0000AD\u0001\u0000\u0000\u0000B@\u0001\u0000\u0000\u0000"+
		"BC\u0001\u0000\u0000\u0000CE\u0001\u0000\u0000\u0000DB\u0001\u0000\u0000"+
		"\u0000EF\u0005\u0017\u0000\u0000FG\u0005\u0005\u0000\u0000GK\u0005\u0016"+
		"\u0000\u0000HJ\u0003\u0002\u0001\u0000IH\u0001\u0000\u0000\u0000JM\u0001"+
		"\u0000\u0000\u0000KI\u0001\u0000\u0000\u0000KL\u0001\u0000\u0000\u0000"+
		"LN\u0001\u0000\u0000\u0000MK\u0001\u0000\u0000\u0000NO\u0005\u0017\u0000"+
		"\u0000O\u000b\u0001\u0000\u0000\u0000PQ\u0005\u0007\u0000\u0000QR\u0005"+
		"\u0018\u0000\u0000RS\u0003\u000e\u0007\u0000ST\u0005\u0019\u0000\u0000"+
		"TX\u0005\u0016\u0000\u0000UW\u0003\u0002\u0001\u0000VU\u0001\u0000\u0000"+
		"\u0000WZ\u0001\u0000\u0000\u0000XV\u0001\u0000\u0000\u0000XY\u0001\u0000"+
		"\u0000\u0000Y[\u0001\u0000\u0000\u0000ZX\u0001\u0000\u0000\u0000[\\\u0005"+
		"\u0017\u0000\u0000\\\r\u0001\u0000\u0000\u0000]^\u0003\u0010\b\u0000^"+
		"e\u0006\u0007\uffff\uffff\u0000_`\u0005\r\u0000\u0000`a\u0003\u0010\b"+
		"\u0000ab\u0006\u0007\uffff\uffff\u0000bd\u0001\u0000\u0000\u0000c_\u0001"+
		"\u0000\u0000\u0000dg\u0001\u0000\u0000\u0000ec\u0001\u0000\u0000\u0000"+
		"ef\u0001\u0000\u0000\u0000f\u000f\u0001\u0000\u0000\u0000ge\u0001\u0000"+
		"\u0000\u0000hi\u0003\u0012\t\u0000i\u0084\u0006\b\uffff\uffff\u0000jk"+
		"\u0005\u0010\u0000\u0000kl\u0003\u0012\t\u0000lm\u0006\b\uffff\uffff\u0000"+
		"m\u0083\u0001\u0000\u0000\u0000no\u0005\u000f\u0000\u0000op\u0003\u0012"+
		"\t\u0000pq\u0006\b\uffff\uffff\u0000q\u0083\u0001\u0000\u0000\u0000rs"+
		"\u0005\u0012\u0000\u0000st\u0003\u0012\t\u0000tu\u0006\b\uffff\uffff\u0000"+
		"u\u0083\u0001\u0000\u0000\u0000vw\u0005\u0011\u0000\u0000wx\u0003\u0012"+
		"\t\u0000xy\u0006\b\uffff\uffff\u0000y\u0083\u0001\u0000\u0000\u0000z{"+
		"\u0005\u0013\u0000\u0000{|\u0003\u0012\t\u0000|}\u0006\b\uffff\uffff\u0000"+
		"}\u0083\u0001\u0000\u0000\u0000~\u007f\u0005\u0014\u0000\u0000\u007f\u0080"+
		"\u0003\u0012\t\u0000\u0080\u0081\u0006\b\uffff\uffff\u0000\u0081\u0083"+
		"\u0001\u0000\u0000\u0000\u0082j\u0001\u0000\u0000\u0000\u0082n\u0001\u0000"+
		"\u0000\u0000\u0082r\u0001\u0000\u0000\u0000\u0082v\u0001\u0000\u0000\u0000"+
		"\u0082z\u0001\u0000\u0000\u0000\u0082~\u0001\u0000\u0000\u0000\u0083\u0086"+
		"\u0001\u0000\u0000\u0000\u0084\u0082\u0001\u0000\u0000\u0000\u0084\u0085"+
		"\u0001\u0000\u0000\u0000\u0085\u0011\u0001\u0000\u0000\u0000\u0086\u0084"+
		"\u0001\u0000\u0000\u0000\u0087\u0088\u0003\u0014\n\u0000\u0088\u0093\u0006"+
		"\t\uffff\uffff\u0000\u0089\u008a\u0005\b\u0000\u0000\u008a\u008b\u0003"+
		"\u0014\n\u0000\u008b\u008c\u0006\t\uffff\uffff\u0000\u008c\u0092\u0001"+
		"\u0000\u0000\u0000\u008d\u008e\u0005\t\u0000\u0000\u008e\u008f\u0003\u0014"+
		"\n\u0000\u008f\u0090\u0006\t\uffff\uffff\u0000\u0090\u0092\u0001\u0000"+
		"\u0000\u0000\u0091\u0089\u0001\u0000\u0000\u0000\u0091\u008d\u0001\u0000"+
		"\u0000\u0000\u0092\u0095\u0001\u0000\u0000\u0000\u0093\u0091\u0001\u0000"+
		"\u0000\u0000\u0093\u0094\u0001\u0000\u0000\u0000\u0094\u0013\u0001\u0000"+
		"\u0000\u0000\u0095\u0093\u0001\u0000\u0000\u0000\u0096\u0097\u0003\u0016"+
		"\u000b\u0000\u0097\u00a2\u0006\n\uffff\uffff\u0000\u0098\u0099\u0005\n"+
		"\u0000\u0000\u0099\u009a\u0003\u0016\u000b\u0000\u009a\u009b\u0006\n\uffff"+
		"\uffff\u0000\u009b\u00a1\u0001\u0000\u0000\u0000\u009c\u009d\u0005\u000b"+
		"\u0000\u0000\u009d\u009e\u0003\u0016\u000b\u0000\u009e\u009f\u0006\n\uffff"+
		"\uffff\u0000\u009f\u00a1\u0001\u0000\u0000\u0000\u00a0\u0098\u0001\u0000"+
		"\u0000\u0000\u00a0\u009c\u0001\u0000\u0000\u0000\u00a1\u00a4\u0001\u0000"+
		"\u0000\u0000\u00a2\u00a0\u0001\u0000\u0000\u0000\u00a2\u00a3\u0001\u0000"+
		"\u0000\u0000\u00a3\u0015\u0001\u0000\u0000\u0000\u00a4\u00a2\u0001\u0000"+
		"\u0000\u0000\u00a5\u00a6\u0005\u001d\u0000\u0000\u00a6\u00b0\u0006\u000b"+
		"\uffff\uffff\u0000\u00a7\u00a8\u0005\u001c\u0000\u0000\u00a8\u00b0\u0006"+
		"\u000b\uffff\uffff\u0000\u00a9\u00aa\u0005\u001b\u0000\u0000\u00aa\u00b0"+
		"\u0006\u000b\uffff\uffff\u0000\u00ab\u00ac\u0005\u0018\u0000\u0000\u00ac"+
		"\u00ad\u0003\u000e\u0007\u0000\u00ad\u00ae\u0005\u0019\u0000\u0000\u00ae"+
		"\u00b0\u0001\u0000\u0000\u0000\u00af\u00a5\u0001\u0000\u0000\u0000\u00af"+
		"\u00a7\u0001\u0000\u0000\u0000\u00af\u00a9\u0001\u0000\u0000\u0000\u00af"+
		"\u00ab\u0001\u0000\u0000\u0000\u00b0\u0017\u0001\u0000\u0000\u0000\r\u001e"+
		"(BKXe\u0082\u0084\u0091\u0093\u00a0\u00a2\u00af";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}