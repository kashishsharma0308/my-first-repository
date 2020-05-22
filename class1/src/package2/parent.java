package package2;

public class parent {
	public parent() 
	{
		this(10,20,30,40);
		System.out.println("Parent default constructor");
			
	}
public parent(int a)
{
	this(10,20);
	System.out.println("Parent 1 Parameterized constructor");
}
public parent(int a, int b)
{
	this();
	System.out.println("Parent 2 Parameterized constructor");
	}
public parent(int a, int b,int c)
{
	this(10);
	System.out.println("Parent 3 Parameterized constructor");
	}
public parent(int a, int b,int c,int d)
{
	System.out.println("Parent 4 Parameterized constructor");
	}
}


