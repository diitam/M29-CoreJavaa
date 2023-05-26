//program to demonstrate on multithreading  
package daytwelve.multithreading;

public class ThreadExample {

	public static void main(String[] args) {
		//Returns a reference to the currently executing thread object.
		//Returns current thread name
		Thread t=Thread.currentThread();
		
		System.out.println("Current Thread: "+t);
		/*OUTPUT Contains........
		Current Thread: Thread[main,5,main]
				[threadname,default priority,thread group]				
		*/

	}

}
