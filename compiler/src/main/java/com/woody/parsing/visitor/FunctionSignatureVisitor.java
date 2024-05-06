package com.woody.parsing.visitor;

import com.woody.antlr.EnkelBaseVisitor;
import com.woody.antlr.EnkelParser.FunctionDeclarationContext;
import com.woody.antlr.EnkelParser.ParametersListContext;
import com.woody.domain.node.expression.Parameter;
import com.woody.domain.scope.Scope;
import com.woody.domain.type.Type;
import com.woody.domain.scope.FunctionSignature;
import com.woody.util.TypeResolver;
import com.woody.parsing.visitor.expression.ExpressionVisitor;
import com.woody.parsing.visitor.expression.function.ParameterExpressionListVisitor;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.Collections;
import java.util.List;

/**
 * Created by kuba on 06.04.16.
 */
public class FunctionSignatureVisitor extends EnkelBaseVisitor<FunctionSignature> {

    private final ExpressionVisitor expressionVisitor;

    public FunctionSignatureVisitor(Scope scope) {
        this.expressionVisitor = new ExpressionVisitor(scope);
    }

    @Override
    public FunctionSignature visitFunctionDeclaration(@NotNull FunctionDeclarationContext ctx) {
        String functionName = ctx.functionName().getText();
        Type returnType = TypeResolver.getFromTypeContext(ctx.type());
        ParametersListContext parametersCtx = ctx.parametersList();
        if(parametersCtx != null) {
            List<Parameter> parameters = parametersCtx.accept(new ParameterExpressionListVisitor(expressionVisitor));
            return new FunctionSignature(functionName, parameters, returnType);
        }
        return new FunctionSignature(functionName, Collections.emptyList(), returnType);

    }
}
