package abstrakte_klassen;

public abstract class Shoe {

	String sole;

	String material;

	String color;

	boolean waterproof;

	String brand;

	int guaranteeInDays;

	public abstract void tieShoes();

	public void cleanWithWater() {
		System.out.println("wushhhhhhhhhh");
	}

	public Shoe(String sole, String material, String color, boolean waterproof) {

		this.sole = sole;
		this.color = color;
		this.material = material;
		this.waterproof = waterproof;

	}

}
