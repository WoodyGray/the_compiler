package com.woody.exception;

import com.woody.domain.node.expression.Expression;

/**
 * Created by kuba on 23.04.16.
 */
public class UnsupportedRangedLoopTypes extends RuntimeException {
    public UnsupportedRangedLoopTypes(Expression startExpression, Expression endExpression) {
        super("Only integer types are supported so far");
    }
}
