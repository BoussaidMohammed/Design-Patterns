package org.java.dp.decorator;

public class Espresso extends Boisson{
	/* � ce niveau, on peut initialis�r description*/
	public Espresso() {
		description = "Espresso";
	}
	/* � ce niveau, on connait bien le prix d'un Espresso*/
	public double cout() {
		return 6;
	}

}
