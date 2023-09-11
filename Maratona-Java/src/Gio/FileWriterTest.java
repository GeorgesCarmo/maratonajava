package Gio;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {
 /*File trabalhar com arquivo
 * FileWriter escrever simples
 * FileReader somente leitura
 * BufferWriter escrita mais sofisticada trabalhando com dados em memoria
 * BufferReader mesma coisa que FileReader com mais performance*/
	public static void main(String[] args) {

		File file = new File("file.txt");
		try (FileWriter fw = new FileWriter(file, true)){
			fw.write("DevDojo é o melhor curso de java do Brasil\nContinuando o texto na próxima linha...\n");
			fw.flush();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

}
