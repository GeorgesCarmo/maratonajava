package String;

public class StringTest01 {

		public static void main(String[] args) {
			String nome = "  Georges  ";
			String numeros = "012345";
			System.out.println(nome.charAt(0)); // primeira posição da String
			System.out.println(nome.length()); // tamanhp da String
			System.out.println(nome.replace("G", "J")); // troca as letras da String
			System.out.println(nome.toUpperCase()); // letras maiúsculas
			System.out.println(nome.toLowerCase()); // letras minúsculas
			System.out.println(numeros.length());
			System.out.println(numeros.substring(0,2)); // começa do 0 e vai ate o 2-1
			System.out.println(numeros.substring(3)); // pode colocar somente onde quer que inicia e ele vai até o final da String automaticamente
			System.out.println(nome.trim()); // remove valores em branco no inicio e fim da String
		}
}
