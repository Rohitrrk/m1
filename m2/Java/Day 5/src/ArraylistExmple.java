import java.util.ArrayList;
import java.util.Collections;


public class ArraylistExmple
{

public static void main(String[] args) {
		
		ArrayList<Integer> a1=new ArrayList <Integer> ();
		a1.add(5);
		a1.add(3);
		a1.add(2);
		a1.add(6);
		a1.add(9);
		
		
		ArrayList<Integer> a2=new ArrayList <Integer> ();
		a2.add(1);
		a2.add(4);
		a2.add(7);
		a2.add(8);
		a2.add(6);
		
		a1.addAll(a2);
		Collections.sort(a1);
		System.out.println(a1);
	
		ArrayList<Integer> a3=new ArrayList <Integer> ();
		a3.add(a1.get(2));
		a3.add(a1.get(6));
		a3.add(a1.get(8));
		
		for(int out:a3)
		{
			System.out.println(out);
		}
		
     }
}
