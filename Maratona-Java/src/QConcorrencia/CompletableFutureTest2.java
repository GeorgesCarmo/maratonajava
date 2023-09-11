package QConcorrencia;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.stream.Collectors;

public class CompletableFutureTest2 {
	public static void main(String[] args) {
		StoreService storeService = new StoreService();
		searchPriceAsyncCompletableFuture(storeService);
	}
	
	private static void searchPriceAsyncCompletableFuture(StoreService storeService) {
		List<String> stores = List.of("Store1", "Store2","Store3","Store4");
		long start = System.currentTimeMillis();
/*		List<Double> prices = stores.stream().map(storeService::getPriceAsyncCompletableFuture)
		.map(CompletableFuture::join)
		.collect(Collectors.toList());
		System.out.println(prices);
*/		
		List<CompletableFuture<Double>> completableFutures = stores.stream().map(storeService::getPriceAsyncCompletableFuture).collect(Collectors.toList());
		List<Double> prices = completableFutures.stream().map(CompletableFuture::join).collect(Collectors.toList());
		System.out.println(prices);
		
		long end = System.currentTimeMillis();
		System.out.printf("Time passed to searchPriceSync %dms%n", end-start);
	}
}
