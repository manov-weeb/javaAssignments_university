public class AverageAndSum{
	public static void main(String args[]){
		
		int evenCount = 0, oddCount = 0;
		int evenSum = 0, oddSum = 0;
		float evenAverage, oddAverage;

		for(String arg: args){
			int num = Integer.parseInt(arg);
			
			if(num % 2 == 0){
				evenCount++;
				evenSum += num;
			}
			else{
				oddCount++;
				oddSum += num;
			}
		}

		evenAverage = (float) evenSum / (float) evenCount;
		oddAverage = (float) oddSum / (float) oddCount;
		
		System.out.println("You entered " + evenCount + " even numbers, which sums up to " + evenSum + " and averages as " + evenAverage);
		System.out.println("You entered " + oddCount + " odd numbers, which sums up to " + oddSum + " and averages as " + oddAverage);

	}

}