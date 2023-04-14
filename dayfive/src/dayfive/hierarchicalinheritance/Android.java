//program to demonstrate on hierachical inheritance
package dayfive.hierarchicalinheritance;
//Parent class
public class Android {
	
	//private data members
	private String brand;
	private String ownerName;
	
	//getters and setters
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	
	//defaullt constructor
	public Android() {
		System.out.println("Default constructor for parent");
		brand="Realme";
		ownerName="Li BingZhong";
	}
	
	//parametrized constructor
	public Android(String brand, String ownerName) {
		super();
		this.brand = brand;
		this.ownerName = ownerName;
	}
	
	//toString() method
	@Override
	public String toString() {
		return "Android [brand=" + brand + ", ownerName=" + ownerName + "]";
	}
	
	
	
	
	
	
	
	
	
	

}
