package daytwelve.collections;

import java.util.ArrayList;

import daytwelve.threading.Person;

public class ArrayListDemo {

	public static void main(String[] args) {

		ArrayList lst=new ArrayList();
		lst.add(10);
		lst.add(14);
		lst.add(32.32);
		lst.add(3325563l);
		lst.add(true);
		lst.add('A');
		lst.add("Disha");
		System.out.println(lst);
		
		Person p=new Person();
		p.setId(101);
		p.setName("Nisha");
		lst.add(p);
		System.out.println(lst);
		ArrayList<String> list1=new ArrayList<String>(); 
		list1.add("Aniket");
		list1.add("Nikhil");
		list1.add("Pooja");
	//	list1.add(true);
	}

}
