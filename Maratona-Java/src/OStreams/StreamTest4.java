package OStreams;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class StreamTest4 {
	public static void main(String[] args) {
		List<List<String>> devdojo = new ArrayList<>();
		List<String> graphicsDesigners = List.of("Luana Pereira", "Ricardo Teixeira", "Vitor Laino");
		List<String> developers = List.of("Georges do Carmo", "Bill Gates", "Kevin Bacon");
		List<String> students = List.of("Leando Karnal", "Gusttavo Lima", "Clovis de Barros");

		devdojo.add(graphicsDesigners);
		devdojo.add(developers);
		devdojo.add(students);

		for (List<String> people : devdojo) { // people percorrendo devdojo
			for (String person : people) { // person percorrendo people
				System.out.println(person); // agora person leu todos os valores da lista devjodo
			}
		}
		System.out.println("----------------------");

		devdojo.stream() // pegando a lista devdojo e abrindo a stream
				.flatMap(Collection::stream) // mapeando todos o elementos da lista assim como o for
				.forEach(System.out::println);

	}

}