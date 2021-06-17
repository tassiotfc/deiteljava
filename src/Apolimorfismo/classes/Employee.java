package Apolimorfismo.classes;

public abstract class Employee {
	private final String firsName;
	private final String lastName;
	private final String socialSecurityNumber;
	
	public Employee(String firsName, String lastName, String socialSecurityNumber) {
		super();
		this.firsName = firsName;
		this.lastName = lastName;
		this.socialSecurityNumber = socialSecurityNumber;
	}

	public String getFirsName() {
		return firsName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	@Override
	public String toString() {
		return String.format("%s %s%nsocial security number: %s", 
				getFirsName(), getLastName(), getSocialSecurityNumber());
	}
	
	public abstract double earnings();
}
