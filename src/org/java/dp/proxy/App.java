package org.java.dp.proxy;

public class App {
	public static void main(String[] args) {
		Client client = new Client();
		/* le client reçoit un proxy au lieu de l'objet cible*/
		client.setStandard(new Proxy());
		client.process();
	}
}
