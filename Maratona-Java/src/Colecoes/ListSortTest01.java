package Colecoes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortTest01 {

	public static void main(String[] args) {
		List<String> mangas = new ArrayList(6);
		
		mangas.add("Hellsing Ultimate");
		mangas.add("Berserk");
		mangas.add("Pokemon");
		mangas.add("Attack on titan");
		mangas.add("Dragon ball z");
		Collections.sort(mangas);
		
		List<Double> dinheiros = new ArrayList(6);
		dinheiros.add(110.21);
		dinheiros.add(23.98);
		dinheiros.add(21.21);
		dinheiros.add(98.24);
		dinheiros.add(5.1);
		Collections.sort(dinheiros);
		
		for (String manga : mangas) {
			System.out.println(manga);
		}
		System.out.println(dinheiros);
	}

}
