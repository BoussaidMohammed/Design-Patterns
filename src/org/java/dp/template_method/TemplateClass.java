package org.java.dp.template_method;

import java.util.Iterator;

abstract public class TemplateClass {
	public double templateMethod() {
		int n = operation1();
		
		double somme = 0;
		for (int i = 0; i < n; i++) {
			somme += operation2();
		}
		return somme;
	}

	protected abstract double operation2();
	protected abstract int operation1();
}
 