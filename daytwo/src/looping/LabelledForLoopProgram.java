//Program to demonstrate on labelled for loop
package looping;

public class LabelledForLoopProgram {

	public static void main(String[] args) {
		outer: //label
			for(int i=1;i<=5;i++) 
			{
				System.out.println();
			
				inner:
					for(int j=1;j<=5;j++) 
					{
						System.out.print(j+" ");
						if(j==4)
					{
						continue; //It terminates the 
					}
		}
	}

}}
