package com.woody.parsing.visitor.statement;

import com.woody.domain.node.expression.Expression;
import com.woody.domain.node.statement.Assignment;
import com.woody.parsing.visitor.expression.ExpressionVisitor;
import org.antlr.v4.runtime.misc.NotNull;

public class AssignmentStatementVisitor extends com.woody.antlr.WlangBaseVisitor<Assignment> {
    private final ExpressionVisitor expressionVisitor;

    public AssignmentStatementVisitor(ExpressionVisitor expressionVisitor) {
        this.expressionVisitor = expressionVisitor;
    }

    @Override
    public Assignment visitAssignment(@NotNull com.woody.antlr.WlangParser.AssignmentContext ctx) {
        com.woody.antlr.WlangParser.ExpressionContext expressionCtx = ctx.expression();
        Expression expression = expressionCtx.accept(expressionVisitor);
        String varName = ctx.name().getText();
        return new Assignment(varName, expression);
    }
}