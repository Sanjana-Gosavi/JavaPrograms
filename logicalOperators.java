class logicalOperators
{
	public static void main(String args[])
	{
		int a = 6;
		int b = 4;
		
		System.out.println("a = "+a + " b = "+b);

		System.out.println("a == b && a < b");
		System.out.println(a == b && a < b);

		System.out.println("a >= b && b < a");
		System.out.println(a >= b && b < a);
		
		System.out.println("a < b || b > a");
		System.out.println(a < b || b > a);
	
		System.out.println("! a == b");
		System.out.println(! (a == b));

		System.out.println("a > b || a == b");
		System.out.println(a > b || a == b);
	}
}