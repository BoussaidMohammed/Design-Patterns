package org.java.dp.composite;

public class Exemples {
	public static void main(String[] args) {
		/* Création des dossiers*/
		Folder root = new Folder("root");
		Folder f1 = new Folder("Sturcture");
		Folder f2 = new Folder("Comportement");
		Folder f3 = new Folder("Creation");
		/* faire composer le root des composant f1, f2 et f3 */
		root.addComposant(f1);root.addComposant(f2);root.addComposant(f3);
		/* ajouter des fichiers (composants terminaux) au diffèrents dossiers */
		f1.addComposant(new File("Composite"));
		f1.addComposant(new File("Decorator"));
		
		f2.addComposant(new File("Strategy"));
		
		f3.addComposant(new File("Builder"));
		
		File file = new File("Pattern");
		/*affichage de résultat á partir de la racine */
		root.view();
	}
}
