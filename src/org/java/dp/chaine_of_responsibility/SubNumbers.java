package org.java.dp.chaine_of_responsibility;

public class SubNumbers implements Chain{
	private Chain nextChain;
	
	public void setNextChain(Chain nextChain) {
		this.nextChain = nextChain;
	}
	
	public void calculate(Numbers request) {
		if(request.getCalculationWanted().toLowerCase().equals("sub")){
			request.setResult(request.getNumber1() - request.getNumber2());
		}else {
			if(nextChain != null) {
				nextChain.calculate(request);
			}
		}
	}

}
