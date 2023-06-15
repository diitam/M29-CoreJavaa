package GoShoppingApp.application;

import GoShoppingApp.framework.NormalAcc;

public class GSNormalAcc extends NormalAcc {
	//constructor
	public GSNormalAcc(int accNo, String accNm, float charges, float deliveryCharges) {
		super(accNo, accNm, charges, deliveryCharges);
	}
	//toString
	@Override
	public String toString() {
		return "GSNormalAcc [toString()=" + super.toString() + "]";
	}
	
	

}
