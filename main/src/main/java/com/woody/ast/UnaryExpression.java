package com.woody.ast;

public class UnaryExpression implements Expression{
    private final Expression expr;
    private final char operation;

    public UnaryExpression(char operation, Expression expr) {
        this.expr = expr;
        this.operation = operation;
    }

    @Override
    public double eval() {
        switch (operation){
            case '-': return -expr.eval();
            case '+':
            default: return expr.eval();
        }
    }

    @Override
    public String toString() {
        return String.format("%c %s", operation, expr);
    }
}
