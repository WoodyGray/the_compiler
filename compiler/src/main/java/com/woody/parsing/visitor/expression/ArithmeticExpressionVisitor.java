package com.woody.parsing.visitor.expression;

import com.woody.antlr.WlangParser.AddContext;
import com.woody.antlr.WlangParser.DivideContext;
import com.woody.antlr.WlangParser.ExpressionContext;
import com.woody.antlr.WlangParser.MultiplyContext;
import com.woody.antlr.WlangParser.SubstractContext;
import com.woody.domain.node.expression.Expression;
import com.woody.domain.node.expression.arthimetic.*;
import org.antlr.v4.runtime.misc.NotNull;

public class ArithmeticExpressionVisitor extends com.woody.antlr.WlangBaseVisitor<ArthimeticExpression> {
    private final ExpressionVisitor expressionVisitor;

    public ArithmeticExpressionVisitor(ExpressionVisitor expressionVisitor) {
        this.expressionVisitor = expressionVisitor;
    }

    @Override
    public ArthimeticExpression visitAdd(@NotNull AddContext ctx) {
        ExpressionContext leftExpression = ctx.expression(0);
        ExpressionContext rightExpression = ctx.expression(1);

        Expression leftExpress = leftExpression.accept(expressionVisitor);
        Expression rightExpress = rightExpression.accept(expressionVisitor);

        return new Addition(leftExpress, rightExpress);
    }

    @Override
    public ArthimeticExpression visitMultiply(@NotNull MultiplyContext ctx) {
        ExpressionContext leftExpression = ctx.expression(0);
        ExpressionContext rightExpression = ctx.expression(1);

        Expression leftExpress = leftExpression.accept(expressionVisitor);
        Expression rightExpress = rightExpression.accept(expressionVisitor);

        return new Multiplication(leftExpress, rightExpress);
    }

    @Override
    public ArthimeticExpression visitSubstract(@NotNull SubstractContext ctx) {
        ExpressionContext leftExpression = ctx.expression(0);
        ExpressionContext rightExpression = ctx.expression(1);

        Expression leftExpress = leftExpression.accept(expressionVisitor);
        Expression rightExpress = rightExpression.accept(expressionVisitor);

        return new Substraction(leftExpress, rightExpress);
    }

    @Override
    public ArthimeticExpression visitDivide(@NotNull DivideContext ctx) {
        ExpressionContext leftExpression = ctx.expression(0);
        ExpressionContext rightExpression = ctx.expression(1);

        Expression leftExpress = leftExpression.accept(expressionVisitor);
        Expression rightExpress = rightExpression.accept(expressionVisitor);

        return new Division(leftExpress, rightExpress);
    }
}