package Hnio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class PathTest02 {

	public static void main(String[] args) throws IOException {
		
		Path pastaPath = Paths.get("pasta"); // criação de um diretório com o createDirectory
		if (Files.notExists(pastaPath)) {
			Path pastaDirectory = Files.createDirectory(pastaPath);
		}
		
		Path subPastaPath = Paths.get("pasta/subpasta/subsubPasta"); // criação de subpasta com o createDirectories
		Path subPastaDirectory = Files.createDirectories(subPastaPath);

		Path filePath = Paths.get(subPastaPath.toString(), "file.txt"); // criando um arquivo dentro de um diretório
		if (Files.notExists(pastaPath)) {
			Path filePathCreated = Files.createFile(filePath);
		}
		
		Path source = filePath;
		Path target = Paths.get(filePath.getParent().toString(), "file_copy.txt"); // copiando arquivo de um diretório
		Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
	}
}
