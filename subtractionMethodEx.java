class subtraction
{
	public int subtraction(int a, int b)
	{
		int sub=a-b;
		return sub;
		
	}
}
class subtractionMethodEx
{
	public static void main(String args[])
	{
		subtraction sub=new subtraction();
		int s=sub.subtraction(54,21);	
		System.out.println("Subtraction of two numbers is:"+s);
	}
}
	