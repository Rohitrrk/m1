abstract class Shape
{
	abstract void display();
	abstract void show();
	
	void draw()
	{
		System.out.println("Draw Rectangle");
	}
}

class Rectangle extends Shape
{
    void display() 
	{
    	System.out.println("Display Rectangle");
		
	}
	void show() 
	{

		System.out.println("Show Rectangle");
	}

	
}
	

public class Abstract
{
    public static void main(String[] args) 
    {
		Shape s=new Rectangle();
		s.display();
		s.draw();
		s.show();
		
	}
}
