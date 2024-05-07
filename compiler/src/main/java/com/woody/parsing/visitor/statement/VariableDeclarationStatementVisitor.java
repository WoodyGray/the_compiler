package com.woody.parsing.visitor.statement;

import com.woody.antlr.WlangParser.ExpressionContext;
import com.woody.antlr.WlangParser.VariableDeclarationContext;
import com.woody.domain.node.expression.Expression;
import com.woody.domain.scope.LocalVariable;
import com.woody.domain.scope.Scope;
import com.woody.domain.node.statement.VariableDeclaration;
import com.woody.parsing.visitor.expression.ExpressionVisitor;
import org.antlr.v4.runtime.misc.NotNull;

public class VariableDeclarationStatementVisitor extends com.woody.antlr.WlangBaseVisitor<VariableDeclaration> {
    private final ExpressionVisitor expressionVisitor;
    private final Scope scope;

    public VariableDeclarationStatementVisitor(ExpressionVisitor expressionVisitor, Scope scope) {
        this.expressionVisitor = expressionVisitor;
        this.scope = scope;
    }

    @Override
    public VariableDeclaration visitVariableDeclaration(@NotNull VariableDeclarationContext ctx) {
        String varName = ctx.name().getText();
        ExpressionContext expressionCtx = ctx.expression();
        Expression expression = expressionCtx.accept(expressionVisitor);
        scope.addLocalVariable(new LocalVariable(varName, expression.getType()));
        return new VariableDeclaration(varName, expression);
    }
}