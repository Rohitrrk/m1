
public class ThrowClass 
{
	public static void checkAge(int age)
	{
		if(age<18)
		{
			throw new ArithmeticException("Invalid age");
		}
		else
		{
			System.out.println("Valid age");
		}
	}
	
	public static void main(String[] args) 
	{
	try
	{
	     ThrowClass.checkAge(10);
	}
	catch(Exception e)
	{
		System.out.println("Invalid age");
	}
}
}