package org.java.dp.composite;
/* Classe abstraite, car son concretisation est un dossier ou un fichier*/
public abstract class Component {
	protected String name;
	protected int level;//Niveau du composant dans la heiarchie.
	
	public Component(String name) {
		this.name = name;
	}
	/* En utilisant le nombre de niveau (level)
	 * on essay de creer une indentation : nombre de tabulation*/
	public String indentation() {
		String str = "";
		for(int i = 0;i < level;i++) {
			str += "\t";
		}
		return str;
	}
	/* Methode abstraite, car on ne peut pas la concretiser ici encore*/
	public abstract void view();
}
