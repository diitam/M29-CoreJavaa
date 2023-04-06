package decisionmaking;
import java.util.*;
public class SwitchCaseProgram {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number from 1-3: ");
		int songInput=sc.nextInt();
		switch(songInput)
		{
		case 1:
			System.out.println("Calm down");
			break;
		case 2:
			System.out.println("Perfect");
			break;
		case 3:
			System.out.println("Mallem Song");
			break;
		default:
			System.out.println("Invalid Input");
		}
		sc.close();
	}

}
