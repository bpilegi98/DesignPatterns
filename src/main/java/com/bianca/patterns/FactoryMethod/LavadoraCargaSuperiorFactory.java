package com.bianca.patterns.FactoryMethod;

public class LavadoraCargaSuperiorFactory extends LavadoraFactory {

	@Override
	protected Lavadora creaLavadora() {
		return new LavadoraCargaSuperior();
	}

}
