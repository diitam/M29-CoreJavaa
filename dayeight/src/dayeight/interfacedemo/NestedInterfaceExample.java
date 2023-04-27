package dayeight.interfacedemo;

import dayeight.interfacedemo.OuterInterface.InnerInterface;

public class NestedInterfaceExample implements InnerInterface{

	private String s1;
	private String s2;
	
	//getters and setters
	public String getS1() {
		return s1;
	}
	public void setS1(String s1) {
		this.s1 = s1;
	}
	public String getS2() {
		return s2;
	}
	public void setS2(String s2) {
		this.s2 = s2;
	}
	@Override
	public String concatenate() {
	
		return s1+s2;
	}

	
	

	

	
}
