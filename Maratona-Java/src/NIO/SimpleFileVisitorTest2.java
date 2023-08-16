package NIO;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

class listAllFiles extends SimpleFileVisitor<Path> {
	
	public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
			System.out.println(file.getFileName());
			return FileVisitResult.CONTINUE;
	}
	
	public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) {
		System.out.println("pre visit: "+dir.getFileName());
		return FileVisitResult.SKIP_SUBTREE;
}
	public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
		return super.visitFileFailed(file, exc);
}
	public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException{
		System.out.println("post visit: "+dir.getFileName());
		return FileVisitResult.CONTINUE;
}
}

public class SimpleFileVisitorTest2 {

	public static void main(String[] args) throws IOException {
		Path root = Paths.get("pasta");
		Files.walkFileTree(root, new listAllFiles());
	}

}
