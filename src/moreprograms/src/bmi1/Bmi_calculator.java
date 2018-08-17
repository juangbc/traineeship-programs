package bmi1;

import java.util.Scanner;

public class Bmi_calculator {

	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {	
		
			System.out.println("Bitte geben Sie ihr Gewicht an:");
			double weight =  sc.nextDouble();
			System.out.println("Bitte geben Sie Ihre Körpergröße an:");
			double height = sc.nextDouble();
			double bmi = weight / (height * height);
			
			System.out.println(bmi);
		

	}

}
