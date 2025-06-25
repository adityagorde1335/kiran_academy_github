package studentManagementSystem;

public class student extends person 
{
    private String course;
    private float per;
    
	public student() 
	{
		super();
		// TODO Auto-generated constructor stub
	}

	public student(String name, int id, int age, String course, float per) 
	{
		super(name, id, age);
		this.course = course;
		this.per = per;
	}
	
	@Override
	public void display()
	{
		super.display();
		System.out.println( " Course="+course+" per="+per);
	}
    
}
