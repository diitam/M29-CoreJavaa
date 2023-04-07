//Pattern Program
package looping;

public class NestedForLoopProgram {

	public static void main(String[] args) {
		//Printing 4*4 star pattern
		int row=4;
		int column=4;
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=column;j++)           //nested for
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}

}
