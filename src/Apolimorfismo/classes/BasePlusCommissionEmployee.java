package Apolimorfismo.classes;

public class BasePlusCommissionEmployee extends ComissionEmployee{
	
	private double baseSalary; // salario base por semana;

	public BasePlusCommissionEmployee(String firsName, String lastName, String socialSecurityNumber, double grossSale,
			double commissionRate, double baseSalary) {
		super(firsName, lastName, socialSecurityNumber, grossSale, commissionRate);
		
		if(baseSalary < 0.0)
			throw new IllegalArgumentException("Base salary must be >= 0.0");
		
		this.baseSalary = baseSalary;
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		if(baseSalary < 0.0)
			throw new IllegalArgumentException("Base salary must be >= 0.0");
		
		this.baseSalary = baseSalary;
	}
	
	@Override
	public double earnings() {
		return getBaseSalary() * super.earnings();
	}

	@Override
	public String toString() {
		return String.format("%s %s; %s: $%,.2f", 
				"base-salaried", super.toString(), 
				"base salary", getBaseSalary());
	}
}
