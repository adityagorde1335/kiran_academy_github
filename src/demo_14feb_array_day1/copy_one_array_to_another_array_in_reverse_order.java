package demo_14feb_array_day1;

public class copy_one_array_to_another_array_in_reverse_order 
{
     public static void main(String args[])
     {
    	 int a[] = {11,22,33,44,55,66,77,88,99};
    	 
    	 int b[] = new int[a.length];
    	 
    
    	 
    	 for(int k=0, i=a.length-1; i>=0; i--,k++)
    	 {
    		 b[k] = a[i];
    	 }
    	 
    	 System.out.println("Copied Array");
    	 for(int i=0; i<b.length; i++)
    	 {
    		 System.out.print(b[i] + " ");
    	 }
     }
}
