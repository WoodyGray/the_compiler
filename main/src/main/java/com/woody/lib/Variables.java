package com.woody.lib;

import java.util.HashMap;
import java.util.Map;

public final class Variables {
    private static final Map<String, Double> variables;

    static {
        variables = new HashMap<>();
        variables.put("PI", Math.PI);
        variables.put("E", Math.E);
    }

    public static boolean isExists(String key){
        return variables.containsKey(key);
    }

    public static double get(String key){
        if (!isExists(key)) return 0;
        else return variables.get(key);
    }

    public static void set(String key, double value){
        variables.put(key, value);
    }
}
