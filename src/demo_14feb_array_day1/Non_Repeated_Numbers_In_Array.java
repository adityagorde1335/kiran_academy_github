package demo_14feb_array_day1;

public class Non_Repeated_Numbers_In_Array 
{
	public static void main(String args[])
    {
  	  int a[] = {1,2,3,4,5,6,7,8,9,4,5,6};
  	  
  	  for(int i=0; i<a.length; i++)
  	  {
  		  int count = 1;
  		  
  		  for(int j=i+1; j<a.length; j++)
  		  {
  			  if(a[i]==a[j] && a[i] != 0)
  			  {
  				  count++;
  				  a[j]=0;
  			  }
  		  }
  		  
  		  if(a[i] != 0 && count == 1)
  		  {
  			  System.out.println(a[i]);
  		  }
  	  }
    }
}
