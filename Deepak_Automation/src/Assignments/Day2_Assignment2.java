package Assignments;

public class Day2_Assignment2
{
 /*
  * (((((10/2)-2)*2)-2)+2)
  */
	
	public int div(int a, int b)
	{
		int c;
		c=a/b;
		System.out.println("the result of div is" +c);
		return c;
	}
	public int sub(int a1, int b1)
	{
		int c1;
		c1=a1-b1;
		System.out.println("the result of sub is" +c1);
		return c1;
	}
	public int multi(int a2, int b2)
	{
		int c2;
		c2=a2*b2;
		System.out.println("the result of multi is" +c2);
		return c2;
	}
	public int sub1(int a3, int b3)
	{
		int c3;
		c3=a3-b3;
		System.out.println("the result of this sub1 is" +c3);
		return c3;
	}
	public void sum(int a4, int b4)
	{
		int c4;
		c4=a4+b4;
		System.out.println("the Final result is" +c4);
		
	}
	
	public static void main(String[] args)
	{
		Day2_Assignment2 D = new Day2_Assignment2();
		int divresult= D.div(10, 2);
		int subresult =D.sub(divresult, 2);
		int multiresult =D.multi(subresult, 2);
		int subresult1=D.sub1(multiresult, 2);
		D.sum(subresult1, 2);
		

	}

}
