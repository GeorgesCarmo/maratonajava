package RPadroesdeprojeto;

public class BuilderPatternTest01 {

	public static void main(String[] args) {
		Person personBuilder = new Person.PersonBuilder().builder()
			.firstName("Georges")
			.lastName("Carmo")
			.userName("ViradoNoJiraya")
			.email("georgesdc13@gmail.com")
			.build();
		
		System.out.println(personBuilder);

	}

}
