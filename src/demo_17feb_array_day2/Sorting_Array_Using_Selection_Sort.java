package demo_17feb_array_day2;

public class Sorting_Array_Using_Selection_Sort
{
     public static void main(String args[])
     {
    	 int a[] = {7,22,4,9,12,1,-2};
    	 
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
    	 
    	 for(int i=0; i< a.length; i++)
    	 {
    		 System.out.print(a[i] + " ");
    	 }
     }
}
