package package1;

import java.util.Scanner;

public class assignment5 {
	public int add(int a,int b)
	{	
		int sum = a+b;
		return sum;
	}
public int sub(int x, int y)
{
int min = x-y;
return min;
}
public int mult(int m,int n)
{
int multiply = m*n;
return multiply;
}
public void div(int p, int q)
{
	int division = p/q;
	System.out.println("Final Result is " +division);
}

	public static void main(String[] args) {
	
		Scanner s = new Scanner(System.in);
		assignment5 obj = new assignment5();

	System.out.println("Please Enter the value of X1");
	int X1 = s.nextInt();
	System.out.println("value of X1 = " + X1);
	
	System.out.println("Please Enter the value of X2");
	int X2 = s.nextInt();
	System.out.println("value of X2 = " + X2);
	int Y1= obj.add(X1,X2);
	
	System.out.println("Please Enter the value of X3");
	int X3 = s.nextInt();
	System.out.println("value of X3 = " + X3);

	int Y2= obj.sub(Y1, X3);
	
	System.out.println("Please Enter the value of X4");
	int X4 = s.nextInt();
	System.out.println("value of X4 = " + X4);
	
	int Y3= obj.add(Y2,X4);
	
	System.out.println("Please Enter the value of X5");
	int X5 = s.nextInt();
	System.out.println("value of X5 = " + X5);
	
	int Y4 = obj.mult(Y3, X5);
	
	System.out.println("Please Enter the value of X6");
	int X6 = s.nextInt();
	System.out.println("value of X6 = " + X6);
	
	obj.div(Y4, X6);
}}
