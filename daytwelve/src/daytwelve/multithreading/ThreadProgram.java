package daytwelve.multithreading;

public class ThreadProgram extends Thread {
	public void run()
	{
		System.out.println("Thread is running in running state");
	}
	
	public static void main(String[] args) {
		//ThreadProgram.run();
		
		
		//To start thread
		ThreadProgram t=new ThreadProgram();
		//t.run();
		t.start();
		
		
		/*t.start();----->already in starting state therefore 
		                it will give IllegalThreadStateException
		*/
	}

}
