package org.java.dp.observer;

public class ObserverImp2 implements Observer{

	public void update(Observable observable) {
		//cette implementation affiche s'il s'agite d'une version paire impare.
		int state = observable.getState();
		System.out.println("*** ObserverImp2 ***");
		int result = state%2;
		System.out.println("version "+ (result == 0 ? "paire": "impaire"));
		System.out.println("*** **** *** *** ***");
	}

}
