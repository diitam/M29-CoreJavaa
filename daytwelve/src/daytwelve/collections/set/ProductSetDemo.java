package daytwelve.collections.set;

import java.util.SortedSet;
import java.util.TreeSet;

public class ProductSetDemo {

	public static void main(String[] args) {
		/*
		SortedSet productSet=new TreeSet();
		productSet.add("Nashik");
		productSet.add("Pune");
		productSet.add("Mumbai");
		productSet.add(12);
		productSet.add(true);
		System.out.println(productSet);
		*/
SortedSet<Product> productSet=new TreeSet<Product>();
productSet.add(new Product(101,"Text",123));
productSet.add(new Product(102,"dish",163));
productSet.add(new Product(103,"Tecdc",164));
System.out.println(productSet);




	}

}
