package staticpackage;

public class class6 extends class5 {
	
	public void arithmetic(int a,int b)
	{
		
		int c = a*b;
		System.out.println("value of mult is"+c);
	}
	

	public static void main(String[] args) {
		
		
		class6 obj = new class6();
		obj.arithmetic(10,20);

	}
}
