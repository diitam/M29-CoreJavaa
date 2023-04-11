package classandobject;

public class Customer {

	
		
		//private data members
		private int customerID;
		private String customerName;
		private String customerCity;
	
		//constructor does not have any return type
		//it is same as classname followed 
		
		//default constructor
		public Customer() {
		super();}
		
		//parameterized constructor
		public Customer(int customerID, String customerName, String customerCity) {
			super();
			this.customerID = customerID;
			this.customerName = customerName;
			this.customerCity = customerCity;
		}

		//getters and setters
		public int getCustomerID() {
			return customerID;
		}

		public void setCustomerID(int customerID) {
			this.customerID = customerID;
		}

		public String getCustomerName() {
			return customerName;
		}

		public void setCustomerName(String customerName) {
			this.customerName = customerName;
		}

		public String getCustomerCity() {
			return customerCity;
		}

		public void setCustomerCity(String customerCity) {
			this.customerCity = customerCity;
		}

		@Override
		public String toString() {
			return "Customer [customerID=" + customerID + ", customerName=" + customerName + ", customerCity="
					+ customerCity + "]";
	
	}
	}
