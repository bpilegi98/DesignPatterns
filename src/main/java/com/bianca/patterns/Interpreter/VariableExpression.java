package com.bianca.patterns.Interpreter;

import java.util.Map;

public class VariableExpression implements Expression{

    private String variable;

    public VariableExpression(String variable){
        this.variable = variable;
    }

    @Override
    public Double interpreta(Map<String, Double> contexto) {
        Double valor = contexto.get(variable);
        if(valor == null)
            return 0.0;
        return valor;
    }
}
