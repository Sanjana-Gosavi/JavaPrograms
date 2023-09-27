class instanceOfOperator
{
	public static void main(String args[])
	{
		String s = new String ("Hello!!!");
		StringBuffer s1 = new StringBuffer("Hiiii!!!!");
		StringBuilder s2 = new StringBuilder("Welcome to java programming");
		
		
		example(s1);
	}
	
	public static void example(Object o)
	{
		if(o instanceof StringBuffer)
		{
			System.out.println("example of instance of operator");
		}
		else
		{
			System.out.println("its is not a string");
		}
	}
}
		
		