package studentManagementSystem;

public class staff extends person
{
	String role;
    double salary;
    
    
	public staff()
	{
		// TODO Auto-generated constructor stub
	}


	public staff(String name,int id,int age, String role, double salary) 
	{
		super(name,id,age);
		this.role = role;
		this.salary = salary;
	}
	
	@Override
	public void display()
	{
		super.display();
		System.out.println( " role="+role+" salary="+salary);
	}
}
