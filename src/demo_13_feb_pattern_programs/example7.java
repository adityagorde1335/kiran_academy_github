package demo_13_feb_pattern_programs;

public class example7 
{
     public static void main(String args[])
     {
//    	 for(int i=5; i>=1; i--) 
//    	 {
//    		 for(int j=1; j<=i; j++)  // i= 5,4,3,2,1
//    		 {
//    			 System.out.print("*");
//    		 }
//    		 System.out.println();
//    	 }
    	 
    	 for(int i=1; i<=5; i++) 
    	 {
    		 for(int j=1; j<=6-i; j++)  
    		 {
    			 System.out.print("*");
    		 }
    		 System.out.println();
    	 }
     }
}
