package org.java.dp.mediateur;

import java.util.List;
import java.util.Vector;

public class MediateurImp2 extends Mediateur{
	public void transmettreMessage(Message m) {
		System.out.println("------------------------");
		System.out.println("MediateurImp2...........");
		System.out.println("Transmission du message");
		System.out.println("De: "+m.getExpediteur());
		System.out.println("Vers: "+m.getDestinataire());
		System.out.println("Contenu: "+m.getContenu());
		Collegue des = collegues.get(m.getDestinataire());
		des.recevoir(m);
	}
	

}
