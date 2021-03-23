package com.bianca.patterns.Command;

public class Oficina {

	
	public void recibe (TratamientoPedido pedido) {
		System.out.println("Registrando pedido...");
		
        boolean ok = pedido.tratar(); 
        
		System.out.println("Registrar si salio bien.");
	}
	
}
