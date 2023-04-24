package methodoverloading;

public class MethodOverloadingExecuter {

	public static void main(String[] args) {

		MethodOverloadingExample m1=new MethodOverloadingExample();
		System.out.println();
		System.out.println(m1.multiplication(3.0f, 2.0f));
		System.out.println(m1.multiplication(1.5f, 2));
		System.out.println(m1.multiplication(2, 4));
		System.out.println(m1.multiplication(2, 2.0f));
		System.out.println(m1.print("Welcome Disha"));
		System.out.println(m1.print("Disha","Tamore"));

		
	}

}
