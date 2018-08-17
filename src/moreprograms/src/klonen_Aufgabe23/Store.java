package klonen_Aufgabe23;

public class Store implements Cloneable {

	private String name;
	WareHouse wareHouse;
	CashRegister cashRegister;
	
	public Store(String name, WareHouse wareHouse, CashRegister cashRegister) {
		this.name = name;
		this.wareHouse = wareHouse;
		this.cashRegister = cashRegister;
	}

	@Override
	public String toString() {
		return ("Store name:" + this.name.toString() + " " +this.wareHouse.getArea() + " "+ this.cashRegister.getMoney());
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public WareHouse getWareHouse() {
		return wareHouse;
	}
	
	public CashRegister getCashRegister() {
		return cashRegister;
	}
	
	@Override
	public Store clone() {
		try{
			Store storeCopy = (Store) super.clone();
			storeCopy.wareHouse = (WareHouse) storeCopy.wareHouse.clone();
			storeCopy.cashRegister = (CashRegister) storeCopy.cashRegister.clone();
			return storeCopy;
		}
		
		catch (CloneNotSupportedException e){
			System.out.println("Cloning not gut here");
		}
		 return null;
	}
	
}
