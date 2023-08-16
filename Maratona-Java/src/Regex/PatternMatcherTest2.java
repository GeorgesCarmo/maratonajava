package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest2 {

	public static void main(String[] args) {
		// \d = todos os digitos do texto
		// \D = tudo o que não for digito
		// \s = espaços em branco \t \n \f \r
		// \S = todos os caracteres excluindo em branco
		// \w = a-ZA-Z, digitos, _
		// \W = tudo o que não for incluso no \w
		
		String regex = "\\W";
//		String texto = "abaaba";
		String texto2 = "ad65!f4_ g6d%5 f4@gd_65f";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(texto2);
		System.out.println("texto:  "+texto2);
		System.out.println("indice: 0123456789");
		System.out.println("regex: "+regex);
		System.out.println("Posições encontradas");
		while(matcher.find()) {
			System.out.println(matcher.start()+" "+matcher.group());
		}
	}

}
