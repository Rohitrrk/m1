import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

class AcceptDate
{
	 void calculateDate(int d1, int m1,int y1,int d2, int m2,int y2)
	 {
		 LocalDate date1 = LocalDate.of(y1, m1, d1);
		 LocalDate date2 = LocalDate.of(y2, m2, d2);
		 
		 System.out.println("Difference in days"+(date1.getDayOfMonth()- date));
	 }
}
public class DateAssignment {
	
	public static void main(String[] args) throws NumberFormatException, IOException
	{
		BufferedReader read=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter first Date");
		
		int day1 = Integer.parseInt(read.readLine());
		int month1 = Integer.parseInt(read.readLine());
		int year1 = Integer.parseInt(read.readLine());
		
	    System.out.println("Enter Second Date");
		
		int day2 = Integer.parseInt(read.readLine());
		int month2 = Integer.parseInt(read.readLine());
		int year2 = Integer.parseInt(read.readLine());
		
		AcceptDate ad=new AcceptDate();
		ad.calculateDate(day1, month1, year2,day2, month2, year2);
  
	}
}
