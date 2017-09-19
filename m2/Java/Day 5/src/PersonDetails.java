import java.util.Scanner;


public class PersonDetails 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of Products");
		int size =sc.nextInt();
		String a[]=new String[size];
		
		
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter Product's name"+(i+1));
			a[i]=sc.next();
		}
		for(int i=0;i<size;i++)
		{
			System.out.println(a[i]);
		}
		
	}
}
