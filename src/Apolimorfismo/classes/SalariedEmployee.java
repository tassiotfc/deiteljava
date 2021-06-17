package Apolimorfismo.classes;

public class SalariedEmployee extends Employee{
	private double weeklySalary;
	
	public SalariedEmployee(String firsName, String lastName, String socialSecurityNumber, double weeklySalary) {
		super(firsName, lastName, socialSecurityNumber);
		
		if(weeklySalary < 0.0)
			throw new IllegalArgumentException("Weekly salary must be >= 0.0");
		
		this.weeklySalary = weeklySalary;
	}
	
	public double getWeeklySalary() {
		return weeklySalary;
	}

	public void setWeeklySalary(double weeklySalary) {
		if (weeklySalary < 0.0)
			throw new IllegalArgumentException("Weekly salary must be >= 0.0");
		
		this.weeklySalary = weeklySalary;
	}

	@Override
	public double earnings() {
		return getWeeklySalary();
	}

	@Override
	public String toString() {
		return String.format("salaried employee: %s%n%s: $%,.2f", super.toString(), "", getWeeklySalary());
	}
	
	
}
