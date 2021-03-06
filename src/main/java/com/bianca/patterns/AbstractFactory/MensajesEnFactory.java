package com.bianca.patterns.AbstractFactory;

public class MensajesEnFactory implements MensajesAbstractFactory {

	@Override
	public Preguntas getPreguntas() {
		return new PreguntasEn();
	}

	@Override
	public Saludos getSaludos() {
		return new SaludosEn();
	}

}
