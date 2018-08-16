package bank;

public class DeutscheBank extends Bank {

	static String bankName = "DeutscheBank";
	static int creditLimit = 100000;

	public DeutscheBank() {
		super(bankName, creditLimit);
	}

	public static void main(String[] args) {
		DeutscheBank deutscheBank = new DeutscheBank();
	}
}
