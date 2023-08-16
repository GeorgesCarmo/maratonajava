package NIO;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

class listJavaFiles extends SimpleFileVisitor<Path> {
	public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
			System.out.println(file.getFileName());
			if(file.getFileName().toString().endsWith(".java")) {
				System.out.println(file.getFileName());
			}
			return FileVisitResult.CONTINUE;
	}
}

public class SimpleFileVisitorTest01 {

	public static void main(String[] args) throws IOException {
		Path root = Paths.get(".");
		Files.walkFileTree(root, new listJavaFiles());
	}

}
