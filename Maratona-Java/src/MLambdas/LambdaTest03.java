package MLambdas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdaTest03 {

	public static void main(String[] args) {
//Reference to a static method
		List<Anime> animeList = new ArrayList<>(List.of(new Anime("Berserk", 43), new Anime("Naturo",500), new Anime("One piece",900)));
//		Collections.sort(animeList, (a1,a2) -> a1.getTitle().compareTo(a2.getTitle()));
//		Collections.sort(animeList, (a1, a2) -> Service.compareByTitle(a1, a2));
		Collections.sort(animeList, Service::compareByTitle);
		animeList.sort(Service::compareByEpisodes); // outra forma de fazer a mesma coisa
		System.out.println(animeList);
	}

}
