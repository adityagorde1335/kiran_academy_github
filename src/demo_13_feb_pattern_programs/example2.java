package demo_13_feb_pattern_programs;

public class example2 
{
     public static void main(String args[]) 
     {
    	 for(int i=1; i<=3; i++)
    	 {
    		 for(int j=1; j<=6; j++)
    		 {
    			 if(j<=3)
    			 {
    				 System.out.print("*"); //first three columns are * and remaining are $
    			 }
    			 else {
    				 System.out.print("$");
    			 }
    			
    		 }
    		 System.out.println();
    	 }
     }
}
