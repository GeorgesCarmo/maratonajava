package Fregex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest4 {

	public static void main(String[] args) {
		// \d = todos os digitos do texto
		// \D = tudo o que não for digito
		// \s = espaços em branco \t \n \f \r
		// \S = todos os caracteres excluindo em branco
		// \w = a-ZA-Z, digitos, _
		// \W = tudo o que não for incluso no \w
		// [] = range de caracteres que forem passados
		// ? = zero ou 1 ocorrencia
		// * zero ou mais
		// + uma ou mais 
		// {n,m} de n até m
		// () agrupar
		// |
		// $
		// . coringa

		String regex = "0[xX]([0-9a-fA-F])+(\\s|$)";
		String texto = "12 0x 0X 0xFFABC 0x10G 0x1";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(texto);
		System.out.println("texto:  "+texto);
		System.out.println("indice: 0123456789");
		System.out.println("regex: "+regex);
		System.out.println("Posições encontradas");
		while(matcher.find()) {
			System.out.println(matcher.start()+" "+matcher.group());
		}

	}

}
