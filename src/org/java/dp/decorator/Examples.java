package org.java.dp.decorator;

public class Examples {
	public static void main(String[] args) {
		Boisson b = new Espresso();
		System.out.println("********************************");
		System.out.println(b.getDescription() + ":: prix --> " + b.cout());
		System.out.println("********************************");
		/* décorer l'Espresso avec du chocollat*/
		b = new Chocollat(b);
		System.out.println("********************************");
		System.out.println(b.getDescription() + ":: prix --> " + b.cout());
		System.out.println("********************************");
		/* décorerer le boisson précedent avec du caramel*/
		b = new Caramel(b);
		System.out.println("********************************");
		System.out.println(b.getDescription() + ":: prix --> " + b.cout());
		System.out.println("********************************");
	}
}
