package com.woody.parsing.visitor.expression.function;

import com.woody.antlr.WlangParser.ParameterContext;
import com.woody.antlr.WlangParser.ParameterWithDefaultValueContext;
import com.woody.domain.node.expression.Expression;
import com.woody.domain.node.expression.Parameter;
import com.woody.domain.type.Type;
import com.woody.util.TypeResolver;
import com.woody.parsing.visitor.expression.ExpressionVisitor;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.Optional;

/**
 * Created by kuba on 09.05.16.
 */
public class ParameterExpressionVisitor extends com.woody.antlr.WlangBaseVisitor<Parameter> {

    private final ExpressionVisitor expressionVisitor;

    public ParameterExpressionVisitor(ExpressionVisitor expressionVisitor) {
        this.expressionVisitor = expressionVisitor;
    }

    @Override
    public Parameter visitParameter(@NotNull ParameterContext ctx) {
        String name = ctx.ID().getText();
        Type type = TypeResolver.getFromTypeContext(ctx.type());
        return new Parameter(name, type, Optional.empty());
    }

    @Override
    public Parameter visitParameterWithDefaultValue(@NotNull ParameterWithDefaultValueContext ctx) {
        String name = ctx.ID().getText();
        Type type = TypeResolver.getFromTypeContext(ctx.type());
        Expression defaultValue = ctx.defaultValue.accept(expressionVisitor);
        return new Parameter(name, type, Optional.of(defaultValue));
    }
}
