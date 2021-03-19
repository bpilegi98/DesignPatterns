package com.bianca.patterns.AbstractFactory;

public class PreguntasEs implements Preguntas {

	@Override
	public String preguntaHora() {
		return "¿Qué hora es?";
	}

	@Override
	public String preguntaTiempo() {
		return "¿Cuál es el clima?";
	}

}
