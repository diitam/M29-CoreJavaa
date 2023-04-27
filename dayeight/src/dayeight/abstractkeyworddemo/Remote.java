package dayeight.abstractkeyworddemo;

public abstract class Remote {

	public String cellName;
	
	//abstract method
	abstract void functionRemote();
	abstract void create();

	//concrete method
	void diaplay()
	{
		System.out.println("Cell name is: "+cellName);
	}
}
//implementable class
class RemoteChild extends Remote
{
	@Override
	void functionRemote() {
		System.out.println("Abstract method implemented..");
	}
	/*implement all the method of the
	 *  abstract class in implementable class*/
	 
	@Override
	void create() {
		System.out.println("Abstract method-2");
	}
}
