package com.woody.domain.node.statement;

import com.woody.bytecodegeneration.statement.StatementGenerator;
import com.woody.domain.node.expression.Expression;

/**
 * Created by kuba on 11.04.16.
 */
public class ReturnStatement implements Statement {

    private final Expression expression;

    public ReturnStatement(Expression expression) {
        this.expression = expression;
    }

    @Override
    public void accept(StatementGenerator generator) {
        generator.generate(this);
    }

    public Expression getExpression() {
        return expression;
    }
}
