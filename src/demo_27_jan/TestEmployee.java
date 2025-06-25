package demo_27_jan;

public class TestEmployee 
{
	public static void main(String args[])
	{
		Employee e1 = new Employee(101,"Sagar",35000,"Pune");
	    //e1.accept(101,"Sagar",35000,"Pune");
	    e1.display();
	    
	    System.out.println("------------------------------------------------------------");
	    
	    Employee e2 = new Employee();
	    e2.emp_id=102;
	    e2.emp_name="Laxman";
	    e2.emp_salary=55000;
	    e2.emp_address="Latur-Nilanga";
	    e2.display();
	}
    
}
