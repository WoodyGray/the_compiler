package com.woody.domain.node.expression;

import com.woody.bytecodegeneration.expression.ExpressionGenerator;
import com.woody.bytecodegeneration.statement.StatementGenerator;
import com.woody.domain.type.BultInType;
import com.woody.domain.type.Type;

import java.util.Collections;
import java.util.List;

/**
 * Created by kuba on 05.05.16.
 */
public class SuperCall implements Call {
    public static final String SUPER_IDETIFIER = "super";
    private final List<Argument> arguments;

    public SuperCall() {
        this(Collections.emptyList());
    }

    public SuperCall(List<Argument> arguments) {
        this.arguments = arguments;
    }

    @Override
    public List<Argument> getArguments() {
        return Collections.unmodifiableList(arguments);
    }

    @Override
    public String getIdentifier() {
        return SUPER_IDETIFIER;
    }

    @Override
    public Type getType() {
        return BultInType.VOID;
    }

    @Override
    public void accept(ExpressionGenerator genrator) {
        genrator.generate(this);
    }

    @Override
    public void accept(StatementGenerator generator) {
        generator.generate(this);
    }
}
