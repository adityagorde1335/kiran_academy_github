package demo_27_jan;

public class TestMobile 
{
    public static void main(String[] args)
    {
    	Mobile m1 = new Mobile(101,"iphone",115000);
    	m1.display();
    	
    	System.out.println("*******************************************");
    	
    	Mobile m2 = new Mobile();
    	m2.mobile_id = 1113;
    	m2.brand_name= "Realme";
    	m2.price = 5000;
    	m2.display();
    }
}
