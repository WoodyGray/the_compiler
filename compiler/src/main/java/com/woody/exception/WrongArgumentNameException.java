package com.woody.exception;

import com.woody.domain.node.expression.Argument;
import com.woody.domain.node.expression.Parameter;

import java.util.List;

/**
 * Created by kuba on 10.05.16.
 */
public class WrongArgumentNameException extends RuntimeException {
    public WrongArgumentNameException(Argument argument, List<Parameter> parameters) {
        super("You are trying to call method with argument name" + argument.getParameterName().get() + " where parameters = " + parameters);
    }
}
