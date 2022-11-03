package org.java.dp.command;

/* cette impl�mentation de commande correspond � �xecuter
 * l'action une de recepteur un */
public class CommandA implements Command {
	private RecepteurImp1 recepteur;
	
	public CommandA(RecepteurImp1 recepteur) {
		this.recepteur = recepteur;
	}
	/* On peut avoir plusieurs commandes qui correspond au m�me
	 * recpeteur � condition d'executer une action qui n'est pas
	 * encore impl�menter ailleurs. */
	public void executer() {
		 recepteur.action1();
	}

}
