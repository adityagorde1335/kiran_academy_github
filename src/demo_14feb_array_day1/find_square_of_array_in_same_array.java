  package demo_14feb_array_day1;

public class find_square_of_array_in_same_array 
{

	public static void main(String[] args)
	{
	
         int a[] = {2,3,4,5,9,9,4};
         
         
         //step 1 = take first array ---> first element
         //step 2 = square of each element of first array
         //step 3 = in second array ---> entire  array elements  match
         
         
         for(int i=0; i<a.length; i++)
         {
        	// int sq = a[i]*a[i];
        	 
        	 for(int j=0; j<a.length; j++)
        	 {
        		 if(a[i]*a[i] == a[j])
        		 {
        			 System.out.println("Square of these number are present:" + a[i]); 
        			 break;
        		 }
        		 
        	 }
         }
	}

}
