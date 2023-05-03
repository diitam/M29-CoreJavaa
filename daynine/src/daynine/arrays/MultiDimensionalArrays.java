//Multidimensional arrays
package daynine.arrays;
import java.util.Scanner;

public class MultiDimensionalArrays {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int arr [][]=new int[2][3];
		//above has 2 curly brackets{{},{}}
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.println(arr[i][j]+" ");
			}
		}
		sc.close();
	}

}
