package OStreams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//1. Order lightNovel by title
//2. Retrieve the first 3 titles lightNovels with price less than 4

public class StreamTest2 {
	private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
			new LightNovel("G",8.99), 
			new LightNovel("C",3.99), 
			new LightNovel("B",5.99),
			new LightNovel("A",2.99),
			new LightNovel("D",5.99),
			new LightNovel("E",1.99),
			new LightNovel("F",4.00)));

	public static void main(String[] args) {
		List<String> titles = lightNovels.stream()
			.sorted(Comparator.comparing(LightNovel::getTitle)) // ordenando pelo titulo
			.filter(ln -> ln.getPrice() <= 4) // filtrando o preço
			.limit(3) // limitando os 3 primeiros
			.map(LightNovel::getTitle) // pegou os titulos apos ordenação e filtro
			.collect(Collectors.toList()); // pegando os titulos que eram uma stream e transformando em lista para impressão
		
		System.out.println(titles);
	}
	
}