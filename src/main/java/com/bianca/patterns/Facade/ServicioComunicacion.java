package com.bianca.patterns.Facade;

public class ServicioComunicacion {

	public void setPreferencias (String cliente, PreferenciasComunicacion preferencias) {
		BBDD.INSTANCE.setPreferencias(cliente, preferencias);
	}

}
