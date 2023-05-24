//program to demonstrate custom/user defined exception
package dayeleven.customexception;

//to crea6e an custom exception we need to extend an exception class
public class LoginCredential extends Exception{
	//private data declared
	private String str1;
	
	//parameterized constructor
	public LoginCredential(String str1) {
		super();
		this.str1 = str1;
	}
	//toString() method	
	@Override
	public String toString() {
		return "LoginCredential [str1=" + str1 + "]";
	}
	
	
}
