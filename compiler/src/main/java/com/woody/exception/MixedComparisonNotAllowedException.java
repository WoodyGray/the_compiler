package com.woody.exception;

import com.woody.domain.type.Type;

/**
 * Created by kuba on 20.05.16.
 */
public class MixedComparisonNotAllowedException extends RuntimeException {
    public MixedComparisonNotAllowedException(Type leftType, Type rightType) {
        super("Comparison between object and primitive is not supported  :" + leftType + "  |  " + rightType);
    }
}
