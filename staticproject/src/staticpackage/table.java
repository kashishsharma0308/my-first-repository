package staticpackage;

import java.util.Scanner;

public class table {
	
	
	

	public static void main(String[]args)
	{
		int a;
		int b;
		int c;
		
		Scanner s =new Scanner(System.in);
		System.out.println("Enter the value of a before swapping");
		 a= s.nextInt();
		System.out.println("value of a before swapping" +a);
		
		System.out.println("Enter value of b");
		 b= s.nextInt();
		System.out.println("Value of b before swapping"+b);
	c = a;
	a= b;
	b = c;
	System.out.println("Value of a After swapping "+a);
	System.out.println("Value of b after swapping"+b);
	
	}
}
	
	


