//Demonstartion on the pre and post increment and decrement 
package arithematicoperator;

public class IncrementAndDecrementDemo {

	public static void main(String[] args) {
		int a=12,b=5;
		int x = a++;    //post increment
		++a;           //++increment by 1
		--b;
		int y=b--;
		
		System.out.println(a);
		System.out.println(x);
		System.out.println(b);
		System.out.println(y);
	}

}
