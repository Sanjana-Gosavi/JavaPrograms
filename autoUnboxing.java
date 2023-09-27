class autoUnboxing
{
	public static void main(String args[])
	{
		Integer i = new Integer(400);
		System.out.println("Before unboxing value="+i);
		int i2=i;
		System.out.println("After unboxing value="+i2);
	}
}