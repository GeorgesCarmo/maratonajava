package QConcorrencia;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class CompletableFutureTest01 {
	public static void main(String[] args) {
		StoreService storeService = new StoreService();
//		searchPriceSync(storeService);
//		searchPriceAsyncFuture(storeService);
		searchPriceAsyncCompletableFuture(storeService);
		
	}
	private static void searchPriceSync(StoreService storeService) {
		long start = System.currentTimeMillis();
		System.out.println(storeService.getPriceSync("Store 1"));
		System.out.println(storeService.getPriceSync("Store 2"));
		System.out.println(storeService.getPriceSync("Store 3"));
		System.out.println(storeService.getPriceSync("Store 4"));
		long end = System.currentTimeMillis();
		System.out.printf("Time passed to searchPriceSync %dms%n", end-start);
	}
	
	private static void searchPriceAsyncFuture(StoreService storeService) {
		long start = System.currentTimeMillis();
		Future<Double> pricesAsyncFuture1 = storeService.getPricesAsyncFuture("Store 1");
		Future<Double> pricesAsyncFuture2 = storeService.getPricesAsyncFuture("Store 2");
		Future<Double> pricesAsyncFuture3 = storeService.getPricesAsyncFuture("Store 3");
		Future<Double> pricesAsyncFuture4 = storeService.getPricesAsyncFuture("Store 4");
		try {
			pricesAsyncFuture1.get();
			pricesAsyncFuture2.get();
			pricesAsyncFuture3.get();
			pricesAsyncFuture4.get();
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
		long end = System.currentTimeMillis();
		System.out.printf("Time passed to searchPriceSync %dms%n", end-start);
		storeService.shutdown();
	}
	
	private static void searchPriceAsyncCompletableFuture(StoreService storeService) {
		long start = System.currentTimeMillis();
		CompletableFuture<Double>priceAsyncFuture1 = storeService.getPriceAsyncCompletableFuture("Store 1");
		CompletableFuture<Double>priceAsyncFuture2 = storeService.getPriceAsyncCompletableFuture("Store 2");
		CompletableFuture<Double>priceAsyncFuture3 = storeService.getPriceAsyncCompletableFuture("Store 3");
		CompletableFuture<Double>priceAsyncFuture4 = storeService.getPriceAsyncCompletableFuture("Store 4");
		
		System.out.println(priceAsyncFuture1.join());
		System.out.println(priceAsyncFuture2.join());
		System.out.println(priceAsyncFuture3.join());
		System.out.println(priceAsyncFuture4.join());
		
		long end = System.currentTimeMillis();
		System.out.printf("Time passed to searchPriceSync %dms%n", end-start);
	}
}
