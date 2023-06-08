/*Program to demonstrate the unit testing 
Gives layout of the testing window*/
package dayfifteen;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class FirstJUnitTestCase {

	@Test   //@Test annotation is used to perform unit testing on the given test method
	void test() 
	{
		fail("Not yet implemented");
	}
	
	@Test     //user defined method
	@DisplayName("SimpleTesting") //Custom naming the test case in output window
	void display()
	{
		System.out.println("First JUNit5 test case");
	}

}
