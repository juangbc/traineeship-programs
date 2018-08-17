package osaft_Aufgabe22;

import java.util.Scanner;

public class OsaftLaden {
	
	int tempJuice;
	int numberOfGlasses = 3;

	public void glasOsaft() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Geben Sie bitte die Temperatur im Kühlschrank ein:");
		this.tempJuice = sc.nextInt();
	}
	
	public void trinken () throws Exception {
		
		if (tempJuice > 15) {
			throw new OsaftException();
		}
		
		else if (tempJuice < 9) {
			throw new OsaftException();
		}
		System.out.println("mmm... lecker!");
	}
	
	public void buyGlas () throws Exception {
		if (numberOfGlasses <= 0) {
			throw new OsaftException();
		}
			System.out.println("Noch " +numberOfGlasses+ " Gläser vorhanden!");
			numberOfGlasses--;		
	}
	
}
