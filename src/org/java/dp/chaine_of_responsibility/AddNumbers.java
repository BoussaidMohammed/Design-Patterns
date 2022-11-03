package org.java.dp.chaine_of_responsibility;
/* un �lement de la liste de chaine, qui a une
 * responsabilit� assez pr�cis, ici c'est l'addition
 * dans le cas ou le client a demend� une requete d'addition */
public class AddNumbers implements Chain{
	private Chain nextChain;
	/* chaque objet point sur un autre objet de la chaine
	 * en raison que s'il a �chou� de traiter la requete, 
	 * l'autre va r�ussi */
	public void setNextChain(Chain nextChain) {
		this.nextChain = nextChain;
	}
	/* la m�thode calcule de l'objet courant sera invoquer
	 * qu'on la requete de client est une requete d'addition,
	 * si non on laise la main � l'objet suivant dans la chaine
	 * de reponsabilit�*/
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
