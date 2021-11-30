// Generated from isi.g4 by ANTLR 4.9.2
package language.parser;

	import language.datastructures.isiSymbol;
	import language.datastructures.isiSymbolTable;
	import language.datastructures.isiVariable;
	import language.exceptions.isiSemanticException;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link isiParser}.
 */
public interface isiListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link isiParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(isiParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link isiParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(isiParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link isiParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(isiParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link isiParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(isiParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link isiParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(isiParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link isiParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(isiParser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link isiParser#declareVar}.
	 * @param ctx the parse tree
	 */
	void enterDeclareVar(isiParser.DeclareVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link isiParser#declareVar}.
	 * @param ctx the parse tree
	 */
	void exitDeclareVar(isiParser.DeclareVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link isiParser#declareNum}.
	 * @param ctx the parse tree
	 */
	void enterDeclareNum(isiParser.DeclareNumContext ctx);
	/**
	 * Exit a parse tree produced by {@link isiParser#declareNum}.
	 * @param ctx the parse tree
	 */
	void exitDeclareNum(isiParser.DeclareNumContext ctx);
	/**
	 * Enter a parse tree produced by {@link isiParser#declareChar}.
	 * @param ctx the parse tree
	 */
	void enterDeclareChar(isiParser.DeclareCharContext ctx);
	/**
	 * Exit a parse tree produced by {@link isiParser#declareChar}.
	 * @param ctx the parse tree
	 */
	void exitDeclareChar(isiParser.DeclareCharContext ctx);
	/**
	 * Enter a parse tree produced by {@link isiParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(isiParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link isiParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(isiParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link isiParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(isiParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link isiParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(isiParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link isiParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterCmd(isiParser.CmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link isiParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitCmd(isiParser.CmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link isiParser#cmdComm}.
	 * @param ctx the parse tree
	 */
	void enterCmdComm(isiParser.CmdCommContext ctx);
	/**
	 * Exit a parse tree produced by {@link isiParser#cmdComm}.
	 * @param ctx the parse tree
	 */
	void exitCmdComm(isiParser.CmdCommContext ctx);
	/**
	 * Enter a parse tree produced by {@link isiParser#cmdRead}.
	 * @param ctx the parse tree
	 */
	void enterCmdRead(isiParser.CmdReadContext ctx);
	/**
	 * Exit a parse tree produced by {@link isiParser#cmdRead}.
	 * @param ctx the parse tree
	 */
	void exitCmdRead(isiParser.CmdReadContext ctx);
	/**
	 * Enter a parse tree produced by {@link isiParser#cmdWrite}.
	 * @param ctx the parse tree
	 */
	void enterCmdWrite(isiParser.CmdWriteContext ctx);
	/**
	 * Exit a parse tree produced by {@link isiParser#cmdWrite}.
	 * @param ctx the parse tree
	 */
	void exitCmdWrite(isiParser.CmdWriteContext ctx);
	/**
	 * Enter a parse tree produced by {@link isiParser#cmdAtt}.
	 * @param ctx the parse tree
	 */
	void enterCmdAtt(isiParser.CmdAttContext ctx);
	/**
	 * Exit a parse tree produced by {@link isiParser#cmdAtt}.
	 * @param ctx the parse tree
	 */
	void exitCmdAtt(isiParser.CmdAttContext ctx);
	/**
	 * Enter a parse tree produced by {@link isiParser#cmdCond}.
	 * @param ctx the parse tree
	 */
	void enterCmdCond(isiParser.CmdCondContext ctx);
	/**
	 * Exit a parse tree produced by {@link isiParser#cmdCond}.
	 * @param ctx the parse tree
	 */
	void exitCmdCond(isiParser.CmdCondContext ctx);
	/**
	 * Enter a parse tree produced by {@link isiParser#cmdBool}.
	 * @param ctx the parse tree
	 */
	void enterCmdBool(isiParser.CmdBoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link isiParser#cmdBool}.
	 * @param ctx the parse tree
	 */
	void exitCmdBool(isiParser.CmdBoolContext ctx);
	/**
	 * Enter a parse tree produced by {@link isiParser#cmdFor}.
	 * @param ctx the parse tree
	 */
	void enterCmdFor(isiParser.CmdForContext ctx);
	/**
	 * Exit a parse tree produced by {@link isiParser#cmdFor}.
	 * @param ctx the parse tree
	 */
	void exitCmdFor(isiParser.CmdForContext ctx);
	/**
	 * Enter a parse tree produced by {@link isiParser#cmdWhile}.
	 * @param ctx the parse tree
	 */
	void enterCmdWhile(isiParser.CmdWhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link isiParser#cmdWhile}.
	 * @param ctx the parse tree
	 */
	void exitCmdWhile(isiParser.CmdWhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link isiParser#cmdRet}.
	 * @param ctx the parse tree
	 */
	void enterCmdRet(isiParser.CmdRetContext ctx);
	/**
	 * Exit a parse tree produced by {@link isiParser#cmdRet}.
	 * @param ctx the parse tree
	 */
	void exitCmdRet(isiParser.CmdRetContext ctx);
	/**
	 * Enter a parse tree produced by {@link isiParser#cmdMM}.
	 * @param ctx the parse tree
	 */
	void enterCmdMM(isiParser.CmdMMContext ctx);
	/**
	 * Exit a parse tree produced by {@link isiParser#cmdMM}.
	 * @param ctx the parse tree
	 */
	void exitCmdMM(isiParser.CmdMMContext ctx);
	/**
	 * Enter a parse tree produced by {@link isiParser#cmdLL}.
	 * @param ctx the parse tree
	 */
	void enterCmdLL(isiParser.CmdLLContext ctx);
	/**
	 * Exit a parse tree produced by {@link isiParser#cmdLL}.
	 * @param ctx the parse tree
	 */
	void exitCmdLL(isiParser.CmdLLContext ctx);
	/**
	 * Enter a parse tree produced by {@link isiParser#cmdChar}.
	 * @param ctx the parse tree
	 */
	void enterCmdChar(isiParser.CmdCharContext ctx);
	/**
	 * Exit a parse tree produced by {@link isiParser#cmdChar}.
	 * @param ctx the parse tree
	 */
	void exitCmdChar(isiParser.CmdCharContext ctx);
	/**
	 * Enter a parse tree produced by {@link isiParser#cmdFunc}.
	 * @param ctx the parse tree
	 */
	void enterCmdFunc(isiParser.CmdFuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link isiParser#cmdFunc}.
	 * @param ctx the parse tree
	 */
	void exitCmdFunc(isiParser.CmdFuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link isiParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(isiParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link isiParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(isiParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link isiParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(isiParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link isiParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(isiParser.TermContext ctx);
}