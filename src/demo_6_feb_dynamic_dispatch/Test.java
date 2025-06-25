package demo_6_feb_dynamic_dispatch;

public class Test 
{
	public static void main(String args[])
	{
		
		ShapeOperation obj = new ShapeOperation();
		
		Circle c1 = new Circle(4);
		obj.triggerAllFunctionality(c1);
//		c1.calArea();
//		c1.drawShape();
//		c1.fillShape();
//		c1.colorShape();
//		c1.calVolume();
		
		Rectangle r1 = new Rectangle(4,5);
		obj.triggerAllFunctionality(r1);
//		r1.calArea();
//		r1.drawShape();
//		r1.fillShape();
//		r1.colorShape();
//		r1.calVolume();
		
		Square s1 = new Square(8);
		obj.triggerAllFunctionality(s1);
//		s1.calArea();
//		s1.drawShape();
//		s1.fillShape();
//		s1.colorShape();
//		s1.calVolume();
	}
	
	

}
