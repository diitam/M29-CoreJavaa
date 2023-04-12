package dayfour.secondpackage;

import dayfour.firstpackage.Base;

/*importing the another package
import dayfour.firstpackage.*;*/
public class Executer {

	public static void main(String[] args) {

		@SuppressWarnings("unused")
		Base obj=new Base();
		
		/*if any method is default 
		we cannot access it into another package*/
		//obj.methodDefault();
		//We can only access the public method outside the class
		obj.methodPublic();
	
	}

}
