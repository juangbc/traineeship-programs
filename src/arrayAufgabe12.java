import java.util.Arrays;
import java.util.Scanner;

public class arrayAufgabe12 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sizeArray = scanner.nextInt();
		int[] array = new int[sizeArray];
		int hilfsVariable;

		array[0] = scanner.nextInt();

		for (int i = 1; i < sizeArray; i++) {

			array[i] = scanner.nextInt();

			if (array[i - 1] > array[i]) {
				hilfsVariable = array[i];
				array[i] = array[i - 1];
				array[i - 1] = hilfsVariable;
			}

		}
		System.out.println(Arrays.toString(array));
		System.out.println(array[sizeArray - 1]);

	}

}
