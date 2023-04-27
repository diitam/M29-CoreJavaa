//program to demonstrate functional interface
//Functional Interface-Contains exactly one abstract method
package dayeight.interfacedemo;
//below annotation tell us that interface need to have one abstract method
@FunctionalInterface
public interface Receipe {

	//by default all methods here are abstract
	//and variable are public static final
	String displayName();
	//String print();
	
}
