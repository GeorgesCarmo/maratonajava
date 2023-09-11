package Hnio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class RelativizeTest01 {

	public static void main(String[] args) {
		Path dir = Paths.get("/home/Georges");
		Path clazz = Paths.get("/home/Georges/dev/OlaMundo.java");
		Path pathClazz = dir.relativize(clazz);
		System.out.println(pathClazz);
		
		Path absoluto1 = Paths.get("/home/Georges");
		Path absoluto2 = Paths.get("/usr/local");
		Path absoluto3 = Paths.get("/home/Georges/dev/OlaMundo.java");
		Path relativo1 = Paths.get("temp");
		Path relativo2 = Paths.get("temp/temp.2021921");
		
		System.out.println("1 "+ absoluto1.relativize(absoluto3));
		System.out.println("2 "+ absoluto3.relativize(absoluto1)); // voltar dois diretorios
		System.out.println("3 "+ absoluto1.relativize(absoluto2));
		System.out.println("4 "+ relativo1.relativize(relativo2));
		System.out.println("4 "+ absoluto1.relativize(relativo1));
	}

}
