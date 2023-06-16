package MoneyMoneyBank.client;

import MoneyMoneyBank.application.MMBankFactory;
import MoneyMoneyBank.application.MMCurrentAcc;
import MoneyMoneyBank.application.MMSavingAcc;
import MoneyMoneyBank.framework.BankFactory;
import MoneyMoneyBank.framework.CurrentAcc;
import MoneyMoneyBank.framework.SavingAcc;

//driver class
/*
* program to demonstrate on MoneyBank application
*/


public class MoneyMoneyBankClient {

	public static void main(String[] args) {
		BankFactory b = new MMBankFactory();
		SavingAcc s = new MMSavingAcc(1000,"Disha Tamore", 6700, true);
		CurrentAcc c = new MMCurrentAcc(2001,"Arnav Tamore", 15000, 950);
		
		System.out.println(s);
		System.out.println(c);
		
		System.out.println();
		
		System.out.println("Saving Account");
		
		s.withdraw(300);
		
		
		System.out.println("\nCurrent Account");
		c.withdraw(650);
		

	}

}