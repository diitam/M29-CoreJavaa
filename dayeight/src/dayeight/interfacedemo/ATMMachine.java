//program to demonstrate interface
package dayeight.interfacedemo;

public interface ATMMachine {
	
	//all the variables in interface are defaultly public static final
	//int amount;
	int amountWithdraw=1250;
	int amountDeposit=1000;

	//all methods inside an interface are by default abstract
	void withdraw();
	void deposit();
}
