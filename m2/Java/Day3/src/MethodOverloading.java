
class Calculator
{
	int add(int a, int b)
	{
		return a+b;
	}
	
	int add(int a, int b, int c)
	{
		return a+b+c;
	}
	float add(float a, float b, float c)
	{
		return (a+b+c);
		
	}
	float add(float a, float b)
	{
		return a+b;
	}
}


public class MethodOverloading {
	public static void main(String[] args) 
	{
	    Calculator c=new Calculator();
	    System.out.println(c.add(20, 25));
	    System.out.println(c.add(20, 25, 56));
		
	}

}
