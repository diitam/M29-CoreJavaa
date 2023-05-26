package daytwelve.synchronization;

public class ThreadTwo extends Thread{

	PowerOfANumber p;
	//Parameterized constructor
	public ThreadTwo(PowerOfANumber p) {
		super();
		this.p = p;
	}
	public void run()
	{
		p.printPower(3);
	}
}
