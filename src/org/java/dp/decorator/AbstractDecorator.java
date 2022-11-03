package org.java.dp.decorator;

public abstract class AbstractDecorator extends Boisson {
	protected Boisson boisson;
	/* Dans le constructeur o� on ajoute la laison entre le 
	 * boisson et le d�corateur courant, ce d�rnier maintent se 
	 * dispose d'un pointeur vers le boisson*/
	public AbstractDecorator(Boisson boisson) {
		this.boisson = boisson;
	}
	/* � niveau du d�corateur, on rend la m�thode getDecription 
	 * abstraite pour obliger les concrets decorateurs de la red�finir*/
	public abstract String getDescription();
	
}
