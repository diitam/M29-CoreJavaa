//Method overriding
package daysix.methodoverriding;
//parent class
//parent class
public class RBI {
	public float getInterestRate() {
		return 3.8f;
	}
}
class HDFC extends RBI{
	public float getInterestRate() {
		System.out.println(super.getInterestRate());
		return 12.5f;
	}
}
