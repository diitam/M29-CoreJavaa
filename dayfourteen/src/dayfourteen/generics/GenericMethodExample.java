//to demonstrate generic method
package dayfourteen.generics;

class GenericMethod<T>
{
	public <E> void print(E[] arr1)
	{
		for(E itr:arr1) {
			System.out.print(itr+" ");
		}
		System.out.println();
	}
}
//driver class
public class GenericMethodExample {

	public static void main(String[] args) {

		GenericMethod g=new GenericMethod();
		Integer[] arr1= {11,22,33};
		Character[] arr2= {'d','c','g'};
		System.out.println("Integer array: ");
		g.print(arr2);
		
	}

}
