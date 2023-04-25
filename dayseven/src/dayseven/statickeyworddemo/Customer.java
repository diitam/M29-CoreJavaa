//Program to demonstrate on static block and static method
package dayseven.statickeyworddemo;

public class Customer {

	//non-static variable
	private int customerId;
	
	//static method
	private static String companyName;
	
	//Static-block used to initialized static var only
	static 
	{
		/*name="Dish";
		name is non static thus cannot be used here*/
		companyName="Myntra";
	}

	public Customer() 
	{
		System.out.println("Default constructor");
		customerId++;	
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + "]";
	}

	
	static void display()
	{
		//non static variable cannot be used in static method
		System.out.println("Company Name: "+companyName);
	}

	
	
	
	
	
}
