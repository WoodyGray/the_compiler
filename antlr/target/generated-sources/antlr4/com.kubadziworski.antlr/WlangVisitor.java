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
	T visitUnnamedArgumentsList(@NotNull com.woody.antlr.WlangParser.UnnamedArgumentsListContext ctx);

	/**
	 * Visit a parse tree produced by the {@code Add}
	 * labeled alternative in {@link EnkelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd(@NotNull com.woody.antlr.WlangParser.AddContext ctx);

	/**
	 * Visit a parse tree produced by the {@code ReturnVoid}
	 * labeled alternative in {@link EnkelParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnVoid(@NotNull com.woody.antlr.WlangParser.ReturnVoidContext ctx);

	/**
	 * Visit a parse tree produced by {@link EnkelParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument(@NotNull com.woody.antlr.WlangParser.ArgumentContext ctx);

	/**
	 * Visit a parse tree produced by {@link EnkelParser#variableReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableReference(@NotNull com.woody.antlr.WlangParser.VariableReferenceContext ctx);

	/**
	 * Visit a parse tree produced by {@link EnkelParser#forConditions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForConditions(@NotNull com.woody.antlr.WlangParser.ForConditionsContext ctx);

	/**
	 * Visit a parse tree produced by {@link EnkelParser#className}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassName(@NotNull com.woody.antlr.WlangParser.ClassNameContext ctx);

	/**
	 * Visit a parse tree produced by {@link EnkelParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(@NotNull com.woody.antlr.WlangParser.TypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link EnkelParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(@NotNull com.woody.antlr.WlangParser.ClassDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by the {@code Divide}
	 * labeled alternative in {@link EnkelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivide(@NotNull com.woody.antlr.WlangParser.DivideContext ctx);

	/**
	 * Visit a parse tree produced by the {@code VarReference}
	 * labeled alternative in {@link EnkelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarReference(@NotNull com.woody.antlr.WlangParser.VarReferenceContext ctx);

	/**
	 * Visit a parse tree produced by the {@code ReturnWithValue}
	 * labeled alternative in {@link EnkelParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnWithValue(@NotNull com.woody.antlr.WlangParser.ReturnWithValueContext ctx);

	/**
	 * Visit a parse tree produced by {@link EnkelParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(@NotNull com.woody.antlr.WlangParser.FunctionContext ctx);

	/**
	 * Visit a parse tree produced by {@link EnkelParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(@NotNull com.woody.antlr.WlangParser.ParameterContext ctx);

	/**
	 * Visit a parse tree produced by the {@code Multiply}
	 * labeled alternative in {@link EnkelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiply(@NotNull com.woody.antlr.WlangParser.MultiplyContext ctx);

	/**
	 * Visit a parse tree produced by {@link EnkelParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(@NotNull com.woody.antlr.WlangParser.StatementContext ctx);

	/**
	 * Visit a parse tree produced by the {@code Supercall}
	 * labeled alternative in {@link EnkelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSupercall(@NotNull com.woody.antlr.WlangParser.SupercallContext ctx);

	/**
	 * Visit a parse tree produced by {@link EnkelParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBody(@NotNull com.woody.antlr.WlangParser.ClassBodyContext ctx);

	/**
	 * Visit a parse tree produced by {@link EnkelParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(@NotNull com.woody.antlr.WlangParser.BlockContext ctx);

	/**
	 * Visit a parse tree produced by the {@code FunctionCall}
	 * labeled alternative in {@link EnkelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(@NotNull com.woody.antlr.WlangParser.FunctionCallContext ctx);

	/**
	 * Visit a parse tree produced by the {@code ConstructorCall}
	 * labeled alternative in {@link EnkelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorCall(@NotNull com.woody.antlr.WlangParser.ConstructorCallContext ctx);

	/**
	 * Visit a parse tree produced by {@link EnkelParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveType(@NotNull com.woody.antlr.WlangParser.PrimitiveTypeContext ctx);

	/**
	 * Visit a parse tree produced by the {@code NamedArgumentsList}
	 * labeled alternative in {@link EnkelParser#argumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedArgumentsList(@NotNull com.woody.antlr.WlangParser.NamedArgumentsListContext ctx);

	/**
	 * Visit a parse tree produced by {@link EnkelParser#namedArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedArgument(@NotNull com.woody.antlr.WlangParser.NamedArgumentContext ctx);

	/**
	 * Visit a parse tree produced by {@link EnkelParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(@NotNull com.woody.antlr.WlangParser.ValueContext ctx);

	/**
	 * Visit a parse tree produced by the {@code ValueExpr}
	 * labeled alternative in {@link EnkelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueExpr(@NotNull com.woody.antlr.WlangParser.ValueExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link EnkelParser#functionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionName(@NotNull com.woody.antlr.WlangParser.FunctionNameContext ctx);

	/**
	 * Visit a parse tree produced by {@link EnkelParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(@NotNull com.woody.antlr.WlangParser.AssignmentContext ctx);

	/**
	 * Visit a parse tree produced by {@link EnkelParser#qualifiedName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedName(@NotNull com.woody.antlr.WlangParser.QualifiedNameContext ctx);

	/**
	 * Visit a parse tree produced by the {@code ConditionalExpression}
	 * labeled alternative in {@link EnkelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalExpression(@NotNull com.woody.antlr.WlangParser.ConditionalExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link EnkelParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(@NotNull com.woody.antlr.WlangParser.ForStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link EnkelParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(@NotNull com.woody.antlr.WlangParser.IfStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link EnkelParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(@NotNull com.woody.antlr.WlangParser.VariableDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by the {@code Substract}
	 * labeled alternative in {@link EnkelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubstract(@NotNull com.woody.antlr.WlangParser.SubstractContext ctx);

	/**
	 * Visit a parse tree produced by {@link EnkelParser#printStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStatement(@NotNull com.woody.antlr.WlangParser.PrintStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link EnkelParser#compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilationUnit(@NotNull com.woody.antlr.WlangParser.CompilationUnitContext ctx);

	/**
	 * Visit a parse tree produced by {@link EnkelParser#field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField(@NotNull com.woody.antlr.WlangParser.FieldContext ctx);

	/**
	 * Visit a parse tree produced by {@link EnkelParser#parameterWithDefaultValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterWithDefaultValue(@NotNull com.woody.antlr.WlangParser.ParameterWithDefaultValueContext ctx);

	/**
	 * Visit a parse tree produced by {@link EnkelParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(@NotNull com.woody.antlr.WlangParser.NameContext ctx);

	/**
	 * Visit a parse tree produced by {@link EnkelParser#parametersList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametersList(@NotNull com.woody.antlr.WlangParser.ParametersListContext ctx);

	/**
	 * Visit a parse tree produced by {@link EnkelParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclaration(@NotNull com.woody.antlr.WlangParser.FunctionDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link EnkelParser#classType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassType(@NotNull com.woody.antlr.WlangParser.ClassTypeContext ctx);
}