package dayeighteen.enumeration;
//Enum can implement an interface
public enum Size implements Pizza {

	SMALL,MEDIUM,LARGE;

	@Override
	public void displaySize() {
		System.out.println("Size: "+this);
	}
}
