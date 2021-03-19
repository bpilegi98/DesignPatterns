package com.bianca.patterns.Bridge;

public class Tienda2Impl implements TiendaImpl {

	@Override
	public String descripcionProducto(String producto) {
		return "Descripción del producto: " + producto + " // Depósito de la tienda 2";
	}

	@Override
	public void compraProducto(String nombre, int cantidad) {
		System.out.println("Usted ha comprado " + cantidad + " " + nombre);
		System.out.println("Gracias por comprar en la tienda 2 !!");
	}

	@Override
	public void compraCaja(String nombre, int numeroProductosEnCaja) {
		System.out.println("Usted ha comprado una caja con " + numeroProductosEnCaja + " " + nombre);
		System.out.println("Gracias por comprar en la tienda 2 !!");
	}


}
