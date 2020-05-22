package package1;

public class assigment3 {
	public int div(int a,int b) {
		int division = a/b;
		System.out.println("Result is"+ division);
		return division;
	
	}
public int sub(int x, int y) {
	int subtract = x-y;
	System.out.println("Result is "+ subtract);
	return subtract;
}
public int add(int p,int q)
{
	int addition= p+q;
	System.out.println("Result is"+ addition);
	return addition;
	}

public void mult(int m,int n)
{
	int multiply=m*n;
	System.out.println("Result is"+ multiply);
	
}
public static void main(String[]args)
{
	assigment3 k= new assigment3();
	int result_div= k.div(10, 2);
	int result_sub= k.sub(result_div, 2);
	int result_add= k.add(result_sub, 2);
	int result_add1= k.add(result_add, 2);
	k.mult(result_add1, 2);	
}
}
