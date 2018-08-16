import java.util.Scanner;

public class Bmi_rechner {

	private static String getBmiClass(double bmi) {

		if (bmi >= 18.5 && bmi <= 24) {
			return "Normalgewicht";
		}

		else if (bmi > 24 && bmi <= 29) {
			return "Übergewicht";
		}

		else if (bmi > 29 && bmi <= 34) {
			return "Adipositas1";
		}

		else if (bmi > 34 && bmi <= 39) {
			return "Asipositas2";
		}

		else if (bmi >= 40) {
			return "Asipositas3";
		}

		else
			return "bmi not found";
	}

	public static void main(String[] args) {

		double height;
		double weight;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Geben Sie Ihr Gewicht ein: ");
		weight = scanner.nextDouble();

		System.out.println("Geben Sie Ihre Größe ein:");
		height = scanner.nextDouble();

		double bmi = weight / Math.pow(height, 2);
		bmi = Math.round(bmi);

		System.out.println(bmi);
		System.out.println(getBmiClass(bmi));

	}

}
