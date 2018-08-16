package abstrakte_klassen;

public abstract class Nike extends Shoe {

	String brand = "Nike";
	int guaranteeInDays = 150;

	public Nike(String sole, String material, String color, boolean waterproof) {
		super(sole, material, color, waterproof);
	}

}
