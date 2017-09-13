import java.util.Scanner;

public class PersonDetails {
	

	public static void main(String[] args)
	{
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter First name:");
	    String fname = sc.next();
	    System.out.println("Enter Last name:");
	    String lname = sc.next();
	    System.out.println("Enter Gender:");
		char gender=sc.next().charAt(0);
		System.out.println("Enter Age");
		int age=sc.nextInt();
		System.out.println("Enter Weight:");
		float wght=sc.nextFloat();
		System.out.println("Person Details:"+"\n"+"_____________"+"\n"+"\n"+"First Name: "+fname+"\n"+"Last Name: "+lname+"\n"+"Gender: "
				          +gender+"\n"+"Age: "+age+"\n"+"Weight: "+wght);
		                   
	    sc.close();
}
}
