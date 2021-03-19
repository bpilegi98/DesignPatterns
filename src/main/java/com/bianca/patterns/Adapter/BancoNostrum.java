package com.bianca.patterns.Adapter;

public interface BancoNostrum {

	void movimiento (String cliente, int cantidad);
	
	Integer estado (String cliente);
}
