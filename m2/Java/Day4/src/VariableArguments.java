
public class VariableArguments
{

	public static void fun(int a,int b,String ...c)
	{
		for(String out:c)
		{
			System.out.println(out);
		}
		
	}
	public static void main(String[] args)
	{
		fun(10,20,"5","Rohit","xyz");
	}
}
