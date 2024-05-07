package com.woody.parsing.visitor.statement;

import com.woody.antlr.WlangParser.ForConditionsContext;
import com.woody.antlr.WlangParser.ForStatementContext;
import com.woody.antlr.WlangParser.VariableReferenceContext;
import com.woody.domain.node.expression.Expression;
import com.woody.domain.node.statement.RangedForStatement;
import com.woody.domain.scope.LocalVariable;
import com.woody.domain.scope.Scope;
import com.woody.domain.node.statement.Assignment;
import com.woody.domain.node.statement.Statement;
import com.woody.domain.node.statement.VariableDeclaration;
import com.woody.parsing.visitor.expression.ExpressionVisitor;
import org.antlr.v4.runtime.misc.NotNull;

/**
 * Created by kuba on 23.04.16.
 */
public class ForStatementVisitor extends com.woody.antlr.WlangBaseVisitor<RangedForStatement> {
    private final Scope scope;
    private final ExpressionVisitor expressionVisitor;

    public ForStatementVisitor(Scope scope) {
        this.scope = scope;
        expressionVisitor = new ExpressionVisitor(this.scope);
    }

    @Override
    public RangedForStatement visitForStatement(@NotNull ForStatementContext ctx) {
        Scope newScope = new Scope(scope);
        ForConditionsContext forExpressionContext = ctx.forConditions();
        Expression startExpression = forExpressionContext.startExpr.accept(expressionVisitor);
        Expression endExpression = forExpressionContext.endExpr.accept(expressionVisitor);
        VariableReferenceContext iterator = forExpressionContext.iterator;
        StatementVisitor statementVisitor = new StatementVisitor(newScope);
        String varName = iterator.getText();
        if(newScope.isLocalVariableExists(varName)) {
            Statement iteratorVariable = new Assignment(varName, startExpression);
            Statement statement = ctx.statement().accept(statementVisitor);
            return new RangedForStatement(iteratorVariable, startExpression, endExpression,statement, varName, newScope);
        } else {
            newScope.addLocalVariable(new LocalVariable(varName,startExpression.getType()));
            Statement iteratorVariable = new VariableDeclaration(varName,startExpression);
            Statement statement = ctx.statement().accept(statementVisitor);
            return new RangedForStatement(iteratorVariable, startExpression, endExpression,statement, varName,newScope);
        }
    }

}
