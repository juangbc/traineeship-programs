import java.util.Random;
import java.util.Scanner;

public class Number_Guesser {

	public static void main(String[] args) {

		int spielerNummer = new Random().nextInt(1000) + 1;
		System.out.println(spielerNummer);

		Scanner scanner = new Scanner(System.in);
		int number = 500;
		boolean notYet = false;

		System.out.println("Is your number:" + number + "?");

		while (spielerNummer != number) {

			if (scanner.nextInt() == 1) {
				break;
			}

			else if (scanner.nextInt() == 2) {
				number = (number / 2);
				System.out.println("Is your number:" + number + "?");
				continue;
			}

			else if (scanner.nextInt() == 3) {
				number = number + (number / 2);
				System.out.println("Is your number:" + number + "?");
				continue;
			}

			else
				break;
		}

	}

}
