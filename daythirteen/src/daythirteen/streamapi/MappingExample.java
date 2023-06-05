//program to demonstrate on map operation
package daythirteen.streamapi;

import java.util.Arrays;
import java.util.List;

public class MappingExample {

	public static void main(String[] args) {

		List<String>obj=Arrays.asList("Disha","Sam","Karsha");
		obj.stream().map(i->i.length()).forEach((i)-> System.out.print(i+" "));
	}

}
