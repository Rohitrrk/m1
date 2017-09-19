import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetExample 
{
	
        public static void main(String[] args) 
        {
        	
		LinkedHashSet<String> hs=new LinkedHashSet<String> ();
		hs.add("One");
		hs.add("Four");
		hs.add("Three");
		hs.add("Four");
		hs.add(null);
		System.out.println(hs);
		
		TreeSet<String> ts=new TreeSet<String> ();
		ts.add("One");
		ts.add("Four");
		ts.add("Three");
		ts.add("Four");
		//ts.add(null);
		System.out.println(ts);

       }
        
}
