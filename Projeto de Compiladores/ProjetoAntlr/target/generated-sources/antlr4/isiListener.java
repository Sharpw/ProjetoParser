// Generated from isi.g4 by ANTLR 4.4

	import language.datastructures.isiSymbol;
	import language.datastructures.isiSymbolTable;
	import language.datastructures.isiVariable;
	import language.exceptions.isiSemanticException;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link isiParser}.
 */
public interface isiListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link isiParser#cmdRead}.
	 * @param ctx the parse tree
	 */
	void enterCmdRead(@NotNull isiParser.CmdReadContext ctx);
	/**
	 * Exit a parse tree produced by {@link isiParser#cmdRead}.
	 * @param ctx the parse tree
	 */
	void exitCmdRead(@NotNull isiParser.CmdReadContext ctx);
	/**
	 * Enter a parse tree produced by {@link isiParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(@NotNull isiParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link isiParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(@NotNull isiParser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link isiParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(@NotNull isiParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link isiParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(@NotNull isiParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link isiParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(@NotNull isiParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link isiParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(@NotNull isiParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link isiParser#cmdComm}.
	 * @param ctx the parse tree
	 */
	void enterCmdComm(@NotNull isiParser.CmdCommContext ctx);
	/**
	 * Exit a parse tree produced by {@link isiParser#cmdComm}.
	 * @param ctx the parse tree
	 */
	void exitCmdComm(@NotNull isiParser.CmdCommContext ctx);
	/**
	 * Enter a parse tree produced by {@link isiParser#cmdWhile}.
	 * @param ctx the parse tree
	 */
	void enterCmdWhile(@NotNull isiParser.CmdWhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link isiParser#cmdWhile}.
	 * @param ctx the parse tree
	 */
	void exitCmdWhile(@NotNull isiParser.CmdWhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link isiParser#cmdBool}.
	 * @param ctx the parse tree
	 */
	void enterCmdBool(@NotNull isiParser.CmdBoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link isiParser#cmdBool}.
	 * @param ctx the parse tree
	 */
	void exitCmdBool(@NotNull isiParser.CmdBoolContext ctx);
	/**
	 * Enter a parse tree produced by {@link isiParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(@NotNull isiParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link isiParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(@NotNull isiParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link isiParser#cmdFor}.
	 * @param ctx the parse tree
	 */
	void enterCmdFor(@NotNull isiParser.CmdForContext ctx);
	/**
	 * Exit a parse tree produced by {@link isiParser#cmdFor}.
	 * @param ctx the parse tree
	 */
	void exitCmdFor(@NotNull isiParser.CmdForContext ctx);
	/**
	 * Enter a parse tree produced by {@link isiParser#cmdFunc}.
	 * @param ctx the parse tree
	 */
	void enterCmdFunc(@NotNull isiParser.CmdFuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link isiParser#cmdFunc}.
	 * @param ctx the parse tree
	 */
	void exitCmdFunc(@NotNull isiParser.CmdFuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link isiParser#cmdCond}.
	 * @param ctx the parse tree
	 */
	void enterCmdCond(@NotNull isiParser.CmdCondContext ctx);
	/**
	 * Exit a parse tree produced by {@link isiParser#cmdCond}.
	 * @param ctx the parse tree
	 */
	void exitCmdCond(@NotNull isiParser.CmdCondContext ctx);
	/**
	 * Enter a parse tree produced by {@link isiParser#declareChar}.
	 * @param ctx the parse tree
	 */
	void enterDeclareChar(@NotNull isiParser.DeclareCharContext ctx);
	/**
	 * Exit a parse tree produced by {@link isiParser#declareChar}.
	 * @param ctx the parse tree
	 */
	void exitDeclareChar(@NotNull isiParser.DeclareCharContext ctx);
	/**
	 * Enter a parse tree produced by {@link isiParser#cmdAtt}.
	 * @param ctx the parse tree
	 */
	void enterCmdAtt(@NotNull isiParser.CmdAttContext ctx);
	/**
	 * Exit a parse tree produced by {@link isiParser#cmdAtt}.
	 * @param ctx the parse tree
	 */
	void exitCmdAtt(@NotNull isiParser.CmdAttContext ctx);
	/**
	 * Enter a parse tree produced by {@link isiParser#cmdRet}.
	 * @param ctx the parse tree
	 */
	void enterCmdRet(@NotNull isiParser.CmdRetContext ctx);
	/**
	 * Exit a parse tree produced by {@link isiParser#cmdRet}.
	 * @param ctx the parse tree
	 */
	void exitCmdRet(@NotNull isiParser.CmdRetContext ctx);
	/**
	 * Enter a parse tree produced by {@link isiParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(@NotNull isiParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link isiParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(@NotNull isiParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link isiParser#cmdWrite}.
	 * @param ctx the parse tree
	 */
	void enterCmdWrite(@NotNull isiParser.CmdWriteContext ctx);
	/**
	 * Exit a parse tree produced by {@link isiParser#cmdWrite}.
	 * @param ctx the parse tree
	 */
	void exitCmdWrite(@NotNull isiParser.CmdWriteContext ctx);
	/**
	 * Enter a parse tree produced by {@link isiParser#cmdChar}.
	 * @param ctx the parse tree
	 */
	void enterCmdChar(@NotNull isiParser.CmdCharContext ctx);
	/**
	 * Exit a parse tree produced by {@link isiParser#cmdChar}.
	 * @param ctx the parse tree
	 */
	void exitCmdChar(@NotNull isiParser.CmdCharContext ctx);
	/**
	 * Enter a parse tree produced by {@link isiParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(@NotNull isiParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link isiParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(@NotNull isiParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link isiParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(@NotNull isiParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link isiParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(@NotNull isiParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link isiParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterCmd(@NotNull isiParser.CmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link isiParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitCmd(@NotNull isiParser.CmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link isiParser#declareVar}.
	 * @param ctx the parse tree
	 */
	void enterDeclareVar(@NotNull isiParser.DeclareVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link isiParser#declareVar}.
	 * @param ctx the parse tree
	 */
	void exitDeclareVar(@NotNull isiParser.DeclareVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link isiParser#declareNum}.
	 * @param ctx the parse tree
	 */
	void enterDeclareNum(@NotNull isiParser.DeclareNumContext ctx);
	/**
	 * Exit a parse tree produced by {@link isiParser#declareNum}.
	 * @param ctx the parse tree
	 */
	void exitDeclareNum(@NotNull isiParser.DeclareNumContext ctx);
	/**
	 * Enter a parse tree produced by {@link isiParser#cmdMM}.
	 * @param ctx the parse tree
	 */
	void enterCmdMM(@NotNull isiParser.CmdMMContext ctx);
	/**
	 * Exit a parse tree produced by {@link isiParser#cmdMM}.
	 * @param ctx the parse tree
	 */
	void exitCmdMM(@NotNull isiParser.CmdMMContext ctx);
	/**
	 * Enter a parse tree produced by {@link isiParser#cmdLL}.
	 * @param ctx the parse tree
	 */
	void enterCmdLL(@NotNull isiParser.CmdLLContext ctx);
	/**
	 * Exit a parse tree produced by {@link isiParser#cmdLL}.
	 * @param ctx the parse tree
	 */
	void exitCmdLL(@NotNull isiParser.CmdLLContext ctx);
}