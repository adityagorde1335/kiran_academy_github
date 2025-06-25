package demo_10_feb_abstraction;

public class Square extends Shape
{
	public Square()
    {
    	
    }
    
    public Square(int side)
    {
    	super.side = side;
    	
    }
    
    @Override
    void calArea() 
    {
    	double Area = side * side;
    	System.out.println("Area of square is = "+Area);
    }
    
    @Override
    public void drawShape() 
	{
    	System.out.println("Square is drawed....");
	}
	
    @Override
	public void fillShape()
	{
		System.out.println("Suqare is filled....");
	}
	
    @Override
	public void colorShape()
	{
		System.out.println("Square is colored...");
	}
	
    @Override
	public void calVolume()
	{
		System.out.println("Volume of Square....");
	}

}
