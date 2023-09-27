class square
{
	public int square(int a)
	{
		int square=a*a;
		return square;
	}
}
class squareNumber
{
	public static void main(String args[])
	{
		square s=new square();	
		int s1=s.square(6);
		System.out.println("Square of number is:"+s1);
	}
}
		
		