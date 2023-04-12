//Driver class
/*program to demonstrate the package ,access specifier,instance of class*/
package dayfour.firstpackage;

public class AccessSpecifierExecuter {

	public static void main(String[] args) {

		Base obj=new Base();
		
		obj.methodDefault();
		obj.methodPublic();
		obj.methodProtected();
		/*private members cannot be accessed outside the class*/
		//obj.methodPrivate();
		//obj.varPrivate();
		
		//instance of the operator
		System.out.println(obj instanceof Base);
	}

}
