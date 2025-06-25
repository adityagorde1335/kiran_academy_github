package demo_10_feb_abstraction;

public class TestShape 
{
    public static void main(String args[])
    {
    	Circle c1 = new Circle(4);
    	c1.calArea();
    	c1.fillShape();
    	c1.colorShape();
    	c1.drawShape();
    	c1.calVolume();
    	
    	Square s1 = new Square();
    	s1.calArea();
    	s1.fillShape();
    	s1.colorShape();
    	s1.drawShape();
    	s1.calVolume();
    	
    	Rectangle r1 = new Rectangle();
    	r1.calArea();
    	r1.fillShape();
    	r1.colorShape();
    	r1.drawShape();
    	r1.calVolume();
 
    }
}
