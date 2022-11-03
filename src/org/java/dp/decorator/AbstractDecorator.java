package org.java.dp.decorator;

public abstract class AbstractDecorator extends Boisson {
	protected Boisson boisson;
	/* Dans le constructeur où on ajoute la laison entre le 
	 * boisson et le décorateur courant, ce dérnier maintent se 
	 * dispose d'un pointeur vers le boisson*/
	public AbstractDecorator(Boisson boisson) {
		this.boisson = boisson;
	}
	/* Á niveau du décorateur, on rend la méthode getDecription 
	 * abstraite pour obliger les concrets decorateurs de la redéfinir*/
	public abstract String getDescription();
	
}
