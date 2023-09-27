class IfElseLoopExample3
{
	public static void main(String args[])
	{
		char ch = 'a';
		
		if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
		{
			System.out.println(+ch +" is alphabet");
		}
		else
		{
			System.out.println(+ch +" is not a alpahbet");
		}
	}
}