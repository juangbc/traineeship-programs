package heater_Aufgabe21;

import java.util.Scanner;

public class Heater {

	int stufe;
	
	public void setStufe () throws Exception{
		Scanner sc = new Scanner(System.in);
		System.out.println("W�hlen Sie eine Stufe aus:");
		int stufe = sc.nextInt();
		
		if (stufe > 5) {
			throw new WrongNumberException();
		}
		if (stufe < 0) {
			throw new WrongNumberException();
		}
		System.out.println("Die gew�hlte Stufe ist jetzt "+stufe);
		
	}
}
