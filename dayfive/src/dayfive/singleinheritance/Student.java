//Every inheritance IS-A relation
//child or sub class
package dayfive.singleinheritance;

public class Student extends Citizen {

	private String College;
	private int rollno;
	
	//default constructor
	public Student() {
		super();

	}
	
	//parameterized constructor
	public Student(String name, String adharno, String city, long contactNo,String college, int rollno) {
		super(name, adharno, city, contactNo);
		this.College = college;
		this.rollno = rollno;
	}
	
	//getters and setters
	public String getCollege() {
		return College;
	}

	public void setCollege(String college) {
		College = college;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	
	//tostring

	@Override
	public String toString() {
		return "Student [College=" + College + ", rollno=" + rollno + ", getName()=" + getName() + ", getAdharno()="
				+ getAdharno() + ", getCity()=" + getCity() + ", getContactNo()=" + getContactNo() + "]";
	}
	
	
	
	
		

	
	
	
	
	

}
