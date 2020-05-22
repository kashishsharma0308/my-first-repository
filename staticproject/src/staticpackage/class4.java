package staticpackage;

public class class4 extends class3
{
	
	public void arithmetic(int a ,int b)
	{
		
		int c = a+b;
		System.out.println("Sum is c"+c);
	}

	public static void main(String[]args)
	{
		class4 obj1 = new class4();
		obj1.arithmetic(10, 20);
		
	}

}
