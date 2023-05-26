package daytwelve.synchronization;

public class ThreadOne extends Thread{

	PowerOfANumber p;
	//Parameterized constructor
	public ThreadOne(PowerOfANumber p) {
		super();
		this.p = p;
	}
	public void run()
	{
		p.printPower(5);
	}
}
