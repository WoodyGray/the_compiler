package com.woody.ast;

import com.woody.lib.NumberValue;
import com.woody.lib.Value;

public class UnaryExpression implements Expression{
    private final Expression expr;
    private final char operation;

    public UnaryExpression(char operation, Expression expr) {
        this.expr = expr;
        this.operation = operation;
    }

    @Override
    public Value eval() {
        switch (operation){
            case '-': return new NumberValue(-expr.eval().asDouble());
            case '+':
            default: return expr.eval();
        }
    }

    @Override
    public String toString() {
        return String.format("%c %s", operation, expr);
    }
}
