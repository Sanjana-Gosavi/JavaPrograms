class blockEx1
{
	public static void addition(int a, int b)	
	{
		int res= a+b;
		System.out.println("Addition of two numbers is:" +res);
	}
	static
	{
		System.out.println("Inside static block!!");
	}

	/*{
		System.out.println("Inside instance block!!");
	}*/
	public static void main(String args[])
	{
		
		addition(3,10);
	}
}