package demo_17feb_array_day2;

public class Number_Divisible_By_3_And_5 
{
    public static void main(String args[])
    {
    	int a[]= {3,5,9,10,15,20,30,27};
    	
    	System.out.println("Numbers divisible by 3 and 5");
    	
    	for(int i=0; i<a.length; i++)
    	{
    		if(a[i]%3 == 0 && a[i]%5 == 0)
    		{
    			System.out.print(a[i]+" ");
    		}
    	}
    }
}
