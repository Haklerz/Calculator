package com.haklerz.calc;

import java.util.HashMap;
import java.util.Map;

public class Scope {
    private Map<String, Double> constants;

    public Scope() {
        constants = new HashMap<>();
    }

    public double getValue(String symbol) {
        return constants.get(symbol);
    }
}
