package looping;

import java.util.Scanner;

public class WhileLoopProgram {

	public static void main(String[] args) {
		int i=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		int n=sc.nextInt();
				while(i<=n)
				{
					System.out.println(i);
					i++;
				}
				sc.close();
	}

}
