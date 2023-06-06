//Program to demonstrate generic advantages
package dayfourteen.generics;

import java.util.List;
import java.util.ArrayList;

public class GenericsAdvantageExample {

	public static void main(String[] args) {
		
		//1.Type-Safety
		List<Integer> list=new ArrayList();
		list.add(11);
		list.add(23);
		//list.add(23.2);Cannot add float when mentioned Integer
		System.out.println(list);
		
		//2.Before Generic ,Type-Casting is allowed
		ArrayList arr1=new ArrayList();
		arr1.add("SJCEM");
		System.out.println(arr1);
		String str=(String)arr1.get(0);//Type casted to string
		System.out.println(str);
		
		//3.in generic ,Type-Casting is not necessary as it will will automatically typecasted 
		ArrayList<String> arr2=new ArrayList();
		arr2.add("SJCEM");
		System.out.println(arr2);
		String str1=(String)arr2.get(0);//Type casting not necessary
		System.out.println(str);
		
	}

}
