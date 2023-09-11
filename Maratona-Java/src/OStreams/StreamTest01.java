package OStreams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

//1. Order lightNovel by title
//2. Retrieve the first 3 titles lightNovels with price less than 4

public class StreamTest01 {
	private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
			new LightNovel("G",8.99), 
			new LightNovel("C",3.99), 
			new LightNovel("B",5.99),
			new LightNovel("A",2.99),
			new LightNovel("D",5.99),
			new LightNovel("E",1.99),
			new LightNovel("F",4.00)));

	public static void main(String[] args) {
		lightNovels.sort(Comparator.comparing(LightNovel::getTitle)); // Ordenando a lista lightNovel pelo titulo
		
		List<String> titles = new ArrayList<>(); // criando lista para guardar o titulos
		for (LightNovel lightNovel : lightNovels) { // loop para pegar os titulos com preço menor ou igual a 4
			if(lightNovel.getPrice() <= 4) {
				lightNovel.getTitle();
				titles.add(lightNovel.getTitle()); // apos encontrar os titulos conforme a condição, adicionando na lista titles
			}
			if(titles.size() >= 3) { // condição para parar  assim que atingir 3 titulos na lista titles
				break;
			}
		}
		System.out.println(lightNovels);
		System.out.println(titles);
	}
	
}