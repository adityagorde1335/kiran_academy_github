package demo_7_feb_homework;

public class print_Remainder 
{
       public static void main(String args[])
       {
    	   int num = 2315;
    	   
    	   int rem = 0;
    	   
    	   while(num>0)
    	   {                     // line no.11 to 18 print the given number's remainder
    		   rem = num % 10;   // i.e output is 5132
    		   
    		   num = num / 10;
    		   
    		   System.out.println(rem);
    	   }
       }
}
