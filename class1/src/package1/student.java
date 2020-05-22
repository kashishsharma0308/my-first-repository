package package1;

public class student {
int age;
int rollno;
public void display1()
{
	System.out.println("Welcome All");
}
public void display2()
{
	System.out.println("Automation is very easy");
}
public static void main(String[]args) {
	student a=new student();
	a.age=12;
	a.rollno=3;
	System.out.println(a.age);
	System.out.println(a.rollno);
	a.display1();
	a.display2();
}}
