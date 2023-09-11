package Gio;

import java.io.File;
import java.io.IOException;

public class FileTest02 {

	public static void main(String[] args) throws IOException {
		File fileDiretorio = new File("pasta"); // criando o diretorio pasta
		boolean isDiretorioCriado = fileDiretorio.mkdir(); // criando uma variavel boolean para informar se foi criado ou não
		System.out.println(isDiretorioCriado);
		File fileArquivoDiretorio = new File(fileDiretorio,"arquivo.txt"); // criando um arquivo dentro do diretório já criado
		boolean isFileCreated = fileArquivoDiretorio.createNewFile(); // creiando uma variavel para informar se foi criado ou não
		System.out.println(isFileCreated);
		
		File fileRenamed = new File(fileDiretorio,"arquivo_renomeado.txt"); // criando o novo nome e informando o diretorio
		boolean isRenamed = fileArquivoDiretorio.renameTo(fileRenamed); // passando as informações de diretorio e novo nome para o remaneTo
		System.out.println(isRenamed);
		
		File diretorioRenamed = new File("pasta2");
		boolean isDiretorioRenamed = fileDiretorio.renameTo(diretorioRenamed);
		System.out.println(isDiretorioRenamed);
	}

}
