package com.bianca.patterns.AbstractFactory;

public class PreguntasEn implements Preguntas {

	@Override
	public String preguntaHora() {
		return "What time is it?";
	}

	@Override
	public String preguntaTiempo() {
		return "How is the weather?";
	}

	
}
