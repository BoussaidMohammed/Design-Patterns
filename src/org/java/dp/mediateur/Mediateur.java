package org.java.dp.mediateur;

import java.util.HashMap;
import java.util.Map;

public abstract class Mediateur {
	/* le médiateur doit savoir les collegues pour les connectés
	 * chaque collegue est reconnu par un nom*/
	protected Map<String, Collegue> collegues = new HashMap<String, Collegue>();
	
	public void addCollegue(String ref, Collegue c) {
		collegues.put(ref, c);	
	}
	
	public abstract void transmettreMessage(Message m);
}
