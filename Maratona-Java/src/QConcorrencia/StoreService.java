package QConcorrencia;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class StoreService {
		private static final ExecutorService ex = Executors.newCachedThreadPool();
		
	public double getPriceSync(String storeName) {
		System.out.printf("Getting prices sync for store %s%n", storeName);
		return priceGenerator();
	}
	
	public void shutdown() {
		ex.shutdown();
	}
	
	public Future<Double> getPricesAsyncFuture(String storeName){
		System.out.printf("Getting prices sync for stores %s%n", storeName);
		return ex.submit(this::priceGenerator);
	}
	
	public CompletableFuture<Double> getPriceAsyncCompletableFuture (String storeName){
		System.out.printf("Getting prices sync for stores %s%n", storeName);
		return CompletableFuture.supplyAsync(this::priceGenerator);
		
	}
	private double priceGenerator() {
		System.out.printf("%s generating price %n", Thread.currentThread().getName());
		return ThreadLocalRandom.current().nextInt(1, 500)*10;
	}
	
	private void delay() {
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
