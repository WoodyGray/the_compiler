package com.woody.parsing.visitor.expression;

import com.woody.antlr.EnkelBaseVisitor;
import com.woody.antlr.EnkelParser;
import com.woody.antlr.EnkelParser.ConditionalExpressionContext;
import com.woody.antlr.EnkelParser.ExpressionContext;
import com.woody.domain.node.expression.ConditionalExpression;
import com.woody.domain.node.expression.Expression;
import com.woody.domain.node.expression.Value;
import com.woody.domain.CompareSign;
import com.woody.domain.type.BultInType;
import org.antlr.v4.runtime.misc.NotNull;

public class ConditionalExpressionVisitor extends EnkelBaseVisitor<ConditionalExpression> {
    private final ExpressionVisitor expressionVisitor;

    public ConditionalExpressionVisitor(ExpressionVisitor expressionVisitor) {
        this.expressionVisitor = expressionVisitor;
    }

    @Override
    public ConditionalExpression visitConditionalExpression(@NotNull ConditionalExpressionContext ctx) {
        ExpressionContext leftExpressionCtx = ctx.expression(0);
        ExpressionContext rightExpressionCtx = ctx.expression(1);
        Expression leftExpression = leftExpressionCtx.accept(expressionVisitor);
        Expression rightExpression = rightExpressionCtx != null ? rightExpressionCtx.accept(expressionVisitor) : new Value(BultInType.INT, "0");
        CompareSign cmpSign = ctx.cmp != null ? CompareSign.fromString(ctx.cmp.getText()) : CompareSign.NOT_EQUAL;
        return new ConditionalExpression(leftExpression, rightExpression, cmpSign);
    }
}