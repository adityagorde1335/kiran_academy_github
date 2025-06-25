package demo_27_jan;

public class TestStudent 
{
	public static void main(String args[])
	{
		Student1 s1 = new Student1(101,"Pavan", 87.5f);
		
		//s1.accept(101,"Pavan", 87.5f);
		s1.display();
		
		System.out.println("-------------------------------");
		Student1 s2 = new Student1(102,"Prathmesh", 88.5f);
		s2.display();
		
		Student1 s3 = new Student1();
		s3.id=103;
		s3.name="Raj";
		s3.per=97.3f;
		s3.display();
	}
}
