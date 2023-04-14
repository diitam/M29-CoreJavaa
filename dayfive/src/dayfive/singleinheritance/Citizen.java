//Parent class
package dayfive.singleinheritance;

public class Citizen {

		private String name;
		private String adharno;
		private String City;
		private long contactNo;

		//default constructor
		public Citizen() {
		super();
		}
		
		//parameterized constructor
		public Citizen(String name, String adharno, String city, long contactNo) {
		super();
		this.name = name;
		this.adharno = adharno;
		City = city;
		this.contactNo = contactNo;
		}

		//getters and setters
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getAdharno() {
			return adharno;
		}

		public void setAdharno(String adharno) {
			this.adharno = adharno;
		}

		public String getCity() {
			return City;
		}

		public void setCity(String city) {
			City = city;
		}

		public long getContactNo() {
			return contactNo;
		}

		public void setContactNo(long contactNo) {
			this.contactNo = contactNo;
		}

		//when you print object,it calls toString method
		@Override
		public String toString() {
			return "Citizen [name=" + name + ", adharno=" + adharno + ", City=" + City + ", contactNo=" + contactNo
					+ "]";
		}
}
