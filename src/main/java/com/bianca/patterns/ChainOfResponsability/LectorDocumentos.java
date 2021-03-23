package com.bianca.patterns.ChainOfResponsability;

public interface LectorDocumentos {

	boolean acepta(Documento documento);
	
	String contenido(Documento documento);

}
