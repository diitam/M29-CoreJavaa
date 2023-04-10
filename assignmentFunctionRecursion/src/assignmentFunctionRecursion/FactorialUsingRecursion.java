package assignmentFunctionRecursion;

import java.util.Scanner;

public class FactorialUsingRecursion {
	//Function defination
	static int factorial(int num)
	{
		if(num!=0)
			return num*factorial(num-1);
		return 1;
	}

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enetr the number: ");
	int num=sc.nextInt();
	
	System.out.println("The factorial is: "+factorial(num));
	sc.close();
	}

}
