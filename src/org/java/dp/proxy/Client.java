package org.java.dp.proxy;

public class Client {
	/* le client est menu d'objet Inteface
	 * par conséquent ou peut lui instancier que se soit par un objet cible 
	 * où un proxy.
	 */
	private Standard standard;
	
	public void process() {
		standard.process();
	}
	
	public void setStandard(Standard standard) {
		this.standard = standard;
	}
}
