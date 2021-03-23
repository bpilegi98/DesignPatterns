package com.bianca.patterns.Interpreter;

import java.util.Map;

public interface Expression {

    Double interpreta (Map<String, Double> contexto);
}
