package com.bianca.patterns.Interpreter;

import java.util.Map;

public class SumaExpression implements Expression{

    private final Expression expr1;
    private final Expression expr2;

    public SumaExpression(Expression expr1, Expression expr2)
    {
        this.expr1 = expr1;
        this.expr2 = expr2;
    }

    @Override
    public Double interpreta(Map<String, Double> contexto) {
        return expr1.interpreta(contexto) + expr2.interpreta(contexto);
    }
}
