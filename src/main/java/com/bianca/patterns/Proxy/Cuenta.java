package com.bianca.patterns.Proxy;

public interface Cuenta {

	String getCliente();

	int getCantidad();

	void movimiento(int importe);

}