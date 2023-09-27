class IfElseLadder2
{
	public static void main(String args[])
	{
		int n = 1;
		
		if(n % 2 == 0)
		{
			System.out.println(+n +" number is devided by 2");
		}
		else if(n % 3 == 0)
		{
			System.out.println(+n +" number is devided by 3");
		}
		else if(n % 4 ==0)
		{
			System.out.println(+n +" number is devided by 4");
		}
		else 
		{
			System.out.println(+n +" can not be devided by 2,3,4");
		}
	}
}