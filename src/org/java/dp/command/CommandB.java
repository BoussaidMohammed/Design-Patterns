package org.java.dp.command;
/* cette impl�mentation de commande correspond � �xecuter
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
