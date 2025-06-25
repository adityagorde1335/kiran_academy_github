package demo_17feb_array_day2;

public class Mearge_Two_Array 
{
     public static void main(String args[])
     {
    	 int a[] = {10,20,30,100};
    	 int b[] = {200,40,50,60,70,80,90,100};
    	 
    	 int a_length = a.length;
    	 int b_length = b.length;
    	 int c_length = a_length + b_length;
    	 
    	 int c[] = new int[c_length];
  
    	 for(int i=0; i<a.length; i++)
    	 {
    		 c[i] = a[i];
    	 }
    	 
    	 for(int i=0; i<b.length; i++)
    	 {
    		 c[a_length + i] = b[i];
    	 }
    	 
    	 for(int i=0; i<c.length; i++)
    	 {
    		 System.out.print(c[i] +" ");
    	 }
     }
}
