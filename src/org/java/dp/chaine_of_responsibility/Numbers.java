package org.java.dp.chaine_of_responsibility;

public class Numbers {
	/* les nombres represente les données á traiter. */
	private int number1;
	private int number2;
	/* calculationWanted c'est la requete qui indique le traitemen
	 * ou l'operation á faire avec les données.*/
	private String calculationWanted;
	/*result contient le resultat des traitements des données.*/
	private int result;

	public Numbers(int number1, int number2, String calculationWanted) {
		super();
		this.number1 = number1;
		this.number2 = number2;
		this.calculationWanted = calculationWanted;
	}

	public int getNumber1() {
		return number1;
	}

	public void setNumber1(int number1) {
		this.number1 = number1;
	}

	public int getNumber2() {
		return number2;
	}

	public void setNumber2(int number2) {
		this.number2 = number2;
	}

	public String getCalculationWanted() {
		return calculationWanted;
	}

	public void setCalculationWanted(String calculationWanted) {
		this.calculationWanted = calculationWanted;
	}

	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}

	
	
	
	
	
}
