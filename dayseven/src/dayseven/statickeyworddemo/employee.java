package dayseven.statickeyworddemo;

public class employee {
	
	//private data members
	private int empId;
	private String empName;
	
	//Static--without creating obj we can call obj
	static String companyName="St.John";
	
	//Parameterized constructor
	public employee(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}
	
	//generate to String---non static private 
	@Override
	public String toString() {
		return "employee [empId=" + empId + ", empName=" + empName + "]";
	}
	
	
}
