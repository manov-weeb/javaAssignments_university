import java.util.Scanner;

// Class to calculate factorial using a loop
class FactorialLoop {
    public long calculateFactorial(int n) {
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
}

// Class to calculate factorial using recursion
class FactorialRecursion {
    public long calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * calculateFactorial(n - 1);
    }
}

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to calculate its factorial: ");
        int number = scanner.nextInt();

        // Calculate factorial using loop
        FactorialLoop loop = new FactorialLoop();
        long factorialUsingLoop = loop.calculateFactorial(number);
        System.out.println("Factorial of " + number + " using loop: " + factorialUsingLoop);

        // Calculate factorial using recursion
        FactorialRecursion recursion = new FactorialRecursion();
        long factorialUsingRecursion = recursion.calculateFactorial(number);
        System.out.println("Factorial of " + number + " using recursion: " + factorialUsingRecursion);

        scanner.close();
    }
}
