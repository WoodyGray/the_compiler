package com.woody.ast;

import com.woody.lib.Variables;

public final class ConstantExpression implements Expression{
    private final String name;

    public ConstantExpression(String name) {
        this.name = name;
    }


    @Override
    public double eval() {
        if (!Variables.isExists(name)) throw new RuntimeException("Constant does not exists");
        return Variables.get(name);
    }

    @Override
    public String toString() {
        return String.format("%s", name);
    }
}
