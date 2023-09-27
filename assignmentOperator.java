class assignmentOperators
{
	public static void main(String args[])
	{
		int a = 10;
		int b = 6;
		
		a = a += b;
		System.out.println("a += b:" +a);
		
		a = a -= b;
		System.out.println("a -= b:" +a);

		a = a *= b;
		System.out.println("a *= b:" +a);

		a = a /= b;
		System.out.println("a /= b:" +a);

		a = a %= b;
		System.out.println("a %= b:" +a);
	}
}