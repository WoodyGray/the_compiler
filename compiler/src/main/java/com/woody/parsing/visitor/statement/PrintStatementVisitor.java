package com.woody.parsing.visitor.statement;

import com.woody.antlr.WlangParser.ExpressionContext;
import com.woody.antlr.WlangParser.PrintStatementContext;
import com.woody.domain.node.expression.Expression;
import com.woody.domain.node.statement.PrintStatement;
import com.woody.parsing.visitor.expression.ExpressionVisitor;
import org.antlr.v4.runtime.misc.NotNull;

public class PrintStatementVisitor extends com.woody.antlr.WlangBaseVisitor<PrintStatement> {
    private final ExpressionVisitor expressionVisitor;

    public PrintStatementVisitor(ExpressionVisitor expressionVisitor) {
        this.expressionVisitor = expressionVisitor;
    }

    @Override
    public PrintStatement visitPrintStatement(@NotNull PrintStatementContext ctx) {
        ExpressionContext expressionCtx = ctx.expression();
        Expression expression = expressionCtx.accept(expressionVisitor);
        return new PrintStatement(expression);
    }
}