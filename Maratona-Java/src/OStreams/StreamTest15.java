package OStreams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamTest15 {
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
		Map<Category, DoubleSummaryStatistics> collect = lightNovels.stream()
				.collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.summarizingDouble(LightNovel::getPrice)));
		System.out.println(collect);
		
		Map<Category, List<Promotion>> collect2 = lightNovels.stream()
				.collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.mapping(StreamTest15::getPromotion,
						 Collectors.toList())));
		System.out.println(collect2);
		
		Map<Category, Set<Promotion>> collect3 = lightNovels.stream()
				.collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.mapping(StreamTest15::getPromotion,
						 Collectors.toSet())));
		System.out.println(collect3);
		
		Map<Category, LinkedHashSet<Promotion>> collect4 = lightNovels.stream()
				.collect(Collectors.groupingBy(LightNovel::getCategory,
						 Collectors.mapping(StreamTest15::getPromotion, 
						 Collectors.toCollection(LinkedHashSet::new))));
		System.out.println(collect4);
	}
	
	private static Promotion getPromotion(LightNovel ln) {
		return ln.getPrice() < 6 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE;
	}
}
