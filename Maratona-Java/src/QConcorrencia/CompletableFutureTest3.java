package QConcorrencia;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.Collectors;

public class CompletableFutureTest3 {
	public static void main(String[] args) {
		StoreServiceDeprecated StoreServiceDeprecated = new StoreServiceDeprecated();
		searchPriceAsyncCompletableFuture(StoreServiceDeprecated);
	}
	
	private static void searchPriceAsyncCompletableFuture(StoreServiceDeprecated storeService) {
		List<String> stores = List.of("Store1", "Store2","Store3","Store4");
		
		ExecutorService ex = Executors.newFixedThreadPool(10, r -> {
			Thread thread = new Thread(r);
			thread.setDaemon(true);
			return thread;
		});
		
		long start = System.currentTimeMillis();
		
		List<CompletableFuture<Double>> completableFutures = stores.stream()
			.map(s -> CompletableFuture.supplyAsync(() -> storeService.getPriceSync(s),ex))
			.collect(Collectors.toList());
		
		List<Double> prices = completableFutures.stream()
			.map(CompletableFuture::join)
			.collect(Collectors.toList());
		System.out.println(prices);
		
		long end = System.currentTimeMillis();
		
		ex.shutdown();
		System.out.printf("Time passed to searchPriceSync %dms%n", end-start);
	}
}
