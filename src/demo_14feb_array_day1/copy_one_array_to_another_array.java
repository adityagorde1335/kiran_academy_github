package demo_14feb_array_day1;

public class copy_one_array_to_another_array 
{
     public static void main(String args[])
     {
    	 int a[] = {10,20,30,40,50,60,70,80,90,100};
    	 
    	 System.out.println("Original Array");
    	 for(int i=0; i<a.length; i++)
    	 {
    		 System.out.print(a[i] + " ");
    	 }
    	 
    	 
    	 int b[] = new int[a.length];
    	 
    	 for(int i=0; i<a.length; i++)
    	 {
    		 b[i]=a[i];
    	 }
    	 
    	 
    	 System.out.println("\n\nCoppied Array");
    	 for(int i=0; i<b.length; i++)
    	 {
    		 System.out.print(b[i] + " ");
    	 }
    	 
     }
}
