class staticInstance
{
	public void method1()
	{
		System.out.println("Method 1 started!!!");
		
		method2();
		
		System.out.println("Method 1 Ended!!!");
	}
	public void method2()
	{
		System.out.println("Method 2 started!!!");
		
		method3();	
		
		System.out.println("Method 2 Ended!!!");
	}
	public static void method3()
	{
		System.out.println("Method 3 started!!!");
		
		//method1();	
	
		System.out.println("Method 3 Ended!!!");
	}
	public static void main(String args[])
	{
		System.out.println("Main method started!!!");
		staticInstance s=new staticInstance();
		s.method1();
		s.method2();
		System.out.println("Main method Ended!!!");
	}
}