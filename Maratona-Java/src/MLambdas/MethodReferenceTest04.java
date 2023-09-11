package MLambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Supplier;

//Reference to a constructor
public class MethodReferenceTest04 {
	public static void main(String[] args) {
		Supplier <Service> newService = Service::new;
		Service service = newService.get(); // retorna um novo objeto
		List<Anime> animeList = new ArrayList<>(List.of(new Anime("Berserk", 500), new Anime("Naturo",1000), new Anime("One piece",350)));
		animeList.sort(Service::compareByEpisodesNonStatic);
		System.out.println(animeList);
		
		BiFunction<String, Integer, Anime> animeBiFunction = (title, episodes) -> new Anime(title, episodes);
		BiFunction<String, Integer, Anime> animeBiFunction2 = Anime::new;
		animeList.add(animeBiFunction2.apply("Super campeoes", 36));// apply se encarrega de criar novo anime
		System.out.println(animeList);
	}

}
