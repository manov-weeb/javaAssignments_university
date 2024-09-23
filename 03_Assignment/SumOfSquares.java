import java.util.Scanner;

class Solution{

	int arr[], int n;

	Solution(int arr[], int n){
		this.arr = arr;
		this.n = n;
	}

	int getSumOfSquares(int arr[], int n){
		
		int sum = 0, square;
		
		for(int i = 0; i < n; i++){
			square = arr[i] * arr[i];
			sum += square;
			
		}

		return sum;

	}

	int getSquareOfSum(int arr[], int n){

		
		int sum = 0;

		for(int i = 0; i < n; i++){
			sum += arr[i];
			
		}

		return sum * sum;

	}

	int getResult(){
		return (getSumOfSquares(arr, n) - getSquareOfSum(arr, n));
	}
	

}

public class SumOfSquares{

	
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the value for n: ");
		
		int n = scanner.nextInt();
		
		int arr[] = new int[n];

		System.out.println("Now enter 'n' numbers one by one -");
		

		for(int i = 0; i < n; i++){
			int element = scanner.nextInt();
		}

		Solution sol = new Solution(arr, n);
		int result = sol.getResult();

		

		System.out.println("The result is: " + getResult());

		
		
		
	}


}