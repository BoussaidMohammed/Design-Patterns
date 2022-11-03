package org.java.dp.composite;

import java.util.List;
import java.util.Vector;
/* Folder est le composite, car elle est á la fois composant
 * est un conteneur d'autre composant*/
public class Folder extends Component {
	private List<Component> components;
	
	public Folder(String name) {
		super(name);
		/*On suppose qu'au départ le dossier est dans le niveau 0.*/
		level = 0;
		components = new Vector<>();
	}
	/* un dossier peut contenir d'autre dossier ou fichier c'est ici 
	 * que la laison se fait entre un composite et ses composant*/
	public Component addComposant(Component component) {
		/* chaque composant á le niveau de son père (composite) plus 1*/
		component.level = level + 1;
		components.add(component);
		return component;
	}
	public void view() {
		/* Pour afficher un dossier, il faut aussi afficher ses composants
		 * (fichier, et dossier), c'est une opération récurssive qui se
		 * termine jusqu'á arriver un fichier (composant terminal). */
		String tabulation = indentation();
		System.out.println(tabulation+"Folder: "+name);
		for(Component c: components) {
			c.view();
		}
	}

}
