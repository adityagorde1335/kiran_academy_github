package demo_27_jan;

public class Mobile 
{
     int mobile_id;
     String brand_name;
     int price;
     
     
     Mobile()
     {
    	 
     }
     
     
     Mobile(int mobile_id, String brand_name,int price )
     {
    	 this.mobile_id = mobile_id;
    	 this.brand_name = brand_name;
    	 this.price = price;
     }
     
     void display()
     {
    	 System.out.println("mobile_id:"+mobile_id+" brand_name:"+brand_name+" price:"+price);
     }
}
