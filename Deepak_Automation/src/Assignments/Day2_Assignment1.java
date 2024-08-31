package Assignments;

public class Day2_Assignment1 
{
		/*
		  Problem:
		  (((((10+2)*2)-2)*2)/2)
		 */
	
	public int sum(int a, int b)
	{
		int c;
		c = a+b;
		System.out.println("the result1 is" +c);
		return c;
		
	}
	
	public int multi(int a1, int b1)
	{
		int c1;
		c1 = a1*b1;
		System.out.println("the result2 is" +c1);
		return c1;
		
	}
	
	public int sub(int a2, int b2)
	{
		int c2;
		c2 = a2-b2;
		System.out.println("the result3 is" +c2);
		return c2;
		
	}
	
	public int multi1(int a4, int b4)
	{
		int c4;
		c4 = a4*b4;
		System.out.println("the result3 is" +c4);
		return c4;
		
	}
	
	public void div(int a3, int b3)
	{
		int c3;
		c3 = a3/b3;
		System.out.println("the final result is" +c3);
		
		
	}
	public static void main(String[] args)
	{
		Day2_Assignment1 L = new Day2_Assignment1();
		int sumresult1 =L.sum(10, 2);
		int multiresult = L.multi(sumresult1, 2);
		int Subresult = L.sub(multiresult, 2);
		int Multiresult1 =L.multi1(Subresult, 2);
		L.div(Multiresult1, 2);

	}

}
