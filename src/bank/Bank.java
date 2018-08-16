package bank;

public class Bank {

	String bankName;
	int creditLimit;

	public Bank() {
		// TODO Auto-generated constructor stub
	}

	public Bank(String bankName, int creditLimit) {
		this.bankName = bankName;
		this.creditLimit = creditLimit;
		System.out.println(this.bankName);
		System.out.println(this.creditLimit);
	}

	public void openBankAccount(String person, String bankName, int geld, int creditlimit) {
		this.bankName = bankName;
		this.creditLimit = creditlimit;
		System.out.println(person);
		System.out.println(this.bankName);
		System.out.println(geld);
		System.out.println(this.creditLimit);
	}

}
