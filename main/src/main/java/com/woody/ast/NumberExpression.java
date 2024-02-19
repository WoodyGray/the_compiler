package com.woody.ast;

import com.woody.lib.NumberValue;
import com.woody.lib.Value;

public final class NumberExpression implements Expression{

    private final Value value;

    public NumberExpression(double value) {
        this.value = new NumberValue(value);
    }

    @Override
    public Value eval() {
        return value;
    }

    @Override
    public String toString() {
        return value.asString();
    }
}
