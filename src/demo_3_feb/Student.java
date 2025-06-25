package demo_3_feb;

public class Student extends Person
{
    String course;
    float per;
    
	public Student() 
	{
		// TODO Auto-generated constructor stub
	}

	public Student(int id,String name, int age, String course, float per) 
	{
		super(id,name,age);
		this.course = course;
		this.per = per;
	}

	@Override
	public String toString() 
	{
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", course=" + course + ", per=" + per + "]";
	}
	
}
