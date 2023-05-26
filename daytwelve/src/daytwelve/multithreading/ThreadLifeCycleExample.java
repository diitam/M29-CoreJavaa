/*program to demonstrate on thread life-cycle*/
package daytwelve.multithreading;

public class ThreadLifeCycleExample extends Thread {

	public void run()
	{
		System.out.println("is thread alive....?"+this.isAlive());
		int x=0;
		while(x<3)
		{
			x++;
			System.out.println("x is: "+x);
		}
		try
		{
		sleep(500);
		
		System.out.println("is thread alivefor sleep...?"+this.isAlive());
		}
		catch(InterruptedException e)
		{
			System.out.println("Thread Interupted.....");
		}
	}
	
	public static void main(String[] args) {
		
		ThreadLifeCycleExample t= new ThreadLifeCycleExample();
		System.out.println("Before Startig thread is thread alive...?"+t.isAlive());
		t.start();
		
	}

}
