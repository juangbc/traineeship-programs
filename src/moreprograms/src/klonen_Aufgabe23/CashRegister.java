package klonen_Aufgabe23;

public class CashRegister implements Cloneable {
	
	public int money;
	
	
	public CashRegister(int money) {
		this.money = money;
	}
	
	public int getMoney() {
		return money;
	}
	
	public void setMoney(int money) {
		this.money = money;
	}
	
	@Override
	public CashRegister clone() {
		try{
			CashRegister cashRegister = (CashRegister) super.clone();
			return cashRegister;
		}
		
		catch (CloneNotSupportedException e){
			System.out.println("Cloning not gut here");
		}
		 return null;
	}

}
