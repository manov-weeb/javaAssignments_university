import java.util.Scanner;

class SimpleInterest {

    double principal, rate;
    int months;

    // Constructor for SimpleInterest class
    SimpleInterest(double principal, double rate, int months) {
        this.principal = principal;
        this.rate = rate;
        this.months = months;
    }

    // Method to calculate the total interest at the end of the time period
    double calculateTotalInterest() {
        double years = months / 12.0;  // Convert months to years
        return principal * rate * years;  // Calculate the interest
    }

    // Method to calculate the balance at the end of the time period
    double calculateBalance() {
        return principal + calculateTotalInterest();
    }
}

public class TotalInterest {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        double principal, rate;
        int timeInMonths;

        // Input for principal, interest rate, and time
        System.out.print("Enter the principal amount: ");
        principal = scanner.nextDouble();

        System.out.print("Enter the interest rate (in %): ");
        rate = scanner.nextDouble() / 100;  // Convert percentage to decimal

        System.out.print("Enter the time (in months): ");
        timeInMonths = scanner.nextInt();

        // Create SimpleInterest object
        SimpleInterest interestObj = new SimpleInterest(principal, rate, timeInMonths);

        // Display the total interest and the final balance
        System.out.println("Total interest calculated: " + interestObj.calculateTotalInterest());
        System.out.println("Final balance after " + timeInMonths + " months: " + interestObj.calculateBalance());
        
        scanner.close();
    }
}
