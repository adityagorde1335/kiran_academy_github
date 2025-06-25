package demo_17feb_array_day2;

public class Check_Number_Is_Prime_Or_Not 
{
     public static void main(String args[])
     {
    	 int number = 17;
    	 
    	 
    	 
    	 
    	 if(isPrime(number))
    	 {
    		 System.out.println(number+" Number is Prime");
    	 }
    	 else
    	 {
    		 System.out.println(number+" Number is not Prime");
    	 }
     }

//	public static boolean isPrime(int number) {
//		// TODO Auto-generated method stub
//		return false;
//	}
     
     public static boolean isPrime(int num) 
     {
    	if(num <= 1)  return false;
    	
    		for(int i=2; i*i<=num; i++)
        	{
        		if(num % i == 0)
        		{
        			return false;
        		}
        	}
    		
        return true;
     }
}
