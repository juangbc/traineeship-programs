package calculator;

import java.util.Random;
import java.util.Scanner;

public class Number_Guesser {


	
	
	public static int divideNumber(int number) {
	
	int oberGrenze = 1000;
	int unterGrenze = 0;
	int j = 20;
	
	for (int i = 1; i < j; i++) {
		Scanner scanner = new Scanner(System.in);
		int keyPress = scanner.nextInt();
		
		if (keyPress == 1) {
			return number;
		}
		else if (keyPress == 2) {
			oberGrenze = number;
			number = ((oberGrenze - unterGrenze) / 2) + unterGrenze;
			System.out.println("Is your number:" + number);
		}
		else if (keyPress == 3) {
			unterGrenze = number;
			number = ((oberGrenze - unterGrenze)/2) + unterGrenze;
			System.out.println("Is your number:" +number);
		}
		else 
			continue;
		}
	return 0;
		
	}
	
	public static void main(String[] args) {

		int spielerNummer = new Random().nextInt(1000) + 1;
		System.out.println(spielerNummer);

		Scanner scanner = new Scanner(System.in);
		int number = 500;

		System.out.println("Is your number:" + 500 + "?");	
		
		System.out.println(divideNumber(number));	
				}
		}


