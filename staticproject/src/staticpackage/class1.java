package staticpackage;

public  class class1 {
public static void abc()
{
	
	System.out.println("I am static method");
}
public static void xyz()
{
	
	abc();
	System.out.println("I am static method2");
}
public void s1()
{
	xyz();
	System.out.println("I am non static method");
	
}
	public static void main(String[] args) {
		
		xyz();	
		class1 obj1=new class1();
		obj1.s1();

	}

}
