package enums;

public class Program {

	public static void main(String[] args) {

		Currency currency;
		currency = Currency.EURO;

		switch (currency) {
		case EURO:
			System.out.println("Euro");
			break;
		case DOLLAR:
			System.out.println("Dollar");
			break;
		case YEN:
			System.out.println("Yen");
			break;
		}

		Bier bier = new Bier(20, Currency.DOLLAR, "Asahi");
		bier.buyProduct(currency, 20);

	}
}
