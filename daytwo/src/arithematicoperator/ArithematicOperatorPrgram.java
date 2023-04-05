//Program to demonstarte the Arithematic operator
//+,-,*,/,%
package arithematicoperator;
import java.util.*;
public class ArithematicOperatorPrgram {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter values of x and y");
	int x=sc.nextInt();
	int y=sc.nextInt();
	
	System.out.println("Addition is: "+(x+y));
	System.out.println("Subtraction is: "+(x-y));
	System.out.println("Multiplication is: "+(x*y));
	System.out.println("Division is: "+(x/y));
	System.out.println("Modulo is: "+(x%y));
	
	sc.close();

	}

}
