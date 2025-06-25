package demo_14feb_array_day1;

public class Find_Duplicates_In_Array
{
    public static void main(String args[])
    {
    	int a[] = {2,3,4,3,4,9,11,4};
    	
    	for(int i=0; i<a.length; i++)
    	{
    		for(int j=i+1; j<a.length; j++)
    		{
    			if(a[i] == a[j] && a[i] != 0)
    			{
    				System.out.println(a[i] +" ");
    				a[j] = 0;
    				break;
    			}
    		}
    	}
    }
}
