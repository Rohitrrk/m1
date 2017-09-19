import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;


public class DiffBtwnDates
{
    public static void main(String[] args) 
    {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter Date1");
		String date1 = sc.next();
		System.out.println("Enter Date2");
		String date2 = sc.next();
		
		DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate d1=LocalDate.parse(date1, f);
		LocalDate d2=LocalDate.parse(date2, f);
		
		Period period = d1.until (d2);
		System.out.println("Number of Days:"+period.get(ChronoUnit.DAYS));
		System.out.println("Number of Month:"+period.get(ChronoUnit.MONTHS));
		System.out.println("Number of Year:"+period.get(ChronoUnit.YEARS));	
	}
}
