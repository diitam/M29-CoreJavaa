//Program to demonstate the cascaded ifelse
package decisionmaking;

import java.util.Scanner;

public class CascadedIfElseProgram {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 1st 2nd and 3rd percentage");
		float per1=sc.nextFloat();
		float per2=sc.nextFloat();
		float per3=sc.nextFloat();
		
		if(per1>per2 && per1>per3)
		{
			System.out.println("Person 1 has highest percentage");
		}
		else if(per2>per3 && per2>per1)
		{
			System.out.println("Person 2 has highest percentage");
		}
		else 
		{
			System.out.println("Person 3 has highest percentage");
		}
		sc.close();
}

}
