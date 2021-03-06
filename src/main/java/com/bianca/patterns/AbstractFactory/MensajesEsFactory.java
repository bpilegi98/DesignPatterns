package com.bianca.patterns.AbstractFactory;

public class MensajesEsFactory implements MensajesAbstractFactory {

	@Override
	public Preguntas getPreguntas() {
		return new PreguntasEs();
	}

	@Override
	public Saludos getSaludos() {
		return new SaludosEs();
	}

}
