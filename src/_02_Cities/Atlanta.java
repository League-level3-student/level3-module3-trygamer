package _02_Cities;

public class Atlanta extends City{

	public Atlanta(int population, double growthRate) {
		super(population, growthRate);
	}

	@Override
	double getAnnualTaxes() {
		double gat =(growthRate*2* growthRate)* population ;
		return gat;
	}

}
