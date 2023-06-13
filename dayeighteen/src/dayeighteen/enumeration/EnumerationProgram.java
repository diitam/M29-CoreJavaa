//Creating Enum inside a class
package dayeighteen.enumeration;

public class EnumerationProgram {

	enum Margin
	{
		//Enum constants
		TOP,BOTTOM,LEFT,RIGHT
	}
	public static void main(String[] args) {

		int count=10;
		for(Margin m:Margin.values())
		{
			System.out.printf("Margin: %d=%s\n",count++,m);
		}
	}

}
