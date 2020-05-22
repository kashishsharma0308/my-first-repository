package package2;

public class child extends parent {
	public child()
	{
		this(10,20,30);
		
		System.out.println("Child Default constructor");
		
	}
	public child(int a)
	{
		this(10,30,40,50);
		System.out.println("Child 1 Parameterized constructor");
	}
	
	public child(int a,int b)
	{
		this(20);
		System.out.println("Child 2 Parameterized constructor");
	}
	
	public child(int a, int b, int c)
	{
		super(10,20,30);
		System.out.println("Child 3 Parameterized constructor");
	}
	public child(int a,int b, int c, int d)
	{
		this();
		System.out.println("Child 4 Parameterized constructor");
	}
public static void main(String[]args)
{
	child C1 = new child(10,20);
	
}
}

