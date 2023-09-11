package OStreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest8 {
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
		lightNovels.stream()
			.map(LightNovel::getPrice)
			.filter(price -> price > 3)
			.reduce(Double::sum)
			.ifPresent(System.out::println);
			
		
		double sum = lightNovels.stream()
			.mapToDouble(LightNovel::getPrice)
			.filter(price -> price > 3)
			.sum();
		System.out.println(sum);
	}
	}