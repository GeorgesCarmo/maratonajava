package QConcorrencia;

import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

import QConcorrencia.Discount.Code;

public class StoreServiceWithDiscount {
		
	public String getPriceSync(String storeName) {
		double price = priceGenerator();
		Discount.Code discountCode = Discount.Code.values()[
		     ThreadLocalRandom.current().nextInt(Discount.Code.values().length)];
		return String.format("%s:%.2f:%s",storeName, price, discountCode);
	}
	
	public String ApplyDiscount(Quote quote) {
		delay();
		double discountValue = quote.getPrice() * (100 - quote.getDiscountCode().getPercentage()) / 100;
		return String.format("'%s' original price: '%.2f'. Apply discount code '%s'. Final price: '%.2f'", 
				quote.getStore(), quote.getPrice(), quote.getDiscountCode(), discountValue);
	}
	
	private double priceGenerator() {
		delay();
		return ThreadLocalRandom.current().nextInt(1, 500)*10;
	}
	
	private void delay() {
		try {
			int milli = ThreadLocalRandom.current().nextInt(200, 2500);
			TimeUnit.SECONDS.sleep(milli);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
