package OStreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest6 {
	private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
			new LightNovel("G",8.99), 
			new LightNovel("C",3.99), 
			new LightNovel("B",5.99),
			new LightNovel("A",2.99),
			new LightNovel("D",5.99),
			new LightNovel("E",1.99),
			new LightNovel("E",10.99),
			new LightNovel("F",4.00)));
	
	public static void main(String[] args) {
		System.out.println(lightNovels.stream().anyMatch(ln -> ln.getPrice() >= 8 )); // retorna um boolean. Verifica se na lista tem ou não
		System.out.println(lightNovels.stream().allMatch(ln -> ln.getPrice() > 0)); // todos tem o preço maior que 0 ?
		System.out.println(lightNovels.stream().noneMatch(ln -> ln.getPrice() < 0)); // nenhum tem o preço menor que 0 ?
		
		System.out.println("--------------------");
		
		lightNovels.stream()
			.filter(ln -> ln.getPrice() >=3)
			.findAny() // retorna qualquer um conforme o filter
			.ifPresent(System.out::println); // se existir ele imprime
		
		System.out.println("--------------------");
		
		lightNovels.stream()
			.sorted(Comparator.comparing(LightNovel::getPrice))
			.filter(ln -> ln.getPrice() >= 3)
			.findFirst()
			.ifPresent(System.out::println);
		
		System.out.println("--------------------");
		
		lightNovels.stream()
			.filter(ln -> ln.getPrice() >= 3)
			.max(Comparator.comparing(LightNovel::getPrice))
			.ifPresent(System.out::println);
			
	}
	}