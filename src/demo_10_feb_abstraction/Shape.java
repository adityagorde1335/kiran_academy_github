package demo_10_feb_abstraction;

public abstract class Shape 
{
	int r,length,breadth,side;

	Shape() 
	{
		System.out.println();
		System.out.println("$$$$Welcome to my Shape Family");
	}

	
	void welcome()
	{
		System.out.println("****Welcome");
	}
	
	abstract void calArea();
	
	
	abstract void drawShape(); 
	
	
	abstract void fillShape();
	
	
	abstract void colorShape();
	
	
	abstract void calVolume();
	
}
