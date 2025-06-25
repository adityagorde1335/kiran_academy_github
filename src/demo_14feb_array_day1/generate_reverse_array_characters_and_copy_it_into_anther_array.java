package demo_14feb_array_day1;

public class generate_reverse_array_characters_and_copy_it_into_anther_array 
{
     public static void main(String args[])
     {
    	 char a[] = {'M','A','D','A','M'};
    	 
    	 char b[] = new char[a.length];
    	 
    	 for(int k=0, i=a.length-1; i>=0; i--,k++)
    	 {
    		 b[k] = a[i];
    	 }
    	 
    	 System.out.println("Original Array");
    	 for(int i=0; i<a.length; i++)
    	 {
    		 System.out.print(a[i] + " ");
    	 }
    	 
         System.out.println("\n\nCopied Array");
    	 for(int i=0; i<b.length; i++)
    	 {
    		 System.out.print(b[i] + " ");
    	 }
     }
}
