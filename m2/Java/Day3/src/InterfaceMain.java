
interface Bikes
{
	int a=10;
	void display();
}
interface Cars
{
	void show();
	static void disp()
	{
		System.out.println("Static void");
	}
	default void disp1()
	{
		System.out.println("Default void");
	}
}

interface Auto
{
	void call();
}

class Transport implements Bikes, Cars, Auto
{


	public void call()
	{
		System.out.println("Bus Interface");
		
	}

	public void show() 
	{
		System.out.println("Car Interface");
		
	}

	public void display()
	{
		System.out.println("Auto interface");
		
	}
	
}

public class InterfaceMain {

	 public static void main(String[] args)
	 {
		 
		 Transport v=new  Transport();
		v.display();
		v.show();
		v.call();
		Cars.disp();
		v.disp1();
	 }

}
