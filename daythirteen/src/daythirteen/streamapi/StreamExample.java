//Program to demonstrate on Stream 
package daythirteen.streamapi;

import java.util.stream.Stream;
public class StreamExample {

	public static void main(String[] args) {
		Stream<Integer>s1=Stream.of(11,100,23,56,90);
		s1.forEach((i)->System.out.print(i+" "));
		
	}

}
