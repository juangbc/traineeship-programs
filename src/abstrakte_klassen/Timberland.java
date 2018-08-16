package abstrakte_klassen;

public abstract class Timberland extends Shoe {
	String brand = "Timberland";
	int guaranteeInDays = 120;

	public Timberland(String sole, String material, String color, boolean waterproof) {
		super(sole, material, color, waterproof);
	}

}
