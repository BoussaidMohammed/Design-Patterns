package org.java.dp.decorator;

/* Nous avons utilisé une classe abstraite ici au lieu d'une interface
 * car tout simplement dans une interface on ne peut pas ajouter
 * un attribut, et dans cette exemple nous somme besoin d'un attribut description
 * que les classes dérivés doit avoir, contrairment á l'utilisation des interfaces
 * vous devez après déclarer un attribut dans chaque classes dérivé.*/
public abstract class Boisson {
	protected String description;
	/* la méthode cout dépent du concrete boisson */
	public abstract double cout();
	/* description est initialiser au niveau de la classe fille*/
	public String getDescription() {
		return description;
	}
}
