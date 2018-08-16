package enums;

public abstract class Produkt {

	private int preis;
	private String name;
	private Currency currency;

	public Produkt(int preis, Currency currency) {
		this.preis = preis;
		this.currency = currency;
	}

	public void buyProduct(Currency currency, int preis) {
		System.out.println("Sie haben ein " + name + " für " + preis + " " + currency + " gekauft");
	}

	public void setName(String name) {
		this.name = name;
	}

}
