
public class StudentMain {

	public static void main(String[] args) {
		
		Student s1=new Student(100,"Akshata");
		Student s2=new Student(101,"Rohit");
		
		Student s3=new Student(100,"Akshata");
		Student s4=new Student(100,"Akshata");
		
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println("\n");
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println("\n");
		
		boolean b=s3.equals(s4);
		System.out.println(b);
			
		
	}
}
