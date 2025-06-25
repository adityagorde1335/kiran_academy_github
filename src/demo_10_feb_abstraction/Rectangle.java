package demo_10_feb_abstraction;

public class Rectangle extends Shape
{
	public Rectangle()
    {
    	
    }
    
    public Rectangle(int length,int breadth)
    {
    	super.length = length;
    	super.breadth = breadth;
    }
    
    void calArea() 
    {
    	double Area = length * breadth;
    	System.out.println("Area of rectangle is = "+Area);
    }
    
    public void drawShape() 
	{
    	System.out.println("Rectangle is drawed....");
	}
	
	public void fillShape()
	{
		System.out.println("Rectangle is filled....");
	}
	
	public void colorShape()
	{
		System.out.println("Rectangle is colored...");
	}
	
	public void calVolume()
	{
		System.out.println("Volume of Rectangle....");
	}
}
