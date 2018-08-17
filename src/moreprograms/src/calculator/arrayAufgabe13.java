package calculator;

import java.util.Arrays;
import java.util.Scanner;

public class arrayAufgabe13 {

	
	public static void main(String[] args) {
		int[][] feld = new int[3][3];
		boolean[] equalNumbers = new boolean[3];
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i<3; i++) {
			for (int j = 0; j < 3; j++) {
				int digit = sc.nextInt();
				feld[i][j] = digit;
			}	
		}
		System.out.println(compareNumbers(feld));
	}
	
	public static boolean compareNumbers (int[][] feld) {
		
		
		for (int i = 0; i<3; i++) {
			if (feld[i][0] == feld[i][1] && feld[i][1] == feld[i][2]) {
					return true;
				}
		}
		return false;
	}
		
		

	

	

	}

