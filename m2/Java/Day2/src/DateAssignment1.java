 import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;



public class DateAssignment1 
{
	private static Scanner sc;

	public static void main(String[] args) 
	{
		sc = new Scanner(System.in);
		System.out.println("Enter Date");
		String date = sc.next();
		
		DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate ld=LocalDate.parse(date, f);
		LocalDate d1=LocalDate.now();
		Period period = ld.until(d1);
		
		System.out.println("Number of Days:"+period.get(ChronoUnit.DAYS));
		System.out.println("Number of Month:"+period.get(ChronoUnit.MONTHS));
		System.out.println("Number of Year:"+period.get(ChronoUnit.YEARS));	
	}

}
