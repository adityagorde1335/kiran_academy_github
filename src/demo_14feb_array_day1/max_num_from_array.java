package demo_14feb_array_day1;

public class max_num_from_array 
{
      public static void main(String args[])
      {
    	  int a[] = {11,43,85,89,10,20};
    	  
    	  int largest = a[0];
    	  
    	  for(int i=0; i<a.length; i++)
    	  {
    		  if(a[i] > largest)
    		  {
    			  largest = a[i];
    		  }
    	  }
    	  
    	  System.out.println("Largest = "+ largest);
      }
}
