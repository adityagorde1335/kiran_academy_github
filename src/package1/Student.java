package package1;

public class Student {

//	int id=12;
//	String name = "raj";
//	String degree = "BE";
//	float marks = 77.7f;
//	
	int id;
	String name;
	String degree;
	float marks;
	
	
	float marks1 = 44.4f;
	
	public void game() {
		System.out.println("student playing game..");
		
	}


	public void study() {
		
		System.out.println("student done his study..");
	}


	public void eat() {
		
		System.out.println("Eating..");
	}


	public void accept(int id,String name,String degree,float marks) {
		
		this.id = id;
		this.name= name;
		this.degree=degree;
		this.marks= marks;
		
	}
	public void display()
	{
		System.out.println("id:"+ id);
		System.out.println("name:"+ name);
		System.out.println("degree:"+ degree);
		System.out.println("marks:"+ marks);
	}
}
