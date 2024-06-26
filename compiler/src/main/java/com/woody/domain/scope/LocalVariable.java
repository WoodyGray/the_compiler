package com.woody.domain.scope;

import com.woody.domain.type.Type;

/**
 * Created by kuba on 09.04.16.
 */
public class LocalVariable implements Variable {
    private final String name;
    private final Type type;

    public LocalVariable(String name, Type type) {
        this.type = type;
        this.name = name;
    }

    @Override
    public Type getType() {
        return type;
    }

    @Override
    public String getName() {
        return name;
    }
}
