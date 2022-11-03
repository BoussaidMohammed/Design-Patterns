package org.java.dp.command;

import java.util.HashMap;
import java.util.Map;
/* Joue le role d'une t�l�commande universal qui contient
 * toutes les commandes d'ex�cuter des actions dans un 
 * certains rec�pteurs*/
public class Invoqueur {
	private Map<String, Command> commandes = new HashMap<>();
	/* m�thode d'ajouter permanent des nouvelles commandes */
	public void addNewCommand(String ref, Command cmd) {
		commandes.put(ref, cmd);
	}
	/* m�thode d'executer des actions*/
	public void invoquer(String ref) {
		Command cmd = commandes.get(ref);
		if(cmd!=null) cmd.executer();
	}
	
}
