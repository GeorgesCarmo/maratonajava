package OStreams;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Stream;

public class StreamTest10 {

	public static void main(String[] args) {
		Stream.iterate(1, n -> n + 2).limit(10).forEach(n -> System.out.print(n+" ")); // retorna uma sequencia infinita por isso o limit, no caso de n+2
		System.out.println();
		Stream.iterate(new int[] {0,1}, n -> new int[] {n[1], n[0] + n[1]})
			.limit(10)
			.forEach(a -> System.out.println(Arrays.toString(a)));
		
		Stream.iterate(new int[] {0,1}, n -> new int[] {n[1], n[0] + n[1]}) // sequencia de fibo
		.limit(10)
		.map(a -> a[0])
		.forEach(a -> System.out.print(a+" "));
		
		System.out.println();
		
		ThreadLocalRandom random = ThreadLocalRandom.current(); // numeros aleatórios
		Stream.generate(() -> random.nextInt(1,100))
		.limit(10)
		.forEach(a -> System.out.print(a+" "));
	}
	}