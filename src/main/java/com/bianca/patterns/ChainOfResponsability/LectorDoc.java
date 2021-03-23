package com.bianca.patterns.ChainOfResponsability;

public class LectorDoc implements LectorDocumentos {


	@Override
	public String contenido(Documento documento) {
		return "doc " + documento.getContenido();
	}

	@Override
	public boolean acepta(Documento documento) {
		return documento.getTipo().equals("doc");
	}

}
