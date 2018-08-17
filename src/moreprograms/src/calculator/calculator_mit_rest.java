package calculator;

import java.util.Scanner;

public class calculator_mit_rest {

	public static void main(String[] args) {

		int i = 1;
		while (i == 1)
		{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Bitte geben Sie eine Zahl an:");
		int zahl1 =  sc.nextInt();
		System.out.println("Bitte geben Sie eine andere Zahl an:");
		int zahl2 = sc.nextInt();
		System.out.println("Wählen Sie eine option:");
		int option = sc.nextInt();
		
		switch (option) {
		case 1: System.out.println(zahl1 / zahl2);
		break;
		case 2: System.out.println(zahl1 + zahl2);
		break;
		case 3: System.out.println(zahl1 * zahl2);
		break;
		}
		
		i = sc.nextInt();
		//System.out.println(rest);

	}
	}
}
