package String;

public class StringTest {
	/*Strings são imutáveis*/
	
	public static void main(String[] args) {
		String nome = "Georges"; // pool de Strings
		String nome2 = "Georges";
		nome.concat(" do Carmo"); // nome += " do Carmo"
		nome = nome.concat(" do Carmo");
		System.out.println(nome.equals(nome2));
		System.out.println(nome == nome2);
		System.out.println(nome);
		String nome3 = new String("Georges"); // objeto
		System.out.println(nome2 == nome3); // comparando a referencia
		System.out.println(nome2 == nome3.intern()); // comparando o valor 
}

}
