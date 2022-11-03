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
		/* r�cup�ration du destinataire � partir du Map<nom, Collegue>
		 * d�finie dans la classe Mediateur.*/
		Collegue des = collegues.get(m.getDestinataire());
		/* d�s qu'on r�cup�re l'identit� du destinataire on fait
		 * appel � sa m�thode recevoir, afin qu'il puisse lire
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
