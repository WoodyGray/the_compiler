package com.woody.parsing.visitor.expression;

import com.woody.antlr.EnkelBaseVisitor;
import com.woody.antlr.EnkelParser;
import com.woody.antlr.EnkelParser.ValueContext;
import com.woody.domain.node.expression.Value;
import com.woody.domain.type.Type;
import com.woody.util.TypeResolver;
import org.antlr.v4.runtime.misc.NotNull;

public class ValueExpressionVisitor extends EnkelBaseVisitor<Value> {

    @Override
    public Value visitValue(@NotNull ValueContext ctx) {
        String value = ctx.getText();
        Type type = TypeResolver.getFromValue(ctx);
        return new Value(type, value);
    }
}