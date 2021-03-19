package com.bianca.patterns.Adapter;

public interface InternationalMoneyOrganization {

	void transfer (int cantidad, String cliente);
	
	//Devuelve 0 si el cliente no existe
	int state (String cliente);

}
