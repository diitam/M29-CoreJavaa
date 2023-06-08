//Program to demonstrate on JUnit Assertion method
package dayfifteen;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JUnitAssertionDemo {

	@Test
	void test() 
	{
		assertTrue(10>5); //if expression is true..test case passes else it fails
	}
	
	@Test
	void display() 
	{
		assertFalse(10>5); //Fails when expression is True
	}
	
	@Test
	void accept() 
	{
		assertNull(null); //Fails when actual value is not null....when it is null it passes
	}

}
