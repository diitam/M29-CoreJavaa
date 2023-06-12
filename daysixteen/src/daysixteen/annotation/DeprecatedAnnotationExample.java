package daysixteen.annotation;

public class DeprecatedAnnotationExample {
	
	//It allows any element no longer to be used
	@Deprecated
	public void Print()
	{
		System.out.println("Welcome to java annotation");
	}
	public static void main(String[] args) {
		DeprecatedAnnotationExample D=new DeprecatedAnnotationExample();
		D.Print();
	}

}
