package NIO;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipOutPutStreamTest01 {

	public static void main(String[] args) {
		Path arquivoZip = Paths.get("pasta/arquivo.zip"); // local para onde iremos zipar
		Path arquivosParaZipar = Paths.get("pasta/subpasta1/subsubpasta1"); // arquivo que iremos zipar
		zip(arquivoZip, arquivosParaZipar);

	}
	private static void zip(Path arquivoZip, Path arquivosParaZipar) {
		try (ZipOutputStream zipStream = new ZipOutputStream(Files.newOutputStream(arquivoZip)); // instanciando objeto que faz a saida do zip
			DirectoryStream<Path> directoryStream = Files.newDirectoryStream(arquivosParaZipar)){ // instanciando objeto que salva no diretório
				for(Path file : directoryStream) {
					ZipEntry zipEntry = new ZipEntry(file.getFileName().toString());
					zipStream.putNextEntry(zipEntry);
					Files.copy(file, zipStream);
					zipStream.closeEntry();
				}
				System.out.println("Arquivo criado com sucesso");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
