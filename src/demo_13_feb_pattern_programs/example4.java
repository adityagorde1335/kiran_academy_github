package demo_13_feb_pattern_programs;

public class example4 
{
	public static void main(String args[]) 
    {
   	 for(int i=1; i<=5; i++)
   	 {
   		 for(int j=1; j<=5; j++)
   		 {
   			 if(i==3 && j==3)
   			 {
   				System.out.print("@ "); 
   			 }
   			 else if(i==5 || j==5 || i==1 || j==1)
   			 {
   				 System.out.print("$ "); 
   			 }
   			 else {
   				 System.out.print("* ");
   			 }
   			
   		 }
   		 System.out.println();
   	 }
    }
}
