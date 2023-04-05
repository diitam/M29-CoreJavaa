//program to demonstrate on user input
package daytwo;
import java.util.*;

public class UserInputProgram {

	public static void main(String[] args) {
		//User Input
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the salary: ");
		float salary=sc.nextFloat();
		
		//double salary=s.nextDouble();
		//next is used to get only the first word of ur sentence
		System.out.println("Enter the Name1: ");
		String name1=sc.next();
		
		//nextLine is used to get complete sentence printed
		//System.out.println("Enter the Name2: ");
		//String name2=sc.nextLine();
		
		System.out.println("Enter the character: ");
		char ch=sc.next().charAt(2);
		
		System.out.println("Salary is: "+salary);
		System.out.println("Name is: "+name1);
		//System.out.println("Name is: "+name2);
		System.out.println("Character is: "+ch);


		sc.close();
	}
}
