//To demonstrate throw keyword,
package dayeleven.exceptiondemo;

import java.io.IOException;

public class ThrowKeywordExample {
	//throws keyword is used to declare an exception
	public static void donate(int age,int weight) throws IOException
	{
		if(age>18 && weight>50)
			System.out.println("Eligible to donate");
		
		else
			//throw keyword used to throw exception explicitly
			throw new IOException("Not eligible");
		
	}
	public static void main(String[] args) {
		try 
		{
		ThrowKeywordExample.donate(12,53);
		}
		catch(IOException e)
		{
			System.out.println("Exception handled"+e);
		}
	}

}
