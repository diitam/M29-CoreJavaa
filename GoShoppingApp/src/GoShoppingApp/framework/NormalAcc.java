package GoShoppingApp.framework;

public abstract class NormalAcc extends ShopAcc {

	private final float deliveryCharges;
	
	//constructor
	public NormalAcc(int accNo,String accNm,float charges, float deliveryCharges) {
		super(accNo,accNm,charges);
		this.deliveryCharges = deliveryCharges;
	}
	//method
	public void bookProduct(float charges)
	{
		System.out.println("Account no."+this.getAccNo()+"Account name: "+this.getAccNm()+"Charges"+(charges+deliveryCharges));
	}
	@Override
	public String toString() {
		return "NormalAcc [deliveryCharges=" + deliveryCharges + "]";
	}

	
	
	
}
