package Regex;

public class ScannerTest {

	public static void main(String[] args) {
		String texto = "Levi,Eren,Mikasa";
		String[] nomes = texto.split(","); // delimitador
		for (String nome : nomes) {
			System.out.println(nome.trim()); // remover espaço
		}

	}

}
