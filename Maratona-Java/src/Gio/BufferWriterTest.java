package Gio;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriterTest {

	public static void main(String[] args) {
		File file = new File("file.txt");
		try(FileWriter fw = new FileWriter (file, true); BufferedWriter bw = new BufferedWriter(fw)) {
			bw.write("DevDojo é o melhor curso de java do Brasil");
			bw.newLine();
			bw.write("Continuando o texto na linha seguinte...");
			bw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
