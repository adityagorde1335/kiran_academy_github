package demo_17feb_array_day2;

public class Check_Prime_Number 
{
    public static void main(String args[])
    {
    	//int temp = 0;
    	for(int i=2; i<=100; i++)
    	{
    		int temp = 0;
        	
        	for(int j=2; j<=i-1; j++)
        	{
        		if(i%j == 0)
        		{
        			temp = temp+1;
        		}
           	}
        	
        	if(temp == 0)
        	{
        		System.out.print(i+" ");
        	}
//        	else
//        	{
//        		temp = 0;
//        	}
        }
    }
    	
}
