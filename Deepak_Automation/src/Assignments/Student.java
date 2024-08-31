package Assignments;

public class Student {

	int rollno;
	int age;
	public void display1()
	{
		System.out.println("Welcome to all of you");
	}
	public void display2()
	{
		System.out.println("Automation is very easy");
	}
	public static void main(String[] args)
	{
		Student d = new Student();
		d.age = 25;
		d.rollno = 12;
		System.out.println(d.age);
		System.out.println(d.rollno);
		d.display1();
		d.display2();

	}

}
