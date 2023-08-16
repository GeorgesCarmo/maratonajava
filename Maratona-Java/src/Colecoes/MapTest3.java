package Colecoes;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Colecoes.dominio.Consumidor;
import Colecoes.dominio.Manga;

public class MapTest3 {

	public static void main(String[] args) {
		Consumidor consumidor1 = new Consumidor("Georges do Carmo");
		Consumidor consumidor2 = new Consumidor("DevDojo Academy");
		
		Manga manga1 = new Manga(5L, "Hellsing Ultimate", 19.9,0);
		Manga manga2 = new Manga(1L, "Berserk", 9.5,5);
		Manga manga3 = new Manga(4L, "Pokemon", 3.2,0);
		Manga manga4 = new Manga(3L, "Attack on titan", 11.20,2);
		Manga manga5 = new Manga(2L, "Dragon ball z", 2.99,0);
		
		List<Manga> mangaConsumidor1List = List.of(manga1,manga2, manga3);
		List<Manga> mangaConsumidor2List = List.of(manga3,manga4, manga5);
		Map<Consumidor, List<Manga>> consumidorMangaMap = new HashMap<>();
		consumidorMangaMap.put(consumidor1, mangaConsumidor1List);
		consumidorMangaMap.put(consumidor2, mangaConsumidor2List);
		
		for (Map.Entry<Consumidor, List<Manga>> entry : consumidorMangaMap.entrySet()) {
			System.out.println("---"+entry.getKey().getNome());
			for (Manga manga : entry.getValue()) {
				System.out.println("------"+manga.getNome());
			}
		}
		
		

	}

}
