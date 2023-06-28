package entities;

public abstract class TaxPayment  {

	private String name;
	private Double anualIncome;
	
	public TaxPayment() {
	}

	public TaxPayment(String name, Double anualIncome) {
		this.name = name;
		this.anualIncome = anualIncome;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getAnualIncome() {
		return anualIncome;
	}

	public void setAnualIncome(Double anualIncome) {
		this.anualIncome = anualIncome;
	}
	
	public abstract double total();

	@Override
	public String toString() {
		return name + ": $ " + (String.format("%.2f",total()));
	}
}
