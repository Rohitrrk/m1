
public class StringHandling {

	public static void main(String[] args)
	{
		String s1="Rohit Rajendra";
		String s2="India";
		
		String s3="Hello";
		String s4="hello";
		
		String s5=new String("Hello");
		String s6=new String("hello");
				
		System.out.println(s3.equalsIgnoreCase(s4));
		
		System.out.println(s1.equals(s2));
		
		
		System.out.println(s1.substring(1,9));
		
		StringBuffer sb=new StringBuffer();
		sb.append(s1.substring(6));
		sb.append(",");
		sb.append(s1.substring(0,1));
		System.out.println(sb);
		
		
		
		
	}
}
