package bank;

public class UniCredit extends Bank {

	static String bankName = "UniCredit";
	static int creditLimit = 100000;

	public UniCredit() {
		super(bankName, creditLimit);
	}

	public static void main(String[] args) {
		UniCredit uniCredit = new UniCredit();
	}
}
