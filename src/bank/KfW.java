package bank;

public class KfW extends Bank {

	static String bankName = "KfW";
	static int creditLimit = 100000;

	public KfW() {
		super(bankName, creditLimit);
	}

	public static void main(String[] args) {
		KfW kfW = new KfW();
	}
}
