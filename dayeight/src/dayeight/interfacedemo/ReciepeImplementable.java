package dayeight.interfacedemo;

public class ReciepeImplementable implements Receipe {

	private String name;
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}




	public String displayName() {
		// TODO Auto-generated method stub
		return "Welcome "+name;
	}

}
