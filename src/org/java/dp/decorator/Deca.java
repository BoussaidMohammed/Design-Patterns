package org.java.dp.decorator;

public class Deca extends Boisson{
	/* � ce niveau, on peut initialis�r description*/
	public Deca() {
		description = "Sumatra";
	}
	/* � ce niveau, on connait bien le prix d'un Espresso*/
	public double cout() {
		return 8;
	}

}
