package enums;

public class Stift extends Produkt {

	public Stift(int preis, Currency currency, String name) {
		super(preis, currency);
		setName(name);
	}
}
