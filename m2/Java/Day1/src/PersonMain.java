import java.util.Scanner;
public class PersonMain {
	
	public static void main(String[] args)
	{
		Person p=new Person();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("FirstName");
		String firstName=sc.next();
		p.setFirstName(firstName);
		
		
		System.out.println("LastName");
		String lastName=sc.next();
		p.setLastName(lastName);
		
	
		System.out.println("Gender");
		char gender=sc.next().charAt(0);
		p.setGender(gender);
		
		
		System.out.println("First Name is: "+p.getFirstName()+""+"\n"+"Last Name: "+p.getLastName()+"\n"+"Gender :"+p.getGender());
		sc.close();
	}
	

	

	
	
	
}