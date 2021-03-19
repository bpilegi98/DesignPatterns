package com.bianca.patterns.Builder;

public class Main {

	public static void main (String[] args) {

		
		Persona madre = new Persona.Builder("Maria")
                .setMunicipio("Selva")
                .setMayor(37)
                .setLugarTrabajo("Google")
                .build();

		System.out.println("madre = " + madre.toString());

		Persona hijo = new Persona.Builder("Pedro")
                .setMenor(4)
                .setColegio("Colegio de Selva")
                .build();

		System.out.println("hijo = " + hijo.toString());
	}
}
