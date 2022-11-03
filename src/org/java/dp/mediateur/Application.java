package org.java.dp.mediateur;

public class Application {
	public static void main(String[] args) {
		/* Instanciation des médiateurs*/
		MediateurImp1 mediateur1 = new MediateurImp1();
		MediateurImp2 mediateur2 = new MediateurImp2();
		/* Tout ces objets collegue communique á travers le meme mediateur*/
		Collegue c1 = new CollegueImp1("A", mediateur1);
		Collegue c2 = new CollegueImp1("B", mediateur1);
		Collegue c3 = new CollegueImp2("C", mediateur1);
		/* l'envoie du contenu 'XXXX' de collegue A vers le collegue B*/
		c1.envoyer(new Message("XXXX", "B"));
	}
}
