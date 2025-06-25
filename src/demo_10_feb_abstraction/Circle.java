package demo_10_feb_abstraction;

public class Circle extends Shape
{
     Circle()
     {
    	 
     }
     
     Circle(int r)
     {
    	 super.r = r;
     }
     
     @Override
     void calArea()
     {
    	 double area = 3.14 * r *r ;
    	 System.out.println("Area of circle ="+area);
     }
     
     @Override
     void drawShape()
     {
    	 System.out.println("Circle is drawed....");
     }
     
     @Override
     void fillShape()
     {
    	 System.out.println("Circle is filled....");
     }
     
     @Override
     void colorShape()
     {
    	 System.out.println("Circle is colored...");
     }

	@Override
	void calVolume() 
	{
		System.out.println("Volume of circle....");
	}
}
