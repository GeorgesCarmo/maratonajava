package Colecoes;

import java.util.ArrayList;
import java.util.List;

import Colecoes.dominio.Smartphone;

public class SmartphoneListTest01 {

	public static void main(String[] args) {
		Smartphone s1 = new Smartphone("1ABC1", "iPhone");
		Smartphone s2 = new Smartphone("222222", "Pixel");
		Smartphone s3 = new Smartphone("3333", "Samsung");
		
		List<Smartphone> smartphones = new ArrayList(6);
		smartphones.add(s1);
		smartphones.add(s2);
		smartphones.add(0,s3);
		
		//smartphones.clear();
		
		for (Smartphone smartphone : smartphones) {
			System.out.println(smartphone);
		}
		
		Smartphone s4 = new Smartphone("222222", "Pixel");
		System.out.println(smartphones.contains(s4));
		int indexSmartphone4 = smartphones.indexOf(s4);
		System.out.println(smartphones.get(indexSmartphone4));
	}

}
