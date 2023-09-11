package OStreams;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTest12 {
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
/*		Map<Category, List<LightNovel>> categoryLightNovelMap = new HashMap<>(); 
		List<LightNovel> fantasy = new ArrayList<>();
		List<LightNovel> drama = new ArrayList<>();
		List<LightNovel> romance = new ArrayList<>();
		for (LightNovel lightNovel : lightNovels) {
			switch(lightNovel.getCategory()) {
			case DRAMA: drama.add(lightNovel); break;
			case FANTASY: fantasy.add(lightNovel); break;
			case ROMANCE: romance.add(lightNovel); break;
			}
		}
		categoryLightNovelMap.put(Category.DRAMA, drama);
		categoryLightNovelMap.put(Category.FANTASY, fantasy);
		categoryLightNovelMap.put(Category.ROMANCE, romance);
		System.out.println(categoryLightNovelMap);
*/		
		Map<Category, List<LightNovel>> collect = lightNovels.stream().collect(Collectors.groupingBy(LightNovel::getCategory));
		System.out.println(collect);
	}

}
