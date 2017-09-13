public class Employee
{
	int empNo;
	String empName;
	static String compname="CapG";
	
	Employee(int e,String n)
	{
		empNo=e;
		empName=n;
		
	}
		
	
	void display()
	{
		System.out.println(empNo+"   "+empName+" "+compname);
	
	}
	public static void main(String[] args)
	{
		Employee e1=new Employee(111,"Rohit");
		Employee e2=new Employee(121,"Akshata");
		e1.display();
		e2.display();
		
	}
}
