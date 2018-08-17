package klonen_Aufgabe23b;

public class Store {

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
	
}
