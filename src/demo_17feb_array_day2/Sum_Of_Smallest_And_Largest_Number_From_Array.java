package demo_17feb_array_day2;

public class Sum_Of_Smallest_And_Largest_Number_From_Array
{
    public static void main(String args[])
    {
    	int a[] = {12,45,98,23,10,33,22,7};
    	
    	int largest = a[0];
    	int smallest = a[0];
    	
    	for(int i=1; i<a.length; i++)
    	{
    		
    			if(a[i] > largest)
    			{
    				largest = a[i];
    			}
    			
    			if(a[i] < smallest)
    			{
    				smallest = a[i];
    			}
    		
    	}
    	
    	int sum = largest + smallest;
    	
    	System.out.println("Largest element: "+largest);
    	System.out.println("Smallest element: "+smallest);
    	System.out.println("Sum of smallest and largest element: "+sum);
    }
}
