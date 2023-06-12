package daysixteen.annotation;

//Parent class
class Car
{
	public void Speed(int speed)
	{
		System.out.println("Speed is "+speed+" km/hr");
	}

	public void speed(int speed) {
		// TODO Auto-generated method stub
		
	}
}
//Child class
//It is inheriting the properties of Parent class
class Lambo extends Car
{
	/*It ensures that child class method is 
	 * inheriting properties of parent class*/
	@Override 
	//it should be speed 
	//If its Speed it will give error
	public void speed(int speed)   
	{
		System.out.println("Speed is "+speed+" km/hr");
	}
}
public class OverrideAnnotationExample {

	public static void main(String[] args) {
		Lambo obj = new Lambo();
		obj.speed(96);
		
	}

}
