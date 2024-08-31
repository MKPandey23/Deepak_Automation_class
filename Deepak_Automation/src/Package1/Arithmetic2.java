package Package1;

public class Arithmetic2   //Pillar1 -creation of class
{
  /*Here we will be now going to solve this arithmetic equation
	((((10+2)+2)-2)*2)/2)
	How many methods we have to create here??
	Four method  --Sum,Sub,Multi & Division. */

	public int sum(int a, int b)
	{
		int c;
		c=a+b;
		System.out.println("The result is" +c);
		return c;                               //using return keyword because mandatory for non void(want result)
				
	}
	
	public int sub(int a1, int b1)
	{
		int c1;
		c1=a1-b1;
		System.out.println("The result is"  +c1);
		return c1;
				
	}
	
	public int multi(int a2, int b2)
	{
		int c2;
		c2=a2*b2;
		System.out.println("The result is"  +c2);
		return c2;
				
	}
	
	public void div(int a3, int b3)   //using void as we don't want the result for further use
	{
		int Result;
		Result=a3/b3;
		System.out.println("The final result is" +Result);
		
	}
	
	public static void main(String[] args)    //Pillar no 2 --creation of main method
	{
		Arithmetic2 R = new Arithmetic2();   //Pillar no 3 -- object creation
		int sumvalue =R.sum(10, 2);
		int sumvalue2= R.sum(sumvalue,2);   //here int sumvalue2 means storing result in Int value
		int subresult =R.sub(sumvalue2, 2);
		int multiresult =R.multi(subresult, 2);
		R.div(multiresult, 2);
	}
	
	
	
	
}

