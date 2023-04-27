package dayeight.interfacedemo;
//driver class
public class InterfaceExecuter {

	public static void main(String[] args) {
		
		//we cannot instantiate any interface becaz all the methods are abstract
		///ATMMachine a=new ATMMachine();
		
		ATMMachine a1=new ATMMachineChild();
		a1.deposit();
		a1.withdraw();
	
		ReciepeImplementable r1=new ReciepeImplementable();
		r1.setName("Disha Tamore");
		System.out.println(r1.displayName());
		
		NestedInterfaceExample n=new NestedInterfaceExample();
		n.setS1("Disha");
		n.setS2("Tamore");
		System.out.println(n.concatenate());
	}

}
