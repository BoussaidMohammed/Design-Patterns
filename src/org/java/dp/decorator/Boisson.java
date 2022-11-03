package org.java.dp.decorator;

/* Nous avons utilis� une classe abstraite ici au lieu d'une interface
 * car tout simplement dans une interface on ne peut pas ajouter
 * un attribut, et dans cette exemple nous somme besoin d'un attribut description
 * que les classes d�riv�s doit avoir, contrairment � l'utilisation des interfaces
 * vous devez apr�s d�clarer un attribut dans chaque classes d�riv�.*/
public abstract class Boisson {
	protected String description;
	/* la m�thode cout d�pent du concrete boisson */
	public abstract double cout();
	/* description est initialiser au niveau de la classe fille*/
	public String getDescription() {
		return description;
	}
}
