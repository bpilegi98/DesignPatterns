package com.bianca.patterns.Adapter;

public class InternationalMoneyAdapter implements InternationalMoneyOrganization {

	private BancoNostrum impl;

	public InternationalMoneyAdapter(BancoNostrum impl) {
		this.impl = impl;
	}

	@Override
	public void transfer(int cantidad, String cliente) {
		impl.movimiento(cliente, cantidad);
	}

	@Override
	public int state(String cliente) {
		Integer resultado = impl.estado(cliente);
		
		if (resultado == null) {
			return 0;
		}
		return resultado;
	}
	
	
}
