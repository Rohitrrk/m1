import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class DateAndTime 
{

	public static void main(String[] args) 
	{
		
		LocalDate d=LocalDate.now();
		LocalDate d1=LocalDate.of(1995, 11, 03);
		
		System.out.println(d);
		System.out.println(d1);
		System. out.println(d.getMonth());
		System.out.println(d.getDayOfYear());
		System.out.println(d.getYear());
		System.out.println(d.plusDays(91));
		System.out.println(d.getMonthValue());
		
		String s="2017/22/10";
		DateTimeFormatter df=DateTimeFormatter.ofPattern("yyyy/dd/MM");
		LocalDate dd=LocalDate.parse(s, df);
		System.out.println(dd);
	}
}
