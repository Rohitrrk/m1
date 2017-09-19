
public class ExceptionHandling2
{
	
	public static void main(String[] args) 
	{
	
		try
		{
			int a=10/0;
			System.out.println(a);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Invalid input");
		}
		
		try 
		{
			int b[]=new int[5];
			b[6]=90;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			//b.printStackTrace();
			System.out.println("Array index out of bound");
		}
		finally 
		{
			//System.exit(0);
			System.out.println("Always Exceute");
		}
	}
}


