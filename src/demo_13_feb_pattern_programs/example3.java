package demo_13_feb_pattern_programs;

public class example3 {
	public static void main(String args[])
	{

//		for (int i=1; i<=3; i++) 
//		{
//			for (int j=1; j<=9; j++) 
//			{
//				if (j <= 3)
//				{
//					System.out.print(j); 
//				} 
//				else if(j>=4 && j<=6)
//				{
//					System.out.print("*");
//				}
//				else
//				{
//					System.out.print("$");
//				}
//
//			}
//			System.out.println();
//		}
		
		for (int i=1; i<=3; i++) 
		{
			for (int j=1; j<=9; j++) 
			{
				
				if(i== 2 && j==5)
				{
					System.out.print("$");
				}
				else if (j <= 3)
				{
					System.out.print(j); 
				} 
				else if(j>=4 && j<=6)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print("$");
				}

			}
			System.out.println();
		}
	}
}
