package com.bianca.patterns.Decorator;

import java.util.List;

public class LoggerDecorator implements BaseDatos {

	private final Logger logger;
	private final BaseDatos impl;
	
	public LoggerDecorator(Logger logger, BaseDatos impl) {
		this.logger = logger;
		this.impl = impl;
	}
	
	@Override
	public void inserta(String registro) {
		logger.add("inserta " + registro);
		impl.inserta(registro);
	}

	@Override
	public List<String> registros() {
		logger.add("lectura");
		return impl.registros();
	}

	

}
