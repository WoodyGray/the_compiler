// Generated from D:/programs/java/github/the_compiler/test-script/test-script/src/main/java/antlr/TestScript.g4 by ANTLR 4.13.1
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link TestScriptParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TestScriptVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link TestScriptParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(TestScriptParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestScriptParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(TestScriptParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestScriptParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(TestScriptParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestScriptParser#arithmeticOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticOperation(TestScriptParser.ArithmeticOperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestScriptParser#logicalOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalOperation(TestScriptParser.LogicalOperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestScriptParser#conditionalStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalStatement(TestScriptParser.ConditionalStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestScriptParser#loopStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopStatement(TestScriptParser.LoopStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestScriptParser#basicOutput}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasicOutput(TestScriptParser.BasicOutputContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestScriptParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclaration(TestScriptParser.FunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestScriptParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(TestScriptParser.ParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestScriptParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(TestScriptParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestScriptParser#functionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionName(TestScriptParser.FunctionNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestScriptParser#argumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentList(TestScriptParser.ArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestScriptParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(TestScriptParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(TestScriptParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestScriptParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(TestScriptParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestScriptParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(TestScriptParser.NumberContext ctx);
}