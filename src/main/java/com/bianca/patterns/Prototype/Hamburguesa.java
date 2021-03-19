package com.bianca.patterns.Prototype;

import com.bianca.patterns.Prototype.enums.Carne;
import com.bianca.patterns.Prototype.enums.Extra;
import com.bianca.patterns.Prototype.enums.Pan;
import com.bianca.patterns.Prototype.enums.Size;
import lombok.Data;

import java.util.Arrays;
import java.util.List;

@Data
public class Hamburguesa {
	
	private final Carne carne;
	private final Size size;
	private final Pan pan;
	private final List<Extra> extras;

	
	public Hamburguesa(Carne carne, Size size, Pan pan, Extra ... extras) {
		this.carne = carne;
		this.size = size;
		this.pan = pan;
		this.extras = Arrays.asList(extras);
	}


}
