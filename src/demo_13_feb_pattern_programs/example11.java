package demo_13_feb_pattern_programs;

public class example11 
{
	public static void main(String args[])
	   {
		   for(char i='A'; i<='E'; i++)
		   {
			   for(char j='A'; j<=i; j++)
			   {
				   System.out.print(j + " ");
			   }
			   System.out.println();
		   }
	   }
}
