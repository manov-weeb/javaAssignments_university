
public class Reverse{
	public static void main(String args[]){
		if (args.length == 0) {
            System.out.println("No arguments provided.");
            return;
        }

       
        for (String arg : args) {
            System.out.print(arg + " ");
        }

		System.out.println();

	   for (int i = args.length - 1; i >= 0; i--) {
            System.out.print(args[i] + " ");
        }
	}

}