class Vehicle 
 {
	String color="blue";
	void brake()
	{
		System.out.println("Super class method");
	}
 }

class Car extends  Vehicle
{
	String color="red";
	
	
    void gear()
    {
    	System.out.println(color);
    	System.out.println(super.color);
    	System.out.println("Sub class method");
    }
    
}

class Bike
{
	String color="pink";
	void acc()
	{
		System.out.println("Rohit");
	}
}
public class InheritanceExample {
	
	public static void main(String[] args) {
		
		{
			Car c=new Car();
			Bike b=new Bike();
			Vehicle v=new Vehicle();
			c.brake();
			c.gear();
			b.acc();
			System.out.println(c instanceof Vehicle);
			System.out.println(v instanceof Car);
		

	}

	}}
