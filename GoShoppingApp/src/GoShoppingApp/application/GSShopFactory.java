package GoShoppingApp.application;

import GoShoppingApp.framework.NormalAcc;
import GoShoppingApp.framework.PrimeAcc;
import GoShoppingApp.framework.ShopFactory;

public class GSShopFactory extends ShopFactory{

	@Override
	public PrimeAcc getNewPrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
		GSPrimeAcc p = new GSPrimeAcc(accNo,accNm,charges,isPrime);
		return p;
	}

	@Override
	public NormalAcc getNewNormalAcc(int accno, String accNm, float charges, float deliveryCharges) {
		GSNormalAcc n = new GSNormalAcc(accno,accNm,charges,deliveryCharges);
		return n;
	}

}
