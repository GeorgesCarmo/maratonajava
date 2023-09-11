package Fregex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest5 {

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

		String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+";
		String texto = "luffy@hotmail.com, 123jotaro@gmail.com, #@!abrao@mail.br, teste@gmail.com.br, teste@mail";
		System.out.println("Email valido:");
		System.out.println("abrao@mail.br".matches(regex));
		System.out.println(texto.split( ",")[2].trim());
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
