package com.bianca.patterns.Interpreter;

import java.util.Map;

public class LiteralExpression implements Expression{

    private final Double literal;

    public LiteralExpression(Double literal)
    {
        this.literal = literal;
    }

    @Override
    public Double interpreta(Map<String, Double> contexto) {
        return literal;
    }
}
