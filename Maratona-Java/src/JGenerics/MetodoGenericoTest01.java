package JGenerics;

import java.util.ArrayList;
import java.util.List;

public class MetodoGenericoTest01 {
	public static void main(String[]args) {
		List<Barco> barcoList = criarArrayComUmObjeto(new Barco("Canoa"));
		System.out.println(barcoList);
		
	}
	private static <T> List<T> criarArrayComUmObjeto(T t) {
		return List.of(t);
	}
	
/*	private static <T extends Comparable> List<T> criarArrayComUmObjeto(T t) {
		return List.of(t);
	}*/
}
