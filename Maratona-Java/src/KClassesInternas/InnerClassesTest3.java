package KClassesInternas;

public class InnerClassesTest3 {
	private String name = "Georges";
	static class Nasted {
		String lastName = "Dev";
		void print() {
			System.out.println(new InnerClassesTest3().name+" "+lastName);
		}
	}

	public static void main(String[] args) {
		Nasted nasted = new Nasted();
		nasted.print();
	}
}