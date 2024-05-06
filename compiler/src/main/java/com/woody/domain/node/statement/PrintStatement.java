package com.woody.domain.node.statement;

import com.woody.bytecodegeneration.statement.StatementGenerator;
import com.woody.domain.node.expression.Expression;

/**
 * Created by kuba on 28.03.16.
 */
public class PrintStatement implements Statement {

    private final Expression expression;

    public PrintStatement(Expression expression) {

        this.expression = expression;
    }

    public Expression getExpression() {
        return expression;
    }


    @Override
    public void accept(StatementGenerator generator) {
        generator.generate(this);
    }
}
