package dayfifteen;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.ValueSource;

class ParameterizedTestDemo {


class ParameterizedTest {

	@ParameterizedTest
	@ValueSource(strings= {"Disha","Sam"})
	void test() 
	{
		System.out.println("Demonstration on parameterized test");
	}
	
	@ParameterizedTest
	@ValueSource(strings= {"Vishakha","Karsha"})
	void apply(String str) 
	{
		assertNotNull(str);
	}

}
}