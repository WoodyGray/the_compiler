package com.woody.domain;

import com.woody.bytecodegeneration.MethodGenerator;
import com.woody.domain.scope.FunctionSignature;
import com.woody.domain.node.statement.Statement;
import com.woody.domain.type.BultInType;
import com.woody.domain.type.Type;

/**
 * Created by kuba on 07.05.16.
 */
public class Constructor extends Function {
    public Constructor(FunctionSignature signature, Statement block) {
        super(signature, block);
    }

    @Override
    public Type getReturnType() {
        return BultInType.VOID;
    }

    @Override
    public void accept(MethodGenerator generator) {
        generator.generate(this);
    }
}
