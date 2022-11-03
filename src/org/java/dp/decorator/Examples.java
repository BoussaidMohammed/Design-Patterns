package org.java.dp.decorator;

public class Examples {
	public static void main(String[] args) {
		Boisson b = new Espresso();
		System.out.println("********************************");
		System.out.println(b.getDescription() + ":: prix --> " + b.cout());
		System.out.println("********************************");
		/* d�corer l'Espresso avec du chocollat*/
		b = new Chocollat(b);
		System.out.println("********************************");
		System.out.println(b.getDescription() + ":: prix --> " + b.cout());
		System.out.println("********************************");
		/* d�corerer le boisson pr�cedent avec du caramel*/
		b = new Caramel(b);
		System.out.println("********************************");
		System.out.println(b.getDescription() + ":: prix --> " + b.cout());
		System.out.println("********************************");
	}
}
