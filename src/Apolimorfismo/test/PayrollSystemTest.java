package Apolimorfismo.test;

import java.util.Iterator;

import Apolimorfismo.classes.BasePlusCommissionEmployee;
import Apolimorfismo.classes.ComissionEmployee;
import Apolimorfismo.classes.Employee;
import Apolimorfismo.classes.HourlyEmployee;
import Apolimorfismo.classes.SalariedEmployee;

public class PayrollSystemTest {
	public static void main(String[] args) {
		SalariedEmployee salariedEmployee = 
				new SalariedEmployee("John", "Smith", "111-11-111", 800);
		HourlyEmployee hourlyEmployee =
				new HourlyEmployee("Mary", "Oliver", "222-22-111", 16.75, 40);
		ComissionEmployee comissionEmployee = 
				new ComissionEmployee("Pepe", "Reina", "333-33-122", 1000, 0.06);
		BasePlusCommissionEmployee basePlusCommissionEmployee =
				new BasePlusCommissionEmployee("Xavi", "Pinto", "444-14-444", 5000, 0.04, 300);
		
		System.out.println("Employees processed individually:");
		
		System.out.printf("%n%s%n%s: $%,.2f%n%n",
				salariedEmployee, "earned", salariedEmployee.earnings());
		System.out.printf("%s%n%s: $%,.2f%n%n",
				hourlyEmployee, "earned", hourlyEmployee.earnings());
		System.out.printf("%s%n%s: $%,.2f%n%n",
				comissionEmployee, "earned", comissionEmployee.earnings());
		System.out.printf("%s%n%s: $%,.2f%n%n", 
				basePlusCommissionEmployee, "earned", 
				basePlusCommissionEmployee.earnings());
		
		Employee[] employees = new Employee[4];
		
		employees[0] = salariedEmployee;
		employees[1] = hourlyEmployee;
		employees[2] = comissionEmployee;
		employees[3] = basePlusCommissionEmployee;
		
		System.out.printf("Employees processed polymorphically:%n%n");
		
		for(Employee currentEmployee: employees) {
			System.out.println(currentEmployee);
			
			if(currentEmployee instanceof BasePlusCommissionEmployee) {
				BasePlusCommissionEmployee employee = (BasePlusCommissionEmployee) currentEmployee;
				
				employee.setBaseSalary(1.10 * employee.getBaseSalary());
				
				System.out.printf(
						"new base salary with 10%% increase is: $%,.2f%n",
						employee.getBaseSalary());
			}
			System.out.printf("earned $%,.2f%n%n", currentEmployee.earnings());
		}
		
		for (int i = 0; i < employees.length; i++) {
			System.out.printf("Employee %d is a %s%n", i, employees[i].getClass().getName());
		}
	}
}
