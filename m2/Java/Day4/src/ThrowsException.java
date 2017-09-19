import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class ThrowsException 
{
	public static void main(String[] args) throws ParseException
	{
		String s="1-12-2000";
		Date d= new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		Date d1=sdf.parse(s);
		System.out.println(d1);
		
		
//      Date d1;
//	    try
//		{
//			d1=sdf.parse(s);
//		}
//		catch(ParseException e)
//		{
//		   System.out.println("Invalid date");
//		}
		
		
		
	}

}
