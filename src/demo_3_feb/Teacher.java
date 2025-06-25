package demo_3_feb;

public class Teacher extends Person
{
    String Subject;
    double salary;
      
    public Teacher() 
	{
		// TODO Auto-generated constructor stub
	}

	public Teacher(int id, String name,int age,String subject, double salary) {
		super(id,name,age);
		Subject = subject;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Teacher [id=" + id + ", name=" + name + ", age=" + age + ", Subject=" + Subject + ", salary=" + salary
				+ "]";
	}
    
}
