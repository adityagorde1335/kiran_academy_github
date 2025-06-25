package demo_6_feb_dynamic_dispatch;

public class Square extends Shape
{
	public Square()
    {
    	
    }
    
    public Square(int side)
    {
    	super.side = side;
    	
    }
    
    void calArea() 
    {
    	double Area = side * side;
    	System.out.println("Area of square is = "+Area);
    }
    
    public void drawShape() 
	{
    	System.out.println("Square is drawed....");
	}
	
	public void fillShape()
	{
		System.out.println("Suqare is filled....");
	}
	
	public void colorShape()
	{
		System.out.println("Square is colored...");
	}
	
	public void calVolume()
	{
		System.out.println("Volume of Square....");
	}
}
