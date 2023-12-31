package IColecoes;


import java.util.PriorityQueue;
import java.util.Queue;

import IColecoes.dominio.Consumidor;
import IColecoes.dominio.Manga;

public class QueueTest2 {

	public static void main(String[] args) {

		Queue<Manga> mangas = new PriorityQueue<>(new MangaValorComparator().reversed());
		mangas.add(new Manga(5L, "Hellsing Ultimate", 19.9,0));
		mangas.add(new Manga(1L, "Berserk", 9.5,5));
		mangas.add(new Manga(4L, "Pokemon", 3.2,0));
		mangas.add(new Manga(3L, "Attack on titan", 11.20,2));
		mangas.add(new Manga(2L, "Dragon ball z", 2.99,0));
		
		while(!mangas.isEmpty()) {
			System.out.println(mangas.poll());
		}

	}

}
