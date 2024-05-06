package com.woody.domain.node.expression;

import com.woody.bytecodegeneration.expression.ExpressionGenerator;
import com.woody.bytecodegeneration.statement.StatementGenerator;
import com.woody.domain.node.statement.Statement;
import com.woody.domain.type.Type;

/**
 * Created by kuba on 02.04.16.
 */
public interface Expression extends Statement {
    Type getType();
    void accept(ExpressionGenerator genrator);
    @Override
    void accept(StatementGenerator generator);
}
