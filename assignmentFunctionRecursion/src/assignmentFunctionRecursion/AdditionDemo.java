//To demonstrate the example on the function
package assignmentFunctionRecursion;
import java.util.*;
public class AdditionDemo {
	//Function Defination
	/*static int addition(int x, int y)
	{
		int sum=x+y;
		return sum;
	}*/
	static void addition(int x,int y)
	{
		int sum=x+y;
		System.out.println("The sum is: "+sum);
	}

	
	public static void main(String[] args) {

	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the value of x and y:  ");
	int x=sc.nextInt();
	int y=sc.nextInt();
	addition(x,y);
	//function call
	//System.out.println(addition(x,y));
	sc.close();
	}

}
