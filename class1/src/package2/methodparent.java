package package2;

public class methodparent {
	
	public void method()
	{
		this.method4(10, 20, 30, 40);
		System.out.println("Parent Default method");
	}
	
	public void method1(int a)
	{
		this.method2(10, 20);
		System.out.println("Parent 1 Parameterized method");
	}
	public void method2(int a,int b)
	{
		this.method();
		System.out.println("Parent 2 Parameterized method");
	}
	public void method3(int a,int b,int c)
	{
		this.method1(10);
		System.out.println("Parent 3 Parameterized method");
	}
	public void method4(int a,int b,int c,int d)
	{
		System.out.println("Parent 4 Parameterized Method");
	}

}
