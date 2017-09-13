public class Client {
	 int clientId;
	String clientName;
	String clientAddress;
	
	Client(int id, String n, String a)          //Parameterized Constructor..
	{
		clientId=id;
		clientName=n;
		clientAddress=a;
	}
	
	Client()
	{
		System.out.println("Rohit");
	}
	
	void display()
	{
		System.out.println("Client ID "+clientId+"  Client Name  "+clientName+"  Client Address "+clientAddress);
	
	}
	
	public static void main(String[] args)
	{
		Client c1=new Client();
		Client c2=new Client(101,"Akshata","Pune");
		Client c3=new Client(102,"Rohit","Mumbai");
		c1.display();
		c2.display();
		c3.display();
		
	}
}