package org.java.dp.mediateur;

/* Collegue est une classe qui besoin de 
 * communiquer avec une autre instance collegue*/
public abstract class Collegue {
	/* Le mediateur c'est l'objet qui fait circuler le 
	 * message entre toutes la liste des collegue qui contient*/
	protected Mediateur mediateur;
	protected String nom;
	
	public Collegue(Mediateur mediateur, String nom) {
		this.mediateur = mediateur;
		this.nom = nom;
		/* Ajoute du collegue courant dans la liste des collgues
		 * du mediateur*/
		this.mediateur.addCollegue(nom, this);
	}
	/* Un collegue pour communiquer, il le fait a travers un
	 * message, l'operation est découpé en deux, envoyer et
	 * recevoire qui sont abstraite pour le moments */
	public abstract void envoyer(Message m);
	public abstract void recevoir(Message m);
	public Collegue(String nom) {
		this.nom = nom;
	}
}
