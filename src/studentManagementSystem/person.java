package studentManagementSystem;

public class person 
{
    protected String name;
    protected int id;
    protected int age;
    
    
	public person() 
	{
		// TODO Auto-generated constructor stub
	}


	public person(String name, int id, int age)
	{
		this.name = name;
		this.id = id;
		this.age = age;
	}


	public void display() 
	{
		 System.out.print( " name=" + name + ", id=" + id + ", age=" + age );
	}
	
	
    
	
    
}
