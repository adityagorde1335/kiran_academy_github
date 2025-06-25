package demo_6_feb_dynamic_dispatch;

public class Circle extends Shape
{
    public Circle()
    {
    	
    }
    
    public Circle(int r)
    {
    	super.r = r;
    }
    @Override
    void calArea() 
    {
    	double Area = 3.14 * r * r;
    	System.out.println("Area of circle is = "+Area);
    }
    
    public void drawShape() 
	{
    	System.out.println("Circle is drawed....");
	}
	
	public void fillShape()
	{
		System.out.println("Circle is filled....");
	}
	
	public void colorShape()
	{
		System.out.println("Circle is colored...");
	}
	
	public void calVolume()
	{
		System.out.println("Volume of circle....");
	}
}
