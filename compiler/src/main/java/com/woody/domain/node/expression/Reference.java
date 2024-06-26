package com.woody.domain.node.expression;

import com.woody.bytecodegeneration.expression.ExpressionGenerator;
import com.woody.bytecodegeneration.statement.StatementGenerator;

/**
 * Created by kuba on 13.05.16.
 */
public interface Reference extends Expression {
    String geName();

    @Override
    void accept(ExpressionGenerator genrator);

    @Override
    void accept(StatementGenerator generator);
}
