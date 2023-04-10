//Program to find the count of digits in a number
package looping;
import java.util.*;
public class NumberOfDigitsProgram {

	public static void main(String[] args) {
		
	int count=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number: ");
	int num=sc.nextInt();
	while(num!=0)
	{
		num=num/10;
		count++;
	}
	System.out.println("Count of digits in a number are: "+count);
	sc.close();

	}

}
