package in.cdac.pojo;

public class CompoundInterestCalculator {
	private float principal;
	private float annualInterestRate;
	private int numberOfCompounds;
	private int years;
	
	public CompoundInterestCalculator() {};
	
	public CompoundInterestCalculator(float principal, float annualInterestRate, int numberOfCompounds, int years) {
		super();
		this.principal = principal;
		this.annualInterestRate = annualInterestRate;
		this.numberOfCompounds = numberOfCompounds;
		this.years = years;
	}

	public float getPrincipal() {
		return principal;
	}

	public void setPrincipal(float principal) {
		this.principal = principal;
	}

	public float getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(float annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	public int getNumberOfCompounds() {
		return numberOfCompounds;
	}

	public void setNumberOfCompounds(int numberOfCompounds) {
		this.numberOfCompounds = numberOfCompounds;
	}

	public int getYears() {
		return years;
	}

	public void setYears(int years) {
		this.years = years;
	}

	@Override
	public String toString() {
		return "CompoundInterestCalculator [principal=" + principal + ", annualInterestRate=" + annualInterestRate
				+ ", numberOfCompounds=" + numberOfCompounds + ", years=" + years + "]";
	}
	
	
	
}
