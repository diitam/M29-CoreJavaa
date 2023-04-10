package assignmentFunctionRecursion;

import java.util.Scanner;

public class NumberOfDigitsProgramUsingRecursion {

	static int NumberOfDigit(int num)
	{
		int count=0;
		while(num!=0)
		{
			num=num/10;
			count++;
		}
		return count;
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num=sc.nextInt();
		System.out.println("The number of digits on a number are: "+NumberOfDigit(num));
	sc.close();
	}

}
