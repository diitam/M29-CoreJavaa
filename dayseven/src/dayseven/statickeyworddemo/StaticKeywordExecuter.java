//driver class
package dayseven.statickeyworddemo;

public class StaticKeywordExecuter {

	public static void main(String[] args) {
		
		/*without creating obj-we get the value of 
		 * variable as it is declared static*/
		System.out.println(employee.companyName);
		
		employee e=new employee(01,"Disha T");
		System.out.println(e);
		employee e1=new employee(02,"Utkarsha K");
		System.out.println(e1);
		
		Customer.display();
		Customer c=new Customer();
		System.out.println(c);
		
	}

}
