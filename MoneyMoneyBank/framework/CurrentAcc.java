package MoneyMoneyBank.framework;

public abstract class CurrentAcc extends BankAcc{


	private final float creditLimit;
	//constructor
	public CurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal);
		this.creditLimit = creditLimit;
	}
	//methods
	public void withdraw(float accBal) {
		if(this.getAccBal() > creditLimit+accBal) {
			System.out.println("Balance Before Withdrawal: "+this.getAccBal());
			this.setAccBal(getAccBal()-(creditLimit+accBal));
			System.out.println("Account No: "+this.getAccNo()+", Account Name: "+this.getAccNm()+", Account Balance: "+this.getAccBal()+", Withdraw Amount:"+accBal);
		} else {
			System.out.println("Cannot Withdraw Minimum balance required is:"+(creditLimit+accBal));
		}
	}
	//toString method
	@Override
	public String toString() {
		return "CurrentAcc [creditLimit=" + creditLimit + "]";
	}

}
