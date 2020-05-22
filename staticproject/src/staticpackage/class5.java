package staticpackage;

public class class5 extends class3 {
	int a,b;
	public void arithmetic(int a,int b)
	{
		int c = b-a;
		
		System.out.println("value of minus is "+c);
	}
	public static void main(String[]args)
	{
		class5 obj1 = new class5();
		obj1.arithmetic(10,20);
		
	}

}
