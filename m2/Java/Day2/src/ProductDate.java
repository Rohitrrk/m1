import java.time.LocalDate;

import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ProductDate {

	
	public static void main(String[] args) {
		 
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the date for purchase in MM/yyyy\n");
		String text1=sc.next();
	
		System.out.println("Enter the date for warranty in MM\n");
		String text2=sc.next();
		
		
		int months=Integer.parseInt(text2);
		DateTimeFormatter df=DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate start=LocalDate.parse(text1,df);
		System.out.println("\nYour product will expire on:");
		
		System.out.println(start.plusMonths(months));
	
	sc.close();
	}

	
}