package demo_13_feb_pattern_programs;

public class example6 
{
     public static void main(String args[])
     {
    	 for(int i=1; i<=5; i++) 
    	 {
    		 for(int j=1; j<=i; j++) // i= 1,2,3,4,5 first line 1 star,2nd line two star similarly
    		 {
    				 System.out.print("* ");
    		 }
    		 System.out.println();
    	 }
     }
}
