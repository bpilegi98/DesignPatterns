package com.bianca.patterns.FactoryMethod;

public abstract class LavadoraFactory {

	public Lavadora crea() {
		
		Lavadora lavadora = creaLavadora();
		
		lavadora.ponerMandos();
		lavadora.ponerTambor();
		
		return lavadora;
	}

	protected abstract Lavadora creaLavadora();

}
