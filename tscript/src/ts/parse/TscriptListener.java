// Generated from Tscript.g by ANTLR 4.2

  package ts.parse;
  import ts.Location;
  import ts.tree.*;
  import static ts.parse.TreeBuilder.*;
  import java.util.List;
  import java.util.ArrayList;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TscriptParser}.
 */
public interface TscriptListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TscriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull TscriptParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TscriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull TscriptParser.ExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link TscriptParser#leftHandSideExpression}.
	 * @param ctx the parse tree
	 */
	void enterLeftHandSideExpression(@NotNull TscriptParser.LeftHandSideExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TscriptParser#leftHandSideExpression}.
	 * @param ctx the parse tree
	 */
	void exitLeftHandSideExpression(@NotNull TscriptParser.LeftHandSideExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link TscriptParser#sourceElements}.
	 * @param ctx the parse tree
	 */
	void enterSourceElements(@NotNull TscriptParser.SourceElementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TscriptParser#sourceElements}.
	 * @param ctx the parse tree
	 */
	void exitSourceElements(@NotNull TscriptParser.SourceElementsContext ctx);

	/**
	 * Enter a parse tree produced by {@link TscriptParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(@NotNull TscriptParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TscriptParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(@NotNull TscriptParser.UnaryExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link TscriptParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(@NotNull TscriptParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TscriptParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(@NotNull TscriptParser.ExpressionStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link TscriptParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(@NotNull TscriptParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TscriptParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(@NotNull TscriptParser.ReturnStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link TscriptParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(@NotNull TscriptParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link TscriptParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(@NotNull TscriptParser.BlockContext ctx);

	/**
	 * Enter a parse tree produced by {@link TscriptParser#callExpression}.
	 * @param ctx the parse tree
	 */
	void enterCallExpression(@NotNull TscriptParser.CallExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TscriptParser#callExpression}.
	 * @param ctx the parse tree
	 */
	void exitCallExpression(@NotNull TscriptParser.CallExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link TscriptParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpression(@NotNull TscriptParser.PrimaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TscriptParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpression(@NotNull TscriptParser.PrimaryExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link TscriptParser#varStatement}.
	 * @param ctx the parse tree
	 */
	void enterVarStatement(@NotNull TscriptParser.VarStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TscriptParser#varStatement}.
	 * @param ctx the parse tree
	 */
	void exitVarStatement(@NotNull TscriptParser.VarStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link TscriptParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(@NotNull TscriptParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TscriptParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(@NotNull TscriptParser.VariableDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link TscriptParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(@NotNull TscriptParser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TscriptParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(@NotNull TscriptParser.RelationalExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link TscriptParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void enterIterationStatement(@NotNull TscriptParser.IterationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TscriptParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void exitIterationStatement(@NotNull TscriptParser.IterationStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link TscriptParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterList(@NotNull TscriptParser.FormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link TscriptParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterList(@NotNull TscriptParser.FormalParameterListContext ctx);

	/**
	 * Enter a parse tree produced by {@link TscriptParser#labelledStatement}.
	 * @param ctx the parse tree
	 */
	void enterLabelledStatement(@NotNull TscriptParser.LabelledStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TscriptParser#labelledStatement}.
	 * @param ctx the parse tree
	 */
	void exitLabelledStatement(@NotNull TscriptParser.LabelledStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link TscriptParser#functionExpression}.
	 * @param ctx the parse tree
	 */
	void enterFunctionExpression(@NotNull TscriptParser.FunctionExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TscriptParser#functionExpression}.
	 * @param ctx the parse tree
	 */
	void exitFunctionExpression(@NotNull TscriptParser.FunctionExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link TscriptParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpression(@NotNull TscriptParser.AssignmentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TscriptParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpression(@NotNull TscriptParser.AssignmentExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link TscriptParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void enterFunctionBody(@NotNull TscriptParser.FunctionBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TscriptParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void exitFunctionBody(@NotNull TscriptParser.FunctionBodyContext ctx);

	/**
	 * Enter a parse tree produced by {@link TscriptParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(@NotNull TscriptParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TscriptParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(@NotNull TscriptParser.AdditiveExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link TscriptParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(@NotNull TscriptParser.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link TscriptParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(@NotNull TscriptParser.ArgumentListContext ctx);

	/**
	 * Enter a parse tree produced by {@link TscriptParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void enterContinueStatement(@NotNull TscriptParser.ContinueStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TscriptParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void exitContinueStatement(@NotNull TscriptParser.ContinueStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link TscriptParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void enterPrintStatement(@NotNull TscriptParser.PrintStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TscriptParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void exitPrintStatement(@NotNull TscriptParser.PrintStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link TscriptParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(@NotNull TscriptParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TscriptParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(@NotNull TscriptParser.IfStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link TscriptParser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void enterEmptyStatement(@NotNull TscriptParser.EmptyStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TscriptParser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void exitEmptyStatement(@NotNull TscriptParser.EmptyStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link TscriptParser#memberExpression}.
	 * @param ctx the parse tree
	 */
	void enterMemberExpression(@NotNull TscriptParser.MemberExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TscriptParser#memberExpression}.
	 * @param ctx the parse tree
	 */
	void exitMemberExpression(@NotNull TscriptParser.MemberExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link TscriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull TscriptParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TscriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull TscriptParser.StatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link TscriptParser#statementList}.
	 * @param ctx the parse tree
	 */
	void enterStatementList(@NotNull TscriptParser.StatementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link TscriptParser#statementList}.
	 * @param ctx the parse tree
	 */
	void exitStatementList(@NotNull TscriptParser.StatementListContext ctx);

	/**
	 * Enter a parse tree produced by {@link TscriptParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(@NotNull TscriptParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TscriptParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(@NotNull TscriptParser.ArgumentsContext ctx);

	/**
	 * Enter a parse tree produced by {@link TscriptParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(@NotNull TscriptParser.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TscriptParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(@NotNull TscriptParser.EqualityExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link TscriptParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(@NotNull TscriptParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link TscriptParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(@NotNull TscriptParser.ProgramContext ctx);

	/**
	 * Enter a parse tree produced by {@link TscriptParser#variableDeclarationList}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarationList(@NotNull TscriptParser.VariableDeclarationListContext ctx);
	/**
	 * Exit a parse tree produced by {@link TscriptParser#variableDeclarationList}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarationList(@NotNull TscriptParser.VariableDeclarationListContext ctx);

	/**
	 * Enter a parse tree produced by {@link TscriptParser#sourceElement}.
	 * @param ctx the parse tree
	 */
	void enterSourceElement(@NotNull TscriptParser.SourceElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TscriptParser#sourceElement}.
	 * @param ctx the parse tree
	 */
	void exitSourceElement(@NotNull TscriptParser.SourceElementContext ctx);

	/**
	 * Enter a parse tree produced by {@link TscriptParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void enterBreakStatement(@NotNull TscriptParser.BreakStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TscriptParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void exitBreakStatement(@NotNull TscriptParser.BreakStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link TscriptParser#newExpression}.
	 * @param ctx the parse tree
	 */
	void enterNewExpression(@NotNull TscriptParser.NewExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TscriptParser#newExpression}.
	 * @param ctx the parse tree
	 */
	void exitNewExpression(@NotNull TscriptParser.NewExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link TscriptParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(@NotNull TscriptParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TscriptParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(@NotNull TscriptParser.MultiplicativeExpressionContext ctx);
}