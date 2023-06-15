package GoShoppingApp.framework;

public abstract class ShopFactory {

	abstract public PrimeAcc getNewPrimeAcc(int accno,String accNm,float charges,boolean isPrime);
	abstract public NormalAcc getNewNormalAcc(int accno,String accNm,float charges,float deliveryCharges);

}

