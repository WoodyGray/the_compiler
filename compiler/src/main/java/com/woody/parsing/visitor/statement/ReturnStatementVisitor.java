package com.woody.parsing.visitor.statement;

import com.woody.antlr.WlangParser.ReturnVoidContext;
import com.woody.antlr.WlangParser.ReturnWithValueContext;
import com.woody.domain.node.expression.EmptyExpression;
import com.woody.domain.node.expression.Expression;
import com.woody.domain.node.statement.ReturnStatement;
import com.woody.domain.type.BultInType;
import com.woody.parsing.visitor.expression.ExpressionVisitor;
import org.antlr.v4.runtime.misc.NotNull;

public class ReturnStatementVisitor extends com.woody.antlr.WlangBaseVisitor<ReturnStatement> {
    private final ExpressionVisitor expressionVisitor;

    public ReturnStatementVisitor(ExpressionVisitor expressionVisitor) {
        this.expressionVisitor = expressionVisitor;
    }

    @Override
    public ReturnStatement visitReturnVoid(@NotNull ReturnVoidContext ctx) {
        return new ReturnStatement(new EmptyExpression(BultInType.VOID));
    }

    @Override
    public ReturnStatement visitReturnWithValue(@NotNull ReturnWithValueContext ctx) {
        Expression expression = ctx.expression().accept(expressionVisitor);
        return new ReturnStatement(expression);
    }
}