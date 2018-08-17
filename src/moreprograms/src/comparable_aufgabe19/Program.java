package comparable_aufgabe19;

import java.util.Arrays;

public class Program {

	
	public static void main (String[] args ) {
		
		Worker[] workersArray = new Worker[5];
		
		Worker worker1 = new Worker("garra", 4);
		Worker worker2 = new Worker("aarra", 5);
		Worker worker3 = new Worker("barra", 2);
		Worker worker4 = new Worker("carra", 3);
		Worker worker5 = new Worker("barra", 1);
		
		workersArray[0] = worker1;
		workersArray[1] = worker2;
		workersArray[2] = worker3;
		workersArray[3] = worker4;
		workersArray[4] = worker5;
		
		Arrays.sort(workersArray);
		
		for (Worker worker: workersArray) {
			System.out.println(worker.nachname + " " + worker.id);
		}
	}
	
}
