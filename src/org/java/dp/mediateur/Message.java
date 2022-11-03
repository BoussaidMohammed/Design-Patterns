package org.java.dp.mediateur;

/* Le message se caractèrise par un contenu, expediteur et destinataire*/
public class Message {
	private String contenu;
	private String expediteur;
	private String destinataire;
	
	public Message() {
	}
	/* Ce constructeur, sert á envoyer le message d'un expediteur
	 * á un destinataire*/
	public Message(String contenu, String destinataire) {
		super();
		this.contenu = contenu;
		this.destinataire = destinataire;
	}
	
	public Message(String contenu, String expediteur, String destinataire) {
		super();
		this.contenu = contenu;
		this.expediteur = expediteur;
		this.destinataire = destinataire;
	}

	public String getContenu() {
		return contenu;
	}

	public void setContenu(String contenu) {
		this.contenu = contenu;
	}

	public String getExpediteur() {
		return expediteur;
	}

	public void setExpediteur(String expediteur) {
		this.expediteur = expediteur;
	}

	public String getDestinataire() {
		return destinataire;
	}

	public void setDestinataire(String destinataire) {
		this.destinataire = destinataire;
	}

	@Override
	public String toString() {
		return "Message [contenu=" + contenu + ", expediteur=" + expediteur + ", destinataire=" + destinataire + "]";
	}

	
	
	
}
