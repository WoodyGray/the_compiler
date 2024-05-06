package com.woody.domain.node.expression;

import com.woody.bytecodegeneration.expression.ExpressionGenerator;
import com.woody.bytecodegeneration.statement.StatementGenerator;
import com.woody.domain.scope.Field;
import com.woody.domain.type.Type;

/**
 * Created by kuba on 09.04.16.
 */
public class FieldReference implements Reference {
    private Field field;

    public FieldReference(Field field) {
        this.field = field;
    }


    @Override
    public String geName() {
        return field.getName();
    }

    @Override
    public void accept(ExpressionGenerator generator) {
        generator.generate(this);
    }

    @Override
    public Type getType() {
        return field.getType();
    }

    @Override
    public void accept(StatementGenerator generator) {
        generator.generate(this);
    }

    public String getOwnerInternalName() {
        return field.getOwnerInternalName();
    }
}
