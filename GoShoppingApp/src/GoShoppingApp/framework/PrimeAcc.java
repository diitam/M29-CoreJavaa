package GoShoppingApp.framework;

public abstract class PrimeAcc extends ShopAcc {

	
	private boolean isPrime;
	static final private float deliveryCharges=0.0f;
	
	//Constructor
	public PrimeAcc(int accNo, String accNm, float charges,boolean isPrime) {
		super(accNo, accNm, charges);
		this.isPrime=isPrime;
	}
	
	
	public void bookProduct(float charges)
	{
		System.out.println("Account no."+this.getAccNo()+"Account name: "+this.getAccNm()+"Charges"+this.getCharges());
	}

	//toString
	@Override
	public String toString() {
		return "PrimeAcc [isPrime=" + isPrime + "]";
	}
	
	
	
}
