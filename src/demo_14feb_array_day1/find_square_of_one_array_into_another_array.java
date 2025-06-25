package demo_14feb_array_day1;

public class find_square_of_one_array_into_another_array 
{
       public static void main(String args[])
       {
    	   int a[] = {2,3,4,5};
           
           int b[] = {12,56,9,24,4,9,25};
           
           //step 1 = take first array ---> first element
           //step 2 = square of each element of first array
           //step 3 = in second array ---> entire  array elements  match
           
           for(int i=0; i<a.length; i++)
           {
        	   //int sq = a[i] * a[i];
        	   
        	   for(int j=0; j<b.length; j++)
        	   {
        		   if(a[i]*a[i]== b[j])
        		   {
        			   System.out.println("Square of these number is present: "+a[i]+" ");
        			   break;
        		   }
        	   }
           }
       }
}
