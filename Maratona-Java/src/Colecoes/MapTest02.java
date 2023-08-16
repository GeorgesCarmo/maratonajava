package Colecoes;

import java.util.HashMap;
import java.util.Map;

import Colecoes.dominio.Consumidor;
import Colecoes.dominio.Manga;

public class MapTest02 {

	public static void main(String[] args) {
		Consumidor consumidor1 = new Consumidor("Georges do Carmo");
		Consumidor consumidor2 = new Consumidor("DevDojo Academy");
		
		Manga manga1 = new Manga(5L, "Hellsing Ultimate", 19.9,0);
		Manga manga2 = new Manga(1L, "Berserk", 9.5,5);
		Manga manga3 = new Manga(4L, "Pokemon", 3.2,0);
		Manga manga4 = new Manga(3L, "Attack on titan", 11.20,2);
		Manga manga5 = new Manga(2L, "Dragon ball z", 2.99,0);
		
		Map<Consumidor, Manga> consumidorManga = new HashMap<>();
		consumidorManga.put(consumidor1, manga1);
		consumidorManga.put(consumidor2, manga4);
		
		for (Map.Entry<Consumidor, Manga> entry : consumidorManga.entrySet()) {
			System.out.println(entry.getKey().getNome()+" - "+entry.getValue().getNome());
		}

	}

}
