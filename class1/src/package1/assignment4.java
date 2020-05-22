package package1;

public class assignment4 {
	
	
		public assignment4()
		{
			
			System.out.println("default constructor");
		}
	public assignment4(int a)
	{
		this();
	System.out.println("One Parameterized constructor");
	}
	public assignment4(int a,int b)
	{
		this(100,200,300);
		System.out.println("Two parameterized constructor");
	}
	public assignment4(int a,int b,int c)
	{
		this(10);
		System.out.println("Three parameterized constructor");
	}

		public static void main(String[] args)
		{
			assignment4 obj = new assignment4(100,200);

		}

}



