package demo_10_feb_abstraction;

public class Swap_Two_Numbers_Using_Third_Variable 
{
      public static void main(String args[])
      {
    	  int a = 10;
          int b = 20;
          int temp;
          
          System.out.println("After Swapping");
          System.out.println("a="+a);
          System.out.println("b="+b);
          
          temp = a;
          a = b;
          b= temp;
          
          System.out.println();
          System.out.println("Before Swapping");
          System.out.println("a="+a);
          System.out.println("b="+b);
          
          
          
      }
}
