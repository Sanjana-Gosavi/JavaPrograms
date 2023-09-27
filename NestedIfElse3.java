class NestedIfElse3
{
	public static void main(String args[])
	{
		int n = 24;
		
		if(n % 2 == 0)
		{
			System.out.println("Even Number!!");
			
			if(n % 6 == 0)
			{
				System.out.println("Number is divisible by 6!!");
			}
			else 
			{
				System.out.println("Number is not divisible by 6!!");
			}
		}
		else
		{
			System.out.println("Odd Number!!");
			
			if(n % 3 == 0)
			{
				System.out.println("Number is divisible by 3");
			}
			else
			{
				System.out.println("Number is not divisible by 3");
			}
		}
	}
}