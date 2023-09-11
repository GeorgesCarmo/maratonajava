package OStreams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamTest14 {
	private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
			new LightNovel("G",8.99, Category.FANTASY), 
			new LightNovel("C",3.99, Category.DRAMA), 
			new LightNovel("B",5.99, Category.ROMANCE),
			new LightNovel("A",2.99, Category.FANTASY),
			new LightNovel("D",5.99, Category.ROMANCE),
			new LightNovel("E",1.99, Category.DRAMA),
			new LightNovel("E",10.99, Category.FANTASY),
			new LightNovel("F",4.00, Category.ROMANCE)));

	public static void main(String[] args) {
		Map<Category, Long> collect = lightNovels.stream().collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.counting()));
		System.out.println(collect);
		
		Map<Category, Optional<LightNovel>> collect2 = lightNovels
				.stream()
				.collect(Collectors.groupingBy(LightNovel::getCategory,
				Collectors.maxBy(Comparator.comparing(LightNovel::getPrice))));
		System.out.println(collect2);
		
		Map<Category, LightNovel> collect3 = lightNovels.stream().collect(Collectors.groupingBy(LightNovel::getCategory,
				Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(LightNovel::getPrice)), Optional::get)));
		System.out.println(collect3);
	}

}
