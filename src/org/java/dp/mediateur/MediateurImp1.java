package org.java.dp.mediateur;

import java.util.List;
import java.util.Vector;

public class MediateurImp1 extends Mediateur{
	private List<Message> conversations = new Vector<>();
	 
	public void transmettreMessage(Message m) {
		System.out.println("------------------------");
		System.out.println("MediateurImp1...........");
		System.out.println("Transmission du message");
		System.out.println("De: "+m.getExpediteur());
		System.out.println("Vers: "+m.getDestinataire());
		System.out.println("Contenu: "+m.getContenu());
		/* récupération du destinataire á partir du Map<nom, Collegue>
		 * définie dans la classe Mediateur.*/
		Collegue des = collegues.get(m.getDestinataire());
		/* dès qu'on récupère l'identité du destinataire on fait
		 * appel á sa méthode recevoir, afin qu'il puisse lire
		 * le message */
		des.recevoir(m);
		conversations.add(m);
	}
	
	public void analyserLaConversation() {
		for(Message m: conversations) {
			System.out.println(m.toString());
		}
	}

}
