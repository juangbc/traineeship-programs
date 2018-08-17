package klonen_Aufgabe23;

public class Program {

	
	public static void main(String[] args) {

		WareHouse wareHouse = new WareHouse(30);
		CashRegister cashRegister = new CashRegister(1000);
		Store store1 = new Store("Timberland", wareHouse, cashRegister);
		System.out.println(store1.toString());
		
		Store store2 = store1.clone();
		store2.setName("Polo");
		store2.getWareHouse().setMeters(500);
		store2.getCashRegister().setMoney(300);

		System.out.println(store2.toString());
		System.out.println(store1.toString());
	}
	
}
