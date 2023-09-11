package OStreams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest11 {
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
		
		System.out.println(lightNovels.size());
		System.out.println(lightNovels.stream().count());
		System.out.println(lightNovels.stream().collect(Collectors.counting()));
		System.out.println();
		lightNovels.stream().max(Comparator.comparing(LightNovel::getPrice)).ifPresent(System.out::println);
		lightNovels.stream().collect(Collectors.maxBy(Comparator.comparing(LightNovel::getPrice))).ifPresent(System.out::println);
		System.out.println();
		lightNovels.stream().min(Comparator.comparing(LightNovel::getPrice)).ifPresent(System.out::println);
		lightNovels.stream().collect(Collectors.minBy(Comparator.comparing(LightNovel::getPrice))).ifPresent(System.out::println);
		System.out.println();
		System.out.println(lightNovels.stream().mapToDouble(LightNovel::getPrice).sum());
		System.out.println(lightNovels.stream().collect(Collectors.summingDouble(LightNovel::getPrice)));
		System.out.println();
		lightNovels.stream().mapToDouble(LightNovel::getPrice).average().ifPresent(System.out::println);;
		System.out.println(lightNovels.stream().collect(Collectors.averagingDouble(LightNovel::getPrice)));
		System.out.println();
		DoubleSummaryStatistics collect = lightNovels.stream().collect(Collectors.summarizingDouble(LightNovel::getPrice));
		System.out.println(collect);
		System.out.println();
		String titles = lightNovels.stream().map(LightNovel::getTitle).collect(Collectors.joining(", "));
		System.out.println(titles);

	}

}
