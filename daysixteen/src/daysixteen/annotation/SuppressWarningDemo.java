package daysixteen.annotation;

import java.util.Set;
import java.util.TreeSet;

public class SuppressWarningDemo {

	/*We can remove the warnings by using the 
	below annotation*/
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		@SuppressWarnings("rawtypes")
		Set s = new TreeSet();
		s.add(10);
		s.add(56);
		s.add(12);
		System.out.println(s);
	}

}
