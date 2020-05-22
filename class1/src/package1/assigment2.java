package package1;

public class assigment2 {
	
	public int add(int a,int b) {
		int c = a+b;
		System.out.println("Result is "+c);
		return c;
	}
public int sub(int x,int y) 
{
	if(x>y) {
	int z = x-y;
	
	System.out.println("Result is"+z);
	return z;
	}
	else
	{
		int z= y-x;
		System.out.println("Result is"+z);
	return z;
	}
}
	public int mult(int a1,int b1 )
	{
	int c1 = a1*b1;
	System.out.println("Result is"+c1);
	return c1;
	}
	public void div(int x1, int y1)
	{
		if (x1>y1)
		{
			int z1= x1/y1;
			System.out.println("Result is"+z1);
		}
		else
			{
				int z1= y1/x1;
				System.out.println("Result is"+z1);
			}
	
}

public static void main(String[]args)
{
assigment2 obj = new assigment2();
int sumresult= obj.add(10,2);
int sub_result= obj.sub(sumresult, 2);
int add_result= obj.add(sub_result, 2);
int multresult= obj.mult(add_result, 2);
obj.div(multresult,2);
}
}

