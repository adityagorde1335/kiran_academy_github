package demo_13_feb_pattern_programs;

public class example10 
{
   public static void main(String args[])
   {
	   for(int i=1; i<=5; i++)
	   {
		   for(int j=1; j<=i; j++)
		   {
			   System.out.print((j+64) + " ");
		   }
		   System.out.println();
	   }
   }
}
