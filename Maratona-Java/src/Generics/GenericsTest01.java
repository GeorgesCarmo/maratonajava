package Generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest01 {

	public static void main(String[] args) {
		 // type erasure
        List<String> lista = new ArrayList<>();
        lista.add("Georges");
        lista.add("String");
        lista.add("Carmo");

        for (String obj : lista) {
            System.out.println(obj);
        }
        add(lista, 1L);
    }

    public static void add(List lista, Long l) {
        lista.add(l);
    }

	}


