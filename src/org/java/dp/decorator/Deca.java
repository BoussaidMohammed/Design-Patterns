package org.java.dp.decorator;

public class Deca extends Boisson{
	/* Á ce niveau, on peut initialisér description*/
	public Deca() {
		description = "Sumatra";
	}
	/* Á ce niveau, on connait bien le prix d'un Espresso*/
	public double cout() {
		return 8;
	}

}
