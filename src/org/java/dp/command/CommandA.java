package org.java.dp.command;

/* cette implémentation de commande correspond á éxecuter
 * l'action une de recepteur un */
public class CommandA implements Command {
	private RecepteurImp1 recepteur;
	
	public CommandA(RecepteurImp1 recepteur) {
		this.recepteur = recepteur;
	}
	/* On peut avoir plusieurs commandes qui correspond au même
	 * recpeteur á condition d'executer une action qui n'est pas
	 * encore implémenter ailleurs. */
	public void executer() {
		 recepteur.action1();
	}

}
