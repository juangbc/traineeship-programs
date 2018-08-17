package klonen_Aufgabe23b;

public class Program {

	
	public static void main(String[] args) {

		WareHouse wareHouse = new WareHouse(30);
		CashRegister cashRegister = new CashRegister(1000);
		Store store1 = new Store("Timberland", wareHouse, cashRegister);
		System.out.println(store1.toString());
		System.out.println(store1.toString());
	}
	
}
