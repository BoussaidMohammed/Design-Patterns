package org.java.dp.decorator;

public class Espresso extends Boisson{
	/* Á ce niveau, on peut initialisér description*/
	public Espresso() {
		description = "Espresso";
	}
	/* Á ce niveau, on connait bien le prix d'un Espresso*/
	public double cout() {
		return 6;
	}

}
