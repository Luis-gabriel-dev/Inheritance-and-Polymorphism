package entities;

public class IndividualPayer extends TaxPayment {

	private Double healthExpenditures;
	
	public IndividualPayer(){
	}
	
	public IndividualPayer(String name, Double anualIncome, Double healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}

	public Double getHealthExpenditures() {
		return healthExpenditures;
	}

	@Override
	public double total() {
		if(getAnualIncome() <= 20000.00) {
		   double a, y, w;	
		   a = getAnualIncome() *  15.00 / 100.00;
		   y = getHealthExpenditures() * 50.00 / 100;
		   w = a - y;
		   return w;
		}
		if(getAnualIncome() > 20000.00) {
		  double b, z, x;
		  b = getAnualIncome() * 25.00 / 100.00;
		  z = getHealthExpenditures() * 50.00 / 100;
		  x = b - z;
		  return x;
	   }
		return total();
    }
}