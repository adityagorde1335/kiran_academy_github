package demo_27_jan;

public class Employee 
{
    int emp_id;
    String emp_name;
    int emp_salary;
    String emp_address;
    
    //accept
    Employee()
    {
    	//no argument constructor
    }
    
    Employee(int emp_id,String emp_name,int emp_salary,String emp_address)
    {
    	this.emp_id = emp_id;
    	this.emp_name = emp_name;
    	this.emp_salary = emp_salary;
    	this.emp_address = emp_address;
    }
    
    void display()
    {
    	System.out.println("emp_id:"+emp_id + "  emp_name:"+emp_name+"  emp_salary:"+emp_salary+"  emp_address:"+emp_address);
    }
}
