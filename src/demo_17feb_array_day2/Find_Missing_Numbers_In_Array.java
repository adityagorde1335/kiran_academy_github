package demo_17feb_array_day2;

public class Find_Missing_Numbers_In_Array 
{

	public static void main(String[] args) 
	{
		
          int a[] = {19,15,1,11,6,4,9};
          
          for(int i=0; i<a.length; i++)
          {
        	  for(int j=i+1; j<a.length; j++)
        	  {
        		  if(a[i] > a[j])
        		  {
        			  int temp = a[i];
        			  a[i] = a[j];
        			  a[j] = temp;
        		  }
        	  }
          }
          
          for(int i=0; i<a.length; i++)
          {
        	  System.out.print(a[i] + " ");
          }
           
          System.out.println();
          
          // for finding missing numbers from array...then array must be sorted
          
          // logic for finding missing numbers
          
          for(int i=0; i<a.length-1; i++)
          {
        	  int expected = a[i] + 1;
        	  int actual = a[i+1];
        	  
        	  while(expected != actual)
        	  {
        		  System.out.println(expected + "> missing");
        		  expected ++;
        	  }
          }
          
	}

}
