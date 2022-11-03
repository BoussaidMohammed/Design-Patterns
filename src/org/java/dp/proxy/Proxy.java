package org.java.dp.proxy;

import java.util.Random;

public class Proxy implements Standard{
	/* afin de contrôler l'acces á un objet, le proxy doit le savoir d'abord*/
	private StandardImp1 cible;
	
	public Proxy() {
		
	}
	/*le proxy implement la meme interface autant que son objet cible*/
	public void process() {
		/* Avant á l'appel de la méthode process de l'objet cible
		 * le proxy doit controller par exemple la sécurité.
		 */
		System.out.println("Contrôle de la sécurité");
		Boolean b =  new Random().nextBoolean();
		if(b) {
			/* on suppose que l'utilisateur á le droit d'acces */
			cible = new StandardImp1();
			cible.process();
		}else {
			/* l'utilisateur ne dispose pas de droit d'acces*/
			throw new RuntimeException("Vous n'êtes pas autorisé");
		}
	}

}
