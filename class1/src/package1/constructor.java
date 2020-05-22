package package1;

public class constructor {
	int a,b,c;
	public constructor()
	{
		System.out.println("default constructor");
	}
public constructor(int a)
{
System.out.println("One Parameterized constructor");
}
public constructor(int a,int b)
{
	System.out.println("Two parameterized constructor");
}
public constructor(int a,int b,int c)
{
	System.out.println("Three parameterized constructor");
}

	public static void main(String[] args) {
		constructor obj = new constructor();

	}

}
