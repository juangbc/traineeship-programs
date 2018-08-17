package calculator;

import java.util.Random;
import java.util.Scanner;

public class Improved_NumberGuesser {
	
	public static int divideNumber(int number, int spielerNummer) {
	
	int oberGrenze = 1000;
	int unterGrenze = 0;
	int j = 2;
	//Scanner scanner = new Scanner(System.in);
	//int keyPress = scanner.nextInt();
	//System.out.println(divideNumber(number, spielerNummer));	
	
	for (int i = 1; i < j; i++) {
		
		if (number == spielerNummer) {
			//System.out.println(j);
			return j;
			//return number;
		}
		else if (spielerNummer < number) {
			oberGrenze = number;
			number = ((oberGrenze - unterGrenze)/2) + unterGrenze;
			j++;
		}
		else if (spielerNummer > number) {
			unterGrenze = number;
			number = ((oberGrenze - unterGrenze)/2) + unterGrenze;
			j++;
		}
		else 
			continue;
		}
	return 0;
	}
	
	public static void main(String[] args) {

		int size = 10000;
		int [] js = new int[size];
		int number = 500;
		int sum =0;

		for (int i = 0; i <size; i++ ) {
			int spielerNummer = new Random().nextInt(1000) + 1;
			js[i]=divideNumber(number, spielerNummer);
			sum += js[i];
				}
			System.out.println(sum/size);
			}
		}

