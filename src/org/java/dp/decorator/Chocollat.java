package org.java.dp.decorator;

public class Chocollat extends AbstractDecorator {
	public Chocollat(Boisson boisson) {
		super(boisson);
	}
	/* le cout c'est le cout du chocolat plus le cout du boisson qui le décord
	 * si le boisson aussi s'agit d'un autre décorateur il va ajoutér son prix
	 * sur le prix du boisson qu'il le décord, jusqu'au arrivé finalment á un
	 * vrais boisson, c'est de la récursivité.*/
	public double cout() {
		return 0.7 + boisson.cout();
	}
	/* Récussivité aussi, jusqu'au arrivé á un boisson qui est pas
	 * un décorateur.*/
	public String getDescription() {
		return	boisson.getDescription() + " Au Chocoloat";
	}

}
