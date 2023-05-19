/*Demonstrate a string program by using string
 *  literal and new keyword*/
package dayten.stringsprogram;

public class StringSimpleProgram {

	public static void main(String[] args) {
		//Using String literal
		String str1="Disha";
		System.out.println("Using string literal: "+str1);
		//using new keyword
		String str2=new String("Disha");
		System.out.println("Using new keyword: "+str2);
		
		String str3="Disha";
		/*when the string is created by using a new keyword and 
		both string are same then it will create a memory 
		for that string and hence it will create memory for that
		String and hence using == we will get it as different (false) */
		System.out.println(str1==str2);
		System.out.println(str1.equals(str2));
		System.out.println(str1==str3);
	}

}
