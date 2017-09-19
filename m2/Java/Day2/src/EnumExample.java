
enum directions
{
	NORTH,SOUTH,WEST,EAST;
}
public class EnumExample
{

    public static void main(String[] args) 
    {
		System.out.println(directions.WEST);
		
		for(directions s:directions.values())
			System.out.println(s);
			
			
	}
}
