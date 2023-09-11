package Hnio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class NomalizeTest {

	public static void main(String[] args) {
		String diretorioProjeto = "home/Georges/dev";
		String arquivotxt = "../../arquivo.txt";
		Path path1 = Paths.get(diretorioProjeto, "arquivo.txt");
		System.out.println(path1);
		System.out.println(path1.normalize());
		
		Path path2 = Paths.get("home/./Georges/./dev/");
		System.out.println(path2);
		System.out.println(path2.normalize());

	}

}
