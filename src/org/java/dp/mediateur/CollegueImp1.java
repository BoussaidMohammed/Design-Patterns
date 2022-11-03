package org.java.dp.mediateur;

public class CollegueImp1 extends Collegue{
	public CollegueImp1(String nom, Mediateur mediateur) {
		super(mediateur, nom);
	}
	public CollegueImp1(String nom) {
		super(nom);
	}
	/* On constate ici que le message est envoyer á travers le 
	 * médiateur, exactment á travers sa méthode transmettre message.*/
	public void envoyer(Message m) {
		/* le destinataire et le contenu sont passér au niveau du client(test) */
		System.out.println("------------------------");
		System.out.println("CollegueImp1 nom = "+ nom);
		System.out.println("Envoi du message vers "+ m.getDestinataire());
		m.setExpediteur(this.nom);
		/* On fait confiance au mediateur de transferer notre message*/
		mediateur.transmettreMessage(m);
	}

	public void recevoir(Message m) {
		/* cette méthode est invoquer queleque part dans le médiateur
		 * car c'est lui qui recoit le message du l'expediteur, et
		 * c'est lui qui connait où le transmettre.*/
		System.out.println("------------------------");
		System.out.println("CollegueImp1 nom = "+ nom);
		System.out.println("Recéption du message ");
		System.out.println("Contenu: "+m.getContenu());
		System.out.println("Expéditeur: "+m.getExpediteur());
	}
	

}
