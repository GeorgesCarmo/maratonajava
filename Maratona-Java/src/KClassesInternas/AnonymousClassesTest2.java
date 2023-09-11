package KClassesInternas;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import JGenerics.Barco;

class BarcoNameComparator implements Comparator<Barco> {

	@Override
	public int compare(Barco o1, Barco o2) {
		return o1.getNome().compareTo(o2.getNome());
	}

}

public class AnonymousClassesTest2 {

	public static void main(String[] args) {
		List<Barco> barcoList = new ArrayList<>(List.of(new Barco("Lancha"), new Barco("Canoa")));
		barcoList.sort(new Comparator<Barco>() {

			@Override
			public int compare(Barco o1, Barco o2) {
				return o1.getNome().compareTo(o2.getNome());
			}

		});
		System.out.println(barcoList);
	}
}
