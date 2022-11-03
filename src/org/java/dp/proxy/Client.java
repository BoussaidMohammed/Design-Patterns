package org.java.dp.proxy;

public class Client {
	/* le client est menu d'objet Inteface
	 * par cons�quent ou peut lui instancier que se soit par un objet cible 
	 * o� un proxy.
	 */
	private Standard standard;
	
	public void process() {
		standard.process();
	}
	
	public void setStandard(Standard standard) {
		this.standard = standard;
	}
}
