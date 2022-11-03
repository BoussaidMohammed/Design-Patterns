package org.java.dp.observer;

import java.util.List;
import java.util.Vector;

public class ObservableImpl implements Observable{
	//une relation one to many, donc cela est traduit par une liste des Observers.
	private List<Observer> observers;
	private int state;
	public ObservableImpl() {
		observers = new Vector<Observer>();
		state = 10;
	}
	
	public void subscribe(Observer o) {
		// il s'agit d'ajouter l'observer dans la liste
		observers.add(o);
	}

	public void unsubscribe(Observer o) {
		// il s'agit de retirer l'observer de la liste
		observers.remove(o);
	}

	public void notifyObservers() {
		//notify informe la liste des observsers toute en leur envoyant l'objet courant
		observers.forEach(o -> o.update(this));
	}
	
	public void setState(int state) {
		this.state = state;
		// tant qu'on a du changement de state en informe les observateur.
		notifyObservers();
	}
	
	public int getState() {
		return state;
	}

}
