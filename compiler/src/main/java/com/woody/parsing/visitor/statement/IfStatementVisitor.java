package com.woody.parsing.visitor.statement;

import com.woody.antlr.WlangParser.ExpressionContext;
import com.woody.antlr.WlangParser.IfStatementContext;
import com.woody.domain.node.expression.Expression;
import com.woody.domain.node.statement.IfStatement;
import com.woody.domain.node.statement.Statement;
import com.woody.parsing.visitor.expression.ExpressionVisitor;
import org.antlr.v4.runtime.misc.NotNull;

public class IfStatementVisitor extends com.woody.antlr.WlangBaseVisitor<IfStatement> {
    private final StatementVisitor statementVisitor;
    private final ExpressionVisitor expressionVisitor;

    public IfStatementVisitor(StatementVisitor statementVisitor, ExpressionVisitor expressionVisitor) {
        this.statementVisitor = statementVisitor;
        this.expressionVisitor = expressionVisitor;
    }

    @Override
    public IfStatement visitIfStatement(@NotNull IfStatementContext ctx) {
        ExpressionContext conditionalExpressionContext = ctx.expression();
        Expression condition = conditionalExpressionContext.accept(expressionVisitor);
        Statement trueStatement = ctx.trueStatement.accept(statementVisitor);
        if (ctx.falseStatement != null) {
            Statement falseStatement = ctx.falseStatement.accept(statementVisitor);
            return new IfStatement(condition, trueStatement, falseStatement);
        }
        return new IfStatement(condition, trueStatement);
    }
}