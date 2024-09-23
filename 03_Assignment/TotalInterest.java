import java.util.Scanner;

class Interest{
	double principal, interestRate, totalInterest, time;

	double rateInDecimal;

	Interest(double principal, double interestRate, double time){
		this.principal = principal;
		this.interestRate = interestRate;
		this.rateInDecimal = (this.interestRate)/(100.00);
		this.time = time/(12.0);
		
	} 

	

	double calculateTotalInterest(){
		totalInterest = principal * rateInDecimal * time;
		return totalInterest;
	}
}

public class TotalInterest{
	public static void main(String args[]){
		
		Scanner scanner = new Scanner(System.in);
		double p, rate, time;

		System.out.print("Enter the principal amount: ");
		p = scanner.nextDouble();

		System.out.println("Enter the interest rate(in %): ");
		rate = scanner.nextDouble();

		System.out.println("Enter the time (in months): ");
		time = scanner.nextDouble();

		Interest interestObj = new Interest(p, rate, time);
		System.out.println("The total interest calculated" + interestObj.calculateTotalInterest() + " for, \n Principal: " + interestObj.principal);
		System.out.println("Rate of Interest: " + interestObj.interestRate);
		System.out.println("for " + time);

		
		

		
	}
}