//program to demonstrate on super keyword
package dayfive.superkeyword;

public class Animal {

	public String animalType="Wild";
	public int noOfLegs=4;
	
	public void display()
	{
		System.out.println("Animal Type: "+animalType);
		System.out.println("Number of legs:"+noOfLegs);
	}

	//default
	public Animal() {
		System.out.println("Animal class constructor");
	}


	//toString() method
	@Override
	public String toString() {
		return "Animal [animalType=" + animalType + ", noOfLegs=" + noOfLegs + "]";
	}
	
	
	
	
}
