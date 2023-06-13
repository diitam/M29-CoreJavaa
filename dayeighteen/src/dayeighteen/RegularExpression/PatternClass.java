//program to demonstrate on matches() method of pattern class
package dayeighteen.RegularExpression;

import java.util.Scanner;
import java.util.regex.Pattern;

public class PatternClass {

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		System.out.println("Enter the input string..");
		String input=s.nextLine();
		String pattern="Heyy Dishaa,I am using Rgular expression";
		boolean result=Pattern.matches(pattern, input);
		System.out.println(result);
	}

}
