class blockEx2
{
	public blockEx2()
	{
		System.out.println("Inside No-args Constructor!!");
	}
	
	{
		System.out.println("Inside instance block!!");
	}

	static
	{
		System.out.println("Inside static block!!");
	}
	public static void main(String args[])
	{
		blockEx2 b= new blockEx2();
		
	}
}