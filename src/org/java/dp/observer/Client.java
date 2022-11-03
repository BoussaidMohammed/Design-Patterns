package org.java.dp.observer;

public class Client {
	public static void main(String[] args) {
		/** cr�ations des objets n�cessaire, l'objet Observable et les objets Observers**/
		Observable observable = new ObservableImpl();
		Observer o1  = new ObserverImp1();
		Observer o2 = new ObserverImp2();
		
		/** l'inscription des observers dans observable**/
		observable.subscribe(o1);
		observable.subscribe(o2);
		
		/** Changement d'�tat **/
		observable.setState(55);
	}
}
