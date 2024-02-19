package com.woody.ast;

import com.woody.lib.Value;
import com.woody.lib.Variables;

public final class VariableExpression implements Expression{
    private final String name;

    public VariableExpression(String name) {
        this.name = name;
    }


    @Override
    public Value eval() {
        if (!Variables.isExists(name)) throw new RuntimeException("Constant does not exists");
        return Variables.get(name);
    }

    @Override
    public String toString() {
        return String.format("%s", name);
    }
}
