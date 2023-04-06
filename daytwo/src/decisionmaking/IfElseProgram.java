//If-Else condition Program
package decisionmaking;
import java.util.*;
public class IfElseProgram {
	/*If we have two conditions to decide when we will use 
	if-else*/
	
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Age and Weight Of Donor: ");
	int age=sc.nextInt();
	int weight=sc.nextInt();
	
	if(age>18 &&weight>50)
	{
		System.out.println("Eligible");
	}
	else
	{
		System.out.println("Not Eligible");
	}
	sc.close();
	}

}
