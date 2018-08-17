package klonen_Aufgabe23;

public class WareHouse implements Cloneable {

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
	
	@Override
	public WareHouse clone() {
		try{
			WareHouse wareHouse = (WareHouse) super.clone();
			return wareHouse;
		}
		
		catch (CloneNotSupportedException e){
			System.out.println("Cloning not gut here");
		}
		 return null;
	}

}
