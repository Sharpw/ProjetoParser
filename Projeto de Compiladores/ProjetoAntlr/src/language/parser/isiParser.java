// Generated from isi.g4 by ANTLR 4.9.2
package language.parser;

	import language.datastructures.isiSymbol;
	import language.datastructures.isiSymbolTable;
	import language.datastructures.isiVariable;
	import language.exceptions.isiSemanticException;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class isiParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, AP=15, FP=16, AC=17, 
		FC=18, ACO=19, FCO=20, ATT=21, SC=22, CM=23, OP=24, OPM=25, OPL=26, OPR=27, 
		OA=28, ACOM=29, FCOM=30, AS=31, TRUE=32, FALSE=33, ID=34, NUMBER=35, BLANK=36;
	public static final int
		RULE_program = 0, RULE_start = 1, RULE_decl = 2, RULE_declareVar = 3, 
		RULE_declareNum = 4, RULE_declareChar = 5, RULE_number = 6, RULE_block = 7, 
		RULE_cmd = 8, RULE_cmdComm = 9, RULE_cmdRead = 10, RULE_cmdWrite = 11, 
		RULE_cmdAtt = 12, RULE_cmdCond = 13, RULE_cmdBool = 14, RULE_cmdFor = 15, 
		RULE_cmdWhile = 16, RULE_cmdRet = 17, RULE_cmdMM = 18, RULE_cmdLL = 19, 
		RULE_cmdChar = 20, RULE_cmdFunc = 21, RULE_expr = 22, RULE_term = 23;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "start", "decl", "declareVar", "declareNum", "declareChar", 
			"number", "block", "cmd", "cmdComm", "cmdRead", "cmdWrite", "cmdAtt", 
			"cmdCond", "cmdBool", "cmdFor", "cmdWhile", "cmdRet", "cmdMM", "cmdLL", 
			"cmdChar", "cmdFunc", "expr", "term"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'main(){'", "'int'", "'void'", "'char'", "'float'", "'double'", 
			"'scanf'", "'printf'", "'if'", "'else'", "'bool'", "'for'", "'while'", 
			"'return'", "'('", "')'", "'{'", "'}'", "'['", "']'", "'='", "';'", "','", 
			null, "'++'", "'--'", null, null, "'/*'", "'*/'", "'\u0027'", "'true'", 
			"'false'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "AP", "FP", "AC", "FC", "ACO", "FCO", "ATT", "SC", 
			"CM", "OP", "OPM", "OPL", "OPR", "OA", "ACOM", "FCOM", "AS", "TRUE", 
			"FALSE", "ID", "NUMBER", "BLANK"
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
	public String getGrammarFileName() { return "isi.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


		private int _type;
		private String _varName;
		private String _varValue;
		private isiSymbolTable symbolTable = new isiSymbolTable();
		private isiSymbol symbol;
		
		// função verifica se o ID existe na tabela
		public void verifyId(String id){
			if(!symbolTable.exists(id)){
				throw new isiSemanticException("SYMBOL "+_varName+" NAO DECLARADO");
			}
		}
		
		// cria um novo symbol, atribui e adiciona o token na tabela de symbols 
		public void createId(String id){
			_varValue = null;
			symbol = new isiVariable(_varName, _type, _varValue);
			if(!symbolTable.exists(_varName)){
				symbolTable.add(symbol);
			}else{
				throw new isiSemanticException("SYMBOL "+_varName+" JA DECLARADO");
			}
		}

	public isiParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public StartContext start() {
			return getRuleContext(StartContext.class,0);
		}
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode FC() { return getToken(isiParser.FC, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof isiListener ) ((isiListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof isiListener ) ((isiListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			start();
			setState(49);
			match(T__0);
			setState(50);
			decl();
			setState(51);
			block();
			setState(52);
			match(FC);
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

	public static class StartContext extends ParserRuleContext {
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof isiListener ) ((isiListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof isiListener ) ((isiListener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			_la = _input.LA(1);
			if ( !(_la==T__1 || _la==T__2) ) {
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

	public static class DeclContext extends ParserRuleContext {
		public List<DeclareVarContext> declareVar() {
			return getRuleContexts(DeclareVarContext.class);
		}
		public DeclareVarContext declareVar(int i) {
			return getRuleContext(DeclareVarContext.class,i);
		}
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof isiListener ) ((isiListener)listener).enterDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof isiListener ) ((isiListener)listener).exitDecl(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_decl);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(57); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(56);
					declareVar();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(59); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class DeclareVarContext extends ParserRuleContext {
		public DeclareNumContext declareNum() {
			return getRuleContext(DeclareNumContext.class,0);
		}
		public DeclareCharContext declareChar() {
			return getRuleContext(DeclareCharContext.class,0);
		}
		public CmdContext cmd() {
			return getRuleContext(CmdContext.class,0);
		}
		public DeclareVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declareVar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof isiListener ) ((isiListener)listener).enterDeclareVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof isiListener ) ((isiListener)listener).exitDeclareVar(this);
		}
	}

	public final DeclareVarContext declareVar() throws RecognitionException {
		DeclareVarContext _localctx = new DeclareVarContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declareVar);
		try {
			setState(64);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(61);
				declareNum();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(62);
				declareChar();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(63);
				cmd();
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

	public static class DeclareNumContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(isiParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(isiParser.ID, i);
		}
		public TerminalNode SC() { return getToken(isiParser.SC, 0); }
		public List<TerminalNode> CM() { return getTokens(isiParser.CM); }
		public TerminalNode CM(int i) {
			return getToken(isiParser.CM, i);
		}
		public DeclareNumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declareNum; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof isiListener ) ((isiListener)listener).enterDeclareNum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof isiListener ) ((isiListener)listener).exitDeclareNum(this);
		}
	}

	public final DeclareNumContext declareNum() throws RecognitionException {
		DeclareNumContext _localctx = new DeclareNumContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_declareNum);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			number();
			setState(67);
			match(ID);
			 createId(_varName = _input.LT(-1).getText());
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CM) {
				{
				{
				setState(69);
				match(CM);
				setState(70);
				match(ID);
				 createId(_varName = _input.LT(-1).getText());
				}
				}
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(77);
			match(SC);
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

	public static class DeclareCharContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(isiParser.ID, 0); }
		public TerminalNode ACO() { return getToken(isiParser.ACO, 0); }
		public TerminalNode NUMBER() { return getToken(isiParser.NUMBER, 0); }
		public TerminalNode FCO() { return getToken(isiParser.FCO, 0); }
		public TerminalNode SC() { return getToken(isiParser.SC, 0); }
		public DeclareCharContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declareChar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof isiListener ) ((isiListener)listener).enterDeclareChar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof isiListener ) ((isiListener)listener).exitDeclareChar(this);
		}
	}

	public final DeclareCharContext declareChar() throws RecognitionException {
		DeclareCharContext _localctx = new DeclareCharContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_declareChar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(T__3);
			 _type = isiVariable.STRING;   
			setState(81);
			match(ID);
			 createId(_varName = _input.LT(-1).getText());
			setState(83);
			match(ACO);
			setState(84);
			match(NUMBER);
			setState(85);
			match(FCO);
			setState(86);
			match(SC);
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

	public static class NumberContext extends ParserRuleContext {
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof isiListener ) ((isiListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof isiListener ) ((isiListener)listener).exitNumber(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__4) | (1L << T__5))) != 0)) ) {
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

	public static class BlockContext extends ParserRuleContext {
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof isiListener ) ((isiListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof isiListener ) ((isiListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(90);
				cmd();
				}
				}
				setState(93); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << ACOM) | (1L << ID))) != 0) );
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

	public static class CmdContext extends ParserRuleContext {
		public CmdReadContext cmdRead() {
			return getRuleContext(CmdReadContext.class,0);
		}
		public CmdWriteContext cmdWrite() {
			return getRuleContext(CmdWriteContext.class,0);
		}
		public CmdAttContext cmdAtt() {
			return getRuleContext(CmdAttContext.class,0);
		}
		public CmdCondContext cmdCond() {
			return getRuleContext(CmdCondContext.class,0);
		}
		public CmdBoolContext cmdBool() {
			return getRuleContext(CmdBoolContext.class,0);
		}
		public CmdForContext cmdFor() {
			return getRuleContext(CmdForContext.class,0);
		}
		public CmdWhileContext cmdWhile() {
			return getRuleContext(CmdWhileContext.class,0);
		}
		public CmdRetContext cmdRet() {
			return getRuleContext(CmdRetContext.class,0);
		}
		public CmdMMContext cmdMM() {
			return getRuleContext(CmdMMContext.class,0);
		}
		public CmdLLContext cmdLL() {
			return getRuleContext(CmdLLContext.class,0);
		}
		public CmdCharContext cmdChar() {
			return getRuleContext(CmdCharContext.class,0);
		}
		public CmdCommContext cmdComm() {
			return getRuleContext(CmdCommContext.class,0);
		}
		public CmdFuncContext cmdFunc() {
			return getRuleContext(CmdFuncContext.class,0);
		}
		public CmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof isiListener ) ((isiListener)listener).enterCmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof isiListener ) ((isiListener)listener).exitCmd(this);
		}
	}

	public final CmdContext cmd() throws RecognitionException {
		CmdContext _localctx = new CmdContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_cmd);
		try {
			setState(108);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(95);
				cmdRead();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(96);
				cmdWrite();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(97);
				cmdAtt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(98);
				cmdCond();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(99);
				cmdBool();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(100);
				cmdFor();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(101);
				cmdWhile();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(102);
				cmdRet();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(103);
				cmdMM();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(104);
				cmdLL();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(105);
				cmdChar();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(106);
				cmdComm();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(107);
				cmdFunc();
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

	public static class CmdCommContext extends ParserRuleContext {
		public TerminalNode ACOM() { return getToken(isiParser.ACOM, 0); }
		public TerminalNode FCOM() { return getToken(isiParser.FCOM, 0); }
		public List<TerminalNode> ID() { return getTokens(isiParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(isiParser.ID, i);
		}
		public CmdCommContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdComm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof isiListener ) ((isiListener)listener).enterCmdComm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof isiListener ) ((isiListener)listener).exitCmdComm(this);
		}
	}

	public final CmdCommContext cmdComm() throws RecognitionException {
		CmdCommContext _localctx = new CmdCommContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_cmdComm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(ACOM);
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(111);
				match(ID);
				}
				}
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(117);
			match(FCOM);
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

	public static class CmdReadContext extends ParserRuleContext {
		public TerminalNode AP() { return getToken(isiParser.AP, 0); }
		public TerminalNode ID() { return getToken(isiParser.ID, 0); }
		public TerminalNode FP() { return getToken(isiParser.FP, 0); }
		public TerminalNode SC() { return getToken(isiParser.SC, 0); }
		public CmdReadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdRead; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof isiListener ) ((isiListener)listener).enterCmdRead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof isiListener ) ((isiListener)listener).exitCmdRead(this);
		}
	}

	public final CmdReadContext cmdRead() throws RecognitionException {
		CmdReadContext _localctx = new CmdReadContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_cmdRead);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(T__6);
			setState(120);
			match(AP);
			setState(121);
			match(ID);
			 verifyId(_varName = _input.LT(-1).getText());
			setState(123);
			match(FP);
			setState(124);
			match(SC);
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

	public static class CmdWriteContext extends ParserRuleContext {
		public TerminalNode AP() { return getToken(isiParser.AP, 0); }
		public TerminalNode FP() { return getToken(isiParser.FP, 0); }
		public TerminalNode SC() { return getToken(isiParser.SC, 0); }
		public TerminalNode ID() { return getToken(isiParser.ID, 0); }
		public TerminalNode NUMBER() { return getToken(isiParser.NUMBER, 0); }
		public CmdWriteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdWrite; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof isiListener ) ((isiListener)listener).enterCmdWrite(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof isiListener ) ((isiListener)listener).exitCmdWrite(this);
		}
	}

	public final CmdWriteContext cmdWrite() throws RecognitionException {
		CmdWriteContext _localctx = new CmdWriteContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_cmdWrite);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(T__7);
			setState(127);
			match(AP);
			setState(131);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(128);
				match(ID);
				 verifyId(_varName = _input.LT(-1).getText());
				}
				break;
			case NUMBER:
				{
				setState(130);
				match(NUMBER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(133);
			match(FP);
			setState(134);
			match(SC);
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

	public static class CmdAttContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(isiParser.ID, 0); }
		public TerminalNode ATT() { return getToken(isiParser.ATT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SC() { return getToken(isiParser.SC, 0); }
		public CmdAttContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdAtt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof isiListener ) ((isiListener)listener).enterCmdAtt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof isiListener ) ((isiListener)listener).exitCmdAtt(this);
		}
	}

	public final CmdAttContext cmdAtt() throws RecognitionException {
		CmdAttContext _localctx = new CmdAttContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_cmdAtt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(ID);
			 verifyId(_varName = _input.LT(-1).getText());
			setState(138);
			match(ATT);
			setState(139);
			expr();
			setState(140);
			match(SC);
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

	public static class CmdCondContext extends ParserRuleContext {
		public TerminalNode AP() { return getToken(isiParser.AP, 0); }
		public List<TerminalNode> ID() { return getTokens(isiParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(isiParser.ID, i);
		}
		public TerminalNode OPR() { return getToken(isiParser.OPR, 0); }
		public TerminalNode FP() { return getToken(isiParser.FP, 0); }
		public List<TerminalNode> AC() { return getTokens(isiParser.AC); }
		public TerminalNode AC(int i) {
			return getToken(isiParser.AC, i);
		}
		public List<TerminalNode> FC() { return getTokens(isiParser.FC); }
		public TerminalNode FC(int i) {
			return getToken(isiParser.FC, i);
		}
		public TerminalNode SC() { return getToken(isiParser.SC, 0); }
		public TerminalNode NUMBER() { return getToken(isiParser.NUMBER, 0); }
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public CmdCondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdCond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof isiListener ) ((isiListener)listener).enterCmdCond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof isiListener ) ((isiListener)listener).exitCmdCond(this);
		}
	}

	public final CmdCondContext cmdCond() throws RecognitionException {
		CmdCondContext _localctx = new CmdCondContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_cmdCond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(T__8);
			setState(143);
			match(AP);
			setState(144);
			match(ID);
			 verifyId(_varName = _input.LT(-1).getText());
			setState(146);
			match(OPR);
			setState(150);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(147);
				match(ID);
				 verifyId(_varName = _input.LT(-1).getText());
				}
				break;
			case NUMBER:
				{
				setState(149);
				match(NUMBER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(152);
			match(FP);
			setState(153);
			match(AC);
			setState(155); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(154);
				cmd();
				}
				}
				setState(157); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << ACOM) | (1L << ID))) != 0) );
			setState(159);
			match(FC);
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(160);
				match(T__9);
				setState(161);
				match(AC);
				setState(163); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(162);
					cmd();
					}
					}
					setState(165); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << ACOM) | (1L << ID))) != 0) );
				setState(167);
				match(FC);
				}
			}

			setState(171);
			match(SC);
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

	public static class CmdBoolContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(isiParser.ID, 0); }
		public TerminalNode ATT() { return getToken(isiParser.ATT, 0); }
		public TerminalNode SC() { return getToken(isiParser.SC, 0); }
		public TerminalNode TRUE() { return getToken(isiParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(isiParser.FALSE, 0); }
		public CmdBoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdBool; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof isiListener ) ((isiListener)listener).enterCmdBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof isiListener ) ((isiListener)listener).exitCmdBool(this);
		}
	}

	public final CmdBoolContext cmdBool() throws RecognitionException {
		CmdBoolContext _localctx = new CmdBoolContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_cmdBool);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			match(T__10);
			setState(174);
			match(ID);
			 verifyId(_varName = _input.LT(-1).getText());
			setState(176);
			match(ATT);
			setState(177);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(178);
			match(SC);
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

	public static class CmdForContext extends ParserRuleContext {
		public TerminalNode AP() { return getToken(isiParser.AP, 0); }
		public TerminalNode ATT() { return getToken(isiParser.ATT, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(isiParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(isiParser.NUMBER, i);
		}
		public List<TerminalNode> SC() { return getTokens(isiParser.SC); }
		public TerminalNode SC(int i) {
			return getToken(isiParser.SC, i);
		}
		public List<TerminalNode> ID() { return getTokens(isiParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(isiParser.ID, i);
		}
		public TerminalNode OPR() { return getToken(isiParser.OPR, 0); }
		public TerminalNode FP() { return getToken(isiParser.FP, 0); }
		public TerminalNode AC() { return getToken(isiParser.AC, 0); }
		public TerminalNode FC() { return getToken(isiParser.FC, 0); }
		public TerminalNode OPM() { return getToken(isiParser.OPM, 0); }
		public TerminalNode OPL() { return getToken(isiParser.OPL, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public CmdRetContext cmdRet() {
			return getRuleContext(CmdRetContext.class,0);
		}
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public CmdForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdFor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof isiListener ) ((isiListener)listener).enterCmdFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof isiListener ) ((isiListener)listener).exitCmdFor(this);
		}
	}

	public final CmdForContext cmdFor() throws RecognitionException {
		CmdForContext _localctx = new CmdForContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_cmdFor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(T__11);
			setState(181);
			match(AP);
			setState(188);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(182);
				match(ID);
				 verifyId(_varName = _input.LT(-1).getText());
				}
				break;
			case T__1:
			case T__4:
			case T__5:
				{
				setState(184);
				number();
				setState(185);
				match(ID);
				 createId(_varName = _input.LT(-1).getText());
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(190);
			match(ATT);
			setState(191);
			match(NUMBER);
			setState(192);
			match(SC);
			setState(193);
			match(ID);
			 verifyId(_varName = _input.LT(-1).getText());
			setState(195);
			match(OPR);
			setState(199);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(196);
				match(ID);
				 verifyId(_varName = _input.LT(-1).getText());
				}
				break;
			case NUMBER:
				{
				setState(198);
				match(NUMBER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(201);
			match(SC);
			setState(202);
			match(ID);
			 verifyId(_varName = _input.LT(-1).getText());
			setState(204);
			_la = _input.LA(1);
			if ( !(_la==OPM || _la==OPL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(205);
			match(FP);
			setState(206);
			match(AC);
			setState(208); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(207);
				cmd();
				}
				}
				setState(210); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << ACOM) | (1L << ID))) != 0) );
			setState(212);
			match(FC);
			setState(215);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
				{
				setState(213);
				cmdRet();
				}
				break;
			case SC:
				{
				setState(214);
				match(SC);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class CmdWhileContext extends ParserRuleContext {
		public TerminalNode AP() { return getToken(isiParser.AP, 0); }
		public List<TerminalNode> ID() { return getTokens(isiParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(isiParser.ID, i);
		}
		public TerminalNode OPR() { return getToken(isiParser.OPR, 0); }
		public TerminalNode FP() { return getToken(isiParser.FP, 0); }
		public TerminalNode AC() { return getToken(isiParser.AC, 0); }
		public TerminalNode FC() { return getToken(isiParser.FC, 0); }
		public TerminalNode NUMBER() { return getToken(isiParser.NUMBER, 0); }
		public CmdRetContext cmdRet() {
			return getRuleContext(CmdRetContext.class,0);
		}
		public TerminalNode SC() { return getToken(isiParser.SC, 0); }
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public CmdWhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdWhile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof isiListener ) ((isiListener)listener).enterCmdWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof isiListener ) ((isiListener)listener).exitCmdWhile(this);
		}
	}

	public final CmdWhileContext cmdWhile() throws RecognitionException {
		CmdWhileContext _localctx = new CmdWhileContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_cmdWhile);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			match(T__12);
			setState(218);
			match(AP);
			setState(219);
			match(ID);
			 verifyId(_varName = _input.LT(-1).getText()); 
			setState(221);
			match(OPR);
			setState(225);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(222);
				match(ID);
				 verifyId(_varName = _input.LT(-1).getText());
				}
				break;
			case NUMBER:
				{
				setState(224);
				match(NUMBER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(227);
			match(FP);
			setState(228);
			match(AC);
			setState(230); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(229);
				cmd();
				}
				}
				setState(232); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << ACOM) | (1L << ID))) != 0) );
			setState(234);
			match(FC);
			setState(237);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
				{
				setState(235);
				cmdRet();
				}
				break;
			case SC:
				{
				setState(236);
				match(SC);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class CmdRetContext extends ParserRuleContext {
		public TerminalNode SC() { return getToken(isiParser.SC, 0); }
		public TerminalNode ID() { return getToken(isiParser.ID, 0); }
		public TerminalNode NUMBER() { return getToken(isiParser.NUMBER, 0); }
		public CmdRetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdRet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof isiListener ) ((isiListener)listener).enterCmdRet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof isiListener ) ((isiListener)listener).exitCmdRet(this);
		}
	}

	public final CmdRetContext cmdRet() throws RecognitionException {
		CmdRetContext _localctx = new CmdRetContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_cmdRet);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			match(T__13);
			setState(243);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(240);
				match(ID);
				 verifyId(_varName = _input.LT(-1).getText()); 
				}
				break;
			case NUMBER:
				{
				setState(242);
				match(NUMBER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(245);
			match(SC);
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

	public static class CmdMMContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(isiParser.ID, 0); }
		public TerminalNode OPM() { return getToken(isiParser.OPM, 0); }
		public TerminalNode SC() { return getToken(isiParser.SC, 0); }
		public CmdMMContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdMM; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof isiListener ) ((isiListener)listener).enterCmdMM(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof isiListener ) ((isiListener)listener).exitCmdMM(this);
		}
	}

	public final CmdMMContext cmdMM() throws RecognitionException {
		CmdMMContext _localctx = new CmdMMContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_cmdMM);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			match(ID);
			setState(248);
			match(OPM);
			setState(249);
			match(SC);
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

	public static class CmdLLContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(isiParser.ID, 0); }
		public TerminalNode OPL() { return getToken(isiParser.OPL, 0); }
		public TerminalNode SC() { return getToken(isiParser.SC, 0); }
		public CmdLLContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdLL; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof isiListener ) ((isiListener)listener).enterCmdLL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof isiListener ) ((isiListener)listener).exitCmdLL(this);
		}
	}

	public final CmdLLContext cmdLL() throws RecognitionException {
		CmdLLContext _localctx = new CmdLLContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_cmdLL);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			match(ID);
			setState(252);
			match(OPL);
			setState(253);
			match(SC);
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

	public static class CmdCharContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(isiParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(isiParser.ID, i);
		}
		public TerminalNode ATT() { return getToken(isiParser.ATT, 0); }
		public List<TerminalNode> AS() { return getTokens(isiParser.AS); }
		public TerminalNode AS(int i) {
			return getToken(isiParser.AS, i);
		}
		public TerminalNode SC() { return getToken(isiParser.SC, 0); }
		public CmdCharContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdChar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof isiListener ) ((isiListener)listener).enterCmdChar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof isiListener ) ((isiListener)listener).exitCmdChar(this);
		}
	}

	public final CmdCharContext cmdChar() throws RecognitionException {
		CmdCharContext _localctx = new CmdCharContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_cmdChar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			match(ID);
			 verifyId(_varName = _input.LT(-1).getText()); 
			setState(257);
			match(ATT);
			setState(258);
			match(AS);
			setState(259);
			match(ID);
			setState(260);
			match(AS);
			setState(261);
			match(SC);
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

	public static class CmdFuncContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(isiParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(isiParser.ID, i);
		}
		public TerminalNode AP() { return getToken(isiParser.AP, 0); }
		public TerminalNode FP() { return getToken(isiParser.FP, 0); }
		public TerminalNode AC() { return getToken(isiParser.AC, 0); }
		public CmdContext cmd() {
			return getRuleContext(CmdContext.class,0);
		}
		public TerminalNode FC() { return getToken(isiParser.FC, 0); }
		public TerminalNode SC() { return getToken(isiParser.SC, 0); }
		public List<TerminalNode> CM() { return getTokens(isiParser.CM); }
		public TerminalNode CM(int i) {
			return getToken(isiParser.CM, i);
		}
		public CmdFuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdFunc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof isiListener ) ((isiListener)listener).enterCmdFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof isiListener ) ((isiListener)listener).exitCmdFunc(this);
		}
	}

	public final CmdFuncContext cmdFunc() throws RecognitionException {
		CmdFuncContext _localctx = new CmdFuncContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_cmdFunc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			number();
			setState(264);
			match(ID);
			 createId(_varName = _input.LT(-1).getText());
			setState(266);
			match(AP);
			setState(276);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CM || _la==ID) {
				{
				setState(272); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					setState(272);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case ID:
						{
						setState(267);
						match(ID);
						 verifyId(_varName = _input.LT(-1).getText());
						}
						break;
					case CM:
						{
						setState(269);
						match(CM);
						setState(270);
						match(ID);
						 verifyId(_varName = _input.LT(-1).getText());
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(274); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==CM || _la==ID );
				}
			}

			setState(278);
			match(FP);
			setState(279);
			match(AC);
			setState(280);
			cmd();
			setState(281);
			match(FC);
			setState(282);
			match(SC);
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

	public static class ExprContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<TerminalNode> OP() { return getTokens(isiParser.OP); }
		public TerminalNode OP(int i) {
			return getToken(isiParser.OP, i);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof isiListener ) ((isiListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof isiListener ) ((isiListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			term();
			setState(289);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP) {
				{
				{
				setState(285);
				match(OP);
				setState(286);
				term();
				}
				}
				setState(291);
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

	public static class TermContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(isiParser.ID, 0); }
		public TerminalNode NUMBER() { return getToken(isiParser.NUMBER, 0); }
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof isiListener ) ((isiListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof isiListener ) ((isiListener)listener).exitTerm(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_term);
		try {
			setState(295);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(292);
				match(ID);
				 verifyId(_varName = _input.LT(-1).getText());
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(294);
				match(NUMBER);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3&\u012c\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\6\4<\n\4\r\4\16\4=\3\5\3\5\3\5\5"+
		"\5C\n\5\3\6\3\6\3\6\3\6\3\6\3\6\7\6K\n\6\f\6\16\6N\13\6\3\6\3\6\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\t\6\t^\n\t\r\t\16\t_\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\no\n\n\3\13\3\13\7\13s"+
		"\n\13\f\13\16\13v\13\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r"+
		"\3\r\3\r\3\r\5\r\u0086\n\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u0099\n\17\3\17\3\17\3\17"+
		"\6\17\u009e\n\17\r\17\16\17\u009f\3\17\3\17\3\17\3\17\6\17\u00a6\n\17"+
		"\r\17\16\17\u00a7\3\17\3\17\5\17\u00ac\n\17\3\17\3\17\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00bf"+
		"\n\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00ca\n\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\6\21\u00d3\n\21\r\21\16\21\u00d4\3\21\3"+
		"\21\3\21\5\21\u00da\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22"+
		"\u00e4\n\22\3\22\3\22\3\22\6\22\u00e9\n\22\r\22\16\22\u00ea\3\22\3\22"+
		"\3\22\5\22\u00f0\n\22\3\23\3\23\3\23\3\23\5\23\u00f6\n\23\3\23\3\23\3"+
		"\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\6\27\u0113\n\27"+
		"\r\27\16\27\u0114\5\27\u0117\n\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3"+
		"\30\3\30\7\30\u0122\n\30\f\30\16\30\u0125\13\30\3\31\3\31\3\31\5\31\u012a"+
		"\n\31\3\31\2\2\32\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\2"+
		"\6\3\2\4\5\4\2\4\4\7\b\3\2\"#\3\2\33\34\2\u0137\2\62\3\2\2\2\48\3\2\2"+
		"\2\6;\3\2\2\2\bB\3\2\2\2\nD\3\2\2\2\fQ\3\2\2\2\16Z\3\2\2\2\20]\3\2\2\2"+
		"\22n\3\2\2\2\24p\3\2\2\2\26y\3\2\2\2\30\u0080\3\2\2\2\32\u008a\3\2\2\2"+
		"\34\u0090\3\2\2\2\36\u00af\3\2\2\2 \u00b6\3\2\2\2\"\u00db\3\2\2\2$\u00f1"+
		"\3\2\2\2&\u00f9\3\2\2\2(\u00fd\3\2\2\2*\u0101\3\2\2\2,\u0109\3\2\2\2."+
		"\u011e\3\2\2\2\60\u0129\3\2\2\2\62\63\5\4\3\2\63\64\7\3\2\2\64\65\5\6"+
		"\4\2\65\66\5\20\t\2\66\67\7\24\2\2\67\3\3\2\2\289\t\2\2\29\5\3\2\2\2:"+
		"<\5\b\5\2;:\3\2\2\2<=\3\2\2\2=;\3\2\2\2=>\3\2\2\2>\7\3\2\2\2?C\5\n\6\2"+
		"@C\5\f\7\2AC\5\22\n\2B?\3\2\2\2B@\3\2\2\2BA\3\2\2\2C\t\3\2\2\2DE\5\16"+
		"\b\2EF\7$\2\2FL\b\6\1\2GH\7\31\2\2HI\7$\2\2IK\b\6\1\2JG\3\2\2\2KN\3\2"+
		"\2\2LJ\3\2\2\2LM\3\2\2\2MO\3\2\2\2NL\3\2\2\2OP\7\30\2\2P\13\3\2\2\2QR"+
		"\7\6\2\2RS\b\7\1\2ST\7$\2\2TU\b\7\1\2UV\7\25\2\2VW\7%\2\2WX\7\26\2\2X"+
		"Y\7\30\2\2Y\r\3\2\2\2Z[\t\3\2\2[\17\3\2\2\2\\^\5\22\n\2]\\\3\2\2\2^_\3"+
		"\2\2\2_]\3\2\2\2_`\3\2\2\2`\21\3\2\2\2ao\5\26\f\2bo\5\30\r\2co\5\32\16"+
		"\2do\5\34\17\2eo\5\36\20\2fo\5 \21\2go\5\"\22\2ho\5$\23\2io\5&\24\2jo"+
		"\5(\25\2ko\5*\26\2lo\5\24\13\2mo\5,\27\2na\3\2\2\2nb\3\2\2\2nc\3\2\2\2"+
		"nd\3\2\2\2ne\3\2\2\2nf\3\2\2\2ng\3\2\2\2nh\3\2\2\2ni\3\2\2\2nj\3\2\2\2"+
		"nk\3\2\2\2nl\3\2\2\2nm\3\2\2\2o\23\3\2\2\2pt\7\37\2\2qs\7$\2\2rq\3\2\2"+
		"\2sv\3\2\2\2tr\3\2\2\2tu\3\2\2\2uw\3\2\2\2vt\3\2\2\2wx\7 \2\2x\25\3\2"+
		"\2\2yz\7\t\2\2z{\7\21\2\2{|\7$\2\2|}\b\f\1\2}~\7\22\2\2~\177\7\30\2\2"+
		"\177\27\3\2\2\2\u0080\u0081\7\n\2\2\u0081\u0085\7\21\2\2\u0082\u0083\7"+
		"$\2\2\u0083\u0086\b\r\1\2\u0084\u0086\7%\2\2\u0085\u0082\3\2\2\2\u0085"+
		"\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0088\7\22\2\2\u0088\u0089\7"+
		"\30\2\2\u0089\31\3\2\2\2\u008a\u008b\7$\2\2\u008b\u008c\b\16\1\2\u008c"+
		"\u008d\7\27\2\2\u008d\u008e\5.\30\2\u008e\u008f\7\30\2\2\u008f\33\3\2"+
		"\2\2\u0090\u0091\7\13\2\2\u0091\u0092\7\21\2\2\u0092\u0093\7$\2\2\u0093"+
		"\u0094\b\17\1\2\u0094\u0098\7\35\2\2\u0095\u0096\7$\2\2\u0096\u0099\b"+
		"\17\1\2\u0097\u0099\7%\2\2\u0098\u0095\3\2\2\2\u0098\u0097\3\2\2\2\u0099"+
		"\u009a\3\2\2\2\u009a\u009b\7\22\2\2\u009b\u009d\7\23\2\2\u009c\u009e\5"+
		"\22\n\2\u009d\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u009d\3\2\2\2\u009f"+
		"\u00a0\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00ab\7\24\2\2\u00a2\u00a3\7"+
		"\f\2\2\u00a3\u00a5\7\23\2\2\u00a4\u00a6\5\22\n\2\u00a5\u00a4\3\2\2\2\u00a6"+
		"\u00a7\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a9\3\2"+
		"\2\2\u00a9\u00aa\7\24\2\2\u00aa\u00ac\3\2\2\2\u00ab\u00a2\3\2\2\2\u00ab"+
		"\u00ac\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ae\7\30\2\2\u00ae\35\3\2\2"+
		"\2\u00af\u00b0\7\r\2\2\u00b0\u00b1\7$\2\2\u00b1\u00b2\b\20\1\2\u00b2\u00b3"+
		"\7\27\2\2\u00b3\u00b4\t\4\2\2\u00b4\u00b5\7\30\2\2\u00b5\37\3\2\2\2\u00b6"+
		"\u00b7\7\16\2\2\u00b7\u00be\7\21\2\2\u00b8\u00b9\7$\2\2\u00b9\u00bf\b"+
		"\21\1\2\u00ba\u00bb\5\16\b\2\u00bb\u00bc\7$\2\2\u00bc\u00bd\b\21\1\2\u00bd"+
		"\u00bf\3\2\2\2\u00be\u00b8\3\2\2\2\u00be\u00ba\3\2\2\2\u00bf\u00c0\3\2"+
		"\2\2\u00c0\u00c1\7\27\2\2\u00c1\u00c2\7%\2\2\u00c2\u00c3\7\30\2\2\u00c3"+
		"\u00c4\7$\2\2\u00c4\u00c5\b\21\1\2\u00c5\u00c9\7\35\2\2\u00c6\u00c7\7"+
		"$\2\2\u00c7\u00ca\b\21\1\2\u00c8\u00ca\7%\2\2\u00c9\u00c6\3\2\2\2\u00c9"+
		"\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cc\7\30\2\2\u00cc\u00cd\7"+
		"$\2\2\u00cd\u00ce\b\21\1\2\u00ce\u00cf\t\5\2\2\u00cf\u00d0\7\22\2\2\u00d0"+
		"\u00d2\7\23\2\2\u00d1\u00d3\5\22\n\2\u00d2\u00d1\3\2\2\2\u00d3\u00d4\3"+
		"\2\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6"+
		"\u00d9\7\24\2\2\u00d7\u00da\5$\23\2\u00d8\u00da\7\30\2\2\u00d9\u00d7\3"+
		"\2\2\2\u00d9\u00d8\3\2\2\2\u00da!\3\2\2\2\u00db\u00dc\7\17\2\2\u00dc\u00dd"+
		"\7\21\2\2\u00dd\u00de\7$\2\2\u00de\u00df\b\22\1\2\u00df\u00e3\7\35\2\2"+
		"\u00e0\u00e1\7$\2\2\u00e1\u00e4\b\22\1\2\u00e2\u00e4\7%\2\2\u00e3\u00e0"+
		"\3\2\2\2\u00e3\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e6\7\22\2\2"+
		"\u00e6\u00e8\7\23\2\2\u00e7\u00e9\5\22\n\2\u00e8\u00e7\3\2\2\2\u00e9\u00ea"+
		"\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec"+
		"\u00ef\7\24\2\2\u00ed\u00f0\5$\23\2\u00ee\u00f0\7\30\2\2\u00ef\u00ed\3"+
		"\2\2\2\u00ef\u00ee\3\2\2\2\u00f0#\3\2\2\2\u00f1\u00f5\7\20\2\2\u00f2\u00f3"+
		"\7$\2\2\u00f3\u00f6\b\23\1\2\u00f4\u00f6\7%\2\2\u00f5\u00f2\3\2\2\2\u00f5"+
		"\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f8\7\30\2\2\u00f8%\3\2\2\2"+
		"\u00f9\u00fa\7$\2\2\u00fa\u00fb\7\33\2\2\u00fb\u00fc\7\30\2\2\u00fc\'"+
		"\3\2\2\2\u00fd\u00fe\7$\2\2\u00fe\u00ff\7\34\2\2\u00ff\u0100\7\30\2\2"+
		"\u0100)\3\2\2\2\u0101\u0102\7$\2\2\u0102\u0103\b\26\1\2\u0103\u0104\7"+
		"\27\2\2\u0104\u0105\7!\2\2\u0105\u0106\7$\2\2\u0106\u0107\7!\2\2\u0107"+
		"\u0108\7\30\2\2\u0108+\3\2\2\2\u0109\u010a\5\16\b\2\u010a\u010b\7$\2\2"+
		"\u010b\u010c\b\27\1\2\u010c\u0116\7\21\2\2\u010d\u010e\7$\2\2\u010e\u0113"+
		"\b\27\1\2\u010f\u0110\7\31\2\2\u0110\u0111\7$\2\2\u0111\u0113\b\27\1\2"+
		"\u0112\u010d\3\2\2\2\u0112\u010f\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0112"+
		"\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0117\3\2\2\2\u0116\u0112\3\2\2\2\u0116"+
		"\u0117\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u0119\7\22\2\2\u0119\u011a\7"+
		"\23\2\2\u011a\u011b\5\22\n\2\u011b\u011c\7\24\2\2\u011c\u011d\7\30\2\2"+
		"\u011d-\3\2\2\2\u011e\u0123\5\60\31\2\u011f\u0120\7\32\2\2\u0120\u0122"+
		"\5\60\31\2\u0121\u011f\3\2\2\2\u0122\u0125\3\2\2\2\u0123\u0121\3\2\2\2"+
		"\u0123\u0124\3\2\2\2\u0124/\3\2\2\2\u0125\u0123\3\2\2\2\u0126\u0127\7"+
		"$\2\2\u0127\u012a\b\31\1\2\u0128\u012a\7%\2\2\u0129\u0126\3\2\2\2\u0129"+
		"\u0128\3\2\2\2\u012a\61\3\2\2\2\32=BL_nt\u0085\u0098\u009f\u00a7\u00ab"+
		"\u00be\u00c9\u00d4\u00d9\u00e3\u00ea\u00ef\u00f5\u0112\u0114\u0116\u0123"+
		"\u0129";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}