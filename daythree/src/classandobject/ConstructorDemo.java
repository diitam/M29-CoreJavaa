//program to demonstrate on class object and constructor
//driver class
package classandobject;
import java.util.*;
public class ConstructorDemo {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int id;
		String city,name;
		System.out.println("Enter the customerID: ");
		id=sc.nextInt();
		//to read the next line
		sc.nextLine();
		System.out.println("Enter the name: ");
		name=sc.nextLine();
		System.out.println("Enter the city: ");
		city=sc.nextLine();
		
		//object creation
		//default constructor is invoked
		Customer c=new Customer();
		c.setCustomerID(id);
		c.setCustomerName(name);
		c.setCustomerCity(city);
		//below statement will call toString() method
		System.out.println(c);
		
		//Prameterized constructor invoked
		Customer c1=new Customer(id,name,city);
		System.out.println(c1);
		
		sc.close();
	}

}
