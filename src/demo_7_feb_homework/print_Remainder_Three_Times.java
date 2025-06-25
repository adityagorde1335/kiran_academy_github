package demo_7_feb_homework;

public class print_Remainder_Three_Times
{
	
	public static void main(String args[]) 
	{
		int num = 2315;

		int rem = 0;

		int rev = 0;

		while (num > 0)    // line no.12 to 19 print the reverse number that is
		{                  // 5132 and this no. can be stored in next numb variable
			rem = num % 10;

			num = num / 10;

			rev = (rev * 10) + rem;
		}

		num = rev;

		while (num > 0) 
		{                        // line no.21 to line no.30 print the remainder of
			rem = num % 10;     // given number i.e. 5132 convert into 2315

			num = num / 10;
			
			
			for(int i=1; i<=3;i++)
			{
				System.out.print(rem + " ");   // This loop print the remainder three times
			}
			
			System.out.println();

		}
		
	}
}
