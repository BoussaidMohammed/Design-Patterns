package org.java.dp.command;

public class Client {
	public static void main(String[] args) {
		RecepteurImp1 rec1 = new RecepteurImp1();
		RecepteurImp2 rec2 = new RecepteurImp2();
		/* Chaque commande correspond á executer une action dans un recépteur*/
		Command cmd1 = new CommandA(rec1);
		Command cmd2 = new CommandB(rec1);
		Command cmd3 = new CommandC(rec2);
		
		Invoqueur telecommande = new Invoqueur();
		/* L'ajouter des commandes dans l'Invoqeur*/
		telecommande.addNewCommand("A", cmd1);
		telecommande.addNewCommand("B", cmd2);
		telecommande.addNewCommand("B", cmd3);
		/*l'invocation des différentes commandes*/
		telecommande.invoquer("A");
		telecommande.invoquer("B");
		telecommande.invoquer("C");
		telecommande.invoquer("D");
	}
}
