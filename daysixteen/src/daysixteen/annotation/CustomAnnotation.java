package daysixteen.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;


//Custom Annotation
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Custom
{
	//We have to use all methods as abstract
	String print();
	float percentage();
}

class ImplementableClass
{
	@Custom(percentage = 92, print = "Disha here....")
	public void display()
	{
		System.out.println("Hurahhhh!!!!...Its working..");
	}
}
public class CustomAnnotation {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		ImplementableClass i=new ImplementableClass();
		i.display();
		Method m =i.getClass().getMethod("display");
		Custom obj=m.getAnnotation(Custom.class);
		obj.print();
		obj.percentage();
		
	}

}
