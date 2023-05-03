package daynine.arrays;

import java.util.Scanner;

public class JaggedArrayExample {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		//Declaring 2-D array with 2 rows
		int arr[][]=new int[2][];
		//for 1st block outside array,it contains 3 elements
		arr[0]=new int[3];
		//for 2nd block outside array,it contains 2 elements
		arr[1]=new int[2];
		
		for (int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++) 
			{	
				arr[i][j]=sc.nextInt();
			}
		}	
		for (int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++) 
			{
				System.out.print(arr[i][j]+" ");			
			}
			System.out.println();
		}
		sc.close();
	}
}
