package KClassesInternas;

public class InnerClassesTest01 {
	private String name = "Georges";
	//Nested
	class Inner{
		public void printOutherClassAttribute() {
			System.out.println(name);
			System.out.println(this); // se refere a classe interna
            System.out.println(InnerClassesTest01.this); // se refere a classe principal
		}
	}

	public static void main(String[] args) {
		InnerClassesTest01 innerClass = new InnerClassesTest01();
		Inner inner = innerClass.new Inner();
		Inner inner2 = new InnerClassesTest01().new Inner();
		
		inner.printOutherClassAttribute();
		inner2.printOutherClassAttribute();

	}

}
