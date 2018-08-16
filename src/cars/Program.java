package cars;

public class Program {
	static Car cars[] = new Car[5];

	public static void main(String[] args) {
		Tesla tesla1 = new Tesla("s3", 300, 8, 12);
		//tesla1.printPosition();
		//tesla1.drive();
		//tesla1.printPosition();
		Tesla tesla2 = new Tesla("Testla model 2", 400, 8, 12);
		Tesla tesla3 = new Tesla("Testla model 3", 450, 8, 12);
		Audi audi1 = new Audi("quattro", 280, 66, 77);
		Audi audi2 = new Audi("tt", 280, 66, 77);

		cars[0] = tesla1;
		cars[1] = tesla2;
		cars[2] = tesla3;
		cars[3] = audi1;
		cars[4] = audi2;
		saveCars();
	}

	public static void saveCars() {
		for (int i = 0; i < cars.length; i++) {
			cars[i].drive();
			cars[i].printPosition();
		}
	}
}
