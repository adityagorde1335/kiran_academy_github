package demo_13_feb_pattern_programs;

public class example8 
{
   public static void main(String args[])
   {
	   
	   for(int i=1; i<=5; i++) 
	   {
		   for(int j=1; j<=5; j++)
		   {
			   if(j>=6-i)
			   {
				   System.out.print("*");
			   }
			   else 
			   {
				   System.out.print(" ");
			   }
		   }
		   System.out.println();
	   }
   }
}
