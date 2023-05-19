//program to demonstrate on String built in function 
package dayten.stringsprogram;

public class StringOperationExample {

	public static void main(String[] args) {
		//using new keyword
		String str1=new String("Disha");
		System.out.println(str1.toUpperCase());
		System.out.println(str1.length());
		System.out.println(str1.lastIndexOf('u'));
		System.out.println(str1.hashCode());
		System.out.println(str1.concat(" Tamore"));
		System.out.println(str1+"Tamore");
	}

}
