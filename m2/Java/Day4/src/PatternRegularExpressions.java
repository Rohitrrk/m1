import java.util.regex.Pattern;


public class PatternRegularExpressions 
{
 
	public static void main(String[] args) 
    {
	    String s="capgemini";
	    String pattern ="[a-z]{2,}";
	    boolean b = Pattern.matches(pattern, s);
	    System.out.println(b);
	    
	    String phone ="8268263292";
	    String reg ="[789]{1}[0-9]{9}";
	    boolean b1 = Pattern.matches(reg , phone);
	    System.out.println(b1);
	    
	    
	    String digit="[0-9]";
	    String digitinput="9abc";
	    boolean b2= Pattern.matches(digit,digitinput);
	    System.out.println(b2);
	    
	    
	    String cap="CapGemini";
	    String regxCap="[A-Z]{1}[a-z]{2,}";
	    boolean b3 = Pattern.matches(regxCap, cap);
	    System.out.println(b3);
	    
		
    }



}
