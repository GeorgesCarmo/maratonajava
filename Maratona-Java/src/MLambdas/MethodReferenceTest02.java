package MLambdas;

import java.util.ArrayList;
import java.util.List;

//Reference to an instance method od a particular object
public class MethodReferenceTest02 {
	public static void main(String[] args) {
		Service service = new Service();
		List<Anime> animeList = new ArrayList<>(List.of(new Anime("Berserk", 43), new Anime("Naturo",500), new Anime("One piece",900)));
		animeList.sort(Service::compareByEpisodesNonStatic);
		animeList.sort((a1,a2) -> Service.compareByEpisodesNonStatic(a2,a2)); // outra forma de fazer, porém menos intuitiva
		System.out.println(animeList);
	}

}
