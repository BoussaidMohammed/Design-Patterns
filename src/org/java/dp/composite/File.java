package org.java.dp.composite;

public class File extends Component{
	/* la classe file est un composant terminal*/
	public File(String name) {
		super(name);
		level = 0;
	}
	/* Au niveau de fichier on reelement concritiser la methode view */
	public void view() {
		String tabulation = indentation();
		/* recuperation du niveau d'indentation afin d'afficher le nom
		 * du fichier dans son bon emplacement de l'hiearchie*/
		System.out.println(tabulation + "File:"+name);
	}

}
