package org.java.dp.chaine_of_responsibility;

public class Client {
	public static void main(String[] args) {
		/* Création des objets de la chaine, chacun á une résponsabilité assez précis*/
		Chain chainCal1 = new AddNumbers();
		Chain chainCal2 = new SubNumbers();
		Chain chainCal3 = new MultNumbers();
		Chain chainCal4 = new DivNumbers();
		/* Création d'une chaine de reponsabilité*/
		chainCal1.setNextChain(chainCal2);
		chainCal2.setNextChain(chainCal3);
		chainCal3.setNextChain(chainCal4);
		/* Le test des resultat de la requete du client*/
		Numbers ns = new Numbers(5, 3, "add");chainCal1.calculate(ns);
		System.out.println("Addition de "+ ns.getNumber1()+ " et "+ ns.getNumber2() + " = "+ns.getResult());
		
		ns = new Numbers(6, 4, "sub");chainCal1.calculate(ns);
		System.out.println("substraction de "+ ns.getNumber1()+ " et "+ ns.getNumber2() + " = "+ns.getResult());
		
	}
}
