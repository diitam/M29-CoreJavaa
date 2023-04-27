package dayeight.interfacedemo;
//implementable class
public class ATMMachineChild implements ATMMachine{

	@Override
	public void withdraw() {
		System.out.println("Withdrawn Amount is: "+amountWithdraw);
	}

	@Override
	public void deposit() {
		System.out.println("Deposited Amount is: "+amountDeposit);
		
	}

}
