package _02_Cities;

public class LosAngeles extends City{

	public LosAngeles(int population, double growthRate) {
		super(population, growthRate);
	
	}

	@Override
	double getAnnualTaxes() {
		double gat =(growthRate/2* growthRate)* population ;
		
		System.out.println(gat);
		return gat;
	}
	
}
