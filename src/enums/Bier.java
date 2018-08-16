package enums;

public class Bier extends Produkt {

	public Bier(int preis, Currency currency, String name) {
		super(preis, currency);
		setName(name);
	}

}
