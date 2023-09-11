package OStreams;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTest13 {
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
		Map<Promotion, List<LightNovel>> collect = lightNovels
				.stream()
				.collect(Collectors.groupingBy(ln -> ln.getPrice() < 6 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE));
		System.out.println(collect);
		
		Map<Category, Map<Promotion, List<LightNovel>>> collect1 = lightNovels
			.stream()
			.collect(Collectors.groupingBy(LightNovel::getCategory, 
					 Collectors.groupingBy(ln -> ln.getPrice() < 6 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE)));
		System.out.println(collect1);
	}

}
