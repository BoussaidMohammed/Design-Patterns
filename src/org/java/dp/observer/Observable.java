package org.java.dp.observer;

public interface Observable {
	public void subscribe(Observer o);
	public void unsubscribe(Observer o);
	public void notifyObservers();
	public int getState();
	public void setState(int state);
}
