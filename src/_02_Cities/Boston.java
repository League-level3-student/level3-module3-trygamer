package _02_Cities;

public class Boston extends City {

	public Boston(int population, double growthRate) {
		super(population, growthRate);
	}

	@Override
	double getAnnualTaxes() {
		double gat = population *growthRate;
		double gat2 = population*.5;
		
		double gat3 = gat +gat2;
		System.out.println(gat);
		return gat3;
	}

}
