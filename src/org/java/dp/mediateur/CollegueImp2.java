package org.java.dp.mediateur;

public class CollegueImp2 extends Collegue{

	public CollegueImp2(String nom, Mediateur mediateur) {
		super(mediateur, nom);
	}

	public CollegueImp2(String nom) {
		super(nom);
	}

	
	public void envoyer(Message m) {
		System.out.println("------------------------");
		System.out.println("CollegueImp2 nom = "+ nom);
		System.out.println("Envoi du message vers "+ m.getDestinataire());
		m.setExpediteur(this.nom);
		mediateur.transmettreMessage(m);
	}

	
	public void recevoir(Message m) {
		System.out.println("------------------------");
		System.out.println("CollegueImp2 nom = "+ nom);
		System.out.println("Recéption du message ");
		System.out.println("Contenu: "+m.getContenu());
		System.out.println("Expéditeur: "+m.getExpediteur());
	}
	

}
