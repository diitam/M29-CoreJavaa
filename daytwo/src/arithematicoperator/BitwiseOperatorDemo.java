//Bitwise Operators
package arithematicoperator;

public class BitwiseOperatorDemo {

	public static void main(String[] args) {
	int result1=10&7;   //10=1010,7=111 &-->if both is 1 then 1 else 0
	int result2=10|7;   //|-->if any input is 1 then 1 else 0
	int result3=10^7;   // ^--> if both input same then 0 else 1
	int result4=8>>1;
	int result5=8<<2;
	
	System.out.println(result1);
	System.out.println(result2);
	System.out.println(result3);
	System.out.println(result4);
	System.out.println(result5);
	}

}
