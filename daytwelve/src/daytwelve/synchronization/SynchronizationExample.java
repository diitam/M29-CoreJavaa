//Driver class
//program to demonstrate without synchronization
package daytwelve.synchronization;

public class SynchronizationExample {

	public static void main(String[] args) {
		PowerOfANumber obj=new PowerOfANumber();
		ThreadOne t1=new ThreadOne(obj);
		ThreadTwo t2=new ThreadTwo(obj);
		t1.start();
		t2.start();
		
	}

}
