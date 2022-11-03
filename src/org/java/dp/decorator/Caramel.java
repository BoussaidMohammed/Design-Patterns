package org.java.dp.decorator;

public class Caramel extends AbstractDecorator {

	public Caramel(Boisson boisson) {
		super(boisson);
	}
	/* le cout c'est le cout du caramel plus le cout du boisson qui le d�cord
	 * si le boisson aussi s'agit d'un autre d�corateur il va ajout�r son prix
	 * sur le prix du boisson qu'il le d�cord, jusqu'au arriv� finalment � un
	 * vrais boisson, c'est de la r�cursivit�.*/
	public double cout() {
		return 0.7 + boisson.cout();
	}
	/* R�cussivit� aussi, jusqu'au arriv� � un boisson qui est pas
	 * un d�corateur.*/
	public String getDescription() {
		return	boisson.getDescription() + " Au Caramel";
	}

}
