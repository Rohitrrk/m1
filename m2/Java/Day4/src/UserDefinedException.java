class AgeInvalidException
{
	
}
public class UserDefinedException 
{
	static void ageCheck(int age)
	{
		
	}
	public static void main(String[] args)
	{
	 	try
	 	{
	 		ageCheck(-2);
	 	}
	 	catch(AgeInvalidException e)
	 	{
            System.out.println(e);
	 	}
		
	}

}
