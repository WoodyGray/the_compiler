package com.woody.parsing.visitor.expression.function;

import com.woody.antlr.WlangParser.ArgumentContext;
import com.woody.antlr.WlangParser.NamedArgumentContext;
import com.woody.domain.node.expression.Argument;
import com.woody.domain.node.expression.Expression;
import com.woody.parsing.visitor.expression.ExpressionVisitor;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.Optional;

/**
 * Created by kuba on 09.05.16.
 */
public class ArgumentExpressionVisitor extends com.woody.antlr.WlangBaseVisitor<Argument> {

    private final ExpressionVisitor expressionVisitor;

    public ArgumentExpressionVisitor(ExpressionVisitor expressionVisitor) {
        this.expressionVisitor = expressionVisitor;
    }

    @Override
    public Argument visitArgument(@NotNull ArgumentContext ctx) {
        Expression value = ctx.expression().accept(expressionVisitor);
        return new Argument(value, Optional.empty());
    }

    @Override
    public Argument visitNamedArgument(@NotNull NamedArgumentContext ctx) {
        Expression value = ctx.expression().accept(expressionVisitor);
        String name = ctx.name().getText();
        return new Argument(value, Optional.of(name));
    }

}
