package decisionmaking;
import java.util.*;
public class NestedIfProgram {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number: ");
		int num=sc.nextInt();
		if (num>0)
		{
		if(num>0)
		{
			System.out.println("It is non-zero number");
		}
		else
		{
			System.out.println("Zero or non-zero");
		}
		}
		else
		{
			System.out.println("Either non-zero or zero");
		}
		sc.close();
	}

}
