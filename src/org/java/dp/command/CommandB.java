package org.java.dp.command;
/* cette implémentation de commande correspond á éxecuter
 * l'action deux de recepteur un */
public class CommandB implements Command {
	private RecepteurImp1 recepteur;
	
	public CommandB(RecepteurImp1 recepteur) {
		this.recepteur = recepteur;
	}
	public void executer() {
		 recepteur.action2();
	}

}
