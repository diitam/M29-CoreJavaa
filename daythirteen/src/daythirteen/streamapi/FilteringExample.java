//Program to demonstrate on filtering
package daythirteen.streamapi;

import java.util.List;
import java.util.Arrays;

public class FilteringExample {
	
	public static void main(String[] args) {
		List<String>obj=Arrays.asList("Disha","Sam","Karsha","Sam");
		//filter
		obj.stream().filter((i->i.length()>5)).forEach((i)->System.out.print(i+" "));
		System.out.println();
		//distinct
		obj.stream().distinct().forEach((i)->System.out.print(i+" "));
		System.out.println();
		//limit
		obj.stream().limit(2).forEach((i)->System.out.print(i+" "));
		System.out.println();
		//skip
		obj.stream().skip(3).forEach((i)->System.out.print(i+" "));

	}
}
