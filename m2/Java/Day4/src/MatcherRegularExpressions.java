import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class MatcherRegularExpressions 
{

	public static void main(String[] args) 
	{
		
		Pattern p=Pattern.compile("[0-9]{1}[a-zA-Z]{3,}");
		Matcher m=p.matcher("1abcABC");
		boolean b=m.matches();
		System.out.println(b);
	}
}
