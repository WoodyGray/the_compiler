// Generated from com.kubadziworski.antlr\Wlang.g4 by ANTLR 4.3
package com.woody.antlr;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link EnkelParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface WlangVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code UnnamedArgumentsList}
	 * labeled alternative in {@link EnkelParser#argumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnnamedArgumentsList(@NotNull WlangParser.UnnamedArgumentsListContext ctx);

	/**
	 * Visit a parse tree produced by the {@code Add}
	 * labeled alternative in {@link EnkelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd(@NotNull WlangParser.AddContext ctx);

	/**
	 * Visit a parse tree produced by the {@code ReturnVoid}
	 * labeled alternative in {@link EnkelParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnVoid(@NotNull WlangParser.ReturnVoidContext ctx);

	/**
	 * Visit a parse tree produced by {@link EnkelParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument(@NotNull WlangParser.ArgumentContext ctx);

	/**
	 * Visit a parse tree produced by {@link EnkelParser#variableReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableReference(@NotNull WlangParser.VariableReferenceContext ctx);

	/**
	 * Visit a parse tree produced by {@link EnkelParser#forConditions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForConditions(@NotNull WlangParser.ForConditionsContext ctx);

	/**
	 * Visit a parse tree produced by {@link EnkelParser#className}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassName(@NotNull WlangParser.ClassNameContext ctx);

	/**
	 * Visit a parse tree produced by {@link EnkelParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(@NotNull WlangParser.TypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link EnkelParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(@NotNull WlangParser.ClassDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by the {@code Divide}
	 * labeled alternative in {@link EnkelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivide(@NotNull WlangParser.DivideContext ctx);

	/**
	 * Visit a parse tree produced by the {@code VarReference}
	 * labeled alternative in {@link EnkelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarReference(@NotNull WlangParser.VarReferenceContext ctx);

	/**
	 * Visit a parse tree produced by the {@code ReturnWithValue}
	 * labeled alternative in {@link EnkelParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnWithValue(@NotNull WlangParser.ReturnWithValueContext ctx);

	/**
	 * Visit a parse tree produced by {@link EnkelParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(@NotNull WlangParser.FunctionContext ctx);

	/**
	 * Visit a parse tree produced by {@link EnkelParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(@NotNull WlangParser.ParameterContext ctx);

	/**
	 * Visit a parse tree produced by the {@code Multiply}
	 * labeled alternative in {@link EnkelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiply(@NotNull WlangParser.MultiplyContext ctx);

	/**
	 * Visit a parse tree produced by {@link EnkelParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(@NotNull WlangParser.StatementContext ctx);

	/**
	 * Visit a parse tree produced by the {@code Supercall}
	 * labeled alternative in {@link EnkelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSupercall(@NotNull WlangParser.SupercallContext ctx);

	/**
	 * Visit a parse tree produced by {@link EnkelParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBody(@NotNull WlangParser.ClassBodyContext ctx);

	/**
	 * Visit a parse tree produced by {@link EnkelParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(@NotNull WlangParser.BlockContext ctx);

	/**
	 * Visit a parse tree produced by the {@code FunctionCall}
	 * labeled alternative in {@link EnkelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(@NotNull WlangParser.FunctionCallContext ctx);

	/**
	 * Visit a parse tree produced by the {@code ConstructorCall}
	 * labeled alternative in {@link EnkelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorCall(@NotNull WlangParser.ConstructorCallContext ctx);

	/**
	 * Visit a parse tree produced by {@link EnkelParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveType(@NotNull WlangParser.PrimitiveTypeContext ctx);

	/**
	 * Visit a parse tree produced by the {@code NamedArgumentsList}
	 * labeled alternative in {@link EnkelParser#argumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedArgumentsList(@NotNull WlangParser.NamedArgumentsListContext ctx);

	/**
	 * Visit a parse tree produced by {@link EnkelParser#namedArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedArgument(@NotNull WlangParser.NamedArgumentContext ctx);

	/**
	 * Visit a parse tree produced by {@link EnkelParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(@NotNull WlangParser.ValueContext ctx);

	/**
	 * Visit a parse tree produced by the {@code ValueExpr}
	 * labeled alternative in {@link EnkelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueExpr(@NotNull WlangParser.ValueExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link EnkelParser#functionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionName(@NotNull WlangParser.FunctionNameContext ctx);

	/**
	 * Visit a parse tree produced by {@link EnkelParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(@NotNull WlangParser.AssignmentContext ctx);

	/**
	 * Visit a parse tree produced by {@link EnkelParser#qualifiedName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedName(@NotNull WlangParser.QualifiedNameContext ctx);

	/**
	 * Visit a parse tree produced by the {@code ConditionalExpression}
	 * labeled alternative in {@link EnkelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalExpression(@NotNull WlangParser.ConditionalExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link EnkelParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(@NotNull WlangParser.ForStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link EnkelParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(@NotNull WlangParser.IfStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link EnkelParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(@NotNull WlangParser.VariableDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by the {@code Substract}
	 * labeled alternative in {@link EnkelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubstract(@NotNull WlangParser.SubstractContext ctx);

	/**
	 * Visit a parse tree produced by {@link EnkelParser#printStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStatement(@NotNull WlangParser.PrintStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link EnkelParser#compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilationUnit(@NotNull WlangParser.CompilationUnitContext ctx);

	/**
	 * Visit a parse tree produced by {@link EnkelParser#field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField(@NotNull WlangParser.FieldContext ctx);

	/**
	 * Visit a parse tree produced by {@link EnkelParser#parameterWithDefaultValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterWithDefaultValue(@NotNull WlangParser.ParameterWithDefaultValueContext ctx);

	/**
	 * Visit a parse tree produced by {@link EnkelParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(@NotNull WlangParser.NameContext ctx);

	/**
	 * Visit a parse tree produced by {@link EnkelParser#parametersList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametersList(@NotNull WlangParser.ParametersListContext ctx);

	/**
	 * Visit a parse tree produced by {@link EnkelParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclaration(@NotNull WlangParser.FunctionDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link EnkelParser#classType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassType(@NotNull WlangParser.ClassTypeContext ctx);
}