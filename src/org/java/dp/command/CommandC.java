package org.java.dp.command;
/* cette implémentation de commande correspond á éxecuter
 * l'action trois de recepteur deux */
public class CommandC implements Command {
	private RecepteurImp2 recepteur;
	
	public CommandC(RecepteurImp2 recepteur) {
		this.recepteur = recepteur;
	}
	public void executer() {
		 recepteur.action3();
	}

}
