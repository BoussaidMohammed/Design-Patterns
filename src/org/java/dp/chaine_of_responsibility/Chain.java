package org.java.dp.chaine_of_responsibility;

/* L'interface chaine contient 2 m�thodes, une pour initialiser
 * l'objet chaine suivant dans l'objet chaine courant, et une 
 * autre m�thode (handle) qui recoit la requete demander par le 
 * client envers la chaine pour la traiter */
public interface Chain {
	public void setNextChain(Chain nextChain);
	public void calculate(Numbers request);
	
}
