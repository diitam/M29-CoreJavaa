//Program to demonstrate the for loop
package looping;
import java.util.*;
public class ForLoopProgram {

	public static void main(String[] args) {

		//print 1-n numbers
		int i=1;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Give the value of n: ");
		int n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			System.out.println(i+" ");
		}
	}

}
