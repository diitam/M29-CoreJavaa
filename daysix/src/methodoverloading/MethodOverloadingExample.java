//Program to demonstrate on method overloading
package methodoverloading;

public class MethodOverloadingExample {
	//method overloading by passing different types of arguments
	public int multiplication(int a,int b)
	{
		return a*b;
	}
	public float multiplication(float a,float b)
	{
		return a*b;
	}
	public float multiplication(int a,float b)
	{
		return a*b;
	}
	public float multiplication(float a,int b)
	{
		return a*b;
	}
	
	//
	public String print(String str)
	{
		return str;
	}
	public String print(String str,String str1)
	{
		return str+str1;
	}
}
