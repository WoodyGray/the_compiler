package com.woody.domain.node.statement;

import com.woody.domain.node.Node;
import com.woody.bytecodegeneration.statement.StatementGenerator;

/**
 * Created by kuba on 02.04.16.
 */
@FunctionalInterface
public interface Statement extends Node {
    void accept(StatementGenerator generator);
}
