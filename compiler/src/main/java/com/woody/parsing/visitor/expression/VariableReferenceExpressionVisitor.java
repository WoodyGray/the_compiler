package com.woody.parsing.visitor.expression;

import com.woody.antlr.WlangParser.VarReferenceContext;
import com.woody.domain.node.expression.FieldReference;
import com.woody.domain.node.expression.LocalVariableReference;
import com.woody.domain.node.expression.Reference;
import com.woody.domain.scope.Field;
import com.woody.domain.scope.LocalVariable;
import com.woody.domain.scope.Scope;
import org.antlr.v4.runtime.misc.NotNull;

public class VariableReferenceExpressionVisitor extends com.woody.antlr.WlangBaseVisitor<Reference> {
    private final Scope scope;

    public VariableReferenceExpressionVisitor(Scope scope) {
        this.scope = scope;
    }

    @Override
    public Reference visitVarReference(@NotNull VarReferenceContext ctx) {
        String varName = ctx.getText();
        if(scope.isFieldExists(varName)) {
            Field field = scope.getField(varName);
            return new FieldReference(field);
        }
        LocalVariable variable = scope.getLocalVariable(varName);
        return new LocalVariableReference(variable);
    }
}