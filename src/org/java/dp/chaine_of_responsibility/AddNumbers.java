package org.java.dp.chaine_of_responsibility;
/* un élement de la liste de chaine, qui a une
 * responsabilité assez précis, ici c'est l'addition
 * dans le cas ou le client a demendé une requete d'addition */
public class AddNumbers implements Chain{
	private Chain nextChain;
	/* chaque objet point sur un autre objet de la chaine
	 * en raison que s'il a échoué de traiter la requete, 
	 * l'autre va réussi */
	public void setNextChain(Chain nextChain) {
		this.nextChain = nextChain;
	}
	/* la méthode calcule de l'objet courant sera invoquer
	 * qu'on la requete de client est une requete d'addition,
	 * si non on laise la main á l'objet suivant dans la chaine
	 * de reponsabilité*/
	public void calculate(Numbers request) {
		if(request.getCalculationWanted().toLowerCase().equals("add")){
			request.setResult(request.getNumber1() + request.getNumber2());
		}
		else {
			if(nextChain != null) {
				nextChain.calculate(request);
			}
		}
	}

}
