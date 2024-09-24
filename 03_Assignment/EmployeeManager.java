import java.util.Scanner;

class Employee {

	double salary, tax;

	// Constructor for Employee class
	Employee(double salary, double tax) {
		this.salary = salary;
		this.tax = tax;
	}

	// Method to calculate the net salary after tax deduction
	double netSalary() {
		return salary - tax;
	}

	// Method to get the grade of an employee (can be overridden by subclasses)
	String grade(String grade) {
		return "Employee grade: " + grade;
	}
}

// Example subclass that can extend Employee for further functionality if needed
class Manager extends Employee {

	Manager(double salary, double tax) {
		super(salary, tax);
	}

	
	
	String grade(String grade) {
		return "Manager grade: " + grade;
	}
}

public class EmployeeManager {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Get salary and tax for Employee
		System.out.print("Enter Employee salary: ");
		double employeeSalary = scanner.nextDouble();
		System.out.print("Enter Employee tax: ");
		double employeeTax = scanner.nextDouble();

		// Get salary and tax for Manager
		System.out.print("Enter Manager salary: ");
		double managerSalary = scanner.nextDouble();
		System.out.print("Enter Manager tax: ");
		double managerTax = scanner.nextDouble();

		// Create Employee and Manager objects
		Employee employee = new Employee(employeeSalary, employeeTax);
		Manager manager = new Manager(managerSalary, managerTax);

		// Display net salary and grade for Employee
		System.out.println("Employee's net salary: " + employee.netSalary());
		System.out.println(employee.grade("B"));

		// Display net salary and grade for Manager
		System.out.println("Manager's net salary: " + manager.netSalary());
		System.out.println(manager.grade("A"));

		scanner.close();
	}
}
