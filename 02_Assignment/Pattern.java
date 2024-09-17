public class Pattern {
	public static void main(String args[]) {

		for (int i = 1; i <= 4; i++) {
			int value = i;

			for (int j = (4 - i + 1); j >= 1; j--) {

				System.out.print(value + " ");
				value = value + i;

			}
			System.out.println();

		}

	}

}