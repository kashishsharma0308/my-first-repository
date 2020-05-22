package package2;

public class methodchild extends methodparent{
	public void m0()
	{
		System.out.println("Child Default method");
	}
	
	public void m1(int a)
	{
		System.out.println("Child 1 Parameterized method");
	}
	public void m2(int a,int b)
	{
		this.m3(10, 20, 30);
		this.m0();
		this.m4(10, 20, 300, 40);
		this.m1(10);
		System.out.println("Child 2 Parameterized method");	
	
	}
	public void m3(int a,int b,int c)
	{
		super.method3(10,20,30);
		
		System.out.println("Child 3 Parameterized method");
	}
	public void m4(int a,int b,int c,int d)
	{
		System.out.println("Child 4 Parameterized Method");
	}
	public static void main(String[]args)
	{
		methodchild m = new methodchild();
		m.m2(10, 20);
		
		
	}

}


