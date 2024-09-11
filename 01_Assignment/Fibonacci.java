import java.util.Scanner;

// Class to generate Fibonacci series using a loop
class FibonacciLoop {
    public void generateFibonacci(int n) {
        int a = 0, b = 1;
        
        System.out.print("Fibonacci series (using loop): " + a);
        
        for (int i = 1; i < n; i++) {
            System.out.print(", " + b);
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println(); // For newline after the series
    }
}

// Class to generate Fibonacci series using recursion
class FibonacciRecursion {
    public void generateFibonacci(int n) {
        System.out.print("Fibonacci series (using recursion): ");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + (i < n - 1 ? ", " : ""));
        }
        System.out.println(); // For newline after the series
    }

    private int fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}

public class Fibonacci{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of terms in the Fibonacci series: ");
        int number = scanner.nextInt();

        // Generate Fibonacci series using loop
        FibonacciLoop loop = new FibonacciLoop();
        loop.generateFibonacci(number);

        // Generate Fibonacci series using recursion
        FibonacciRecursion recursion = new FibonacciRecursion();
        recursion.generateFibonacci(number);

        scanner.close();
    }
}
