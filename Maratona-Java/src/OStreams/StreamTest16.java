package OStreams;

import java.util.stream.LongStream;
import java.util.stream.Stream;
// para usar parallel stream :
// - Benchmark(avaliar desempenho)
// - Unboxing | boxing
// - (limit, findFist) não é bom para usar parallel stream, melhor usar findAny
// - quanto maior o processamento melhor sera o resultado do parallel stream 
// - se a quantidade de dados for pequena não vale a pena usar
// - Verificar os tipos de coleções, por exemplo ArrayList é excelente para trabalhar com parallel stream e LinkedList é ruim pois precisa
// percorrer a lista inteira. O iterate stream é ruim e o rangeClosed é melhor.
// - Tamanho do stream (tamanho definido é melhor para usar o parallel).
// - Processamento merge: 
public class StreamTest16 {

	public static void main(String[] args) {
		System.out.println(Runtime.getRuntime().availableProcessors());
		long num = 10_000_000;
		sumFor(num);
		sumStreamIterate(num);
		sumParallelStream(num);
		sumLongStream(num);
		sumLongParallelStream(num);
	}
	private static void sumFor(long num) {
		System.out.println("Sum for");
		long result = 0;
		long init = System.currentTimeMillis();
		for(long i = 1; i <= num; i++) {
			result += i;
		}
		long end = System.currentTimeMillis();
		
		System.out.println(result +" "+(end - init)+"ms");	
	}	
		private static void sumStreamIterate(long num) {
			System.out.println("Sum StreamIterate");
			long init = System.currentTimeMillis();
			long result = Stream.iterate(1L, i -> i+1).limit(num).reduce(0L, Long::sum);
			long end = System.currentTimeMillis();
			System.out.println(result +" "+(end - init)+"ms");
	}
		
		private static void sumParallelStream(long num) {
			System.out.println("Sum ParallelStream");
			long init = System.currentTimeMillis();
			long result = Stream.iterate(1L, i -> i+1).limit(num).parallel().reduce(0L, Long::sum);
			long end = System.currentTimeMillis();
			System.out.println(result +" "+(end - init)+"ms");
	}
		
		private static void sumLongStream(long num) {
			System.out.println("Sum LongStream");
			long init = System.currentTimeMillis();
			long result = LongStream.rangeClosed(1L, num).reduce(0L, Long::sum);
			long end = System.currentTimeMillis();
			System.out.println(result +" "+(end - init)+"ms");
	}
		
		private static void sumLongParallelStream(long num) {
			System.out.println("Sum LongParallelStream");
			long init = System.currentTimeMillis();
			long result = LongStream.rangeClosed(1L, num).parallel().reduce(0L, Long::sum);
			long end = System.currentTimeMillis();
			System.out.println(result +" "+(end - init)+"ms");
	}
}
