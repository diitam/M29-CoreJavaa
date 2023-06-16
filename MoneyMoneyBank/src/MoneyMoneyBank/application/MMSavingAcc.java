package MoneyMoneyBank.application;

import MoneyMoneyBank.framework.SavingAcc;

public class MMSavingAcc extends SavingAcc {
	
	public MMSavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		super(accNo, accNm, accBal, isSalaried);
		
	}
	//toString
	@Override
	public String toString() {
		return String.format("MMSavingAcc [toString()=%s]", super.toString());
	}
}
	
	