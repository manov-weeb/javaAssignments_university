import java.util.Scanner;

class Employee {

	double income, tax;

	Employee(double income) {
		this.income = income;
	}

	double calculateTax() {

		if (income <= 50000)
			tax = 0;
		else if (income > 50000 && income <= 60000)
			tax = (0.1) * (income - 50000);
		else if (income > 60000 && income <= 150000)
			tax = 1000 + ((income - 60000) * (0.2));
		else
			tax = 1000 + 1800 + ((income - 150000) * (0.3));

		return tax;

	}

}

public class TaxCalculator {

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		double income;

		System.out.print("Enter the income: ");
		income = scanner.nextDouble();

		Employee E1 = new Employee(income);

		System.out.println("The tax calculated is: " + E1.calculateTax());

		scanner.close();

	}

}