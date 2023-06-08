//Program to demonstrate on JUnit assumption
package dayfifteen;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

class JUnitAssumptionDemo {

	@Test
	void test() 
	{
		Assumptions.assumeTrue(12==12);//whatever Expression passing is considered as True
	}
	
	@Test
	void display() 
	{
		Assumptions.assumeFalse(12==10); //whatever expression we are passing is to be false
	}

}
