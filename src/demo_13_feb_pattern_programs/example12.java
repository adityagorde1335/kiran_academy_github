package demo_13_feb_pattern_programs;

public class example12 
{
	public static void main(String args[])
	   {
		   for(int i=1; i<=3; i++)
		   {
			   for(int j=1; j<=9; j++)
			   {
				  if(j<=3)
				  {
					  System.out.print(j);
				  }
				  else if(j>=7 && j<=9)
				  {
					  System.out.print(j);
				  }
				  else 
				  {
					  System.out.print("*");
				  }
			   }
			   System.out.println();
		   }
	   }
}
