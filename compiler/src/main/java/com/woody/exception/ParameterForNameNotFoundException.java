package com.woody.exception;

import com.woody.domain.node.expression.Parameter;

import java.util.List;

/**
 * Created by kuba on 17.04.16.
 */
public class ParameterForNameNotFoundException extends RuntimeException {
    public ParameterForNameNotFoundException(String name, List<Parameter> parameters) {
    }
}
