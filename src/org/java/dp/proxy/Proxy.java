package org.java.dp.proxy;

import java.util.Random;

public class Proxy implements Standard{
	/* afin de contr�ler l'acces � un objet, le proxy doit le savoir d'abord*/
	private StandardImp1 cible;
	
	public Proxy() {
		
	}
	/*le proxy implement la meme interface autant que son objet cible*/
	public void process() {
		/* Avant � l'appel de la m�thode process de l'objet cible
		 * le proxy doit controller par exemple la s�curit�.
		 */
		System.out.println("Contr�le de la s�curit�");
		Boolean b =  new Random().nextBoolean();
		if(b) {
			/* on suppose que l'utilisateur � le droit d'acces */
			cible = new StandardImp1();
			cible.process();
		}else {
			/* l'utilisateur ne dispose pas de droit d'acces*/
			throw new RuntimeException("Vous n'�tes pas autoris�");
		}
	}

}
