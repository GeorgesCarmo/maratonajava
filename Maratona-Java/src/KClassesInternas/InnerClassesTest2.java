package KClassesInternas;

public class InnerClassesTest2 {
	private String name = "Georges";

	void print() {
		String lastName = "Carmo";
		class LocalClass {
			public void printLocal() {
				System.out.println(name +" "+lastName);
			}
		}
		new LocalClass().printLocal();
	}

	public static void main(String[] args) {
		InnerClassesTest2 innerClass = new InnerClassesTest2();
		InnerClassesTest2 outer = new InnerClassesTest2();
		outer.print();
	}
}