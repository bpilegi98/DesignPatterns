package com.bianca.patterns.Prototype;

import com.bianca.patterns.Prototype.enums.Carne;
import com.bianca.patterns.Prototype.enums.Extra;
import com.bianca.patterns.Prototype.enums.Pan;
import com.bianca.patterns.Prototype.enums.Size;

import java.util.ArrayList;
import java.util.List;


public class HamburguesaFactory {

	private Carne carne;
	private Size size;
	private Pan pan;
	private List<Extra> extras = new ArrayList<>();
	
	public Hamburguesa crea() {
		return new Hamburguesa(carne, size, pan, extras.toArray(new Extra[extras.size()]));
	}
	

	public static HamburguesaFactory from (Hamburguesa plantilla) {
		HamburguesaFactory factory = new HamburguesaFactory();
		factory.carne = plantilla.getCarne();
		factory.pan = plantilla.getPan();
		factory.size = plantilla.getSize();
		factory.extras.addAll(plantilla.getExtras());
		return factory;
	}
	
	public HamburguesaFactory setCarne(Carne carne) {
		this.carne = carne;
		return this;
	}

	public HamburguesaFactory setSize(Size size) {
		this.size = size;
		return this;
	}

	public HamburguesaFactory setPan(Pan pan) {
		this.pan = pan;
		return this;
	}

	public HamburguesaFactory addExtra(Extra extra) {
		this.extras.add(extra);
		return this;
	}

	public HamburguesaFactory removeExtra(Extra extra) {
		this.extras.remove(extra);
		return this;
	}


	public static Hamburguesa royal() {
		return new Hamburguesa ( Carne.VACUNA, Size.GRANDE, Pan.NORMAL, Extra.CEBOLLA, Extra.QUESO);
	}

	public static Hamburguesa king() {
		return new Hamburguesa ( Carne.VACUNA, Size.EXTRA_GRANDE, Pan.NORMAL, Extra.CEBOLLA, Extra.HUEVO);
	}


}
