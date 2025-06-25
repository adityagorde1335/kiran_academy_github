package demo_10_feb_abstraction;

public class Swap_Two_Numbers_Without_Third_Variable 
{
	public static void main(String[] args) {
        int a = 45, b = 90;

        System.out.println("Before swapping: a = " + a + ", b = " + b);

        a = a + b; 
        b = a - b; 
        a = a - b; 

        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}
