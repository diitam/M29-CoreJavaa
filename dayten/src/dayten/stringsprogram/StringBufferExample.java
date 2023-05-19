package dayten.stringsprogram;

public class StringBufferExample {

	public static void main(String[] args) {
		StringBuffer str1=new StringBuffer("Disha");
		System.out.println(str1.capacity());
		//String default length(16)+length
		System.out.println(str1.charAt(4));
	}

}
