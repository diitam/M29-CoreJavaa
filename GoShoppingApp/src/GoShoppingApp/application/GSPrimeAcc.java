package GoShoppingApp.application;

import GoShoppingApp.framework.PrimeAcc;

public class GSPrimeAcc extends PrimeAcc{

	//Constructor
	public GSPrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
		super(accNo, accNm, charges, isPrime);
	}
	
	//toString method
	@Override
	public String toString() {
		return "GSPrimeAcc [toString()=" + super.toString() + "]";
	}
	
	
	
	

}
