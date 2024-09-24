import java.util.Scanner;

class Solution {

    int arr[], n;

    // Constructor to initialize the array and its size
    Solution(int arr[], int n) {
        this.arr = arr;
        this.n = n;
    }

    // Method to get the sum of squares of elements
    int getSumOfSquares() {
        int sum = 0, square;
        for (int i = 0; i < n; i++) {
            square = arr[i] * arr[i];
            sum += square;
        }
        return sum;
    }

    // Method to get the square of the sum of elements
    int getSquareOfSum() {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        return sum * sum;
    }

    // Method to calculate the result (difference)
    int getResult() {
        return getSumOfSquares() - getSquareOfSum();
    }

}

public class SumOfSquares {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value for n: ");
        int n = scanner.nextInt();

        int arr[] = new int[n];

        System.out.println("Now enter 'n' numbers one by one -");

        // Reading array elements from the user
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();  // Assign input to array
        }

        // Create an instance of Solution and get the result
        Solution sol = new Solution(arr, n);
        int result = sol.getResult();

        // Output the result
        System.out.println("The result (Sum of squares - Square of sum) is: " + result);
        
        scanner.close();  // Close the scanner
    }

}
