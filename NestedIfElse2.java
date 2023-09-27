class NestedIfElse2
{
	public static void main(String args[])
	{
		int a = 2;
		int b = 2;
		int c = 9;
		
		if (a == b)
		{
			if (a == c)
			{
				System.out.println("Equal numbers!!");
			}
			else
			{
				System.out.println("Not Equal numbers!!");
			}
		}
		else 
		{
			System.out.println("Not Equal Numbers!!");
		}
	}
}