package com.woody.exception;

import com.woody.domain.scope.Scope;

/**
 * Created by kuba on 06.04.16.
 */
public class LocalVariableNotFoundException extends RuntimeException {
    public LocalVariableNotFoundException(Scope scope, String variableName) {
        super("No local varaible found for name " + variableName + " found in scope" + scope);
    }
}
