package Fregex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest3 {

	public static void main(String[] args) {
		// \d = todos os digitos do texto
		// \D = tudo o que não for digito
		// \s = espaços em branco \t \n \f \r
		// \S = todos os caracteres excluindo em branco
		// \w = a-ZA-Z, digitos, _
		// \W = tudo o que não for incluso no \w
		//[] = range de caracteres que forem passados
		
//		String regex = "[a-zA-C]";
		String regex = "0[xX][0-9a-fA-F]";
//		String texto = "abaaba";
		String texto2 = "12 0x 0X 0xFFABC 0x109 0x1";
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
