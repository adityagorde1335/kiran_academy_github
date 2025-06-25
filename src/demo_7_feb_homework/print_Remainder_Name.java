package demo_7_feb_homework;

public class print_Remainder_Name 
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

			rev = (rev*10)  + rem;
			
		}

		num = rev;

		while (num > 0) 
		{                        // line no.21 to line no.30 print the remainder of
			rem = num % 10;     // given number i.e. 5132 convert into 2315

			num = num / 10;
			
			
			//for(int i=1; i<=rem;i++)
			//{
				System.out.println(rem + " " + getNum(rem) );   // This line print the remainder 
			//}                                                 // with their name by using the 
			                                                    // getNum() method and switch case
			//System.out.println();

		}
		
	}

	 static String getNum(int rem) 
	 {
		
		
		switch(rem)
		{
		    case 1: return "ONE";
		    case 2: return "TWO";
		    case 3: return "THREE";
		    case 4: return "FOUR";
		    case 5: return "FIVE";
		}
		return null;
	 }
}
