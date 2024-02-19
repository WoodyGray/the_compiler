package com.woody.ast;

import com.woody.lib.NumberValue;
import com.woody.lib.StringValue;
import com.woody.lib.Value;

public final class ValueExpression implements Expression{

    private final Value value;

    public ValueExpression(double value) {
        this.value = new NumberValue(value);
    }

    public ValueExpression(String value) {
        this.value = new StringValue(value);
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
