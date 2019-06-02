package _02_Cities;

public class SanDiego extends City{

	public SanDiego(int population, double growthRate) {
		super(population, growthRate);
	}

	@Override
	double getAnnualTaxes() {
	
		int gat = 1000000;
		
	gat += population *growthRate;
	System.out.println(gat);
		return gat;
		
	}
}
