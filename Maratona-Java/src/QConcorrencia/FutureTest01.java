package QConcorrencia;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class FutureTest01 {
	public static void main(String[] args) {
		ExecutorService executorService = Executors.newSingleThreadExecutor();
		Future<Double> dollarRequest = executorService.submit(() ->{
			TimeUnit.SECONDS.sleep(10);
			return 4.350;
		});
		
		System.out.println(doSomething());
		Double dollarResponse= null;
		try {
			dollarResponse = dollarRequest.get(3, TimeUnit.SECONDS);
		} catch (InterruptedException | ExecutionException | TimeoutException e) {
			e.printStackTrace();
		} finally {
			executorService.shutdown();
		}
		System.out.println("Dollar: " + dollarResponse);

	}
	
	private static long doSomething() {
		System.out.println(Thread.currentThread().getName());
		long sum = 0;
		for (int i = 0; i < 100_000; i++) {
			sum += i;
		}
		return sum;
		
	}

}
