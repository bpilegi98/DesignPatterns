package com.bianca.patterns.Facade;

public class ServicioConfiguracion {

	public void addEmail(String cliente, String email) {
		BBDD.INSTANCE.setEmail(cliente, email);
	}

	
}
