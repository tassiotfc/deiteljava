package Apolimorfismo.classes;

public class ComissionEmployee extends Employee{
	private double grossSale; //vendas brutas semanais
	private double commissionRate; //porcentagem da comissao
	
	public ComissionEmployee(String firsName, String lastName, String socialSecurityNumber, double grossSale,
			double commissionRate) {
		super(firsName, lastName, socialSecurityNumber);
		
		if(commissionRate <= 0.0 || commissionRate >= 1.0)
			throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
		
		if(grossSale <= 0.0)
			throw new IllegalArgumentException("Gross sales must be >= 0.0");
		
		this.grossSale = grossSale;
		this.commissionRate = commissionRate;
	}
	
	public void setGrossSales(double grossSale) {
		if(grossSale <= 0.0)
			throw new IllegalArgumentException("Gross sales must be >= 0.0");
		
		this.grossSale = grossSale;
	}
	
	public double getGrossSales() {
		return grossSale;
	}
	
	public void setCommissionRate(double commissionRate) {
		if(commissionRate <= 0.0 || commissionRate >= 1.0)
			throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
			
		this.commissionRate = commissionRate;
	}
	
	public double getCommissionRate() {
		return commissionRate;
	}

	@Override
	public double earnings() {
		return getCommissionRate() * getGrossSales();
	}
	
	@Override
	public String toString() {
		return String.format("%s: %s%n%s: $%,.2f; %s: %.2f", 
				"commission employee", super.toString(),
				"gross sales", getGrossSales(), 
				"commission", getCommissionRate());
	}
}
