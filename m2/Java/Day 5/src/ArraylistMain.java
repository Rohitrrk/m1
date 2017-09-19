import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;




public class ArraylistMain
{
	public static void main(String[] args) {
		
		ArrayList<Integer> a1=new ArrayList <Integer> ();
		a1.add(10);
		a1.add(9);
		a1.add(18);
		a1.add(2);
		Collections.sort(a1);
		System.out.println(a1);
		
		ArrayList<Integer> a2=new ArrayList <Integer> ();
		a2.add(50);
		a2.add(9);
		a2.add(25);
		a2.add(98);
		Collections.sort(a2);
		System.out.println(a2);
		
		
		a1.addAll(a2);
		Collections.sort(a1);
		System.out.println(a1);
		
		/*for(Integer out:a1)
		{
			System.out.println(out);
		}*/
		
		Iterator itr=a1.iterator();
		while(itr.hasNext())
		{
			Integer a=(Integer) itr.next();
			System.out.println(a);
		}
	    a1.retainAll(a2);
	    System.out.println(a1);
	    
        a1.removeAll(a2);
        System.out.println(a1);
		
		
	}
	                                                                                                                                                                                                                                           

}
