package dayeight.abstractkeyworddemo;

public class AbstractExecuter {

	public static void main(String[] args) {

		/*if any class contain abstract method we cannot create object
		 * 
		 */
		Remote r1=new RemoteChild();
		r1.cellName="Singplex";
		r1.diaplay();
		r1.functionRemote();
		r1.create();

		RemoteChild r=new RemoteChild();
		r.cellName="Durocell";
		r.diaplay();
		r.functionRemote();
		r.create();
	}

}
