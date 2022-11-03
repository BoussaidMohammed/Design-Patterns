package org.java.dp.composite;

import java.util.List;
import java.util.Vector;
/* Folder est le composite, car elle est � la fois composant
 * est un conteneur d'autre composant*/
public class Folder extends Component {
	private List<Component> components;
	
	public Folder(String name) {
		super(name);
		/*On suppose qu'au d�part le dossier est dans le niveau 0.*/
		level = 0;
		components = new Vector<>();
	}
	/* un dossier peut contenir d'autre dossier ou fichier c'est ici 
	 * que la laison se fait entre un composite et ses composant*/
	public Component addComposant(Component component) {
		/* chaque composant � le niveau de son p�re (composite) plus 1*/
		component.level = level + 1;
		components.add(component);
		return component;
	}
	public void view() {
		/* Pour afficher un dossier, il faut aussi afficher ses composants
		 * (fichier, et dossier), c'est une op�ration r�curssive qui se
		 * termine jusqu'� arriver un fichier (composant terminal). */
		String tabulation = indentation();
		System.out.println(tabulation+"Folder: "+name);
		for(Component c: components) {
			c.view();
		}
	}

}
