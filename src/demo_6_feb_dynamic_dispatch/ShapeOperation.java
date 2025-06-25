package demo_6_feb_dynamic_dispatch;

public class ShapeOperation 
{
      void triggerAllFunctionality(Shape obj)
      {
    	 obj.calArea();
  		 obj.drawShape();
  		 obj.fillShape();
  		 obj.colorShape();
  		 obj.calVolume();
  		
      }
}
