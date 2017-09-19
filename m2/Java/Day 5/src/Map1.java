import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
public class Map1 {

	public static void main(String[] args) {
		
	
	HashMap<Integer,String> hm =new HashMap<Integer,String>();
	hm.put(102, "Rohit");
	hm.put(101, "Akshata");
	hm.put(103, "Angel");
	hm.put(105, "Abhi");
	hm.put(104, "Sweety");
    System.out.println(hm);
	for(Map.Entry out:hm.entrySet())
	{
		Integer key=(Integer) out.getKey();
		String value=(String) out.getValue();
		System.out.println(key);
		System.out.println(value);
	}
	
	Iterator<Integer> itr=hm.keySet().iterator();
	while(itr.hasNext())
	{
		Integer key=itr.next();
		String value=hm.get(key);
		System.out.println(key);
		System.out.println(value);
	}
	
	}
}