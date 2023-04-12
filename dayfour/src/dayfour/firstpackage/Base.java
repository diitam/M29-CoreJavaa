//program to demonstrate on the packages and access specifiers
package dayfour.firstpackage;

public class Base {


		int varDefault=10;
		public String varPublic="Disha";
		private int varPrivate=121;
		protected float varProtected=2356.20f;
		
		/*declaring all access specifier with method*/
		void methodDefault()
		{
			System.out.println("Default method: "+varDefault);
	
		}
		public void methodPublic()
		{
			System.out.println("Public method: "+varPublic);
	
		}
		void methodPrivate()
		{
			System.out.println("Private  method: "+varPrivate);
	
		}
		void methodProtected()
		{
			System.out.println("Protected method: "+varProtected);
	
		}
		
		/*public static void main(String[] args) {
			
		Base obj=new Base();
		
		obj.methodDefault();
		obj.methodPublic();
		obj.methodPrivate();
		obj.methodProtected();
		}*/
		

}
