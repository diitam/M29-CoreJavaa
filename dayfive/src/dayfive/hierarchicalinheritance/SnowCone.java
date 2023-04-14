//program to demonstrate on hierachical inheritance
//child class 1
package dayfive.hierarchicalinheritance;
public class SnowCone extends Android{
	
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
	public SnowCone() {
		System.out.println("This is default Constructor for child class 1");
	}
	
	//parameterized
	public SnowCone(int versionName, String modelName) {
		super();
		this.versionName = versionName;
		this.modelName = modelName;
	}
	
	//toString()
	@Override
	public String toString() {
		return "SnowCone [versionName=" + versionName + ", modelName=" + modelName + ", getBrand()=" + getBrand()
				+ ", getOwnerName()=" + getOwnerName() + "]";
	}
	
	
	
	
		
}
