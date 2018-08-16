package bank;

public class Commerzbank extends Bank {

	static String bankName = "Commerzbank";
	static int creditLimit = 999999;

	public Commerzbank() {
		super(bankName, creditLimit);
	}

	public static void main(String[] args) {
		Commerzbank commerzbank = new Commerzbank();
	}
}
