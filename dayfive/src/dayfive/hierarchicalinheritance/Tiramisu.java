//program to demonstrate on hierachical inheritance
//child class 2
package dayfive.hierarchicalinheritance;

public class Tiramisu extends Android {
	
	private int versionName;
	private String modelName;
	
	//Getters and setters
	public int getVersionName() {
		return versionName;
	}
	public void setVersionName(int versionName) {
		this.versionName = versionName;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	
	//default constructor
	public Tiramisu() {
		System.out.println("Default constructor for child class 2");
	}
	
	//parameterized constructor
	public Tiramisu(int versionName, String modelName) {
		super();
		this.versionName = versionName;
		this.modelName = modelName;
	}

	
	//toString()
	@Override
	public String toString() {
		return "Tiramisu [versionName=" + versionName + ", modelName=" + modelName + ", getBrand()=" + getBrand()
				+ ", getOwnerName()=" + getOwnerName() + "]";
	}
	
	
	


}
