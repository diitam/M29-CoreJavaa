package dayeighteen.enumeration;

public class EmployeeEnumeration {

	enum empType
	{
		//enum constants
		CONTRACT,PERMANENT,PARTTIME
	}
	
	static void print(empType a)
	{
		if(a==empType.CONTRACT)
		{
			System.out.println("U R On ContractBased...");
		}
		else if(a==empType.PERMANENT)
		{
			System.out.println("U R On Permamanent...");

		}
		else 
		{
			System.out.println("U R On parttime...");

		}
	}
	public static void main(String[] args) {
		empType a=empType.PERMANENT;
		print(a);
		
	}

}
