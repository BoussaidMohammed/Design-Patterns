package org.java.dp.proxy;

public class StandardImp1 implements Standard{
	/* la classe qu'on veut contrôler son acces */
	public void process() {
		System.out.println("*******************");
		System.out.println("*** Process .... StandardImp1");
		System.out.println("*******************");
	}

}
