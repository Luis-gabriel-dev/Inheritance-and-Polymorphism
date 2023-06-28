package entities;

public class CompanyPayer extends TaxPayment {

	private Integer employees;
	
	public CompanyPayer() {
	}

	public CompanyPayer(String name, Double anualIncome, Integer employees) {
		super(name, anualIncome);
		this.employees = employees;
	}

	public Integer getEmployees() {
		return employees;
	}

	@Override
	public double total() {
		
		if(getEmployees() > 10) {
			return getAnualIncome() *  14.00 / 100.00;
		}
		else {
			return getAnualIncome() * 16.00 / 100.00;
		}
	}
}
