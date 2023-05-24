//Program to demonstrate when finally block is not executed
package dayeleven.exceptiondemo;

public class FinallyBlockExample {

	public static void main(String[] args) {
		//array declaration and initialization
		int arr[]=new int[] {101,33,78};
		System.out.println("Array is: ");
		
		try {	
			//when we call system.exit(0) it means no any further statement will executed
			//System.exit(0);
			System.out.println(arr[3]);
			
		}
		catch(Exception e){
			System.out.println("Exeption handled: "+e);
		}
		
		finally
		{
			//when finally block contains exception code
			//System.out.println(13/0);
			System.out.println("Finally Block...");
		}

	}

}
