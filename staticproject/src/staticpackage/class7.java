package staticpackage;

public class class7 implements interface1 {

	public void sum(int a, int b)
	{
		int c = a+b;
		System.out.println("Sum Result"+c);
	}
	public void sub(int a, int b)
	{
		int c = a-b;
		
		System.out.println("Sub result is"+c);
	}
	public static void main(String[] args) {
		class7 obj1 = new class7();
		obj1.sum(10, 20);
		obj1.sub(40,30);

	}

}
