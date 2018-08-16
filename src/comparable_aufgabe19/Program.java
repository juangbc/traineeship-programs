package comparable_aufgabe19;

import java.util.Arrays;

public class Program {

	static Worker[] workersArray = new Worker[5];

	public void createArray() {

		Worker worker0 = new Worker(111, "abd");
		Worker worker1 = new Worker(111, "ttt");
		Worker worker2 = new Worker(111, "asd");
		Worker worker3 = new Worker(111, "zus");
		Worker worker4 = new Worker(111, "adfg");

		workersArray[0] = worker0;
		workersArray[1] = worker1;
		workersArray[2] = worker2;
		workersArray[3] = worker3;
		workersArray[4] = worker4;

	}

	public static void main(String[] args) {

		Arrays.sort(workersArray);
	}

}
