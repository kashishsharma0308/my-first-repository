package package1;

public class assignment6 {
	
	public void m0()
	{
		System.out.println("I am default method");
	}
	public void m1(int a)
	{
		System.out.println("I am one parameterized  method");
	}
	
	public void m2(int a,int b)
	{
		System.out.println("I am 2 parameterized  method");
	}
	public void m3(int a,int b,int c)
	{
		System.out.println("I am 3 parameterized method method");
	this.m0();
	this.m1(100);
	this.m4(20,30,40,50);
	this.m2(35, 45);
	}
	public void m4(int a,int b,int c,int d)
	{
		System.out.println("I am 4 parameterized  method");
	}
	
	public static void main(String[] args) {
		assignment6 obj = new assignment6();
		obj.m3(10,20,30);

	}
}

