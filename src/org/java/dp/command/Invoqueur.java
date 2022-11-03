package org.java.dp.command;

import java.util.HashMap;
import java.util.Map;
/* Joue le role d'une télècommande universal qui contient
 * toutes les commandes d'exécuter des actions dans un 
 * certains recépteurs*/
public class Invoqueur {
	private Map<String, Command> commandes = new HashMap<>();
	/* méthode d'ajouter permanent des nouvelles commandes */
	public void addNewCommand(String ref, Command cmd) {
		commandes.put(ref, cmd);
	}
	/* méthode d'executer des actions*/
	public void invoquer(String ref) {
		Command cmd = commandes.get(ref);
		if(cmd!=null) cmd.executer();
	}
	
}
