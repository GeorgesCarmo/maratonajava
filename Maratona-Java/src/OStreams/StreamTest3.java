package OStreams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//1. Order lightNovel by title
//2. Retrieve the first 3 titles lightNovels with price less than 4

public class StreamTest3 {
	private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
			new LightNovel("G",8.99), 
			new LightNovel("C",3.99), 
			new LightNovel("B",5.99),
			new LightNovel("A",2.99),
			new LightNovel("D",5.99),
			new LightNovel("E",1.99),
			new LightNovel("E",1.99),
			new LightNovel("F",4.00)));

	public static void main(String[] args) {
		Stream<LightNovel> stream = lightNovels.stream();
		lightNovels.forEach(System.out::println);
		long count = stream.filter(nl -> nl.getPrice() <=4).count(); // usando a stream para filtrar os elementos que tem o preco menor que 4
		long count2 = lightNovels.stream() // sim, tem que abrir uma nova stream (não precisaria mas para efeitos educativos vamos fazer esse exemplo)
				.distinct() // o distinct não vai pegar os elementos repetidos (precisa gerar o hashCode e equal na classe) 
				.filter(nl -> nl.getPrice() <=4) // filtrando o preço
				.count(); // contando os elementos filtrados
		System.out.println(count);
		System.out.println(count2);
	}
	
}