package studentManagementSystem;

public class teacher extends person
{
	String Subject;
    double salary;
      
    public teacher() 
	{
		// TODO Auto-generated constructor stub
	}

	public teacher(String name,int id ,int age,String subject, double salary) 
	{
		super(name,id,age);
		Subject = subject;
		this.salary = salary;
	}
	
	@Override
	public void display()
	{
		super.display();
		System.out.println( " Subject="+Subject+" Salary="+salary);
	}
}
