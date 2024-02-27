// Generated from D:/programs/java/github/the_compiler/test-script/test-script/src/main/java/antlr/TestScript.g4 by ANTLR 4.13.1
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TestScriptParser}.
 */
public interface TestScriptListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TestScriptParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(TestScriptParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestScriptParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(TestScriptParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(TestScriptParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(TestScriptParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestScriptParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(TestScriptParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestScriptParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(TestScriptParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestScriptParser#arithmeticOperation}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticOperation(TestScriptParser.ArithmeticOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestScriptParser#arithmeticOperation}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticOperation(TestScriptParser.ArithmeticOperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestScriptParser#logicalOperation}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOperation(TestScriptParser.LogicalOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestScriptParser#logicalOperation}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOperation(TestScriptParser.LogicalOperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestScriptParser#conditionalStatement}.
	 * @param ctx the parse tree
	 */
	void enterConditionalStatement(TestScriptParser.ConditionalStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestScriptParser#conditionalStatement}.
	 * @param ctx the parse tree
	 */
	void exitConditionalStatement(TestScriptParser.ConditionalStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestScriptParser#loopStatement}.
	 * @param ctx the parse tree
	 */
	void enterLoopStatement(TestScriptParser.LoopStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestScriptParser#loopStatement}.
	 * @param ctx the parse tree
	 */
	void exitLoopStatement(TestScriptParser.LoopStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestScriptParser#basicOutput}.
	 * @param ctx the parse tree
	 */
	void enterBasicOutput(TestScriptParser.BasicOutputContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestScriptParser#basicOutput}.
	 * @param ctx the parse tree
	 */
	void exitBasicOutput(TestScriptParser.BasicOutputContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestScriptParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(TestScriptParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestScriptParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(TestScriptParser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestScriptParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(TestScriptParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestScriptParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(TestScriptParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestScriptParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(TestScriptParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestScriptParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(TestScriptParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestScriptParser#functionName}.
	 * @param ctx the parse tree
	 */
	void enterFunctionName(TestScriptParser.FunctionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestScriptParser#functionName}.
	 * @param ctx the parse tree
	 */
	void exitFunctionName(TestScriptParser.FunctionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestScriptParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(TestScriptParser.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestScriptParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(TestScriptParser.ArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestScriptParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(TestScriptParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestScriptParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(TestScriptParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(TestScriptParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(TestScriptParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestScriptParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(TestScriptParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestScriptParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(TestScriptParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestScriptParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(TestScriptParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestScriptParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(TestScriptParser.NumberContext ctx);
}