package demo_13_feb_pattern_programs;

public class example13 
{
    public static void main(String args[])
    {
    	for(int i=1; i<=5; i++)
    	{
    		for(int j=1; j<=5; j++)
    		{
    			if(i==1 || j==1 || i==5 || j==5)
    			{
    				System.out.print("* ");
    			}
    			else 
    			{
    				System.out.print("  ");
    			}
    		}
    		System.out.println();
    	}
    	
    	for(int i=1; i<=4; i++)
    	{
    		System.out.println("*");
    	}
    }
}
