package assignmentFunctionRecursion;
import java.util.*;
public class FactorialUsingFunction {
	static int factorial(int num)
	{
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		return fact;
	}

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the num to find fact: ");
	int num=sc.nextInt();
	System.out.println("Factorial is:  "+factorial(num));
	sc.close();
	}

}
