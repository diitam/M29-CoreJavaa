//program to demonstrate custom/user defined exception

package dayeleven.customexception;

import java.util.Scanner;

public class CustomExceptionExample {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String id=sc.nextLine();
		String password=sc.nextLine();

		try
		{
			if(id.equals("dishatamore@gmail.com")&&password.equals("pass@123")) 
			{
			System.out.println("Matched Credentials!!!!...");
			}
			else
			{
			throw new LoginCredential("Invalid Credentials");
			}
		}
		//custom exception or user defined exception
		catch(LoginCredential e)
		{
			System.out.println("Exception handled.....");
		}
		
	sc.close();	
	}

}
