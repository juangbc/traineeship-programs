package bank;

public class Program {

	public static void main(String[] args) {

		/*
		 * Bank deutscheBank = new DeutscheBank(); Bank uniCredit = new UniCredit(); Bank kfW = new KfW();
		 */
		Person frank = new Person("Frank", "Walter", 1000);
		Bank commerzBank = new Commerzbank();
		System.out.println("----------------------------");
		commerzBank.openBankAccount(frank.nachname, commerzBank.bankName, frank.geld, commerzBank.creditLimit);
	}

}
