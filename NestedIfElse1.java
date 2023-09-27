class NestedIfElse1
{
	public static void main(String args[])
	{
		int n1 = 98;
		int n2 = 65;
		int n3 = 7;
		int large;
	
		if (n1 >= n2)
		{
			if (n1 >= n3)
			{
				large = n1;
			}
			else 
			{
				large = n3;
			}
		}
		else
		{
			if (n2 >= n3)
			{
				large = n2;
			}
			else 
			{
				large = n3;
			}
		}
		System.out.println("largest number is:" +large);
	}
}
		