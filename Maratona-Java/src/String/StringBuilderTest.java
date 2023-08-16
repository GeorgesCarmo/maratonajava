package String;

public class StringBuilderTest {
	public static void main(String[] args) {
		String nome = "Georges do Carmo";
		nome.concat("JAVA");
		System.out.println(nome);
		System.out.println(nome.substring(0,3));
		StringBuilder sb = new StringBuilder("Georges do Carmo");
		sb.append(" - DEV JAVA").append(" DevDojo");
		System.out.println(sb.toString());;
		System.out.println(sb.reverse());
	}
}
