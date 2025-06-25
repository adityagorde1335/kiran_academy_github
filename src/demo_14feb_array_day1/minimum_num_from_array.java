package demo_14feb_array_day1;

public class minimum_num_from_array {

	public static void main(String[] args) 
	{
		int a[] = {89,65,23,18,56,92};
		
		int smallest = a[0];
		
		for(int i=0; i<a.length; i++)
		{
			if(a[i] < smallest)
			{
				smallest = a[i];
			}
		}
		
		System.out.println("Smallest = "+smallest);

	}

}
