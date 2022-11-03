package org.java.dp.observer;

public class ObserverImp1 implements Observer{

	public void update(Observable observable) {
		//cet implementation affiche tout simplement la version.
		int state = observable.getState();
		System.out.println("*** ObserverImp1 ***");
		System.out.println("Nouvelle mis á jour, la version"+ state);
		System.out.println("*** **** ***");
	}

}
