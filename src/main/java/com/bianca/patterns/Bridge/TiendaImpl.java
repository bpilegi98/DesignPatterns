package com.bianca.patterns.Bridge;


public interface TiendaImpl {

	public String descripcionProducto(String producto);
	
	void compraProducto (String nombre, int cantidad); 

	void compraCaja (String nombre, int numeroProductosEnCaja);
}
