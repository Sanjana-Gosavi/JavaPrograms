class returnTypeEx
{
	public int addition(int a,int b)
	{
		int sum = a + b;
		return sum;
	}
	public int square(int a)
	{
		int sum = a * a;
		return sum;
	}
	public static void main(String args[])
	{
		returnTypeEx r= new returnTypeEx();
		int additionResult=r.addition(10,20);
		System.out.println("Addition of two numbers is:"+additionResult);
		
		int squareResult=r.square(4);
		System.out.println("Square root of number is:"+squareResult);
	}
}
	
