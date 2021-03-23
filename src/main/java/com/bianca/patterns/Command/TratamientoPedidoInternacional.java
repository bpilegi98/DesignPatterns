package com.bianca.patterns.Command;

public class TratamientoPedidoInternacional implements TratamientoPedido {

	private PedidoInternacional pedido;
	
	public TratamientoPedidoInternacional(PedidoInternacional pedido) {
		this.pedido = pedido;
	}

	@Override
	public boolean tratar() {
		return !"Mordor".equals(pedido.getDestino());
	}

}
