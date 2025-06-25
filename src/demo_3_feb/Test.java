package demo_3_feb;

public class Test 
{
    public static void main(String args[])
    {
    	Student s1 = new Student(101,"Raj",17,"BE",76.5f);
    	System.out.println(s1);
    	
    	System.out.println();
    	System.out.println("******************************************************************");
    	System.out.println();
    	
    	
    	Staff st1 = new Staff(102,"Ram",34,"Cleark",50000);
    	System.out.println(st1);
    	
    	System.out.println();
    	System.out.println("******************************************************************");
    	System.out.println();
    	
    	Teacher t1 = new Teacher(103,"Shyam",30,"Science",60000);
    	System.out.println(t1);
    }
}
