package com.woody.parsing.visitor;

import com.woody.domain.scope.Field;
import com.woody.domain.scope.Scope;
import com.woody.domain.type.Type;
import com.woody.util.TypeResolver;
import org.antlr.v4.runtime.misc.NotNull;

/**
 * Created by kuba on 13.05.16.
 */
public class FieldVisitor extends com.woody.antlr.WlangBaseVisitor<Field> {

    private final Scope scope;

    public FieldVisitor(Scope scope) {
        this.scope = scope;
    }

    @Override
    public Field visitField(@NotNull com.woody.antlr.WlangParser.FieldContext ctx) {
        Type owner = scope.getClassType();
        Type type = TypeResolver.getFromTypeContext(ctx.type());
        String name = ctx.name().getText();
        return new Field(name, owner, type);
    }
}
