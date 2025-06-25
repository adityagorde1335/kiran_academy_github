package demo_17feb_array_day2;

public class Prime_Numbers_From_Array 
{
     public static void main(String args[])
     {
    	 int a[] = {1,2,3,4,5,6,7,8,9,11,13,17};
    	 
    	 System.out.println("Prime numbers from an Array");
    	 
    	 for(int i=0; i<a.length; i++)
    	 {
    		 if(isPrime(a[i]))
    		 {
    			 System.out.println(a[i]);
    		 }
    	 }
     }
     
     public static boolean isPrime(int num)
     {
    	 if(num <= 1) return false;
    	 
    	 for(int i=2; i*i<=num; i++ )
    	 {
    		 if(num%i == 0)
    		 {
    			 return false;
    		 }
    	 }
    	 return true;
     }
}
