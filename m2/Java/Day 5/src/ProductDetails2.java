import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class ProductDetails2 
{
	public static void main(String[] args)
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of Products");
		int size =sc.nextInt();
		ArrayList<String> a=new ArrayList<String>();
		
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter the name of product no."+(i+1));
			String s=sc.next();
			a.add(s);
			
		}
		System.out.println(a);
		
		Collections.sort(a);
		System.out.println(a);
	}

}
