package RPadroesdeprojeto;

public class CurrencyFactoryTest01 {

	public static void main(String[] args) {
		Currency currency = CurrencyFactory.newCurrency(Country.BRAZIL);
		System.out.println(currency.getSymbol());
	}

}
