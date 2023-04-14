package dayfive.superkeyword;

public class Tiger extends Animal{

	public String animalType="Tiger-Wild";
	public int noOfLegs=4;
	
	//default constructor
	public Tiger() {
		//It class parent class default constructor
		super();
		System.out.println("Tiger class constructor");
	}

	public void display()
	{
		//super keyword method
		super.display();
		System.out.println(super.animalType);
		System.out.println(super.noOfLegs);
		System.out.println("Animal Type: "+animalType);
		System.out.println("Number of legs:"+noOfLegs);
	}

	@Override
	public String toString() {
		return "Tiger [animalType=" + animalType + ", noOfLegs=" + noOfLegs + "]";
	}
	
	
}
