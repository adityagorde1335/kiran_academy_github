package demo_3_feb;

public class Staff extends Person 
{
    String role;
    double salary;
    
    
	public Staff()
	{
		// TODO Auto-generated constructor stub
	}


	public Staff(int id,String name,int age, String role, double salary) {
		super(id,name,age);
		this.role = role;
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "Staff [id=" + id + ", name=" + name + ", age=" + age + ", role=" + role + ", salary=" + salary + "]";
	}

}
