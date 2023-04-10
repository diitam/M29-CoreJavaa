package assignmentFunctionRecursion;
import java.util.*;
public class FibonacciSeriesUsingRecursion {

	 static int n1=0,n2=1,n3=0;    
	 static void Fibonacci(int count){    
	    if(count>0)
	    {    
	         n3 = n1 + n2;    
	         n1 = n2;    
	         n2 = n3;    
	         System.out.print(" "+n3);   
	         Fibonacci(count-1);    
	     }    
	 }    
	 public static void main(String args[]){    
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the number: ");
	int count=sc.nextInt();
	  System.out.print(n1+" "+n2);//printing 0 and 1    
	  Fibonacci(count-2);//n-2 because 2 numbers are already printed   
	  sc.close();
	 }  
		  
		
}
