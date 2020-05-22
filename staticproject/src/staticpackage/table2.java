package staticpackage;

public class table2 {
	
	int sum;
	int num;
	public void method1(int num) {
		
		for(int i=1;i<=10;i++)
		{
			
			sum = num * i;
			System.out.println("value is " +sum);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		table2 obj = new table2();
		obj.method1(5);
		

	}

}
