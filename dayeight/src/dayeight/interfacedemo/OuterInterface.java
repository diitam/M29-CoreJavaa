//program to demonstrate on nested interface
//It is an interface inside interface where there will be an another interface
package dayeight.interfacedemo;

public interface OuterInterface {

	int sum();
	interface InnerInterface{
		
		String concatenate();
	}
}
