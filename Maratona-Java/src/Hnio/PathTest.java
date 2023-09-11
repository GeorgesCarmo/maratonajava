package Hnio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest {

	public static void main(String[] args) {
		Path p1 = Paths.get("C:\\Users\\Usuário\\eclipse-workspace\\Maratona-Java\\pasta2\\arquivo.txt");
		Path p2 = Paths.get("C:\\Users\\Usuário\\eclipse-workspace\\Maratona-Java\\pasta2","arquivo.txt");
		Path p3 = Paths.get("C:", "Users\\Usuário\\eclipse-workspace\\Maratona-Java\\pasta2", "arquivo.txt");
		Path p4 = Paths.get("C:","Users","Usuário","eclipse-workspace","Maratona-Java","pasta2","arquivo.txt");
		System.out.println(p1.getFileName());
		System.out.println(p2.getFileName());
		System.out.println(p3.getFileName());
		System.out.println(p4.getFileName());

	}

}
