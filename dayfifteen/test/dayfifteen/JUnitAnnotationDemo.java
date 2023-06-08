//Program to demonstrate on different annotation which is used in JUnit 5
package dayfifteen;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
@TestInstance(Lifecycle.PER_CLASS)

class JUnitAnnotationDemo {

	@Test     //user defined method
	void display()
	{
		System.out.println("Second JUNit5 test case...");
	}
	

	@Test     //user defined method
	@BeforeAll   //Denotes annotated method should be used before any test method
	static void print()
	{
		System.out.println("performing beforeAll Annotation");
	}
	
	@Test
	@AfterEach   //Performs after each test 
	@Disabled    //Performs the method but doesn't give output
	void accept()
	{
		System.out.println("Performing After each.....");
	}


}
