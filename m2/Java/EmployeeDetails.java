import java.util.Scanner;
public class EmployeeDetails {

	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter EMP ID");
	int empid=sc.nextInt();
	System.out.println("Enter EMP name");
	String ename=sc.next();
	System.out.println("Enter EMP Salary");
	float sal=sc.nextFloat();
	System.out.println("Enter Grade");
	char grade=sc.next().charAt(0);
	System.out.println("Enter Phone number");
	long phone=sc.nextLong();
	System.out.println("The employee details are"+
	""+empid+""+"\n"+ename+""+"\n"+sal+""+"\n"+grade+""+"\n"+phone);
	sc.close();
	}
}
