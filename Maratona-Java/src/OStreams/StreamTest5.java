package OStreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest5 {
	public static void main(String[] args) {
	List<String> words = List.of("Gomu", "Gomu", "No", "Mi");
	String[] letters = words.get(0).split(""); // split vai separar letra por letra da primeira posição do indice
	System.out.println(Arrays.toString(letters));
	
	List<String> letters2 = words.stream()
		.map(w -> w.split("")) // retorna Stream <String[]>
		.flatMap(Arrays::stream) // retorna Stream<String>
		.collect(Collectors.toList()); // coleta a stream que foi trabalhada em uma lista para impressão
	System.out.println(letters2);
	}
	
}