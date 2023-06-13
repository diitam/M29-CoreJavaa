//program to demonstrate on matcher class
package dayeighteen.RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherClass {

	public static void main(String[] args) {
		Pattern p=Pattern.compile("job");
		Matcher m=p.matcher("Java Programming is a good lang");
		while(m.find())
		{
			System.out.printf("Pattern found.."+m.start()+(m.end()-1));
		}
	}

}
