package com.bianca.patterns.ChainOfResponsability;

public class LectorOdt implements LectorDocumentos {


	@Override
	public String contenido(Documento documento) {
		return "odt " + documento.getContenido();
	}

	@Override
	public boolean acepta(Documento documento) {
		return documento.getTipo().equals("odt");
	}

}
