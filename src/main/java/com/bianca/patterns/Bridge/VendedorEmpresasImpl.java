package com.bianca.patterns.Bridge;

public class VendedorEmpresasImpl implements VendedorOnlineEmpresas {
	
	private TiendaImpl implementacion;

	
	public VendedorEmpresasImpl(TiendaImpl implementacion) {
		this.implementacion = implementacion;
	}

	@Override
	public String descripcionProducto(String producto) {
		return implementacion.descripcionProducto(producto);
	}
	

	@Override
	public void compraProducto(String nombre, int cantidadPorCaja, int cajas) {
		
		for (int i = 0; i < cajas; i++) {
			implementacion.compraCaja(nombre, cantidadPorCaja);
		}
		
	}

}
