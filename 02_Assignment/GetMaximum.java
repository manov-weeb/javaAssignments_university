public class GetMaximum{

	public static void main(String args[]){
		int max = Integer.MIN_VALUE;
		int numbers[] = new int[args.length];

		int j = 0;

		for(String arg: args)
			numbers[j++] = Integer.parseInt(arg);

		for(int i = 0; i < numbers.length; i++){
			
			if(numbers[i] > max)
				max = numbers[i];

		}

		System.out.print("The maximum element is: " + max);
	}

}