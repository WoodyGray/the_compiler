package com.woody.domain.node.expression;

import com.woody.bytecodegeneration.expression.ExpressionGenerator;
import com.woody.bytecodegeneration.statement.StatementGenerator;
import com.woody.domain.type.Type;

/**
 * Created by kuba on 02.04.16.
 */
public class Value implements Expression {

    private final String value;
    private final Type type;

    public Value(Type type, String value) {
        this.type = type;
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public void accept(ExpressionGenerator genrator) {
        genrator.generate(this);
    }

    @Override
    public void accept(StatementGenerator generator) {
        generator.generate(this);
    }

    @Override
    public Type getType() {
        return type;
    }
}
