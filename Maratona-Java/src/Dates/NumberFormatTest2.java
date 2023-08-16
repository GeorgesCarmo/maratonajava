package Dates;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest2 { // formatar numeros

	public static void main(String[] args) {
		
		Locale localeFR = Locale.FRANCE;
		Locale localeDefault = Locale.getDefault();
		Locale localeJP = Locale.JAPAN;
		Locale localeIT = Locale.ITALY;
		
		NumberFormat[] nf = new NumberFormat[4];
		
		nf[0] = NumberFormat.getInstance(localeDefault);
		nf[1] = NumberFormat.getInstance(localeJP);
		nf[2] = NumberFormat.getInstance(localeIT);
		nf[3] = NumberFormat.getInstance(localeFR);
		
		double valor = 10_000.2130;
		
		for (NumberFormat numberFormat : nf) {
			System.out.println(numberFormat.format(valor));
		}
	}

}
