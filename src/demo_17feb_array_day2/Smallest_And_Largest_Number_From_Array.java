package demo_17feb_array_day2;

public class Smallest_And_Largest_Number_From_Array 
{
     public static void main(String args[])
     {
    	 int a[] = {9,54,27,1,67,-5};
    	 
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
    		 System.out.print(a[i] +" ");
    	 }
    	 
    	 System.out.println("\n\n1st largest number :"+  a[a.length-1]);
    	 System.out.println("2nd largest number :"+  a[a.length-2]);
    	 System.out.println("1st Smallest number :"+ a[0]);
    	 System.out.println("2nd Smallest number :"+ a[1]);
    	 
    	 
     }
}
