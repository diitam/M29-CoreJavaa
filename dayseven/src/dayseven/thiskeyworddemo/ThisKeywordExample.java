//program to demonstrate on this keyword
package dayseven.thiskeyworddemo;

public class ThisKeywordExample {

	private int cvvNo;
	private long atmNo;
	
	//parameterized constructor
	public ThisKeywordExample(int cvvNo, long atmNo) {
		
		this.cvvNo = cvvNo;
		this.atmNo = atmNo;
		/*cvvNo=cvvNo1;
		atmNo=atmNo1;*/
	}
	public void print()
	{
		System.out.println("CVV no. is: "+cvvNo+" ATM card no. is: "+atmNo);
	}
	
}
