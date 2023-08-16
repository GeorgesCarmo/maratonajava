package Dates;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest { // formatar numeros em moeda

	public static void main(String[] args) {
		
		Locale localeFR = Locale.FRANCE;
		Locale localeDefault = Locale.getDefault();
		Locale localeJP = Locale.JAPAN;
		Locale localeIT = Locale.ITALY;
		
		NumberFormat[] nf = new NumberFormat[4];
		
		nf[0] = NumberFormat.getCurrencyInstance(localeDefault);
		nf[1] = NumberFormat.getCurrencyInstance(localeJP);
		nf[2] = NumberFormat.getCurrencyInstance(localeIT);
		nf[3] = NumberFormat.getCurrencyInstance(localeFR);
		
		double valor = 10_000.2130;
		
		for (NumberFormat numberFormat : nf) {
			System.out.println(numberFormat.format(valor));
		}
	}

}
