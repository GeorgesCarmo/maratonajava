package IColecoes;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {

	public static void main(String[] args) {
		List<String> nomes = new ArrayList(16);
		List<String> nomes2 = new ArrayList(16);
		nomes.add("Georges");
		nomes.add("Curso DevDojo");
		nomes2.add("Jiraya");
		nomes2.add("Carmo");
		
		//System.out.println(nomes.remove("Georges"));
		
		nomes.addAll(nomes2);
		
		for (String nome : nomes) {
			System.out.println(nome);

		}

		System.out.println("---------------------------");
		int size = nomes.size();
		for (int i = 0; i < size; i++) {
			System.out.println(nomes.get(i));
		}
		
		List<Integer> numeros = new ArrayList();
		numeros.add(1);
		numeros.add(2);
		numeros.add(3);
		numeros.remove(0);
		for (Integer integer : numeros) {
			System.out.println(integer);
		}
	}

}
