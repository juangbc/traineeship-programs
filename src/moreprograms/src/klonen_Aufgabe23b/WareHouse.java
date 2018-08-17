package klonen_Aufgabe23b;

public class WareHouse {

	private int areaInSquareMeters;
	
	public void setMeters(int meters) {
		this.areaInSquareMeters = meters;
	}
	
	public WareHouse(int areaInSquareMeters) {
		this.areaInSquareMeters = areaInSquareMeters;
	}
	
	public int getArea() {
		return areaInSquareMeters;
	}

}
