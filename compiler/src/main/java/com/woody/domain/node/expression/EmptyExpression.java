package com.woody.domain.node.expression;

import com.woody.bytecodegeneration.expression.ExpressionGenerator;
import com.woody.bytecodegeneration.statement.StatementGenerator;
import com.woody.domain.type.Type;

/**
 * Created by kuba on 14.04.16.
 */
public class EmptyExpression implements Expression {

    private final Type type;

    public EmptyExpression(Type type) {
        this.type = type;
    }

    @Override
    public void accept(ExpressionGenerator genrator) {
        genrator.generate(this);
    }

    @Override
    public Type getType() {
        return type;
    }

    @Override
    public void accept(StatementGenerator generator) {
        generator.generate(this);
    }
}
