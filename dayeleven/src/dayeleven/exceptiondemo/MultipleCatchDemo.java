package dayeleven.exceptiondemo;

public class MultipleCatchDemo {

	public static void main(String[] args) {
		
		int arr[]=new int[] {101,33,48};
		System.out.println("Array is: " );
		try {
		System.out.println(arr[3]);
		}
		
		/*multiple catch block
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Exception handled:" +e);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception handled:" +e);
		}
		*/
		
		//multiple exception inside same catch block
		catch(ArrayIndexOutOfBoundsException |ArithmeticException e)
		{
			System.out.println(e);
		}
	}

}
