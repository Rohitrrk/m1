import java.util.Arrays;
import java.util.Scanner;


public class ArrayMain 
{

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter elements in Array:");
		for(int i=0; i < a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		
		Arrays.sort(a);
		System.out.println("After sorting");
		for(int i=0; i < a.length; i++)
		{
			System.out.println(a[i]);
		}
		
	    int min=a[0];
	    int max=a[a.length-1];
	    System.out.println("Middle element"+ " " + a[a.length/2]);
	    System.out.println(min + max);
		
	    
	    int a1[]={10,25,4,8};
		Arrays.sort(a1);
		                                                //Printing using for each//
		for(int out:a1)
		{
			System.out.println(out);
		}
	    
	}
}
