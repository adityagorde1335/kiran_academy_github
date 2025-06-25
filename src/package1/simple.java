package package1;
//import java.util.*;
public class simple {
	public static void main (String args[])
	{
		int a=4, b=8;
		System.out.println("Addition is:"+ (a+b));
		
		Student s1 = new Student();
		
		System.out.println(s1.id);
		System.out.println(s1.name);
		System.out.println(s1.degree);
		System.out.println(s1.marks);
		
		s1.game();
		s1.study();
		s1.eat();
		s1.accept(101,"Pavan","BE",88.4f);
		
		s1.display();
	}

}
